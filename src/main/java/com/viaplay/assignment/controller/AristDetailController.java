package com.viaplay.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viaplay.assignment.service.ArtistService;

/**
 * Rest Controller which calls to MusizBrainz and covertArt and show details of the Artist.
 *
 */
@RestController
public class AristDetailController {
	
	@Autowired
	ArtistService artistservice;
	
	/**
	 * This method take MBID from URL and call getArtisDetail method.
	 * @param mbid
	 * @return ReponseEntity  Generic value - with artist details contains title, album, cover art details.
	 */
	@RequestMapping("/searchArtist/{mbid}")
	public ResponseEntity<?> getArtistDetails(@PathVariable("mbid") String mbid) {
		
		return artistservice.getArtist(mbid);
		
	}
}
