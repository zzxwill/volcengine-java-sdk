/*
 * iam
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.iam.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.iam.model.RoleMetadatumForListRolesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListRolesResponse
 */


public class ListRolesResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("Limit")
  private Integer limit = null;

  @SerializedName("Offset")
  private Integer offset = null;

  @SerializedName("RoleMetadata")
  private List<RoleMetadatumForListRolesOutput> roleMetadata = null;

  @SerializedName("Total")
  private Integer total = null;

  public ListRolesResponse limit(Integer limit) {
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

  public ListRolesResponse offset(Integer offset) {
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

  public ListRolesResponse roleMetadata(List<RoleMetadatumForListRolesOutput> roleMetadata) {
    this.roleMetadata = roleMetadata;
    return this;
  }

  public ListRolesResponse addRoleMetadataItem(RoleMetadatumForListRolesOutput roleMetadataItem) {
    if (this.roleMetadata == null) {
      this.roleMetadata = new ArrayList<RoleMetadatumForListRolesOutput>();
    }
    this.roleMetadata.add(roleMetadataItem);
    return this;
  }

   /**
   * Get roleMetadata
   * @return roleMetadata
  **/
  @Valid
  @Schema(description = "")
  public List<RoleMetadatumForListRolesOutput> getRoleMetadata() {
    return roleMetadata;
  }

  public void setRoleMetadata(List<RoleMetadatumForListRolesOutput> roleMetadata) {
    this.roleMetadata = roleMetadata;
  }

  public ListRolesResponse total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @Schema(description = "")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListRolesResponse listRolesResponse = (ListRolesResponse) o;
    return Objects.equals(this.limit, listRolesResponse.limit) &&
        Objects.equals(this.offset, listRolesResponse.offset) &&
        Objects.equals(this.roleMetadata, listRolesResponse.roleMetadata) &&
        Objects.equals(this.total, listRolesResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, offset, roleMetadata, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListRolesResponse {\n");
    
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    roleMetadata: ").append(toIndentedString(roleMetadata)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
