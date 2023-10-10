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
import com.volcengine.ecs.model.DedicatedHostClusterForDescribeDedicatedHostClustersOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeDedicatedHostClustersResponse
 */


public class DescribeDedicatedHostClustersResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("DedicatedHostClusters")
  private List<DedicatedHostClusterForDescribeDedicatedHostClustersOutput> dedicatedHostClusters = null;

  @SerializedName("NextToken")
  private String nextToken = null;

  public DescribeDedicatedHostClustersResponse dedicatedHostClusters(List<DedicatedHostClusterForDescribeDedicatedHostClustersOutput> dedicatedHostClusters) {
    this.dedicatedHostClusters = dedicatedHostClusters;
    return this;
  }

  public DescribeDedicatedHostClustersResponse addDedicatedHostClustersItem(DedicatedHostClusterForDescribeDedicatedHostClustersOutput dedicatedHostClustersItem) {
    if (this.dedicatedHostClusters == null) {
      this.dedicatedHostClusters = new ArrayList<DedicatedHostClusterForDescribeDedicatedHostClustersOutput>();
    }
    this.dedicatedHostClusters.add(dedicatedHostClustersItem);
    return this;
  }

   /**
   * Get dedicatedHostClusters
   * @return dedicatedHostClusters
  **/
  @Valid
  @Schema(description = "")
  public List<DedicatedHostClusterForDescribeDedicatedHostClustersOutput> getDedicatedHostClusters() {
    return dedicatedHostClusters;
  }

  public void setDedicatedHostClusters(List<DedicatedHostClusterForDescribeDedicatedHostClustersOutput> dedicatedHostClusters) {
    this.dedicatedHostClusters = dedicatedHostClusters;
  }

  public DescribeDedicatedHostClustersResponse nextToken(String nextToken) {
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
    DescribeDedicatedHostClustersResponse describeDedicatedHostClustersResponse = (DescribeDedicatedHostClustersResponse) o;
    return Objects.equals(this.dedicatedHostClusters, describeDedicatedHostClustersResponse.dedicatedHostClusters) &&
        Objects.equals(this.nextToken, describeDedicatedHostClustersResponse.nextToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dedicatedHostClusters, nextToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDedicatedHostClustersResponse {\n");
    
    sb.append("    dedicatedHostClusters: ").append(toIndentedString(dedicatedHostClusters)).append("\n");
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
