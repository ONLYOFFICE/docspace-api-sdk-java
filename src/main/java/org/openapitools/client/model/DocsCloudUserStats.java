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
 * Represents the usage statistics of a single Docs Connect user category (editor or viewer).
 */
@JsonPropertyOrder({
  DocsCloudUserStats.JSON_PROPERTY_ACTIVE,
  DocsCloudUserStats.JSON_PROPERTY_INTERNAL,
  DocsCloudUserStats.JSON_PROPERTY_EXTERNAL,
  DocsCloudUserStats.JSON_PROPERTY_REMAINING,
  DocsCloudUserStats.JSON_PROPERTY_CRITICAL_REMAINING
})

public class DocsCloudUserStats {
  public static final String JSON_PROPERTY_ACTIVE = "active";
  @javax.annotation.Nullable  private Integer active;

  public static final String JSON_PROPERTY_INTERNAL = "internal";
  @javax.annotation.Nullable  private Integer internal;

  public static final String JSON_PROPERTY_EXTERNAL = "external";
  @javax.annotation.Nullable  private Integer external;

  public static final String JSON_PROPERTY_REMAINING = "remaining";
  @javax.annotation.Nullable  private Integer remaining;

  public static final String JSON_PROPERTY_CRITICAL_REMAINING = "criticalRemaining";
  @javax.annotation.Nullable  private Boolean criticalRemaining;

  public DocsCloudUserStats() {
  }


  public DocsCloudUserStats active(@javax.annotation.Nullable Integer active) {
    
    this.active = active;
    return this;
  }

  /**
   * The number of active users.
   * @return active
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ACTIVE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getActive() {
    return active;
  }


  @JsonProperty(value = JSON_PROPERTY_ACTIVE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActive(@javax.annotation.Nullable Integer active) {
    this.active = active;
  }

  public DocsCloudUserStats internal(@javax.annotation.Nullable Integer internal) {
    
    this.internal = internal;
    return this;
  }

  /**
   * The number of internal users.
   * @return internal
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_INTERNAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getInternal() {
    return internal;
  }


  @JsonProperty(value = JSON_PROPERTY_INTERNAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInternal(@javax.annotation.Nullable Integer internal) {
    this.internal = internal;
  }

  public DocsCloudUserStats external(@javax.annotation.Nullable Integer external) {
    
    this.external = external;
    return this;
  }

  /**
   * The number of external users.
   * @return external
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_EXTERNAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getExternal() {
    return external;
  }


  @JsonProperty(value = JSON_PROPERTY_EXTERNAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternal(@javax.annotation.Nullable Integer external) {
    this.external = external;
  }

  public DocsCloudUserStats remaining(@javax.annotation.Nullable Integer remaining) {
    
    this.remaining = remaining;
    return this;
  }

  /**
   * The number of remaining users before the limit is reached.
   * @return remaining
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_REMAINING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRemaining() {
    return remaining;
  }


  @JsonProperty(value = JSON_PROPERTY_REMAINING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemaining(@javax.annotation.Nullable Integer remaining) {
    this.remaining = remaining;
  }

  public DocsCloudUserStats criticalRemaining(@javax.annotation.Nullable Boolean criticalRemaining) {
    
    this.criticalRemaining = criticalRemaining;
    return this;
  }

  /**
   * Whether the number of remaining users is critically low.
   * @return criticalRemaining
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CRITICAL_REMAINING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCriticalRemaining() {
    return criticalRemaining;
  }


  @JsonProperty(value = JSON_PROPERTY_CRITICAL_REMAINING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCriticalRemaining(@javax.annotation.Nullable Boolean criticalRemaining) {
    this.criticalRemaining = criticalRemaining;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocsCloudUserStats docsCloudUserStats = (DocsCloudUserStats) o;
    return Objects.equals(this.active, docsCloudUserStats.active) &&
        Objects.equals(this.internal, docsCloudUserStats.internal) &&
        Objects.equals(this.external, docsCloudUserStats.external) &&
        Objects.equals(this.remaining, docsCloudUserStats.remaining) &&
        Objects.equals(this.criticalRemaining, docsCloudUserStats.criticalRemaining);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, internal, external, remaining, criticalRemaining);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocsCloudUserStats {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    external: ").append(toIndentedString(external)).append("\n");
    sb.append("    remaining: ").append(toIndentedString(remaining)).append("\n");
    sb.append("    criticalRemaining: ").append(toIndentedString(criticalRemaining)).append("\n");
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

    // add `active` to the URL query string
    if (getActive() != null) {
      try {
        joiner.add(String.format("%sactive%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getActive()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `internal` to the URL query string
    if (getInternal() != null) {
      try {
        joiner.add(String.format("%sinternal%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInternal()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `external` to the URL query string
    if (getExternal() != null) {
      try {
        joiner.add(String.format("%sexternal%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExternal()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `remaining` to the URL query string
    if (getRemaining() != null) {
      try {
        joiner.add(String.format("%sremaining%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRemaining()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `criticalRemaining` to the URL query string
    if (getCriticalRemaining() != null) {
      try {
        joiner.add(String.format("%scriticalRemaining%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCriticalRemaining()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

