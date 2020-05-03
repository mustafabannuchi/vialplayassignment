package com.viaplay.assignment.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Thumbnails {

	@SerializedName("large")
	@Expose
	private String large;
	@SerializedName("small")
	@Expose
	private String small;

	/**
	 * 
	 * @return The large
	 */
	public String getLarge() {
		return large;
	}

	/**
	 * 
	 * @param large
	 *            The large
	 */
	public void setLarge(String large) {
		this.large = large;
	}

	/**
	 * 
	 * @return The small
	 */
	public String getSmall() {
		return small;
	}

	/**
	 * 
	 * @param small
	 *            The small
	 */
	public void setSmall(String small) {
		this.small = small;
	}

}