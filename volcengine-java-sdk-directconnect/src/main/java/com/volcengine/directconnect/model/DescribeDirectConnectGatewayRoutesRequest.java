/*
 * directconnect
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.directconnect.model;

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
 * DescribeDirectConnectGatewayRoutesRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-20T11:35:26.992284+08:00[Asia/Shanghai]")
public class DescribeDirectConnectGatewayRoutesRequest {
  @SerializedName("DestinationCidrBlock")
  private String destinationCidrBlock = null;

  @SerializedName("DirectConnectGatewayId")
  private String directConnectGatewayId = null;

  @SerializedName("DirectConnectGatewayRouteIds")
  private List<String> directConnectGatewayRouteIds = null;

  @SerializedName("NextHopId")
  private String nextHopId = null;

  @SerializedName("NextHopType")
  private String nextHopType = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("RouteType")
  private String routeType = null;

  public DescribeDirectConnectGatewayRoutesRequest destinationCidrBlock(String destinationCidrBlock) {
    this.destinationCidrBlock = destinationCidrBlock;
    return this;
  }

   /**
   * Get destinationCidrBlock
   * @return destinationCidrBlock
  **/
  @Schema(description = "")
  public String getDestinationCidrBlock() {
    return destinationCidrBlock;
  }

  public void setDestinationCidrBlock(String destinationCidrBlock) {
    this.destinationCidrBlock = destinationCidrBlock;
  }

  public DescribeDirectConnectGatewayRoutesRequest directConnectGatewayId(String directConnectGatewayId) {
    this.directConnectGatewayId = directConnectGatewayId;
    return this;
  }

   /**
   * Get directConnectGatewayId
   * @return directConnectGatewayId
  **/
  @Schema(description = "")
  public String getDirectConnectGatewayId() {
    return directConnectGatewayId;
  }

  public void setDirectConnectGatewayId(String directConnectGatewayId) {
    this.directConnectGatewayId = directConnectGatewayId;
  }

  public DescribeDirectConnectGatewayRoutesRequest directConnectGatewayRouteIds(List<String> directConnectGatewayRouteIds) {
    this.directConnectGatewayRouteIds = directConnectGatewayRouteIds;
    return this;
  }

  public DescribeDirectConnectGatewayRoutesRequest addDirectConnectGatewayRouteIdsItem(String directConnectGatewayRouteIdsItem) {
    if (this.directConnectGatewayRouteIds == null) {
      this.directConnectGatewayRouteIds = new ArrayList<String>();
    }
    this.directConnectGatewayRouteIds.add(directConnectGatewayRouteIdsItem);
    return this;
  }

   /**
   * Get directConnectGatewayRouteIds
   * @return directConnectGatewayRouteIds
  **/
  @Schema(description = "")
  public List<String> getDirectConnectGatewayRouteIds() {
    return directConnectGatewayRouteIds;
  }

  public void setDirectConnectGatewayRouteIds(List<String> directConnectGatewayRouteIds) {
    this.directConnectGatewayRouteIds = directConnectGatewayRouteIds;
  }

  public DescribeDirectConnectGatewayRoutesRequest nextHopId(String nextHopId) {
    this.nextHopId = nextHopId;
    return this;
  }

   /**
   * Get nextHopId
   * @return nextHopId
  **/
  @Schema(description = "")
  public String getNextHopId() {
    return nextHopId;
  }

  public void setNextHopId(String nextHopId) {
    this.nextHopId = nextHopId;
  }

  public DescribeDirectConnectGatewayRoutesRequest nextHopType(String nextHopType) {
    this.nextHopType = nextHopType;
    return this;
  }

   /**
   * Get nextHopType
   * @return nextHopType
  **/
  @Schema(description = "")
  public String getNextHopType() {
    return nextHopType;
  }

  public void setNextHopType(String nextHopType) {
    this.nextHopType = nextHopType;
  }

  public DescribeDirectConnectGatewayRoutesRequest pageNumber(Integer pageNumber) {
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

  public DescribeDirectConnectGatewayRoutesRequest pageSize(Integer pageSize) {
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

  public DescribeDirectConnectGatewayRoutesRequest routeType(String routeType) {
    this.routeType = routeType;
    return this;
  }

   /**
   * Get routeType
   * @return routeType
  **/
  @Schema(description = "")
  public String getRouteType() {
    return routeType;
  }

  public void setRouteType(String routeType) {
    this.routeType = routeType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeDirectConnectGatewayRoutesRequest describeDirectConnectGatewayRoutesRequest = (DescribeDirectConnectGatewayRoutesRequest) o;
    return Objects.equals(this.destinationCidrBlock, describeDirectConnectGatewayRoutesRequest.destinationCidrBlock) &&
        Objects.equals(this.directConnectGatewayId, describeDirectConnectGatewayRoutesRequest.directConnectGatewayId) &&
        Objects.equals(this.directConnectGatewayRouteIds, describeDirectConnectGatewayRoutesRequest.directConnectGatewayRouteIds) &&
        Objects.equals(this.nextHopId, describeDirectConnectGatewayRoutesRequest.nextHopId) &&
        Objects.equals(this.nextHopType, describeDirectConnectGatewayRoutesRequest.nextHopType) &&
        Objects.equals(this.pageNumber, describeDirectConnectGatewayRoutesRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeDirectConnectGatewayRoutesRequest.pageSize) &&
        Objects.equals(this.routeType, describeDirectConnectGatewayRoutesRequest.routeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationCidrBlock, directConnectGatewayId, directConnectGatewayRouteIds, nextHopId, nextHopType, pageNumber, pageSize, routeType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDirectConnectGatewayRoutesRequest {\n");
    
    sb.append("    destinationCidrBlock: ").append(toIndentedString(destinationCidrBlock)).append("\n");
    sb.append("    directConnectGatewayId: ").append(toIndentedString(directConnectGatewayId)).append("\n");
    sb.append("    directConnectGatewayRouteIds: ").append(toIndentedString(directConnectGatewayRouteIds)).append("\n");
    sb.append("    nextHopId: ").append(toIndentedString(nextHopId)).append("\n");
    sb.append("    nextHopType: ").append(toIndentedString(nextHopType)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    routeType: ").append(toIndentedString(routeType)).append("\n");
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
