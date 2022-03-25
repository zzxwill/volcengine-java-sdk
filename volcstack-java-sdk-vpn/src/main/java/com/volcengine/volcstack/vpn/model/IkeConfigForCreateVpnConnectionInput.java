/*
 * vpn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcstack.vpn.model;

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
 * IkeConfigForCreateVpnConnectionInput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-03-24T18:21:18.622599+08:00[Asia/Shanghai]")
public class IkeConfigForCreateVpnConnectionInput {
  /**
   * Gets or Sets authAlg
   */
  @JsonAdapter(AuthAlgEnum.Adapter.class)
  public enum AuthAlgEnum {
    SHA1("sha1"),
    MD5("md5"),
    SHA256("sha256"),
    SHA384("sha384"),
    SHA512("sha512");

    private String value;

    AuthAlgEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AuthAlgEnum fromValue(String input) {
      for (AuthAlgEnum b : AuthAlgEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AuthAlgEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuthAlgEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public AuthAlgEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return AuthAlgEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("AuthAlg")
  private AuthAlgEnum authAlg = null;

  /**
   * Gets or Sets dhGroup
   */
  @JsonAdapter(DhGroupEnum.Adapter.class)
  public enum DhGroupEnum {
    GROUP1("group1"),
    GROUP2("group2"),
    GROUP5("group5"),
    GROUP14("group14");

    private String value;

    DhGroupEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DhGroupEnum fromValue(String input) {
      for (DhGroupEnum b : DhGroupEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DhGroupEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DhGroupEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public DhGroupEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return DhGroupEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("DhGroup")
  private DhGroupEnum dhGroup = null;

  /**
   * Gets or Sets encAlg
   */
  @JsonAdapter(EncAlgEnum.Adapter.class)
  public enum EncAlgEnum {
    AES("aes"),
    AES192("aes192"),
    AES256("aes256"),
    DES("des"),
    _3DES("3des");

    private String value;

    EncAlgEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EncAlgEnum fromValue(String input) {
      for (EncAlgEnum b : EncAlgEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EncAlgEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EncAlgEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public EncAlgEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return EncAlgEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("EncAlg")
  private EncAlgEnum encAlg = null;

  @SerializedName("Lifetime")
  private String lifetime = null;

  @SerializedName("LocalId")
  private String localId = null;

  /**
   * Gets or Sets mode
   */
  @JsonAdapter(ModeEnum.Adapter.class)
  public enum ModeEnum {
    MAIN("main"),
    AGGRESSIVE("aggressive");

    private String value;

    ModeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ModeEnum fromValue(String input) {
      for (ModeEnum b : ModeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ModeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ModeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ModeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("Mode")
  private ModeEnum mode = null;

  @SerializedName("Psk")
  private String psk = null;

  @SerializedName("RemoteId")
  private String remoteId = null;

  /**
   * Gets or Sets version
   */
  @JsonAdapter(VersionEnum.Adapter.class)
  public enum VersionEnum {
    IKEV1("ikev1"),
    IKEV2("ikev2");

    private String value;

    VersionEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static VersionEnum fromValue(String input) {
      for (VersionEnum b : VersionEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<VersionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VersionEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public VersionEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return VersionEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("Version")
  private VersionEnum version = null;

  public IkeConfigForCreateVpnConnectionInput authAlg(AuthAlgEnum authAlg) {
    this.authAlg = authAlg;
    return this;
  }

   /**
   * Get authAlg
   * @return authAlg
  **/
  @Schema(description = "")
  public AuthAlgEnum getAuthAlg() {
    return authAlg;
  }

  public void setAuthAlg(AuthAlgEnum authAlg) {
    this.authAlg = authAlg;
  }

  public IkeConfigForCreateVpnConnectionInput dhGroup(DhGroupEnum dhGroup) {
    this.dhGroup = dhGroup;
    return this;
  }

   /**
   * Get dhGroup
   * @return dhGroup
  **/
  @Schema(description = "")
  public DhGroupEnum getDhGroup() {
    return dhGroup;
  }

  public void setDhGroup(DhGroupEnum dhGroup) {
    this.dhGroup = dhGroup;
  }

  public IkeConfigForCreateVpnConnectionInput encAlg(EncAlgEnum encAlg) {
    this.encAlg = encAlg;
    return this;
  }

   /**
   * Get encAlg
   * @return encAlg
  **/
  @Schema(description = "")
  public EncAlgEnum getEncAlg() {
    return encAlg;
  }

  public void setEncAlg(EncAlgEnum encAlg) {
    this.encAlg = encAlg;
  }

  public IkeConfigForCreateVpnConnectionInput lifetime(String lifetime) {
    this.lifetime = lifetime;
    return this;
  }

   /**
   * Get lifetime
   * @return lifetime
  **/
  @Schema(description = "")
  public String getLifetime() {
    return lifetime;
  }

  public void setLifetime(String lifetime) {
    this.lifetime = lifetime;
  }

  public IkeConfigForCreateVpnConnectionInput localId(String localId) {
    this.localId = localId;
    return this;
  }

   /**
   * Get localId
   * @return localId
  **/
  @Schema(description = "")
  public String getLocalId() {
    return localId;
  }

  public void setLocalId(String localId) {
    this.localId = localId;
  }

  public IkeConfigForCreateVpnConnectionInput mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @Schema(description = "")
  public ModeEnum getMode() {
    return mode;
  }

  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }

  public IkeConfigForCreateVpnConnectionInput psk(String psk) {
    this.psk = psk;
    return this;
  }

   /**
   * Get psk
   * @return psk
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getPsk() {
    return psk;
  }

  public void setPsk(String psk) {
    this.psk = psk;
  }

  public IkeConfigForCreateVpnConnectionInput remoteId(String remoteId) {
    this.remoteId = remoteId;
    return this;
  }

   /**
   * Get remoteId
   * @return remoteId
  **/
  @Schema(description = "")
  public String getRemoteId() {
    return remoteId;
  }

  public void setRemoteId(String remoteId) {
    this.remoteId = remoteId;
  }

  public IkeConfigForCreateVpnConnectionInput version(VersionEnum version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @Schema(description = "")
  public VersionEnum getVersion() {
    return version;
  }

  public void setVersion(VersionEnum version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IkeConfigForCreateVpnConnectionInput ikeConfigForCreateVpnConnectionInput = (IkeConfigForCreateVpnConnectionInput) o;
    return Objects.equals(this.authAlg, ikeConfigForCreateVpnConnectionInput.authAlg) &&
        Objects.equals(this.dhGroup, ikeConfigForCreateVpnConnectionInput.dhGroup) &&
        Objects.equals(this.encAlg, ikeConfigForCreateVpnConnectionInput.encAlg) &&
        Objects.equals(this.lifetime, ikeConfigForCreateVpnConnectionInput.lifetime) &&
        Objects.equals(this.localId, ikeConfigForCreateVpnConnectionInput.localId) &&
        Objects.equals(this.mode, ikeConfigForCreateVpnConnectionInput.mode) &&
        Objects.equals(this.psk, ikeConfigForCreateVpnConnectionInput.psk) &&
        Objects.equals(this.remoteId, ikeConfigForCreateVpnConnectionInput.remoteId) &&
        Objects.equals(this.version, ikeConfigForCreateVpnConnectionInput.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authAlg, dhGroup, encAlg, lifetime, localId, mode, psk, remoteId, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IkeConfigForCreateVpnConnectionInput {\n");
    
    sb.append("    authAlg: ").append(toIndentedString(authAlg)).append("\n");
    sb.append("    dhGroup: ").append(toIndentedString(dhGroup)).append("\n");
    sb.append("    encAlg: ").append(toIndentedString(encAlg)).append("\n");
    sb.append("    lifetime: ").append(toIndentedString(lifetime)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    psk: ").append(toIndentedString(psk)).append("\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
