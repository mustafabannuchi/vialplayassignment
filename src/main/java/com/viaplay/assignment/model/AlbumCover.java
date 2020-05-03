package com.viaplay.assignment.model;

public class AlbumCover{
	
	private String id;
	private String title;
	private String backCoverImageUrl;
	private String frontCoverImageUrl;
    
	public AlbumCover(){
		id = "";
		title = "";
		backCoverImageUrl = "";
		frontCoverImageUrl = "";
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBackCoverImageUrl() {
		return backCoverImageUrl;
	}

	public void setBackCoverImageUrl(String backCoverImageUrl) {
		this.backCoverImageUrl = backCoverImageUrl;
	}

	public String getFrontCoverImageUrl() {
		return frontCoverImageUrl;
	}

	public void setFrontCoverImageUrl(String frontCoverImageUrl) {
		this.frontCoverImageUrl = frontCoverImageUrl;
	}
}

