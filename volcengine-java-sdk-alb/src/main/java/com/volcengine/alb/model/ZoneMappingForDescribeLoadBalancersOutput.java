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
import com.volcengine.alb.model.LoadBalancerAddressForDescribeLoadBalancersOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ZoneMappingForDescribeLoadBalancersOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-31T15:50:05.609740+08:00[Asia/Shanghai]")
public class ZoneMappingForDescribeLoadBalancersOutput {
  @SerializedName("LoadBalancerAddresses")
  private List<LoadBalancerAddressForDescribeLoadBalancersOutput> loadBalancerAddresses = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public ZoneMappingForDescribeLoadBalancersOutput loadBalancerAddresses(List<LoadBalancerAddressForDescribeLoadBalancersOutput> loadBalancerAddresses) {
    this.loadBalancerAddresses = loadBalancerAddresses;
    return this;
  }

  public ZoneMappingForDescribeLoadBalancersOutput addLoadBalancerAddressesItem(LoadBalancerAddressForDescribeLoadBalancersOutput loadBalancerAddressesItem) {
    if (this.loadBalancerAddresses == null) {
      this.loadBalancerAddresses = new ArrayList<LoadBalancerAddressForDescribeLoadBalancersOutput>();
    }
    this.loadBalancerAddresses.add(loadBalancerAddressesItem);
    return this;
  }

   /**
   * Get loadBalancerAddresses
   * @return loadBalancerAddresses
  **/
  @Valid
  @Schema(description = "")
  public List<LoadBalancerAddressForDescribeLoadBalancersOutput> getLoadBalancerAddresses() {
    return loadBalancerAddresses;
  }

  public void setLoadBalancerAddresses(List<LoadBalancerAddressForDescribeLoadBalancersOutput> loadBalancerAddresses) {
    this.loadBalancerAddresses = loadBalancerAddresses;
  }

  public ZoneMappingForDescribeLoadBalancersOutput subnetId(String subnetId) {
    this.subnetId = subnetId;
    return this;
  }

   /**
   * Get subnetId
   * @return subnetId
  **/
  @Schema(description = "")
  public String getSubnetId() {
    return subnetId;
  }

  public void setSubnetId(String subnetId) {
    this.subnetId = subnetId;
  }

  public ZoneMappingForDescribeLoadBalancersOutput zoneId(String zoneId) {
    this.zoneId = zoneId;
    return this;
  }

   /**
   * Get zoneId
   * @return zoneId
  **/
  @Schema(description = "")
  public String getZoneId() {
    return zoneId;
  }

  public void setZoneId(String zoneId) {
    this.zoneId = zoneId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZoneMappingForDescribeLoadBalancersOutput zoneMappingForDescribeLoadBalancersOutput = (ZoneMappingForDescribeLoadBalancersOutput) o;
    return Objects.equals(this.loadBalancerAddresses, zoneMappingForDescribeLoadBalancersOutput.loadBalancerAddresses) &&
        Objects.equals(this.subnetId, zoneMappingForDescribeLoadBalancersOutput.subnetId) &&
        Objects.equals(this.zoneId, zoneMappingForDescribeLoadBalancersOutput.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadBalancerAddresses, subnetId, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZoneMappingForDescribeLoadBalancersOutput {\n");
    
    sb.append("    loadBalancerAddresses: ").append(toIndentedString(loadBalancerAddresses)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
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
