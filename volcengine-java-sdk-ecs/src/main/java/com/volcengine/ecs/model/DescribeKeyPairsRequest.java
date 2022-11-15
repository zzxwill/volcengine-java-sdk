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
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeKeyPairsRequest
 */


public class DescribeKeyPairsRequest {
  @SerializedName("FingerPrint")
  private String fingerPrint = null;

  @SerializedName("KeyPairIds")
  private List<String> keyPairIds = null;

  @SerializedName("KeyPairName")
  private String keyPairName = null;

  @SerializedName("KeyPairNames")
  private List<String> keyPairNames = null;

  @SerializedName("MaxResults")
  private Integer maxResults = null;

  @SerializedName("NextToken")
  private String nextToken = null;

  public DescribeKeyPairsRequest fingerPrint(String fingerPrint) {
    this.fingerPrint = fingerPrint;
    return this;
  }

   /**
   * Get fingerPrint
   * @return fingerPrint
  **/
  @Schema(description = "")
  public String getFingerPrint() {
    return fingerPrint;
  }

  public void setFingerPrint(String fingerPrint) {
    this.fingerPrint = fingerPrint;
  }

  public DescribeKeyPairsRequest keyPairIds(List<String> keyPairIds) {
    this.keyPairIds = keyPairIds;
    return this;
  }

  public DescribeKeyPairsRequest addKeyPairIdsItem(String keyPairIdsItem) {
    if (this.keyPairIds == null) {
      this.keyPairIds = new ArrayList<String>();
    }
    this.keyPairIds.add(keyPairIdsItem);
    return this;
  }

   /**
   * Get keyPairIds
   * @return keyPairIds
  **/
  @Schema(description = "")
  public List<String> getKeyPairIds() {
    return keyPairIds;
  }

  public void setKeyPairIds(List<String> keyPairIds) {
    this.keyPairIds = keyPairIds;
  }

  public DescribeKeyPairsRequest keyPairName(String keyPairName) {
    this.keyPairName = keyPairName;
    return this;
  }

   /**
   * Get keyPairName
   * @return keyPairName
  **/
  @Schema(description = "")
  public String getKeyPairName() {
    return keyPairName;
  }

  public void setKeyPairName(String keyPairName) {
    this.keyPairName = keyPairName;
  }

  public DescribeKeyPairsRequest keyPairNames(List<String> keyPairNames) {
    this.keyPairNames = keyPairNames;
    return this;
  }

  public DescribeKeyPairsRequest addKeyPairNamesItem(String keyPairNamesItem) {
    if (this.keyPairNames == null) {
      this.keyPairNames = new ArrayList<String>();
    }
    this.keyPairNames.add(keyPairNamesItem);
    return this;
  }

   /**
   * Get keyPairNames
   * @return keyPairNames
  **/
  @Schema(description = "")
  public List<String> getKeyPairNames() {
    return keyPairNames;
  }

  public void setKeyPairNames(List<String> keyPairNames) {
    this.keyPairNames = keyPairNames;
  }

  public DescribeKeyPairsRequest maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

   /**
   * Get maxResults
   * @return maxResults
  **/
  @Schema(description = "")
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  public DescribeKeyPairsRequest nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

   /**
   * Get nextToken
   * @return nextToken
  **/
  @Schema(description = "")
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeKeyPairsRequest describeKeyPairsRequest = (DescribeKeyPairsRequest) o;
    return Objects.equals(this.fingerPrint, describeKeyPairsRequest.fingerPrint) &&
        Objects.equals(this.keyPairIds, describeKeyPairsRequest.keyPairIds) &&
        Objects.equals(this.keyPairName, describeKeyPairsRequest.keyPairName) &&
        Objects.equals(this.keyPairNames, describeKeyPairsRequest.keyPairNames) &&
        Objects.equals(this.maxResults, describeKeyPairsRequest.maxResults) &&
        Objects.equals(this.nextToken, describeKeyPairsRequest.nextToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fingerPrint, keyPairIds, keyPairName, keyPairNames, maxResults, nextToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeKeyPairsRequest {\n");
    
    sb.append("    fingerPrint: ").append(toIndentedString(fingerPrint)).append("\n");
    sb.append("    keyPairIds: ").append(toIndentedString(keyPairIds)).append("\n");
    sb.append("    keyPairName: ").append(toIndentedString(keyPairName)).append("\n");
    sb.append("    keyPairNames: ").append(toIndentedString(keyPairNames)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
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
