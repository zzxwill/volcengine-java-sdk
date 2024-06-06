/*
 * volc_observe
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcobserve.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.volcobserve.model.ObjectForCreateObjectGroupInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateObjectGroupRequest
 */



public class CreateObjectGroupRequest {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("Objects")
  private List<ObjectForCreateObjectGroupInput> objects = null;

  public CreateObjectGroupRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateObjectGroupRequest objects(List<ObjectForCreateObjectGroupInput> objects) {
    this.objects = objects;
    return this;
  }

  public CreateObjectGroupRequest addObjectsItem(ObjectForCreateObjectGroupInput objectsItem) {
    if (this.objects == null) {
      this.objects = new ArrayList<ObjectForCreateObjectGroupInput>();
    }
    this.objects.add(objectsItem);
    return this;
  }

   /**
   * Get objects
   * @return objects
  **/
  @Valid
  @Schema(description = "")
  public List<ObjectForCreateObjectGroupInput> getObjects() {
    return objects;
  }

  public void setObjects(List<ObjectForCreateObjectGroupInput> objects) {
    this.objects = objects;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateObjectGroupRequest createObjectGroupRequest = (CreateObjectGroupRequest) o;
    return Objects.equals(this.name, createObjectGroupRequest.name) &&
        Objects.equals(this.objects, createObjectGroupRequest.objects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, objects);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateObjectGroupRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
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