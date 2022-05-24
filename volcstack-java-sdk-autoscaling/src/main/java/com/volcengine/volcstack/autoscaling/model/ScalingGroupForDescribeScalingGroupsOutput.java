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
import com.volcengine.volcstack.autoscaling.model.ServerGroupAttributeForDescribeScalingGroupsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ScalingGroupForDescribeScalingGroupsOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:12.731669+08:00[Asia/Shanghai]")
public class ScalingGroupForDescribeScalingGroupsOutput {
  @SerializedName("ActiveScalingConfigurationId")
  private String activeScalingConfigurationId = null;

  @SerializedName("CreatedAt")
  private String createdAt = null;

  @SerializedName("DBInstanceIds")
  private List<String> dbInstanceIds = null;

  @SerializedName("DefaultCooldown")
  private Integer defaultCooldown = null;

  @SerializedName("DesireInstanceNumber")
  private Integer desireInstanceNumber = null;

  @SerializedName("InstanceTerminatePolicy")
  private String instanceTerminatePolicy = null;

  @SerializedName("LifecycleState")
  private String lifecycleState = null;

  @SerializedName("MaxInstanceNumber")
  private Integer maxInstanceNumber = null;

  @SerializedName("MinInstanceNumber")
  private Integer minInstanceNumber = null;

  @SerializedName("MultiAZPolicy")
  private String multiAZPolicy = null;

  @SerializedName("ScalingGroupId")
  private String scalingGroupId = null;

  @SerializedName("ScalingGroupName")
  private String scalingGroupName = null;

  @SerializedName("ServerGroupAttributes")
  private List<ServerGroupAttributeForDescribeScalingGroupsOutput> serverGroupAttributes = null;

  @SerializedName("SubnetIds")
  private List<String> subnetIds = null;

  @SerializedName("TotalInstanceCount")
  private Integer totalInstanceCount = null;

  @SerializedName("UpdatedAt")
  private String updatedAt = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  public ScalingGroupForDescribeScalingGroupsOutput activeScalingConfigurationId(String activeScalingConfigurationId) {
    this.activeScalingConfigurationId = activeScalingConfigurationId;
    return this;
  }

   /**
   * Get activeScalingConfigurationId
   * @return activeScalingConfigurationId
  **/
  @Schema(description = "")
  public String getActiveScalingConfigurationId() {
    return activeScalingConfigurationId;
  }

  public void setActiveScalingConfigurationId(String activeScalingConfigurationId) {
    this.activeScalingConfigurationId = activeScalingConfigurationId;
  }

  public ScalingGroupForDescribeScalingGroupsOutput createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(description = "")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public ScalingGroupForDescribeScalingGroupsOutput dbInstanceIds(List<String> dbInstanceIds) {
    this.dbInstanceIds = dbInstanceIds;
    return this;
  }

  public ScalingGroupForDescribeScalingGroupsOutput addDbInstanceIdsItem(String dbInstanceIdsItem) {
    if (this.dbInstanceIds == null) {
      this.dbInstanceIds = new ArrayList<String>();
    }
    this.dbInstanceIds.add(dbInstanceIdsItem);
    return this;
  }

   /**
   * Get dbInstanceIds
   * @return dbInstanceIds
  **/
  @Schema(description = "")
  public List<String> getDbInstanceIds() {
    return dbInstanceIds;
  }

  public void setDbInstanceIds(List<String> dbInstanceIds) {
    this.dbInstanceIds = dbInstanceIds;
  }

  public ScalingGroupForDescribeScalingGroupsOutput defaultCooldown(Integer defaultCooldown) {
    this.defaultCooldown = defaultCooldown;
    return this;
  }

   /**
   * Get defaultCooldown
   * @return defaultCooldown
  **/
  @Schema(description = "")
  public Integer getDefaultCooldown() {
    return defaultCooldown;
  }

  public void setDefaultCooldown(Integer defaultCooldown) {
    this.defaultCooldown = defaultCooldown;
  }

  public ScalingGroupForDescribeScalingGroupsOutput desireInstanceNumber(Integer desireInstanceNumber) {
    this.desireInstanceNumber = desireInstanceNumber;
    return this;
  }

   /**
   * Get desireInstanceNumber
   * @return desireInstanceNumber
  **/
  @Schema(description = "")
  public Integer getDesireInstanceNumber() {
    return desireInstanceNumber;
  }

  public void setDesireInstanceNumber(Integer desireInstanceNumber) {
    this.desireInstanceNumber = desireInstanceNumber;
  }

  public ScalingGroupForDescribeScalingGroupsOutput instanceTerminatePolicy(String instanceTerminatePolicy) {
    this.instanceTerminatePolicy = instanceTerminatePolicy;
    return this;
  }

   /**
   * Get instanceTerminatePolicy
   * @return instanceTerminatePolicy
  **/
  @Schema(description = "")
  public String getInstanceTerminatePolicy() {
    return instanceTerminatePolicy;
  }

  public void setInstanceTerminatePolicy(String instanceTerminatePolicy) {
    this.instanceTerminatePolicy = instanceTerminatePolicy;
  }

  public ScalingGroupForDescribeScalingGroupsOutput lifecycleState(String lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
  }

   /**
   * Get lifecycleState
   * @return lifecycleState
  **/
  @Schema(description = "")
  public String getLifecycleState() {
    return lifecycleState;
  }

  public void setLifecycleState(String lifecycleState) {
    this.lifecycleState = lifecycleState;
  }

  public ScalingGroupForDescribeScalingGroupsOutput maxInstanceNumber(Integer maxInstanceNumber) {
    this.maxInstanceNumber = maxInstanceNumber;
    return this;
  }

   /**
   * Get maxInstanceNumber
   * @return maxInstanceNumber
  **/
  @Schema(description = "")
  public Integer getMaxInstanceNumber() {
    return maxInstanceNumber;
  }

  public void setMaxInstanceNumber(Integer maxInstanceNumber) {
    this.maxInstanceNumber = maxInstanceNumber;
  }

  public ScalingGroupForDescribeScalingGroupsOutput minInstanceNumber(Integer minInstanceNumber) {
    this.minInstanceNumber = minInstanceNumber;
    return this;
  }

   /**
   * Get minInstanceNumber
   * @return minInstanceNumber
  **/
  @Schema(description = "")
  public Integer getMinInstanceNumber() {
    return minInstanceNumber;
  }

  public void setMinInstanceNumber(Integer minInstanceNumber) {
    this.minInstanceNumber = minInstanceNumber;
  }

  public ScalingGroupForDescribeScalingGroupsOutput multiAZPolicy(String multiAZPolicy) {
    this.multiAZPolicy = multiAZPolicy;
    return this;
  }

   /**
   * Get multiAZPolicy
   * @return multiAZPolicy
  **/
  @Schema(description = "")
  public String getMultiAZPolicy() {
    return multiAZPolicy;
  }

  public void setMultiAZPolicy(String multiAZPolicy) {
    this.multiAZPolicy = multiAZPolicy;
  }

  public ScalingGroupForDescribeScalingGroupsOutput scalingGroupId(String scalingGroupId) {
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

  public ScalingGroupForDescribeScalingGroupsOutput scalingGroupName(String scalingGroupName) {
    this.scalingGroupName = scalingGroupName;
    return this;
  }

   /**
   * Get scalingGroupName
   * @return scalingGroupName
  **/
  @Schema(description = "")
  public String getScalingGroupName() {
    return scalingGroupName;
  }

  public void setScalingGroupName(String scalingGroupName) {
    this.scalingGroupName = scalingGroupName;
  }

  public ScalingGroupForDescribeScalingGroupsOutput serverGroupAttributes(List<ServerGroupAttributeForDescribeScalingGroupsOutput> serverGroupAttributes) {
    this.serverGroupAttributes = serverGroupAttributes;
    return this;
  }

  public ScalingGroupForDescribeScalingGroupsOutput addServerGroupAttributesItem(ServerGroupAttributeForDescribeScalingGroupsOutput serverGroupAttributesItem) {
    if (this.serverGroupAttributes == null) {
      this.serverGroupAttributes = new ArrayList<ServerGroupAttributeForDescribeScalingGroupsOutput>();
    }
    this.serverGroupAttributes.add(serverGroupAttributesItem);
    return this;
  }

   /**
   * Get serverGroupAttributes
   * @return serverGroupAttributes
  **/
  @Valid
  @Schema(description = "")
  public List<ServerGroupAttributeForDescribeScalingGroupsOutput> getServerGroupAttributes() {
    return serverGroupAttributes;
  }

  public void setServerGroupAttributes(List<ServerGroupAttributeForDescribeScalingGroupsOutput> serverGroupAttributes) {
    this.serverGroupAttributes = serverGroupAttributes;
  }

  public ScalingGroupForDescribeScalingGroupsOutput subnetIds(List<String> subnetIds) {
    this.subnetIds = subnetIds;
    return this;
  }

  public ScalingGroupForDescribeScalingGroupsOutput addSubnetIdsItem(String subnetIdsItem) {
    if (this.subnetIds == null) {
      this.subnetIds = new ArrayList<String>();
    }
    this.subnetIds.add(subnetIdsItem);
    return this;
  }

   /**
   * Get subnetIds
   * @return subnetIds
  **/
  @Schema(description = "")
  public List<String> getSubnetIds() {
    return subnetIds;
  }

  public void setSubnetIds(List<String> subnetIds) {
    this.subnetIds = subnetIds;
  }

  public ScalingGroupForDescribeScalingGroupsOutput totalInstanceCount(Integer totalInstanceCount) {
    this.totalInstanceCount = totalInstanceCount;
    return this;
  }

   /**
   * Get totalInstanceCount
   * @return totalInstanceCount
  **/
  @Schema(description = "")
  public Integer getTotalInstanceCount() {
    return totalInstanceCount;
  }

  public void setTotalInstanceCount(Integer totalInstanceCount) {
    this.totalInstanceCount = totalInstanceCount;
  }

  public ScalingGroupForDescribeScalingGroupsOutput updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @Schema(description = "")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public ScalingGroupForDescribeScalingGroupsOutput vpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

   /**
   * Get vpcId
   * @return vpcId
  **/
  @Schema(description = "")
  public String getVpcId() {
    return vpcId;
  }

  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScalingGroupForDescribeScalingGroupsOutput scalingGroupForDescribeScalingGroupsOutput = (ScalingGroupForDescribeScalingGroupsOutput) o;
    return Objects.equals(this.activeScalingConfigurationId, scalingGroupForDescribeScalingGroupsOutput.activeScalingConfigurationId) &&
        Objects.equals(this.createdAt, scalingGroupForDescribeScalingGroupsOutput.createdAt) &&
        Objects.equals(this.dbInstanceIds, scalingGroupForDescribeScalingGroupsOutput.dbInstanceIds) &&
        Objects.equals(this.defaultCooldown, scalingGroupForDescribeScalingGroupsOutput.defaultCooldown) &&
        Objects.equals(this.desireInstanceNumber, scalingGroupForDescribeScalingGroupsOutput.desireInstanceNumber) &&
        Objects.equals(this.instanceTerminatePolicy, scalingGroupForDescribeScalingGroupsOutput.instanceTerminatePolicy) &&
        Objects.equals(this.lifecycleState, scalingGroupForDescribeScalingGroupsOutput.lifecycleState) &&
        Objects.equals(this.maxInstanceNumber, scalingGroupForDescribeScalingGroupsOutput.maxInstanceNumber) &&
        Objects.equals(this.minInstanceNumber, scalingGroupForDescribeScalingGroupsOutput.minInstanceNumber) &&
        Objects.equals(this.multiAZPolicy, scalingGroupForDescribeScalingGroupsOutput.multiAZPolicy) &&
        Objects.equals(this.scalingGroupId, scalingGroupForDescribeScalingGroupsOutput.scalingGroupId) &&
        Objects.equals(this.scalingGroupName, scalingGroupForDescribeScalingGroupsOutput.scalingGroupName) &&
        Objects.equals(this.serverGroupAttributes, scalingGroupForDescribeScalingGroupsOutput.serverGroupAttributes) &&
        Objects.equals(this.subnetIds, scalingGroupForDescribeScalingGroupsOutput.subnetIds) &&
        Objects.equals(this.totalInstanceCount, scalingGroupForDescribeScalingGroupsOutput.totalInstanceCount) &&
        Objects.equals(this.updatedAt, scalingGroupForDescribeScalingGroupsOutput.updatedAt) &&
        Objects.equals(this.vpcId, scalingGroupForDescribeScalingGroupsOutput.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeScalingConfigurationId, createdAt, dbInstanceIds, defaultCooldown, desireInstanceNumber, instanceTerminatePolicy, lifecycleState, maxInstanceNumber, minInstanceNumber, multiAZPolicy, scalingGroupId, scalingGroupName, serverGroupAttributes, subnetIds, totalInstanceCount, updatedAt, vpcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScalingGroupForDescribeScalingGroupsOutput {\n");
    
    sb.append("    activeScalingConfigurationId: ").append(toIndentedString(activeScalingConfigurationId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    dbInstanceIds: ").append(toIndentedString(dbInstanceIds)).append("\n");
    sb.append("    defaultCooldown: ").append(toIndentedString(defaultCooldown)).append("\n");
    sb.append("    desireInstanceNumber: ").append(toIndentedString(desireInstanceNumber)).append("\n");
    sb.append("    instanceTerminatePolicy: ").append(toIndentedString(instanceTerminatePolicy)).append("\n");
    sb.append("    lifecycleState: ").append(toIndentedString(lifecycleState)).append("\n");
    sb.append("    maxInstanceNumber: ").append(toIndentedString(maxInstanceNumber)).append("\n");
    sb.append("    minInstanceNumber: ").append(toIndentedString(minInstanceNumber)).append("\n");
    sb.append("    multiAZPolicy: ").append(toIndentedString(multiAZPolicy)).append("\n");
    sb.append("    scalingGroupId: ").append(toIndentedString(scalingGroupId)).append("\n");
    sb.append("    scalingGroupName: ").append(toIndentedString(scalingGroupName)).append("\n");
    sb.append("    serverGroupAttributes: ").append(toIndentedString(serverGroupAttributes)).append("\n");
    sb.append("    subnetIds: ").append(toIndentedString(subnetIds)).append("\n");
    sb.append("    totalInstanceCount: ").append(toIndentedString(totalInstanceCount)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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
