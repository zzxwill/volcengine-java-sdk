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
 * AssociateCenForDescribeVpcsOutput
 */


public class AssociateCenForDescribeVpcsOutput {
  @SerializedName("CenId")
  private String cenId = null;

  @SerializedName("CenOwnerId")
  private String cenOwnerId = null;

  @SerializedName("CenStatus")
  private String cenStatus = null;

  public AssociateCenForDescribeVpcsOutput cenId(String cenId) {
    this.cenId = cenId;
    return this;
  }

   /**
   * Get cenId
   * @return cenId
  **/
  @Schema(description = "")
  public String getCenId() {
    return cenId;
  }

  public void setCenId(String cenId) {
    this.cenId = cenId;
  }

  public AssociateCenForDescribeVpcsOutput cenOwnerId(String cenOwnerId) {
    this.cenOwnerId = cenOwnerId;
    return this;
  }

   /**
   * Get cenOwnerId
   * @return cenOwnerId
  **/
  @Schema(description = "")
  public String getCenOwnerId() {
    return cenOwnerId;
  }

  public void setCenOwnerId(String cenOwnerId) {
    this.cenOwnerId = cenOwnerId;
  }

  public AssociateCenForDescribeVpcsOutput cenStatus(String cenStatus) {
    this.cenStatus = cenStatus;
    return this;
  }

   /**
   * Get cenStatus
   * @return cenStatus
  **/
  @Schema(description = "")
  public String getCenStatus() {
    return cenStatus;
  }

  public void setCenStatus(String cenStatus) {
    this.cenStatus = cenStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssociateCenForDescribeVpcsOutput associateCenForDescribeVpcsOutput = (AssociateCenForDescribeVpcsOutput) o;
    return Objects.equals(this.cenId, associateCenForDescribeVpcsOutput.cenId) &&
        Objects.equals(this.cenOwnerId, associateCenForDescribeVpcsOutput.cenOwnerId) &&
        Objects.equals(this.cenStatus, associateCenForDescribeVpcsOutput.cenStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cenId, cenOwnerId, cenStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssociateCenForDescribeVpcsOutput {\n");
    
    sb.append("    cenId: ").append(toIndentedString(cenId)).append("\n");
    sb.append("    cenOwnerId: ").append(toIndentedString(cenOwnerId)).append("\n");
    sb.append("    cenStatus: ").append(toIndentedString(cenStatus)).append("\n");
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
