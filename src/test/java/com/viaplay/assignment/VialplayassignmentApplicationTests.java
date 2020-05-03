package com.viaplay.assignment;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.viaplay.assignment.service.ArtistService;
import com.viaplay.assignment.service.ArtistserviceImpl;


@RunWith(MockitoJUnitRunner.class)
public class VialplayassignmentApplicationTests {
	
	public ArtistService artistService;

	@Before
	public void init() {
		this.artistService = new ArtistserviceImpl();
	}
	
	@Test
	public void shouldGetArtistDetails() {
		ResponseEntity<?> ar = artistService.getArtist("f27ec8db-af05-4f36-916e-3d57f91ecf5e");
		assertEquals(ar.getStatusCode(), HttpStatus.OK);
	}
}
