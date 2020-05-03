package com.viaplay.assignment.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class CoverArt {

	@SerializedName("images")
	@Expose
	private List<Image> images = new ArrayList<Image>();
	@SerializedName("release")
	@Expose
	private String release;

	/**
	 * 
	 * @return The images
	 */
	public List<Image> getImages() {
		return images;
	}

	/**
	 * 
	 * @param images
	 *            The images
	 */
	public void setImages(List<Image> images) {
		this.images = images;
	}

	/**
	 * 
	 * @return The release
	 */
	public String getRelease() {
		return release;
	}

	/**
	 * 
	 * @param release
	 *            The release
	 */
	public void setRelease(String release) {
		this.release = release;
	}

}