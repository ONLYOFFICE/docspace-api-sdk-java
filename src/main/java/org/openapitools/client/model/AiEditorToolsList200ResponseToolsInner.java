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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * AiEditorToolsList200ResponseToolsInner
 */
@JsonPropertyOrder({
  AiEditorToolsList200ResponseToolsInner.JSON_PROPERTY_NAME,
  AiEditorToolsList200ResponseToolsInner.JSON_PROPERTY_DESCRIPTION,
  AiEditorToolsList200ResponseToolsInner.JSON_PROPERTY_INPUT_SCHEMA,
  AiEditorToolsList200ResponseToolsInner.JSON_PROPERTY_REQUIRE_APPROVAL
})
@JsonTypeName("aiEditorToolsList_200_response_tools_inner")

public class AiEditorToolsList200ResponseToolsInner {
  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @javax.annotation.Nonnull  private String description;

  public static final String JSON_PROPERTY_INPUT_SCHEMA = "inputSchema";
  @javax.annotation.Nonnull  private Map<String, Object> inputSchema = new HashMap<>();

  public static final String JSON_PROPERTY_REQUIRE_APPROVAL = "requireApproval";
  @javax.annotation.Nonnull  private Boolean requireApproval;

  public AiEditorToolsList200ResponseToolsInner() {
  }


  public AiEditorToolsList200ResponseToolsInner name(@javax.annotation.Nonnull String name) {
    
    this.name = name;
    return this;
  }

  /**
   * Tool name, as it is passed back to the call endpoint.
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

  public AiEditorToolsList200ResponseToolsInner description(@javax.annotation.Nonnull String description) {
    
    this.description = description;
    return this;
  }

  /**
   * What the tool does, empty when the server declares nothing.
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

  public AiEditorToolsList200ResponseToolsInner inputSchema(@javax.annotation.Nonnull Map<String, Object> inputSchema) {
    
    this.inputSchema = inputSchema;
    return this;
  }

  public AiEditorToolsList200ResponseToolsInner putInputSchemaItem(String key, Object inputSchemaItem) {
    this.inputSchema.put(key, inputSchemaItem);
    return this;
  }

  /**
   * JSON Schema of the tool arguments.
   * @return inputSchema
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_INPUT_SCHEMA, required = true)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.ALWAYS)

  public Map<String, Object> getInputSchema() {
    return inputSchema;
  }


  @JsonProperty(value = JSON_PROPERTY_INPUT_SCHEMA, required = true)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.ALWAYS)
  public void setInputSchema(@javax.annotation.Nonnull Map<String, Object> inputSchema) {
    this.inputSchema = inputSchema;
  }

  public AiEditorToolsList200ResponseToolsInner requireApproval(@javax.annotation.Nonnull Boolean requireApproval) {
    
    this.requireApproval = requireApproval;
    return this;
  }

  /**
   * Whether the editor has to ask the user before running the tool. Read-only operations arrive with this off.
   * @return requireApproval
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_REQUIRE_APPROVAL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getRequireApproval() {
    return requireApproval;
  }


  @JsonProperty(value = JSON_PROPERTY_REQUIRE_APPROVAL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRequireApproval(@javax.annotation.Nonnull Boolean requireApproval) {
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
    AiEditorToolsList200ResponseToolsInner aiEditorToolsList200ResponseToolsInner = (AiEditorToolsList200ResponseToolsInner) o;
    return Objects.equals(this.name, aiEditorToolsList200ResponseToolsInner.name) &&
        Objects.equals(this.description, aiEditorToolsList200ResponseToolsInner.description) &&
        Objects.equals(this.inputSchema, aiEditorToolsList200ResponseToolsInner.inputSchema) &&
        Objects.equals(this.requireApproval, aiEditorToolsList200ResponseToolsInner.requireApproval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, inputSchema, requireApproval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiEditorToolsList200ResponseToolsInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    inputSchema: ").append(toIndentedString(inputSchema)).append("\n");
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
      for (String _key : getInputSchema().keySet()) {
        try {
          joiner.add(String.format("%sinputSchema%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getInputSchema().get(_key), URLEncoder.encode(String.valueOf(getInputSchema().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
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

