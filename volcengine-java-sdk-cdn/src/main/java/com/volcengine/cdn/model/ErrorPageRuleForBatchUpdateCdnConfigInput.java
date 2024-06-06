/*
 * cdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cdn.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.cdn.model.ErrorPageActionForBatchUpdateCdnConfigInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ErrorPageRuleForBatchUpdateCdnConfigInput
 */



public class ErrorPageRuleForBatchUpdateCdnConfigInput {
  @SerializedName("ErrorPageAction")
  private ErrorPageActionForBatchUpdateCdnConfigInput errorPageAction = null;

  public ErrorPageRuleForBatchUpdateCdnConfigInput errorPageAction(ErrorPageActionForBatchUpdateCdnConfigInput errorPageAction) {
    this.errorPageAction = errorPageAction;
    return this;
  }

   /**
   * Get errorPageAction
   * @return errorPageAction
  **/
  @Valid
  @Schema(description = "")
  public ErrorPageActionForBatchUpdateCdnConfigInput getErrorPageAction() {
    return errorPageAction;
  }

  public void setErrorPageAction(ErrorPageActionForBatchUpdateCdnConfigInput errorPageAction) {
    this.errorPageAction = errorPageAction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorPageRuleForBatchUpdateCdnConfigInput errorPageRuleForBatchUpdateCdnConfigInput = (ErrorPageRuleForBatchUpdateCdnConfigInput) o;
    return Objects.equals(this.errorPageAction, errorPageRuleForBatchUpdateCdnConfigInput.errorPageAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorPageAction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorPageRuleForBatchUpdateCdnConfigInput {\n");
    
    sb.append("    errorPageAction: ").append(toIndentedString(errorPageAction)).append("\n");
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