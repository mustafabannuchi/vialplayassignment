package com.viaplay.assignment.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class MusicbranzPojo {
	
	@Expose
	private String typeId;
	@SerializedName("relations")
	@Expose
	private List<Relation> relations = new ArrayList<Relation>();
	@SerializedName("release-groups")
	@Expose
	private List<ReleaseGroup> releaseGroups = new ArrayList<ReleaseGroup>();
	@SerializedName("id")
	@Expose
	private String id;
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("type")
	@Expose
	private String type;
	/**
	 * 
	 * @return The typeId
	 */
	public String getTypeId() {
		return typeId;
	}

	/**
	 * 
	 * @param typeId
	 *            The type-id
	 */
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	/**
	 * 
	 * @return The relations
	 */
	public List<Relation> getRelations() {
		return relations;
	}

	/**
	 * 
	 * @param relations
	 *            The relations
	 */
	public void setRelations(List<Relation> relations) {
		this.relations = relations;
	}
	/**
	 * 
	 * @return The releaseGroups
	 */
	public List<ReleaseGroup> getReleaseGroups() {
		return releaseGroups;
	}

	/**
	 * 
	 * @param releaseGroups
	 *            The release-groups
	 */
	public void setReleaseGroups(List<ReleaseGroup> releaseGroups) {
		this.releaseGroups = releaseGroups;
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
	 * @return The name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 *            The name
	 */
	public void setName(String name) {
		this.name = name;
	}
    /**
	 * 
	 * @return The type
	 */
	public String getType() {
		return type;
	}

	/**
	 * 
	 * @param type
	 *            The type
	 */
	public void setType(String type) {
		this.type = type;
	}

}