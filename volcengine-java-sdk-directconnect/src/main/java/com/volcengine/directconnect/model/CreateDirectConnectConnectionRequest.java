/*
 * directconnect
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.directconnect.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.directconnect.model.TagForCreateDirectConnectConnectionInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateDirectConnectConnectionRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-20T11:35:26.992284+08:00[Asia/Shanghai]")
public class CreateDirectConnectConnectionRequest {
  @SerializedName("Bandwidth")
  private Integer bandwidth = null;

  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("CustomerContactEmail")
  private String customerContactEmail = null;

  @SerializedName("CustomerContactPhone")
  private String customerContactPhone = null;

  @SerializedName("CustomerName")
  private String customerName = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("DirectConnectAccessPointId")
  private String directConnectAccessPointId = null;

  @SerializedName("DirectConnectConnectionName")
  private String directConnectConnectionName = null;

  @SerializedName("LineOperator")
  private String lineOperator = null;

  @SerializedName("PeerLocation")
  private String peerLocation = null;

  @SerializedName("PortType")
  private String portType = null;

  @SerializedName("Tags")
  private List<TagForCreateDirectConnectConnectionInput> tags = null;

  public CreateDirectConnectConnectionRequest bandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
    return this;
  }

   /**
   * Get bandwidth
   * @return bandwidth
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getBandwidth() {
    return bandwidth;
  }

  public void setBandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
  }

  public CreateDirectConnectConnectionRequest clientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }

   /**
   * Get clientToken
   * @return clientToken
  **/
  @Schema(description = "")
  public String getClientToken() {
    return clientToken;
  }

  public void setClientToken(String clientToken) {
    this.clientToken = clientToken;
  }

  public CreateDirectConnectConnectionRequest customerContactEmail(String customerContactEmail) {
    this.customerContactEmail = customerContactEmail;
    return this;
  }

   /**
   * Get customerContactEmail
   * @return customerContactEmail
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getCustomerContactEmail() {
    return customerContactEmail;
  }

  public void setCustomerContactEmail(String customerContactEmail) {
    this.customerContactEmail = customerContactEmail;
  }

  public CreateDirectConnectConnectionRequest customerContactPhone(String customerContactPhone) {
    this.customerContactPhone = customerContactPhone;
    return this;
  }

   /**
   * Get customerContactPhone
   * @return customerContactPhone
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getCustomerContactPhone() {
    return customerContactPhone;
  }

  public void setCustomerContactPhone(String customerContactPhone) {
    this.customerContactPhone = customerContactPhone;
  }

  public CreateDirectConnectConnectionRequest customerName(String customerName) {
    this.customerName = customerName;
    return this;
  }

   /**
   * Get customerName
   * @return customerName
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public CreateDirectConnectConnectionRequest description(String description) {
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

  public CreateDirectConnectConnectionRequest directConnectAccessPointId(String directConnectAccessPointId) {
    this.directConnectAccessPointId = directConnectAccessPointId;
    return this;
  }

   /**
   * Get directConnectAccessPointId
   * @return directConnectAccessPointId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getDirectConnectAccessPointId() {
    return directConnectAccessPointId;
  }

  public void setDirectConnectAccessPointId(String directConnectAccessPointId) {
    this.directConnectAccessPointId = directConnectAccessPointId;
  }

  public CreateDirectConnectConnectionRequest directConnectConnectionName(String directConnectConnectionName) {
    this.directConnectConnectionName = directConnectConnectionName;
    return this;
  }

   /**
   * Get directConnectConnectionName
   * @return directConnectConnectionName
  **/
  @Schema(description = "")
  public String getDirectConnectConnectionName() {
    return directConnectConnectionName;
  }

  public void setDirectConnectConnectionName(String directConnectConnectionName) {
    this.directConnectConnectionName = directConnectConnectionName;
  }

  public CreateDirectConnectConnectionRequest lineOperator(String lineOperator) {
    this.lineOperator = lineOperator;
    return this;
  }

   /**
   * Get lineOperator
   * @return lineOperator
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getLineOperator() {
    return lineOperator;
  }

  public void setLineOperator(String lineOperator) {
    this.lineOperator = lineOperator;
  }

  public CreateDirectConnectConnectionRequest peerLocation(String peerLocation) {
    this.peerLocation = peerLocation;
    return this;
  }

   /**
   * Get peerLocation
   * @return peerLocation
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getPeerLocation() {
    return peerLocation;
  }

  public void setPeerLocation(String peerLocation) {
    this.peerLocation = peerLocation;
  }

  public CreateDirectConnectConnectionRequest portType(String portType) {
    this.portType = portType;
    return this;
  }

   /**
   * Get portType
   * @return portType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getPortType() {
    return portType;
  }

  public void setPortType(String portType) {
    this.portType = portType;
  }

  public CreateDirectConnectConnectionRequest tags(List<TagForCreateDirectConnectConnectionInput> tags) {
    this.tags = tags;
    return this;
  }

  public CreateDirectConnectConnectionRequest addTagsItem(TagForCreateDirectConnectConnectionInput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForCreateDirectConnectConnectionInput>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Valid
  @Schema(description = "")
  public List<TagForCreateDirectConnectConnectionInput> getTags() {
    return tags;
  }

  public void setTags(List<TagForCreateDirectConnectConnectionInput> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDirectConnectConnectionRequest createDirectConnectConnectionRequest = (CreateDirectConnectConnectionRequest) o;
    return Objects.equals(this.bandwidth, createDirectConnectConnectionRequest.bandwidth) &&
        Objects.equals(this.clientToken, createDirectConnectConnectionRequest.clientToken) &&
        Objects.equals(this.customerContactEmail, createDirectConnectConnectionRequest.customerContactEmail) &&
        Objects.equals(this.customerContactPhone, createDirectConnectConnectionRequest.customerContactPhone) &&
        Objects.equals(this.customerName, createDirectConnectConnectionRequest.customerName) &&
        Objects.equals(this.description, createDirectConnectConnectionRequest.description) &&
        Objects.equals(this.directConnectAccessPointId, createDirectConnectConnectionRequest.directConnectAccessPointId) &&
        Objects.equals(this.directConnectConnectionName, createDirectConnectConnectionRequest.directConnectConnectionName) &&
        Objects.equals(this.lineOperator, createDirectConnectConnectionRequest.lineOperator) &&
        Objects.equals(this.peerLocation, createDirectConnectConnectionRequest.peerLocation) &&
        Objects.equals(this.portType, createDirectConnectConnectionRequest.portType) &&
        Objects.equals(this.tags, createDirectConnectConnectionRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bandwidth, clientToken, customerContactEmail, customerContactPhone, customerName, description, directConnectAccessPointId, directConnectConnectionName, lineOperator, peerLocation, portType, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDirectConnectConnectionRequest {\n");
    
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    customerContactEmail: ").append(toIndentedString(customerContactEmail)).append("\n");
    sb.append("    customerContactPhone: ").append(toIndentedString(customerContactPhone)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    directConnectAccessPointId: ").append(toIndentedString(directConnectAccessPointId)).append("\n");
    sb.append("    directConnectConnectionName: ").append(toIndentedString(directConnectConnectionName)).append("\n");
    sb.append("    lineOperator: ").append(toIndentedString(lineOperator)).append("\n");
    sb.append("    peerLocation: ").append(toIndentedString(peerLocation)).append("\n");
    sb.append("    portType: ").append(toIndentedString(portType)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
