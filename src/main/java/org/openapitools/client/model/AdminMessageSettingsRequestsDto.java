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
import org.openapitools.client.model.RecaptchaType;
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
 * The request parameters for configuring the administrator message content.
 */
@JsonPropertyOrder({
  AdminMessageSettingsRequestsDto.JSON_PROPERTY_MESSAGE,
  AdminMessageSettingsRequestsDto.JSON_PROPERTY_EMAIL,
  AdminMessageSettingsRequestsDto.JSON_PROPERTY_CULTURE,
  AdminMessageSettingsRequestsDto.JSON_PROPERTY_RECAPTCHA_TYPE,
  AdminMessageSettingsRequestsDto.JSON_PROPERTY_RECAPTCHA_RESPONSE
})

public class AdminMessageSettingsRequestsDto {
  public static final String JSON_PROPERTY_MESSAGE = "message";
  @javax.annotation.Nullable  private String message;

  public static final String JSON_PROPERTY_EMAIL = "email";
  @javax.annotation.Nullable  private String email;

  public static final String JSON_PROPERTY_CULTURE = "culture";
  @javax.annotation.Nullable  private JsonNullable<String> culture = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_RECAPTCHA_TYPE = "recaptchaType";
  @javax.annotation.Nullable  private RecaptchaType recaptchaType;

  public static final String JSON_PROPERTY_RECAPTCHA_RESPONSE = "recaptchaResponse";
  @javax.annotation.Nullable  private JsonNullable<String> recaptchaResponse = JsonNullable.<String>undefined();

  public AdminMessageSettingsRequestsDto() {
  }


  public AdminMessageSettingsRequestsDto message(@javax.annotation.Nullable String message) {
    
    this.message = message;
    return this;
  }

  /**
   * The content of the administrator message to be sent.
   * @return message
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_MESSAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(value = JSON_PROPERTY_MESSAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMessage(@javax.annotation.Nullable String message) {
    this.message = message;
  }

  public AdminMessageSettingsRequestsDto email(@javax.annotation.Nullable String email) {
    
    this.email = email;
    return this;
  }

  /**
   * Email
   * @return email
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_EMAIL, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(value = JSON_PROPERTY_EMAIL, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmail(@javax.annotation.Nullable String email) {
    this.email = email;
  }

  public AdminMessageSettingsRequestsDto culture(@javax.annotation.Nullable String culture) {
    this.culture = JsonNullable.<String>of(culture);
    
    return this;
  }

  /**
   * Culture
   * @return culture
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getCulture() {
        return culture.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_CULTURE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getCulture_JsonNullable() {
    return culture;
  }
  
  @JsonProperty(JSON_PROPERTY_CULTURE)
  public void setCulture_JsonNullable(JsonNullable<String> culture) {
    this.culture = culture;
  }

  public void setCulture(@javax.annotation.Nullable String culture) {
    this.culture = JsonNullable.<String>of(culture);
  }

  public AdminMessageSettingsRequestsDto recaptchaType(@javax.annotation.Nullable RecaptchaType recaptchaType) {
    
    this.recaptchaType = recaptchaType;
    return this;
  }

  /**
   * Get recaptchaType
   * @return recaptchaType
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_RECAPTCHA_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecaptchaType getRecaptchaType() {
    return recaptchaType;
  }


  @JsonProperty(value = JSON_PROPERTY_RECAPTCHA_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecaptchaType(@javax.annotation.Nullable RecaptchaType recaptchaType) {
    this.recaptchaType = recaptchaType;
  }

  public AdminMessageSettingsRequestsDto recaptchaResponse(@javax.annotation.Nullable String recaptchaResponse) {
    this.recaptchaResponse = JsonNullable.<String>of(recaptchaResponse);
    
    return this;
  }

  /**
   * The user&#39;s response to the CAPTCHA challenge.
   * @return recaptchaResponse
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getRecaptchaResponse() {
        return recaptchaResponse.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_RECAPTCHA_RESPONSE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getRecaptchaResponse_JsonNullable() {
    return recaptchaResponse;
  }
  
  @JsonProperty(JSON_PROPERTY_RECAPTCHA_RESPONSE)
  public void setRecaptchaResponse_JsonNullable(JsonNullable<String> recaptchaResponse) {
    this.recaptchaResponse = recaptchaResponse;
  }

  public void setRecaptchaResponse(@javax.annotation.Nullable String recaptchaResponse) {
    this.recaptchaResponse = JsonNullable.<String>of(recaptchaResponse);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminMessageSettingsRequestsDto adminMessageSettingsRequestsDto = (AdminMessageSettingsRequestsDto) o;
    return Objects.equals(this.message, adminMessageSettingsRequestsDto.message) &&
        Objects.equals(this.email, adminMessageSettingsRequestsDto.email) &&
        equalsNullable(this.culture, adminMessageSettingsRequestsDto.culture) &&
        Objects.equals(this.recaptchaType, adminMessageSettingsRequestsDto.recaptchaType) &&
        equalsNullable(this.recaptchaResponse, adminMessageSettingsRequestsDto.recaptchaResponse);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, email, hashCodeNullable(culture), recaptchaType, hashCodeNullable(recaptchaResponse));
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
    sb.append("class AdminMessageSettingsRequestsDto {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    culture: ").append(toIndentedString(culture)).append("\n");
    sb.append("    recaptchaType: ").append(toIndentedString(recaptchaType)).append("\n");
    sb.append("    recaptchaResponse: ").append(toIndentedString(recaptchaResponse)).append("\n");
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

    // add `message` to the URL query string
    if (getMessage() != null) {
      try {
        joiner.add(String.format("%smessage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMessage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `email` to the URL query string
    if (getEmail() != null) {
      try {
        joiner.add(String.format("%semail%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmail()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `culture` to the URL query string
    if (getCulture() != null) {
      try {
        joiner.add(String.format("%sculture%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCulture()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `recaptchaType` to the URL query string
    if (getRecaptchaType() != null) {
      try {
        joiner.add(String.format("%srecaptchaType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRecaptchaType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `recaptchaResponse` to the URL query string
    if (getRecaptchaResponse() != null) {
      try {
        joiner.add(String.format("%srecaptchaResponse%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRecaptchaResponse()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

