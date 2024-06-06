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
 * GetScheduledInstanceLatestReleaseAtRequest
 */



public class GetScheduledInstanceLatestReleaseAtRequest {
  @SerializedName("DeliveryType")
  private String deliveryType = null;

  @SerializedName("InstanceTypeId")
  private String instanceTypeId = null;

  @SerializedName("StartDeliveryAt")
  private String startDeliveryAt = null;

  @SerializedName("VolumeType")
  private String volumeType = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public GetScheduledInstanceLatestReleaseAtRequest deliveryType(String deliveryType) {
    this.deliveryType = deliveryType;
    return this;
  }

   /**
   * Get deliveryType
   * @return deliveryType
  **/
  @Schema(description = "")
  public String getDeliveryType() {
    return deliveryType;
  }

  public void setDeliveryType(String deliveryType) {
    this.deliveryType = deliveryType;
  }

  public GetScheduledInstanceLatestReleaseAtRequest instanceTypeId(String instanceTypeId) {
    this.instanceTypeId = instanceTypeId;
    return this;
  }

   /**
   * Get instanceTypeId
   * @return instanceTypeId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getInstanceTypeId() {
    return instanceTypeId;
  }

  public void setInstanceTypeId(String instanceTypeId) {
    this.instanceTypeId = instanceTypeId;
  }

  public GetScheduledInstanceLatestReleaseAtRequest startDeliveryAt(String startDeliveryAt) {
    this.startDeliveryAt = startDeliveryAt;
    return this;
  }

   /**
   * Get startDeliveryAt
   * @return startDeliveryAt
  **/
  @Schema(description = "")
  public String getStartDeliveryAt() {
    return startDeliveryAt;
  }

  public void setStartDeliveryAt(String startDeliveryAt) {
    this.startDeliveryAt = startDeliveryAt;
  }

  public GetScheduledInstanceLatestReleaseAtRequest volumeType(String volumeType) {
    this.volumeType = volumeType;
    return this;
  }

   /**
   * Get volumeType
   * @return volumeType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getVolumeType() {
    return volumeType;
  }

  public void setVolumeType(String volumeType) {
    this.volumeType = volumeType;
  }

  public GetScheduledInstanceLatestReleaseAtRequest zoneId(String zoneId) {
    this.zoneId = zoneId;
    return this;
  }

   /**
   * Get zoneId
   * @return zoneId
  **/
  @NotNull
  @Schema(required = true, description = "")
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
    GetScheduledInstanceLatestReleaseAtRequest getScheduledInstanceLatestReleaseAtRequest = (GetScheduledInstanceLatestReleaseAtRequest) o;
    return Objects.equals(this.deliveryType, getScheduledInstanceLatestReleaseAtRequest.deliveryType) &&
        Objects.equals(this.instanceTypeId, getScheduledInstanceLatestReleaseAtRequest.instanceTypeId) &&
        Objects.equals(this.startDeliveryAt, getScheduledInstanceLatestReleaseAtRequest.startDeliveryAt) &&
        Objects.equals(this.volumeType, getScheduledInstanceLatestReleaseAtRequest.volumeType) &&
        Objects.equals(this.zoneId, getScheduledInstanceLatestReleaseAtRequest.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryType, instanceTypeId, startDeliveryAt, volumeType, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetScheduledInstanceLatestReleaseAtRequest {\n");
    
    sb.append("    deliveryType: ").append(toIndentedString(deliveryType)).append("\n");
    sb.append("    instanceTypeId: ").append(toIndentedString(instanceTypeId)).append("\n");
    sb.append("    startDeliveryAt: ").append(toIndentedString(startDeliveryAt)).append("\n");
    sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
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