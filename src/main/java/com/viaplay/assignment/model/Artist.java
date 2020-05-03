package com.viaplay.assignment.model;

import java.util.List;

public class Artist {
	
	private String mbid;
	private String profile;
	private List<AlbumCover> albumCover;

	public String getMbid() {
		return mbid;
	}

	public void setMbid(String mbid) {
		this.mbid = mbid;
	}

	public List<AlbumCover> getAlbumCoverArtList() {
		return albumCover;
	}

	public void setAlbumCoverArtList(List<AlbumCover> albumCover) {
		this.albumCover = albumCover;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

}
