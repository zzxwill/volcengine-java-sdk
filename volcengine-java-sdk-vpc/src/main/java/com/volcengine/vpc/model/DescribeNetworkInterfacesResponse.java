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
import com.volcengine.vpc.model.NetworkInterfaceSetForDescribeNetworkInterfacesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeNetworkInterfacesResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-10T12:08:25.743848+08:00[Asia/Shanghai]")
public class DescribeNetworkInterfacesResponse {
  @SerializedName("NetworkInterfaceSets")
  private List<NetworkInterfaceSetForDescribeNetworkInterfacesOutput> networkInterfaceSets = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  public DescribeNetworkInterfacesResponse networkInterfaceSets(List<NetworkInterfaceSetForDescribeNetworkInterfacesOutput> networkInterfaceSets) {
    this.networkInterfaceSets = networkInterfaceSets;
    return this;
  }

  public DescribeNetworkInterfacesResponse addNetworkInterfaceSetsItem(NetworkInterfaceSetForDescribeNetworkInterfacesOutput networkInterfaceSetsItem) {
    if (this.networkInterfaceSets == null) {
      this.networkInterfaceSets = new ArrayList<NetworkInterfaceSetForDescribeNetworkInterfacesOutput>();
    }
    this.networkInterfaceSets.add(networkInterfaceSetsItem);
    return this;
  }

   /**
   * Get networkInterfaceSets
   * @return networkInterfaceSets
  **/
  @Valid
  @Schema(description = "")
  public List<NetworkInterfaceSetForDescribeNetworkInterfacesOutput> getNetworkInterfaceSets() {
    return networkInterfaceSets;
  }

  public void setNetworkInterfaceSets(List<NetworkInterfaceSetForDescribeNetworkInterfacesOutput> networkInterfaceSets) {
    this.networkInterfaceSets = networkInterfaceSets;
  }

  public DescribeNetworkInterfacesResponse pageNumber(Integer pageNumber) {
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

  public DescribeNetworkInterfacesResponse pageSize(Integer pageSize) {
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

  public DescribeNetworkInterfacesResponse requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @Schema(description = "")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public DescribeNetworkInterfacesResponse totalCount(Integer totalCount) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeNetworkInterfacesResponse describeNetworkInterfacesResponse = (DescribeNetworkInterfacesResponse) o;
    return Objects.equals(this.networkInterfaceSets, describeNetworkInterfacesResponse.networkInterfaceSets) &&
        Objects.equals(this.pageNumber, describeNetworkInterfacesResponse.pageNumber) &&
        Objects.equals(this.pageSize, describeNetworkInterfacesResponse.pageSize) &&
        Objects.equals(this.requestId, describeNetworkInterfacesResponse.requestId) &&
        Objects.equals(this.totalCount, describeNetworkInterfacesResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkInterfaceSets, pageNumber, pageSize, requestId, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeNetworkInterfacesResponse {\n");
    
    sb.append("    networkInterfaceSets: ").append(toIndentedString(networkInterfaceSets)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
