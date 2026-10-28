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
 * What the identity provider's certificate may be used for, as the `action` of an identity provider certificate.
 */
@JsonPropertyOrder({
  SsoIdpCertificateActionTypeDto.JSON_PROPERTY_VERIFICATION,
  SsoIdpCertificateActionTypeDto.JSON_PROPERTY_DECRYPT,
  SsoIdpCertificateActionTypeDto.JSON_PROPERTY_VERIFICATION_AND_DECRYPT
})

public class SsoIdpCertificateActionTypeDto {
  public static final String JSON_PROPERTY_VERIFICATION = "verification";
  @javax.annotation.Nullable  private JsonNullable<String> verification = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DECRYPT = "decrypt";
  @javax.annotation.Nullable  private JsonNullable<String> decrypt = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_VERIFICATION_AND_DECRYPT = "verificationAndDecrypt";
  @javax.annotation.Nullable  private JsonNullable<String> verificationAndDecrypt = JsonNullable.<String>undefined();

  public SsoIdpCertificateActionTypeDto() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public SsoIdpCertificateActionTypeDto(
    @JsonProperty(JSON_PROPERTY_VERIFICATION) String verification, 
    @JsonProperty(JSON_PROPERTY_DECRYPT) String decrypt, 
    @JsonProperty(JSON_PROPERTY_VERIFICATION_AND_DECRYPT) String verificationAndDecrypt
  ) {
    this();
    this.verification = verification == null ? JsonNullable.<String>undefined() : JsonNullable.of(verification);
    this.decrypt = decrypt == null ? JsonNullable.<String>undefined() : JsonNullable.of(decrypt);
    this.verificationAndDecrypt = verificationAndDecrypt == null ? JsonNullable.<String>undefined() : JsonNullable.of(verificationAndDecrypt);
  }


  /**
   * The certificate verifies the signatures on what the provider sends, and nothing else - the counterpart of  the service provider's signing action.
   * @return verification
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getVerification() {
    
    if (verification == null) {
      verification = JsonNullable.<String>undefined();
    }
    return verification.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_VERIFICATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getVerification_JsonNullable() {
    return verification;
  }
  
  @JsonProperty(JSON_PROPERTY_VERIFICATION)
  private void setVerification_JsonNullable(JsonNullable<String> verification) {
    this.verification = verification;
  }


  /**
   * The certificate is used to decrypt what the provider sends, but verifies no signature.
   * @return decrypt
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getDecrypt() {
    
    if (decrypt == null) {
      decrypt = JsonNullable.<String>undefined();
    }
    return decrypt.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_DECRYPT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDecrypt_JsonNullable() {
    return decrypt;
  }
  
  @JsonProperty(JSON_PROPERTY_DECRYPT)
  private void setDecrypt_JsonNullable(JsonNullable<String> decrypt) {
    this.decrypt = decrypt;
  }


  /**
   * The certificate does both, which is what a single provider certificate has to be set to.
   * @return verificationAndDecrypt
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getVerificationAndDecrypt() {
    
    if (verificationAndDecrypt == null) {
      verificationAndDecrypt = JsonNullable.<String>undefined();
    }
    return verificationAndDecrypt.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_VERIFICATION_AND_DECRYPT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getVerificationAndDecrypt_JsonNullable() {
    return verificationAndDecrypt;
  }
  
  @JsonProperty(JSON_PROPERTY_VERIFICATION_AND_DECRYPT)
  private void setVerificationAndDecrypt_JsonNullable(JsonNullable<String> verificationAndDecrypt) {
    this.verificationAndDecrypt = verificationAndDecrypt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SsoIdpCertificateActionTypeDto ssoIdpCertificateActionTypeDto = (SsoIdpCertificateActionTypeDto) o;
    return equalsNullable(this.verification, ssoIdpCertificateActionTypeDto.verification) &&
        equalsNullable(this.decrypt, ssoIdpCertificateActionTypeDto.decrypt) &&
        equalsNullable(this.verificationAndDecrypt, ssoIdpCertificateActionTypeDto.verificationAndDecrypt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(verification), hashCodeNullable(decrypt), hashCodeNullable(verificationAndDecrypt));
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
    sb.append("class SsoIdpCertificateActionTypeDto {\n");
    sb.append("    verification: ").append(toIndentedString(verification)).append("\n");
    sb.append("    decrypt: ").append(toIndentedString(decrypt)).append("\n");
    sb.append("    verificationAndDecrypt: ").append(toIndentedString(verificationAndDecrypt)).append("\n");
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

    // add `verification` to the URL query string
    if (getVerification() != null) {
      try {
        joiner.add(String.format("%sverification%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVerification()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `decrypt` to the URL query string
    if (getDecrypt() != null) {
      try {
        joiner.add(String.format("%sdecrypt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDecrypt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `verificationAndDecrypt` to the URL query string
    if (getVerificationAndDecrypt() != null) {
      try {
        joiner.add(String.format("%sverificationAndDecrypt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVerificationAndDecrypt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

