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
import com.volcengine.cdn.model.RedirectionRuleForBatchUpdateCdnConfigInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RedirectionRewriteForBatchUpdateCdnConfigInput
 */



public class RedirectionRewriteForBatchUpdateCdnConfigInput {
  @SerializedName("RedirectionRule")
  private List<RedirectionRuleForBatchUpdateCdnConfigInput> redirectionRule = null;

  @SerializedName("Switch")
  private Boolean _switch = null;

  public RedirectionRewriteForBatchUpdateCdnConfigInput redirectionRule(List<RedirectionRuleForBatchUpdateCdnConfigInput> redirectionRule) {
    this.redirectionRule = redirectionRule;
    return this;
  }

  public RedirectionRewriteForBatchUpdateCdnConfigInput addRedirectionRuleItem(RedirectionRuleForBatchUpdateCdnConfigInput redirectionRuleItem) {
    if (this.redirectionRule == null) {
      this.redirectionRule = new ArrayList<RedirectionRuleForBatchUpdateCdnConfigInput>();
    }
    this.redirectionRule.add(redirectionRuleItem);
    return this;
  }

   /**
   * Get redirectionRule
   * @return redirectionRule
  **/
  @Valid
  @Schema(description = "")
  public List<RedirectionRuleForBatchUpdateCdnConfigInput> getRedirectionRule() {
    return redirectionRule;
  }

  public void setRedirectionRule(List<RedirectionRuleForBatchUpdateCdnConfigInput> redirectionRule) {
    this.redirectionRule = redirectionRule;
  }

  public RedirectionRewriteForBatchUpdateCdnConfigInput _switch(Boolean _switch) {
    this._switch = _switch;
    return this;
  }

   /**
   * Get _switch
   * @return _switch
  **/
  @Schema(description = "")
  public Boolean isSwitch() {
    return _switch;
  }

  public void setSwitch(Boolean _switch) {
    this._switch = _switch;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedirectionRewriteForBatchUpdateCdnConfigInput redirectionRewriteForBatchUpdateCdnConfigInput = (RedirectionRewriteForBatchUpdateCdnConfigInput) o;
    return Objects.equals(this.redirectionRule, redirectionRewriteForBatchUpdateCdnConfigInput.redirectionRule) &&
        Objects.equals(this._switch, redirectionRewriteForBatchUpdateCdnConfigInput._switch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(redirectionRule, _switch);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedirectionRewriteForBatchUpdateCdnConfigInput {\n");
    
    sb.append("    redirectionRule: ").append(toIndentedString(redirectionRule)).append("\n");
    sb.append("    _switch: ").append(toIndentedString(_switch)).append("\n");
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