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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * VpcGatewayEndpointServiceForDescribeVpcGatewayEndpointServicesOutput
 */


public class VpcGatewayEndpointServiceForDescribeVpcGatewayEndpointServicesOutput {
  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("ServiceId")
  private String serviceId = null;

  @SerializedName("ServiceName")
  private String serviceName = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  public VpcGatewayEndpointServiceForDescribeVpcGatewayEndpointServicesOutput creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * Get creationTime
   * @return creationTime
  **/
  @Schema(description = "")
  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public VpcGatewayEndpointServiceForDescribeVpcGatewayEndpointServicesOutput description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public VpcGatewayEndpointServiceForDescribeVpcGatewayEndpointServicesOutput serviceId(String serviceId) {
    this.serviceId = serviceId;
    return this;
  }

   /**
   * Get serviceId
   * @return serviceId
  **/
  @Schema(description = "")
  public String getServiceId() {
    return serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  public VpcGatewayEndpointServiceForDescribeVpcGatewayEndpointServicesOutput serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

   /**
   * Get serviceName
   * @return serviceName
  **/
  @Schema(description = "")
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public VpcGatewayEndpointServiceForDescribeVpcGatewayEndpointServicesOutput status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public VpcGatewayEndpointServiceForDescribeVpcGatewayEndpointServicesOutput updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Get updateTime
   * @return updateTime
  **/
  @Schema(description = "")
  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VpcGatewayEndpointServiceForDescribeVpcGatewayEndpointServicesOutput vpcGatewayEndpointServiceForDescribeVpcGatewayEndpointServicesOutput = (VpcGatewayEndpointServiceForDescribeVpcGatewayEndpointServicesOutput) o;
    return Objects.equals(this.creationTime, vpcGatewayEndpointServiceForDescribeVpcGatewayEndpointServicesOutput.creationTime) &&
        Objects.equals(this.description, vpcGatewayEndpointServiceForDescribeVpcGatewayEndpointServicesOutput.description) &&
        Objects.equals(this.serviceId, vpcGatewayEndpointServiceForDescribeVpcGatewayEndpointServicesOutput.serviceId) &&
        Objects.equals(this.serviceName, vpcGatewayEndpointServiceForDescribeVpcGatewayEndpointServicesOutput.serviceName) &&
        Objects.equals(this.status, vpcGatewayEndpointServiceForDescribeVpcGatewayEndpointServicesOutput.status) &&
        Objects.equals(this.updateTime, vpcGatewayEndpointServiceForDescribeVpcGatewayEndpointServicesOutput.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationTime, description, serviceId, serviceName, status, updateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VpcGatewayEndpointServiceForDescribeVpcGatewayEndpointServicesOutput {\n");
    
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
