/*
 * iam20210801
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.iam20210801.model;

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
 * DetachPolicyInProjectRequest
 */


public class DetachPolicyInProjectRequest {
  @SerializedName("PolicyName")
  private String policyName = null;

  /**
   * Gets or Sets policyType
   */
  @JsonAdapter(PolicyTypeEnum.Adapter.class)
  public enum PolicyTypeEnum {
    SYSTEM("System"),
    CUSTOM("Custom");

    private String value;

    PolicyTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static PolicyTypeEnum fromValue(String input) {
      for (PolicyTypeEnum b : PolicyTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<PolicyTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PolicyTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public PolicyTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return PolicyTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("PolicyType")
  private PolicyTypeEnum policyType = null;

  @SerializedName("PrincipalName")
  private String principalName = null;

  /**
   * Gets or Sets principalType
   */
  @JsonAdapter(PrincipalTypeEnum.Adapter.class)
  public enum PrincipalTypeEnum {
    USER("User"),
    ROLE("Role"),
    USERGROUP("UserGroup");

    private String value;

    PrincipalTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static PrincipalTypeEnum fromValue(String input) {
      for (PrincipalTypeEnum b : PrincipalTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<PrincipalTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PrincipalTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public PrincipalTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return PrincipalTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("PrincipalType")
  private PrincipalTypeEnum principalType = null;

  @SerializedName("ProjectName")
  private List<String> projectName = null;

  public DetachPolicyInProjectRequest policyName(String policyName) {
    this.policyName = policyName;
    return this;
  }

   /**
   * Get policyName
   * @return policyName
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getPolicyName() {
    return policyName;
  }

  public void setPolicyName(String policyName) {
    this.policyName = policyName;
  }

  public DetachPolicyInProjectRequest policyType(PolicyTypeEnum policyType) {
    this.policyType = policyType;
    return this;
  }

   /**
   * Get policyType
   * @return policyType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public PolicyTypeEnum getPolicyType() {
    return policyType;
  }

  public void setPolicyType(PolicyTypeEnum policyType) {
    this.policyType = policyType;
  }

  public DetachPolicyInProjectRequest principalName(String principalName) {
    this.principalName = principalName;
    return this;
  }

   /**
   * Get principalName
   * @return principalName
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getPrincipalName() {
    return principalName;
  }

  public void setPrincipalName(String principalName) {
    this.principalName = principalName;
  }

  public DetachPolicyInProjectRequest principalType(PrincipalTypeEnum principalType) {
    this.principalType = principalType;
    return this;
  }

   /**
   * Get principalType
   * @return principalType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public PrincipalTypeEnum getPrincipalType() {
    return principalType;
  }

  public void setPrincipalType(PrincipalTypeEnum principalType) {
    this.principalType = principalType;
  }

  public DetachPolicyInProjectRequest projectName(List<String> projectName) {
    this.projectName = projectName;
    return this;
  }

  public DetachPolicyInProjectRequest addProjectNameItem(String projectNameItem) {
    if (this.projectName == null) {
      this.projectName = new ArrayList<String>();
    }
    this.projectName.add(projectNameItem);
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @Schema(description = "")
  public List<String> getProjectName() {
    return projectName;
  }

  public void setProjectName(List<String> projectName) {
    this.projectName = projectName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetachPolicyInProjectRequest detachPolicyInProjectRequest = (DetachPolicyInProjectRequest) o;
    return Objects.equals(this.policyName, detachPolicyInProjectRequest.policyName) &&
        Objects.equals(this.policyType, detachPolicyInProjectRequest.policyType) &&
        Objects.equals(this.principalName, detachPolicyInProjectRequest.principalName) &&
        Objects.equals(this.principalType, detachPolicyInProjectRequest.principalType) &&
        Objects.equals(this.projectName, detachPolicyInProjectRequest.projectName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyName, policyType, principalName, principalType, projectName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetachPolicyInProjectRequest {\n");
    
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
    sb.append("    principalName: ").append(toIndentedString(principalName)).append("\n");
    sb.append("    principalType: ").append(toIndentedString(principalType)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
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
