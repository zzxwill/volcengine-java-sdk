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
 * ParameterChangeLogForDescribeDBInstanceParametersLogOutput
 */


public class ParameterChangeLogForDescribeDBInstanceParametersLogOutput {
  @SerializedName("ModifyTime")
  private String modifyTime = null;

  @SerializedName("NewParameterValue")
  private String newParameterValue = null;

  @SerializedName("OldParameterValue")
  private String oldParameterValue = null;

  @SerializedName("ParameterName")
  private String parameterName = null;

  @SerializedName("Status")
  private String status = null;

  public ParameterChangeLogForDescribeDBInstanceParametersLogOutput modifyTime(String modifyTime) {
    this.modifyTime = modifyTime;
    return this;
  }

   /**
   * Get modifyTime
   * @return modifyTime
  **/
  @Schema(description = "")
  public String getModifyTime() {
    return modifyTime;
  }

  public void setModifyTime(String modifyTime) {
    this.modifyTime = modifyTime;
  }

  public ParameterChangeLogForDescribeDBInstanceParametersLogOutput newParameterValue(String newParameterValue) {
    this.newParameterValue = newParameterValue;
    return this;
  }

   /**
   * Get newParameterValue
   * @return newParameterValue
  **/
  @Schema(description = "")
  public String getNewParameterValue() {
    return newParameterValue;
  }

  public void setNewParameterValue(String newParameterValue) {
    this.newParameterValue = newParameterValue;
  }

  public ParameterChangeLogForDescribeDBInstanceParametersLogOutput oldParameterValue(String oldParameterValue) {
    this.oldParameterValue = oldParameterValue;
    return this;
  }

   /**
   * Get oldParameterValue
   * @return oldParameterValue
  **/
  @Schema(description = "")
  public String getOldParameterValue() {
    return oldParameterValue;
  }

  public void setOldParameterValue(String oldParameterValue) {
    this.oldParameterValue = oldParameterValue;
  }

  public ParameterChangeLogForDescribeDBInstanceParametersLogOutput parameterName(String parameterName) {
    this.parameterName = parameterName;
    return this;
  }

   /**
   * Get parameterName
   * @return parameterName
  **/
  @Schema(description = "")
  public String getParameterName() {
    return parameterName;
  }

  public void setParameterName(String parameterName) {
    this.parameterName = parameterName;
  }

  public ParameterChangeLogForDescribeDBInstanceParametersLogOutput status(String status) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParameterChangeLogForDescribeDBInstanceParametersLogOutput parameterChangeLogForDescribeDBInstanceParametersLogOutput = (ParameterChangeLogForDescribeDBInstanceParametersLogOutput) o;
    return Objects.equals(this.modifyTime, parameterChangeLogForDescribeDBInstanceParametersLogOutput.modifyTime) &&
        Objects.equals(this.newParameterValue, parameterChangeLogForDescribeDBInstanceParametersLogOutput.newParameterValue) &&
        Objects.equals(this.oldParameterValue, parameterChangeLogForDescribeDBInstanceParametersLogOutput.oldParameterValue) &&
        Objects.equals(this.parameterName, parameterChangeLogForDescribeDBInstanceParametersLogOutput.parameterName) &&
        Objects.equals(this.status, parameterChangeLogForDescribeDBInstanceParametersLogOutput.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modifyTime, newParameterValue, oldParameterValue, parameterName, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParameterChangeLogForDescribeDBInstanceParametersLogOutput {\n");
    
    sb.append("    modifyTime: ").append(toIndentedString(modifyTime)).append("\n");
    sb.append("    newParameterValue: ").append(toIndentedString(newParameterValue)).append("\n");
    sb.append("    oldParameterValue: ").append(toIndentedString(oldParameterValue)).append("\n");
    sb.append("    parameterName: ").append(toIndentedString(parameterName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
