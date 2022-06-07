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

package com.volcengine.volcstack.ecs.model;

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
 * VolumeForDescribeInstanceTypesOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:32.918937+08:00[Asia/Shanghai]")
public class VolumeForDescribeInstanceTypesOutput {
  @SerializedName("MaximumBandwidthMbps")
  private String maximumBandwidthMbps = null;

  @SerializedName("MaximumCount")
  private Integer maximumCount = null;

  @SerializedName("MaximumIops")
  private Integer maximumIops = null;

  @SerializedName("SupportedVolumeTypes")
  private List<String> supportedVolumeTypes = null;

  public VolumeForDescribeInstanceTypesOutput maximumBandwidthMbps(String maximumBandwidthMbps) {
    this.maximumBandwidthMbps = maximumBandwidthMbps;
    return this;
  }

   /**
   * Get maximumBandwidthMbps
   * @return maximumBandwidthMbps
  **/
  @Schema(description = "")
  public String getMaximumBandwidthMbps() {
    return maximumBandwidthMbps;
  }

  public void setMaximumBandwidthMbps(String maximumBandwidthMbps) {
    this.maximumBandwidthMbps = maximumBandwidthMbps;
  }

  public VolumeForDescribeInstanceTypesOutput maximumCount(Integer maximumCount) {
    this.maximumCount = maximumCount;
    return this;
  }

   /**
   * Get maximumCount
   * @return maximumCount
  **/
  @Schema(description = "")
  public Integer getMaximumCount() {
    return maximumCount;
  }

  public void setMaximumCount(Integer maximumCount) {
    this.maximumCount = maximumCount;
  }

  public VolumeForDescribeInstanceTypesOutput maximumIops(Integer maximumIops) {
    this.maximumIops = maximumIops;
    return this;
  }

   /**
   * Get maximumIops
   * @return maximumIops
  **/
  @Schema(description = "")
  public Integer getMaximumIops() {
    return maximumIops;
  }

  public void setMaximumIops(Integer maximumIops) {
    this.maximumIops = maximumIops;
  }

  public VolumeForDescribeInstanceTypesOutput supportedVolumeTypes(List<String> supportedVolumeTypes) {
    this.supportedVolumeTypes = supportedVolumeTypes;
    return this;
  }

  public VolumeForDescribeInstanceTypesOutput addSupportedVolumeTypesItem(String supportedVolumeTypesItem) {
    if (this.supportedVolumeTypes == null) {
      this.supportedVolumeTypes = new ArrayList<String>();
    }
    this.supportedVolumeTypes.add(supportedVolumeTypesItem);
    return this;
  }

   /**
   * Get supportedVolumeTypes
   * @return supportedVolumeTypes
  **/
  @Schema(description = "")
  public List<String> getSupportedVolumeTypes() {
    return supportedVolumeTypes;
  }

  public void setSupportedVolumeTypes(List<String> supportedVolumeTypes) {
    this.supportedVolumeTypes = supportedVolumeTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeForDescribeInstanceTypesOutput volumeForDescribeInstanceTypesOutput = (VolumeForDescribeInstanceTypesOutput) o;
    return Objects.equals(this.maximumBandwidthMbps, volumeForDescribeInstanceTypesOutput.maximumBandwidthMbps) &&
        Objects.equals(this.maximumCount, volumeForDescribeInstanceTypesOutput.maximumCount) &&
        Objects.equals(this.maximumIops, volumeForDescribeInstanceTypesOutput.maximumIops) &&
        Objects.equals(this.supportedVolumeTypes, volumeForDescribeInstanceTypesOutput.supportedVolumeTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maximumBandwidthMbps, maximumCount, maximumIops, supportedVolumeTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeForDescribeInstanceTypesOutput {\n");
    
    sb.append("    maximumBandwidthMbps: ").append(toIndentedString(maximumBandwidthMbps)).append("\n");
    sb.append("    maximumCount: ").append(toIndentedString(maximumCount)).append("\n");
    sb.append("    maximumIops: ").append(toIndentedString(maximumIops)).append("\n");
    sb.append("    supportedVolumeTypes: ").append(toIndentedString(supportedVolumeTypes)).append("\n");
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