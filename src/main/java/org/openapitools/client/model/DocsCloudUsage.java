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
 * Represents the usage statistics of a DocsCloud tenant.
 */
@JsonPropertyOrder({
  DocsCloudUsage.JSON_PROPERTY_SINCE,
  DocsCloudUsage.JSON_PROPERTY_ACTIVE_COUNT
})

public class DocsCloudUsage {
  public static final String JSON_PROPERTY_SINCE = "since";
  @javax.annotation.Nullable  private OffsetDateTime since;

  public static final String JSON_PROPERTY_ACTIVE_COUNT = "activeCount";
  @javax.annotation.Nullable  private Integer activeCount;

  public DocsCloudUsage() {
  }


  public DocsCloudUsage since(@javax.annotation.Nullable OffsetDateTime since) {
    
    this.since = since;
    return this;
  }

  /**
   * The date and time the usage statistics are counted from.
   * @return since
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SINCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getSince() {
    return since;
  }


  @JsonProperty(value = JSON_PROPERTY_SINCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSince(@javax.annotation.Nullable OffsetDateTime since) {
    this.since = since;
  }

  public DocsCloudUsage activeCount(@javax.annotation.Nullable Integer activeCount) {
    
    this.activeCount = activeCount;
    return this;
  }

  /**
   * The number of active users.
   * @return activeCount
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ACTIVE_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getActiveCount() {
    return activeCount;
  }


  @JsonProperty(value = JSON_PROPERTY_ACTIVE_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActiveCount(@javax.annotation.Nullable Integer activeCount) {
    this.activeCount = activeCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocsCloudUsage docsCloudUsage = (DocsCloudUsage) o;
    return Objects.equals(this.since, docsCloudUsage.since) &&
        Objects.equals(this.activeCount, docsCloudUsage.activeCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(since, activeCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocsCloudUsage {\n");
    sb.append("    since: ").append(toIndentedString(since)).append("\n");
    sb.append("    activeCount: ").append(toIndentedString(activeCount)).append("\n");
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

    // add `since` to the URL query string
    if (getSince() != null) {
      try {
        joiner.add(String.format("%ssince%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSince()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `activeCount` to the URL query string
    if (getActiveCount() != null) {
      try {
        joiner.add(String.format("%sactiveCount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getActiveCount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

