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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * SlowQueryForDescribeSlowLogsOutput
 */


public class SlowQueryForDescribeSlowLogsOutput {
  @SerializedName("DBName")
  private String dbName = null;

  @SerializedName("ExecutionStartTime")
  private String executionStartTime = null;

  @SerializedName("HostAddress")
  private String hostAddress = null;

  @SerializedName("LockTimes")
  private Long lockTimes = null;

  @SerializedName("ParseRowCounts")
  private Long parseRowCounts = null;

  @SerializedName("QueryText")
  private String queryText = null;

  @SerializedName("QueryTimes")
  private Long queryTimes = null;

  @SerializedName("QueryType")
  private String queryType = null;

  @SerializedName("ReturnRowCounts")
  private Long returnRowCounts = null;

  @SerializedName("UserName")
  private String userName = null;

  public SlowQueryForDescribeSlowLogsOutput dbName(String dbName) {
    this.dbName = dbName;
    return this;
  }

   /**
   * Get dbName
   * @return dbName
  **/
  @Schema(description = "")
  public String getDbName() {
    return dbName;
  }

  public void setDbName(String dbName) {
    this.dbName = dbName;
  }

  public SlowQueryForDescribeSlowLogsOutput executionStartTime(String executionStartTime) {
    this.executionStartTime = executionStartTime;
    return this;
  }

   /**
   * Get executionStartTime
   * @return executionStartTime
  **/
  @Schema(description = "")
  public String getExecutionStartTime() {
    return executionStartTime;
  }

  public void setExecutionStartTime(String executionStartTime) {
    this.executionStartTime = executionStartTime;
  }

  public SlowQueryForDescribeSlowLogsOutput hostAddress(String hostAddress) {
    this.hostAddress = hostAddress;
    return this;
  }

   /**
   * Get hostAddress
   * @return hostAddress
  **/
  @Schema(description = "")
  public String getHostAddress() {
    return hostAddress;
  }

  public void setHostAddress(String hostAddress) {
    this.hostAddress = hostAddress;
  }

  public SlowQueryForDescribeSlowLogsOutput lockTimes(Long lockTimes) {
    this.lockTimes = lockTimes;
    return this;
  }

   /**
   * Get lockTimes
   * @return lockTimes
  **/
  @Schema(description = "")
  public Long getLockTimes() {
    return lockTimes;
  }

  public void setLockTimes(Long lockTimes) {
    this.lockTimes = lockTimes;
  }

  public SlowQueryForDescribeSlowLogsOutput parseRowCounts(Long parseRowCounts) {
    this.parseRowCounts = parseRowCounts;
    return this;
  }

   /**
   * Get parseRowCounts
   * @return parseRowCounts
  **/
  @Schema(description = "")
  public Long getParseRowCounts() {
    return parseRowCounts;
  }

  public void setParseRowCounts(Long parseRowCounts) {
    this.parseRowCounts = parseRowCounts;
  }

  public SlowQueryForDescribeSlowLogsOutput queryText(String queryText) {
    this.queryText = queryText;
    return this;
  }

   /**
   * Get queryText
   * @return queryText
  **/
  @Schema(description = "")
  public String getQueryText() {
    return queryText;
  }

  public void setQueryText(String queryText) {
    this.queryText = queryText;
  }

  public SlowQueryForDescribeSlowLogsOutput queryTimes(Long queryTimes) {
    this.queryTimes = queryTimes;
    return this;
  }

   /**
   * Get queryTimes
   * @return queryTimes
  **/
  @Schema(description = "")
  public Long getQueryTimes() {
    return queryTimes;
  }

  public void setQueryTimes(Long queryTimes) {
    this.queryTimes = queryTimes;
  }

  public SlowQueryForDescribeSlowLogsOutput queryType(String queryType) {
    this.queryType = queryType;
    return this;
  }

   /**
   * Get queryType
   * @return queryType
  **/
  @Schema(description = "")
  public String getQueryType() {
    return queryType;
  }

  public void setQueryType(String queryType) {
    this.queryType = queryType;
  }

  public SlowQueryForDescribeSlowLogsOutput returnRowCounts(Long returnRowCounts) {
    this.returnRowCounts = returnRowCounts;
    return this;
  }

   /**
   * Get returnRowCounts
   * @return returnRowCounts
  **/
  @Schema(description = "")
  public Long getReturnRowCounts() {
    return returnRowCounts;
  }

  public void setReturnRowCounts(Long returnRowCounts) {
    this.returnRowCounts = returnRowCounts;
  }

  public SlowQueryForDescribeSlowLogsOutput userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @Schema(description = "")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SlowQueryForDescribeSlowLogsOutput slowQueryForDescribeSlowLogsOutput = (SlowQueryForDescribeSlowLogsOutput) o;
    return Objects.equals(this.dbName, slowQueryForDescribeSlowLogsOutput.dbName) &&
        Objects.equals(this.executionStartTime, slowQueryForDescribeSlowLogsOutput.executionStartTime) &&
        Objects.equals(this.hostAddress, slowQueryForDescribeSlowLogsOutput.hostAddress) &&
        Objects.equals(this.lockTimes, slowQueryForDescribeSlowLogsOutput.lockTimes) &&
        Objects.equals(this.parseRowCounts, slowQueryForDescribeSlowLogsOutput.parseRowCounts) &&
        Objects.equals(this.queryText, slowQueryForDescribeSlowLogsOutput.queryText) &&
        Objects.equals(this.queryTimes, slowQueryForDescribeSlowLogsOutput.queryTimes) &&
        Objects.equals(this.queryType, slowQueryForDescribeSlowLogsOutput.queryType) &&
        Objects.equals(this.returnRowCounts, slowQueryForDescribeSlowLogsOutput.returnRowCounts) &&
        Objects.equals(this.userName, slowQueryForDescribeSlowLogsOutput.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbName, executionStartTime, hostAddress, lockTimes, parseRowCounts, queryText, queryTimes, queryType, returnRowCounts, userName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SlowQueryForDescribeSlowLogsOutput {\n");
    
    sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
    sb.append("    executionStartTime: ").append(toIndentedString(executionStartTime)).append("\n");
    sb.append("    hostAddress: ").append(toIndentedString(hostAddress)).append("\n");
    sb.append("    lockTimes: ").append(toIndentedString(lockTimes)).append("\n");
    sb.append("    parseRowCounts: ").append(toIndentedString(parseRowCounts)).append("\n");
    sb.append("    queryText: ").append(toIndentedString(queryText)).append("\n");
    sb.append("    queryTimes: ").append(toIndentedString(queryTimes)).append("\n");
    sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
    sb.append("    returnRowCounts: ").append(toIndentedString(returnRowCounts)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
