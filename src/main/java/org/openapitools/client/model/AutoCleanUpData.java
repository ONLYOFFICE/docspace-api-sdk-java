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
import org.openapitools.client.model.DateToAutoCleanUp;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The auto-clearing setting parameters.
 */
@JsonPropertyOrder({
  AutoCleanUpData.JSON_PROPERTY_IS_AUTO_CLEAN_UP,
  AutoCleanUpData.JSON_PROPERTY_GAP
})

public class AutoCleanUpData {
  public static final String JSON_PROPERTY_IS_AUTO_CLEAN_UP = "isAutoCleanUp";
  @javax.annotation.Nullable
  private Boolean isAutoCleanUp;

  public static final String JSON_PROPERTY_GAP = "gap";
  @javax.annotation.Nullable
  private DateToAutoCleanUp gap;

  public AutoCleanUpData() {
  }


  public AutoCleanUpData isAutoCleanUp(@javax.annotation.Nullable Boolean isAutoCleanUp) {
    
    this.isAutoCleanUp = isAutoCleanUp;
    return this;
  }

  /**
   * Specifies whether to permanently delete files in the Trash folder.
   * @return isAutoCleanUp
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_AUTO_CLEAN_UP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsAutoCleanUp() {
    return isAutoCleanUp;
  }


  @JsonProperty(JSON_PROPERTY_IS_AUTO_CLEAN_UP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsAutoCleanUp(@javax.annotation.Nullable Boolean isAutoCleanUp) {
    this.isAutoCleanUp = isAutoCleanUp;
  }

  public AutoCleanUpData gap(@javax.annotation.Nullable DateToAutoCleanUp gap) {
    
    this.gap = gap;
    return this;
  }

  /**
   * Get gap
   * @return gap
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DateToAutoCleanUp getGap() {
    return gap;
  }


  @JsonProperty(JSON_PROPERTY_GAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGap(@javax.annotation.Nullable DateToAutoCleanUp gap) {
    this.gap = gap;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoCleanUpData autoCleanUpData = (AutoCleanUpData) o;
    return Objects.equals(this.isAutoCleanUp, autoCleanUpData.isAutoCleanUp) &&
        Objects.equals(this.gap, autoCleanUpData.gap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isAutoCleanUp, gap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoCleanUpData {\n");
    sb.append("    isAutoCleanUp: ").append(toIndentedString(isAutoCleanUp)).append("\n");
    sb.append("    gap: ").append(toIndentedString(gap)).append("\n");
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

    // add `isAutoCleanUp` to the URL query string
    if (getIsAutoCleanUp() != null) {
      try {
        joiner.add(String.format("%sisAutoCleanUp%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsAutoCleanUp()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `gap` to the URL query string
    if (getGap() != null) {
      try {
        joiner.add(String.format("%sgap%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getGap()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

