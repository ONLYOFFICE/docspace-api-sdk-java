/*
 * (c) Copyright Ascensio System SIA 2025
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The encryption keys of the editor configuration.
 */
@JsonPropertyOrder({
  EncryptionKeysConfig.JSON_PROPERTY_CRYPTO_ENGINE_ID,
  EncryptionKeysConfig.JSON_PROPERTY_PRIVATE_KEY_ENC,
  EncryptionKeysConfig.JSON_PROPERTY_PUBLIC_KEY
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class EncryptionKeysConfig {
  public static final String JSON_PROPERTY_CRYPTO_ENGINE_ID = "cryptoEngineId";
  @javax.annotation.Nullable
  private JsonNullable<String> cryptoEngineId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PRIVATE_KEY_ENC = "privateKeyEnc";
  @javax.annotation.Nullable
  private JsonNullable<String> privateKeyEnc = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PUBLIC_KEY = "publicKey";
  @javax.annotation.Nullable
  private JsonNullable<String> publicKey = JsonNullable.<String>undefined();

  public EncryptionKeysConfig() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public EncryptionKeysConfig(
    @JsonProperty(JSON_PROPERTY_CRYPTO_ENGINE_ID) String cryptoEngineId
  ) {
    this();
    this.cryptoEngineId = cryptoEngineId == null ? JsonNullable.<String>undefined() : JsonNullable.of(cryptoEngineId);
  }

  /**
   * The crypto engine ID of the encryption key.
   * @return cryptoEngineId
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCryptoEngineId() {
    
    if (cryptoEngineId == null) {
      cryptoEngineId = JsonNullable.<String>undefined();
    }
    return cryptoEngineId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CRYPTO_ENGINE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCryptoEngineId_JsonNullable() {
    return cryptoEngineId;
  }
  
  @JsonProperty(JSON_PROPERTY_CRYPTO_ENGINE_ID)
  private void setCryptoEngineId_JsonNullable(JsonNullable<String> cryptoEngineId) {
    this.cryptoEngineId = cryptoEngineId;
  }


  public EncryptionKeysConfig privateKeyEnc(@javax.annotation.Nullable String privateKeyEnc) {
    this.privateKeyEnc = JsonNullable.<String>of(privateKeyEnc);
    
    return this;
  }

  /**
   * The private key.
   * @return privateKeyEnc
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPrivateKeyEnc() {
        return privateKeyEnc.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRIVATE_KEY_ENC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPrivateKeyEnc_JsonNullable() {
    return privateKeyEnc;
  }
  
  @JsonProperty(JSON_PROPERTY_PRIVATE_KEY_ENC)
  public void setPrivateKeyEnc_JsonNullable(JsonNullable<String> privateKeyEnc) {
    this.privateKeyEnc = privateKeyEnc;
  }

  public void setPrivateKeyEnc(@javax.annotation.Nullable String privateKeyEnc) {
    this.privateKeyEnc = JsonNullable.<String>of(privateKeyEnc);
  }

  public EncryptionKeysConfig publicKey(@javax.annotation.Nullable String publicKey) {
    this.publicKey = JsonNullable.<String>of(publicKey);
    
    return this;
  }

  /**
   * The public key.
   * @return publicKey
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPublicKey() {
        return publicKey.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PUBLIC_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPublicKey_JsonNullable() {
    return publicKey;
  }
  
  @JsonProperty(JSON_PROPERTY_PUBLIC_KEY)
  public void setPublicKey_JsonNullable(JsonNullable<String> publicKey) {
    this.publicKey = publicKey;
  }

  public void setPublicKey(@javax.annotation.Nullable String publicKey) {
    this.publicKey = JsonNullable.<String>of(publicKey);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EncryptionKeysConfig encryptionKeysConfig = (EncryptionKeysConfig) o;
    return equalsNullable(this.cryptoEngineId, encryptionKeysConfig.cryptoEngineId) &&
        equalsNullable(this.privateKeyEnc, encryptionKeysConfig.privateKeyEnc) &&
        equalsNullable(this.publicKey, encryptionKeysConfig.publicKey);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(cryptoEngineId), hashCodeNullable(privateKeyEnc), hashCodeNullable(publicKey));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncryptionKeysConfig {\n");
    sb.append("    cryptoEngineId: ").append(toIndentedString(cryptoEngineId)).append("\n");
    sb.append("    privateKeyEnc: ").append(toIndentedString(privateKeyEnc)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `cryptoEngineId` to the URL query string
    if (getCryptoEngineId() != null) {
      try {
        joiner.add(String.format("%scryptoEngineId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCryptoEngineId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `privateKeyEnc` to the URL query string
    if (getPrivateKeyEnc() != null) {
      try {
        joiner.add(String.format("%sprivateKeyEnc%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPrivateKeyEnc()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `publicKey` to the URL query string
    if (getPublicKey() != null) {
      try {
        joiner.add(String.format("%spublicKey%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPublicKey()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

