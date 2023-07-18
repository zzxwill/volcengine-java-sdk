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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ProcessorForDescribeInstanceTypesOutput
 */



public class ProcessorForDescribeInstanceTypesOutput {
  @SerializedName("BaseFrequency")
  private Float baseFrequency = null;

  @SerializedName("Cpus")
  private Integer cpus = null;

  @SerializedName("Model")
  private String model = null;

  @SerializedName("TurboFrequency")
  private Float turboFrequency = null;

  public ProcessorForDescribeInstanceTypesOutput baseFrequency(Float baseFrequency) {
    this.baseFrequency = baseFrequency;
    return this;
  }

   /**
   * Get baseFrequency
   * @return baseFrequency
  **/
  @Schema(description = "")
  public Float getBaseFrequency() {
    return baseFrequency;
  }

  public void setBaseFrequency(Float baseFrequency) {
    this.baseFrequency = baseFrequency;
  }

  public ProcessorForDescribeInstanceTypesOutput cpus(Integer cpus) {
    this.cpus = cpus;
    return this;
  }

   /**
   * Get cpus
   * @return cpus
  **/
  @Schema(description = "")
  public Integer getCpus() {
    return cpus;
  }

  public void setCpus(Integer cpus) {
    this.cpus = cpus;
  }

  public ProcessorForDescribeInstanceTypesOutput model(String model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @Schema(description = "")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public ProcessorForDescribeInstanceTypesOutput turboFrequency(Float turboFrequency) {
    this.turboFrequency = turboFrequency;
    return this;
  }

   /**
   * Get turboFrequency
   * @return turboFrequency
  **/
  @Schema(description = "")
  public Float getTurboFrequency() {
    return turboFrequency;
  }

  public void setTurboFrequency(Float turboFrequency) {
    this.turboFrequency = turboFrequency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessorForDescribeInstanceTypesOutput processorForDescribeInstanceTypesOutput = (ProcessorForDescribeInstanceTypesOutput) o;
    return Objects.equals(this.baseFrequency, processorForDescribeInstanceTypesOutput.baseFrequency) &&
        Objects.equals(this.cpus, processorForDescribeInstanceTypesOutput.cpus) &&
        Objects.equals(this.model, processorForDescribeInstanceTypesOutput.model) &&
        Objects.equals(this.turboFrequency, processorForDescribeInstanceTypesOutput.turboFrequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseFrequency, cpus, model, turboFrequency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessorForDescribeInstanceTypesOutput {\n");
    
    sb.append("    baseFrequency: ").append(toIndentedString(baseFrequency)).append("\n");
    sb.append("    cpus: ").append(toIndentedString(cpus)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    turboFrequency: ").append(toIndentedString(turboFrequency)).append("\n");
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
