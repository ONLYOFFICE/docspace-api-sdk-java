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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The cookie settings.
 */
@JsonPropertyOrder({
  CookieSettingsDto.JSON_PROPERTY_LIFE_TIME,
  CookieSettingsDto.JSON_PROPERTY_ENABLED
})

public class CookieSettingsDto {
  public static final String JSON_PROPERTY_LIFE_TIME = "lifeTime";
  @javax.annotation.Nonnull
  private Integer lifeTime;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  @javax.annotation.Nonnull
  private Boolean enabled;

  public CookieSettingsDto() {
  }

  public CookieSettingsDto lifeTime(@javax.annotation.Nonnull Integer lifeTime) {
    
    this.lifeTime = lifeTime;
    return this;
  }

  /**
   * The cookie lifetime value in minutes.
   * @return lifeTime
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LIFE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getLifeTime() {
    return lifeTime;
  }


  @JsonProperty(JSON_PROPERTY_LIFE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLifeTime(@javax.annotation.Nonnull Integer lifeTime) {
    this.lifeTime = lifeTime;
  }

  public CookieSettingsDto enabled(@javax.annotation.Nonnull Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

  /**
   * Specifies if the cookie settings are enabled or not.
   * @return enabled
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnabled(@javax.annotation.Nonnull Boolean enabled) {
    this.enabled = enabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CookieSettingsDto cookieSettingsDto = (CookieSettingsDto) o;
    return Objects.equals(this.lifeTime, cookieSettingsDto.lifeTime) &&
        Objects.equals(this.enabled, cookieSettingsDto.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lifeTime, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CookieSettingsDto {\n");
    sb.append("    lifeTime: ").append(toIndentedString(lifeTime)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

    // add `lifeTime` to the URL query string
    if (getLifeTime() != null) {
      try {
        joiner.add(String.format("%slifeTime%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLifeTime()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `enabled` to the URL query string
    if (getEnabled() != null) {
      try {
        joiner.add(String.format("%senabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnabled()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

