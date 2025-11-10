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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The response containing paginated modification information.
 */
@JsonPropertyOrder({
  PageableModificationResponse.JSON_PROPERTY_DATA,
  PageableModificationResponse.JSON_PROPERTY_LIMIT,
  PageableModificationResponse.JSON_PROPERTY_LAST_MODIFIED_ON
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class PageableModificationResponse {
  public static final String JSON_PROPERTY_DATA = "data";
  @javax.annotation.Nullable
  private Object data;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  @javax.annotation.Nullable
  private Integer limit;

  public static final String JSON_PROPERTY_LAST_MODIFIED_ON = "last_modified_on";
  @javax.annotation.Nullable
  private OffsetDateTime lastModifiedOn;

  public PageableModificationResponse() {
  }

  public PageableModificationResponse data(@javax.annotation.Nullable Object data) {
    
    this.data = data;
    return this;
  }

  /**
   * The paginated modification data.
   * @return data
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(@javax.annotation.Nullable Object data) {
    this.data = data;
  }

  public PageableModificationResponse limit(@javax.annotation.Nullable Integer limit) {
    
    this.limit = limit;
    return this;
  }

  /**
   * The maximum number of results returned per page.
   * @return limit
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLimit() {
    return limit;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimit(@javax.annotation.Nullable Integer limit) {
    this.limit = limit;
  }

  public PageableModificationResponse lastModifiedOn(@javax.annotation.Nullable OffsetDateTime lastModifiedOn) {
    
    this.lastModifiedOn = lastModifiedOn;
    return this;
  }

  /**
   * The date when the user consent was last modified.
   * @return lastModifiedOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastModifiedOn() {
    return lastModifiedOn;
  }


  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastModifiedOn(@javax.annotation.Nullable OffsetDateTime lastModifiedOn) {
    this.lastModifiedOn = lastModifiedOn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageableModificationResponse pageableModificationResponse = (PageableModificationResponse) o;
    return Objects.equals(this.data, pageableModificationResponse.data) &&
        Objects.equals(this.limit, pageableModificationResponse.limit) &&
        Objects.equals(this.lastModifiedOn, pageableModificationResponse.lastModifiedOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, limit, lastModifiedOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageableModificationResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    lastModifiedOn: ").append(toIndentedString(lastModifiedOn)).append("\n");
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

    // add `data` to the URL query string
    if (getData() != null) {
      try {
        joiner.add(String.format("%sdata%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getData()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `limit` to the URL query string
    if (getLimit() != null) {
      try {
        joiner.add(String.format("%slimit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLimit()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `last_modified_on` to the URL query string
    if (getLastModifiedOn() != null) {
      try {
        joiner.add(String.format("%slast_modified_on%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLastModifiedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

