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
 * ModifyReservedInstancesResponse
 */



public class ModifyReservedInstancesResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("ReservedInstanceIds")
  private List<String> reservedInstanceIds = null;

  public ModifyReservedInstancesResponse reservedInstanceIds(List<String> reservedInstanceIds) {
    this.reservedInstanceIds = reservedInstanceIds;
    return this;
  }

  public ModifyReservedInstancesResponse addReservedInstanceIdsItem(String reservedInstanceIdsItem) {
    if (this.reservedInstanceIds == null) {
      this.reservedInstanceIds = new ArrayList<String>();
    }
    this.reservedInstanceIds.add(reservedInstanceIdsItem);
    return this;
  }

   /**
   * Get reservedInstanceIds
   * @return reservedInstanceIds
  **/
  @Schema(description = "")
  public List<String> getReservedInstanceIds() {
    return reservedInstanceIds;
  }

  public void setReservedInstanceIds(List<String> reservedInstanceIds) {
    this.reservedInstanceIds = reservedInstanceIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyReservedInstancesResponse modifyReservedInstancesResponse = (ModifyReservedInstancesResponse) o;
    return Objects.equals(this.reservedInstanceIds, modifyReservedInstancesResponse.reservedInstanceIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reservedInstanceIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyReservedInstancesResponse {\n");
    
    sb.append("    reservedInstanceIds: ").append(toIndentedString(reservedInstanceIds)).append("\n");
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
