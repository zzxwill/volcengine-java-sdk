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
import com.volcengine.rdsmysqlv2.model.DBTableInfoForDescribeBackupsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * BackupsInfoForDescribeBackupsOutput
 */


public class BackupsInfoForDescribeBackupsOutput {
  @SerializedName("BackupEndTime")
  private String backupEndTime = null;

  @SerializedName("BackupFileName")
  private String backupFileName = null;

  @SerializedName("BackupFileSize")
  private Long backupFileSize = null;

  @SerializedName("BackupId")
  private String backupId = null;

  @SerializedName("BackupMethod")
  private String backupMethod = null;

  @SerializedName("BackupStartTime")
  private String backupStartTime = null;

  @SerializedName("BackupStatus")
  private String backupStatus = null;

  @SerializedName("BackupType")
  private String backupType = null;

  @SerializedName("ConsistentTime")
  private String consistentTime = null;

  @SerializedName("CreateType")
  private String createType = null;

  @SerializedName("DBTableInfos")
  private List<DBTableInfoForDescribeBackupsOutput> dbTableInfos = null;

  public BackupsInfoForDescribeBackupsOutput backupEndTime(String backupEndTime) {
    this.backupEndTime = backupEndTime;
    return this;
  }

   /**
   * Get backupEndTime
   * @return backupEndTime
  **/
  @Schema(description = "")
  public String getBackupEndTime() {
    return backupEndTime;
  }

  public void setBackupEndTime(String backupEndTime) {
    this.backupEndTime = backupEndTime;
  }

  public BackupsInfoForDescribeBackupsOutput backupFileName(String backupFileName) {
    this.backupFileName = backupFileName;
    return this;
  }

   /**
   * Get backupFileName
   * @return backupFileName
  **/
  @Schema(description = "")
  public String getBackupFileName() {
    return backupFileName;
  }

  public void setBackupFileName(String backupFileName) {
    this.backupFileName = backupFileName;
  }

  public BackupsInfoForDescribeBackupsOutput backupFileSize(Long backupFileSize) {
    this.backupFileSize = backupFileSize;
    return this;
  }

   /**
   * Get backupFileSize
   * @return backupFileSize
  **/
  @Schema(description = "")
  public Long getBackupFileSize() {
    return backupFileSize;
  }

  public void setBackupFileSize(Long backupFileSize) {
    this.backupFileSize = backupFileSize;
  }

  public BackupsInfoForDescribeBackupsOutput backupId(String backupId) {
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

  public BackupsInfoForDescribeBackupsOutput backupMethod(String backupMethod) {
    this.backupMethod = backupMethod;
    return this;
  }

   /**
   * Get backupMethod
   * @return backupMethod
  **/
  @Schema(description = "")
  public String getBackupMethod() {
    return backupMethod;
  }

  public void setBackupMethod(String backupMethod) {
    this.backupMethod = backupMethod;
  }

  public BackupsInfoForDescribeBackupsOutput backupStartTime(String backupStartTime) {
    this.backupStartTime = backupStartTime;
    return this;
  }

   /**
   * Get backupStartTime
   * @return backupStartTime
  **/
  @Schema(description = "")
  public String getBackupStartTime() {
    return backupStartTime;
  }

  public void setBackupStartTime(String backupStartTime) {
    this.backupStartTime = backupStartTime;
  }

  public BackupsInfoForDescribeBackupsOutput backupStatus(String backupStatus) {
    this.backupStatus = backupStatus;
    return this;
  }

   /**
   * Get backupStatus
   * @return backupStatus
  **/
  @Schema(description = "")
  public String getBackupStatus() {
    return backupStatus;
  }

  public void setBackupStatus(String backupStatus) {
    this.backupStatus = backupStatus;
  }

  public BackupsInfoForDescribeBackupsOutput backupType(String backupType) {
    this.backupType = backupType;
    return this;
  }

   /**
   * Get backupType
   * @return backupType
  **/
  @Schema(description = "")
  public String getBackupType() {
    return backupType;
  }

  public void setBackupType(String backupType) {
    this.backupType = backupType;
  }

  public BackupsInfoForDescribeBackupsOutput consistentTime(String consistentTime) {
    this.consistentTime = consistentTime;
    return this;
  }

   /**
   * Get consistentTime
   * @return consistentTime
  **/
  @Schema(description = "")
  public String getConsistentTime() {
    return consistentTime;
  }

  public void setConsistentTime(String consistentTime) {
    this.consistentTime = consistentTime;
  }

  public BackupsInfoForDescribeBackupsOutput createType(String createType) {
    this.createType = createType;
    return this;
  }

   /**
   * Get createType
   * @return createType
  **/
  @Schema(description = "")
  public String getCreateType() {
    return createType;
  }

  public void setCreateType(String createType) {
    this.createType = createType;
  }

  public BackupsInfoForDescribeBackupsOutput dbTableInfos(List<DBTableInfoForDescribeBackupsOutput> dbTableInfos) {
    this.dbTableInfos = dbTableInfos;
    return this;
  }

  public BackupsInfoForDescribeBackupsOutput addDbTableInfosItem(DBTableInfoForDescribeBackupsOutput dbTableInfosItem) {
    if (this.dbTableInfos == null) {
      this.dbTableInfos = new ArrayList<DBTableInfoForDescribeBackupsOutput>();
    }
    this.dbTableInfos.add(dbTableInfosItem);
    return this;
  }

   /**
   * Get dbTableInfos
   * @return dbTableInfos
  **/
  @Valid
  @Schema(description = "")
  public List<DBTableInfoForDescribeBackupsOutput> getDbTableInfos() {
    return dbTableInfos;
  }

  public void setDbTableInfos(List<DBTableInfoForDescribeBackupsOutput> dbTableInfos) {
    this.dbTableInfos = dbTableInfos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackupsInfoForDescribeBackupsOutput backupsInfoForDescribeBackupsOutput = (BackupsInfoForDescribeBackupsOutput) o;
    return Objects.equals(this.backupEndTime, backupsInfoForDescribeBackupsOutput.backupEndTime) &&
        Objects.equals(this.backupFileName, backupsInfoForDescribeBackupsOutput.backupFileName) &&
        Objects.equals(this.backupFileSize, backupsInfoForDescribeBackupsOutput.backupFileSize) &&
        Objects.equals(this.backupId, backupsInfoForDescribeBackupsOutput.backupId) &&
        Objects.equals(this.backupMethod, backupsInfoForDescribeBackupsOutput.backupMethod) &&
        Objects.equals(this.backupStartTime, backupsInfoForDescribeBackupsOutput.backupStartTime) &&
        Objects.equals(this.backupStatus, backupsInfoForDescribeBackupsOutput.backupStatus) &&
        Objects.equals(this.backupType, backupsInfoForDescribeBackupsOutput.backupType) &&
        Objects.equals(this.consistentTime, backupsInfoForDescribeBackupsOutput.consistentTime) &&
        Objects.equals(this.createType, backupsInfoForDescribeBackupsOutput.createType) &&
        Objects.equals(this.dbTableInfos, backupsInfoForDescribeBackupsOutput.dbTableInfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupEndTime, backupFileName, backupFileSize, backupId, backupMethod, backupStartTime, backupStatus, backupType, consistentTime, createType, dbTableInfos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackupsInfoForDescribeBackupsOutput {\n");
    
    sb.append("    backupEndTime: ").append(toIndentedString(backupEndTime)).append("\n");
    sb.append("    backupFileName: ").append(toIndentedString(backupFileName)).append("\n");
    sb.append("    backupFileSize: ").append(toIndentedString(backupFileSize)).append("\n");
    sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
    sb.append("    backupMethod: ").append(toIndentedString(backupMethod)).append("\n");
    sb.append("    backupStartTime: ").append(toIndentedString(backupStartTime)).append("\n");
    sb.append("    backupStatus: ").append(toIndentedString(backupStatus)).append("\n");
    sb.append("    backupType: ").append(toIndentedString(backupType)).append("\n");
    sb.append("    consistentTime: ").append(toIndentedString(consistentTime)).append("\n");
    sb.append("    createType: ").append(toIndentedString(createType)).append("\n");
    sb.append("    dbTableInfos: ").append(toIndentedString(dbTableInfos)).append("\n");
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
