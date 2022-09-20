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
import com.volcengine.vpc.model.SecurityGroupForDescribeSecurityGroupsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeSecurityGroupsResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-20T11:35:41.789411+08:00[Asia/Shanghai]")
public class DescribeSecurityGroupsResponse {
  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("SecurityGroups")
  private List<SecurityGroupForDescribeSecurityGroupsOutput> securityGroups = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  public DescribeSecurityGroupsResponse pageNumber(Integer pageNumber) {
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

  public DescribeSecurityGroupsResponse pageSize(Integer pageSize) {
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

  public DescribeSecurityGroupsResponse requestId(String requestId) {
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

  public DescribeSecurityGroupsResponse securityGroups(List<SecurityGroupForDescribeSecurityGroupsOutput> securityGroups) {
    this.securityGroups = securityGroups;
    return this;
  }

  public DescribeSecurityGroupsResponse addSecurityGroupsItem(SecurityGroupForDescribeSecurityGroupsOutput securityGroupsItem) {
    if (this.securityGroups == null) {
      this.securityGroups = new ArrayList<SecurityGroupForDescribeSecurityGroupsOutput>();
    }
    this.securityGroups.add(securityGroupsItem);
    return this;
  }

   /**
   * Get securityGroups
   * @return securityGroups
  **/
  @Valid
  @Schema(description = "")
  public List<SecurityGroupForDescribeSecurityGroupsOutput> getSecurityGroups() {
    return securityGroups;
  }

  public void setSecurityGroups(List<SecurityGroupForDescribeSecurityGroupsOutput> securityGroups) {
    this.securityGroups = securityGroups;
  }

  public DescribeSecurityGroupsResponse totalCount(Integer totalCount) {
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
    DescribeSecurityGroupsResponse describeSecurityGroupsResponse = (DescribeSecurityGroupsResponse) o;
    return Objects.equals(this.pageNumber, describeSecurityGroupsResponse.pageNumber) &&
        Objects.equals(this.pageSize, describeSecurityGroupsResponse.pageSize) &&
        Objects.equals(this.requestId, describeSecurityGroupsResponse.requestId) &&
        Objects.equals(this.securityGroups, describeSecurityGroupsResponse.securityGroups) &&
        Objects.equals(this.totalCount, describeSecurityGroupsResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, requestId, securityGroups, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeSecurityGroupsResponse {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
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
