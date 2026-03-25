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
import java.util.UUID;
import org.openapitools.client.model.Icon;
import org.openapitools.client.model.ServerType;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * MCP server status within a room, reflecting the current user&#39;s connection state for OAuth-based servers.
 */
@JsonPropertyOrder({
  McpServerStatusDto.JSON_PROPERTY_ID,
  McpServerStatusDto.JSON_PROPERTY_NAME,
  McpServerStatusDto.JSON_PROPERTY_SERVER_TYPE,
  McpServerStatusDto.JSON_PROPERTY_CONNECTED,
  McpServerStatusDto.JSON_PROPERTY_ICON,
  McpServerStatusDto.JSON_PROPERTY_NEED_RESET
})

public class McpServerStatusDto {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable  private UUID id;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable  private String name;

  public static final String JSON_PROPERTY_SERVER_TYPE = "serverType";
  @javax.annotation.Nullable  private ServerType serverType;

  public static final String JSON_PROPERTY_CONNECTED = "connected";
  @javax.annotation.Nullable  private Boolean connected;

  public static final String JSON_PROPERTY_ICON = "icon";
  @javax.annotation.Nullable  private Icon icon;

  public static final String JSON_PROPERTY_NEED_RESET = "needReset";
  @javax.annotation.Nullable  private Boolean needReset;

  public McpServerStatusDto() {
  }


  public McpServerStatusDto id(@javax.annotation.Nullable UUID id) {
    
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

  public McpServerStatusDto name(@javax.annotation.Nullable String name) {
    
    this.name = name;
    return this;
  }

  /**
   * Display name of the MCP server.
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

  public McpServerStatusDto serverType(@javax.annotation.Nullable ServerType serverType) {
    
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

  public McpServerStatusDto connected(@javax.annotation.Nullable Boolean connected) {
    
    this.connected = connected;
    return this;
  }

  /**
   * Indicates whether the current user has an active connection to this server. For direct-connection servers this is always true; for OAuth-based servers it reflects whether the user has completed authorization.
   * @return connected
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CONNECTED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getConnected() {
    return connected;
  }


  @JsonProperty(value = JSON_PROPERTY_CONNECTED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnected(@javax.annotation.Nullable Boolean connected) {
    this.connected = connected;
  }

  public McpServerStatusDto icon(@javax.annotation.Nullable Icon icon) {
    
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

  public McpServerStatusDto needReset(@javax.annotation.Nullable Boolean needReset) {
    
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
    McpServerStatusDto mcpServerStatusDto = (McpServerStatusDto) o;
    return Objects.equals(this.id, mcpServerStatusDto.id) &&
        Objects.equals(this.name, mcpServerStatusDto.name) &&
        Objects.equals(this.serverType, mcpServerStatusDto.serverType) &&
        Objects.equals(this.connected, mcpServerStatusDto.connected) &&
        Objects.equals(this.icon, mcpServerStatusDto.icon) &&
        Objects.equals(this.needReset, mcpServerStatusDto.needReset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, serverType, connected, icon, needReset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class McpServerStatusDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    serverType: ").append(toIndentedString(serverType)).append("\n");
    sb.append("    connected: ").append(toIndentedString(connected)).append("\n");
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

    // add `serverType` to the URL query string
    if (getServerType() != null) {
      try {
        joiner.add(String.format("%sserverType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getServerType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `connected` to the URL query string
    if (getConnected() != null) {
      try {
        joiner.add(String.format("%sconnected%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConnected()), "UTF-8").replaceAll("\\+", "%20")));
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

