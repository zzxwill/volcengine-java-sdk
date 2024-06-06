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
 * AllocateDedicatedHostsResponse
 */



public class AllocateDedicatedHostsResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("DedicatedHostIds")
  private List<String> dedicatedHostIds = null;

  public AllocateDedicatedHostsResponse dedicatedHostIds(List<String> dedicatedHostIds) {
    this.dedicatedHostIds = dedicatedHostIds;
    return this;
  }

  public AllocateDedicatedHostsResponse addDedicatedHostIdsItem(String dedicatedHostIdsItem) {
    if (this.dedicatedHostIds == null) {
      this.dedicatedHostIds = new ArrayList<String>();
    }
    this.dedicatedHostIds.add(dedicatedHostIdsItem);
    return this;
  }

   /**
   * Get dedicatedHostIds
   * @return dedicatedHostIds
  **/
  @Schema(description = "")
  public List<String> getDedicatedHostIds() {
    return dedicatedHostIds;
  }

  public void setDedicatedHostIds(List<String> dedicatedHostIds) {
    this.dedicatedHostIds = dedicatedHostIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllocateDedicatedHostsResponse allocateDedicatedHostsResponse = (AllocateDedicatedHostsResponse) o;
    return Objects.equals(this.dedicatedHostIds, allocateDedicatedHostsResponse.dedicatedHostIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dedicatedHostIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllocateDedicatedHostsResponse {\n");
    
    sb.append("    dedicatedHostIds: ").append(toIndentedString(dedicatedHostIds)).append("\n");
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
