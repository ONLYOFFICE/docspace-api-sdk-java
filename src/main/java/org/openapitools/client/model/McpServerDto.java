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
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.openapitools.client.model.Icon;
import org.openapitools.client.model.ServerType;
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
 * Full MCP server configuration, including connection details and authentication headers. Returned for administrator-level operations.
 */
@JsonPropertyOrder({
  McpServerDto.JSON_PROPERTY_ID,
  McpServerDto.JSON_PROPERTY_NAME,
  McpServerDto.JSON_PROPERTY_DESCRIPTION,
  McpServerDto.JSON_PROPERTY_ENDPOINT,
  McpServerDto.JSON_PROPERTY_SERVER_TYPE,
  McpServerDto.JSON_PROPERTY_HEADERS,
  McpServerDto.JSON_PROPERTY_ENABLED,
  McpServerDto.JSON_PROPERTY_ICON,
  McpServerDto.JSON_PROPERTY_NEED_RESET
})

public class McpServerDto {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable  private UUID id;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @javax.annotation.Nullable  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ENDPOINT = "endpoint";
  @javax.annotation.Nullable  private JsonNullable<String> endpoint = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SERVER_TYPE = "serverType";
  @javax.annotation.Nullable  private ServerType serverType;

  public static final String JSON_PROPERTY_HEADERS = "headers";
  @javax.annotation.Nullable  private JsonNullable<Map<String, String>> headers = JsonNullable.<Map<String, String>>undefined();

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  @javax.annotation.Nullable  private Boolean enabled;

  public static final String JSON_PROPERTY_ICON = "icon";
  @javax.annotation.Nullable  private Icon icon;

  public static final String JSON_PROPERTY_NEED_RESET = "needReset";
  @javax.annotation.Nullable  private Boolean needReset;

  public McpServerDto() {
  }


  public McpServerDto id(@javax.annotation.Nullable UUID id) {
    
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the MCP server.
   * @return id
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable UUID id) {
    this.id = id;
  }

  public McpServerDto name(@javax.annotation.Nullable String name) {
    this.name = JsonNullable.<String>of(name);
    
    return this;
  }

  /**
   * Display name of the MCP server.
   * @return name
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = JsonNullable.<String>of(name);
  }

  public McpServerDto description(@javax.annotation.Nullable String description) {
    this.description = JsonNullable.<String>of(description);
    
    return this;
  }

  /**
   * Human-readable description of the server's purpose and capabilities.
   * @return description
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getDescription() {
        return description.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_DESCRIPTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }
  
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = JsonNullable.<String>of(description);
  }

  public McpServerDto endpoint(@javax.annotation.Nullable String endpoint) {
    this.endpoint = JsonNullable.<String>of(endpoint);
    
    return this;
  }

  /**
   * Base URL of the MCP server endpoint.
   * @return endpoint
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getEndpoint() {
        return endpoint.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ENDPOINT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getEndpoint_JsonNullable() {
    return endpoint;
  }
  
  @JsonProperty(JSON_PROPERTY_ENDPOINT)
  public void setEndpoint_JsonNullable(JsonNullable<String> endpoint) {
    this.endpoint = endpoint;
  }

  public void setEndpoint(@javax.annotation.Nullable String endpoint) {
    this.endpoint = JsonNullable.<String>of(endpoint);
  }

  public McpServerDto serverType(@javax.annotation.Nullable ServerType serverType) {
    
    this.serverType = serverType;
    return this;
  }

  /**
   * Get serverType
   * @return serverType
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SERVER_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ServerType getServerType() {
    return serverType;
  }


  @JsonProperty(value = JSON_PROPERTY_SERVER_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServerType(@javax.annotation.Nullable ServerType serverType) {
    this.serverType = serverType;
  }

  public McpServerDto headers(@javax.annotation.Nullable Map<String, String> headers) {
    this.headers = JsonNullable.<Map<String, String>>of(headers);
    
    return this;
  }

  public McpServerDto putHeadersItem(String key, String headersItem) {
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
   * HTTP headers sent with every request to the server (e.g., authentication tokens).
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

  public McpServerDto enabled(@javax.annotation.Nullable Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

  /**
   * Indicates whether the server is currently enabled and available for room assignment.
   * @return enabled
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(value = JSON_PROPERTY_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabled(@javax.annotation.Nullable Boolean enabled) {
    this.enabled = enabled;
  }

  public McpServerDto icon(@javax.annotation.Nullable Icon icon) {
    
    this.icon = icon;
    return this;
  }

  /**
   * Get icon
   * @return icon
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ICON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Icon getIcon() {
    return icon;
  }


  @JsonProperty(value = JSON_PROPERTY_ICON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIcon(@javax.annotation.Nullable Icon icon) {
    this.icon = icon;
  }

  public McpServerDto needReset(@javax.annotation.Nullable Boolean needReset) {
    
    this.needReset = needReset;
    return this;
  }

  /**
   * Indicates whether the server requires a configuration reset due to connectivity or credential issues.
   * @return needReset
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_NEED_RESET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNeedReset() {
    return needReset;
  }


  @JsonProperty(value = JSON_PROPERTY_NEED_RESET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNeedReset(@javax.annotation.Nullable Boolean needReset) {
    this.needReset = needReset;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    McpServerDto mcpServerDto = (McpServerDto) o;
    return Objects.equals(this.id, mcpServerDto.id) &&
        equalsNullable(this.name, mcpServerDto.name) &&
        equalsNullable(this.description, mcpServerDto.description) &&
        equalsNullable(this.endpoint, mcpServerDto.endpoint) &&
        Objects.equals(this.serverType, mcpServerDto.serverType) &&
        equalsNullable(this.headers, mcpServerDto.headers) &&
        Objects.equals(this.enabled, mcpServerDto.enabled) &&
        Objects.equals(this.icon, mcpServerDto.icon) &&
        Objects.equals(this.needReset, mcpServerDto.needReset);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(name), hashCodeNullable(description), hashCodeNullable(endpoint), serverType, hashCodeNullable(headers), enabled, icon, needReset);
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
    sb.append("class McpServerDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    serverType: ").append(toIndentedString(serverType)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    needReset: ").append(toIndentedString(needReset)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

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

    // add `serverType` to the URL query string
    if (getServerType() != null) {
      try {
        joiner.add(String.format("%sserverType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getServerType()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `enabled` to the URL query string
    if (getEnabled() != null) {
      try {
        joiner.add(String.format("%senabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnabled()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `icon` to the URL query string
    if (getIcon() != null) {
      joiner.add(getIcon().toUrlQueryString(prefix + "icon" + suffix));
    }

    // add `needReset` to the URL query string
    if (getNeedReset() != null) {
      try {
        joiner.add(String.format("%sneedReset%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNeedReset()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

