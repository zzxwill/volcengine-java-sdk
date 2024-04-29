/*
 * organization
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.organization.model;

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
 * ListInvitationsRequest
 */


public class ListInvitationsRequest {
  @SerializedName("Limit")
  private Integer limit = null;

  @SerializedName("Offset")
  private Integer offset = null;

  @SerializedName("OrderBy")
  private Integer orderBy = null;

  @SerializedName("OrderStr")
  private String orderStr = null;

  @SerializedName("OrgUnitId")
  private String orgUnitId = null;

  @SerializedName("Search")
  private String search = null;

  public ListInvitationsRequest limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @Schema(description = "")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public ListInvitationsRequest offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Get offset
   * @return offset
  **/
  @Schema(description = "")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public ListInvitationsRequest orderBy(Integer orderBy) {
    this.orderBy = orderBy;
    return this;
  }

   /**
   * Get orderBy
   * @return orderBy
  **/
  @Schema(description = "")
  public Integer getOrderBy() {
    return orderBy;
  }

  public void setOrderBy(Integer orderBy) {
    this.orderBy = orderBy;
  }

  public ListInvitationsRequest orderStr(String orderStr) {
    this.orderStr = orderStr;
    return this;
  }

   /**
   * Get orderStr
   * @return orderStr
  **/
  @Schema(description = "")
  public String getOrderStr() {
    return orderStr;
  }

  public void setOrderStr(String orderStr) {
    this.orderStr = orderStr;
  }

  public ListInvitationsRequest orgUnitId(String orgUnitId) {
    this.orgUnitId = orgUnitId;
    return this;
  }

   /**
   * Get orgUnitId
   * @return orgUnitId
  **/
  @Schema(description = "")
  public String getOrgUnitId() {
    return orgUnitId;
  }

  public void setOrgUnitId(String orgUnitId) {
    this.orgUnitId = orgUnitId;
  }

  public ListInvitationsRequest search(String search) {
    this.search = search;
    return this;
  }

   /**
   * Get search
   * @return search
  **/
  @Schema(description = "")
  public String getSearch() {
    return search;
  }

  public void setSearch(String search) {
    this.search = search;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListInvitationsRequest listInvitationsRequest = (ListInvitationsRequest) o;
    return Objects.equals(this.limit, listInvitationsRequest.limit) &&
        Objects.equals(this.offset, listInvitationsRequest.offset) &&
        Objects.equals(this.orderBy, listInvitationsRequest.orderBy) &&
        Objects.equals(this.orderStr, listInvitationsRequest.orderStr) &&
        Objects.equals(this.orgUnitId, listInvitationsRequest.orgUnitId) &&
        Objects.equals(this.search, listInvitationsRequest.search);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, offset, orderBy, orderStr, orgUnitId, search);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListInvitationsRequest {\n");
    
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    orderStr: ").append(toIndentedString(orderStr)).append("\n");
    sb.append("    orgUnitId: ").append(toIndentedString(orgUnitId)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
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
