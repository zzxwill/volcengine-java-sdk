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
 * ParameterForDescribeDBInstanceParametersOutput
 */


public class ParameterForDescribeDBInstanceParametersOutput {
  @SerializedName("CheckingCode")
  private String checkingCode = null;

  @SerializedName("Expression")
  private String expression = null;

  @SerializedName("ForceRestart")
  private Boolean forceRestart = null;

  @SerializedName("ParameterDefaultValue")
  private String parameterDefaultValue = null;

  @SerializedName("ParameterDescription")
  private String parameterDescription = null;

  @SerializedName("ParameterName")
  private String parameterName = null;

  @SerializedName("ParameterValue")
  private String parameterValue = null;

  public ParameterForDescribeDBInstanceParametersOutput checkingCode(String checkingCode) {
    this.checkingCode = checkingCode;
    return this;
  }

   /**
   * Get checkingCode
   * @return checkingCode
  **/
  @Schema(description = "")
  public String getCheckingCode() {
    return checkingCode;
  }

  public void setCheckingCode(String checkingCode) {
    this.checkingCode = checkingCode;
  }

  public ParameterForDescribeDBInstanceParametersOutput expression(String expression) {
    this.expression = expression;
    return this;
  }

   /**
   * Get expression
   * @return expression
  **/
  @Schema(description = "")
  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }

  public ParameterForDescribeDBInstanceParametersOutput forceRestart(Boolean forceRestart) {
    this.forceRestart = forceRestart;
    return this;
  }

   /**
   * Get forceRestart
   * @return forceRestart
  **/
  @Schema(description = "")
  public Boolean isForceRestart() {
    return forceRestart;
  }

  public void setForceRestart(Boolean forceRestart) {
    this.forceRestart = forceRestart;
  }

  public ParameterForDescribeDBInstanceParametersOutput parameterDefaultValue(String parameterDefaultValue) {
    this.parameterDefaultValue = parameterDefaultValue;
    return this;
  }

   /**
   * Get parameterDefaultValue
   * @return parameterDefaultValue
  **/
  @Schema(description = "")
  public String getParameterDefaultValue() {
    return parameterDefaultValue;
  }

  public void setParameterDefaultValue(String parameterDefaultValue) {
    this.parameterDefaultValue = parameterDefaultValue;
  }

  public ParameterForDescribeDBInstanceParametersOutput parameterDescription(String parameterDescription) {
    this.parameterDescription = parameterDescription;
    return this;
  }

   /**
   * Get parameterDescription
   * @return parameterDescription
  **/
  @Schema(description = "")
  public String getParameterDescription() {
    return parameterDescription;
  }

  public void setParameterDescription(String parameterDescription) {
    this.parameterDescription = parameterDescription;
  }

  public ParameterForDescribeDBInstanceParametersOutput parameterName(String parameterName) {
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

  public ParameterForDescribeDBInstanceParametersOutput parameterValue(String parameterValue) {
    this.parameterValue = parameterValue;
    return this;
  }

   /**
   * Get parameterValue
   * @return parameterValue
  **/
  @Schema(description = "")
  public String getParameterValue() {
    return parameterValue;
  }

  public void setParameterValue(String parameterValue) {
    this.parameterValue = parameterValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParameterForDescribeDBInstanceParametersOutput parameterForDescribeDBInstanceParametersOutput = (ParameterForDescribeDBInstanceParametersOutput) o;
    return Objects.equals(this.checkingCode, parameterForDescribeDBInstanceParametersOutput.checkingCode) &&
        Objects.equals(this.expression, parameterForDescribeDBInstanceParametersOutput.expression) &&
        Objects.equals(this.forceRestart, parameterForDescribeDBInstanceParametersOutput.forceRestart) &&
        Objects.equals(this.parameterDefaultValue, parameterForDescribeDBInstanceParametersOutput.parameterDefaultValue) &&
        Objects.equals(this.parameterDescription, parameterForDescribeDBInstanceParametersOutput.parameterDescription) &&
        Objects.equals(this.parameterName, parameterForDescribeDBInstanceParametersOutput.parameterName) &&
        Objects.equals(this.parameterValue, parameterForDescribeDBInstanceParametersOutput.parameterValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkingCode, expression, forceRestart, parameterDefaultValue, parameterDescription, parameterName, parameterValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParameterForDescribeDBInstanceParametersOutput {\n");
    
    sb.append("    checkingCode: ").append(toIndentedString(checkingCode)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    forceRestart: ").append(toIndentedString(forceRestart)).append("\n");
    sb.append("    parameterDefaultValue: ").append(toIndentedString(parameterDefaultValue)).append("\n");
    sb.append("    parameterDescription: ").append(toIndentedString(parameterDescription)).append("\n");
    sb.append("    parameterName: ").append(toIndentedString(parameterName)).append("\n");
    sb.append("    parameterValue: ").append(toIndentedString(parameterValue)).append("\n");
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
