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
import org.openapitools.client.model.AiModelCapabilities;
import org.openapitools.client.model.ChatMultimodalSettingsDto;
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
 * The chat settings parameters.
 */
@JsonPropertyOrder({
  ChatSettingsDto.JSON_PROPERTY_PROVIDER_ID,
  ChatSettingsDto.JSON_PROPERTY_MODEL_ID,
  ChatSettingsDto.JSON_PROPERTY_MODEL_ALIAS,
  ChatSettingsDto.JSON_PROPERTY_PROMPT,
  ChatSettingsDto.JSON_PROPERTY_MULTIMODAL,
  ChatSettingsDto.JSON_PROPERTY_THINKING,
  ChatSettingsDto.JSON_PROPERTY_CAPABILITIES,
  ChatSettingsDto.JSON_PROPERTY_INTERNAL
})

public class ChatSettingsDto {
  public static final String JSON_PROPERTY_PROVIDER_ID = "providerId";
  @javax.annotation.Nullable  private Integer providerId;

  public static final String JSON_PROPERTY_MODEL_ID = "modelId";
  @javax.annotation.Nullable  private JsonNullable<String> modelId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MODEL_ALIAS = "modelAlias";
  @javax.annotation.Nullable  private JsonNullable<String> modelAlias = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PROMPT = "prompt";
  @javax.annotation.Nullable  private JsonNullable<String> prompt = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MULTIMODAL = "multimodal";
  @javax.annotation.Nullable  private ChatMultimodalSettingsDto multimodal;

  public static final String JSON_PROPERTY_THINKING = "thinking";
  @javax.annotation.Nullable  private Boolean thinking;

  public static final String JSON_PROPERTY_CAPABILITIES = "capabilities";
  @javax.annotation.Nullable  private AiModelCapabilities capabilities;

  public static final String JSON_PROPERTY_INTERNAL = "internal";
  @javax.annotation.Nullable  private Boolean internal;

  public ChatSettingsDto() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public ChatSettingsDto(
    @JsonProperty(JSON_PROPERTY_INTERNAL) Boolean internal
  ) {
    this();
    this.internal = internal;
  }


  public ChatSettingsDto providerId(@javax.annotation.Nullable Integer providerId) {
    
    this.providerId = providerId;
    return this;
  }

  /**
   * The AI provider ID.
   * @return providerId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PROVIDER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getProviderId() {
    return providerId;
  }


  @JsonProperty(value = JSON_PROPERTY_PROVIDER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProviderId(@javax.annotation.Nullable Integer providerId) {
    this.providerId = providerId;
  }

  public ChatSettingsDto modelId(@javax.annotation.Nullable String modelId) {
    this.modelId = JsonNullable.<String>of(modelId);
    
    return this;
  }

  /**
   * The AI model ID used for chat completions.
   * @return modelId
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getModelId() {
        return modelId.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_MODEL_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getModelId_JsonNullable() {
    return modelId;
  }
  
  @JsonProperty(JSON_PROPERTY_MODEL_ID)
  public void setModelId_JsonNullable(JsonNullable<String> modelId) {
    this.modelId = modelId;
  }

  public void setModelId(@javax.annotation.Nullable String modelId) {
    this.modelId = JsonNullable.<String>of(modelId);
  }

  public ChatSettingsDto modelAlias(@javax.annotation.Nullable String modelAlias) {
    this.modelAlias = JsonNullable.<String>of(modelAlias);
    
    return this;
  }

  /**
   * The AI model display alias.
   * @return modelAlias
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getModelAlias() {
        return modelAlias.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_MODEL_ALIAS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getModelAlias_JsonNullable() {
    return modelAlias;
  }
  
  @JsonProperty(JSON_PROPERTY_MODEL_ALIAS)
  public void setModelAlias_JsonNullable(JsonNullable<String> modelAlias) {
    this.modelAlias = modelAlias;
  }

  public void setModelAlias(@javax.annotation.Nullable String modelAlias) {
    this.modelAlias = JsonNullable.<String>of(modelAlias);
  }

  public ChatSettingsDto prompt(@javax.annotation.Nullable String prompt) {
    this.prompt = JsonNullable.<String>of(prompt);
    
    return this;
  }

  /**
   * The system prompt for the chat.
   * @return prompt
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getPrompt() {
        return prompt.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_PROMPT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getPrompt_JsonNullable() {
    return prompt;
  }
  
  @JsonProperty(JSON_PROPERTY_PROMPT)
  public void setPrompt_JsonNullable(JsonNullable<String> prompt) {
    this.prompt = prompt;
  }

  public void setPrompt(@javax.annotation.Nullable String prompt) {
    this.prompt = JsonNullable.<String>of(prompt);
  }

  public ChatSettingsDto multimodal(@javax.annotation.Nullable ChatMultimodalSettingsDto multimodal) {
    
    this.multimodal = multimodal;
    return this;
  }

  /**
   * Get multimodal
   * @return multimodal
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_MULTIMODAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChatMultimodalSettingsDto getMultimodal() {
    return multimodal;
  }


  @JsonProperty(value = JSON_PROPERTY_MULTIMODAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMultimodal(@javax.annotation.Nullable ChatMultimodalSettingsDto multimodal) {
    this.multimodal = multimodal;
  }

  public ChatSettingsDto thinking(@javax.annotation.Nullable Boolean thinking) {
    
    this.thinking = thinking;
    return this;
  }

  /**
   * Indicates whether the model supports extended thinking mode.
   * @return thinking
   * @deprecated
   */
  @Deprecated
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

  public ChatSettingsDto capabilities(@javax.annotation.Nullable AiModelCapabilities capabilities) {
    
    this.capabilities = capabilities;
    return this;
  }

  /**
   * Get capabilities
   * @return capabilities
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CAPABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AiModelCapabilities getCapabilities() {
    return capabilities;
  }


  @JsonProperty(value = JSON_PROPERTY_CAPABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCapabilities(@javax.annotation.Nullable AiModelCapabilities capabilities) {
    this.capabilities = capabilities;
  }

  /**
   * Indicates whether this is an internal AI gateway provider.
   * @return internal
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_INTERNAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getInternal() {
    return internal;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatSettingsDto chatSettingsDto = (ChatSettingsDto) o;
    return Objects.equals(this.providerId, chatSettingsDto.providerId) &&
        equalsNullable(this.modelId, chatSettingsDto.modelId) &&
        equalsNullable(this.modelAlias, chatSettingsDto.modelAlias) &&
        equalsNullable(this.prompt, chatSettingsDto.prompt) &&
        Objects.equals(this.multimodal, chatSettingsDto.multimodal) &&
        Objects.equals(this.thinking, chatSettingsDto.thinking) &&
        Objects.equals(this.capabilities, chatSettingsDto.capabilities) &&
        Objects.equals(this.internal, chatSettingsDto.internal);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerId, hashCodeNullable(modelId), hashCodeNullable(modelAlias), hashCodeNullable(prompt), multimodal, thinking, capabilities, internal);
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
    sb.append("class ChatSettingsDto {\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    modelAlias: ").append(toIndentedString(modelAlias)).append("\n");
    sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
    sb.append("    multimodal: ").append(toIndentedString(multimodal)).append("\n");
    sb.append("    thinking: ").append(toIndentedString(thinking)).append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
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

    // add `providerId` to the URL query string
    if (getProviderId() != null) {
      try {
        joiner.add(String.format("%sproviderId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProviderId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `modelId` to the URL query string
    if (getModelId() != null) {
      try {
        joiner.add(String.format("%smodelId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getModelId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `modelAlias` to the URL query string
    if (getModelAlias() != null) {
      try {
        joiner.add(String.format("%smodelAlias%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getModelAlias()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `prompt` to the URL query string
    if (getPrompt() != null) {
      try {
        joiner.add(String.format("%sprompt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPrompt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `multimodal` to the URL query string
    if (getMultimodal() != null) {
      joiner.add(getMultimodal().toUrlQueryString(prefix + "multimodal" + suffix));
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

    // add `capabilities` to the URL query string
    if (getCapabilities() != null) {
      joiner.add(getCapabilities().toUrlQueryString(prefix + "capabilities" + suffix));
    }

    // add `internal` to the URL query string
    if (getInternal() != null) {
      try {
        joiner.add(String.format("%sinternal%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInternal()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

