/*
 * waf
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.waf.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * UpdateIpGroupRequest
 */



public class UpdateIpGroupRequest {
  @SerializedName("AddType")
  private String addType = null;

  @SerializedName("IpGroupId")
  private Integer ipGroupId = null;

  @SerializedName("IpList")
  private List<String> ipList = null;

  @SerializedName("Name")
  private String name = null;

  public UpdateIpGroupRequest addType(String addType) {
    this.addType = addType;
    return this;
  }

   /**
   * Get addType
   * @return addType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getAddType() {
    return addType;
  }

  public void setAddType(String addType) {
    this.addType = addType;
  }

  public UpdateIpGroupRequest ipGroupId(Integer ipGroupId) {
    this.ipGroupId = ipGroupId;
    return this;
  }

   /**
   * Get ipGroupId
   * @return ipGroupId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getIpGroupId() {
    return ipGroupId;
  }

  public void setIpGroupId(Integer ipGroupId) {
    this.ipGroupId = ipGroupId;
  }

  public UpdateIpGroupRequest ipList(List<String> ipList) {
    this.ipList = ipList;
    return this;
  }

  public UpdateIpGroupRequest addIpListItem(String ipListItem) {
    if (this.ipList == null) {
      this.ipList = new ArrayList<String>();
    }
    this.ipList.add(ipListItem);
    return this;
  }

   /**
   * Get ipList
   * @return ipList
  **/
  @Schema(description = "")
  public List<String> getIpList() {
    return ipList;
  }

  public void setIpList(List<String> ipList) {
    this.ipList = ipList;
  }

  public UpdateIpGroupRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateIpGroupRequest updateIpGroupRequest = (UpdateIpGroupRequest) o;
    return Objects.equals(this.addType, updateIpGroupRequest.addType) &&
        Objects.equals(this.ipGroupId, updateIpGroupRequest.ipGroupId) &&
        Objects.equals(this.ipList, updateIpGroupRequest.ipList) &&
        Objects.equals(this.name, updateIpGroupRequest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addType, ipGroupId, ipList, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateIpGroupRequest {\n");
    
    sb.append("    addType: ").append(toIndentedString(addType)).append("\n");
    sb.append("    ipGroupId: ").append(toIndentedString(ipGroupId)).append("\n");
    sb.append("    ipList: ").append(toIndentedString(ipList)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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