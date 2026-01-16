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
 * The request parameters for the theme-specific logo configurations.
 */
@JsonPropertyOrder({
  LogoRequestsDto.JSON_PROPERTY_LIGHT,
  LogoRequestsDto.JSON_PROPERTY_DARK
})

public class LogoRequestsDto {
  public static final String JSON_PROPERTY_LIGHT = "light";
  @javax.annotation.Nullable
  private JsonNullable<String> light = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DARK = "dark";
  @javax.annotation.Nullable
  private JsonNullable<String> dark = JsonNullable.<String>undefined();

  public LogoRequestsDto() {
  }


  public LogoRequestsDto light(@javax.annotation.Nullable String light) {
    this.light = JsonNullable.<String>of(light);
    
    return this;
  }

  /**
   * The URL or base64-encoded image data for the light theme logo.
   * @return light
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getLight() {
        return light.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLight_JsonNullable() {
    return light;
  }
  
  @JsonProperty(JSON_PROPERTY_LIGHT)
  public void setLight_JsonNullable(JsonNullable<String> light) {
    this.light = light;
  }

  public void setLight(@javax.annotation.Nullable String light) {
    this.light = JsonNullable.<String>of(light);
  }

  public LogoRequestsDto dark(@javax.annotation.Nullable String dark) {
    this.dark = JsonNullable.<String>of(dark);
    
    return this;
  }

  /**
   * The URL or base64-encoded image data for the dark theme logo.
   * @return dark
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getDark() {
        return dark.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDark_JsonNullable() {
    return dark;
  }
  
  @JsonProperty(JSON_PROPERTY_DARK)
  public void setDark_JsonNullable(JsonNullable<String> dark) {
    this.dark = dark;
  }

  public void setDark(@javax.annotation.Nullable String dark) {
    this.dark = JsonNullable.<String>of(dark);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogoRequestsDto logoRequestsDto = (LogoRequestsDto) o;
    return equalsNullable(this.light, logoRequestsDto.light) &&
        equalsNullable(this.dark, logoRequestsDto.dark);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(light), hashCodeNullable(dark));
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
    sb.append("class LogoRequestsDto {\n");
    sb.append("    light: ").append(toIndentedString(light)).append("\n");
    sb.append("    dark: ").append(toIndentedString(dark)).append("\n");
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

    // add `light` to the URL query string
    if (getLight() != null) {
      try {
        joiner.add(String.format("%slight%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLight()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `dark` to the URL query string
    if (getDark() != null) {
      try {
        joiner.add(String.format("%sdark%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDark()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

