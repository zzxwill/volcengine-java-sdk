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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * UntagResourcesRequest
 */



public class UntagResourcesRequest {
  @SerializedName("ResourceIds")
  private List<String> resourceIds = null;

  /**
   * Gets or Sets resourceType
   */
  @JsonAdapter(ResourceTypeEnum.Adapter.class)
  public enum ResourceTypeEnum {
    @SerializedName("BareMachine")
    BAREMACHINE("BareMachine"),
    @SerializedName("Cluster")
    CLUSTER("Cluster"),
    @SerializedName("NodePool")
    NODEPOOL("NodePool");

    private String value;

    ResourceTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ResourceTypeEnum fromValue(String input) {
      for (ResourceTypeEnum b : ResourceTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ResourceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResourceTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ResourceTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ResourceTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("ResourceType")
  private ResourceTypeEnum resourceType = null;

  @SerializedName("TagKeys")
  private List<String> tagKeys = null;

  public UntagResourcesRequest resourceIds(List<String> resourceIds) {
    this.resourceIds = resourceIds;
    return this;
  }

  public UntagResourcesRequest addResourceIdsItem(String resourceIdsItem) {
    if (this.resourceIds == null) {
      this.resourceIds = new ArrayList<String>();
    }
    this.resourceIds.add(resourceIdsItem);
    return this;
  }

   /**
   * Get resourceIds
   * @return resourceIds
  **/
  @Schema(description = "")
  public List<String> getResourceIds() {
    return resourceIds;
  }

  public void setResourceIds(List<String> resourceIds) {
    this.resourceIds = resourceIds;
  }

  public UntagResourcesRequest resourceType(ResourceTypeEnum resourceType) {
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Get resourceType
   * @return resourceType
  **/
  @Schema(description = "")
  public ResourceTypeEnum getResourceType() {
    return resourceType;
  }

  public void setResourceType(ResourceTypeEnum resourceType) {
    this.resourceType = resourceType;
  }

  public UntagResourcesRequest tagKeys(List<String> tagKeys) {
    this.tagKeys = tagKeys;
    return this;
  }

  public UntagResourcesRequest addTagKeysItem(String tagKeysItem) {
    if (this.tagKeys == null) {
      this.tagKeys = new ArrayList<String>();
    }
    this.tagKeys.add(tagKeysItem);
    return this;
  }

   /**
   * Get tagKeys
   * @return tagKeys
  **/
  @Schema(description = "")
  public List<String> getTagKeys() {
    return tagKeys;
  }

  public void setTagKeys(List<String> tagKeys) {
    this.tagKeys = tagKeys;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UntagResourcesRequest untagResourcesRequest = (UntagResourcesRequest) o;
    return Objects.equals(this.resourceIds, untagResourcesRequest.resourceIds) &&
        Objects.equals(this.resourceType, untagResourcesRequest.resourceType) &&
        Objects.equals(this.tagKeys, untagResourcesRequest.tagKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceIds, resourceType, tagKeys);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UntagResourcesRequest {\n");
    
    sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    tagKeys: ").append(toIndentedString(tagKeys)).append("\n");
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
