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
 * DescribeLifecycleHooksRequest
 */



public class DescribeLifecycleHooksRequest {
  @SerializedName("LifecycleHookIds")
  private List<String> lifecycleHookIds = null;

  @SerializedName("LifecycleHookName")
  private String lifecycleHookName = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("ScalingGroupId")
  private String scalingGroupId = null;

  public DescribeLifecycleHooksRequest lifecycleHookIds(List<String> lifecycleHookIds) {
    this.lifecycleHookIds = lifecycleHookIds;
    return this;
  }

  public DescribeLifecycleHooksRequest addLifecycleHookIdsItem(String lifecycleHookIdsItem) {
    if (this.lifecycleHookIds == null) {
      this.lifecycleHookIds = new ArrayList<String>();
    }
    this.lifecycleHookIds.add(lifecycleHookIdsItem);
    return this;
  }

   /**
   * Get lifecycleHookIds
   * @return lifecycleHookIds
  **/
  @Schema(description = "")
  public List<String> getLifecycleHookIds() {
    return lifecycleHookIds;
  }

  public void setLifecycleHookIds(List<String> lifecycleHookIds) {
    this.lifecycleHookIds = lifecycleHookIds;
  }

  public DescribeLifecycleHooksRequest lifecycleHookName(String lifecycleHookName) {
    this.lifecycleHookName = lifecycleHookName;
    return this;
  }

   /**
   * Get lifecycleHookName
   * @return lifecycleHookName
  **/
  @Schema(description = "")
  public String getLifecycleHookName() {
    return lifecycleHookName;
  }

  public void setLifecycleHookName(String lifecycleHookName) {
    this.lifecycleHookName = lifecycleHookName;
  }

  public DescribeLifecycleHooksRequest pageNumber(Integer pageNumber) {
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

  public DescribeLifecycleHooksRequest pageSize(Integer pageSize) {
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

  public DescribeLifecycleHooksRequest scalingGroupId(String scalingGroupId) {
    this.scalingGroupId = scalingGroupId;
    return this;
  }

   /**
   * Get scalingGroupId
   * @return scalingGroupId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getScalingGroupId() {
    return scalingGroupId;
  }

  public void setScalingGroupId(String scalingGroupId) {
    this.scalingGroupId = scalingGroupId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeLifecycleHooksRequest describeLifecycleHooksRequest = (DescribeLifecycleHooksRequest) o;
    return Objects.equals(this.lifecycleHookIds, describeLifecycleHooksRequest.lifecycleHookIds) &&
        Objects.equals(this.lifecycleHookName, describeLifecycleHooksRequest.lifecycleHookName) &&
        Objects.equals(this.pageNumber, describeLifecycleHooksRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeLifecycleHooksRequest.pageSize) &&
        Objects.equals(this.scalingGroupId, describeLifecycleHooksRequest.scalingGroupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lifecycleHookIds, lifecycleHookName, pageNumber, pageSize, scalingGroupId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeLifecycleHooksRequest {\n");
    
    sb.append("    lifecycleHookIds: ").append(toIndentedString(lifecycleHookIds)).append("\n");
    sb.append("    lifecycleHookName: ").append(toIndentedString(lifecycleHookName)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    scalingGroupId: ").append(toIndentedString(scalingGroupId)).append("\n");
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
