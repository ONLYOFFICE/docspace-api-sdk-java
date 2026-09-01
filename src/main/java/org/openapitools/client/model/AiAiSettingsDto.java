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
 * The AI module settings.
 */
@JsonPropertyOrder({
  AiAiSettingsDto.JSON_PROPERTY_VECTORIZATION_ENABLED,
  AiAiSettingsDto.JSON_PROPERTY_VECTORIZATION_NEED_RESET,
  AiAiSettingsDto.JSON_PROPERTY_AI_READY,
  AiAiSettingsDto.JSON_PROPERTY_EMBEDDING_MODEL,
  AiAiSettingsDto.JSON_PROPERTY_SYSTEM_AI_ENABLED,
  AiAiSettingsDto.JSON_PROPERTY_RECOMMENDED_MODEL_FOR_FORMS
})

public class AiAiSettingsDto {
  public static final String JSON_PROPERTY_VECTORIZATION_ENABLED = "vectorizationEnabled";
  @javax.annotation.Nullable  private Boolean vectorizationEnabled;

  public static final String JSON_PROPERTY_VECTORIZATION_NEED_RESET = "vectorizationNeedReset";
  @javax.annotation.Nullable  private Boolean vectorizationNeedReset;

  public static final String JSON_PROPERTY_AI_READY = "aiReady";
  @javax.annotation.Nullable  private Boolean aiReady;

  public static final String JSON_PROPERTY_EMBEDDING_MODEL = "embeddingModel";
  @javax.annotation.Nullable  private String embeddingModel;

  public static final String JSON_PROPERTY_SYSTEM_AI_ENABLED = "systemAiEnabled";
  @javax.annotation.Nullable  private Boolean systemAiEnabled;

  public static final String JSON_PROPERTY_RECOMMENDED_MODEL_FOR_FORMS = "recommendedModelForForms";
  @javax.annotation.Nullable  private JsonNullable<String> recommendedModelForForms = JsonNullable.<String>undefined();

  public AiAiSettingsDto() {
  }


  public AiAiSettingsDto vectorizationEnabled(@javax.annotation.Nullable Boolean vectorizationEnabled) {
    
    this.vectorizationEnabled = vectorizationEnabled;
    return this;
  }

  /**
   * Indicates whether document vectorization is enabled.
   * @return vectorizationEnabled
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_VECTORIZATION_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getVectorizationEnabled() {
    return vectorizationEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_VECTORIZATION_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVectorizationEnabled(@javax.annotation.Nullable Boolean vectorizationEnabled) {
    this.vectorizationEnabled = vectorizationEnabled;
  }

  public AiAiSettingsDto vectorizationNeedReset(@javax.annotation.Nullable Boolean vectorizationNeedReset) {
    
    this.vectorizationNeedReset = vectorizationNeedReset;
    return this;
  }

  /**
   * Indicates whether the embedding provider API key needs to be reconfigured.
   * @return vectorizationNeedReset
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_VECTORIZATION_NEED_RESET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getVectorizationNeedReset() {
    return vectorizationNeedReset;
  }


  @JsonProperty(value = JSON_PROPERTY_VECTORIZATION_NEED_RESET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVectorizationNeedReset(@javax.annotation.Nullable Boolean vectorizationNeedReset) {
    this.vectorizationNeedReset = vectorizationNeedReset;
  }

  public AiAiSettingsDto aiReady(@javax.annotation.Nullable Boolean aiReady) {
    
    this.aiReady = aiReady;
    return this;
  }

  /**
   * Indicates whether the AI subsystem is fully configured and operational.
   * @return aiReady
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_AI_READY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAiReady() {
    return aiReady;
  }


  @JsonProperty(value = JSON_PROPERTY_AI_READY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAiReady(@javax.annotation.Nullable Boolean aiReady) {
    this.aiReady = aiReady;
  }

  public AiAiSettingsDto embeddingModel(@javax.annotation.Nullable String embeddingModel) {
    
    this.embeddingModel = embeddingModel;
    return this;
  }

  /**
   * The name of the embedding model used for document vectorization.
   * @return embeddingModel
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_EMBEDDING_MODEL, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmbeddingModel() {
    return embeddingModel;
  }


  @JsonProperty(value = JSON_PROPERTY_EMBEDDING_MODEL, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmbeddingModel(@javax.annotation.Nullable String embeddingModel) {
    this.embeddingModel = embeddingModel;
  }

  public AiAiSettingsDto systemAiEnabled(@javax.annotation.Nullable Boolean systemAiEnabled) {
    
    this.systemAiEnabled = systemAiEnabled;
    return this;
  }

  /**
   * Indicates whether the system-level AI provider is enabled.
   * @return systemAiEnabled
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SYSTEM_AI_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSystemAiEnabled() {
    return systemAiEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_SYSTEM_AI_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSystemAiEnabled(@javax.annotation.Nullable Boolean systemAiEnabled) {
    this.systemAiEnabled = systemAiEnabled;
  }

  public AiAiSettingsDto recommendedModelForForms(@javax.annotation.Nullable String recommendedModelForForms) {
    this.recommendedModelForForms = JsonNullable.<String>of(recommendedModelForForms);
    
    return this;
  }

  /**
   * The identifier of the model recommended for form generation.
   * @return recommendedModelForForms
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getRecommendedModelForForms() {
        return recommendedModelForForms.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_RECOMMENDED_MODEL_FOR_FORMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getRecommendedModelForForms_JsonNullable() {
    return recommendedModelForForms;
  }
  
  @JsonProperty(JSON_PROPERTY_RECOMMENDED_MODEL_FOR_FORMS)
  public void setRecommendedModelForForms_JsonNullable(JsonNullable<String> recommendedModelForForms) {
    this.recommendedModelForForms = recommendedModelForForms;
  }

  public void setRecommendedModelForForms(@javax.annotation.Nullable String recommendedModelForForms) {
    this.recommendedModelForForms = JsonNullable.<String>of(recommendedModelForForms);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiAiSettingsDto aiAiSettingsDto = (AiAiSettingsDto) o;
    return Objects.equals(this.vectorizationEnabled, aiAiSettingsDto.vectorizationEnabled) &&
        Objects.equals(this.vectorizationNeedReset, aiAiSettingsDto.vectorizationNeedReset) &&
        Objects.equals(this.aiReady, aiAiSettingsDto.aiReady) &&
        Objects.equals(this.embeddingModel, aiAiSettingsDto.embeddingModel) &&
        Objects.equals(this.systemAiEnabled, aiAiSettingsDto.systemAiEnabled) &&
        equalsNullable(this.recommendedModelForForms, aiAiSettingsDto.recommendedModelForForms);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(vectorizationEnabled, vectorizationNeedReset, aiReady, embeddingModel, systemAiEnabled, hashCodeNullable(recommendedModelForForms));
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
    sb.append("class AiAiSettingsDto {\n");
    sb.append("    vectorizationEnabled: ").append(toIndentedString(vectorizationEnabled)).append("\n");
    sb.append("    vectorizationNeedReset: ").append(toIndentedString(vectorizationNeedReset)).append("\n");
    sb.append("    aiReady: ").append(toIndentedString(aiReady)).append("\n");
    sb.append("    embeddingModel: ").append(toIndentedString(embeddingModel)).append("\n");
    sb.append("    systemAiEnabled: ").append(toIndentedString(systemAiEnabled)).append("\n");
    sb.append("    recommendedModelForForms: ").append(toIndentedString(recommendedModelForForms)).append("\n");
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

    // add `vectorizationEnabled` to the URL query string
    if (getVectorizationEnabled() != null) {
      try {
        joiner.add(String.format("%svectorizationEnabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVectorizationEnabled()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `vectorizationNeedReset` to the URL query string
    if (getVectorizationNeedReset() != null) {
      try {
        joiner.add(String.format("%svectorizationNeedReset%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVectorizationNeedReset()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `aiReady` to the URL query string
    if (getAiReady() != null) {
      try {
        joiner.add(String.format("%saiReady%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAiReady()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `embeddingModel` to the URL query string
    if (getEmbeddingModel() != null) {
      try {
        joiner.add(String.format("%sembeddingModel%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmbeddingModel()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `systemAiEnabled` to the URL query string
    if (getSystemAiEnabled() != null) {
      try {
        joiner.add(String.format("%ssystemAiEnabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSystemAiEnabled()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `recommendedModelForForms` to the URL query string
    if (getRecommendedModelForForms() != null) {
      try {
        joiner.add(String.format("%srecommendedModelForForms%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRecommendedModelForForms()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

