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
import org.openapitools.client.model.AiOpenAIToolCallDelta;
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
 * AiOpenAIChoiceDelta
 */
@JsonPropertyOrder({
  AiOpenAIChoiceDelta.JSON_PROPERTY_ROLE,
  AiOpenAIChoiceDelta.JSON_PROPERTY_CONTENT,
  AiOpenAIChoiceDelta.JSON_PROPERTY_TOOL_CALLS
})

public class AiOpenAIChoiceDelta {
  /**
   * Gets or Sets role
   */
  public enum RoleEnum {
    ASSISTANT(String.valueOf("assistant"));

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RoleEnum fromValue(String value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  public static final String JSON_PROPERTY_ROLE = "role";
  @javax.annotation.Nullable  private RoleEnum role;

  public static final String JSON_PROPERTY_CONTENT = "content";
  @javax.annotation.Nullable  private JsonNullable<String> content = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TOOL_CALLS = "tool_calls";
  @javax.annotation.Nullable  private List<AiOpenAIToolCallDelta> toolCalls = new ArrayList<>();

  public AiOpenAIChoiceDelta() {
  }


  public AiOpenAIChoiceDelta role(@javax.annotation.Nullable RoleEnum role) {
    
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ROLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RoleEnum getRole() {
    return role;
  }


  @JsonProperty(value = JSON_PROPERTY_ROLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRole(@javax.annotation.Nullable RoleEnum role) {
    this.role = role;
  }

  public AiOpenAIChoiceDelta content(@javax.annotation.Nullable String content) {
    this.content = JsonNullable.<String>of(content);
    
    return this;
  }

  /**
   * Get content
   * @return content
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getContent() {
        return content.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_CONTENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getContent_JsonNullable() {
    return content;
  }
  
  @JsonProperty(JSON_PROPERTY_CONTENT)
  public void setContent_JsonNullable(JsonNullable<String> content) {
    this.content = content;
  }

  public void setContent(@javax.annotation.Nullable String content) {
    this.content = JsonNullable.<String>of(content);
  }

  public AiOpenAIChoiceDelta toolCalls(@javax.annotation.Nullable List<AiOpenAIToolCallDelta> toolCalls) {
    
    this.toolCalls = toolCalls;
    return this;
  }

  public AiOpenAIChoiceDelta addToolCallsItem(AiOpenAIToolCallDelta toolCallsItem) {
    if (this.toolCalls == null) {
      this.toolCalls = new ArrayList<>();
    }
    this.toolCalls.add(toolCallsItem);
    return this;
  }

  /**
   * Get toolCalls
   * @return toolCalls
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TOOL_CALLS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AiOpenAIToolCallDelta> getToolCalls() {
    return toolCalls;
  }


  @JsonProperty(value = JSON_PROPERTY_TOOL_CALLS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToolCalls(@javax.annotation.Nullable List<AiOpenAIToolCallDelta> toolCalls) {
    this.toolCalls = toolCalls;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiOpenAIChoiceDelta aiOpenAIChoiceDelta = (AiOpenAIChoiceDelta) o;
    return Objects.equals(this.role, aiOpenAIChoiceDelta.role) &&
        equalsNullable(this.content, aiOpenAIChoiceDelta.content) &&
        Objects.equals(this.toolCalls, aiOpenAIChoiceDelta.toolCalls);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, hashCodeNullable(content), toolCalls);
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
    sb.append("class AiOpenAIChoiceDelta {\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    toolCalls: ").append(toIndentedString(toolCalls)).append("\n");
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

    // add `role` to the URL query string
    if (getRole() != null) {
      try {
        joiner.add(String.format("%srole%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRole()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `content` to the URL query string
    if (getContent() != null) {
      try {
        joiner.add(String.format("%scontent%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getContent()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `tool_calls` to the URL query string
    if (getToolCalls() != null) {
      for (int i = 0; i < getToolCalls().size(); i++) {
        if (getToolCalls().get(i) != null) {
          joiner.add(getToolCalls().get(i).toUrlQueryString(String.format("%stool_calls%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

