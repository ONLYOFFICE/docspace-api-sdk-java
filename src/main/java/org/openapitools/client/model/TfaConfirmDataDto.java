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
 * The TFA confirmation data.
 */
@JsonPropertyOrder({
  TfaConfirmDataDto.JSON_PROPERTY_URL,
  TfaConfirmDataDto.JSON_PROPERTY_COOKIE_NAME,
  TfaConfirmDataDto.JSON_PROPERTY_COOKIE_VALUE
})

public class TfaConfirmDataDto {
  public static final String JSON_PROPERTY_URL = "url";
  @javax.annotation.Nullable  private JsonNullable<String> url = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COOKIE_NAME = "cookieName";
  @javax.annotation.Nullable  private JsonNullable<String> cookieName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COOKIE_VALUE = "cookieValue";
  @javax.annotation.Nullable  private JsonNullable<String> cookieValue = JsonNullable.<String>undefined();

  public TfaConfirmDataDto() {
  }


  public TfaConfirmDataDto url(@javax.annotation.Nullable String url) {
    this.url = JsonNullable.<String>of(url);
    
    return this;
  }

  /**
   * The confirmation URL.
   * @return url
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getUrl() {
        return url.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getUrl_JsonNullable() {
    return url;
  }
  
  @JsonProperty(JSON_PROPERTY_URL)
  public void setUrl_JsonNullable(JsonNullable<String> url) {
    this.url = url;
  }

  public void setUrl(@javax.annotation.Nullable String url) {
    this.url = JsonNullable.<String>of(url);
  }

  public TfaConfirmDataDto cookieName(@javax.annotation.Nullable String cookieName) {
    this.cookieName = JsonNullable.<String>of(cookieName);
    
    return this;
  }

  /**
   * The confirmation cookie name.
   * @return cookieName
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getCookieName() {
        return cookieName.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_COOKIE_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getCookieName_JsonNullable() {
    return cookieName;
  }
  
  @JsonProperty(JSON_PROPERTY_COOKIE_NAME)
  public void setCookieName_JsonNullable(JsonNullable<String> cookieName) {
    this.cookieName = cookieName;
  }

  public void setCookieName(@javax.annotation.Nullable String cookieName) {
    this.cookieName = JsonNullable.<String>of(cookieName);
  }

  public TfaConfirmDataDto cookieValue(@javax.annotation.Nullable String cookieValue) {
    this.cookieValue = JsonNullable.<String>of(cookieValue);
    
    return this;
  }

  /**
   * The confirmation cookie value.
   * @return cookieValue
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getCookieValue() {
        return cookieValue.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_COOKIE_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getCookieValue_JsonNullable() {
    return cookieValue;
  }
  
  @JsonProperty(JSON_PROPERTY_COOKIE_VALUE)
  public void setCookieValue_JsonNullable(JsonNullable<String> cookieValue) {
    this.cookieValue = cookieValue;
  }

  public void setCookieValue(@javax.annotation.Nullable String cookieValue) {
    this.cookieValue = JsonNullable.<String>of(cookieValue);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TfaConfirmDataDto tfaConfirmDataDto = (TfaConfirmDataDto) o;
    return equalsNullable(this.url, tfaConfirmDataDto.url) &&
        equalsNullable(this.cookieName, tfaConfirmDataDto.cookieName) &&
        equalsNullable(this.cookieValue, tfaConfirmDataDto.cookieValue);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(url), hashCodeNullable(cookieName), hashCodeNullable(cookieValue));
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
    sb.append("class TfaConfirmDataDto {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    cookieName: ").append(toIndentedString(cookieName)).append("\n");
    sb.append("    cookieValue: ").append(toIndentedString(cookieValue)).append("\n");
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

    // add `url` to the URL query string
    if (getUrl() != null) {
      try {
        joiner.add(String.format("%surl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `cookieName` to the URL query string
    if (getCookieName() != null) {
      try {
        joiner.add(String.format("%scookieName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCookieName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `cookieValue` to the URL query string
    if (getCookieValue() != null) {
      try {
        joiner.add(String.format("%scookieValue%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCookieValue()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

