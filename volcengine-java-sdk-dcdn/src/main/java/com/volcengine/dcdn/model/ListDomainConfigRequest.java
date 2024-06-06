/*
 * dcdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.dcdn.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.dcdn.model.ResourceTagFilterForListDomainConfigInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListDomainConfigRequest
 */


public class ListDomainConfigRequest {
  @SerializedName("HTTPs")
  private Boolean htTPs = null;

  @SerializedName("Keyword")
  private String keyword = null;

  @SerializedName("OriginType")
  private List<String> originType = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("ProjectName")
  private List<String> projectName = null;

  @SerializedName("ResourceTagFilter")
  private ResourceTagFilterForListDomainConfigInput resourceTagFilter = null;

  @SerializedName("Scope")
  private List<String> scope = null;

  @SerializedName("Status")
  private List<String> status = null;

  @SerializedName("TimeSortOrder")
  private String timeSortOrder = null;

  public ListDomainConfigRequest htTPs(Boolean htTPs) {
    this.htTPs = htTPs;
    return this;
  }

   /**
   * Get htTPs
   * @return htTPs
  **/
  @Schema(description = "")
  public Boolean isHtTPs() {
    return htTPs;
  }

  public void setHtTPs(Boolean htTPs) {
    this.htTPs = htTPs;
  }

  public ListDomainConfigRequest keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

   /**
   * Get keyword
   * @return keyword
  **/
  @Schema(description = "")
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  public ListDomainConfigRequest originType(List<String> originType) {
    this.originType = originType;
    return this;
  }

  public ListDomainConfigRequest addOriginTypeItem(String originTypeItem) {
    if (this.originType == null) {
      this.originType = new ArrayList<String>();
    }
    this.originType.add(originTypeItem);
    return this;
  }

   /**
   * Get originType
   * @return originType
  **/
  @Schema(description = "")
  public List<String> getOriginType() {
    return originType;
  }

  public void setOriginType(List<String> originType) {
    this.originType = originType;
  }

  public ListDomainConfigRequest pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  @Schema(description = "")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public ListDomainConfigRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @Schema(description = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public ListDomainConfigRequest projectName(List<String> projectName) {
    this.projectName = projectName;
    return this;
  }

  public ListDomainConfigRequest addProjectNameItem(String projectNameItem) {
    if (this.projectName == null) {
      this.projectName = new ArrayList<String>();
    }
    this.projectName.add(projectNameItem);
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @Schema(description = "")
  public List<String> getProjectName() {
    return projectName;
  }

  public void setProjectName(List<String> projectName) {
    this.projectName = projectName;
  }

  public ListDomainConfigRequest resourceTagFilter(ResourceTagFilterForListDomainConfigInput resourceTagFilter) {
    this.resourceTagFilter = resourceTagFilter;
    return this;
  }

   /**
   * Get resourceTagFilter
   * @return resourceTagFilter
  **/
  @Valid
  @Schema(description = "")
  public ResourceTagFilterForListDomainConfigInput getResourceTagFilter() {
    return resourceTagFilter;
  }

  public void setResourceTagFilter(ResourceTagFilterForListDomainConfigInput resourceTagFilter) {
    this.resourceTagFilter = resourceTagFilter;
  }

  public ListDomainConfigRequest scope(List<String> scope) {
    this.scope = scope;
    return this;
  }

  public ListDomainConfigRequest addScopeItem(String scopeItem) {
    if (this.scope == null) {
      this.scope = new ArrayList<String>();
    }
    this.scope.add(scopeItem);
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @Schema(description = "")
  public List<String> getScope() {
    return scope;
  }

  public void setScope(List<String> scope) {
    this.scope = scope;
  }

  public ListDomainConfigRequest status(List<String> status) {
    this.status = status;
    return this;
  }

  public ListDomainConfigRequest addStatusItem(String statusItem) {
    if (this.status == null) {
      this.status = new ArrayList<String>();
    }
    this.status.add(statusItem);
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public List<String> getStatus() {
    return status;
  }

  public void setStatus(List<String> status) {
    this.status = status;
  }

  public ListDomainConfigRequest timeSortOrder(String timeSortOrder) {
    this.timeSortOrder = timeSortOrder;
    return this;
  }

   /**
   * Get timeSortOrder
   * @return timeSortOrder
  **/
  @Schema(description = "")
  public String getTimeSortOrder() {
    return timeSortOrder;
  }

  public void setTimeSortOrder(String timeSortOrder) {
    this.timeSortOrder = timeSortOrder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDomainConfigRequest listDomainConfigRequest = (ListDomainConfigRequest) o;
    return Objects.equals(this.htTPs, listDomainConfigRequest.htTPs) &&
        Objects.equals(this.keyword, listDomainConfigRequest.keyword) &&
        Objects.equals(this.originType, listDomainConfigRequest.originType) &&
        Objects.equals(this.pageNumber, listDomainConfigRequest.pageNumber) &&
        Objects.equals(this.pageSize, listDomainConfigRequest.pageSize) &&
        Objects.equals(this.projectName, listDomainConfigRequest.projectName) &&
        Objects.equals(this.resourceTagFilter, listDomainConfigRequest.resourceTagFilter) &&
        Objects.equals(this.scope, listDomainConfigRequest.scope) &&
        Objects.equals(this.status, listDomainConfigRequest.status) &&
        Objects.equals(this.timeSortOrder, listDomainConfigRequest.timeSortOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(htTPs, keyword, originType, pageNumber, pageSize, projectName, resourceTagFilter, scope, status, timeSortOrder);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDomainConfigRequest {\n");
    
    sb.append("    htTPs: ").append(toIndentedString(htTPs)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    originType: ").append(toIndentedString(originType)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    resourceTagFilter: ").append(toIndentedString(resourceTagFilter)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timeSortOrder: ").append(toIndentedString(timeSortOrder)).append("\n");
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