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
import org.openapitools.client.model.CoEditingConfigMode;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The co-editing configuration parameters.
 */
@JsonPropertyOrder({
  CoEditingConfig.JSON_PROPERTY_CHANGE,
  CoEditingConfig.JSON_PROPERTY_FAST,
  CoEditingConfig.JSON_PROPERTY_MODE
})

public class CoEditingConfig {
  public static final String JSON_PROPERTY_CHANGE = "change";
  @javax.annotation.Nullable
  private Boolean change;

  public static final String JSON_PROPERTY_FAST = "fast";
  @javax.annotation.Nullable
  private Boolean fast;

  public static final String JSON_PROPERTY_MODE = "mode";
  @javax.annotation.Nullable
  private CoEditingConfigMode mode;

  public CoEditingConfig() {
  }


  public CoEditingConfig change(@javax.annotation.Nullable Boolean change) {
    
    this.change = change;
    return this;
  }

  /**
   * Specifies if the co-editing mode can be changed in the editor interface or not.
   * @return change
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getChange() {
    return change;
  }


  @JsonProperty(JSON_PROPERTY_CHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChange(@javax.annotation.Nullable Boolean change) {
    this.change = change;
  }

  public CoEditingConfig fast(@javax.annotation.Nullable Boolean fast) {
    
    this.fast = fast;
    return this;
  }

  /**
   * Specifies if the co-editing mode is fast.
   * @return fast
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFast() {
    return fast;
  }


  @JsonProperty(JSON_PROPERTY_FAST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFast(@javax.annotation.Nullable Boolean fast) {
    this.fast = fast;
  }

  public CoEditingConfig mode(@javax.annotation.Nullable CoEditingConfigMode mode) {
    
    this.mode = mode;
    return this;
  }

  /**
   * Get mode
   * @return mode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CoEditingConfigMode getMode() {
    return mode;
  }


  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMode(@javax.annotation.Nullable CoEditingConfigMode mode) {
    this.mode = mode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoEditingConfig coEditingConfig = (CoEditingConfig) o;
    return Objects.equals(this.change, coEditingConfig.change) &&
        Objects.equals(this.fast, coEditingConfig.fast) &&
        Objects.equals(this.mode, coEditingConfig.mode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(change, fast, mode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoEditingConfig {\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    fast: ").append(toIndentedString(fast)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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

    // add `change` to the URL query string
    if (getChange() != null) {
      try {
        joiner.add(String.format("%schange%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getChange()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `fast` to the URL query string
    if (getFast() != null) {
      try {
        joiner.add(String.format("%sfast%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFast()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `mode` to the URL query string
    if (getMode() != null) {
      try {
        joiner.add(String.format("%smode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMode()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

