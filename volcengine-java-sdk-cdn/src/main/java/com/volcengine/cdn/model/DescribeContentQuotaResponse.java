/*
 * cdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cdn.model;

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
 * DescribeContentQuotaResponse
 */



public class DescribeContentQuotaResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("BlockLimit")
  private Long blockLimit = null;

  @SerializedName("BlockQuota")
  private Long blockQuota = null;

  @SerializedName("BlockRemain")
  private Long blockRemain = null;

  @SerializedName("PreloadLimit")
  private Long preloadLimit = null;

  @SerializedName("PreloadQuota")
  private Long preloadQuota = null;

  @SerializedName("PreloadRemain")
  private Long preloadRemain = null;

  @SerializedName("RefreshDirLimit")
  private Long refreshDirLimit = null;

  @SerializedName("RefreshDirQuota")
  private Long refreshDirQuota = null;

  @SerializedName("RefreshDirRemain")
  private Long refreshDirRemain = null;

  @SerializedName("RefreshQuota")
  private Long refreshQuota = null;

  @SerializedName("RefreshQuotaLimit")
  private Long refreshQuotaLimit = null;

  @SerializedName("RefreshRegexLimit")
  private Long refreshRegexLimit = null;

  @SerializedName("RefreshRegexQuota")
  private Long refreshRegexQuota = null;

  @SerializedName("RefreshRegexRemain")
  private Long refreshRegexRemain = null;

  @SerializedName("RefreshRemain")
  private Long refreshRemain = null;

  @SerializedName("UnblockLimit")
  private Long unblockLimit = null;

  @SerializedName("UnblockQuota")
  private Long unblockQuota = null;

  @SerializedName("UnblockRemain")
  private Long unblockRemain = null;

  public DescribeContentQuotaResponse blockLimit(Long blockLimit) {
    this.blockLimit = blockLimit;
    return this;
  }

   /**
   * Get blockLimit
   * @return blockLimit
  **/
  @Schema(description = "")
  public Long getBlockLimit() {
    return blockLimit;
  }

  public void setBlockLimit(Long blockLimit) {
    this.blockLimit = blockLimit;
  }

  public DescribeContentQuotaResponse blockQuota(Long blockQuota) {
    this.blockQuota = blockQuota;
    return this;
  }

   /**
   * Get blockQuota
   * @return blockQuota
  **/
  @Schema(description = "")
  public Long getBlockQuota() {
    return blockQuota;
  }

  public void setBlockQuota(Long blockQuota) {
    this.blockQuota = blockQuota;
  }

  public DescribeContentQuotaResponse blockRemain(Long blockRemain) {
    this.blockRemain = blockRemain;
    return this;
  }

   /**
   * Get blockRemain
   * @return blockRemain
  **/
  @Schema(description = "")
  public Long getBlockRemain() {
    return blockRemain;
  }

  public void setBlockRemain(Long blockRemain) {
    this.blockRemain = blockRemain;
  }

  public DescribeContentQuotaResponse preloadLimit(Long preloadLimit) {
    this.preloadLimit = preloadLimit;
    return this;
  }

   /**
   * Get preloadLimit
   * @return preloadLimit
  **/
  @Schema(description = "")
  public Long getPreloadLimit() {
    return preloadLimit;
  }

  public void setPreloadLimit(Long preloadLimit) {
    this.preloadLimit = preloadLimit;
  }

  public DescribeContentQuotaResponse preloadQuota(Long preloadQuota) {
    this.preloadQuota = preloadQuota;
    return this;
  }

   /**
   * Get preloadQuota
   * @return preloadQuota
  **/
  @Schema(description = "")
  public Long getPreloadQuota() {
    return preloadQuota;
  }

  public void setPreloadQuota(Long preloadQuota) {
    this.preloadQuota = preloadQuota;
  }

  public DescribeContentQuotaResponse preloadRemain(Long preloadRemain) {
    this.preloadRemain = preloadRemain;
    return this;
  }

   /**
   * Get preloadRemain
   * @return preloadRemain
  **/
  @Schema(description = "")
  public Long getPreloadRemain() {
    return preloadRemain;
  }

  public void setPreloadRemain(Long preloadRemain) {
    this.preloadRemain = preloadRemain;
  }

  public DescribeContentQuotaResponse refreshDirLimit(Long refreshDirLimit) {
    this.refreshDirLimit = refreshDirLimit;
    return this;
  }

   /**
   * Get refreshDirLimit
   * @return refreshDirLimit
  **/
  @Schema(description = "")
  public Long getRefreshDirLimit() {
    return refreshDirLimit;
  }

  public void setRefreshDirLimit(Long refreshDirLimit) {
    this.refreshDirLimit = refreshDirLimit;
  }

  public DescribeContentQuotaResponse refreshDirQuota(Long refreshDirQuota) {
    this.refreshDirQuota = refreshDirQuota;
    return this;
  }

   /**
   * Get refreshDirQuota
   * @return refreshDirQuota
  **/
  @Schema(description = "")
  public Long getRefreshDirQuota() {
    return refreshDirQuota;
  }

  public void setRefreshDirQuota(Long refreshDirQuota) {
    this.refreshDirQuota = refreshDirQuota;
  }

  public DescribeContentQuotaResponse refreshDirRemain(Long refreshDirRemain) {
    this.refreshDirRemain = refreshDirRemain;
    return this;
  }

   /**
   * Get refreshDirRemain
   * @return refreshDirRemain
  **/
  @Schema(description = "")
  public Long getRefreshDirRemain() {
    return refreshDirRemain;
  }

  public void setRefreshDirRemain(Long refreshDirRemain) {
    this.refreshDirRemain = refreshDirRemain;
  }

  public DescribeContentQuotaResponse refreshQuota(Long refreshQuota) {
    this.refreshQuota = refreshQuota;
    return this;
  }

   /**
   * Get refreshQuota
   * @return refreshQuota
  **/
  @Schema(description = "")
  public Long getRefreshQuota() {
    return refreshQuota;
  }

  public void setRefreshQuota(Long refreshQuota) {
    this.refreshQuota = refreshQuota;
  }

  public DescribeContentQuotaResponse refreshQuotaLimit(Long refreshQuotaLimit) {
    this.refreshQuotaLimit = refreshQuotaLimit;
    return this;
  }

   /**
   * Get refreshQuotaLimit
   * @return refreshQuotaLimit
  **/
  @Schema(description = "")
  public Long getRefreshQuotaLimit() {
    return refreshQuotaLimit;
  }

  public void setRefreshQuotaLimit(Long refreshQuotaLimit) {
    this.refreshQuotaLimit = refreshQuotaLimit;
  }

  public DescribeContentQuotaResponse refreshRegexLimit(Long refreshRegexLimit) {
    this.refreshRegexLimit = refreshRegexLimit;
    return this;
  }

   /**
   * Get refreshRegexLimit
   * @return refreshRegexLimit
  **/
  @Schema(description = "")
  public Long getRefreshRegexLimit() {
    return refreshRegexLimit;
  }

  public void setRefreshRegexLimit(Long refreshRegexLimit) {
    this.refreshRegexLimit = refreshRegexLimit;
  }

  public DescribeContentQuotaResponse refreshRegexQuota(Long refreshRegexQuota) {
    this.refreshRegexQuota = refreshRegexQuota;
    return this;
  }

   /**
   * Get refreshRegexQuota
   * @return refreshRegexQuota
  **/
  @Schema(description = "")
  public Long getRefreshRegexQuota() {
    return refreshRegexQuota;
  }

  public void setRefreshRegexQuota(Long refreshRegexQuota) {
    this.refreshRegexQuota = refreshRegexQuota;
  }

  public DescribeContentQuotaResponse refreshRegexRemain(Long refreshRegexRemain) {
    this.refreshRegexRemain = refreshRegexRemain;
    return this;
  }

   /**
   * Get refreshRegexRemain
   * @return refreshRegexRemain
  **/
  @Schema(description = "")
  public Long getRefreshRegexRemain() {
    return refreshRegexRemain;
  }

  public void setRefreshRegexRemain(Long refreshRegexRemain) {
    this.refreshRegexRemain = refreshRegexRemain;
  }

  public DescribeContentQuotaResponse refreshRemain(Long refreshRemain) {
    this.refreshRemain = refreshRemain;
    return this;
  }

   /**
   * Get refreshRemain
   * @return refreshRemain
  **/
  @Schema(description = "")
  public Long getRefreshRemain() {
    return refreshRemain;
  }

  public void setRefreshRemain(Long refreshRemain) {
    this.refreshRemain = refreshRemain;
  }

  public DescribeContentQuotaResponse unblockLimit(Long unblockLimit) {
    this.unblockLimit = unblockLimit;
    return this;
  }

   /**
   * Get unblockLimit
   * @return unblockLimit
  **/
  @Schema(description = "")
  public Long getUnblockLimit() {
    return unblockLimit;
  }

  public void setUnblockLimit(Long unblockLimit) {
    this.unblockLimit = unblockLimit;
  }

  public DescribeContentQuotaResponse unblockQuota(Long unblockQuota) {
    this.unblockQuota = unblockQuota;
    return this;
  }

   /**
   * Get unblockQuota
   * @return unblockQuota
  **/
  @Schema(description = "")
  public Long getUnblockQuota() {
    return unblockQuota;
  }

  public void setUnblockQuota(Long unblockQuota) {
    this.unblockQuota = unblockQuota;
  }

  public DescribeContentQuotaResponse unblockRemain(Long unblockRemain) {
    this.unblockRemain = unblockRemain;
    return this;
  }

   /**
   * Get unblockRemain
   * @return unblockRemain
  **/
  @Schema(description = "")
  public Long getUnblockRemain() {
    return unblockRemain;
  }

  public void setUnblockRemain(Long unblockRemain) {
    this.unblockRemain = unblockRemain;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeContentQuotaResponse describeContentQuotaResponse = (DescribeContentQuotaResponse) o;
    return Objects.equals(this.blockLimit, describeContentQuotaResponse.blockLimit) &&
        Objects.equals(this.blockQuota, describeContentQuotaResponse.blockQuota) &&
        Objects.equals(this.blockRemain, describeContentQuotaResponse.blockRemain) &&
        Objects.equals(this.preloadLimit, describeContentQuotaResponse.preloadLimit) &&
        Objects.equals(this.preloadQuota, describeContentQuotaResponse.preloadQuota) &&
        Objects.equals(this.preloadRemain, describeContentQuotaResponse.preloadRemain) &&
        Objects.equals(this.refreshDirLimit, describeContentQuotaResponse.refreshDirLimit) &&
        Objects.equals(this.refreshDirQuota, describeContentQuotaResponse.refreshDirQuota) &&
        Objects.equals(this.refreshDirRemain, describeContentQuotaResponse.refreshDirRemain) &&
        Objects.equals(this.refreshQuota, describeContentQuotaResponse.refreshQuota) &&
        Objects.equals(this.refreshQuotaLimit, describeContentQuotaResponse.refreshQuotaLimit) &&
        Objects.equals(this.refreshRegexLimit, describeContentQuotaResponse.refreshRegexLimit) &&
        Objects.equals(this.refreshRegexQuota, describeContentQuotaResponse.refreshRegexQuota) &&
        Objects.equals(this.refreshRegexRemain, describeContentQuotaResponse.refreshRegexRemain) &&
        Objects.equals(this.refreshRemain, describeContentQuotaResponse.refreshRemain) &&
        Objects.equals(this.unblockLimit, describeContentQuotaResponse.unblockLimit) &&
        Objects.equals(this.unblockQuota, describeContentQuotaResponse.unblockQuota) &&
        Objects.equals(this.unblockRemain, describeContentQuotaResponse.unblockRemain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockLimit, blockQuota, blockRemain, preloadLimit, preloadQuota, preloadRemain, refreshDirLimit, refreshDirQuota, refreshDirRemain, refreshQuota, refreshQuotaLimit, refreshRegexLimit, refreshRegexQuota, refreshRegexRemain, refreshRemain, unblockLimit, unblockQuota, unblockRemain);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeContentQuotaResponse {\n");
    
    sb.append("    blockLimit: ").append(toIndentedString(blockLimit)).append("\n");
    sb.append("    blockQuota: ").append(toIndentedString(blockQuota)).append("\n");
    sb.append("    blockRemain: ").append(toIndentedString(blockRemain)).append("\n");
    sb.append("    preloadLimit: ").append(toIndentedString(preloadLimit)).append("\n");
    sb.append("    preloadQuota: ").append(toIndentedString(preloadQuota)).append("\n");
    sb.append("    preloadRemain: ").append(toIndentedString(preloadRemain)).append("\n");
    sb.append("    refreshDirLimit: ").append(toIndentedString(refreshDirLimit)).append("\n");
    sb.append("    refreshDirQuota: ").append(toIndentedString(refreshDirQuota)).append("\n");
    sb.append("    refreshDirRemain: ").append(toIndentedString(refreshDirRemain)).append("\n");
    sb.append("    refreshQuota: ").append(toIndentedString(refreshQuota)).append("\n");
    sb.append("    refreshQuotaLimit: ").append(toIndentedString(refreshQuotaLimit)).append("\n");
    sb.append("    refreshRegexLimit: ").append(toIndentedString(refreshRegexLimit)).append("\n");
    sb.append("    refreshRegexQuota: ").append(toIndentedString(refreshRegexQuota)).append("\n");
    sb.append("    refreshRegexRemain: ").append(toIndentedString(refreshRegexRemain)).append("\n");
    sb.append("    refreshRemain: ").append(toIndentedString(refreshRemain)).append("\n");
    sb.append("    unblockLimit: ").append(toIndentedString(unblockLimit)).append("\n");
    sb.append("    unblockQuota: ").append(toIndentedString(unblockQuota)).append("\n");
    sb.append("    unblockRemain: ").append(toIndentedString(unblockRemain)).append("\n");
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