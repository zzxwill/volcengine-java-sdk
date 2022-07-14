/*
 * rds_mysql
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmysql.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.rdsmysql.model.InstanceSpecForDescribeDBInstanceOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * BasicInfoForDescribeDBInstanceOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-14T18:23:11.413715+08:00[Asia/Shanghai]")
public class BasicInfoForDescribeDBInstanceOutput {
  @SerializedName("ChargeStatus")
  private String chargeStatus = null;

  @SerializedName("ChargeType")
  private String chargeType = null;

  @SerializedName("CreateTime")
  private String createTime = null;

  @SerializedName("DBEngine")
  private String dbEngine = null;

  @SerializedName("DBEngineVersion")
  private String dbEngineVersion = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("InstanceName")
  private String instanceName = null;

  @SerializedName("InstanceSpec")
  private InstanceSpecForDescribeDBInstanceOutput instanceSpec = null;

  @SerializedName("InstanceStatus")
  private String instanceStatus = null;

  @SerializedName("InstanceType")
  private String instanceType = null;

  @SerializedName("ReadOnlyInstanceIds")
  private List<String> readOnlyInstanceIds = null;

  @SerializedName("Region")
  private String region = null;

  @SerializedName("StorageSpaceGB")
  private Integer storageSpaceGB = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  @SerializedName("VpcID")
  private String vpcID = null;

  @SerializedName("Zone")
  private String zone = null;

  public BasicInfoForDescribeDBInstanceOutput chargeStatus(String chargeStatus) {
    this.chargeStatus = chargeStatus;
    return this;
  }

   /**
   * Get chargeStatus
   * @return chargeStatus
  **/
  @Schema(description = "")
  public String getChargeStatus() {
    return chargeStatus;
  }

  public void setChargeStatus(String chargeStatus) {
    this.chargeStatus = chargeStatus;
  }

  public BasicInfoForDescribeDBInstanceOutput chargeType(String chargeType) {
    this.chargeType = chargeType;
    return this;
  }

   /**
   * Get chargeType
   * @return chargeType
  **/
  @Schema(description = "")
  public String getChargeType() {
    return chargeType;
  }

  public void setChargeType(String chargeType) {
    this.chargeType = chargeType;
  }

  public BasicInfoForDescribeDBInstanceOutput createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @Schema(description = "")
  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public BasicInfoForDescribeDBInstanceOutput dbEngine(String dbEngine) {
    this.dbEngine = dbEngine;
    return this;
  }

   /**
   * Get dbEngine
   * @return dbEngine
  **/
  @Schema(description = "")
  public String getDbEngine() {
    return dbEngine;
  }

  public void setDbEngine(String dbEngine) {
    this.dbEngine = dbEngine;
  }

  public BasicInfoForDescribeDBInstanceOutput dbEngineVersion(String dbEngineVersion) {
    this.dbEngineVersion = dbEngineVersion;
    return this;
  }

   /**
   * Get dbEngineVersion
   * @return dbEngineVersion
  **/
  @Schema(description = "")
  public String getDbEngineVersion() {
    return dbEngineVersion;
  }

  public void setDbEngineVersion(String dbEngineVersion) {
    this.dbEngineVersion = dbEngineVersion;
  }

  public BasicInfoForDescribeDBInstanceOutput instanceId(String instanceId) {
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

  public BasicInfoForDescribeDBInstanceOutput instanceName(String instanceName) {
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

  public BasicInfoForDescribeDBInstanceOutput instanceSpec(InstanceSpecForDescribeDBInstanceOutput instanceSpec) {
    this.instanceSpec = instanceSpec;
    return this;
  }

   /**
   * Get instanceSpec
   * @return instanceSpec
  **/
  @Valid
  @Schema(description = "")
  public InstanceSpecForDescribeDBInstanceOutput getInstanceSpec() {
    return instanceSpec;
  }

  public void setInstanceSpec(InstanceSpecForDescribeDBInstanceOutput instanceSpec) {
    this.instanceSpec = instanceSpec;
  }

  public BasicInfoForDescribeDBInstanceOutput instanceStatus(String instanceStatus) {
    this.instanceStatus = instanceStatus;
    return this;
  }

   /**
   * Get instanceStatus
   * @return instanceStatus
  **/
  @Schema(description = "")
  public String getInstanceStatus() {
    return instanceStatus;
  }

  public void setInstanceStatus(String instanceStatus) {
    this.instanceStatus = instanceStatus;
  }

  public BasicInfoForDescribeDBInstanceOutput instanceType(String instanceType) {
    this.instanceType = instanceType;
    return this;
  }

   /**
   * Get instanceType
   * @return instanceType
  **/
  @Schema(description = "")
  public String getInstanceType() {
    return instanceType;
  }

  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
  }

  public BasicInfoForDescribeDBInstanceOutput readOnlyInstanceIds(List<String> readOnlyInstanceIds) {
    this.readOnlyInstanceIds = readOnlyInstanceIds;
    return this;
  }

  public BasicInfoForDescribeDBInstanceOutput addReadOnlyInstanceIdsItem(String readOnlyInstanceIdsItem) {
    if (this.readOnlyInstanceIds == null) {
      this.readOnlyInstanceIds = new ArrayList<String>();
    }
    this.readOnlyInstanceIds.add(readOnlyInstanceIdsItem);
    return this;
  }

   /**
   * Get readOnlyInstanceIds
   * @return readOnlyInstanceIds
  **/
  @Schema(description = "")
  public List<String> getReadOnlyInstanceIds() {
    return readOnlyInstanceIds;
  }

  public void setReadOnlyInstanceIds(List<String> readOnlyInstanceIds) {
    this.readOnlyInstanceIds = readOnlyInstanceIds;
  }

  public BasicInfoForDescribeDBInstanceOutput region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @Schema(description = "")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public BasicInfoForDescribeDBInstanceOutput storageSpaceGB(Integer storageSpaceGB) {
    this.storageSpaceGB = storageSpaceGB;
    return this;
  }

   /**
   * Get storageSpaceGB
   * @return storageSpaceGB
  **/
  @Schema(description = "")
  public Integer getStorageSpaceGB() {
    return storageSpaceGB;
  }

  public void setStorageSpaceGB(Integer storageSpaceGB) {
    this.storageSpaceGB = storageSpaceGB;
  }

  public BasicInfoForDescribeDBInstanceOutput updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Get updateTime
   * @return updateTime
  **/
  @Schema(description = "")
  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }

  public BasicInfoForDescribeDBInstanceOutput vpcID(String vpcID) {
    this.vpcID = vpcID;
    return this;
  }

   /**
   * Get vpcID
   * @return vpcID
  **/
  @Schema(description = "")
  public String getVpcID() {
    return vpcID;
  }

  public void setVpcID(String vpcID) {
    this.vpcID = vpcID;
  }

  public BasicInfoForDescribeDBInstanceOutput zone(String zone) {
    this.zone = zone;
    return this;
  }

   /**
   * Get zone
   * @return zone
  **/
  @Schema(description = "")
  public String getZone() {
    return zone;
  }

  public void setZone(String zone) {
    this.zone = zone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasicInfoForDescribeDBInstanceOutput basicInfoForDescribeDBInstanceOutput = (BasicInfoForDescribeDBInstanceOutput) o;
    return Objects.equals(this.chargeStatus, basicInfoForDescribeDBInstanceOutput.chargeStatus) &&
        Objects.equals(this.chargeType, basicInfoForDescribeDBInstanceOutput.chargeType) &&
        Objects.equals(this.createTime, basicInfoForDescribeDBInstanceOutput.createTime) &&
        Objects.equals(this.dbEngine, basicInfoForDescribeDBInstanceOutput.dbEngine) &&
        Objects.equals(this.dbEngineVersion, basicInfoForDescribeDBInstanceOutput.dbEngineVersion) &&
        Objects.equals(this.instanceId, basicInfoForDescribeDBInstanceOutput.instanceId) &&
        Objects.equals(this.instanceName, basicInfoForDescribeDBInstanceOutput.instanceName) &&
        Objects.equals(this.instanceSpec, basicInfoForDescribeDBInstanceOutput.instanceSpec) &&
        Objects.equals(this.instanceStatus, basicInfoForDescribeDBInstanceOutput.instanceStatus) &&
        Objects.equals(this.instanceType, basicInfoForDescribeDBInstanceOutput.instanceType) &&
        Objects.equals(this.readOnlyInstanceIds, basicInfoForDescribeDBInstanceOutput.readOnlyInstanceIds) &&
        Objects.equals(this.region, basicInfoForDescribeDBInstanceOutput.region) &&
        Objects.equals(this.storageSpaceGB, basicInfoForDescribeDBInstanceOutput.storageSpaceGB) &&
        Objects.equals(this.updateTime, basicInfoForDescribeDBInstanceOutput.updateTime) &&
        Objects.equals(this.vpcID, basicInfoForDescribeDBInstanceOutput.vpcID) &&
        Objects.equals(this.zone, basicInfoForDescribeDBInstanceOutput.zone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeStatus, chargeType, createTime, dbEngine, dbEngineVersion, instanceId, instanceName, instanceSpec, instanceStatus, instanceType, readOnlyInstanceIds, region, storageSpaceGB, updateTime, vpcID, zone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasicInfoForDescribeDBInstanceOutput {\n");
    
    sb.append("    chargeStatus: ").append(toIndentedString(chargeStatus)).append("\n");
    sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    dbEngine: ").append(toIndentedString(dbEngine)).append("\n");
    sb.append("    dbEngineVersion: ").append(toIndentedString(dbEngineVersion)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    instanceSpec: ").append(toIndentedString(instanceSpec)).append("\n");
    sb.append("    instanceStatus: ").append(toIndentedString(instanceStatus)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    readOnlyInstanceIds: ").append(toIndentedString(readOnlyInstanceIds)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    storageSpaceGB: ").append(toIndentedString(storageSpaceGB)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    vpcID: ").append(toIndentedString(vpcID)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
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
