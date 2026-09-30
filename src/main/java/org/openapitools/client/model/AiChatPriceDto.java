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
 * What a chat model charges, split by the direction the tokens flow in.
 */
@JsonPropertyOrder({
  AiChatPriceDto.JSON_PROPERTY_PROMPT,
  AiChatPriceDto.JSON_PROPERTY_COMPLETION,
  AiChatPriceDto.JSON_PROPERTY_PROMPT_CACHE_READ,
  AiChatPriceDto.JSON_PROPERTY_PROMPT_CACHE_WRITE,
  AiChatPriceDto.JSON_PROPERTY_PROMPT_CACHE_WRITE1_H
})

public class AiChatPriceDto {
  public static final String JSON_PROPERTY_PROMPT = "prompt";
  @javax.annotation.Nullable  private Double prompt;

  public static final String JSON_PROPERTY_COMPLETION = "completion";
  @javax.annotation.Nullable  private Double completion;

  public static final String JSON_PROPERTY_PROMPT_CACHE_READ = "promptCacheRead";
  @javax.annotation.Nullable  private JsonNullable<Double> promptCacheRead = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_PROMPT_CACHE_WRITE = "promptCacheWrite";
  @javax.annotation.Nullable  private JsonNullable<Double> promptCacheWrite = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_PROMPT_CACHE_WRITE1_H = "promptCacheWrite1H";
  @javax.annotation.Nullable  private JsonNullable<Double> promptCacheWrite1H = JsonNullable.<Double>undefined();

  public AiChatPriceDto() {
  }


  public AiChatPriceDto prompt(@javax.annotation.Nullable Double prompt) {
    
    this.prompt = prompt;
    return this;
  }

  /**
   * The cost of one million tokens sent to the model, which includes the conversation history resent with  every turn and not just the newest message.
   * @return prompt
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PROMPT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getPrompt() {
    return prompt;
  }


  @JsonProperty(value = JSON_PROPERTY_PROMPT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrompt(@javax.annotation.Nullable Double prompt) {
    this.prompt = prompt;
  }

  public AiChatPriceDto completion(@javax.annotation.Nullable Double completion) {
    
    this.completion = completion;
    return this;
  }

  /**
   * The cost of one million tokens the model writes back. It is normally the dearer of the two directions.
   * @return completion
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_COMPLETION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getCompletion() {
    return completion;
  }


  @JsonProperty(value = JSON_PROPERTY_COMPLETION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompletion(@javax.annotation.Nullable Double completion) {
    this.completion = completion;
  }

  public AiChatPriceDto promptCacheRead(@javax.annotation.Nullable Double promptCacheRead) {
    this.promptCacheRead = JsonNullable.<Double>of(promptCacheRead);
    
    return this;
  }

  /**
   * The cost of one million prompt tokens served from the prompt cache. It is absent when the model does not  support prompt caching.
   * @return promptCacheRead
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Double getPromptCacheRead() {
        return promptCacheRead.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_PROMPT_CACHE_READ, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getPromptCacheRead_JsonNullable() {
    return promptCacheRead;
  }
  
  @JsonProperty(JSON_PROPERTY_PROMPT_CACHE_READ)
  public void setPromptCacheRead_JsonNullable(JsonNullable<Double> promptCacheRead) {
    this.promptCacheRead = promptCacheRead;
  }

  public void setPromptCacheRead(@javax.annotation.Nullable Double promptCacheRead) {
    this.promptCacheRead = JsonNullable.<Double>of(promptCacheRead);
  }

  public AiChatPriceDto promptCacheWrite(@javax.annotation.Nullable Double promptCacheWrite) {
    this.promptCacheWrite = JsonNullable.<Double>of(promptCacheWrite);
    
    return this;
  }

  /**
   * The cost of one million prompt tokens written to the prompt cache with the default lifetime. It is absent  when the model does not support prompt caching.
   * @return promptCacheWrite
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Double getPromptCacheWrite() {
        return promptCacheWrite.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_PROMPT_CACHE_WRITE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getPromptCacheWrite_JsonNullable() {
    return promptCacheWrite;
  }
  
  @JsonProperty(JSON_PROPERTY_PROMPT_CACHE_WRITE)
  public void setPromptCacheWrite_JsonNullable(JsonNullable<Double> promptCacheWrite) {
    this.promptCacheWrite = promptCacheWrite;
  }

  public void setPromptCacheWrite(@javax.annotation.Nullable Double promptCacheWrite) {
    this.promptCacheWrite = JsonNullable.<Double>of(promptCacheWrite);
  }

  public AiChatPriceDto promptCacheWrite1H(@javax.annotation.Nullable Double promptCacheWrite1H) {
    this.promptCacheWrite1H = JsonNullable.<Double>of(promptCacheWrite1H);
    
    return this;
  }

  /**
   * The cost of one million prompt tokens written to the prompt cache with a one-hour lifetime. It is absent  when the model offers no such option.
   * @return promptCacheWrite1H
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Double getPromptCacheWrite1H() {
        return promptCacheWrite1H.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_PROMPT_CACHE_WRITE1_H, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getPromptCacheWrite1H_JsonNullable() {
    return promptCacheWrite1H;
  }
  
  @JsonProperty(JSON_PROPERTY_PROMPT_CACHE_WRITE1_H)
  public void setPromptCacheWrite1H_JsonNullable(JsonNullable<Double> promptCacheWrite1H) {
    this.promptCacheWrite1H = promptCacheWrite1H;
  }

  public void setPromptCacheWrite1H(@javax.annotation.Nullable Double promptCacheWrite1H) {
    this.promptCacheWrite1H = JsonNullable.<Double>of(promptCacheWrite1H);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiChatPriceDto aiChatPriceDto = (AiChatPriceDto) o;
    return Objects.equals(this.prompt, aiChatPriceDto.prompt) &&
        Objects.equals(this.completion, aiChatPriceDto.completion) &&
        equalsNullable(this.promptCacheRead, aiChatPriceDto.promptCacheRead) &&
        equalsNullable(this.promptCacheWrite, aiChatPriceDto.promptCacheWrite) &&
        equalsNullable(this.promptCacheWrite1H, aiChatPriceDto.promptCacheWrite1H);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(prompt, completion, hashCodeNullable(promptCacheRead), hashCodeNullable(promptCacheWrite), hashCodeNullable(promptCacheWrite1H));
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
    sb.append("class AiChatPriceDto {\n");
    sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
    sb.append("    completion: ").append(toIndentedString(completion)).append("\n");
    sb.append("    promptCacheRead: ").append(toIndentedString(promptCacheRead)).append("\n");
    sb.append("    promptCacheWrite: ").append(toIndentedString(promptCacheWrite)).append("\n");
    sb.append("    promptCacheWrite1H: ").append(toIndentedString(promptCacheWrite1H)).append("\n");
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

    // add `prompt` to the URL query string
    if (getPrompt() != null) {
      try {
        joiner.add(String.format("%sprompt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPrompt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `completion` to the URL query string
    if (getCompletion() != null) {
      try {
        joiner.add(String.format("%scompletion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCompletion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `promptCacheRead` to the URL query string
    if (getPromptCacheRead() != null) {
      try {
        joiner.add(String.format("%spromptCacheRead%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPromptCacheRead()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `promptCacheWrite` to the URL query string
    if (getPromptCacheWrite() != null) {
      try {
        joiner.add(String.format("%spromptCacheWrite%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPromptCacheWrite()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `promptCacheWrite1H` to the URL query string
    if (getPromptCacheWrite1H() != null) {
      try {
        joiner.add(String.format("%spromptCacheWrite1H%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPromptCacheWrite1H()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

