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
import com.volcengine.rdsmysqlv2.model.ParameterForDescribeDBInstanceParametersOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeDBInstanceParametersResponse
 */


public class DescribeDBInstanceParametersResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("DBEngine")
  private String dbEngine = null;

  @SerializedName("DBEngineVersion")
  private String dbEngineVersion = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("ParameterCount")
  private Integer parameterCount = null;

  @SerializedName("Parameters")
  private List<ParameterForDescribeDBInstanceParametersOutput> parameters = null;

  public DescribeDBInstanceParametersResponse dbEngine(String dbEngine) {
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

  public DescribeDBInstanceParametersResponse dbEngineVersion(String dbEngineVersion) {
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

  public DescribeDBInstanceParametersResponse instanceId(String instanceId) {
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

  public DescribeDBInstanceParametersResponse parameterCount(Integer parameterCount) {
    this.parameterCount = parameterCount;
    return this;
  }

   /**
   * Get parameterCount
   * @return parameterCount
  **/
  @Schema(description = "")
  public Integer getParameterCount() {
    return parameterCount;
  }

  public void setParameterCount(Integer parameterCount) {
    this.parameterCount = parameterCount;
  }

  public DescribeDBInstanceParametersResponse parameters(List<ParameterForDescribeDBInstanceParametersOutput> parameters) {
    this.parameters = parameters;
    return this;
  }

  public DescribeDBInstanceParametersResponse addParametersItem(ParameterForDescribeDBInstanceParametersOutput parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<ParameterForDescribeDBInstanceParametersOutput>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @Valid
  @Schema(description = "")
  public List<ParameterForDescribeDBInstanceParametersOutput> getParameters() {
    return parameters;
  }

  public void setParameters(List<ParameterForDescribeDBInstanceParametersOutput> parameters) {
    this.parameters = parameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeDBInstanceParametersResponse describeDBInstanceParametersResponse = (DescribeDBInstanceParametersResponse) o;
    return Objects.equals(this.dbEngine, describeDBInstanceParametersResponse.dbEngine) &&
        Objects.equals(this.dbEngineVersion, describeDBInstanceParametersResponse.dbEngineVersion) &&
        Objects.equals(this.instanceId, describeDBInstanceParametersResponse.instanceId) &&
        Objects.equals(this.parameterCount, describeDBInstanceParametersResponse.parameterCount) &&
        Objects.equals(this.parameters, describeDBInstanceParametersResponse.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbEngine, dbEngineVersion, instanceId, parameterCount, parameters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDBInstanceParametersResponse {\n");
    
    sb.append("    dbEngine: ").append(toIndentedString(dbEngine)).append("\n");
    sb.append("    dbEngineVersion: ").append(toIndentedString(dbEngineVersion)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    parameterCount: ").append(toIndentedString(parameterCount)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
