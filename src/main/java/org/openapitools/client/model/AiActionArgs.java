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
import org.openapitools.client.model.AiActionArgsPrompt;
import org.openapitools.client.model.AiMCPItem;
import org.openapitools.client.model.AiReasoningLevel;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * AiActionArgs
 */
@JsonPropertyOrder({
  AiActionArgs.JSON_PROPERTY_TOOLS,
  AiActionArgs.JSON_PROPERTY_IS_REASONING,
  AiActionArgs.JSON_PROPERTY_REASONING_LEVEL,
  AiActionArgs.JSON_PROPERTY_PROMPT
})

public class AiActionArgs {
  public static final String JSON_PROPERTY_TOOLS = "tools";
  @javax.annotation.Nullable  private List<AiMCPItem> tools = new ArrayList<>();

  public static final String JSON_PROPERTY_IS_REASONING = "isReasoning";
  @javax.annotation.Nullable  private Boolean isReasoning;

  public static final String JSON_PROPERTY_REASONING_LEVEL = "reasoningLevel";
  @javax.annotation.Nullable  private AiReasoningLevel reasoningLevel;

  public static final String JSON_PROPERTY_PROMPT = "prompt";
  @javax.annotation.Nullable  private AiActionArgsPrompt prompt;

  public AiActionArgs() {
  }


  public AiActionArgs tools(@javax.annotation.Nullable List<AiMCPItem> tools) {
    
    this.tools = tools;
    return this;
  }

  public AiActionArgs addToolsItem(AiMCPItem toolsItem) {
    if (this.tools == null) {
      this.tools = new ArrayList<>();
    }
    this.tools.add(toolsItem);
    return this;
  }

  /**
   * Extra tools offered to the model for this request.
   * @return tools
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TOOLS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AiMCPItem> getTools() {
    return tools;
  }


  @JsonProperty(value = JSON_PROPERTY_TOOLS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTools(@javax.annotation.Nullable List<AiMCPItem> tools) {
    this.tools = tools;
  }

  public AiActionArgs isReasoning(@javax.annotation.Nullable Boolean isReasoning) {
    
    this.isReasoning = isReasoning;
    return this;
  }

  /**
   * Legacy extended-thinking switch; stands for `medium`. `reasoningLevel` wins when both are set.
   * @return isReasoning
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IS_REASONING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsReasoning() {
    return isReasoning;
  }


  @JsonProperty(value = JSON_PROPERTY_IS_REASONING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsReasoning(@javax.annotation.Nullable Boolean isReasoning) {
    this.isReasoning = isReasoning;
  }

  public AiActionArgs reasoningLevel(@javax.annotation.Nullable AiReasoningLevel reasoningLevel) {
    
    this.reasoningLevel = reasoningLevel;
    return this;
  }

  /**
   * Depth of extended thinking for the round; providers clamp it to what the model accepts.
   * @return reasoningLevel
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_REASONING_LEVEL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AiReasoningLevel getReasoningLevel() {
    return reasoningLevel;
  }


  @JsonProperty(value = JSON_PROPERTY_REASONING_LEVEL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReasoningLevel(@javax.annotation.Nullable AiReasoningLevel reasoningLevel) {
    this.reasoningLevel = reasoningLevel;
  }

  public AiActionArgs prompt(@javax.annotation.Nullable AiActionArgsPrompt prompt) {
    
    this.prompt = prompt;
    return this;
  }

  /**
   * Get prompt
   * @return prompt
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PROMPT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AiActionArgsPrompt getPrompt() {
    return prompt;
  }


  @JsonProperty(value = JSON_PROPERTY_PROMPT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrompt(@javax.annotation.Nullable AiActionArgsPrompt prompt) {
    this.prompt = prompt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiActionArgs aiActionArgs = (AiActionArgs) o;
    return Objects.equals(this.tools, aiActionArgs.tools) &&
        Objects.equals(this.isReasoning, aiActionArgs.isReasoning) &&
        Objects.equals(this.reasoningLevel, aiActionArgs.reasoningLevel) &&
        Objects.equals(this.prompt, aiActionArgs.prompt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tools, isReasoning, reasoningLevel, prompt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiActionArgs {\n");
    sb.append("    tools: ").append(toIndentedString(tools)).append("\n");
    sb.append("    isReasoning: ").append(toIndentedString(isReasoning)).append("\n");
    sb.append("    reasoningLevel: ").append(toIndentedString(reasoningLevel)).append("\n");
    sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
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

    // add `tools` to the URL query string
    if (getTools() != null) {
      for (int i = 0; i < getTools().size(); i++) {
        if (getTools().get(i) != null) {
          joiner.add(getTools().get(i).toUrlQueryString(String.format("%stools%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `isReasoning` to the URL query string
    if (getIsReasoning() != null) {
      try {
        joiner.add(String.format("%sisReasoning%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsReasoning()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `reasoningLevel` to the URL query string
    if (getReasoningLevel() != null) {
      try {
        joiner.add(String.format("%sreasoningLevel%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReasoningLevel()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `prompt` to the URL query string
    if (getPrompt() != null) {
      joiner.add(getPrompt().toUrlQueryString(prefix + "prompt" + suffix));
    }

    return joiner.toString();
  }

}

