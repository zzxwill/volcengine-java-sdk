/*
 * ecs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.ecs.model;

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
 * PlacementForRunInstancesInput
 */



public class PlacementForRunInstancesInput {
  @SerializedName("Affinity")
  private String affinity = null;

  @SerializedName("DedicatedHostClusterId")
  private String dedicatedHostClusterId = null;

  @SerializedName("DedicatedHostId")
  private String dedicatedHostId = null;

  @SerializedName("Tenancy")
  private String tenancy = null;

  public PlacementForRunInstancesInput affinity(String affinity) {
    this.affinity = affinity;
    return this;
  }

   /**
   * Get affinity
   * @return affinity
  **/
  @Schema(description = "")
  public String getAffinity() {
    return affinity;
  }

  public void setAffinity(String affinity) {
    this.affinity = affinity;
  }

  public PlacementForRunInstancesInput dedicatedHostClusterId(String dedicatedHostClusterId) {
    this.dedicatedHostClusterId = dedicatedHostClusterId;
    return this;
  }

   /**
   * Get dedicatedHostClusterId
   * @return dedicatedHostClusterId
  **/
  @Schema(description = "")
  public String getDedicatedHostClusterId() {
    return dedicatedHostClusterId;
  }

  public void setDedicatedHostClusterId(String dedicatedHostClusterId) {
    this.dedicatedHostClusterId = dedicatedHostClusterId;
  }

  public PlacementForRunInstancesInput dedicatedHostId(String dedicatedHostId) {
    this.dedicatedHostId = dedicatedHostId;
    return this;
  }

   /**
   * Get dedicatedHostId
   * @return dedicatedHostId
  **/
  @Schema(description = "")
  public String getDedicatedHostId() {
    return dedicatedHostId;
  }

  public void setDedicatedHostId(String dedicatedHostId) {
    this.dedicatedHostId = dedicatedHostId;
  }

  public PlacementForRunInstancesInput tenancy(String tenancy) {
    this.tenancy = tenancy;
    return this;
  }

   /**
   * Get tenancy
   * @return tenancy
  **/
  @Schema(description = "")
  public String getTenancy() {
    return tenancy;
  }

  public void setTenancy(String tenancy) {
    this.tenancy = tenancy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlacementForRunInstancesInput placementForRunInstancesInput = (PlacementForRunInstancesInput) o;
    return Objects.equals(this.affinity, placementForRunInstancesInput.affinity) &&
        Objects.equals(this.dedicatedHostClusterId, placementForRunInstancesInput.dedicatedHostClusterId) &&
        Objects.equals(this.dedicatedHostId, placementForRunInstancesInput.dedicatedHostId) &&
        Objects.equals(this.tenancy, placementForRunInstancesInput.tenancy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affinity, dedicatedHostClusterId, dedicatedHostId, tenancy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlacementForRunInstancesInput {\n");
    
    sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
    sb.append("    dedicatedHostClusterId: ").append(toIndentedString(dedicatedHostClusterId)).append("\n");
    sb.append("    dedicatedHostId: ").append(toIndentedString(dedicatedHostId)).append("\n");
    sb.append("    tenancy: ").append(toIndentedString(tenancy)).append("\n");
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
