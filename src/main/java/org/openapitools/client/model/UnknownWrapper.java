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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.ActiveConnectionsWrapperLinksInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * UnknownWrapper
 */
@JsonPropertyOrder({
  UnknownWrapper.JSON_PROPERTY_RESPONSE,
  UnknownWrapper.JSON_PROPERTY_COUNT,
  UnknownWrapper.JSON_PROPERTY_LINKS,
  UnknownWrapper.JSON_PROPERTY_STATUS,
  UnknownWrapper.JSON_PROPERTY_STATUS_CODE
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class UnknownWrapper {
  public static final String JSON_PROPERTY_RESPONSE = "response";
  @javax.annotation.Nullable
  private Object response;

  public static final String JSON_PROPERTY_COUNT = "count";
  @javax.annotation.Nullable
  private Integer count;

  public static final String JSON_PROPERTY_LINKS = "links";
  @javax.annotation.Nullable
  private List<ActiveConnectionsWrapperLinksInner> links = new ArrayList<>();

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nullable
  private Integer status;

  public static final String JSON_PROPERTY_STATUS_CODE = "statusCode";
  @javax.annotation.Nullable
  private Integer statusCode;

  public UnknownWrapper() {
  }

  public UnknownWrapper response(@javax.annotation.Nullable Object response) {
    
    this.response = response;
    return this;
  }

  /**
   * Get response
   * @return response
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getResponse() {
    return response;
  }


  @JsonProperty(JSON_PROPERTY_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResponse(@javax.annotation.Nullable Object response) {
    this.response = response;
  }

  public UnknownWrapper count(@javax.annotation.Nullable Integer count) {
    
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCount() {
    return count;
  }


  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCount(@javax.annotation.Nullable Integer count) {
    this.count = count;
  }

  public UnknownWrapper links(@javax.annotation.Nullable List<ActiveConnectionsWrapperLinksInner> links) {
    
    this.links = links;
    return this;
  }

  public UnknownWrapper addLinksItem(ActiveConnectionsWrapperLinksInner linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * Get links
   * @return links
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ActiveConnectionsWrapperLinksInner> getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(@javax.annotation.Nullable List<ActiveConnectionsWrapperLinksInner> links) {
    this.links = links;
  }

  public UnknownWrapper status(@javax.annotation.Nullable Integer status) {
    
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(@javax.annotation.Nullable Integer status) {
    this.status = status;
  }

  public UnknownWrapper statusCode(@javax.annotation.Nullable Integer statusCode) {
    
    this.statusCode = statusCode;
    return this;
  }

  /**
   * Get statusCode
   * @return statusCode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStatusCode() {
    return statusCode;
  }


  @JsonProperty(JSON_PROPERTY_STATUS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatusCode(@javax.annotation.Nullable Integer statusCode) {
    this.statusCode = statusCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnknownWrapper unknownWrapper = (UnknownWrapper) o;
    return Objects.equals(this.response, unknownWrapper.response) &&
        Objects.equals(this.count, unknownWrapper.count) &&
        Objects.equals(this.links, unknownWrapper.links) &&
        Objects.equals(this.status, unknownWrapper.status) &&
        Objects.equals(this.statusCode, unknownWrapper.statusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(response, count, links, status, statusCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnknownWrapper {\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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

    // add `response` to the URL query string
    if (getResponse() != null) {
      try {
        joiner.add(String.format("%sresponse%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getResponse()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `count` to the URL query string
    if (getCount() != null) {
      try {
        joiner.add(String.format("%scount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `links` to the URL query string
    if (getLinks() != null) {
      for (int i = 0; i < getLinks().size(); i++) {
        if (getLinks().get(i) != null) {
          joiner.add(getLinks().get(i).toUrlQueryString(String.format("%slinks%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      try {
        joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatus()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `statusCode` to the URL query string
    if (getStatusCode() != null) {
      try {
        joiner.add(String.format("%sstatusCode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatusCode()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

