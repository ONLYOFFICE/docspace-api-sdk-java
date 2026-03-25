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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Icon
 */
@JsonPropertyOrder({
  Icon.JSON_PROPERTY_ICON48,
  Icon.JSON_PROPERTY_ICON32,
  Icon.JSON_PROPERTY_ICON24,
  Icon.JSON_PROPERTY_ICON16
})

public class Icon {
  public static final String JSON_PROPERTY_ICON48 = "icon48";
  @javax.annotation.Nullable  private String icon48;

  public static final String JSON_PROPERTY_ICON32 = "icon32";
  @javax.annotation.Nullable  private String icon32;

  public static final String JSON_PROPERTY_ICON24 = "icon24";
  @javax.annotation.Nullable  private String icon24;

  public static final String JSON_PROPERTY_ICON16 = "icon16";
  @javax.annotation.Nullable  private String icon16;

  public Icon() {
  }


  public Icon icon48(@javax.annotation.Nullable String icon48) {
    
    this.icon48 = icon48;
    return this;
  }

  /**
   * Get icon48
   * @return icon48
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ICON48, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIcon48() {
    return icon48;
  }


  @JsonProperty(value = JSON_PROPERTY_ICON48, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIcon48(@javax.annotation.Nullable String icon48) {
    this.icon48 = icon48;
  }

  public Icon icon32(@javax.annotation.Nullable String icon32) {
    
    this.icon32 = icon32;
    return this;
  }

  /**
   * Get icon32
   * @return icon32
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ICON32, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIcon32() {
    return icon32;
  }


  @JsonProperty(value = JSON_PROPERTY_ICON32, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIcon32(@javax.annotation.Nullable String icon32) {
    this.icon32 = icon32;
  }

  public Icon icon24(@javax.annotation.Nullable String icon24) {
    
    this.icon24 = icon24;
    return this;
  }

  /**
   * Get icon24
   * @return icon24
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ICON24, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIcon24() {
    return icon24;
  }


  @JsonProperty(value = JSON_PROPERTY_ICON24, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIcon24(@javax.annotation.Nullable String icon24) {
    this.icon24 = icon24;
  }

  public Icon icon16(@javax.annotation.Nullable String icon16) {
    
    this.icon16 = icon16;
    return this;
  }

  /**
   * Get icon16
   * @return icon16
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ICON16, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIcon16() {
    return icon16;
  }


  @JsonProperty(value = JSON_PROPERTY_ICON16, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIcon16(@javax.annotation.Nullable String icon16) {
    this.icon16 = icon16;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Icon icon = (Icon) o;
    return Objects.equals(this.icon48, icon.icon48) &&
        Objects.equals(this.icon32, icon.icon32) &&
        Objects.equals(this.icon24, icon.icon24) &&
        Objects.equals(this.icon16, icon.icon16);
  }

  @Override
  public int hashCode() {
    return Objects.hash(icon48, icon32, icon24, icon16);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Icon {\n");
    sb.append("    icon48: ").append(toIndentedString(icon48)).append("\n");
    sb.append("    icon32: ").append(toIndentedString(icon32)).append("\n");
    sb.append("    icon24: ").append(toIndentedString(icon24)).append("\n");
    sb.append("    icon16: ").append(toIndentedString(icon16)).append("\n");
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

    // add `icon48` to the URL query string
    if (getIcon48() != null) {
      try {
        joiner.add(String.format("%sicon48%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIcon48()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `icon32` to the URL query string
    if (getIcon32() != null) {
      try {
        joiner.add(String.format("%sicon32%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIcon32()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `icon24` to the URL query string
    if (getIcon24() != null) {
      try {
        joiner.add(String.format("%sicon24%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIcon24()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `icon16` to the URL query string
    if (getIcon16() != null) {
      try {
        joiner.add(String.format("%sicon16%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIcon16()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

