/*
 * storage_ebs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.storageebs.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.storageebs.model.SnapshotForDescribeSnapshotGroupsOutput;
import com.volcengine.storageebs.model.TagForDescribeSnapshotGroupsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * SnapshotGroupForDescribeSnapshotGroupsOutput
 */


public class SnapshotGroupForDescribeSnapshotGroupsOutput {
  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("ImageId")
  private String imageId = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("SnapshotGroupId")
  private String snapshotGroupId = null;

  @SerializedName("Snapshots")
  private List<SnapshotForDescribeSnapshotGroupsOutput> snapshots = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("Tags")
  private List<TagForDescribeSnapshotGroupsOutput> tags = null;

  public SnapshotGroupForDescribeSnapshotGroupsOutput creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * Get creationTime
   * @return creationTime
  **/
  @Schema(description = "")
  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public SnapshotGroupForDescribeSnapshotGroupsOutput description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SnapshotGroupForDescribeSnapshotGroupsOutput imageId(String imageId) {
    this.imageId = imageId;
    return this;
  }

   /**
   * Get imageId
   * @return imageId
  **/
  @Schema(description = "")
  public String getImageId() {
    return imageId;
  }

  public void setImageId(String imageId) {
    this.imageId = imageId;
  }

  public SnapshotGroupForDescribeSnapshotGroupsOutput instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @Schema(description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public SnapshotGroupForDescribeSnapshotGroupsOutput name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SnapshotGroupForDescribeSnapshotGroupsOutput projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @Schema(description = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public SnapshotGroupForDescribeSnapshotGroupsOutput snapshotGroupId(String snapshotGroupId) {
    this.snapshotGroupId = snapshotGroupId;
    return this;
  }

   /**
   * Get snapshotGroupId
   * @return snapshotGroupId
  **/
  @Schema(description = "")
  public String getSnapshotGroupId() {
    return snapshotGroupId;
  }

  public void setSnapshotGroupId(String snapshotGroupId) {
    this.snapshotGroupId = snapshotGroupId;
  }

  public SnapshotGroupForDescribeSnapshotGroupsOutput snapshots(List<SnapshotForDescribeSnapshotGroupsOutput> snapshots) {
    this.snapshots = snapshots;
    return this;
  }

  public SnapshotGroupForDescribeSnapshotGroupsOutput addSnapshotsItem(SnapshotForDescribeSnapshotGroupsOutput snapshotsItem) {
    if (this.snapshots == null) {
      this.snapshots = new ArrayList<SnapshotForDescribeSnapshotGroupsOutput>();
    }
    this.snapshots.add(snapshotsItem);
    return this;
  }

   /**
   * Get snapshots
   * @return snapshots
  **/
  @Valid
  @Schema(description = "")
  public List<SnapshotForDescribeSnapshotGroupsOutput> getSnapshots() {
    return snapshots;
  }

  public void setSnapshots(List<SnapshotForDescribeSnapshotGroupsOutput> snapshots) {
    this.snapshots = snapshots;
  }

  public SnapshotGroupForDescribeSnapshotGroupsOutput status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public SnapshotGroupForDescribeSnapshotGroupsOutput tags(List<TagForDescribeSnapshotGroupsOutput> tags) {
    this.tags = tags;
    return this;
  }

  public SnapshotGroupForDescribeSnapshotGroupsOutput addTagsItem(TagForDescribeSnapshotGroupsOutput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForDescribeSnapshotGroupsOutput>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Valid
  @Schema(description = "")
  public List<TagForDescribeSnapshotGroupsOutput> getTags() {
    return tags;
  }

  public void setTags(List<TagForDescribeSnapshotGroupsOutput> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnapshotGroupForDescribeSnapshotGroupsOutput snapshotGroupForDescribeSnapshotGroupsOutput = (SnapshotGroupForDescribeSnapshotGroupsOutput) o;
    return Objects.equals(this.creationTime, snapshotGroupForDescribeSnapshotGroupsOutput.creationTime) &&
        Objects.equals(this.description, snapshotGroupForDescribeSnapshotGroupsOutput.description) &&
        Objects.equals(this.imageId, snapshotGroupForDescribeSnapshotGroupsOutput.imageId) &&
        Objects.equals(this.instanceId, snapshotGroupForDescribeSnapshotGroupsOutput.instanceId) &&
        Objects.equals(this.name, snapshotGroupForDescribeSnapshotGroupsOutput.name) &&
        Objects.equals(this.projectName, snapshotGroupForDescribeSnapshotGroupsOutput.projectName) &&
        Objects.equals(this.snapshotGroupId, snapshotGroupForDescribeSnapshotGroupsOutput.snapshotGroupId) &&
        Objects.equals(this.snapshots, snapshotGroupForDescribeSnapshotGroupsOutput.snapshots) &&
        Objects.equals(this.status, snapshotGroupForDescribeSnapshotGroupsOutput.status) &&
        Objects.equals(this.tags, snapshotGroupForDescribeSnapshotGroupsOutput.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationTime, description, imageId, instanceId, name, projectName, snapshotGroupId, snapshots, status, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotGroupForDescribeSnapshotGroupsOutput {\n");
    
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    snapshotGroupId: ").append(toIndentedString(snapshotGroupId)).append("\n");
    sb.append("    snapshots: ").append(toIndentedString(snapshots)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}