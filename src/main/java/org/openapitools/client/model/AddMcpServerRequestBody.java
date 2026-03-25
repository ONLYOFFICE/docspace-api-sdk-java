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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Parameters for creating a new custom MCP server.
 */
@JsonPropertyOrder({
  AddMcpServerRequestBody.JSON_PROPERTY_NAME,
  AddMcpServerRequestBody.JSON_PROPERTY_DESCRIPTION,
  AddMcpServerRequestBody.JSON_PROPERTY_ENDPOINT,
  AddMcpServerRequestBody.JSON_PROPERTY_HEADERS,
  AddMcpServerRequestBody.JSON_PROPERTY_ICON
})

public class AddMcpServerRequestBody {
  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @javax.annotation.Nullable  private String description;

  public static final String JSON_PROPERTY_ENDPOINT = "endpoint";
  @javax.annotation.Nullable  private URI endpoint;

  public static final String JSON_PROPERTY_HEADERS = "headers";
  @javax.annotation.Nullable  private JsonNullable<Map<String, String>> headers = JsonNullable.<Map<String, String>>undefined();

  public static final String JSON_PROPERTY_ICON = "icon";
  @javax.annotation.Nullable  private JsonNullable<String> icon = JsonNullable.<String>undefined();

  public AddMcpServerRequestBody() {
  }


  public AddMcpServerRequestBody name(@javax.annotation.Nullable String name) {
    
    this.name = name;
    return this;
  }

  /**
   * Unique display name for the server. Only letters, numbers, underscores, and hyphens are allowed. Maximum 128 characters.
   * @return name
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }

  public AddMcpServerRequestBody description(@javax.annotation.Nullable String description) {
    
    this.description = description;
    return this;
  }

  /**
   * Human-readable description of the server&#39;s purpose and capabilities. Maximum 255 characters.
   * @return description
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DESCRIPTION, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(value = JSON_PROPERTY_DESCRIPTION, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }

  public AddMcpServerRequestBody endpoint(@javax.annotation.Nullable URI endpoint) {
    
    this.endpoint = endpoint;
    return this;
  }

  /**
   * Base URL of the MCP server endpoint. Must be a valid, reachable URL. The system will verify connectivity during registration.
   * @return endpoint
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ENDPOINT, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public URI getEndpoint() {
    return endpoint;
  }


  @JsonProperty(value = JSON_PROPERTY_ENDPOINT, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEndpoint(@javax.annotation.Nullable URI endpoint) {
    this.endpoint = endpoint;
  }

  public AddMcpServerRequestBody headers(@javax.annotation.Nullable Map<String, String> headers) {
    this.headers = JsonNullable.<Map<String, String>>of(headers);
    
    return this;
  }

  public AddMcpServerRequestBody putHeadersItem(String key, String headersItem) {
    if (this.headers == null || !this.headers.isPresent()) {
      this.headers = JsonNullable.<Map<String, String>>of(new HashMap<>());
    }
    try {
      this.headers.get().put(key, headersItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Optional HTTP headers to include with every request to the MCP server (e.g., authentication tokens or API keys).
   * @return headers
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Map<String, String> getHeaders() {
        return headers.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_HEADERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Map<String, String>> getHeaders_JsonNullable() {
    return headers;
  }
  
  @JsonProperty(JSON_PROPERTY_HEADERS)
  public void setHeaders_JsonNullable(JsonNullable<Map<String, String>> headers) {
    this.headers = headers;
  }

  public void setHeaders(@javax.annotation.Nullable Map<String, String> headers) {
    this.headers = JsonNullable.<Map<String, String>>of(headers);
  }

  public AddMcpServerRequestBody icon(@javax.annotation.Nullable String icon) {
    this.icon = JsonNullable.<String>of(icon);
    
    return this;
  }

  /**
   * Optional Base64-encoded icon image for the server. Used as the visual identifier in the UI.
   * @return icon
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getIcon() {
        return icon.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ICON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getIcon_JsonNullable() {
    return icon;
  }
  
  @JsonProperty(JSON_PROPERTY_ICON)
  public void setIcon_JsonNullable(JsonNullable<String> icon) {
    this.icon = icon;
  }

  public void setIcon(@javax.annotation.Nullable String icon) {
    this.icon = JsonNullable.<String>of(icon);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddMcpServerRequestBody addMcpServerRequestBody = (AddMcpServerRequestBody) o;
    return Objects.equals(this.name, addMcpServerRequestBody.name) &&
        Objects.equals(this.description, addMcpServerRequestBody.description) &&
        Objects.equals(this.endpoint, addMcpServerRequestBody.endpoint) &&
        equalsNullable(this.headers, addMcpServerRequestBody.headers) &&
        equalsNullable(this.icon, addMcpServerRequestBody.icon);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, endpoint, hashCodeNullable(headers), hashCodeNullable(icon));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddMcpServerRequestBody {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      try {
        joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `endpoint` to the URL query string
    if (getEndpoint() != null) {
      try {
        joiner.add(String.format("%sendpoint%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEndpoint()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `headers` to the URL query string
    if (getHeaders() != null) {
      for (String _key : getHeaders().keySet()) {
        try {
          joiner.add(String.format("%sheaders%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getHeaders().get(_key), URLEncoder.encode(String.valueOf(getHeaders().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `icon` to the URL query string
    if (getIcon() != null) {
      try {
        joiner.add(String.format("%sicon%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIcon()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

