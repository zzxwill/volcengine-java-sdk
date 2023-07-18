/*
 * vpc
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vpc.model;

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
 * ModifyBandwidthPackageAttributesRequest
 */



public class ModifyBandwidthPackageAttributesRequest {
  @SerializedName("BandwidthPackageId")
  private String bandwidthPackageId = null;

  @SerializedName("BandwidthPackageName")
  private String bandwidthPackageName = null;

  @SerializedName("Description")
  private String description = null;

  public ModifyBandwidthPackageAttributesRequest bandwidthPackageId(String bandwidthPackageId) {
    this.bandwidthPackageId = bandwidthPackageId;
    return this;
  }

   /**
   * Get bandwidthPackageId
   * @return bandwidthPackageId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getBandwidthPackageId() {
    return bandwidthPackageId;
  }

  public void setBandwidthPackageId(String bandwidthPackageId) {
    this.bandwidthPackageId = bandwidthPackageId;
  }

  public ModifyBandwidthPackageAttributesRequest bandwidthPackageName(String bandwidthPackageName) {
    this.bandwidthPackageName = bandwidthPackageName;
    return this;
  }

   /**
   * Get bandwidthPackageName
   * @return bandwidthPackageName
  **/
 @Size(min=1,max=128)  @Schema(description = "")
  public String getBandwidthPackageName() {
    return bandwidthPackageName;
  }

  public void setBandwidthPackageName(String bandwidthPackageName) {
    this.bandwidthPackageName = bandwidthPackageName;
  }

  public ModifyBandwidthPackageAttributesRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
 @Size(min=1,max=255)  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyBandwidthPackageAttributesRequest modifyBandwidthPackageAttributesRequest = (ModifyBandwidthPackageAttributesRequest) o;
    return Objects.equals(this.bandwidthPackageId, modifyBandwidthPackageAttributesRequest.bandwidthPackageId) &&
        Objects.equals(this.bandwidthPackageName, modifyBandwidthPackageAttributesRequest.bandwidthPackageName) &&
        Objects.equals(this.description, modifyBandwidthPackageAttributesRequest.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bandwidthPackageId, bandwidthPackageName, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyBandwidthPackageAttributesRequest {\n");
    
    sb.append("    bandwidthPackageId: ").append(toIndentedString(bandwidthPackageId)).append("\n");
    sb.append("    bandwidthPackageName: ").append(toIndentedString(bandwidthPackageName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
