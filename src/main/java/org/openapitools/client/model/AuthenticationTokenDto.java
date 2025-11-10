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
import java.net.URI;
import java.time.OffsetDateTime;
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
 * The authentication token parameters.
 */
@JsonPropertyOrder({
  AuthenticationTokenDto.JSON_PROPERTY_TOKEN,
  AuthenticationTokenDto.JSON_PROPERTY_EXPIRES,
  AuthenticationTokenDto.JSON_PROPERTY_SMS,
  AuthenticationTokenDto.JSON_PROPERTY_PHONE_NOISE,
  AuthenticationTokenDto.JSON_PROPERTY_TFA,
  AuthenticationTokenDto.JSON_PROPERTY_TFA_KEY,
  AuthenticationTokenDto.JSON_PROPERTY_CONFIRM_URL
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class AuthenticationTokenDto {
  public static final String JSON_PROPERTY_TOKEN = "token";
  @javax.annotation.Nullable
  private JsonNullable<String> token = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EXPIRES = "expires";
  @javax.annotation.Nullable
  private OffsetDateTime expires;

  public static final String JSON_PROPERTY_SMS = "sms";
  @javax.annotation.Nullable
  private Boolean sms;

  public static final String JSON_PROPERTY_PHONE_NOISE = "phoneNoise";
  @javax.annotation.Nullable
  private JsonNullable<String> phoneNoise = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TFA = "tfa";
  @javax.annotation.Nullable
  private Boolean tfa;

  public static final String JSON_PROPERTY_TFA_KEY = "tfaKey";
  @javax.annotation.Nullable
  private JsonNullable<String> tfaKey = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CONFIRM_URL = "confirmUrl";
  @javax.annotation.Nullable
  private JsonNullable<URI> confirmUrl = JsonNullable.<URI>undefined();

  public AuthenticationTokenDto() {
  }

  public AuthenticationTokenDto token(@javax.annotation.Nullable String token) {
    this.token = JsonNullable.<String>of(token);
    
    return this;
  }

  /**
   * The authentication token.
   * @return token
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getToken() {
        return token.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getToken_JsonNullable() {
    return token;
  }
  
  @JsonProperty(JSON_PROPERTY_TOKEN)
  public void setToken_JsonNullable(JsonNullable<String> token) {
    this.token = token;
  }

  public void setToken(@javax.annotation.Nullable String token) {
    this.token = JsonNullable.<String>of(token);
  }

  public AuthenticationTokenDto expires(@javax.annotation.Nullable OffsetDateTime expires) {
    
    this.expires = expires;
    return this;
  }

  /**
   * The token expiration time.
   * @return expires
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getExpires() {
    return expires;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpires(@javax.annotation.Nullable OffsetDateTime expires) {
    this.expires = expires;
  }

  public AuthenticationTokenDto sms(@javax.annotation.Nullable Boolean sms) {
    
    this.sms = sms;
    return this;
  }

  /**
   * Specifies if the authentication code is sent by SMS or not.
   * @return sms
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSms() {
    return sms;
  }


  @JsonProperty(JSON_PROPERTY_SMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSms(@javax.annotation.Nullable Boolean sms) {
    this.sms = sms;
  }

  public AuthenticationTokenDto phoneNoise(@javax.annotation.Nullable String phoneNoise) {
    this.phoneNoise = JsonNullable.<String>of(phoneNoise);
    
    return this;
  }

  /**
   * The phone number.
   * @return phoneNoise
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPhoneNoise() {
        return phoneNoise.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PHONE_NOISE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPhoneNoise_JsonNullable() {
    return phoneNoise;
  }
  
  @JsonProperty(JSON_PROPERTY_PHONE_NOISE)
  public void setPhoneNoise_JsonNullable(JsonNullable<String> phoneNoise) {
    this.phoneNoise = phoneNoise;
  }

  public void setPhoneNoise(@javax.annotation.Nullable String phoneNoise) {
    this.phoneNoise = JsonNullable.<String>of(phoneNoise);
  }

  public AuthenticationTokenDto tfa(@javax.annotation.Nullable Boolean tfa) {
    
    this.tfa = tfa;
    return this;
  }

  /**
   * Specifies if the two-factor application is used or not.
   * @return tfa
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TFA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTfa() {
    return tfa;
  }


  @JsonProperty(JSON_PROPERTY_TFA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTfa(@javax.annotation.Nullable Boolean tfa) {
    this.tfa = tfa;
  }

  public AuthenticationTokenDto tfaKey(@javax.annotation.Nullable String tfaKey) {
    this.tfaKey = JsonNullable.<String>of(tfaKey);
    
    return this;
  }

  /**
   * The two-factor authentication key.
   * @return tfaKey
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getTfaKey() {
        return tfaKey.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TFA_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTfaKey_JsonNullable() {
    return tfaKey;
  }
  
  @JsonProperty(JSON_PROPERTY_TFA_KEY)
  public void setTfaKey_JsonNullable(JsonNullable<String> tfaKey) {
    this.tfaKey = tfaKey;
  }

  public void setTfaKey(@javax.annotation.Nullable String tfaKey) {
    this.tfaKey = JsonNullable.<String>of(tfaKey);
  }

  public AuthenticationTokenDto confirmUrl(@javax.annotation.Nullable URI confirmUrl) {
    this.confirmUrl = JsonNullable.<URI>of(confirmUrl);
    
    return this;
  }

  /**
   * The confirmation email URL.
   * @return confirmUrl
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public URI getConfirmUrl() {
        return confirmUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONFIRM_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<URI> getConfirmUrl_JsonNullable() {
    return confirmUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_CONFIRM_URL)
  public void setConfirmUrl_JsonNullable(JsonNullable<URI> confirmUrl) {
    this.confirmUrl = confirmUrl;
  }

  public void setConfirmUrl(@javax.annotation.Nullable URI confirmUrl) {
    this.confirmUrl = JsonNullable.<URI>of(confirmUrl);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationTokenDto authenticationTokenDto = (AuthenticationTokenDto) o;
    return equalsNullable(this.token, authenticationTokenDto.token) &&
        Objects.equals(this.expires, authenticationTokenDto.expires) &&
        Objects.equals(this.sms, authenticationTokenDto.sms) &&
        equalsNullable(this.phoneNoise, authenticationTokenDto.phoneNoise) &&
        Objects.equals(this.tfa, authenticationTokenDto.tfa) &&
        equalsNullable(this.tfaKey, authenticationTokenDto.tfaKey) &&
        equalsNullable(this.confirmUrl, authenticationTokenDto.confirmUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(token), expires, sms, hashCodeNullable(phoneNoise), tfa, hashCodeNullable(tfaKey), hashCodeNullable(confirmUrl));
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
    sb.append("class AuthenticationTokenDto {\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    sms: ").append(toIndentedString(sms)).append("\n");
    sb.append("    phoneNoise: ").append(toIndentedString(phoneNoise)).append("\n");
    sb.append("    tfa: ").append(toIndentedString(tfa)).append("\n");
    sb.append("    tfaKey: ").append(toIndentedString(tfaKey)).append("\n");
    sb.append("    confirmUrl: ").append(toIndentedString(confirmUrl)).append("\n");
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

    // add `token` to the URL query string
    if (getToken() != null) {
      try {
        joiner.add(String.format("%stoken%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getToken()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `expires` to the URL query string
    if (getExpires() != null) {
      try {
        joiner.add(String.format("%sexpires%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExpires()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sms` to the URL query string
    if (getSms() != null) {
      try {
        joiner.add(String.format("%ssms%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSms()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `phoneNoise` to the URL query string
    if (getPhoneNoise() != null) {
      try {
        joiner.add(String.format("%sphoneNoise%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPhoneNoise()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `tfa` to the URL query string
    if (getTfa() != null) {
      try {
        joiner.add(String.format("%stfa%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTfa()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `tfaKey` to the URL query string
    if (getTfaKey() != null) {
      try {
        joiner.add(String.format("%stfaKey%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTfaKey()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `confirmUrl` to the URL query string
    if (getConfirmUrl() != null) {
      try {
        joiner.add(String.format("%sconfirmUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConfirmUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

