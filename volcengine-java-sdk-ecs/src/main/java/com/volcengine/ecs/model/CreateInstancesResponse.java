/*
 * ecs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.ecs.model;

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
 * CreateInstancesResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:32.918937+08:00[Asia/Shanghai]")
public class CreateInstancesResponse {
  @SerializedName("InstanceIds")
  private List<String> instanceIds = null;

  @SerializedName("PreorderIds")
  private List<String> preorderIds = null;

  public CreateInstancesResponse instanceIds(List<String> instanceIds) {
    this.instanceIds = instanceIds;
    return this;
  }

  public CreateInstancesResponse addInstanceIdsItem(String instanceIdsItem) {
    if (this.instanceIds == null) {
      this.instanceIds = new ArrayList<String>();
    }
    this.instanceIds.add(instanceIdsItem);
    return this;
  }

   /**
   * Get instanceIds
   * @return instanceIds
  **/
  @Schema(description = "")
  public List<String> getInstanceIds() {
    return instanceIds;
  }

  public void setInstanceIds(List<String> instanceIds) {
    this.instanceIds = instanceIds;
  }

  public CreateInstancesResponse preorderIds(List<String> preorderIds) {
    this.preorderIds = preorderIds;
    return this;
  }

  public CreateInstancesResponse addPreorderIdsItem(String preorderIdsItem) {
    if (this.preorderIds == null) {
      this.preorderIds = new ArrayList<String>();
    }
    this.preorderIds.add(preorderIdsItem);
    return this;
  }

   /**
   * Get preorderIds
   * @return preorderIds
  **/
  @Schema(description = "")
  public List<String> getPreorderIds() {
    return preorderIds;
  }

  public void setPreorderIds(List<String> preorderIds) {
    this.preorderIds = preorderIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateInstancesResponse createInstancesResponse = (CreateInstancesResponse) o;
    return Objects.equals(this.instanceIds, createInstancesResponse.instanceIds) &&
        Objects.equals(this.preorderIds, createInstancesResponse.preorderIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceIds, preorderIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInstancesResponse {\n");
    
    sb.append("    instanceIds: ").append(toIndentedString(instanceIds)).append("\n");
    sb.append("    preorderIds: ").append(toIndentedString(preorderIds)).append("\n");
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