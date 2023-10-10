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
import com.volcengine.ecs.model.TagFilterForDescribeInstancesInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeInstancesRequest
 */


public class DescribeInstancesRequest {
  @SerializedName("DedicatedHostClusterId")
  private String dedicatedHostClusterId = null;

  @SerializedName("DedicatedHostId")
  private String dedicatedHostId = null;

  @SerializedName("DeploymentSetIds")
  private List<String> deploymentSetIds = null;

  @SerializedName("HpcClusterId")
  private String hpcClusterId = null;

  @SerializedName("InstanceChargeType")
  private String instanceChargeType = null;

  @SerializedName("InstanceIds")
  private List<String> instanceIds = null;

  @SerializedName("InstanceName")
  private String instanceName = null;

  @SerializedName("InstanceTypeFamilies")
  private List<String> instanceTypeFamilies = null;

  @SerializedName("InstanceTypeIds")
  private List<String> instanceTypeIds = null;

  @SerializedName("InstanceTypes")
  private List<String> instanceTypes = null;

  @SerializedName("KeyPairName")
  private String keyPairName = null;

  @SerializedName("MaxResults")
  private Integer maxResults = null;

  @SerializedName("NextToken")
  private String nextToken = null;

  @SerializedName("PrimaryIpAddress")
  private String primaryIpAddress = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("TagFilters")
  private List<TagFilterForDescribeInstancesInput> tagFilters = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public DescribeInstancesRequest dedicatedHostClusterId(String dedicatedHostClusterId) {
    this.dedicatedHostClusterId = dedicatedHostClusterId;
    return this;
  }

   /**
   * Get dedicatedHostClusterId
   * @return dedicatedHostClusterId
  **/
  @Schema(description = "")
  public String getDedicatedHostClusterId() {
    return dedicatedHostClusterId;
  }

  public void setDedicatedHostClusterId(String dedicatedHostClusterId) {
    this.dedicatedHostClusterId = dedicatedHostClusterId;
  }

  public DescribeInstancesRequest dedicatedHostId(String dedicatedHostId) {
    this.dedicatedHostId = dedicatedHostId;
    return this;
  }

   /**
   * Get dedicatedHostId
   * @return dedicatedHostId
  **/
  @Schema(description = "")
  public String getDedicatedHostId() {
    return dedicatedHostId;
  }

  public void setDedicatedHostId(String dedicatedHostId) {
    this.dedicatedHostId = dedicatedHostId;
  }

  public DescribeInstancesRequest deploymentSetIds(List<String> deploymentSetIds) {
    this.deploymentSetIds = deploymentSetIds;
    return this;
  }

  public DescribeInstancesRequest addDeploymentSetIdsItem(String deploymentSetIdsItem) {
    if (this.deploymentSetIds == null) {
      this.deploymentSetIds = new ArrayList<String>();
    }
    this.deploymentSetIds.add(deploymentSetIdsItem);
    return this;
  }

   /**
   * Get deploymentSetIds
   * @return deploymentSetIds
  **/
  @Schema(description = "")
  public List<String> getDeploymentSetIds() {
    return deploymentSetIds;
  }

  public void setDeploymentSetIds(List<String> deploymentSetIds) {
    this.deploymentSetIds = deploymentSetIds;
  }

  public DescribeInstancesRequest hpcClusterId(String hpcClusterId) {
    this.hpcClusterId = hpcClusterId;
    return this;
  }

   /**
   * Get hpcClusterId
   * @return hpcClusterId
  **/
  @Schema(description = "")
  public String getHpcClusterId() {
    return hpcClusterId;
  }

  public void setHpcClusterId(String hpcClusterId) {
    this.hpcClusterId = hpcClusterId;
  }

  public DescribeInstancesRequest instanceChargeType(String instanceChargeType) {
    this.instanceChargeType = instanceChargeType;
    return this;
  }

   /**
   * Get instanceChargeType
   * @return instanceChargeType
  **/
  @Schema(description = "")
  public String getInstanceChargeType() {
    return instanceChargeType;
  }

  public void setInstanceChargeType(String instanceChargeType) {
    this.instanceChargeType = instanceChargeType;
  }

  public DescribeInstancesRequest instanceIds(List<String> instanceIds) {
    this.instanceIds = instanceIds;
    return this;
  }

  public DescribeInstancesRequest addInstanceIdsItem(String instanceIdsItem) {
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

  public DescribeInstancesRequest instanceName(String instanceName) {
    this.instanceName = instanceName;
    return this;
  }

   /**
   * Get instanceName
   * @return instanceName
  **/
  @Schema(description = "")
  public String getInstanceName() {
    return instanceName;
  }

  public void setInstanceName(String instanceName) {
    this.instanceName = instanceName;
  }

  public DescribeInstancesRequest instanceTypeFamilies(List<String> instanceTypeFamilies) {
    this.instanceTypeFamilies = instanceTypeFamilies;
    return this;
  }

  public DescribeInstancesRequest addInstanceTypeFamiliesItem(String instanceTypeFamiliesItem) {
    if (this.instanceTypeFamilies == null) {
      this.instanceTypeFamilies = new ArrayList<String>();
    }
    this.instanceTypeFamilies.add(instanceTypeFamiliesItem);
    return this;
  }

   /**
   * Get instanceTypeFamilies
   * @return instanceTypeFamilies
  **/
  @Schema(description = "")
  public List<String> getInstanceTypeFamilies() {
    return instanceTypeFamilies;
  }

  public void setInstanceTypeFamilies(List<String> instanceTypeFamilies) {
    this.instanceTypeFamilies = instanceTypeFamilies;
  }

  public DescribeInstancesRequest instanceTypeIds(List<String> instanceTypeIds) {
    this.instanceTypeIds = instanceTypeIds;
    return this;
  }

  public DescribeInstancesRequest addInstanceTypeIdsItem(String instanceTypeIdsItem) {
    if (this.instanceTypeIds == null) {
      this.instanceTypeIds = new ArrayList<String>();
    }
    this.instanceTypeIds.add(instanceTypeIdsItem);
    return this;
  }

   /**
   * Get instanceTypeIds
   * @return instanceTypeIds
  **/
  @Schema(description = "")
  public List<String> getInstanceTypeIds() {
    return instanceTypeIds;
  }

  public void setInstanceTypeIds(List<String> instanceTypeIds) {
    this.instanceTypeIds = instanceTypeIds;
  }

  public DescribeInstancesRequest instanceTypes(List<String> instanceTypes) {
    this.instanceTypes = instanceTypes;
    return this;
  }

  public DescribeInstancesRequest addInstanceTypesItem(String instanceTypesItem) {
    if (this.instanceTypes == null) {
      this.instanceTypes = new ArrayList<String>();
    }
    this.instanceTypes.add(instanceTypesItem);
    return this;
  }

   /**
   * Get instanceTypes
   * @return instanceTypes
  **/
  @Schema(description = "")
  public List<String> getInstanceTypes() {
    return instanceTypes;
  }

  public void setInstanceTypes(List<String> instanceTypes) {
    this.instanceTypes = instanceTypes;
  }

  public DescribeInstancesRequest keyPairName(String keyPairName) {
    this.keyPairName = keyPairName;
    return this;
  }

   /**
   * Get keyPairName
   * @return keyPairName
  **/
  @Schema(description = "")
  public String getKeyPairName() {
    return keyPairName;
  }

  public void setKeyPairName(String keyPairName) {
    this.keyPairName = keyPairName;
  }

  public DescribeInstancesRequest maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

   /**
   * Get maxResults
   * @return maxResults
  **/
  @Schema(description = "")
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  public DescribeInstancesRequest nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

   /**
   * Get nextToken
   * @return nextToken
  **/
  @Schema(description = "")
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }

  public DescribeInstancesRequest primaryIpAddress(String primaryIpAddress) {
    this.primaryIpAddress = primaryIpAddress;
    return this;
  }

   /**
   * Get primaryIpAddress
   * @return primaryIpAddress
  **/
  @Schema(description = "")
  public String getPrimaryIpAddress() {
    return primaryIpAddress;
  }

  public void setPrimaryIpAddress(String primaryIpAddress) {
    this.primaryIpAddress = primaryIpAddress;
  }

  public DescribeInstancesRequest projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @Schema(description = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public DescribeInstancesRequest status(String status) {
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

  public DescribeInstancesRequest tagFilters(List<TagFilterForDescribeInstancesInput> tagFilters) {
    this.tagFilters = tagFilters;
    return this;
  }

  public DescribeInstancesRequest addTagFiltersItem(TagFilterForDescribeInstancesInput tagFiltersItem) {
    if (this.tagFilters == null) {
      this.tagFilters = new ArrayList<TagFilterForDescribeInstancesInput>();
    }
    this.tagFilters.add(tagFiltersItem);
    return this;
  }

   /**
   * Get tagFilters
   * @return tagFilters
  **/
  @Valid
  @Schema(description = "")
  public List<TagFilterForDescribeInstancesInput> getTagFilters() {
    return tagFilters;
  }

  public void setTagFilters(List<TagFilterForDescribeInstancesInput> tagFilters) {
    this.tagFilters = tagFilters;
  }

  public DescribeInstancesRequest vpcId(String vpcId) {
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

  public DescribeInstancesRequest zoneId(String zoneId) {
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
    DescribeInstancesRequest describeInstancesRequest = (DescribeInstancesRequest) o;
    return Objects.equals(this.dedicatedHostClusterId, describeInstancesRequest.dedicatedHostClusterId) &&
        Objects.equals(this.dedicatedHostId, describeInstancesRequest.dedicatedHostId) &&
        Objects.equals(this.deploymentSetIds, describeInstancesRequest.deploymentSetIds) &&
        Objects.equals(this.hpcClusterId, describeInstancesRequest.hpcClusterId) &&
        Objects.equals(this.instanceChargeType, describeInstancesRequest.instanceChargeType) &&
        Objects.equals(this.instanceIds, describeInstancesRequest.instanceIds) &&
        Objects.equals(this.instanceName, describeInstancesRequest.instanceName) &&
        Objects.equals(this.instanceTypeFamilies, describeInstancesRequest.instanceTypeFamilies) &&
        Objects.equals(this.instanceTypeIds, describeInstancesRequest.instanceTypeIds) &&
        Objects.equals(this.instanceTypes, describeInstancesRequest.instanceTypes) &&
        Objects.equals(this.keyPairName, describeInstancesRequest.keyPairName) &&
        Objects.equals(this.maxResults, describeInstancesRequest.maxResults) &&
        Objects.equals(this.nextToken, describeInstancesRequest.nextToken) &&
        Objects.equals(this.primaryIpAddress, describeInstancesRequest.primaryIpAddress) &&
        Objects.equals(this.projectName, describeInstancesRequest.projectName) &&
        Objects.equals(this.status, describeInstancesRequest.status) &&
        Objects.equals(this.tagFilters, describeInstancesRequest.tagFilters) &&
        Objects.equals(this.vpcId, describeInstancesRequest.vpcId) &&
        Objects.equals(this.zoneId, describeInstancesRequest.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dedicatedHostClusterId, dedicatedHostId, deploymentSetIds, hpcClusterId, instanceChargeType, instanceIds, instanceName, instanceTypeFamilies, instanceTypeIds, instanceTypes, keyPairName, maxResults, nextToken, primaryIpAddress, projectName, status, tagFilters, vpcId, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeInstancesRequest {\n");
    
    sb.append("    dedicatedHostClusterId: ").append(toIndentedString(dedicatedHostClusterId)).append("\n");
    sb.append("    dedicatedHostId: ").append(toIndentedString(dedicatedHostId)).append("\n");
    sb.append("    deploymentSetIds: ").append(toIndentedString(deploymentSetIds)).append("\n");
    sb.append("    hpcClusterId: ").append(toIndentedString(hpcClusterId)).append("\n");
    sb.append("    instanceChargeType: ").append(toIndentedString(instanceChargeType)).append("\n");
    sb.append("    instanceIds: ").append(toIndentedString(instanceIds)).append("\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    instanceTypeFamilies: ").append(toIndentedString(instanceTypeFamilies)).append("\n");
    sb.append("    instanceTypeIds: ").append(toIndentedString(instanceTypeIds)).append("\n");
    sb.append("    instanceTypes: ").append(toIndentedString(instanceTypes)).append("\n");
    sb.append("    keyPairName: ").append(toIndentedString(keyPairName)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    primaryIpAddress: ").append(toIndentedString(primaryIpAddress)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tagFilters: ").append(toIndentedString(tagFilters)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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
