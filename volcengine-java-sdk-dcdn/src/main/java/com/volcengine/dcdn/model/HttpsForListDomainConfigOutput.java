/*
 * dcdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.dcdn.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.dcdn.model.CertBindForListDomainConfigOutput;
import com.volcengine.dcdn.model.ForceRedirectForListDomainConfigOutput;
import com.volcengine.dcdn.model.HstsForListDomainConfigOutput;
import com.volcengine.dcdn.model.TlsVersionsForListDomainConfigOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * HttpsForListDomainConfigOutput
 */


public class HttpsForListDomainConfigOutput {
  @SerializedName("CertBind")
  private CertBindForListDomainConfigOutput certBind = null;

  @SerializedName("ForceRedirect")
  private ForceRedirectForListDomainConfigOutput forceRedirect = null;

  @SerializedName("Hsts")
  private HstsForListDomainConfigOutput hsts = null;

  @SerializedName("Http2")
  private Boolean http2 = null;

  @SerializedName("QUICSwitch")
  private Boolean quICSwitch = null;

  @SerializedName("TlsVersions")
  private TlsVersionsForListDomainConfigOutput tlsVersions = null;

  public HttpsForListDomainConfigOutput certBind(CertBindForListDomainConfigOutput certBind) {
    this.certBind = certBind;
    return this;
  }

   /**
   * Get certBind
   * @return certBind
  **/
  @Valid
  @Schema(description = "")
  public CertBindForListDomainConfigOutput getCertBind() {
    return certBind;
  }

  public void setCertBind(CertBindForListDomainConfigOutput certBind) {
    this.certBind = certBind;
  }

  public HttpsForListDomainConfigOutput forceRedirect(ForceRedirectForListDomainConfigOutput forceRedirect) {
    this.forceRedirect = forceRedirect;
    return this;
  }

   /**
   * Get forceRedirect
   * @return forceRedirect
  **/
  @Valid
  @Schema(description = "")
  public ForceRedirectForListDomainConfigOutput getForceRedirect() {
    return forceRedirect;
  }

  public void setForceRedirect(ForceRedirectForListDomainConfigOutput forceRedirect) {
    this.forceRedirect = forceRedirect;
  }

  public HttpsForListDomainConfigOutput hsts(HstsForListDomainConfigOutput hsts) {
    this.hsts = hsts;
    return this;
  }

   /**
   * Get hsts
   * @return hsts
  **/
  @Valid
  @Schema(description = "")
  public HstsForListDomainConfigOutput getHsts() {
    return hsts;
  }

  public void setHsts(HstsForListDomainConfigOutput hsts) {
    this.hsts = hsts;
  }

  public HttpsForListDomainConfigOutput http2(Boolean http2) {
    this.http2 = http2;
    return this;
  }

   /**
   * Get http2
   * @return http2
  **/
  @Schema(description = "")
  public Boolean isHttp2() {
    return http2;
  }

  public void setHttp2(Boolean http2) {
    this.http2 = http2;
  }

  public HttpsForListDomainConfigOutput quICSwitch(Boolean quICSwitch) {
    this.quICSwitch = quICSwitch;
    return this;
  }

   /**
   * Get quICSwitch
   * @return quICSwitch
  **/
  @Schema(description = "")
  public Boolean isQuICSwitch() {
    return quICSwitch;
  }

  public void setQuICSwitch(Boolean quICSwitch) {
    this.quICSwitch = quICSwitch;
  }

  public HttpsForListDomainConfigOutput tlsVersions(TlsVersionsForListDomainConfigOutput tlsVersions) {
    this.tlsVersions = tlsVersions;
    return this;
  }

   /**
   * Get tlsVersions
   * @return tlsVersions
  **/
  @Valid
  @Schema(description = "")
  public TlsVersionsForListDomainConfigOutput getTlsVersions() {
    return tlsVersions;
  }

  public void setTlsVersions(TlsVersionsForListDomainConfigOutput tlsVersions) {
    this.tlsVersions = tlsVersions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HttpsForListDomainConfigOutput httpsForListDomainConfigOutput = (HttpsForListDomainConfigOutput) o;
    return Objects.equals(this.certBind, httpsForListDomainConfigOutput.certBind) &&
        Objects.equals(this.forceRedirect, httpsForListDomainConfigOutput.forceRedirect) &&
        Objects.equals(this.hsts, httpsForListDomainConfigOutput.hsts) &&
        Objects.equals(this.http2, httpsForListDomainConfigOutput.http2) &&
        Objects.equals(this.quICSwitch, httpsForListDomainConfigOutput.quICSwitch) &&
        Objects.equals(this.tlsVersions, httpsForListDomainConfigOutput.tlsVersions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certBind, forceRedirect, hsts, http2, quICSwitch, tlsVersions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpsForListDomainConfigOutput {\n");
    
    sb.append("    certBind: ").append(toIndentedString(certBind)).append("\n");
    sb.append("    forceRedirect: ").append(toIndentedString(forceRedirect)).append("\n");
    sb.append("    hsts: ").append(toIndentedString(hsts)).append("\n");
    sb.append("    http2: ").append(toIndentedString(http2)).append("\n");
    sb.append("    quICSwitch: ").append(toIndentedString(quICSwitch)).append("\n");
    sb.append("    tlsVersions: ").append(toIndentedString(tlsVersions)).append("\n");
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