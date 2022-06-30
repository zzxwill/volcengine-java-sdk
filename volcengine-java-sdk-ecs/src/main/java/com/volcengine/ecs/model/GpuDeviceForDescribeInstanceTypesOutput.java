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
import com.volcengine.ecs.model.MemoryForDescribeInstanceTypesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * GpuDeviceForDescribeInstanceTypesOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-30T20:18:05.921659+08:00[Asia/Shanghai]")
public class GpuDeviceForDescribeInstanceTypesOutput {
  @SerializedName("Count")
  private Integer count = null;

  @SerializedName("Memory")
  private MemoryForDescribeInstanceTypesOutput memory = null;

  @SerializedName("ProductName")
  private String productName = null;

  public GpuDeviceForDescribeInstanceTypesOutput count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @Schema(description = "")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public GpuDeviceForDescribeInstanceTypesOutput memory(MemoryForDescribeInstanceTypesOutput memory) {
    this.memory = memory;
    return this;
  }

   /**
   * Get memory
   * @return memory
  **/
  @Valid
  @Schema(description = "")
  public MemoryForDescribeInstanceTypesOutput getMemory() {
    return memory;
  }

  public void setMemory(MemoryForDescribeInstanceTypesOutput memory) {
    this.memory = memory;
  }

  public GpuDeviceForDescribeInstanceTypesOutput productName(String productName) {
    this.productName = productName;
    return this;
  }

   /**
   * Get productName
   * @return productName
  **/
  @Schema(description = "")
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GpuDeviceForDescribeInstanceTypesOutput gpuDeviceForDescribeInstanceTypesOutput = (GpuDeviceForDescribeInstanceTypesOutput) o;
    return Objects.equals(this.count, gpuDeviceForDescribeInstanceTypesOutput.count) &&
        Objects.equals(this.memory, gpuDeviceForDescribeInstanceTypesOutput.memory) &&
        Objects.equals(this.productName, gpuDeviceForDescribeInstanceTypesOutput.productName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, memory, productName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GpuDeviceForDescribeInstanceTypesOutput {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
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
