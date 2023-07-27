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
import com.volcengine.ecs.model.AvailableSpotResourceForDescribeSpotAdviceOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeSpotAdviceResponse
 */


public class DescribeSpotAdviceResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("AvailableSpotResources")
  private List<AvailableSpotResourceForDescribeSpotAdviceOutput> availableSpotResources = null;

  @SerializedName("NextToken")
  private String nextToken = null;

  public DescribeSpotAdviceResponse availableSpotResources(List<AvailableSpotResourceForDescribeSpotAdviceOutput> availableSpotResources) {
    this.availableSpotResources = availableSpotResources;
    return this;
  }

  public DescribeSpotAdviceResponse addAvailableSpotResourcesItem(AvailableSpotResourceForDescribeSpotAdviceOutput availableSpotResourcesItem) {
    if (this.availableSpotResources == null) {
      this.availableSpotResources = new ArrayList<AvailableSpotResourceForDescribeSpotAdviceOutput>();
    }
    this.availableSpotResources.add(availableSpotResourcesItem);
    return this;
  }

   /**
   * Get availableSpotResources
   * @return availableSpotResources
  **/
  @Valid
  @Schema(description = "")
  public List<AvailableSpotResourceForDescribeSpotAdviceOutput> getAvailableSpotResources() {
    return availableSpotResources;
  }

  public void setAvailableSpotResources(List<AvailableSpotResourceForDescribeSpotAdviceOutput> availableSpotResources) {
    this.availableSpotResources = availableSpotResources;
  }

  public DescribeSpotAdviceResponse nextToken(String nextToken) {
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
    DescribeSpotAdviceResponse describeSpotAdviceResponse = (DescribeSpotAdviceResponse) o;
    return Objects.equals(this.availableSpotResources, describeSpotAdviceResponse.availableSpotResources) &&
        Objects.equals(this.nextToken, describeSpotAdviceResponse.nextToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableSpotResources, nextToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeSpotAdviceResponse {\n");
    
    sb.append("    availableSpotResources: ").append(toIndentedString(availableSpotResources)).append("\n");
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
