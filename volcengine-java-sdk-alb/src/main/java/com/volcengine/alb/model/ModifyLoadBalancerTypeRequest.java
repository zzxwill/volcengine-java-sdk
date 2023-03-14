/*
 * alb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.alb.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.alb.model.ZoneMappingForModifyLoadBalancerTypeInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ModifyLoadBalancerTypeRequest
 */


public class ModifyLoadBalancerTypeRequest {
  @SerializedName("LoadBalancerId")
  private String loadBalancerId = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("ZoneMappings")
  private List<ZoneMappingForModifyLoadBalancerTypeInput> zoneMappings = null;

  public ModifyLoadBalancerTypeRequest loadBalancerId(String loadBalancerId) {
    this.loadBalancerId = loadBalancerId;
    return this;
  }

   /**
   * Get loadBalancerId
   * @return loadBalancerId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getLoadBalancerId() {
    return loadBalancerId;
  }

  public void setLoadBalancerId(String loadBalancerId) {
    this.loadBalancerId = loadBalancerId;
  }

  public ModifyLoadBalancerTypeRequest type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ModifyLoadBalancerTypeRequest zoneMappings(List<ZoneMappingForModifyLoadBalancerTypeInput> zoneMappings) {
    this.zoneMappings = zoneMappings;
    return this;
  }

  public ModifyLoadBalancerTypeRequest addZoneMappingsItem(ZoneMappingForModifyLoadBalancerTypeInput zoneMappingsItem) {
    if (this.zoneMappings == null) {
      this.zoneMappings = new ArrayList<ZoneMappingForModifyLoadBalancerTypeInput>();
    }
    this.zoneMappings.add(zoneMappingsItem);
    return this;
  }

   /**
   * Get zoneMappings
   * @return zoneMappings
  **/
  @Valid
  @Schema(description = "")
  public List<ZoneMappingForModifyLoadBalancerTypeInput> getZoneMappings() {
    return zoneMappings;
  }

  public void setZoneMappings(List<ZoneMappingForModifyLoadBalancerTypeInput> zoneMappings) {
    this.zoneMappings = zoneMappings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyLoadBalancerTypeRequest modifyLoadBalancerTypeRequest = (ModifyLoadBalancerTypeRequest) o;
    return Objects.equals(this.loadBalancerId, modifyLoadBalancerTypeRequest.loadBalancerId) &&
        Objects.equals(this.type, modifyLoadBalancerTypeRequest.type) &&
        Objects.equals(this.zoneMappings, modifyLoadBalancerTypeRequest.zoneMappings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadBalancerId, type, zoneMappings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyLoadBalancerTypeRequest {\n");
    
    sb.append("    loadBalancerId: ").append(toIndentedString(loadBalancerId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    zoneMappings: ").append(toIndentedString(zoneMappings)).append("\n");
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