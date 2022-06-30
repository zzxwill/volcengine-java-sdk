/*
 * auto_scaling
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.autoscaling.model;

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
 * DescribeScalingGroupsRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-30T20:17:46.205154+08:00[Asia/Shanghai]")
public class DescribeScalingGroupsRequest {
  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("ScalingGroupIds")
  private List<String> scalingGroupIds = null;

  @SerializedName("ScalingGroupNames")
  private List<String> scalingGroupNames = null;

  public DescribeScalingGroupsRequest pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  @Schema(description = "")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public DescribeScalingGroupsRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @Schema(description = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public DescribeScalingGroupsRequest scalingGroupIds(List<String> scalingGroupIds) {
    this.scalingGroupIds = scalingGroupIds;
    return this;
  }

  public DescribeScalingGroupsRequest addScalingGroupIdsItem(String scalingGroupIdsItem) {
    if (this.scalingGroupIds == null) {
      this.scalingGroupIds = new ArrayList<String>();
    }
    this.scalingGroupIds.add(scalingGroupIdsItem);
    return this;
  }

   /**
   * Get scalingGroupIds
   * @return scalingGroupIds
  **/
  @Schema(description = "")
  public List<String> getScalingGroupIds() {
    return scalingGroupIds;
  }

  public void setScalingGroupIds(List<String> scalingGroupIds) {
    this.scalingGroupIds = scalingGroupIds;
  }

  public DescribeScalingGroupsRequest scalingGroupNames(List<String> scalingGroupNames) {
    this.scalingGroupNames = scalingGroupNames;
    return this;
  }

  public DescribeScalingGroupsRequest addScalingGroupNamesItem(String scalingGroupNamesItem) {
    if (this.scalingGroupNames == null) {
      this.scalingGroupNames = new ArrayList<String>();
    }
    this.scalingGroupNames.add(scalingGroupNamesItem);
    return this;
  }

   /**
   * Get scalingGroupNames
   * @return scalingGroupNames
  **/
  @Schema(description = "")
  public List<String> getScalingGroupNames() {
    return scalingGroupNames;
  }

  public void setScalingGroupNames(List<String> scalingGroupNames) {
    this.scalingGroupNames = scalingGroupNames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeScalingGroupsRequest describeScalingGroupsRequest = (DescribeScalingGroupsRequest) o;
    return Objects.equals(this.pageNumber, describeScalingGroupsRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeScalingGroupsRequest.pageSize) &&
        Objects.equals(this.scalingGroupIds, describeScalingGroupsRequest.scalingGroupIds) &&
        Objects.equals(this.scalingGroupNames, describeScalingGroupsRequest.scalingGroupNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, scalingGroupIds, scalingGroupNames);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeScalingGroupsRequest {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    scalingGroupIds: ").append(toIndentedString(scalingGroupIds)).append("\n");
    sb.append("    scalingGroupNames: ").append(toIndentedString(scalingGroupNames)).append("\n");
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
