package com.viaplay.assignment.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Image {

	@SerializedName("types")
	@Expose
	private List<String> types = new ArrayList<String>();
	@SerializedName("front")
	@Expose
	private Boolean front;
	@SerializedName("back")
	@Expose
	private Boolean back;
	@SerializedName("edit")
	@Expose
	private Integer edit;
	@SerializedName("image")
	@Expose
	private String image;
	@SerializedName("comment")
	@Expose
	private String comment;
	@SerializedName("approved")
	@Expose
	private Boolean approved;
	@SerializedName("thumbnails")
	@Expose
	private Thumbnails thumbnails;
	@SerializedName("id")
	@Expose
	private String id;

	/**
	 * 
	 * @return The types
	 */
	public List<String> getTypes() {
		return types;
	}

	/**
	 * 
	 * @param types
	 *            The types
	 */
	public void setTypes(List<String> types) {
		this.types = types;
	}

	/**
	 * 
	 * @return The front
	 */
	public Boolean getFront() {
		return front;
	}

	/**
	 * 
	 * @param front
	 *            The front
	 */
	public void setFront(Boolean front) {
		this.front = front;
	}

	/**
	 * 
	 * @return The back
	 */
	public Boolean getBack() {
		return back;
	}

	/**
	 * 
	 * @param back
	 *            The back
	 */
	public void setBack(Boolean back) {
		this.back = back;
	}

	/**
	 * 
	 * @return The edit
	 */
	public Integer getEdit() {
		return edit;
	}

	/**
	 * 
	 * @param edit
	 *            The edit
	 */
	public void setEdit(Integer edit) {
		this.edit = edit;
	}

	/**
	 * 
	 * @return The image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * 
	 * @param image
	 *            The image
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * 
	 * @return The comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * 
	 * @param comment
	 *            The comment
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * 
	 * @return The approved
	 */
	public Boolean getApproved() {
		return approved;
	}

	/**
	 * 
	 * @param approved
	 *            The approved
	 */
	public void setApproved(Boolean approved) {
		this.approved = approved;
	}

	/**
	 * 
	 * @return The thumbnails
	 */
	public Thumbnails getThumbnails() {
		return thumbnails;
	}

	/**
	 * 
	 * @param thumbnails
	 *            The thumbnails
	 */
	public void setThumbnails(Thumbnails thumbnails) {
		this.thumbnails = thumbnails;
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

}