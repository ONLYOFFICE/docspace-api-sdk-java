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
 * Override the action's baked-in system prompt (replace or append).
 */
@JsonPropertyOrder({
  AiAiActionArgsPrompt.JSON_PROPERTY_MODE,
  AiAiActionArgsPrompt.JSON_PROPERTY_TEXT
})
@JsonTypeName("AiAiActionArgs_prompt")

public class AiAiActionArgsPrompt {
  /**
   * Gets or Sets mode
   */
  public enum ModeEnum {
    REPLACE(String.valueOf("replace")),
    
    APPEND(String.valueOf("append"));

    private String value;

    ModeEnum(String value) {
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
    public static ModeEnum fromValue(String value) {
      for (ModeEnum b : ModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  public static final String JSON_PROPERTY_MODE = "mode";
  @javax.annotation.Nonnull  private ModeEnum mode;

  public static final String JSON_PROPERTY_TEXT = "text";
  @javax.annotation.Nonnull  private String text;

  public AiAiActionArgsPrompt() {
  }


  public AiAiActionArgsPrompt mode(@javax.annotation.Nonnull ModeEnum mode) {
    
    this.mode = mode;
    return this;
  }

  /**
   * Get mode
   * @return mode
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_MODE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ModeEnum getMode() {
    return mode;
  }


  @JsonProperty(value = JSON_PROPERTY_MODE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMode(@javax.annotation.Nonnull ModeEnum mode) {
    this.mode = mode;
  }

  public AiAiActionArgsPrompt text(@javax.annotation.Nonnull String text) {
    
    this.text = text;
    return this;
  }

  /**
   * Get text
   * @return text
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_TEXT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getText() {
    return text;
  }


  @JsonProperty(value = JSON_PROPERTY_TEXT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setText(@javax.annotation.Nonnull String text) {
    this.text = text;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiAiActionArgsPrompt aiAiActionArgsPrompt = (AiAiActionArgsPrompt) o;
    return Objects.equals(this.mode, aiAiActionArgsPrompt.mode) &&
        Objects.equals(this.text, aiAiActionArgsPrompt.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mode, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiAiActionArgsPrompt {\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

    // add `mode` to the URL query string
    if (getMode() != null) {
      try {
        joiner.add(String.format("%smode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMode()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `text` to the URL query string
    if (getText() != null) {
      try {
        joiner.add(String.format("%stext%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getText()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

