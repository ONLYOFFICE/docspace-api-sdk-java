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
 * Tokens an AI operation consumed, as recorded in the operation metadata. A kind the provider did not report is `0`.
 */
@JsonPropertyOrder({
  OperationTokenUsage.JSON_PROPERTY_TOTAL_TOKENS,
  OperationTokenUsage.JSON_PROPERTY_PROMPT_TOKENS,
  OperationTokenUsage.JSON_PROPERTY_COMPLETION_TOKENS,
  OperationTokenUsage.JSON_PROPERTY_CACHED_TOKENS,
  OperationTokenUsage.JSON_PROPERTY_CACHE_WRITE_TOKENS,
  OperationTokenUsage.JSON_PROPERTY_REASONING_TOKENS,
  OperationTokenUsage.JSON_PROPERTY_IMAGE_TOKENS
})

public class OperationTokenUsage {
  public static final String JSON_PROPERTY_TOTAL_TOKENS = "totalTokens";
  @javax.annotation.Nullable  private Long totalTokens;

  public static final String JSON_PROPERTY_PROMPT_TOKENS = "promptTokens";
  @javax.annotation.Nullable  private Long promptTokens;

  public static final String JSON_PROPERTY_COMPLETION_TOKENS = "completionTokens";
  @javax.annotation.Nullable  private Long completionTokens;

  public static final String JSON_PROPERTY_CACHED_TOKENS = "cachedTokens";
  @javax.annotation.Nullable  private Long cachedTokens;

  public static final String JSON_PROPERTY_CACHE_WRITE_TOKENS = "cacheWriteTokens";
  @javax.annotation.Nullable  private Long cacheWriteTokens;

  public static final String JSON_PROPERTY_REASONING_TOKENS = "reasoningTokens";
  @javax.annotation.Nullable  private Long reasoningTokens;

  public static final String JSON_PROPERTY_IMAGE_TOKENS = "imageTokens";
  @javax.annotation.Nullable  private Long imageTokens;

  public OperationTokenUsage() {
  }


  public OperationTokenUsage totalTokens(@javax.annotation.Nullable Long totalTokens) {
    
    this.totalTokens = totalTokens;
    return this;
  }

  /**
   * All tokens of the request: prompt plus completion.
   * @return totalTokens
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TOTAL_TOKENS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTotalTokens() {
    return totalTokens;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL_TOKENS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalTokens(@javax.annotation.Nullable Long totalTokens) {
    this.totalTokens = totalTokens;
  }

  public OperationTokenUsage promptTokens(@javax.annotation.Nullable Long promptTokens) {
    
    this.promptTokens = promptTokens;
    return this;
  }

  /**
   * Tokens sent to the model, cached ones included.
   * @return promptTokens
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PROMPT_TOKENS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPromptTokens() {
    return promptTokens;
  }


  @JsonProperty(value = JSON_PROPERTY_PROMPT_TOKENS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPromptTokens(@javax.annotation.Nullable Long promptTokens) {
    this.promptTokens = promptTokens;
  }

  public OperationTokenUsage completionTokens(@javax.annotation.Nullable Long completionTokens) {
    
    this.completionTokens = completionTokens;
    return this;
  }

  /**
   * Tokens the model generated, reasoning ones included.
   * @return completionTokens
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_COMPLETION_TOKENS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCompletionTokens() {
    return completionTokens;
  }


  @JsonProperty(value = JSON_PROPERTY_COMPLETION_TOKENS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompletionTokens(@javax.annotation.Nullable Long completionTokens) {
    this.completionTokens = completionTokens;
  }

  public OperationTokenUsage cachedTokens(@javax.annotation.Nullable Long cachedTokens) {
    
    this.cachedTokens = cachedTokens;
    return this;
  }

  /**
   * Part of the prompt tokens read from the provider cache.
   * @return cachedTokens
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CACHED_TOKENS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCachedTokens() {
    return cachedTokens;
  }


  @JsonProperty(value = JSON_PROPERTY_CACHED_TOKENS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCachedTokens(@javax.annotation.Nullable Long cachedTokens) {
    this.cachedTokens = cachedTokens;
  }

  public OperationTokenUsage cacheWriteTokens(@javax.annotation.Nullable Long cacheWriteTokens) {
    
    this.cacheWriteTokens = cacheWriteTokens;
    return this;
  }

  /**
   * Part of the prompt tokens written to the provider cache.
   * @return cacheWriteTokens
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CACHE_WRITE_TOKENS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCacheWriteTokens() {
    return cacheWriteTokens;
  }


  @JsonProperty(value = JSON_PROPERTY_CACHE_WRITE_TOKENS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCacheWriteTokens(@javax.annotation.Nullable Long cacheWriteTokens) {
    this.cacheWriteTokens = cacheWriteTokens;
  }

  public OperationTokenUsage reasoningTokens(@javax.annotation.Nullable Long reasoningTokens) {
    
    this.reasoningTokens = reasoningTokens;
    return this;
  }

  /**
   * Part of the completion tokens the model spent on reasoning.
   * @return reasoningTokens
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_REASONING_TOKENS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getReasoningTokens() {
    return reasoningTokens;
  }


  @JsonProperty(value = JSON_PROPERTY_REASONING_TOKENS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReasoningTokens(@javax.annotation.Nullable Long reasoningTokens) {
    this.reasoningTokens = reasoningTokens;
  }

  public OperationTokenUsage imageTokens(@javax.annotation.Nullable Long imageTokens) {
    
    this.imageTokens = imageTokens;
    return this;
  }

  /**
   * Tokens spent on images.
   * @return imageTokens
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IMAGE_TOKENS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getImageTokens() {
    return imageTokens;
  }


  @JsonProperty(value = JSON_PROPERTY_IMAGE_TOKENS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageTokens(@javax.annotation.Nullable Long imageTokens) {
    this.imageTokens = imageTokens;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationTokenUsage operationTokenUsage = (OperationTokenUsage) o;
    return Objects.equals(this.totalTokens, operationTokenUsage.totalTokens) &&
        Objects.equals(this.promptTokens, operationTokenUsage.promptTokens) &&
        Objects.equals(this.completionTokens, operationTokenUsage.completionTokens) &&
        Objects.equals(this.cachedTokens, operationTokenUsage.cachedTokens) &&
        Objects.equals(this.cacheWriteTokens, operationTokenUsage.cacheWriteTokens) &&
        Objects.equals(this.reasoningTokens, operationTokenUsage.reasoningTokens) &&
        Objects.equals(this.imageTokens, operationTokenUsage.imageTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalTokens, promptTokens, completionTokens, cachedTokens, cacheWriteTokens, reasoningTokens, imageTokens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationTokenUsage {\n");
    sb.append("    totalTokens: ").append(toIndentedString(totalTokens)).append("\n");
    sb.append("    promptTokens: ").append(toIndentedString(promptTokens)).append("\n");
    sb.append("    completionTokens: ").append(toIndentedString(completionTokens)).append("\n");
    sb.append("    cachedTokens: ").append(toIndentedString(cachedTokens)).append("\n");
    sb.append("    cacheWriteTokens: ").append(toIndentedString(cacheWriteTokens)).append("\n");
    sb.append("    reasoningTokens: ").append(toIndentedString(reasoningTokens)).append("\n");
    sb.append("    imageTokens: ").append(toIndentedString(imageTokens)).append("\n");
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

    // add `totalTokens` to the URL query string
    if (getTotalTokens() != null) {
      try {
        joiner.add(String.format("%stotalTokens%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTotalTokens()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `promptTokens` to the URL query string
    if (getPromptTokens() != null) {
      try {
        joiner.add(String.format("%spromptTokens%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPromptTokens()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `completionTokens` to the URL query string
    if (getCompletionTokens() != null) {
      try {
        joiner.add(String.format("%scompletionTokens%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCompletionTokens()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `cachedTokens` to the URL query string
    if (getCachedTokens() != null) {
      try {
        joiner.add(String.format("%scachedTokens%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCachedTokens()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `cacheWriteTokens` to the URL query string
    if (getCacheWriteTokens() != null) {
      try {
        joiner.add(String.format("%scacheWriteTokens%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCacheWriteTokens()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `reasoningTokens` to the URL query string
    if (getReasoningTokens() != null) {
      try {
        joiner.add(String.format("%sreasoningTokens%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReasoningTokens()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `imageTokens` to the URL query string
    if (getImageTokens() != null) {
      try {
        joiner.add(String.format("%simageTokens%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getImageTokens()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

