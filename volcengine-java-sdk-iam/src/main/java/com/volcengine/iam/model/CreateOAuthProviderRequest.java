/*
 * iam
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.iam.model;

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
 * CreateOAuthProviderRequest
 */


public class CreateOAuthProviderRequest {
  @SerializedName("AuthorizeTemplate")
  private String authorizeTemplate = null;

  @SerializedName("AuthorizeURL")
  private String authorizeURL = null;

  @SerializedName("ClientId")
  private String clientId = null;

  @SerializedName("ClientSecret")
  private String clientSecret = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("IdentityMapType")
  private Integer identityMapType = null;

  @SerializedName("IdpIdentityKey")
  private String idpIdentityKey = null;

  @SerializedName("OAuthProviderName")
  private String oauthProviderName = null;

  @SerializedName("SSOType")
  private Integer ssOType = null;

  @SerializedName("Scope")
  private String scope = null;

  @SerializedName("Status")
  private Integer status = null;

  @SerializedName("TokenURL")
  private String tokenURL = null;

  @SerializedName("UserInfoURL")
  private String userInfoURL = null;

  public CreateOAuthProviderRequest authorizeTemplate(String authorizeTemplate) {
    this.authorizeTemplate = authorizeTemplate;
    return this;
  }

   /**
   * Get authorizeTemplate
   * @return authorizeTemplate
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getAuthorizeTemplate() {
    return authorizeTemplate;
  }

  public void setAuthorizeTemplate(String authorizeTemplate) {
    this.authorizeTemplate = authorizeTemplate;
  }

  public CreateOAuthProviderRequest authorizeURL(String authorizeURL) {
    this.authorizeURL = authorizeURL;
    return this;
  }

   /**
   * Get authorizeURL
   * @return authorizeURL
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getAuthorizeURL() {
    return authorizeURL;
  }

  public void setAuthorizeURL(String authorizeURL) {
    this.authorizeURL = authorizeURL;
  }

  public CreateOAuthProviderRequest clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public CreateOAuthProviderRequest clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * Get clientSecret
   * @return clientSecret
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public CreateOAuthProviderRequest description(String description) {
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

  public CreateOAuthProviderRequest identityMapType(Integer identityMapType) {
    this.identityMapType = identityMapType;
    return this;
  }

   /**
   * Get identityMapType
   * @return identityMapType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getIdentityMapType() {
    return identityMapType;
  }

  public void setIdentityMapType(Integer identityMapType) {
    this.identityMapType = identityMapType;
  }

  public CreateOAuthProviderRequest idpIdentityKey(String idpIdentityKey) {
    this.idpIdentityKey = idpIdentityKey;
    return this;
  }

   /**
   * Get idpIdentityKey
   * @return idpIdentityKey
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getIdpIdentityKey() {
    return idpIdentityKey;
  }

  public void setIdpIdentityKey(String idpIdentityKey) {
    this.idpIdentityKey = idpIdentityKey;
  }

  public CreateOAuthProviderRequest oauthProviderName(String oauthProviderName) {
    this.oauthProviderName = oauthProviderName;
    return this;
  }

   /**
   * Get oauthProviderName
   * @return oauthProviderName
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getOauthProviderName() {
    return oauthProviderName;
  }

  public void setOauthProviderName(String oauthProviderName) {
    this.oauthProviderName = oauthProviderName;
  }

  public CreateOAuthProviderRequest ssOType(Integer ssOType) {
    this.ssOType = ssOType;
    return this;
  }

   /**
   * Get ssOType
   * @return ssOType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getSsOType() {
    return ssOType;
  }

  public void setSsOType(Integer ssOType) {
    this.ssOType = ssOType;
  }

  public CreateOAuthProviderRequest scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @Schema(description = "")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public CreateOAuthProviderRequest status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public CreateOAuthProviderRequest tokenURL(String tokenURL) {
    this.tokenURL = tokenURL;
    return this;
  }

   /**
   * Get tokenURL
   * @return tokenURL
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getTokenURL() {
    return tokenURL;
  }

  public void setTokenURL(String tokenURL) {
    this.tokenURL = tokenURL;
  }

  public CreateOAuthProviderRequest userInfoURL(String userInfoURL) {
    this.userInfoURL = userInfoURL;
    return this;
  }

   /**
   * Get userInfoURL
   * @return userInfoURL
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getUserInfoURL() {
    return userInfoURL;
  }

  public void setUserInfoURL(String userInfoURL) {
    this.userInfoURL = userInfoURL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOAuthProviderRequest createOAuthProviderRequest = (CreateOAuthProviderRequest) o;
    return Objects.equals(this.authorizeTemplate, createOAuthProviderRequest.authorizeTemplate) &&
        Objects.equals(this.authorizeURL, createOAuthProviderRequest.authorizeURL) &&
        Objects.equals(this.clientId, createOAuthProviderRequest.clientId) &&
        Objects.equals(this.clientSecret, createOAuthProviderRequest.clientSecret) &&
        Objects.equals(this.description, createOAuthProviderRequest.description) &&
        Objects.equals(this.identityMapType, createOAuthProviderRequest.identityMapType) &&
        Objects.equals(this.idpIdentityKey, createOAuthProviderRequest.idpIdentityKey) &&
        Objects.equals(this.oauthProviderName, createOAuthProviderRequest.oauthProviderName) &&
        Objects.equals(this.ssOType, createOAuthProviderRequest.ssOType) &&
        Objects.equals(this.scope, createOAuthProviderRequest.scope) &&
        Objects.equals(this.status, createOAuthProviderRequest.status) &&
        Objects.equals(this.tokenURL, createOAuthProviderRequest.tokenURL) &&
        Objects.equals(this.userInfoURL, createOAuthProviderRequest.userInfoURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizeTemplate, authorizeURL, clientId, clientSecret, description, identityMapType, idpIdentityKey, oauthProviderName, ssOType, scope, status, tokenURL, userInfoURL);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOAuthProviderRequest {\n");
    
    sb.append("    authorizeTemplate: ").append(toIndentedString(authorizeTemplate)).append("\n");
    sb.append("    authorizeURL: ").append(toIndentedString(authorizeURL)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    identityMapType: ").append(toIndentedString(identityMapType)).append("\n");
    sb.append("    idpIdentityKey: ").append(toIndentedString(idpIdentityKey)).append("\n");
    sb.append("    oauthProviderName: ").append(toIndentedString(oauthProviderName)).append("\n");
    sb.append("    ssOType: ").append(toIndentedString(ssOType)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tokenURL: ").append(toIndentedString(tokenURL)).append("\n");
    sb.append("    userInfoURL: ").append(toIndentedString(userInfoURL)).append("\n");
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
