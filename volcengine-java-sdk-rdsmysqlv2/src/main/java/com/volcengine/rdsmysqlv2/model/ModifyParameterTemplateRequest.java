/*
 * rds_mysql_v2
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmysqlv2.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.rdsmysqlv2.model.TemplateParamForModifyParameterTemplateInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ModifyParameterTemplateRequest
 */


public class ModifyParameterTemplateRequest {
  @SerializedName("TemplateDesc")
  private String templateDesc = null;

  @SerializedName("TemplateId")
  private String templateId = null;

  @SerializedName("TemplateName")
  private String templateName = null;

  @SerializedName("TemplateParams")
  private List<TemplateParamForModifyParameterTemplateInput> templateParams = null;

  public ModifyParameterTemplateRequest templateDesc(String templateDesc) {
    this.templateDesc = templateDesc;
    return this;
  }

   /**
   * Get templateDesc
   * @return templateDesc
  **/
 @Size(max=200)  @Schema(description = "")
  public String getTemplateDesc() {
    return templateDesc;
  }

  public void setTemplateDesc(String templateDesc) {
    this.templateDesc = templateDesc;
  }

  public ModifyParameterTemplateRequest templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * Get templateId
   * @return templateId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  public ModifyParameterTemplateRequest templateName(String templateName) {
    this.templateName = templateName;
    return this;
  }

   /**
   * Get templateName
   * @return templateName
  **/
 @Size(min=2,max=64)  @Schema(description = "")
  public String getTemplateName() {
    return templateName;
  }

  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }

  public ModifyParameterTemplateRequest templateParams(List<TemplateParamForModifyParameterTemplateInput> templateParams) {
    this.templateParams = templateParams;
    return this;
  }

  public ModifyParameterTemplateRequest addTemplateParamsItem(TemplateParamForModifyParameterTemplateInput templateParamsItem) {
    if (this.templateParams == null) {
      this.templateParams = new ArrayList<TemplateParamForModifyParameterTemplateInput>();
    }
    this.templateParams.add(templateParamsItem);
    return this;
  }

   /**
   * Get templateParams
   * @return templateParams
  **/
  @Valid
  @Schema(description = "")
  public List<TemplateParamForModifyParameterTemplateInput> getTemplateParams() {
    return templateParams;
  }

  public void setTemplateParams(List<TemplateParamForModifyParameterTemplateInput> templateParams) {
    this.templateParams = templateParams;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyParameterTemplateRequest modifyParameterTemplateRequest = (ModifyParameterTemplateRequest) o;
    return Objects.equals(this.templateDesc, modifyParameterTemplateRequest.templateDesc) &&
        Objects.equals(this.templateId, modifyParameterTemplateRequest.templateId) &&
        Objects.equals(this.templateName, modifyParameterTemplateRequest.templateName) &&
        Objects.equals(this.templateParams, modifyParameterTemplateRequest.templateParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateDesc, templateId, templateName, templateParams);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyParameterTemplateRequest {\n");
    
    sb.append("    templateDesc: ").append(toIndentedString(templateDesc)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    sb.append("    templateParams: ").append(toIndentedString(templateParams)).append("\n");
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