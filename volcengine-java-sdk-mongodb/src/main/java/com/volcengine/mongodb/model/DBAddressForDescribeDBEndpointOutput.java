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
 * DBAddressForDescribeDBEndpointOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-10T12:08:21.110021+08:00[Asia/Shanghai]")
public class DBAddressForDescribeDBEndpointOutput {
  @SerializedName("AddressDomain")
  private String addressDomain = null;

  @SerializedName("AddressIP")
  private String addressIP = null;

  @SerializedName("AddressPort")
  private String addressPort = null;

  /**
   * Gets or Sets addressType
   */
  @JsonAdapter(AddressTypeEnum.Adapter.class)
  public enum AddressTypeEnum {
    PRIMARY("Primary"),
    SECONDARY("Secondary");

    private String value;

    AddressTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AddressTypeEnum fromValue(String input) {
      for (AddressTypeEnum b : AddressTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AddressTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AddressTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public AddressTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return AddressTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("AddressType")
  private AddressTypeEnum addressType = null;

  @SerializedName("EipId")
  private String eipId = null;

  @SerializedName("NodeId")
  private String nodeId = null;

  public DBAddressForDescribeDBEndpointOutput addressDomain(String addressDomain) {
    this.addressDomain = addressDomain;
    return this;
  }

   /**
   * Get addressDomain
   * @return addressDomain
  **/
  @Schema(description = "")
  public String getAddressDomain() {
    return addressDomain;
  }

  public void setAddressDomain(String addressDomain) {
    this.addressDomain = addressDomain;
  }

  public DBAddressForDescribeDBEndpointOutput addressIP(String addressIP) {
    this.addressIP = addressIP;
    return this;
  }

   /**
   * Get addressIP
   * @return addressIP
  **/
  @Schema(description = "")
  public String getAddressIP() {
    return addressIP;
  }

  public void setAddressIP(String addressIP) {
    this.addressIP = addressIP;
  }

  public DBAddressForDescribeDBEndpointOutput addressPort(String addressPort) {
    this.addressPort = addressPort;
    return this;
  }

   /**
   * Get addressPort
   * @return addressPort
  **/
  @Schema(description = "")
  public String getAddressPort() {
    return addressPort;
  }

  public void setAddressPort(String addressPort) {
    this.addressPort = addressPort;
  }

  public DBAddressForDescribeDBEndpointOutput addressType(AddressTypeEnum addressType) {
    this.addressType = addressType;
    return this;
  }

   /**
   * Get addressType
   * @return addressType
  **/
  @Schema(description = "")
  public AddressTypeEnum getAddressType() {
    return addressType;
  }

  public void setAddressType(AddressTypeEnum addressType) {
    this.addressType = addressType;
  }

  public DBAddressForDescribeDBEndpointOutput eipId(String eipId) {
    this.eipId = eipId;
    return this;
  }

   /**
   * Get eipId
   * @return eipId
  **/
  @Schema(description = "")
  public String getEipId() {
    return eipId;
  }

  public void setEipId(String eipId) {
    this.eipId = eipId;
  }

  public DBAddressForDescribeDBEndpointOutput nodeId(String nodeId) {
    this.nodeId = nodeId;
    return this;
  }

   /**
   * Get nodeId
   * @return nodeId
  **/
  @Schema(description = "")
  public String getNodeId() {
    return nodeId;
  }

  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DBAddressForDescribeDBEndpointOutput dbAddressForDescribeDBEndpointOutput = (DBAddressForDescribeDBEndpointOutput) o;
    return Objects.equals(this.addressDomain, dbAddressForDescribeDBEndpointOutput.addressDomain) &&
        Objects.equals(this.addressIP, dbAddressForDescribeDBEndpointOutput.addressIP) &&
        Objects.equals(this.addressPort, dbAddressForDescribeDBEndpointOutput.addressPort) &&
        Objects.equals(this.addressType, dbAddressForDescribeDBEndpointOutput.addressType) &&
        Objects.equals(this.eipId, dbAddressForDescribeDBEndpointOutput.eipId) &&
        Objects.equals(this.nodeId, dbAddressForDescribeDBEndpointOutput.nodeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressDomain, addressIP, addressPort, addressType, eipId, nodeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DBAddressForDescribeDBEndpointOutput {\n");
    
    sb.append("    addressDomain: ").append(toIndentedString(addressDomain)).append("\n");
    sb.append("    addressIP: ").append(toIndentedString(addressIP)).append("\n");
    sb.append("    addressPort: ").append(toIndentedString(addressPort)).append("\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    eipId: ").append(toIndentedString(eipId)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
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
