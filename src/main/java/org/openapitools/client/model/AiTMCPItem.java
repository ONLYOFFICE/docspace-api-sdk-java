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
 * Descriptor for a tool exposed by an MCP server.
 */
@JsonPropertyOrder({
  AiTMCPItem.JSON_PROPERTY_NAME,
  AiTMCPItem.JSON_PROPERTY_DESCRIPTION,
  AiTMCPItem.JSON_PROPERTY_INPUT_SCHEMA,
  AiTMCPItem.JSON_PROPERTY_ENABLED,
  AiTMCPItem.JSON_PROPERTY_SERVER_TYPE,
  AiTMCPItem.JSON_PROPERTY_REQUIRE_APPROVAL
})

public class AiTMCPItem {
  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @javax.annotation.Nonnull  private String description;

  public static final String JSON_PROPERTY_INPUT_SCHEMA = "inputSchema";
  @javax.annotation.Nonnull  private Object inputSchema;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  @javax.annotation.Nullable  private Boolean enabled;

  public static final String JSON_PROPERTY_SERVER_TYPE = "serverType";
  @javax.annotation.Nullable  private String serverType;

  public static final String JSON_PROPERTY_REQUIRE_APPROVAL = "requireApproval";
  @javax.annotation.Nullable  private Boolean requireApproval;

  public AiTMCPItem() {
  }


  public AiTMCPItem name(@javax.annotation.Nonnull String name) {
    
    this.name = name;
    return this;
  }

  /**
   * Tool name as registered on the MCP server (e.g. `web_search`, `insert_text`).
   * @return name
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(value = JSON_PROPERTY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }

  public AiTMCPItem description(@javax.annotation.Nonnull String description) {
    
    this.description = description;
    return this;
  }

  /**
   * Human-readable description shown to the AI model and in the tools list UI.
   * @return description
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_DESCRIPTION, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(value = JSON_PROPERTY_DESCRIPTION, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(@javax.annotation.Nonnull String description) {
    this.description = description;
  }

  public AiTMCPItem inputSchema(@javax.annotation.Nonnull Object inputSchema) {
    
    this.inputSchema = inputSchema;
    return this;
  }

  /**
   * JSON Schema describing the tool's input parameters.
   * @return inputSchema
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_INPUT_SCHEMA, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getInputSchema() {
    return inputSchema;
  }


  @JsonProperty(value = JSON_PROPERTY_INPUT_SCHEMA, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInputSchema(@javax.annotation.Nonnull Object inputSchema) {
    this.inputSchema = inputSchema;
  }

  public AiTMCPItem enabled(@javax.annotation.Nullable Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether this tool is currently enabled. Disabled tools are hidden from the AI model.
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

  public AiTMCPItem serverType(@javax.annotation.Nullable String serverType) {
    
    this.serverType = serverType;
    return this;
  }

  /**
   * Server type (MCP server name / host tool group id) this tool belongs to — the key the persisted disabled map is stored under. Set by the source that enumerated the tool, so a caller-supplied tool can still be attributed to its group after being flattened into a single list: that is what lets the engine apply the disabled map to `actionArgs.tools` instead of trusting the caller to pre-filter. Wire-serializable, so it survives a remote (server-side) engine.
   * @return serverType
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SERVER_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServerType() {
    return serverType;
  }


  @JsonProperty(value = JSON_PROPERTY_SERVER_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServerType(@javax.annotation.Nullable String serverType) {
    this.serverType = serverType;
  }

  public AiTMCPItem requireApproval(@javax.annotation.Nullable Boolean requireApproval) {
    
    this.requireApproval = requireApproval;
    return this;
  }

  /**
   * Whether the consumer must show an approval dialog before this tool runs. The engine reads it when deciding the `autoAllow` flag on a `tool-call-pending` event: `requireApproval === false` auto-allows the call (no dialog), `true` always prompts. `undefined` leaves the decision to the persisted always-allow list alone — so MCP / custom-server tools (which never set it) keep prompting as before, while host tools opt into auto-allow by default. Wire-serializable, so it survives a remote (server-side) engine.
   * @return requireApproval
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_REQUIRE_APPROVAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRequireApproval() {
    return requireApproval;
  }


  @JsonProperty(value = JSON_PROPERTY_REQUIRE_APPROVAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequireApproval(@javax.annotation.Nullable Boolean requireApproval) {
    this.requireApproval = requireApproval;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiTMCPItem aiTMCPItem = (AiTMCPItem) o;
    return Objects.equals(this.name, aiTMCPItem.name) &&
        Objects.equals(this.description, aiTMCPItem.description) &&
        Objects.equals(this.inputSchema, aiTMCPItem.inputSchema) &&
        Objects.equals(this.enabled, aiTMCPItem.enabled) &&
        Objects.equals(this.serverType, aiTMCPItem.serverType) &&
        Objects.equals(this.requireApproval, aiTMCPItem.requireApproval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, inputSchema, enabled, serverType, requireApproval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiTMCPItem {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    inputSchema: ").append(toIndentedString(inputSchema)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    serverType: ").append(toIndentedString(serverType)).append("\n");
    sb.append("    requireApproval: ").append(toIndentedString(requireApproval)).append("\n");
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

    // add `inputSchema` to the URL query string
    if (getInputSchema() != null) {
      try {
        joiner.add(String.format("%sinputSchema%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInputSchema()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
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

    // add `serverType` to the URL query string
    if (getServerType() != null) {
      try {
        joiner.add(String.format("%sserverType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getServerType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `requireApproval` to the URL query string
    if (getRequireApproval() != null) {
      try {
        joiner.add(String.format("%srequireApproval%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRequireApproval()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

