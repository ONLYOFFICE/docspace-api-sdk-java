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
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * ProblemDetail
 */
@JsonPropertyOrder({
  ProblemDetail.JSON_PROPERTY_TYPE,
  ProblemDetail.JSON_PROPERTY_TITLE,
  ProblemDetail.JSON_PROPERTY_STATUS,
  ProblemDetail.JSON_PROPERTY_DETAIL,
  ProblemDetail.JSON_PROPERTY_INSTANCE,
  ProblemDetail.JSON_PROPERTY_PROPERTIES
})

public class ProblemDetail {
  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable  private URI type;

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable  private String title;

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nullable  private Integer status;

  public static final String JSON_PROPERTY_DETAIL = "detail";
  @javax.annotation.Nullable  private String detail;

  public static final String JSON_PROPERTY_INSTANCE = "instance";
  @javax.annotation.Nullable  private URI instance;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  @javax.annotation.Nullable  private Map<String, Object> properties = new HashMap<>();

  public ProblemDetail() {
  }


  public ProblemDetail type(@javax.annotation.Nullable URI type) {
    
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@javax.annotation.Nullable URI type) {
    this.type = type;
  }

  public ProblemDetail title(@javax.annotation.Nullable String title) {
    
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(value = JSON_PROPERTY_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(@javax.annotation.Nullable String title) {
    this.title = title;
  }

  public ProblemDetail status(@javax.annotation.Nullable Integer status) {
    
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStatus() {
    return status;
  }


  @JsonProperty(value = JSON_PROPERTY_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(@javax.annotation.Nullable Integer status) {
    this.status = status;
  }

  public ProblemDetail detail(@javax.annotation.Nullable String detail) {
    
    this.detail = detail;
    return this;
  }

  /**
   * Get detail
   * @return detail
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DETAIL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDetail() {
    return detail;
  }


  @JsonProperty(value = JSON_PROPERTY_DETAIL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetail(@javax.annotation.Nullable String detail) {
    this.detail = detail;
  }

  public ProblemDetail instance(@javax.annotation.Nullable URI instance) {
    
    this.instance = instance;
    return this;
  }

  /**
   * Get instance
   * @return instance
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_INSTANCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getInstance() {
    return instance;
  }


  @JsonProperty(value = JSON_PROPERTY_INSTANCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstance(@javax.annotation.Nullable URI instance) {
    this.instance = instance;
  }

  public ProblemDetail properties(@javax.annotation.Nullable Map<String, Object> properties) {
    
    this.properties = properties;
    return this;
  }

  public ProblemDetail putPropertiesItem(String key, Object propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

  /**
   * Get properties
   * @return properties
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PROPERTIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getProperties() {
    return properties;
  }


  @JsonProperty(value = JSON_PROPERTY_PROPERTIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProperties(@javax.annotation.Nullable Map<String, Object> properties) {
    this.properties = properties;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProblemDetail problemDetail = (ProblemDetail) o;
    return Objects.equals(this.type, problemDetail.type) &&
        Objects.equals(this.title, problemDetail.title) &&
        Objects.equals(this.status, problemDetail.status) &&
        Objects.equals(this.detail, problemDetail.detail) &&
        Objects.equals(this.instance, problemDetail.instance) &&
        Objects.equals(this.properties, problemDetail.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, title, status, detail, instance, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProblemDetail {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

    // add `type` to the URL query string
    if (getType() != null) {
      try {
        joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `title` to the URL query string
    if (getTitle() != null) {
      try {
        joiner.add(String.format("%stitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTitle()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
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

    // add `detail` to the URL query string
    if (getDetail() != null) {
      try {
        joiner.add(String.format("%sdetail%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDetail()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `instance` to the URL query string
    if (getInstance() != null) {
      try {
        joiner.add(String.format("%sinstance%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInstance()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `properties` to the URL query string
    if (getProperties() != null) {
      for (String _key : getProperties().keySet()) {
        try {
          joiner.add(String.format("%sproperties%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getProperties().get(_key), URLEncoder.encode(String.valueOf(getProperties().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}

