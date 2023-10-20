/*
 * vepfs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vepfs.model;

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
 * CapacityInfoForDescribeFileSystemStatisticsOutput
 */


public class CapacityInfoForDescribeFileSystemStatisticsOutput {
  @SerializedName("TotalTiB")
  private Integer totalTiB = null;

  @SerializedName("UsedGiB")
  private Integer usedGiB = null;

  public CapacityInfoForDescribeFileSystemStatisticsOutput totalTiB(Integer totalTiB) {
    this.totalTiB = totalTiB;
    return this;
  }

   /**
   * Get totalTiB
   * @return totalTiB
  **/
  @Schema(description = "")
  public Integer getTotalTiB() {
    return totalTiB;
  }

  public void setTotalTiB(Integer totalTiB) {
    this.totalTiB = totalTiB;
  }

  public CapacityInfoForDescribeFileSystemStatisticsOutput usedGiB(Integer usedGiB) {
    this.usedGiB = usedGiB;
    return this;
  }

   /**
   * Get usedGiB
   * @return usedGiB
  **/
  @Schema(description = "")
  public Integer getUsedGiB() {
    return usedGiB;
  }

  public void setUsedGiB(Integer usedGiB) {
    this.usedGiB = usedGiB;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapacityInfoForDescribeFileSystemStatisticsOutput capacityInfoForDescribeFileSystemStatisticsOutput = (CapacityInfoForDescribeFileSystemStatisticsOutput) o;
    return Objects.equals(this.totalTiB, capacityInfoForDescribeFileSystemStatisticsOutput.totalTiB) &&
        Objects.equals(this.usedGiB, capacityInfoForDescribeFileSystemStatisticsOutput.usedGiB);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalTiB, usedGiB);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapacityInfoForDescribeFileSystemStatisticsOutput {\n");
    
    sb.append("    totalTiB: ").append(toIndentedString(totalTiB)).append("\n");
    sb.append("    usedGiB: ").append(toIndentedString(usedGiB)).append("\n");
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