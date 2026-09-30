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
 * Represents the server configuration of a Docs Connect tenant.
 */
@JsonPropertyOrder({
  DocsCloudServerConfig.JSON_PROPERTY_IS_ANONYMOUS_SUPPORT,
  DocsCloudServerConfig.JSON_PROPERTY_FILE_SIZE_LIMIT
})

public class DocsCloudServerConfig {
  public static final String JSON_PROPERTY_IS_ANONYMOUS_SUPPORT = "isAnonymousSupport";
  @javax.annotation.Nullable  private Boolean isAnonymousSupport;

  public static final String JSON_PROPERTY_FILE_SIZE_LIMIT = "fileSizeLimit";
  @javax.annotation.Nullable  private Long fileSizeLimit;

  public DocsCloudServerConfig() {
  }


  public DocsCloudServerConfig isAnonymousSupport(@javax.annotation.Nullable Boolean isAnonymousSupport) {
    
    this.isAnonymousSupport = isAnonymousSupport;
    return this;
  }

  /**
   * Whether anonymous access is supported.
   * @return isAnonymousSupport
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IS_ANONYMOUS_SUPPORT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsAnonymousSupport() {
    return isAnonymousSupport;
  }


  @JsonProperty(value = JSON_PROPERTY_IS_ANONYMOUS_SUPPORT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsAnonymousSupport(@javax.annotation.Nullable Boolean isAnonymousSupport) {
    this.isAnonymousSupport = isAnonymousSupport;
  }

  public DocsCloudServerConfig fileSizeLimit(@javax.annotation.Nullable Long fileSizeLimit) {
    
    this.fileSizeLimit = fileSizeLimit;
    return this;
  }

  /**
   * The maximum file size in bytes.
   * minimum: 0
   * maximum: 209715200
   * @return fileSizeLimit
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_FILE_SIZE_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getFileSizeLimit() {
    return fileSizeLimit;
  }


  @JsonProperty(value = JSON_PROPERTY_FILE_SIZE_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileSizeLimit(@javax.annotation.Nullable Long fileSizeLimit) {
    this.fileSizeLimit = fileSizeLimit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocsCloudServerConfig docsCloudServerConfig = (DocsCloudServerConfig) o;
    return Objects.equals(this.isAnonymousSupport, docsCloudServerConfig.isAnonymousSupport) &&
        Objects.equals(this.fileSizeLimit, docsCloudServerConfig.fileSizeLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isAnonymousSupport, fileSizeLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocsCloudServerConfig {\n");
    sb.append("    isAnonymousSupport: ").append(toIndentedString(isAnonymousSupport)).append("\n");
    sb.append("    fileSizeLimit: ").append(toIndentedString(fileSizeLimit)).append("\n");
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

    // add `isAnonymousSupport` to the URL query string
    if (getIsAnonymousSupport() != null) {
      try {
        joiner.add(String.format("%sisAnonymousSupport%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsAnonymousSupport()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `fileSizeLimit` to the URL query string
    if (getFileSizeLimit() != null) {
      try {
        joiner.add(String.format("%sfileSizeLimit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFileSizeLimit()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

