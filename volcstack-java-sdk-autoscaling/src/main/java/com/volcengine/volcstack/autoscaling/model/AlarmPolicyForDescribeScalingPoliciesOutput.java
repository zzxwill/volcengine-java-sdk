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
import com.volcengine.volcstack.autoscaling.model.ConditionForDescribeScalingPoliciesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AlarmPolicyForDescribeScalingPoliciesOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-13T17:16:15.237208+08:00[Asia/Shanghai]")
public class AlarmPolicyForDescribeScalingPoliciesOutput {
  @SerializedName("Condition")
  private ConditionForDescribeScalingPoliciesOutput condition = null;

  @SerializedName("EvaluationCount")
  private Integer evaluationCount = null;

  @SerializedName("RuleType")
  private String ruleType = null;

  public AlarmPolicyForDescribeScalingPoliciesOutput condition(ConditionForDescribeScalingPoliciesOutput condition) {
    this.condition = condition;
    return this;
  }

   /**
   * Get condition
   * @return condition
  **/
  @Valid
  @Schema(description = "")
  public ConditionForDescribeScalingPoliciesOutput getCondition() {
    return condition;
  }

  public void setCondition(ConditionForDescribeScalingPoliciesOutput condition) {
    this.condition = condition;
  }

  public AlarmPolicyForDescribeScalingPoliciesOutput evaluationCount(Integer evaluationCount) {
    this.evaluationCount = evaluationCount;
    return this;
  }

   /**
   * Get evaluationCount
   * @return evaluationCount
  **/
  @Schema(description = "")
  public Integer getEvaluationCount() {
    return evaluationCount;
  }

  public void setEvaluationCount(Integer evaluationCount) {
    this.evaluationCount = evaluationCount;
  }

  public AlarmPolicyForDescribeScalingPoliciesOutput ruleType(String ruleType) {
    this.ruleType = ruleType;
    return this;
  }

   /**
   * Get ruleType
   * @return ruleType
  **/
  @Schema(description = "")
  public String getRuleType() {
    return ruleType;
  }

  public void setRuleType(String ruleType) {
    this.ruleType = ruleType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlarmPolicyForDescribeScalingPoliciesOutput alarmPolicyForDescribeScalingPoliciesOutput = (AlarmPolicyForDescribeScalingPoliciesOutput) o;
    return Objects.equals(this.condition, alarmPolicyForDescribeScalingPoliciesOutput.condition) &&
        Objects.equals(this.evaluationCount, alarmPolicyForDescribeScalingPoliciesOutput.evaluationCount) &&
        Objects.equals(this.ruleType, alarmPolicyForDescribeScalingPoliciesOutput.ruleType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(condition, evaluationCount, ruleType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlarmPolicyForDescribeScalingPoliciesOutput {\n");
    
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    evaluationCount: ").append(toIndentedString(evaluationCount)).append("\n");
    sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
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
