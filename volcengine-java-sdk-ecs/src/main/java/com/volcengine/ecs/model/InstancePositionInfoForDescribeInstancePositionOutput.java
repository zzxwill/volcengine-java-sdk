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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * InstancePositionInfoForDescribeInstancePositionOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:32.918937+08:00[Asia/Shanghai]")
public class InstancePositionInfoForDescribeInstancePositionOutput {
  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("PosCode")
  private String posCode = null;

  @SerializedName("RckName")
  private String rckName = null;

  @SerializedName("SwitchName")
  private String switchName = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public InstancePositionInfoForDescribeInstancePositionOutput instanceId(String instanceId) {
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

  public InstancePositionInfoForDescribeInstancePositionOutput posCode(String posCode) {
    this.posCode = posCode;
    return this;
  }

   /**
   * Get posCode
   * @return posCode
  **/
  @Schema(description = "")
  public String getPosCode() {
    return posCode;
  }

  public void setPosCode(String posCode) {
    this.posCode = posCode;
  }

  public InstancePositionInfoForDescribeInstancePositionOutput rckName(String rckName) {
    this.rckName = rckName;
    return this;
  }

   /**
   * Get rckName
   * @return rckName
  **/
  @Schema(description = "")
  public String getRckName() {
    return rckName;
  }

  public void setRckName(String rckName) {
    this.rckName = rckName;
  }

  public InstancePositionInfoForDescribeInstancePositionOutput switchName(String switchName) {
    this.switchName = switchName;
    return this;
  }

   /**
   * Get switchName
   * @return switchName
  **/
  @Schema(description = "")
  public String getSwitchName() {
    return switchName;
  }

  public void setSwitchName(String switchName) {
    this.switchName = switchName;
  }

  public InstancePositionInfoForDescribeInstancePositionOutput vpcId(String vpcId) {
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

  public InstancePositionInfoForDescribeInstancePositionOutput zoneId(String zoneId) {
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
    InstancePositionInfoForDescribeInstancePositionOutput instancePositionInfoForDescribeInstancePositionOutput = (InstancePositionInfoForDescribeInstancePositionOutput) o;
    return Objects.equals(this.instanceId, instancePositionInfoForDescribeInstancePositionOutput.instanceId) &&
        Objects.equals(this.posCode, instancePositionInfoForDescribeInstancePositionOutput.posCode) &&
        Objects.equals(this.rckName, instancePositionInfoForDescribeInstancePositionOutput.rckName) &&
        Objects.equals(this.switchName, instancePositionInfoForDescribeInstancePositionOutput.switchName) &&
        Objects.equals(this.vpcId, instancePositionInfoForDescribeInstancePositionOutput.vpcId) &&
        Objects.equals(this.zoneId, instancePositionInfoForDescribeInstancePositionOutput.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceId, posCode, rckName, switchName, vpcId, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstancePositionInfoForDescribeInstancePositionOutput {\n");
    
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    posCode: ").append(toIndentedString(posCode)).append("\n");
    sb.append("    rckName: ").append(toIndentedString(rckName)).append("\n");
    sb.append("    switchName: ").append(toIndentedString(switchName)).append("\n");
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