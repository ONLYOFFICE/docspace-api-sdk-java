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
 * The IdP advanced certificate parameters.
 */
@JsonPropertyOrder({
  SsoIdpCertificateAdvanced.JSON_PROPERTY_VERIFY_ALGORITHM,
  SsoIdpCertificateAdvanced.JSON_PROPERTY_VERIFY_AUTH_RESPONSES_SIGN,
  SsoIdpCertificateAdvanced.JSON_PROPERTY_VERIFY_LOGOUT_REQUESTS_SIGN,
  SsoIdpCertificateAdvanced.JSON_PROPERTY_VERIFY_LOGOUT_RESPONSES_SIGN,
  SsoIdpCertificateAdvanced.JSON_PROPERTY_DECRYPT_ALGORITHM,
  SsoIdpCertificateAdvanced.JSON_PROPERTY_DECRYPT_ASSERTIONS
})

public class SsoIdpCertificateAdvanced {
  public static final String JSON_PROPERTY_VERIFY_ALGORITHM = "verifyAlgorithm";
  @javax.annotation.Nullable
  private JsonNullable<String> verifyAlgorithm = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_VERIFY_AUTH_RESPONSES_SIGN = "verifyAuthResponsesSign";
  @javax.annotation.Nullable
  private Boolean verifyAuthResponsesSign;

  public static final String JSON_PROPERTY_VERIFY_LOGOUT_REQUESTS_SIGN = "verifyLogoutRequestsSign";
  @javax.annotation.Nullable
  private Boolean verifyLogoutRequestsSign;

  public static final String JSON_PROPERTY_VERIFY_LOGOUT_RESPONSES_SIGN = "verifyLogoutResponsesSign";
  @javax.annotation.Nullable
  private Boolean verifyLogoutResponsesSign;

  public static final String JSON_PROPERTY_DECRYPT_ALGORITHM = "decryptAlgorithm";
  @javax.annotation.Nullable
  private JsonNullable<String> decryptAlgorithm = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DECRYPT_ASSERTIONS = "decryptAssertions";
  @javax.annotation.Nullable
  private Boolean decryptAssertions;

  public SsoIdpCertificateAdvanced() {
  }


  public SsoIdpCertificateAdvanced verifyAlgorithm(@javax.annotation.Nullable String verifyAlgorithm) {
    this.verifyAlgorithm = JsonNullable.<String>of(verifyAlgorithm);
    
    return this;
  }

  /**
   * The certificate verification algorithm.
   * @return verifyAlgorithm
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getVerifyAlgorithm() {
        return verifyAlgorithm.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VERIFY_ALGORITHM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getVerifyAlgorithm_JsonNullable() {
    return verifyAlgorithm;
  }
  
  @JsonProperty(JSON_PROPERTY_VERIFY_ALGORITHM)
  public void setVerifyAlgorithm_JsonNullable(JsonNullable<String> verifyAlgorithm) {
    this.verifyAlgorithm = verifyAlgorithm;
  }

  public void setVerifyAlgorithm(@javax.annotation.Nullable String verifyAlgorithm) {
    this.verifyAlgorithm = JsonNullable.<String>of(verifyAlgorithm);
  }

  public SsoIdpCertificateAdvanced verifyAuthResponsesSign(@javax.annotation.Nullable Boolean verifyAuthResponsesSign) {
    
    this.verifyAuthResponsesSign = verifyAuthResponsesSign;
    return this;
  }

  /**
   * Specifies if the signatures of the SAML authentication responses sent to SP will be verified or not.
   * @return verifyAuthResponsesSign
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERIFY_AUTH_RESPONSES_SIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getVerifyAuthResponsesSign() {
    return verifyAuthResponsesSign;
  }


  @JsonProperty(JSON_PROPERTY_VERIFY_AUTH_RESPONSES_SIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVerifyAuthResponsesSign(@javax.annotation.Nullable Boolean verifyAuthResponsesSign) {
    this.verifyAuthResponsesSign = verifyAuthResponsesSign;
  }

  public SsoIdpCertificateAdvanced verifyLogoutRequestsSign(@javax.annotation.Nullable Boolean verifyLogoutRequestsSign) {
    
    this.verifyLogoutRequestsSign = verifyLogoutRequestsSign;
    return this;
  }

  /**
   * Specifies if the signatures of the SAML logout requests sent to SP will be verified or not.
   * @return verifyLogoutRequestsSign
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERIFY_LOGOUT_REQUESTS_SIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getVerifyLogoutRequestsSign() {
    return verifyLogoutRequestsSign;
  }


  @JsonProperty(JSON_PROPERTY_VERIFY_LOGOUT_REQUESTS_SIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVerifyLogoutRequestsSign(@javax.annotation.Nullable Boolean verifyLogoutRequestsSign) {
    this.verifyLogoutRequestsSign = verifyLogoutRequestsSign;
  }

  public SsoIdpCertificateAdvanced verifyLogoutResponsesSign(@javax.annotation.Nullable Boolean verifyLogoutResponsesSign) {
    
    this.verifyLogoutResponsesSign = verifyLogoutResponsesSign;
    return this;
  }

  /**
   * Specifies if the signatures of the SAML logout responses sent to SP will be verified or not.
   * @return verifyLogoutResponsesSign
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERIFY_LOGOUT_RESPONSES_SIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getVerifyLogoutResponsesSign() {
    return verifyLogoutResponsesSign;
  }


  @JsonProperty(JSON_PROPERTY_VERIFY_LOGOUT_RESPONSES_SIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVerifyLogoutResponsesSign(@javax.annotation.Nullable Boolean verifyLogoutResponsesSign) {
    this.verifyLogoutResponsesSign = verifyLogoutResponsesSign;
  }

  public SsoIdpCertificateAdvanced decryptAlgorithm(@javax.annotation.Nullable String decryptAlgorithm) {
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

  public SsoIdpCertificateAdvanced decryptAssertions(@javax.annotation.Nullable Boolean decryptAssertions) {
    
    this.decryptAssertions = decryptAssertions;
    return this;
  }

  /**
   * Specifies if the assertions will be decrypted or not.
   * @return decryptAssertions
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DECRYPT_ASSERTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDecryptAssertions() {
    return decryptAssertions;
  }


  @JsonProperty(JSON_PROPERTY_DECRYPT_ASSERTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDecryptAssertions(@javax.annotation.Nullable Boolean decryptAssertions) {
    this.decryptAssertions = decryptAssertions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SsoIdpCertificateAdvanced ssoIdpCertificateAdvanced = (SsoIdpCertificateAdvanced) o;
    return equalsNullable(this.verifyAlgorithm, ssoIdpCertificateAdvanced.verifyAlgorithm) &&
        Objects.equals(this.verifyAuthResponsesSign, ssoIdpCertificateAdvanced.verifyAuthResponsesSign) &&
        Objects.equals(this.verifyLogoutRequestsSign, ssoIdpCertificateAdvanced.verifyLogoutRequestsSign) &&
        Objects.equals(this.verifyLogoutResponsesSign, ssoIdpCertificateAdvanced.verifyLogoutResponsesSign) &&
        equalsNullable(this.decryptAlgorithm, ssoIdpCertificateAdvanced.decryptAlgorithm) &&
        Objects.equals(this.decryptAssertions, ssoIdpCertificateAdvanced.decryptAssertions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(verifyAlgorithm), verifyAuthResponsesSign, verifyLogoutRequestsSign, verifyLogoutResponsesSign, hashCodeNullable(decryptAlgorithm), decryptAssertions);
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
    sb.append("class SsoIdpCertificateAdvanced {\n");
    sb.append("    verifyAlgorithm: ").append(toIndentedString(verifyAlgorithm)).append("\n");
    sb.append("    verifyAuthResponsesSign: ").append(toIndentedString(verifyAuthResponsesSign)).append("\n");
    sb.append("    verifyLogoutRequestsSign: ").append(toIndentedString(verifyLogoutRequestsSign)).append("\n");
    sb.append("    verifyLogoutResponsesSign: ").append(toIndentedString(verifyLogoutResponsesSign)).append("\n");
    sb.append("    decryptAlgorithm: ").append(toIndentedString(decryptAlgorithm)).append("\n");
    sb.append("    decryptAssertions: ").append(toIndentedString(decryptAssertions)).append("\n");
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

    // add `verifyAlgorithm` to the URL query string
    if (getVerifyAlgorithm() != null) {
      try {
        joiner.add(String.format("%sverifyAlgorithm%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVerifyAlgorithm()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `verifyAuthResponsesSign` to the URL query string
    if (getVerifyAuthResponsesSign() != null) {
      try {
        joiner.add(String.format("%sverifyAuthResponsesSign%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVerifyAuthResponsesSign()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `verifyLogoutRequestsSign` to the URL query string
    if (getVerifyLogoutRequestsSign() != null) {
      try {
        joiner.add(String.format("%sverifyLogoutRequestsSign%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVerifyLogoutRequestsSign()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `verifyLogoutResponsesSign` to the URL query string
    if (getVerifyLogoutResponsesSign() != null) {
      try {
        joiner.add(String.format("%sverifyLogoutResponsesSign%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVerifyLogoutResponsesSign()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `decryptAssertions` to the URL query string
    if (getDecryptAssertions() != null) {
      try {
        joiner.add(String.format("%sdecryptAssertions%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDecryptAssertions()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

