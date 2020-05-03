package com.viaplay.assignment.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.viaplay.assignment.model.AlbumCover;
import com.viaplay.assignment.model.Artist;
import com.viaplay.assignment.model.CoverArt;
import com.viaplay.assignment.model.Image;
import com.viaplay.assignment.model.MusicbranzPojo;
import com.viaplay.assignment.model.Profile;
import com.viaplay.assignment.model.ReleaseGroup;
import com.viaplay.assignment.model.Url;

@Service
public class ArtistserviceImpl implements ArtistService{
	
	@Autowired
	CachingService cachingService ;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ArtistserviceImpl.class);

	public ResponseEntity<?> getArtist(String mbId) {
		RestTemplate restTemplate = new RestTemplate();
		Gson gson = new Gson();
		String musicBranzUrl = "http://musicbrainz.org/ws/2/artist/{mbId}?&fmt=json&inc=url-rels+release-groups";
		Artist artist = new Artist();
		try {
			// if reponse is already cached then return it from cache
			Object object = cachingService.getObjectFromCache("musicbrainzCache", mbId);
			if(object != null) {
				return ResponseEntity.ok(object);
			}else {
				ResponseEntity<String> musicBranzResponse = restTemplate.exchange(musicBranzUrl, HttpMethod.GET,
						new HttpEntity<>(new HttpHeaders()), String.class, mbId);
				MusicbranzPojo musicbranzPojo = gson.fromJson(musicBranzResponse.getBody(), MusicbranzPojo.class);
				// Get Profile of Artist 
				String artistProfile = getArtistProfile(restTemplate,musicbranzPojo);
				artist.setProfile(artistProfile);
				// Get List of Album Covers 
	            List<ReleaseGroup> releaseGroups = musicbranzPojo.getReleaseGroups();
				List<AlbumCover> coverArtList = getAlbumCover(restTemplate, gson, releaseGroups);
				artist.setMbid(mbId);
				artist.setAlbumCoverArtList(coverArtList);
				cachingService.putInCache("musicbrainzCache", mbId, artist);
			}
		} catch (RestClientException restExecption) {
			LOGGER.error(restExecption.getMessage());
			return ResponseEntity
					.status(((RestClientResponseException) restExecption).getRawStatusCode())
					.body(((RestClientResponseException) restExecption).getResponseBodyAsString());			
		} catch (JsonSyntaxException jsonException) {
			LOGGER.error(jsonException.getMessage());
		}
		return ResponseEntity.ok(artist) ;

	}
	
	/**
	 * This method calls discogs Api for the profile of Artist
	 * Group and ID.
	 * 
	 * @param restTemplate
	 * @param gson
	 * @param MusicbranzPojo
	 * @return profile - profile of the artist
	 */
    public String getArtistProfile(RestTemplate restTemplate, MusicbranzPojo musicbranzPojo) {
		
		String discogsApiUrl = "https://api.discogs.com/artists/";
		String profileInfo = "";
		Gson gson = new Gson();
		Optional<Url> discogsURL = musicbranzPojo
				.getRelations()
				.stream()
				.filter(type -> type.getType().equals("discogs"))
				.map(type->type.getUrl())
				.findFirst();
		if(discogsURL.isPresent()) {
			try {
				String[] resources = discogsURL.get().getResource().split("/");
				String discogsId = resources[resources.length - 1];
				ResponseEntity<String> artistProfile = restTemplate.exchange(discogsApiUrl+discogsId, HttpMethod.GET,
						new HttpEntity<>(new HttpHeaders()), String.class, discogsId);
				Profile profile = gson.fromJson(artistProfile.getBody(), Profile.class);
				profileInfo =  profile.getProfile();
			}catch (RestClientException rce) {
				LOGGER.error(rce.getMessage());
			}catch (JsonSyntaxException jse) {
				LOGGER.error(jse.getMessage());
			}
			}	
		return profileInfo;
	}
	
    /**
	 * This method used to get the Album with Cover Art details based on Release
	 * Group and ID.
	 * 
	 * @param restTemplate
	 * @param gson
	 * @param releaseGroups
	 * @return List<AlbumWithCoverArt> - list of album with cover art details.
	 */
	public List<AlbumCover> getAlbumCover(RestTemplate restTemplate, Gson gson,
			List<ReleaseGroup> releaseGroups) {
		List<AlbumCover> coverArtList = releaseGroups.stream().map(releaseGroup -> {

			String id = releaseGroup.getId();
			String title = releaseGroup.getTitle();
			String coverArtRestUrl = "http://coverartarchive.org/release-group/{id}";
			AlbumCover albumCover = new AlbumCover();
			try {
				ResponseEntity<String> coverArtResponse = restTemplate.exchange(coverArtRestUrl, HttpMethod.GET,
						new HttpEntity<>(new HttpHeaders()), String.class, id);
				CoverArt coverArtPojo = gson.fromJson(coverArtResponse.getBody(), CoverArt.class);
				List<Image> images = coverArtPojo.getImages();
				List<String> backCover = images.stream().filter(image -> image.getBack()).map(image -> image.getImage())
						.collect(Collectors.toList());
				List<String> frontCover = images.stream().filter(image -> image.getFront())
						.map(image -> image.getImage()).collect(Collectors.toList());
				if (!backCover.isEmpty()) {
					albumCover.setBackCoverImageUrl(backCover.get(0));
				}
				if (!frontCover.isEmpty()) {
					albumCover.setFrontCoverImageUrl(frontCover.get(0));
				}
			} catch (HttpStatusCodeException hsce) {
				LOGGER.info(hsce.getMessage());
			} catch (RestClientException rce) {
				LOGGER.info(rce.getMessage());
			}
			albumCover.setId(id);
			albumCover.setTitle(title);
			return albumCover;
		}).collect(Collectors.toList());
		return coverArtList;
	}

}
