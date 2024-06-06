/*
 * privatelink
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.privatelink.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.privatelink.model.TagFilterForDescribeVpcGatewayEndpointsInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeVpcGatewayEndpointsRequest
 */


public class DescribeVpcGatewayEndpointsRequest {
  @SerializedName("EndpointIds")
  private List<String> endpointIds = null;

  @SerializedName("EndpointName")
  private String endpointName = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("TagFilters")
  private List<TagFilterForDescribeVpcGatewayEndpointsInput> tagFilters = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  public DescribeVpcGatewayEndpointsRequest endpointIds(List<String> endpointIds) {
    this.endpointIds = endpointIds;
    return this;
  }

  public DescribeVpcGatewayEndpointsRequest addEndpointIdsItem(String endpointIdsItem) {
    if (this.endpointIds == null) {
      this.endpointIds = new ArrayList<String>();
    }
    this.endpointIds.add(endpointIdsItem);
    return this;
  }

   /**
   * Get endpointIds
   * @return endpointIds
  **/
  @Schema(description = "")
  public List<String> getEndpointIds() {
    return endpointIds;
  }

  public void setEndpointIds(List<String> endpointIds) {
    this.endpointIds = endpointIds;
  }

  public DescribeVpcGatewayEndpointsRequest endpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

   /**
   * Get endpointName
   * @return endpointName
  **/
  @Schema(description = "")
  public String getEndpointName() {
    return endpointName;
  }

  public void setEndpointName(String endpointName) {
    this.endpointName = endpointName;
  }

  public DescribeVpcGatewayEndpointsRequest pageNumber(Integer pageNumber) {
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

  public DescribeVpcGatewayEndpointsRequest pageSize(Integer pageSize) {
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

  public DescribeVpcGatewayEndpointsRequest projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @Schema(description = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public DescribeVpcGatewayEndpointsRequest tagFilters(List<TagFilterForDescribeVpcGatewayEndpointsInput> tagFilters) {
    this.tagFilters = tagFilters;
    return this;
  }

  public DescribeVpcGatewayEndpointsRequest addTagFiltersItem(TagFilterForDescribeVpcGatewayEndpointsInput tagFiltersItem) {
    if (this.tagFilters == null) {
      this.tagFilters = new ArrayList<TagFilterForDescribeVpcGatewayEndpointsInput>();
    }
    this.tagFilters.add(tagFiltersItem);
    return this;
  }

   /**
   * Get tagFilters
   * @return tagFilters
  **/
  @Valid
  @Schema(description = "")
  public List<TagFilterForDescribeVpcGatewayEndpointsInput> getTagFilters() {
    return tagFilters;
  }

  public void setTagFilters(List<TagFilterForDescribeVpcGatewayEndpointsInput> tagFilters) {
    this.tagFilters = tagFilters;
  }

  public DescribeVpcGatewayEndpointsRequest vpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

   /**
   * Get vpcId
   * @return vpcId
  **/
  @Schema(description = "")
  public String getVpcId() {
    return vpcId;
  }

  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeVpcGatewayEndpointsRequest describeVpcGatewayEndpointsRequest = (DescribeVpcGatewayEndpointsRequest) o;
    return Objects.equals(this.endpointIds, describeVpcGatewayEndpointsRequest.endpointIds) &&
        Objects.equals(this.endpointName, describeVpcGatewayEndpointsRequest.endpointName) &&
        Objects.equals(this.pageNumber, describeVpcGatewayEndpointsRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeVpcGatewayEndpointsRequest.pageSize) &&
        Objects.equals(this.projectName, describeVpcGatewayEndpointsRequest.projectName) &&
        Objects.equals(this.tagFilters, describeVpcGatewayEndpointsRequest.tagFilters) &&
        Objects.equals(this.vpcId, describeVpcGatewayEndpointsRequest.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointIds, endpointName, pageNumber, pageSize, projectName, tagFilters, vpcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeVpcGatewayEndpointsRequest {\n");
    
    sb.append("    endpointIds: ").append(toIndentedString(endpointIds)).append("\n");
    sb.append("    endpointName: ").append(toIndentedString(endpointName)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    tagFilters: ").append(toIndentedString(tagFilters)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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