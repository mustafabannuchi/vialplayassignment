package com.viaplay.assignment.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class ReleaseGroup {

	@SerializedName("disambiguation")
	@Expose
	private String disambiguation;
	@SerializedName("title")
	@Expose
	private String title;
	@SerializedName("secondary-type-ids")
	@Expose
	private List<String> secondaryTypeIds = new ArrayList<String>();
	@SerializedName("primary-type-id")
	@Expose
	private String primaryTypeId;
	@SerializedName("primary-type")
	@Expose
	private String primaryType;
	@SerializedName("id")
	@Expose
	private String id;
	@SerializedName("first-release-date")
	@Expose
	private String firstReleaseDate;
	@SerializedName("secondary-types")
	@Expose
	private List<String> secondaryTypes = new ArrayList<String>();

	/**
	 * 
	 * @return The disambiguation
	 */
	public String getDisambiguation() {
		return disambiguation;
	}

	/**
	 * 
	 * @param disambiguation
	 *            The disambiguation
	 */
	public void setDisambiguation(String disambiguation) {
		this.disambiguation = disambiguation;
	}

	/**
	 * 
	 * @return The title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * 
	 * @param title
	 *            The title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 
	 * @return The secondaryTypeIds
	 */
	public List<String> getSecondaryTypeIds() {
		return secondaryTypeIds;
	}

	/**
	 * 
	 * @param secondaryTypeIds
	 *            The secondary-type-ids
	 */
	public void setSecondaryTypeIds(List<String> secondaryTypeIds) {
		this.secondaryTypeIds = secondaryTypeIds;
	}

	/**
	 * 
	 * @return The primaryTypeId
	 */
	public String getPrimaryTypeId() {
		return primaryTypeId;
	}

	/**
	 * 
	 * @param primaryTypeId
	 *            The primary-type-id
	 */
	public void setPrimaryTypeId(String primaryTypeId) {
		this.primaryTypeId = primaryTypeId;
	}

	/**
	 * 
	 * @return The primaryType
	 */
	public String getPrimaryType() {
		return primaryType;
	}

	/**
	 * 
	 * @param primaryType
	 *            The primary-type
	 */
	public void setPrimaryType(String primaryType) {
		this.primaryType = primaryType;
	}

	/**
	 * 
	 * @return The id
	 */
	public String getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 *            The id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 
	 * @return The firstReleaseDate
	 */
	public String getFirstReleaseDate() {
		return firstReleaseDate;
	}

	/**
	 * 
	 * @param firstReleaseDate
	 *            The first-release-date
	 */
	public void setFirstReleaseDate(String firstReleaseDate) {
		this.firstReleaseDate = firstReleaseDate;
	}

	/**
	 * 
	 * @return The secondaryTypes
	 */
	public List<String> getSecondaryTypes() {
		return secondaryTypes;
	}

	/**
	 * 
	 * @param secondaryTypes
	 *            The secondary-types
	 */
	public void setSecondaryTypes(List<String> secondaryTypes) {
		this.secondaryTypes = secondaryTypes;
	}

}