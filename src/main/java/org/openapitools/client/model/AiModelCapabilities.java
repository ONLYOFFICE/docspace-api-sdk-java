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
 * The AI model capabilities.
 */
@JsonPropertyOrder({
  AiModelCapabilities.JSON_PROPERTY_VISION,
  AiModelCapabilities.JSON_PROPERTY_TOOL_CALLING,
  AiModelCapabilities.JSON_PROPERTY_THINKING
})

public class AiModelCapabilities {
  public static final String JSON_PROPERTY_VISION = "vision";
  @javax.annotation.Nullable  private Boolean vision;

  public static final String JSON_PROPERTY_TOOL_CALLING = "toolCalling";
  @javax.annotation.Nullable  private Boolean toolCalling;

  public static final String JSON_PROPERTY_THINKING = "thinking";
  @javax.annotation.Nullable  private Boolean thinking;

  public AiModelCapabilities() {
  }


  public AiModelCapabilities vision(@javax.annotation.Nullable Boolean vision) {
    
    this.vision = vision;
    return this;
  }

  /**
   * Indicates whether the model supports image and vision input.
   * @return vision
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_VISION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getVision() {
    return vision;
  }


  @JsonProperty(value = JSON_PROPERTY_VISION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVision(@javax.annotation.Nullable Boolean vision) {
    this.vision = vision;
  }

  public AiModelCapabilities toolCalling(@javax.annotation.Nullable Boolean toolCalling) {
    
    this.toolCalling = toolCalling;
    return this;
  }

  /**
   * Indicates whether the model supports tool (function) calling.
   * @return toolCalling
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TOOL_CALLING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getToolCalling() {
    return toolCalling;
  }


  @JsonProperty(value = JSON_PROPERTY_TOOL_CALLING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToolCalling(@javax.annotation.Nullable Boolean toolCalling) {
    this.toolCalling = toolCalling;
  }

  public AiModelCapabilities thinking(@javax.annotation.Nullable Boolean thinking) {
    
    this.thinking = thinking;
    return this;
  }

  /**
   * Indicates whether the model supports extended thinking and reasoning.
   * @return thinking
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_THINKING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getThinking() {
    return thinking;
  }


  @JsonProperty(value = JSON_PROPERTY_THINKING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThinking(@javax.annotation.Nullable Boolean thinking) {
    this.thinking = thinking;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiModelCapabilities aiModelCapabilities = (AiModelCapabilities) o;
    return Objects.equals(this.vision, aiModelCapabilities.vision) &&
        Objects.equals(this.toolCalling, aiModelCapabilities.toolCalling) &&
        Objects.equals(this.thinking, aiModelCapabilities.thinking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vision, toolCalling, thinking);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiModelCapabilities {\n");
    sb.append("    vision: ").append(toIndentedString(vision)).append("\n");
    sb.append("    toolCalling: ").append(toIndentedString(toolCalling)).append("\n");
    sb.append("    thinking: ").append(toIndentedString(thinking)).append("\n");
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

    // add `vision` to the URL query string
    if (getVision() != null) {
      try {
        joiner.add(String.format("%svision%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVision()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `toolCalling` to the URL query string
    if (getToolCalling() != null) {
      try {
        joiner.add(String.format("%stoolCalling%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getToolCalling()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `thinking` to the URL query string
    if (getThinking() != null) {
      try {
        joiner.add(String.format("%sthinking%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getThinking()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

