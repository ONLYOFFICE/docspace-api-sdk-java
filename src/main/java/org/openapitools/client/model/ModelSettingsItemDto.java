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
 * A single model settings entry within a provider create or update request.
 */
@JsonPropertyOrder({
  ModelSettingsItemDto.JSON_PROPERTY_MODEL_ID,
  ModelSettingsItemDto.JSON_PROPERTY_IS_ENABLED,
  ModelSettingsItemDto.JSON_PROPERTY_ALIAS,
  ModelSettingsItemDto.JSON_PROPERTY_CAPABILITIES
})

public class ModelSettingsItemDto {
  public static final String JSON_PROPERTY_MODEL_ID = "modelId";
  @javax.annotation.Nonnull  private String modelId;

  public static final String JSON_PROPERTY_IS_ENABLED = "isEnabled";
  @javax.annotation.Nullable  private Boolean isEnabled;

  public static final String JSON_PROPERTY_ALIAS = "alias";
  @javax.annotation.Nullable  private JsonNullable<String> alias = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CAPABILITIES = "capabilities";
  @javax.annotation.Nullable  private AiModelCapabilities capabilities;

  public ModelSettingsItemDto() {
  }


  public ModelSettingsItemDto modelId(@javax.annotation.Nonnull String modelId) {
    
    this.modelId = modelId;
    return this;
  }

  /**
   * The model identifier.
   * @return modelId
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_MODEL_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getModelId() {
    return modelId;
  }


  @JsonProperty(value = JSON_PROPERTY_MODEL_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setModelId(@javax.annotation.Nonnull String modelId) {
    this.modelId = modelId;
  }

  public ModelSettingsItemDto isEnabled(@javax.annotation.Nullable Boolean isEnabled) {
    
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * Whether the model is enabled for use in chat.
   * @return isEnabled
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IS_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsEnabled() {
    return isEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_IS_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsEnabled(@javax.annotation.Nullable Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public ModelSettingsItemDto alias(@javax.annotation.Nullable String alias) {
    this.alias = JsonNullable.<String>of(alias);
    
    return this;
  }

  /**
   * The display name for the model. Only applies to non-recommended models.
   * @return alias
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getAlias() {
        return alias.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ALIAS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getAlias_JsonNullable() {
    return alias;
  }
  
  @JsonProperty(JSON_PROPERTY_ALIAS)
  public void setAlias_JsonNullable(JsonNullable<String> alias) {
    this.alias = alias;
  }

  public void setAlias(@javax.annotation.Nullable String alias) {
    this.alias = JsonNullable.<String>of(alias);
  }

  public ModelSettingsItemDto capabilities(@javax.annotation.Nullable AiModelCapabilities capabilities) {
    
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelSettingsItemDto modelSettingsItemDto = (ModelSettingsItemDto) o;
    return Objects.equals(this.modelId, modelSettingsItemDto.modelId) &&
        Objects.equals(this.isEnabled, modelSettingsItemDto.isEnabled) &&
        equalsNullable(this.alias, modelSettingsItemDto.alias) &&
        Objects.equals(this.capabilities, modelSettingsItemDto.capabilities);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelId, isEnabled, hashCodeNullable(alias), capabilities);
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
    sb.append("class ModelSettingsItemDto {\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
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

    // add `modelId` to the URL query string
    if (getModelId() != null) {
      try {
        joiner.add(String.format("%smodelId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getModelId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isEnabled` to the URL query string
    if (getIsEnabled() != null) {
      try {
        joiner.add(String.format("%sisEnabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsEnabled()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `alias` to the URL query string
    if (getAlias() != null) {
      try {
        joiner.add(String.format("%salias%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAlias()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `capabilities` to the URL query string
    if (getCapabilities() != null) {
      joiner.add(getCapabilities().toUrlQueryString(prefix + "capabilities" + suffix));
    }

    return joiner.toString();
  }

}

