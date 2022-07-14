/*
 * vke
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vke.model;

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
 * NodeStatisticsForListClustersOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-14T18:23:18.459744+08:00[Asia/Shanghai]")
public class NodeStatisticsForListClustersOutput {
  @SerializedName("CreatingCount")
  private Integer creatingCount = null;

  @SerializedName("DeletingCount")
  private Integer deletingCount = null;

  @SerializedName("FailedCount")
  private Integer failedCount = null;

  @SerializedName("RunningCount")
  private Integer runningCount = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  @SerializedName("UpdatingCount")
  private Integer updatingCount = null;

  public NodeStatisticsForListClustersOutput creatingCount(Integer creatingCount) {
    this.creatingCount = creatingCount;
    return this;
  }

   /**
   * Get creatingCount
   * @return creatingCount
  **/
  @Schema(description = "")
  public Integer getCreatingCount() {
    return creatingCount;
  }

  public void setCreatingCount(Integer creatingCount) {
    this.creatingCount = creatingCount;
  }

  public NodeStatisticsForListClustersOutput deletingCount(Integer deletingCount) {
    this.deletingCount = deletingCount;
    return this;
  }

   /**
   * Get deletingCount
   * @return deletingCount
  **/
  @Schema(description = "")
  public Integer getDeletingCount() {
    return deletingCount;
  }

  public void setDeletingCount(Integer deletingCount) {
    this.deletingCount = deletingCount;
  }

  public NodeStatisticsForListClustersOutput failedCount(Integer failedCount) {
    this.failedCount = failedCount;
    return this;
  }

   /**
   * Get failedCount
   * @return failedCount
  **/
  @Schema(description = "")
  public Integer getFailedCount() {
    return failedCount;
  }

  public void setFailedCount(Integer failedCount) {
    this.failedCount = failedCount;
  }

  public NodeStatisticsForListClustersOutput runningCount(Integer runningCount) {
    this.runningCount = runningCount;
    return this;
  }

   /**
   * Get runningCount
   * @return runningCount
  **/
  @Schema(description = "")
  public Integer getRunningCount() {
    return runningCount;
  }

  public void setRunningCount(Integer runningCount) {
    this.runningCount = runningCount;
  }

  public NodeStatisticsForListClustersOutput totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @Schema(description = "")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public NodeStatisticsForListClustersOutput updatingCount(Integer updatingCount) {
    this.updatingCount = updatingCount;
    return this;
  }

   /**
   * Get updatingCount
   * @return updatingCount
  **/
  @Schema(description = "")
  public Integer getUpdatingCount() {
    return updatingCount;
  }

  public void setUpdatingCount(Integer updatingCount) {
    this.updatingCount = updatingCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeStatisticsForListClustersOutput nodeStatisticsForListClustersOutput = (NodeStatisticsForListClustersOutput) o;
    return Objects.equals(this.creatingCount, nodeStatisticsForListClustersOutput.creatingCount) &&
        Objects.equals(this.deletingCount, nodeStatisticsForListClustersOutput.deletingCount) &&
        Objects.equals(this.failedCount, nodeStatisticsForListClustersOutput.failedCount) &&
        Objects.equals(this.runningCount, nodeStatisticsForListClustersOutput.runningCount) &&
        Objects.equals(this.totalCount, nodeStatisticsForListClustersOutput.totalCount) &&
        Objects.equals(this.updatingCount, nodeStatisticsForListClustersOutput.updatingCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creatingCount, deletingCount, failedCount, runningCount, totalCount, updatingCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeStatisticsForListClustersOutput {\n");
    
    sb.append("    creatingCount: ").append(toIndentedString(creatingCount)).append("\n");
    sb.append("    deletingCount: ").append(toIndentedString(deletingCount)).append("\n");
    sb.append("    failedCount: ").append(toIndentedString(failedCount)).append("\n");
    sb.append("    runningCount: ").append(toIndentedString(runningCount)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    updatingCount: ").append(toIndentedString(updatingCount)).append("\n");
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
