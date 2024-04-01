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
 * PrivateDNSNameConfigurationForDescribeVpcEndpointServicesOutput
 */


public class PrivateDNSNameConfigurationForDescribeVpcEndpointServicesOutput {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("Value")
  private String value = null;

  public PrivateDNSNameConfigurationForDescribeVpcEndpointServicesOutput name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PrivateDNSNameConfigurationForDescribeVpcEndpointServicesOutput status(String status) {
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

  public PrivateDNSNameConfigurationForDescribeVpcEndpointServicesOutput type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PrivateDNSNameConfigurationForDescribeVpcEndpointServicesOutput value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @Schema(description = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrivateDNSNameConfigurationForDescribeVpcEndpointServicesOutput privateDNSNameConfigurationForDescribeVpcEndpointServicesOutput = (PrivateDNSNameConfigurationForDescribeVpcEndpointServicesOutput) o;
    return Objects.equals(this.name, privateDNSNameConfigurationForDescribeVpcEndpointServicesOutput.name) &&
        Objects.equals(this.status, privateDNSNameConfigurationForDescribeVpcEndpointServicesOutput.status) &&
        Objects.equals(this.type, privateDNSNameConfigurationForDescribeVpcEndpointServicesOutput.type) &&
        Objects.equals(this.value, privateDNSNameConfigurationForDescribeVpcEndpointServicesOutput.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, status, type, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrivateDNSNameConfigurationForDescribeVpcEndpointServicesOutput {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
