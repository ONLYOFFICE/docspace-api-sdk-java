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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * AiToolsSetDisabledRequest
 */
@JsonPropertyOrder({
  AiToolsSetDisabledRequest.JSON_PROPERTY_SERVER_TYPE,
  AiToolsSetDisabledRequest.JSON_PROPERTY_TOOL_NAMES,
  AiToolsSetDisabledRequest.JSON_PROPERTY_ENTITY_ID
})
@JsonTypeName("aiToolsSetDisabled_request")

public class AiToolsSetDisabledRequest {
  public static final String JSON_PROPERTY_SERVER_TYPE = "serverType";
  @javax.annotation.Nonnull  private String serverType;

  public static final String JSON_PROPERTY_TOOL_NAMES = "toolNames";
  @javax.annotation.Nonnull  private List<String> toolNames = new ArrayList<>();

  public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
  @javax.annotation.Nullable  private String entityId;

  public AiToolsSetDisabledRequest() {
  }


  public AiToolsSetDisabledRequest serverType(@javax.annotation.Nonnull String serverType) {
    
    this.serverType = serverType;
    return this;
  }

  /**
   * Get serverType
   * @return serverType
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_SERVER_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getServerType() {
    return serverType;
  }


  @JsonProperty(value = JSON_PROPERTY_SERVER_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setServerType(@javax.annotation.Nonnull String serverType) {
    this.serverType = serverType;
  }

  public AiToolsSetDisabledRequest toolNames(@javax.annotation.Nonnull List<String> toolNames) {
    
    this.toolNames = toolNames;
    return this;
  }

  public AiToolsSetDisabledRequest addToolNamesItem(String toolNamesItem) {
    if (this.toolNames == null) {
      this.toolNames = new ArrayList<>();
    }
    this.toolNames.add(toolNamesItem);
    return this;
  }

  /**
   * Tool names to disable.
   * @return toolNames
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_TOOL_NAMES, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getToolNames() {
    return toolNames;
  }


  @JsonProperty(value = JSON_PROPERTY_TOOL_NAMES, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setToolNames(@javax.annotation.Nonnull List<String> toolNames) {
    this.toolNames = toolNames;
  }

  public AiToolsSetDisabledRequest entityId(@javax.annotation.Nullable String entityId) {
    
    this.entityId = entityId;
    return this;
  }

  /**
   * Get entityId
   * @return entityId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ENTITY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEntityId() {
    return entityId;
  }


  @JsonProperty(value = JSON_PROPERTY_ENTITY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityId(@javax.annotation.Nullable String entityId) {
    this.entityId = entityId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiToolsSetDisabledRequest aiToolsSetDisabledRequest = (AiToolsSetDisabledRequest) o;
    return Objects.equals(this.serverType, aiToolsSetDisabledRequest.serverType) &&
        Objects.equals(this.toolNames, aiToolsSetDisabledRequest.toolNames) &&
        Objects.equals(this.entityId, aiToolsSetDisabledRequest.entityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serverType, toolNames, entityId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiToolsSetDisabledRequest {\n");
    sb.append("    serverType: ").append(toIndentedString(serverType)).append("\n");
    sb.append("    toolNames: ").append(toIndentedString(toolNames)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
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

    // add `serverType` to the URL query string
    if (getServerType() != null) {
      try {
        joiner.add(String.format("%sserverType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getServerType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `toolNames` to the URL query string
    if (getToolNames() != null) {
      for (int i = 0; i < getToolNames().size(); i++) {
        try {
          joiner.add(String.format("%stoolNames%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getToolNames().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `entityId` to the URL query string
    if (getEntityId() != null) {
      try {
        joiner.add(String.format("%sentityId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEntityId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

