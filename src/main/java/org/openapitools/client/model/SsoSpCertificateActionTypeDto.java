/*
 * (c) Copyright Ascensio System SIA 2026
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
 * What the portal's own key pair may be used for, as the `action` of a service provider certificate.
 */
@JsonPropertyOrder({
  SsoSpCertificateActionTypeDto.JSON_PROPERTY_SIGNING,
  SsoSpCertificateActionTypeDto.JSON_PROPERTY_ENCRYPT,
  SsoSpCertificateActionTypeDto.JSON_PROPERTY_SIGNING_AND_ENCRYPT
})

public class SsoSpCertificateActionTypeDto {
  public static final String JSON_PROPERTY_SIGNING = "signing";
  @javax.annotation.Nullable  private JsonNullable<String> signing = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ENCRYPT = "encrypt";
  @javax.annotation.Nullable  private JsonNullable<String> encrypt = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SIGNING_AND_ENCRYPT = "signingAndEncrypt";
  @javax.annotation.Nullable  private JsonNullable<String> signingAndEncrypt = JsonNullable.<String>undefined();

  public SsoSpCertificateActionTypeDto() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public SsoSpCertificateActionTypeDto(
    @JsonProperty(JSON_PROPERTY_SIGNING) String signing, 
    @JsonProperty(JSON_PROPERTY_ENCRYPT) String encrypt, 
    @JsonProperty(JSON_PROPERTY_SIGNING_AND_ENCRYPT) String signingAndEncrypt
  ) {
    this();
    this.signing = signing == null ? JsonNullable.<String>undefined() : JsonNullable.of(signing);
    this.encrypt = encrypt == null ? JsonNullable.<String>undefined() : JsonNullable.of(encrypt);
    this.signingAndEncrypt = signingAndEncrypt == null ? JsonNullable.<String>undefined() : JsonNullable.of(signingAndEncrypt);
  }


  /**
   * The key pair signs the requests the portal sends and nothing else.
   * @return signing
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getSigning() {
    
    if (signing == null) {
      signing = JsonNullable.<String>undefined();
    }
    return signing.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SIGNING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getSigning_JsonNullable() {
    return signing;
  }
  
  @JsonProperty(JSON_PROPERTY_SIGNING)
  private void setSigning_JsonNullable(JsonNullable<String> signing) {
    this.signing = signing;
  }


  /**
   * The key pair encrypts what the portal sends and decrypts what comes back, but signs nothing.
   * @return encrypt
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getEncrypt() {
    
    if (encrypt == null) {
      encrypt = JsonNullable.<String>undefined();
    }
    return encrypt.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ENCRYPT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getEncrypt_JsonNullable() {
    return encrypt;
  }
  
  @JsonProperty(JSON_PROPERTY_ENCRYPT)
  private void setEncrypt_JsonNullable(JsonNullable<String> encrypt) {
    this.encrypt = encrypt;
  }


  /**
   * The key pair does both, which is what one pair configured on its own has to be set to.
   * @return signingAndEncrypt
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getSigningAndEncrypt() {
    
    if (signingAndEncrypt == null) {
      signingAndEncrypt = JsonNullable.<String>undefined();
    }
    return signingAndEncrypt.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SIGNING_AND_ENCRYPT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getSigningAndEncrypt_JsonNullable() {
    return signingAndEncrypt;
  }
  
  @JsonProperty(JSON_PROPERTY_SIGNING_AND_ENCRYPT)
  private void setSigningAndEncrypt_JsonNullable(JsonNullable<String> signingAndEncrypt) {
    this.signingAndEncrypt = signingAndEncrypt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SsoSpCertificateActionTypeDto ssoSpCertificateActionTypeDto = (SsoSpCertificateActionTypeDto) o;
    return equalsNullable(this.signing, ssoSpCertificateActionTypeDto.signing) &&
        equalsNullable(this.encrypt, ssoSpCertificateActionTypeDto.encrypt) &&
        equalsNullable(this.signingAndEncrypt, ssoSpCertificateActionTypeDto.signingAndEncrypt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(signing), hashCodeNullable(encrypt), hashCodeNullable(signingAndEncrypt));
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
    sb.append("class SsoSpCertificateActionTypeDto {\n");
    sb.append("    signing: ").append(toIndentedString(signing)).append("\n");
    sb.append("    encrypt: ").append(toIndentedString(encrypt)).append("\n");
    sb.append("    signingAndEncrypt: ").append(toIndentedString(signingAndEncrypt)).append("\n");
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

    // add `signing` to the URL query string
    if (getSigning() != null) {
      try {
        joiner.add(String.format("%ssigning%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSigning()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `encrypt` to the URL query string
    if (getEncrypt() != null) {
      try {
        joiner.add(String.format("%sencrypt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEncrypt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `signingAndEncrypt` to the URL query string
    if (getSigningAndEncrypt() != null) {
      try {
        joiner.add(String.format("%ssigningAndEncrypt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSigningAndEncrypt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

