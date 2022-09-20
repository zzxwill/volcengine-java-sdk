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

package com.volcengine.natgateway.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeNatGatewaysRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-20T11:35:38.283928+08:00[Asia/Shanghai]")
public class DescribeNatGatewaysRequest {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("NatGatewayIds")
  private List<String> natGatewayIds = null;

  @SerializedName("NatGatewayName")
  private String natGatewayName = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

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

  public DescribeNatGatewaysRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DescribeNatGatewaysRequest natGatewayIds(List<String> natGatewayIds) {
    this.natGatewayIds = natGatewayIds;
    return this;
  }

  public DescribeNatGatewaysRequest addNatGatewayIdsItem(String natGatewayIdsItem) {
    if (this.natGatewayIds == null) {
      this.natGatewayIds = new ArrayList<String>();
    }
    this.natGatewayIds.add(natGatewayIdsItem);
    return this;
  }

   /**
   * Get natGatewayIds
   * @return natGatewayIds
  **/
  @Schema(description = "")
  public List<String> getNatGatewayIds() {
    return natGatewayIds;
  }

  public void setNatGatewayIds(List<String> natGatewayIds) {
    this.natGatewayIds = natGatewayIds;
  }

  public DescribeNatGatewaysRequest natGatewayName(String natGatewayName) {
    this.natGatewayName = natGatewayName;
    return this;
  }

   /**
   * Get natGatewayName
   * @return natGatewayName
  **/
  @Schema(description = "")
  public String getNatGatewayName() {
    return natGatewayName;
  }

  public void setNatGatewayName(String natGatewayName) {
    this.natGatewayName = natGatewayName;
  }

  public DescribeNatGatewaysRequest pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  @Schema(description = "")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public DescribeNatGatewaysRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * maximum: 100
   * @return pageSize
  **/
 @Max(100)  @Schema(description = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public DescribeNatGatewaysRequest spec(SpecEnum spec) {
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

  public DescribeNatGatewaysRequest subnetId(String subnetId) {
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

  public DescribeNatGatewaysRequest vpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

   /**
   * Get vpcId
   * @return vpcId
  **/
  @Schema(description = "")
  public String getVpcId() {
    return vpcId;
  }

  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeNatGatewaysRequest describeNatGatewaysRequest = (DescribeNatGatewaysRequest) o;
    return Objects.equals(this.description, describeNatGatewaysRequest.description) &&
        Objects.equals(this.natGatewayIds, describeNatGatewaysRequest.natGatewayIds) &&
        Objects.equals(this.natGatewayName, describeNatGatewaysRequest.natGatewayName) &&
        Objects.equals(this.pageNumber, describeNatGatewaysRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeNatGatewaysRequest.pageSize) &&
        Objects.equals(this.spec, describeNatGatewaysRequest.spec) &&
        Objects.equals(this.subnetId, describeNatGatewaysRequest.subnetId) &&
        Objects.equals(this.vpcId, describeNatGatewaysRequest.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, natGatewayIds, natGatewayName, pageNumber, pageSize, spec, subnetId, vpcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeNatGatewaysRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    natGatewayIds: ").append(toIndentedString(natGatewayIds)).append("\n");
    sb.append("    natGatewayName: ").append(toIndentedString(natGatewayName)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
