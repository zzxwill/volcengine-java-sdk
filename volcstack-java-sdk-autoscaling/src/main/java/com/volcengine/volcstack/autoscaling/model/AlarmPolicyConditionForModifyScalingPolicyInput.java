/*
 * auto_scaling
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcstack.autoscaling.model;

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
 * AlarmPolicyConditionForModifyScalingPolicyInput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-13T17:16:15.237208+08:00[Asia/Shanghai]")
public class AlarmPolicyConditionForModifyScalingPolicyInput {
  @SerializedName("ComparisonOperator")
  private String comparisonOperator = null;

  @SerializedName("MetricName")
  private String metricName = null;

  @SerializedName("MetricUnit")
  private String metricUnit = null;

  @SerializedName("Threshold")
  private String threshold = null;

  public AlarmPolicyConditionForModifyScalingPolicyInput comparisonOperator(String comparisonOperator) {
    this.comparisonOperator = comparisonOperator;
    return this;
  }

   /**
   * Get comparisonOperator
   * @return comparisonOperator
  **/
  @Schema(description = "")
  public String getComparisonOperator() {
    return comparisonOperator;
  }

  public void setComparisonOperator(String comparisonOperator) {
    this.comparisonOperator = comparisonOperator;
  }

  public AlarmPolicyConditionForModifyScalingPolicyInput metricName(String metricName) {
    this.metricName = metricName;
    return this;
  }

   /**
   * Get metricName
   * @return metricName
  **/
  @Schema(description = "")
  public String getMetricName() {
    return metricName;
  }

  public void setMetricName(String metricName) {
    this.metricName = metricName;
  }

  public AlarmPolicyConditionForModifyScalingPolicyInput metricUnit(String metricUnit) {
    this.metricUnit = metricUnit;
    return this;
  }

   /**
   * Get metricUnit
   * @return metricUnit
  **/
  @Schema(description = "")
  public String getMetricUnit() {
    return metricUnit;
  }

  public void setMetricUnit(String metricUnit) {
    this.metricUnit = metricUnit;
  }

  public AlarmPolicyConditionForModifyScalingPolicyInput threshold(String threshold) {
    this.threshold = threshold;
    return this;
  }

   /**
   * Get threshold
   * @return threshold
  **/
  @Schema(description = "")
  public String getThreshold() {
    return threshold;
  }

  public void setThreshold(String threshold) {
    this.threshold = threshold;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlarmPolicyConditionForModifyScalingPolicyInput alarmPolicyConditionForModifyScalingPolicyInput = (AlarmPolicyConditionForModifyScalingPolicyInput) o;
    return Objects.equals(this.comparisonOperator, alarmPolicyConditionForModifyScalingPolicyInput.comparisonOperator) &&
        Objects.equals(this.metricName, alarmPolicyConditionForModifyScalingPolicyInput.metricName) &&
        Objects.equals(this.metricUnit, alarmPolicyConditionForModifyScalingPolicyInput.metricUnit) &&
        Objects.equals(this.threshold, alarmPolicyConditionForModifyScalingPolicyInput.threshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comparisonOperator, metricName, metricUnit, threshold);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlarmPolicyConditionForModifyScalingPolicyInput {\n");
    
    sb.append("    comparisonOperator: ").append(toIndentedString(comparisonOperator)).append("\n");
    sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
    sb.append("    metricUnit: ").append(toIndentedString(metricUnit)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
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
