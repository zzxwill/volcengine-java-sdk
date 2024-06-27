/*
 * iam20210801
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.iam20210801.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ProjectForListProjectsOutput
 */


public class ProjectForListProjectsOutput {
  @SerializedName("AccountID")
  private String accountID = null;

  @SerializedName("CreateDate")
  private String createDate = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("HasPermission")
  private Boolean hasPermission = null;

  @SerializedName("ParentProjectName")
  private String parentProjectName = null;

  @SerializedName("Path")
  private String path = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("UpdateDate")
  private String updateDate = null;

  public ProjectForListProjectsOutput accountID(String accountID) {
    this.accountID = accountID;
    return this;
  }

   /**
   * Get accountID
   * @return accountID
  **/
  @Schema(description = "")
  public String getAccountID() {
    return accountID;
  }

  public void setAccountID(String accountID) {
    this.accountID = accountID;
  }

  public ProjectForListProjectsOutput createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @Schema(description = "")
  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }

  public ProjectForListProjectsOutput description(String description) {
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

  public ProjectForListProjectsOutput displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @Schema(description = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public ProjectForListProjectsOutput hasPermission(Boolean hasPermission) {
    this.hasPermission = hasPermission;
    return this;
  }

   /**
   * Get hasPermission
   * @return hasPermission
  **/
  @Schema(description = "")
  public Boolean isHasPermission() {
    return hasPermission;
  }

  public void setHasPermission(Boolean hasPermission) {
    this.hasPermission = hasPermission;
  }

  public ProjectForListProjectsOutput parentProjectName(String parentProjectName) {
    this.parentProjectName = parentProjectName;
    return this;
  }

   /**
   * Get parentProjectName
   * @return parentProjectName
  **/
  @Schema(description = "")
  public String getParentProjectName() {
    return parentProjectName;
  }

  public void setParentProjectName(String parentProjectName) {
    this.parentProjectName = parentProjectName;
  }

  public ProjectForListProjectsOutput path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @Schema(description = "")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public ProjectForListProjectsOutput projectName(String projectName) {
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

  public ProjectForListProjectsOutput status(String status) {
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

  public ProjectForListProjectsOutput updateDate(String updateDate) {
    this.updateDate = updateDate;
    return this;
  }

   /**
   * Get updateDate
   * @return updateDate
  **/
  @Schema(description = "")
  public String getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(String updateDate) {
    this.updateDate = updateDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectForListProjectsOutput projectForListProjectsOutput = (ProjectForListProjectsOutput) o;
    return Objects.equals(this.accountID, projectForListProjectsOutput.accountID) &&
        Objects.equals(this.createDate, projectForListProjectsOutput.createDate) &&
        Objects.equals(this.description, projectForListProjectsOutput.description) &&
        Objects.equals(this.displayName, projectForListProjectsOutput.displayName) &&
        Objects.equals(this.hasPermission, projectForListProjectsOutput.hasPermission) &&
        Objects.equals(this.parentProjectName, projectForListProjectsOutput.parentProjectName) &&
        Objects.equals(this.path, projectForListProjectsOutput.path) &&
        Objects.equals(this.projectName, projectForListProjectsOutput.projectName) &&
        Objects.equals(this.status, projectForListProjectsOutput.status) &&
        Objects.equals(this.updateDate, projectForListProjectsOutput.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountID, createDate, description, displayName, hasPermission, parentProjectName, path, projectName, status, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectForListProjectsOutput {\n");
    
    sb.append("    accountID: ").append(toIndentedString(accountID)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    hasPermission: ").append(toIndentedString(hasPermission)).append("\n");
    sb.append("    parentProjectName: ").append(toIndentedString(parentProjectName)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
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