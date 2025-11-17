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
 * The SP advanced certificate parameters.
 */
@JsonPropertyOrder({
  SsoSpCertificateAdvanced.JSON_PROPERTY_SIGNING_ALGORITHM,
  SsoSpCertificateAdvanced.JSON_PROPERTY_SIGN_AUTH_REQUESTS,
  SsoSpCertificateAdvanced.JSON_PROPERTY_SIGN_LOGOUT_REQUESTS,
  SsoSpCertificateAdvanced.JSON_PROPERTY_SIGN_LOGOUT_RESPONSES,
  SsoSpCertificateAdvanced.JSON_PROPERTY_ENCRYPT_ALGORITHM,
  SsoSpCertificateAdvanced.JSON_PROPERTY_DECRYPT_ALGORITHM,
  SsoSpCertificateAdvanced.JSON_PROPERTY_ENCRYPT_ASSERTIONS
})

public class SsoSpCertificateAdvanced {
  public static final String JSON_PROPERTY_SIGNING_ALGORITHM = "signingAlgorithm";
  @javax.annotation.Nullable
  private JsonNullable<String> signingAlgorithm = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SIGN_AUTH_REQUESTS = "signAuthRequests";
  @javax.annotation.Nullable
  private Boolean signAuthRequests;

  public static final String JSON_PROPERTY_SIGN_LOGOUT_REQUESTS = "signLogoutRequests";
  @javax.annotation.Nullable
  private Boolean signLogoutRequests;

  public static final String JSON_PROPERTY_SIGN_LOGOUT_RESPONSES = "signLogoutResponses";
  @javax.annotation.Nullable
  private Boolean signLogoutResponses;

  public static final String JSON_PROPERTY_ENCRYPT_ALGORITHM = "encryptAlgorithm";
  @javax.annotation.Nullable
  private JsonNullable<String> encryptAlgorithm = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DECRYPT_ALGORITHM = "decryptAlgorithm";
  @javax.annotation.Nullable
  private JsonNullable<String> decryptAlgorithm = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ENCRYPT_ASSERTIONS = "encryptAssertions";
  @javax.annotation.Nullable
  private Boolean encryptAssertions;

  public SsoSpCertificateAdvanced() {
  }

  public SsoSpCertificateAdvanced signingAlgorithm(@javax.annotation.Nullable String signingAlgorithm) {
    this.signingAlgorithm = JsonNullable.<String>of(signingAlgorithm);
    
    return this;
  }

  /**
   * The certificate signing algorithm.
   * @return signingAlgorithm
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getSigningAlgorithm() {
        return signingAlgorithm.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SIGNING_ALGORITHM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSigningAlgorithm_JsonNullable() {
    return signingAlgorithm;
  }
  
  @JsonProperty(JSON_PROPERTY_SIGNING_ALGORITHM)
  public void setSigningAlgorithm_JsonNullable(JsonNullable<String> signingAlgorithm) {
    this.signingAlgorithm = signingAlgorithm;
  }

  public void setSigningAlgorithm(@javax.annotation.Nullable String signingAlgorithm) {
    this.signingAlgorithm = JsonNullable.<String>of(signingAlgorithm);
  }

  public SsoSpCertificateAdvanced signAuthRequests(@javax.annotation.Nullable Boolean signAuthRequests) {
    
    this.signAuthRequests = signAuthRequests;
    return this;
  }

  /**
   * Specifies if SP will sign the SAML authentication requests sent to IdP or not.
   * @return signAuthRequests
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIGN_AUTH_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSignAuthRequests() {
    return signAuthRequests;
  }


  @JsonProperty(JSON_PROPERTY_SIGN_AUTH_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSignAuthRequests(@javax.annotation.Nullable Boolean signAuthRequests) {
    this.signAuthRequests = signAuthRequests;
  }

  public SsoSpCertificateAdvanced signLogoutRequests(@javax.annotation.Nullable Boolean signLogoutRequests) {
    
    this.signLogoutRequests = signLogoutRequests;
    return this;
  }

  /**
   * Specifies if SP will sign the SAML logout requests sent to IdP or not.
   * @return signLogoutRequests
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIGN_LOGOUT_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSignLogoutRequests() {
    return signLogoutRequests;
  }


  @JsonProperty(JSON_PROPERTY_SIGN_LOGOUT_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSignLogoutRequests(@javax.annotation.Nullable Boolean signLogoutRequests) {
    this.signLogoutRequests = signLogoutRequests;
  }

  public SsoSpCertificateAdvanced signLogoutResponses(@javax.annotation.Nullable Boolean signLogoutResponses) {
    
    this.signLogoutResponses = signLogoutResponses;
    return this;
  }

  /**
   * Specifies if SP will sign the SAML logout responses sent to IdP or not.
   * @return signLogoutResponses
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIGN_LOGOUT_RESPONSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSignLogoutResponses() {
    return signLogoutResponses;
  }


  @JsonProperty(JSON_PROPERTY_SIGN_LOGOUT_RESPONSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSignLogoutResponses(@javax.annotation.Nullable Boolean signLogoutResponses) {
    this.signLogoutResponses = signLogoutResponses;
  }

  public SsoSpCertificateAdvanced encryptAlgorithm(@javax.annotation.Nullable String encryptAlgorithm) {
    this.encryptAlgorithm = JsonNullable.<String>of(encryptAlgorithm);
    
    return this;
  }

  /**
   * The certificate encryption algorithm.
   * @return encryptAlgorithm
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getEncryptAlgorithm() {
        return encryptAlgorithm.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENCRYPT_ALGORITHM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getEncryptAlgorithm_JsonNullable() {
    return encryptAlgorithm;
  }
  
  @JsonProperty(JSON_PROPERTY_ENCRYPT_ALGORITHM)
  public void setEncryptAlgorithm_JsonNullable(JsonNullable<String> encryptAlgorithm) {
    this.encryptAlgorithm = encryptAlgorithm;
  }

  public void setEncryptAlgorithm(@javax.annotation.Nullable String encryptAlgorithm) {
    this.encryptAlgorithm = JsonNullable.<String>of(encryptAlgorithm);
  }

  public SsoSpCertificateAdvanced decryptAlgorithm(@javax.annotation.Nullable String decryptAlgorithm) {
    this.decryptAlgorithm = JsonNullable.<String>of(decryptAlgorithm);
    
    return this;
  }

  /**
   * The certificate decryption algorithm.
   * @return decryptAlgorithm
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getDecryptAlgorithm() {
        return decryptAlgorithm.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DECRYPT_ALGORITHM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDecryptAlgorithm_JsonNullable() {
    return decryptAlgorithm;
  }
  
  @JsonProperty(JSON_PROPERTY_DECRYPT_ALGORITHM)
  public void setDecryptAlgorithm_JsonNullable(JsonNullable<String> decryptAlgorithm) {
    this.decryptAlgorithm = decryptAlgorithm;
  }

  public void setDecryptAlgorithm(@javax.annotation.Nullable String decryptAlgorithm) {
    this.decryptAlgorithm = JsonNullable.<String>of(decryptAlgorithm);
  }

  public SsoSpCertificateAdvanced encryptAssertions(@javax.annotation.Nullable Boolean encryptAssertions) {
    
    this.encryptAssertions = encryptAssertions;
    return this;
  }

  /**
   * Specifies if the assertions will be encrypted or not.
   * @return encryptAssertions
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENCRYPT_ASSERTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEncryptAssertions() {
    return encryptAssertions;
  }


  @JsonProperty(JSON_PROPERTY_ENCRYPT_ASSERTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEncryptAssertions(@javax.annotation.Nullable Boolean encryptAssertions) {
    this.encryptAssertions = encryptAssertions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SsoSpCertificateAdvanced ssoSpCertificateAdvanced = (SsoSpCertificateAdvanced) o;
    return equalsNullable(this.signingAlgorithm, ssoSpCertificateAdvanced.signingAlgorithm) &&
        Objects.equals(this.signAuthRequests, ssoSpCertificateAdvanced.signAuthRequests) &&
        Objects.equals(this.signLogoutRequests, ssoSpCertificateAdvanced.signLogoutRequests) &&
        Objects.equals(this.signLogoutResponses, ssoSpCertificateAdvanced.signLogoutResponses) &&
        equalsNullable(this.encryptAlgorithm, ssoSpCertificateAdvanced.encryptAlgorithm) &&
        equalsNullable(this.decryptAlgorithm, ssoSpCertificateAdvanced.decryptAlgorithm) &&
        Objects.equals(this.encryptAssertions, ssoSpCertificateAdvanced.encryptAssertions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(signingAlgorithm), signAuthRequests, signLogoutRequests, signLogoutResponses, hashCodeNullable(encryptAlgorithm), hashCodeNullable(decryptAlgorithm), encryptAssertions);
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
    sb.append("class SsoSpCertificateAdvanced {\n");
    sb.append("    signingAlgorithm: ").append(toIndentedString(signingAlgorithm)).append("\n");
    sb.append("    signAuthRequests: ").append(toIndentedString(signAuthRequests)).append("\n");
    sb.append("    signLogoutRequests: ").append(toIndentedString(signLogoutRequests)).append("\n");
    sb.append("    signLogoutResponses: ").append(toIndentedString(signLogoutResponses)).append("\n");
    sb.append("    encryptAlgorithm: ").append(toIndentedString(encryptAlgorithm)).append("\n");
    sb.append("    decryptAlgorithm: ").append(toIndentedString(decryptAlgorithm)).append("\n");
    sb.append("    encryptAssertions: ").append(toIndentedString(encryptAssertions)).append("\n");
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

    // add `signingAlgorithm` to the URL query string
    if (getSigningAlgorithm() != null) {
      try {
        joiner.add(String.format("%ssigningAlgorithm%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSigningAlgorithm()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `signAuthRequests` to the URL query string
    if (getSignAuthRequests() != null) {
      try {
        joiner.add(String.format("%ssignAuthRequests%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSignAuthRequests()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `signLogoutRequests` to the URL query string
    if (getSignLogoutRequests() != null) {
      try {
        joiner.add(String.format("%ssignLogoutRequests%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSignLogoutRequests()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `signLogoutResponses` to the URL query string
    if (getSignLogoutResponses() != null) {
      try {
        joiner.add(String.format("%ssignLogoutResponses%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSignLogoutResponses()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `encryptAlgorithm` to the URL query string
    if (getEncryptAlgorithm() != null) {
      try {
        joiner.add(String.format("%sencryptAlgorithm%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEncryptAlgorithm()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `decryptAlgorithm` to the URL query string
    if (getDecryptAlgorithm() != null) {
      try {
        joiner.add(String.format("%sdecryptAlgorithm%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDecryptAlgorithm()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `encryptAssertions` to the URL query string
    if (getEncryptAssertions() != null) {
      try {
        joiner.add(String.format("%sencryptAssertions%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEncryptAssertions()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

