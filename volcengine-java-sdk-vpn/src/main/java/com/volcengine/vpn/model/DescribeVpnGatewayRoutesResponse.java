/*
 * vpn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vpn.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vpn.model.VpnGatewayRouteForDescribeVpnGatewayRoutesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeVpnGatewayRoutesResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-30T20:18:23.808118+08:00[Asia/Shanghai]")
public class DescribeVpnGatewayRoutesResponse {
  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  @SerializedName("VpnGatewayRoutes")
  private List<VpnGatewayRouteForDescribeVpnGatewayRoutesOutput> vpnGatewayRoutes = null;

  public DescribeVpnGatewayRoutesResponse pageNumber(Integer pageNumber) {
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

  public DescribeVpnGatewayRoutesResponse pageSize(Integer pageSize) {
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

  public DescribeVpnGatewayRoutesResponse requestId(String requestId) {
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

  public DescribeVpnGatewayRoutesResponse totalCount(Integer totalCount) {
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

  public DescribeVpnGatewayRoutesResponse vpnGatewayRoutes(List<VpnGatewayRouteForDescribeVpnGatewayRoutesOutput> vpnGatewayRoutes) {
    this.vpnGatewayRoutes = vpnGatewayRoutes;
    return this;
  }

  public DescribeVpnGatewayRoutesResponse addVpnGatewayRoutesItem(VpnGatewayRouteForDescribeVpnGatewayRoutesOutput vpnGatewayRoutesItem) {
    if (this.vpnGatewayRoutes == null) {
      this.vpnGatewayRoutes = new ArrayList<VpnGatewayRouteForDescribeVpnGatewayRoutesOutput>();
    }
    this.vpnGatewayRoutes.add(vpnGatewayRoutesItem);
    return this;
  }

   /**
   * Get vpnGatewayRoutes
   * @return vpnGatewayRoutes
  **/
  @Valid
  @Schema(description = "")
  public List<VpnGatewayRouteForDescribeVpnGatewayRoutesOutput> getVpnGatewayRoutes() {
    return vpnGatewayRoutes;
  }

  public void setVpnGatewayRoutes(List<VpnGatewayRouteForDescribeVpnGatewayRoutesOutput> vpnGatewayRoutes) {
    this.vpnGatewayRoutes = vpnGatewayRoutes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeVpnGatewayRoutesResponse describeVpnGatewayRoutesResponse = (DescribeVpnGatewayRoutesResponse) o;
    return Objects.equals(this.pageNumber, describeVpnGatewayRoutesResponse.pageNumber) &&
        Objects.equals(this.pageSize, describeVpnGatewayRoutesResponse.pageSize) &&
        Objects.equals(this.requestId, describeVpnGatewayRoutesResponse.requestId) &&
        Objects.equals(this.totalCount, describeVpnGatewayRoutesResponse.totalCount) &&
        Objects.equals(this.vpnGatewayRoutes, describeVpnGatewayRoutesResponse.vpnGatewayRoutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, requestId, totalCount, vpnGatewayRoutes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeVpnGatewayRoutesResponse {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    vpnGatewayRoutes: ").append(toIndentedString(vpnGatewayRoutes)).append("\n");
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
