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
import com.volcengine.vke.model.AutoScalingForCreateNodePoolInput;
import com.volcengine.vke.model.KubernetesConfigForCreateNodePoolInput;
import com.volcengine.vke.model.NodeConfigForCreateNodePoolInput;
import com.volcengine.vke.model.TagForCreateNodePoolInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateNodePoolRequest
 */


public class CreateNodePoolRequest {
  @SerializedName("AutoScaling")
  private AutoScalingForCreateNodePoolInput autoScaling = null;

  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("ClusterId")
  private String clusterId = null;

  @SerializedName("KubernetesConfig")
  private KubernetesConfigForCreateNodePoolInput kubernetesConfig = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("NodeConfig")
  private NodeConfigForCreateNodePoolInput nodeConfig = null;

  @SerializedName("Tags")
  private List<TagForCreateNodePoolInput> tags = null;

  public CreateNodePoolRequest autoScaling(AutoScalingForCreateNodePoolInput autoScaling) {
    this.autoScaling = autoScaling;
    return this;
  }

   /**
   * Get autoScaling
   * @return autoScaling
  **/
  @Valid
  @Schema(description = "")
  public AutoScalingForCreateNodePoolInput getAutoScaling() {
    return autoScaling;
  }

  public void setAutoScaling(AutoScalingForCreateNodePoolInput autoScaling) {
    this.autoScaling = autoScaling;
  }

  public CreateNodePoolRequest clientToken(String clientToken) {
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

  public CreateNodePoolRequest clusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

   /**
   * Get clusterId
   * @return clusterId
  **/
  @Schema(description = "")
  public String getClusterId() {
    return clusterId;
  }

  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  public CreateNodePoolRequest kubernetesConfig(KubernetesConfigForCreateNodePoolInput kubernetesConfig) {
    this.kubernetesConfig = kubernetesConfig;
    return this;
  }

   /**
   * Get kubernetesConfig
   * @return kubernetesConfig
  **/
  @Valid
  @Schema(description = "")
  public KubernetesConfigForCreateNodePoolInput getKubernetesConfig() {
    return kubernetesConfig;
  }

  public void setKubernetesConfig(KubernetesConfigForCreateNodePoolInput kubernetesConfig) {
    this.kubernetesConfig = kubernetesConfig;
  }

  public CreateNodePoolRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateNodePoolRequest nodeConfig(NodeConfigForCreateNodePoolInput nodeConfig) {
    this.nodeConfig = nodeConfig;
    return this;
  }

   /**
   * Get nodeConfig
   * @return nodeConfig
  **/
  @Valid
  @Schema(description = "")
  public NodeConfigForCreateNodePoolInput getNodeConfig() {
    return nodeConfig;
  }

  public void setNodeConfig(NodeConfigForCreateNodePoolInput nodeConfig) {
    this.nodeConfig = nodeConfig;
  }

  public CreateNodePoolRequest tags(List<TagForCreateNodePoolInput> tags) {
    this.tags = tags;
    return this;
  }

  public CreateNodePoolRequest addTagsItem(TagForCreateNodePoolInput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForCreateNodePoolInput>();
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
  public List<TagForCreateNodePoolInput> getTags() {
    return tags;
  }

  public void setTags(List<TagForCreateNodePoolInput> tags) {
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
    CreateNodePoolRequest createNodePoolRequest = (CreateNodePoolRequest) o;
    return Objects.equals(this.autoScaling, createNodePoolRequest.autoScaling) &&
        Objects.equals(this.clientToken, createNodePoolRequest.clientToken) &&
        Objects.equals(this.clusterId, createNodePoolRequest.clusterId) &&
        Objects.equals(this.kubernetesConfig, createNodePoolRequest.kubernetesConfig) &&
        Objects.equals(this.name, createNodePoolRequest.name) &&
        Objects.equals(this.nodeConfig, createNodePoolRequest.nodeConfig) &&
        Objects.equals(this.tags, createNodePoolRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoScaling, clientToken, clusterId, kubernetesConfig, name, nodeConfig, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateNodePoolRequest {\n");
    
    sb.append("    autoScaling: ").append(toIndentedString(autoScaling)).append("\n");
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    kubernetesConfig: ").append(toIndentedString(kubernetesConfig)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodeConfig: ").append(toIndentedString(nodeConfig)).append("\n");
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
