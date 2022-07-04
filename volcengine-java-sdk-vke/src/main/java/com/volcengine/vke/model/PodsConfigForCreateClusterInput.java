/*
 * vke
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vke.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vke.model.FlannelConfigForCreateClusterInput;
import com.volcengine.vke.model.VpcCniConfigForCreateClusterInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PodsConfigForCreateClusterInput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-04T12:08:56.909838+08:00[Asia/Shanghai]")
public class PodsConfigForCreateClusterInput {
  @SerializedName("FlannelConfig")
  private FlannelConfigForCreateClusterInput flannelConfig = null;

  /**
   * Gets or Sets podNetworkMode
   */
  @JsonAdapter(PodNetworkModeEnum.Adapter.class)
  public enum PodNetworkModeEnum {
    CARMA("Carma"),
    DEFAULT("Default"),
    FLANNEL("Flannel"),
    VPCCNIDEDICATED("VpcCniDedicated"),
    VPCCNISHARED("VpcCniShared");

    private String value;

    PodNetworkModeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static PodNetworkModeEnum fromValue(String input) {
      for (PodNetworkModeEnum b : PodNetworkModeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<PodNetworkModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PodNetworkModeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public PodNetworkModeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return PodNetworkModeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("PodNetworkMode")
  private PodNetworkModeEnum podNetworkMode = null;

  @SerializedName("VpcCniConfig")
  private VpcCniConfigForCreateClusterInput vpcCniConfig = null;

  public PodsConfigForCreateClusterInput flannelConfig(FlannelConfigForCreateClusterInput flannelConfig) {
    this.flannelConfig = flannelConfig;
    return this;
  }

   /**
   * Get flannelConfig
   * @return flannelConfig
  **/
  @Valid
  @Schema(description = "")
  public FlannelConfigForCreateClusterInput getFlannelConfig() {
    return flannelConfig;
  }

  public void setFlannelConfig(FlannelConfigForCreateClusterInput flannelConfig) {
    this.flannelConfig = flannelConfig;
  }

  public PodsConfigForCreateClusterInput podNetworkMode(PodNetworkModeEnum podNetworkMode) {
    this.podNetworkMode = podNetworkMode;
    return this;
  }

   /**
   * Get podNetworkMode
   * @return podNetworkMode
  **/
  @Schema(description = "")
  public PodNetworkModeEnum getPodNetworkMode() {
    return podNetworkMode;
  }

  public void setPodNetworkMode(PodNetworkModeEnum podNetworkMode) {
    this.podNetworkMode = podNetworkMode;
  }

  public PodsConfigForCreateClusterInput vpcCniConfig(VpcCniConfigForCreateClusterInput vpcCniConfig) {
    this.vpcCniConfig = vpcCniConfig;
    return this;
  }

   /**
   * Get vpcCniConfig
   * @return vpcCniConfig
  **/
  @Valid
  @Schema(description = "")
  public VpcCniConfigForCreateClusterInput getVpcCniConfig() {
    return vpcCniConfig;
  }

  public void setVpcCniConfig(VpcCniConfigForCreateClusterInput vpcCniConfig) {
    this.vpcCniConfig = vpcCniConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PodsConfigForCreateClusterInput podsConfigForCreateClusterInput = (PodsConfigForCreateClusterInput) o;
    return Objects.equals(this.flannelConfig, podsConfigForCreateClusterInput.flannelConfig) &&
        Objects.equals(this.podNetworkMode, podsConfigForCreateClusterInput.podNetworkMode) &&
        Objects.equals(this.vpcCniConfig, podsConfigForCreateClusterInput.vpcCniConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flannelConfig, podNetworkMode, vpcCniConfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PodsConfigForCreateClusterInput {\n");
    
    sb.append("    flannelConfig: ").append(toIndentedString(flannelConfig)).append("\n");
    sb.append("    podNetworkMode: ").append(toIndentedString(podNetworkMode)).append("\n");
    sb.append("    vpcCniConfig: ").append(toIndentedString(vpcCniConfig)).append("\n");
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