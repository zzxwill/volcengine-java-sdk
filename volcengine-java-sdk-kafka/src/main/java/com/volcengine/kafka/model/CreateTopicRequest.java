/*
 * kafka
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.kafka.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.kafka.model.AccessPolicyForCreateTopicInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateTopicRequest
 */


public class CreateTopicRequest {
  @SerializedName("AccessPolicies")
  private List<AccessPolicyForCreateTopicInput> accessPolicies = null;

  @SerializedName("AllAuthority")
  private Boolean allAuthority = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("Parameters")
  private String parameters = null;

  @SerializedName("PartitionNumber")
  private Integer partitionNumber = null;

  @SerializedName("ReplicaNumber")
  private Integer replicaNumber = null;

  @SerializedName("TopicName")
  private String topicName = null;

  public CreateTopicRequest accessPolicies(List<AccessPolicyForCreateTopicInput> accessPolicies) {
    this.accessPolicies = accessPolicies;
    return this;
  }

  public CreateTopicRequest addAccessPoliciesItem(AccessPolicyForCreateTopicInput accessPoliciesItem) {
    if (this.accessPolicies == null) {
      this.accessPolicies = new ArrayList<AccessPolicyForCreateTopicInput>();
    }
    this.accessPolicies.add(accessPoliciesItem);
    return this;
  }

   /**
   * Get accessPolicies
   * @return accessPolicies
  **/
  @Valid
  @Schema(description = "")
  public List<AccessPolicyForCreateTopicInput> getAccessPolicies() {
    return accessPolicies;
  }

  public void setAccessPolicies(List<AccessPolicyForCreateTopicInput> accessPolicies) {
    this.accessPolicies = accessPolicies;
  }

  public CreateTopicRequest allAuthority(Boolean allAuthority) {
    this.allAuthority = allAuthority;
    return this;
  }

   /**
   * Get allAuthority
   * @return allAuthority
  **/
  @Schema(description = "")
  public Boolean isAllAuthority() {
    return allAuthority;
  }

  public void setAllAuthority(Boolean allAuthority) {
    this.allAuthority = allAuthority;
  }

  public CreateTopicRequest description(String description) {
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

  public CreateTopicRequest instanceId(String instanceId) {
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

  public CreateTopicRequest parameters(String parameters) {
    this.parameters = parameters;
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @Schema(description = "")
  public String getParameters() {
    return parameters;
  }

  public void setParameters(String parameters) {
    this.parameters = parameters;
  }

  public CreateTopicRequest partitionNumber(Integer partitionNumber) {
    this.partitionNumber = partitionNumber;
    return this;
  }

   /**
   * Get partitionNumber
   * @return partitionNumber
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getPartitionNumber() {
    return partitionNumber;
  }

  public void setPartitionNumber(Integer partitionNumber) {
    this.partitionNumber = partitionNumber;
  }

  public CreateTopicRequest replicaNumber(Integer replicaNumber) {
    this.replicaNumber = replicaNumber;
    return this;
  }

   /**
   * Get replicaNumber
   * @return replicaNumber
  **/
  @Schema(description = "")
  public Integer getReplicaNumber() {
    return replicaNumber;
  }

  public void setReplicaNumber(Integer replicaNumber) {
    this.replicaNumber = replicaNumber;
  }

  public CreateTopicRequest topicName(String topicName) {
    this.topicName = topicName;
    return this;
  }

   /**
   * Get topicName
   * @return topicName
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getTopicName() {
    return topicName;
  }

  public void setTopicName(String topicName) {
    this.topicName = topicName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTopicRequest createTopicRequest = (CreateTopicRequest) o;
    return Objects.equals(this.accessPolicies, createTopicRequest.accessPolicies) &&
        Objects.equals(this.allAuthority, createTopicRequest.allAuthority) &&
        Objects.equals(this.description, createTopicRequest.description) &&
        Objects.equals(this.instanceId, createTopicRequest.instanceId) &&
        Objects.equals(this.parameters, createTopicRequest.parameters) &&
        Objects.equals(this.partitionNumber, createTopicRequest.partitionNumber) &&
        Objects.equals(this.replicaNumber, createTopicRequest.replicaNumber) &&
        Objects.equals(this.topicName, createTopicRequest.topicName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessPolicies, allAuthority, description, instanceId, parameters, partitionNumber, replicaNumber, topicName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTopicRequest {\n");
    
    sb.append("    accessPolicies: ").append(toIndentedString(accessPolicies)).append("\n");
    sb.append("    allAuthority: ").append(toIndentedString(allAuthority)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    partitionNumber: ").append(toIndentedString(partitionNumber)).append("\n");
    sb.append("    replicaNumber: ").append(toIndentedString(replicaNumber)).append("\n");
    sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
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
