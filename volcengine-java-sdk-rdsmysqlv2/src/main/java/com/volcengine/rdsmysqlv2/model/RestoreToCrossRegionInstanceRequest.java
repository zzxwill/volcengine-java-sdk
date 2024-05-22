/*
 * rds_mysql_v2
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmysqlv2.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.rdsmysqlv2.model.ChargeInfoForRestoreToCrossRegionInstanceInput;
import com.volcengine.rdsmysqlv2.model.InstanceTagForRestoreToCrossRegionInstanceInput;
import com.volcengine.rdsmysqlv2.model.NodeInfoForRestoreToCrossRegionInstanceInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RestoreToCrossRegionInstanceRequest
 */


public class RestoreToCrossRegionInstanceRequest {
  @SerializedName("AllowListIds")
  private List<String> allowListIds = null;

  @SerializedName("BackupId")
  private String backupId = null;

  @SerializedName("ChargeInfo")
  private ChargeInfoForRestoreToCrossRegionInstanceInput chargeInfo = null;

  @SerializedName("DBParamGroupId")
  private String dbParamGroupId = null;

  @SerializedName("DstRegionId")
  private String dstRegionId = null;

  @SerializedName("InstanceName")
  private String instanceName = null;

  @SerializedName("InstanceTags")
  private List<InstanceTagForRestoreToCrossRegionInstanceInput> instanceTags = null;

  @SerializedName("NodeInfo")
  private List<NodeInfoForRestoreToCrossRegionInstanceInput> nodeInfo = null;

  @SerializedName("Port")
  private Integer port = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("RestoreTime")
  private String restoreTime = null;

  @SerializedName("SrcRegionId")
  private String srcRegionId = null;

  @SerializedName("SrcRegionInstanceId")
  private String srcRegionInstanceId = null;

  @SerializedName("StorageSpace")
  private Integer storageSpace = null;

  @SerializedName("StorageType")
  private String storageType = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  public RestoreToCrossRegionInstanceRequest allowListIds(List<String> allowListIds) {
    this.allowListIds = allowListIds;
    return this;
  }

  public RestoreToCrossRegionInstanceRequest addAllowListIdsItem(String allowListIdsItem) {
    if (this.allowListIds == null) {
      this.allowListIds = new ArrayList<String>();
    }
    this.allowListIds.add(allowListIdsItem);
    return this;
  }

   /**
   * Get allowListIds
   * @return allowListIds
  **/
  @Schema(description = "")
  public List<String> getAllowListIds() {
    return allowListIds;
  }

  public void setAllowListIds(List<String> allowListIds) {
    this.allowListIds = allowListIds;
  }

  public RestoreToCrossRegionInstanceRequest backupId(String backupId) {
    this.backupId = backupId;
    return this;
  }

   /**
   * Get backupId
   * @return backupId
  **/
  @Schema(description = "")
  public String getBackupId() {
    return backupId;
  }

  public void setBackupId(String backupId) {
    this.backupId = backupId;
  }

  public RestoreToCrossRegionInstanceRequest chargeInfo(ChargeInfoForRestoreToCrossRegionInstanceInput chargeInfo) {
    this.chargeInfo = chargeInfo;
    return this;
  }

   /**
   * Get chargeInfo
   * @return chargeInfo
  **/
  @Valid
  @Schema(description = "")
  public ChargeInfoForRestoreToCrossRegionInstanceInput getChargeInfo() {
    return chargeInfo;
  }

  public void setChargeInfo(ChargeInfoForRestoreToCrossRegionInstanceInput chargeInfo) {
    this.chargeInfo = chargeInfo;
  }

  public RestoreToCrossRegionInstanceRequest dbParamGroupId(String dbParamGroupId) {
    this.dbParamGroupId = dbParamGroupId;
    return this;
  }

   /**
   * Get dbParamGroupId
   * @return dbParamGroupId
  **/
  @Schema(description = "")
  public String getDbParamGroupId() {
    return dbParamGroupId;
  }

  public void setDbParamGroupId(String dbParamGroupId) {
    this.dbParamGroupId = dbParamGroupId;
  }

  public RestoreToCrossRegionInstanceRequest dstRegionId(String dstRegionId) {
    this.dstRegionId = dstRegionId;
    return this;
  }

   /**
   * Get dstRegionId
   * @return dstRegionId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getDstRegionId() {
    return dstRegionId;
  }

  public void setDstRegionId(String dstRegionId) {
    this.dstRegionId = dstRegionId;
  }

  public RestoreToCrossRegionInstanceRequest instanceName(String instanceName) {
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

  public RestoreToCrossRegionInstanceRequest instanceTags(List<InstanceTagForRestoreToCrossRegionInstanceInput> instanceTags) {
    this.instanceTags = instanceTags;
    return this;
  }

  public RestoreToCrossRegionInstanceRequest addInstanceTagsItem(InstanceTagForRestoreToCrossRegionInstanceInput instanceTagsItem) {
    if (this.instanceTags == null) {
      this.instanceTags = new ArrayList<InstanceTagForRestoreToCrossRegionInstanceInput>();
    }
    this.instanceTags.add(instanceTagsItem);
    return this;
  }

   /**
   * Get instanceTags
   * @return instanceTags
  **/
  @Valid
  @Schema(description = "")
  public List<InstanceTagForRestoreToCrossRegionInstanceInput> getInstanceTags() {
    return instanceTags;
  }

  public void setInstanceTags(List<InstanceTagForRestoreToCrossRegionInstanceInput> instanceTags) {
    this.instanceTags = instanceTags;
  }

  public RestoreToCrossRegionInstanceRequest nodeInfo(List<NodeInfoForRestoreToCrossRegionInstanceInput> nodeInfo) {
    this.nodeInfo = nodeInfo;
    return this;
  }

  public RestoreToCrossRegionInstanceRequest addNodeInfoItem(NodeInfoForRestoreToCrossRegionInstanceInput nodeInfoItem) {
    if (this.nodeInfo == null) {
      this.nodeInfo = new ArrayList<NodeInfoForRestoreToCrossRegionInstanceInput>();
    }
    this.nodeInfo.add(nodeInfoItem);
    return this;
  }

   /**
   * Get nodeInfo
   * @return nodeInfo
  **/
  @Valid
  @Schema(description = "")
  public List<NodeInfoForRestoreToCrossRegionInstanceInput> getNodeInfo() {
    return nodeInfo;
  }

  public void setNodeInfo(List<NodeInfoForRestoreToCrossRegionInstanceInput> nodeInfo) {
    this.nodeInfo = nodeInfo;
  }

  public RestoreToCrossRegionInstanceRequest port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @Schema(description = "")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public RestoreToCrossRegionInstanceRequest projectName(String projectName) {
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

  public RestoreToCrossRegionInstanceRequest restoreTime(String restoreTime) {
    this.restoreTime = restoreTime;
    return this;
  }

   /**
   * Get restoreTime
   * @return restoreTime
  **/
  @Schema(description = "")
  public String getRestoreTime() {
    return restoreTime;
  }

  public void setRestoreTime(String restoreTime) {
    this.restoreTime = restoreTime;
  }

  public RestoreToCrossRegionInstanceRequest srcRegionId(String srcRegionId) {
    this.srcRegionId = srcRegionId;
    return this;
  }

   /**
   * Get srcRegionId
   * @return srcRegionId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getSrcRegionId() {
    return srcRegionId;
  }

  public void setSrcRegionId(String srcRegionId) {
    this.srcRegionId = srcRegionId;
  }

  public RestoreToCrossRegionInstanceRequest srcRegionInstanceId(String srcRegionInstanceId) {
    this.srcRegionInstanceId = srcRegionInstanceId;
    return this;
  }

   /**
   * Get srcRegionInstanceId
   * @return srcRegionInstanceId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getSrcRegionInstanceId() {
    return srcRegionInstanceId;
  }

  public void setSrcRegionInstanceId(String srcRegionInstanceId) {
    this.srcRegionInstanceId = srcRegionInstanceId;
  }

  public RestoreToCrossRegionInstanceRequest storageSpace(Integer storageSpace) {
    this.storageSpace = storageSpace;
    return this;
  }

   /**
   * Get storageSpace
   * @return storageSpace
  **/
  @Schema(description = "")
  public Integer getStorageSpace() {
    return storageSpace;
  }

  public void setStorageSpace(Integer storageSpace) {
    this.storageSpace = storageSpace;
  }

  public RestoreToCrossRegionInstanceRequest storageType(String storageType) {
    this.storageType = storageType;
    return this;
  }

   /**
   * Get storageType
   * @return storageType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getStorageType() {
    return storageType;
  }

  public void setStorageType(String storageType) {
    this.storageType = storageType;
  }

  public RestoreToCrossRegionInstanceRequest subnetId(String subnetId) {
    this.subnetId = subnetId;
    return this;
  }

   /**
   * Get subnetId
   * @return subnetId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getSubnetId() {
    return subnetId;
  }

  public void setSubnetId(String subnetId) {
    this.subnetId = subnetId;
  }

  public RestoreToCrossRegionInstanceRequest vpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

   /**
   * Get vpcId
   * @return vpcId
  **/
  @NotNull
  @Schema(required = true, description = "")
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
    RestoreToCrossRegionInstanceRequest restoreToCrossRegionInstanceRequest = (RestoreToCrossRegionInstanceRequest) o;
    return Objects.equals(this.allowListIds, restoreToCrossRegionInstanceRequest.allowListIds) &&
        Objects.equals(this.backupId, restoreToCrossRegionInstanceRequest.backupId) &&
        Objects.equals(this.chargeInfo, restoreToCrossRegionInstanceRequest.chargeInfo) &&
        Objects.equals(this.dbParamGroupId, restoreToCrossRegionInstanceRequest.dbParamGroupId) &&
        Objects.equals(this.dstRegionId, restoreToCrossRegionInstanceRequest.dstRegionId) &&
        Objects.equals(this.instanceName, restoreToCrossRegionInstanceRequest.instanceName) &&
        Objects.equals(this.instanceTags, restoreToCrossRegionInstanceRequest.instanceTags) &&
        Objects.equals(this.nodeInfo, restoreToCrossRegionInstanceRequest.nodeInfo) &&
        Objects.equals(this.port, restoreToCrossRegionInstanceRequest.port) &&
        Objects.equals(this.projectName, restoreToCrossRegionInstanceRequest.projectName) &&
        Objects.equals(this.restoreTime, restoreToCrossRegionInstanceRequest.restoreTime) &&
        Objects.equals(this.srcRegionId, restoreToCrossRegionInstanceRequest.srcRegionId) &&
        Objects.equals(this.srcRegionInstanceId, restoreToCrossRegionInstanceRequest.srcRegionInstanceId) &&
        Objects.equals(this.storageSpace, restoreToCrossRegionInstanceRequest.storageSpace) &&
        Objects.equals(this.storageType, restoreToCrossRegionInstanceRequest.storageType) &&
        Objects.equals(this.subnetId, restoreToCrossRegionInstanceRequest.subnetId) &&
        Objects.equals(this.vpcId, restoreToCrossRegionInstanceRequest.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowListIds, backupId, chargeInfo, dbParamGroupId, dstRegionId, instanceName, instanceTags, nodeInfo, port, projectName, restoreTime, srcRegionId, srcRegionInstanceId, storageSpace, storageType, subnetId, vpcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestoreToCrossRegionInstanceRequest {\n");
    
    sb.append("    allowListIds: ").append(toIndentedString(allowListIds)).append("\n");
    sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
    sb.append("    chargeInfo: ").append(toIndentedString(chargeInfo)).append("\n");
    sb.append("    dbParamGroupId: ").append(toIndentedString(dbParamGroupId)).append("\n");
    sb.append("    dstRegionId: ").append(toIndentedString(dstRegionId)).append("\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    instanceTags: ").append(toIndentedString(instanceTags)).append("\n");
    sb.append("    nodeInfo: ").append(toIndentedString(nodeInfo)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    restoreTime: ").append(toIndentedString(restoreTime)).append("\n");
    sb.append("    srcRegionId: ").append(toIndentedString(srcRegionId)).append("\n");
    sb.append("    srcRegionInstanceId: ").append(toIndentedString(srcRegionInstanceId)).append("\n");
    sb.append("    storageSpace: ").append(toIndentedString(storageSpace)).append("\n");
    sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
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
