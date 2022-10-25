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
import com.volcengine.vke.model.LoginForCreateDefaultNodePoolInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * SecurityForCreateDefaultNodePoolInput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-25T10:54:23.552084+08:00[Asia/Shanghai]")
public class SecurityForCreateDefaultNodePoolInput {
  @SerializedName("Login")
  private LoginForCreateDefaultNodePoolInput login = null;

  @SerializedName("SecurityGroupIds")
  private List<String> securityGroupIds = null;

  /**
   * Gets or Sets securityStrategies
   */
  @JsonAdapter(SecurityStrategiesEnum.Adapter.class)
  public enum SecurityStrategiesEnum {
    HIDS("Hids");

    private String value;

    SecurityStrategiesEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SecurityStrategiesEnum fromValue(String input) {
      for (SecurityStrategiesEnum b : SecurityStrategiesEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SecurityStrategiesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SecurityStrategiesEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public SecurityStrategiesEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return SecurityStrategiesEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("SecurityStrategies")
  private List<SecurityStrategiesEnum> securityStrategies = null;

  public SecurityForCreateDefaultNodePoolInput login(LoginForCreateDefaultNodePoolInput login) {
    this.login = login;
    return this;
  }

   /**
   * Get login
   * @return login
  **/
  @Valid
  @Schema(description = "")
  public LoginForCreateDefaultNodePoolInput getLogin() {
    return login;
  }

  public void setLogin(LoginForCreateDefaultNodePoolInput login) {
    this.login = login;
  }

  public SecurityForCreateDefaultNodePoolInput securityGroupIds(List<String> securityGroupIds) {
    this.securityGroupIds = securityGroupIds;
    return this;
  }

  public SecurityForCreateDefaultNodePoolInput addSecurityGroupIdsItem(String securityGroupIdsItem) {
    if (this.securityGroupIds == null) {
      this.securityGroupIds = new ArrayList<String>();
    }
    this.securityGroupIds.add(securityGroupIdsItem);
    return this;
  }

   /**
   * Get securityGroupIds
   * @return securityGroupIds
  **/
  @Schema(description = "")
  public List<String> getSecurityGroupIds() {
    return securityGroupIds;
  }

  public void setSecurityGroupIds(List<String> securityGroupIds) {
    this.securityGroupIds = securityGroupIds;
  }

  public SecurityForCreateDefaultNodePoolInput securityStrategies(List<SecurityStrategiesEnum> securityStrategies) {
    this.securityStrategies = securityStrategies;
    return this;
  }

  public SecurityForCreateDefaultNodePoolInput addSecurityStrategiesItem(SecurityStrategiesEnum securityStrategiesItem) {
    if (this.securityStrategies == null) {
      this.securityStrategies = new ArrayList<SecurityStrategiesEnum>();
    }
    this.securityStrategies.add(securityStrategiesItem);
    return this;
  }

   /**
   * Get securityStrategies
   * @return securityStrategies
  **/
  @Schema(description = "")
  public List<SecurityStrategiesEnum> getSecurityStrategies() {
    return securityStrategies;
  }

  public void setSecurityStrategies(List<SecurityStrategiesEnum> securityStrategies) {
    this.securityStrategies = securityStrategies;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityForCreateDefaultNodePoolInput securityForCreateDefaultNodePoolInput = (SecurityForCreateDefaultNodePoolInput) o;
    return Objects.equals(this.login, securityForCreateDefaultNodePoolInput.login) &&
        Objects.equals(this.securityGroupIds, securityForCreateDefaultNodePoolInput.securityGroupIds) &&
        Objects.equals(this.securityStrategies, securityForCreateDefaultNodePoolInput.securityStrategies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(login, securityGroupIds, securityStrategies);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityForCreateDefaultNodePoolInput {\n");
    
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    securityGroupIds: ").append(toIndentedString(securityGroupIds)).append("\n");
    sb.append("    securityStrategies: ").append(toIndentedString(securityStrategies)).append("\n");
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
