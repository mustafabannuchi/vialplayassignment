package com.viaplay.assignment.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.viaplay.assignment.model.AlbumCover;
import com.viaplay.assignment.model.MusicbranzPojo;
import com.viaplay.assignment.model.ReleaseGroup;


public interface ArtistService {
	
	ResponseEntity<?> getArtist(String mbId);
	
	String getArtistProfile(RestTemplate restTemplate, MusicbranzPojo mbPojo);
	
	List<AlbumCover> getAlbumCover(RestTemplate restTemplate, Gson gson,
			List<ReleaseGroup> releaseGroups);

}
