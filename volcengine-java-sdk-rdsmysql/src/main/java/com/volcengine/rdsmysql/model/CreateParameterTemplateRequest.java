/*
 * rds_mysql
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmysql.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.rdsmysql.model.TemplateParamForCreateParameterTemplateInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateParameterTemplateRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-19T10:12:05.954803+08:00[Asia/Shanghai]")
public class CreateParameterTemplateRequest {
  @SerializedName("TemplateDesc")
  private String templateDesc = null;

  @SerializedName("TemplateName")
  private String templateName = null;

  @SerializedName("TemplateParams")
  private List<TemplateParamForCreateParameterTemplateInput> templateParams = null;

  /**
   * Gets or Sets templateType
   */
  @JsonAdapter(TemplateTypeEnum.Adapter.class)
  public enum TemplateTypeEnum {
    MYSQL("MySQL");

    private String value;

    TemplateTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TemplateTypeEnum fromValue(String input) {
      for (TemplateTypeEnum b : TemplateTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TemplateTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TemplateTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TemplateTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TemplateTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("TemplateType")
  private TemplateTypeEnum templateType = null;

  /**
   * Gets or Sets templateTypeVersion
   */
  @JsonAdapter(TemplateTypeVersionEnum.Adapter.class)
  public enum TemplateTypeVersionEnum {
    _8_0("MySQL_8_0"),
    COMMUNITY_5_7("MySQL_Community_5_7");

    private String value;

    TemplateTypeVersionEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TemplateTypeVersionEnum fromValue(String input) {
      for (TemplateTypeVersionEnum b : TemplateTypeVersionEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TemplateTypeVersionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TemplateTypeVersionEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TemplateTypeVersionEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TemplateTypeVersionEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("TemplateTypeVersion")
  private TemplateTypeVersionEnum templateTypeVersion = null;

  public CreateParameterTemplateRequest templateDesc(String templateDesc) {
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

  public CreateParameterTemplateRequest templateName(String templateName) {
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

  public CreateParameterTemplateRequest templateParams(List<TemplateParamForCreateParameterTemplateInput> templateParams) {
    this.templateParams = templateParams;
    return this;
  }

  public CreateParameterTemplateRequest addTemplateParamsItem(TemplateParamForCreateParameterTemplateInput templateParamsItem) {
    if (this.templateParams == null) {
      this.templateParams = new ArrayList<TemplateParamForCreateParameterTemplateInput>();
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
  public List<TemplateParamForCreateParameterTemplateInput> getTemplateParams() {
    return templateParams;
  }

  public void setTemplateParams(List<TemplateParamForCreateParameterTemplateInput> templateParams) {
    this.templateParams = templateParams;
  }

  public CreateParameterTemplateRequest templateType(TemplateTypeEnum templateType) {
    this.templateType = templateType;
    return this;
  }

   /**
   * Get templateType
   * @return templateType
  **/
  @Schema(description = "")
  public TemplateTypeEnum getTemplateType() {
    return templateType;
  }

  public void setTemplateType(TemplateTypeEnum templateType) {
    this.templateType = templateType;
  }

  public CreateParameterTemplateRequest templateTypeVersion(TemplateTypeVersionEnum templateTypeVersion) {
    this.templateTypeVersion = templateTypeVersion;
    return this;
  }

   /**
   * Get templateTypeVersion
   * @return templateTypeVersion
  **/
  @Schema(description = "")
  public TemplateTypeVersionEnum getTemplateTypeVersion() {
    return templateTypeVersion;
  }

  public void setTemplateTypeVersion(TemplateTypeVersionEnum templateTypeVersion) {
    this.templateTypeVersion = templateTypeVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateParameterTemplateRequest createParameterTemplateRequest = (CreateParameterTemplateRequest) o;
    return Objects.equals(this.templateDesc, createParameterTemplateRequest.templateDesc) &&
        Objects.equals(this.templateName, createParameterTemplateRequest.templateName) &&
        Objects.equals(this.templateParams, createParameterTemplateRequest.templateParams) &&
        Objects.equals(this.templateType, createParameterTemplateRequest.templateType) &&
        Objects.equals(this.templateTypeVersion, createParameterTemplateRequest.templateTypeVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateDesc, templateName, templateParams, templateType, templateTypeVersion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateParameterTemplateRequest {\n");
    
    sb.append("    templateDesc: ").append(toIndentedString(templateDesc)).append("\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    sb.append("    templateParams: ").append(toIndentedString(templateParams)).append("\n");
    sb.append("    templateType: ").append(toIndentedString(templateType)).append("\n");
    sb.append("    templateTypeVersion: ").append(toIndentedString(templateTypeVersion)).append("\n");
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
