/*
 * mongodb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.mongodb.model;

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
 * ModifyDBInstanceSSLRequest
 */


public class ModifyDBInstanceSSLRequest {
  @SerializedName("InstanceId")
  private String instanceId = null;

  /**
   * Gets or Sets ssLAction
   */
  @JsonAdapter(SsLActionEnum.Adapter.class)
  public enum SsLActionEnum {
    CLOSE("Close"),
    OPEN("Open"),
    UPDATE("Update");

    private String value;

    SsLActionEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SsLActionEnum fromValue(String input) {
      for (SsLActionEnum b : SsLActionEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SsLActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SsLActionEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public SsLActionEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return SsLActionEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("SSLAction")
  private SsLActionEnum ssLAction = null;

  public ModifyDBInstanceSSLRequest instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public ModifyDBInstanceSSLRequest ssLAction(SsLActionEnum ssLAction) {
    this.ssLAction = ssLAction;
    return this;
  }

   /**
   * Get ssLAction
   * @return ssLAction
  **/
  @Schema(description = "")
  public SsLActionEnum getSsLAction() {
    return ssLAction;
  }

  public void setSsLAction(SsLActionEnum ssLAction) {
    this.ssLAction = ssLAction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyDBInstanceSSLRequest modifyDBInstanceSSLRequest = (ModifyDBInstanceSSLRequest) o;
    return Objects.equals(this.instanceId, modifyDBInstanceSSLRequest.instanceId) &&
        Objects.equals(this.ssLAction, modifyDBInstanceSSLRequest.ssLAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceId, ssLAction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyDBInstanceSSLRequest {\n");
    
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    ssLAction: ").append(toIndentedString(ssLAction)).append("\n");
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