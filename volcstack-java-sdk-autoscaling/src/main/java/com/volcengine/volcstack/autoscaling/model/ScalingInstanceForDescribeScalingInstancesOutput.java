/*
 * auto_scaling
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcstack.autoscaling.model;

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
 * ScalingInstanceForDescribeScalingInstancesOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:12.731669+08:00[Asia/Shanghai]")
public class ScalingInstanceForDescribeScalingInstancesOutput {
  @SerializedName("CreatedTime")
  private String createdTime = null;

  @SerializedName("CreationType")
  private String creationType = null;

  @SerializedName("Entrusted")
  private Boolean entrusted = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("ScalingActivityId")
  private String scalingActivityId = null;

  @SerializedName("ScalingConfigurationId")
  private String scalingConfigurationId = null;

  @SerializedName("ScalingGroupId")
  private String scalingGroupId = null;

  @SerializedName("ScalingPolicyId")
  private String scalingPolicyId = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public ScalingInstanceForDescribeScalingInstancesOutput createdTime(String createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * Get createdTime
   * @return createdTime
  **/
  @Schema(description = "")
  public String getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(String createdTime) {
    this.createdTime = createdTime;
  }

  public ScalingInstanceForDescribeScalingInstancesOutput creationType(String creationType) {
    this.creationType = creationType;
    return this;
  }

   /**
   * Get creationType
   * @return creationType
  **/
  @Schema(description = "")
  public String getCreationType() {
    return creationType;
  }

  public void setCreationType(String creationType) {
    this.creationType = creationType;
  }

  public ScalingInstanceForDescribeScalingInstancesOutput entrusted(Boolean entrusted) {
    this.entrusted = entrusted;
    return this;
  }

   /**
   * Get entrusted
   * @return entrusted
  **/
  @Schema(description = "")
  public Boolean isEntrusted() {
    return entrusted;
  }

  public void setEntrusted(Boolean entrusted) {
    this.entrusted = entrusted;
  }

  public ScalingInstanceForDescribeScalingInstancesOutput instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @Schema(description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public ScalingInstanceForDescribeScalingInstancesOutput scalingActivityId(String scalingActivityId) {
    this.scalingActivityId = scalingActivityId;
    return this;
  }

   /**
   * Get scalingActivityId
   * @return scalingActivityId
  **/
  @Schema(description = "")
  public String getScalingActivityId() {
    return scalingActivityId;
  }

  public void setScalingActivityId(String scalingActivityId) {
    this.scalingActivityId = scalingActivityId;
  }

  public ScalingInstanceForDescribeScalingInstancesOutput scalingConfigurationId(String scalingConfigurationId) {
    this.scalingConfigurationId = scalingConfigurationId;
    return this;
  }

   /**
   * Get scalingConfigurationId
   * @return scalingConfigurationId
  **/
  @Schema(description = "")
  public String getScalingConfigurationId() {
    return scalingConfigurationId;
  }

  public void setScalingConfigurationId(String scalingConfigurationId) {
    this.scalingConfigurationId = scalingConfigurationId;
  }

  public ScalingInstanceForDescribeScalingInstancesOutput scalingGroupId(String scalingGroupId) {
    this.scalingGroupId = scalingGroupId;
    return this;
  }

   /**
   * Get scalingGroupId
   * @return scalingGroupId
  **/
  @Schema(description = "")
  public String getScalingGroupId() {
    return scalingGroupId;
  }

  public void setScalingGroupId(String scalingGroupId) {
    this.scalingGroupId = scalingGroupId;
  }

  public ScalingInstanceForDescribeScalingInstancesOutput scalingPolicyId(String scalingPolicyId) {
    this.scalingPolicyId = scalingPolicyId;
    return this;
  }

   /**
   * Get scalingPolicyId
   * @return scalingPolicyId
  **/
  @Schema(description = "")
  public String getScalingPolicyId() {
    return scalingPolicyId;
  }

  public void setScalingPolicyId(String scalingPolicyId) {
    this.scalingPolicyId = scalingPolicyId;
  }

  public ScalingInstanceForDescribeScalingInstancesOutput status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ScalingInstanceForDescribeScalingInstancesOutput zoneId(String zoneId) {
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
    ScalingInstanceForDescribeScalingInstancesOutput scalingInstanceForDescribeScalingInstancesOutput = (ScalingInstanceForDescribeScalingInstancesOutput) o;
    return Objects.equals(this.createdTime, scalingInstanceForDescribeScalingInstancesOutput.createdTime) &&
        Objects.equals(this.creationType, scalingInstanceForDescribeScalingInstancesOutput.creationType) &&
        Objects.equals(this.entrusted, scalingInstanceForDescribeScalingInstancesOutput.entrusted) &&
        Objects.equals(this.instanceId, scalingInstanceForDescribeScalingInstancesOutput.instanceId) &&
        Objects.equals(this.scalingActivityId, scalingInstanceForDescribeScalingInstancesOutput.scalingActivityId) &&
        Objects.equals(this.scalingConfigurationId, scalingInstanceForDescribeScalingInstancesOutput.scalingConfigurationId) &&
        Objects.equals(this.scalingGroupId, scalingInstanceForDescribeScalingInstancesOutput.scalingGroupId) &&
        Objects.equals(this.scalingPolicyId, scalingInstanceForDescribeScalingInstancesOutput.scalingPolicyId) &&
        Objects.equals(this.status, scalingInstanceForDescribeScalingInstancesOutput.status) &&
        Objects.equals(this.zoneId, scalingInstanceForDescribeScalingInstancesOutput.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdTime, creationType, entrusted, instanceId, scalingActivityId, scalingConfigurationId, scalingGroupId, scalingPolicyId, status, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScalingInstanceForDescribeScalingInstancesOutput {\n");
    
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    creationType: ").append(toIndentedString(creationType)).append("\n");
    sb.append("    entrusted: ").append(toIndentedString(entrusted)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    scalingActivityId: ").append(toIndentedString(scalingActivityId)).append("\n");
    sb.append("    scalingConfigurationId: ").append(toIndentedString(scalingConfigurationId)).append("\n");
    sb.append("    scalingGroupId: ").append(toIndentedString(scalingGroupId)).append("\n");
    sb.append("    scalingPolicyId: ").append(toIndentedString(scalingPolicyId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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