/*
 * clb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.clb.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * MasterZoneForDescribeZonesOutput
 */



public class MasterZoneForDescribeZonesOutput {
  @SerializedName("SlaveZones")
  private List<String> slaveZones = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public MasterZoneForDescribeZonesOutput slaveZones(List<String> slaveZones) {
    this.slaveZones = slaveZones;
    return this;
  }

  public MasterZoneForDescribeZonesOutput addSlaveZonesItem(String slaveZonesItem) {
    if (this.slaveZones == null) {
      this.slaveZones = new ArrayList<String>();
    }
    this.slaveZones.add(slaveZonesItem);
    return this;
  }

   /**
   * Get slaveZones
   * @return slaveZones
  **/
  @Schema(description = "")
  public List<String> getSlaveZones() {
    return slaveZones;
  }

  public void setSlaveZones(List<String> slaveZones) {
    this.slaveZones = slaveZones;
  }

  public MasterZoneForDescribeZonesOutput zoneId(String zoneId) {
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
    MasterZoneForDescribeZonesOutput masterZoneForDescribeZonesOutput = (MasterZoneForDescribeZonesOutput) o;
    return Objects.equals(this.slaveZones, masterZoneForDescribeZonesOutput.slaveZones) &&
        Objects.equals(this.zoneId, masterZoneForDescribeZonesOutput.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slaveZones, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MasterZoneForDescribeZonesOutput {\n");
    
    sb.append("    slaveZones: ").append(toIndentedString(slaveZones)).append("\n");
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
