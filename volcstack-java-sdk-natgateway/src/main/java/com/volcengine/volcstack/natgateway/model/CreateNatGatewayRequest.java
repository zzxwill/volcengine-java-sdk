/*
 * natgateway
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcstack.natgateway.model;

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
 * CreateNatGatewayRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-03-24T18:21:06.216326+08:00[Asia/Shanghai]")
public class CreateNatGatewayRequest {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("NatGatewayName")
  private String natGatewayName = null;

  /**
   * Gets or Sets spec
   */
  @JsonAdapter(SpecEnum.Adapter.class)
  public enum SpecEnum {
    SMALL("Small"),
    MEDIUM("Medium"),
    LARGE("Large");

    private String value;

    SpecEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SpecEnum fromValue(String input) {
      for (SpecEnum b : SpecEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SpecEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SpecEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public SpecEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return SpecEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("Spec")
  private SpecEnum spec = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  public CreateNatGatewayRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
 @Size(min=1,max=255)  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateNatGatewayRequest natGatewayName(String natGatewayName) {
    this.natGatewayName = natGatewayName;
    return this;
  }

   /**
   * Get natGatewayName
   * @return natGatewayName
  **/
 @Size(min=1,max=128)  @Schema(description = "")
  public String getNatGatewayName() {
    return natGatewayName;
  }

  public void setNatGatewayName(String natGatewayName) {
    this.natGatewayName = natGatewayName;
  }

  public CreateNatGatewayRequest spec(SpecEnum spec) {
    this.spec = spec;
    return this;
  }

   /**
   * Get spec
   * @return spec
  **/
  @Schema(description = "")
  public SpecEnum getSpec() {
    return spec;
  }

  public void setSpec(SpecEnum spec) {
    this.spec = spec;
  }

  public CreateNatGatewayRequest subnetId(String subnetId) {
    this.subnetId = subnetId;
    return this;
  }

   /**
   * Get subnetId
   * @return subnetId
  **/
  @Schema(description = "")
  public String getSubnetId() {
    return subnetId;
  }

  public void setSubnetId(String subnetId) {
    this.subnetId = subnetId;
  }

  public CreateNatGatewayRequest vpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

   /**
   * Get vpcId
   * @return vpcId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getVpcId() {
    return vpcId;
  }

  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateNatGatewayRequest createNatGatewayRequest = (CreateNatGatewayRequest) o;
    return Objects.equals(this.description, createNatGatewayRequest.description) &&
        Objects.equals(this.natGatewayName, createNatGatewayRequest.natGatewayName) &&
        Objects.equals(this.spec, createNatGatewayRequest.spec) &&
        Objects.equals(this.subnetId, createNatGatewayRequest.subnetId) &&
        Objects.equals(this.vpcId, createNatGatewayRequest.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, natGatewayName, spec, subnetId, vpcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateNatGatewayRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    natGatewayName: ").append(toIndentedString(natGatewayName)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
