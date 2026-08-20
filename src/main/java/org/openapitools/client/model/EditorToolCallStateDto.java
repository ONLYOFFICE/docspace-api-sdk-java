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
 * The editor tool call state. Used to run the agent flow in the editor.
 */
@JsonPropertyOrder({
  EditorToolCallStateDto.JSON_PROPERTY_TOOL_NAME,
  EditorToolCallStateDto.JSON_PROPERTY_PARAMETERS
})

public class EditorToolCallStateDto {
  public static final String JSON_PROPERTY_TOOL_NAME = "toolName";
  @javax.annotation.Nullable  private String toolName;

  public static final String JSON_PROPERTY_PARAMETERS = "parameters";
  @javax.annotation.Nonnull  private Object parameters;

  public EditorToolCallStateDto() {
  }


  public EditorToolCallStateDto toolName(@javax.annotation.Nullable String toolName) {
    
    this.toolName = toolName;
    return this;
  }

  /**
   * The tool name.
   * @return toolName
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TOOL_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getToolName() {
    return toolName;
  }


  @JsonProperty(value = JSON_PROPERTY_TOOL_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setToolName(@javax.annotation.Nullable String toolName) {
    this.toolName = toolName;
  }

  public EditorToolCallStateDto parameters(@javax.annotation.Nonnull Object parameters) {
    
    this.parameters = parameters;
    return this;
  }

  /**
   * The editor tool call parameters.
   * @return parameters
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_PARAMETERS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getParameters() {
    return parameters;
  }


  @JsonProperty(value = JSON_PROPERTY_PARAMETERS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setParameters(@javax.annotation.Nonnull Object parameters) {
    this.parameters = parameters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EditorToolCallStateDto editorToolCallStateDto = (EditorToolCallStateDto) o;
    return Objects.equals(this.toolName, editorToolCallStateDto.toolName) &&
        Objects.equals(this.parameters, editorToolCallStateDto.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toolName, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EditorToolCallStateDto {\n");
    sb.append("    toolName: ").append(toIndentedString(toolName)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

    // add `toolName` to the URL query string
    if (getToolName() != null) {
      try {
        joiner.add(String.format("%stoolName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getToolName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `parameters` to the URL query string
    if (getParameters() != null) {
      try {
        joiner.add(String.format("%sparameters%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getParameters()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

