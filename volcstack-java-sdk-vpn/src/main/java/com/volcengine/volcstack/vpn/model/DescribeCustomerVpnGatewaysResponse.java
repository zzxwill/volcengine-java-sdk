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

package com.volcengine.volcstack.vpn.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.volcstack.vpn.model.CustomerVpnGatewayForDescribeCustomerVpnGatewaysOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeCustomerVpnGatewaysResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-03-24T18:21:18.622599+08:00[Asia/Shanghai]")
public class DescribeCustomerVpnGatewaysResponse {
  @SerializedName("CustomerVpnGateways")
  private List<CustomerVpnGatewayForDescribeCustomerVpnGatewaysOutput> customerVpnGateways = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  public DescribeCustomerVpnGatewaysResponse customerVpnGateways(List<CustomerVpnGatewayForDescribeCustomerVpnGatewaysOutput> customerVpnGateways) {
    this.customerVpnGateways = customerVpnGateways;
    return this;
  }

  public DescribeCustomerVpnGatewaysResponse addCustomerVpnGatewaysItem(CustomerVpnGatewayForDescribeCustomerVpnGatewaysOutput customerVpnGatewaysItem) {
    if (this.customerVpnGateways == null) {
      this.customerVpnGateways = new ArrayList<CustomerVpnGatewayForDescribeCustomerVpnGatewaysOutput>();
    }
    this.customerVpnGateways.add(customerVpnGatewaysItem);
    return this;
  }

   /**
   * Get customerVpnGateways
   * @return customerVpnGateways
  **/
  @Valid
  @Schema(description = "")
  public List<CustomerVpnGatewayForDescribeCustomerVpnGatewaysOutput> getCustomerVpnGateways() {
    return customerVpnGateways;
  }

  public void setCustomerVpnGateways(List<CustomerVpnGatewayForDescribeCustomerVpnGatewaysOutput> customerVpnGateways) {
    this.customerVpnGateways = customerVpnGateways;
  }

  public DescribeCustomerVpnGatewaysResponse pageNumber(Integer pageNumber) {
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

  public DescribeCustomerVpnGatewaysResponse pageSize(Integer pageSize) {
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

  public DescribeCustomerVpnGatewaysResponse requestId(String requestId) {
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

  public DescribeCustomerVpnGatewaysResponse totalCount(Integer totalCount) {
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeCustomerVpnGatewaysResponse describeCustomerVpnGatewaysResponse = (DescribeCustomerVpnGatewaysResponse) o;
    return Objects.equals(this.customerVpnGateways, describeCustomerVpnGatewaysResponse.customerVpnGateways) &&
        Objects.equals(this.pageNumber, describeCustomerVpnGatewaysResponse.pageNumber) &&
        Objects.equals(this.pageSize, describeCustomerVpnGatewaysResponse.pageSize) &&
        Objects.equals(this.requestId, describeCustomerVpnGatewaysResponse.requestId) &&
        Objects.equals(this.totalCount, describeCustomerVpnGatewaysResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerVpnGateways, pageNumber, pageSize, requestId, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeCustomerVpnGatewaysResponse {\n");
    
    sb.append("    customerVpnGateways: ").append(toIndentedString(customerVpnGateways)).append("\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
