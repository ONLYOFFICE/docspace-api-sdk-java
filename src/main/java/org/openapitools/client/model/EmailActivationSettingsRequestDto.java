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
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Whether the calling user wants to keep seeing the reminder to confirm their email address.
 */
@JsonPropertyOrder({
  EmailActivationSettingsRequestDto.JSON_PROPERTY_SHOW,
  EmailActivationSettingsRequestDto.JSON_PROPERTY_LAST_MODIFIED
})

public class EmailActivationSettingsRequestDto {
  public static final String JSON_PROPERTY_SHOW = "show";
  @javax.annotation.Nullable  private Boolean show;

  public static final String JSON_PROPERTY_LAST_MODIFIED = "lastModified";
  @javax.annotation.Nullable  private OffsetDateTime lastModified;

  public EmailActivationSettingsRequestDto() {
  }


  public EmailActivationSettingsRequestDto show(@javax.annotation.Nullable Boolean show) {
    
    this.show = show;
    return this;
  }

  /**
   * Whether the reminder is shown; send false to dismiss it for the calling user.
   * @return show
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SHOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShow() {
    return show;
  }


  @JsonProperty(value = JSON_PROPERTY_SHOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShow(@javax.annotation.Nullable Boolean show) {
    this.show = show;
  }

  public EmailActivationSettingsRequestDto lastModified(@javax.annotation.Nullable OffsetDateTime lastModified) {
    
    this.lastModified = lastModified;
    return this;
  }

  /**
   * Accepted for compatibility with earlier clients and not read: the server keeps its own value.
   * @return lastModified
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_LAST_MODIFIED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastModified() {
    return lastModified;
  }


  @JsonProperty(value = JSON_PROPERTY_LAST_MODIFIED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastModified(@javax.annotation.Nullable OffsetDateTime lastModified) {
    this.lastModified = lastModified;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailActivationSettingsRequestDto emailActivationSettingsRequestDto = (EmailActivationSettingsRequestDto) o;
    return Objects.equals(this.show, emailActivationSettingsRequestDto.show) &&
        Objects.equals(this.lastModified, emailActivationSettingsRequestDto.lastModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(show, lastModified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailActivationSettingsRequestDto {\n");
    sb.append("    show: ").append(toIndentedString(show)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
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

    // add `show` to the URL query string
    if (getShow() != null) {
      try {
        joiner.add(String.format("%sshow%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getShow()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `lastModified` to the URL query string
    if (getLastModified() != null) {
      try {
        joiner.add(String.format("%slastModified%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLastModified()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

