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
 * AI model settings information.
 */
@JsonPropertyOrder({
  ModelSettingsDto.JSON_PROPERTY_ID,
  ModelSettingsDto.JSON_PROPERTY_ALIAS,
  ModelSettingsDto.JSON_PROPERTY_IS_ENABLED,
  ModelSettingsDto.JSON_PROPERTY_IS_RECOMMENDED,
  ModelSettingsDto.JSON_PROPERTY_CAPABILITIES
})

public class ModelSettingsDto {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable  private String id;

  public static final String JSON_PROPERTY_ALIAS = "alias";
  @javax.annotation.Nullable  private JsonNullable<String> alias = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IS_ENABLED = "isEnabled";
  @javax.annotation.Nullable  private Boolean isEnabled;

  public static final String JSON_PROPERTY_IS_RECOMMENDED = "isRecommended";
  @javax.annotation.Nullable  private Boolean isRecommended;

  public static final String JSON_PROPERTY_CAPABILITIES = "capabilities";
  @javax.annotation.Nonnull  private AiModelCapabilities capabilities;

  public ModelSettingsDto() {
  }


  public ModelSettingsDto id(@javax.annotation.Nullable String id) {
    
    this.id = id;
    return this;
  }

  /**
   * The model identifier.
   * @return id
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }

  public ModelSettingsDto alias(@javax.annotation.Nullable String alias) {
    this.alias = JsonNullable.<String>of(alias);
    
    return this;
  }

  /**
   * The display name for the model.
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

  public ModelSettingsDto isEnabled(@javax.annotation.Nullable Boolean isEnabled) {
    
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

  public ModelSettingsDto isRecommended(@javax.annotation.Nullable Boolean isRecommended) {
    
    this.isRecommended = isRecommended;
    return this;
  }

  /**
   * Whether the model is recommended (defined in configuration).
   * @return isRecommended
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IS_RECOMMENDED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsRecommended() {
    return isRecommended;
  }


  @JsonProperty(value = JSON_PROPERTY_IS_RECOMMENDED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRecommended(@javax.annotation.Nullable Boolean isRecommended) {
    this.isRecommended = isRecommended;
  }

  public ModelSettingsDto capabilities(@javax.annotation.Nonnull AiModelCapabilities capabilities) {
    
    this.capabilities = capabilities;
    return this;
  }

  /**
   * Get capabilities
   * @return capabilities
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_CAPABILITIES, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AiModelCapabilities getCapabilities() {
    return capabilities;
  }


  @JsonProperty(value = JSON_PROPERTY_CAPABILITIES, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCapabilities(@javax.annotation.Nonnull AiModelCapabilities capabilities) {
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
    ModelSettingsDto modelSettingsDto = (ModelSettingsDto) o;
    return Objects.equals(this.id, modelSettingsDto.id) &&
        equalsNullable(this.alias, modelSettingsDto.alias) &&
        Objects.equals(this.isEnabled, modelSettingsDto.isEnabled) &&
        Objects.equals(this.isRecommended, modelSettingsDto.isRecommended) &&
        Objects.equals(this.capabilities, modelSettingsDto.capabilities);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(alias), isEnabled, isRecommended, capabilities);
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
    sb.append("class ModelSettingsDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    isRecommended: ").append(toIndentedString(isRecommended)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `isEnabled` to the URL query string
    if (getIsEnabled() != null) {
      try {
        joiner.add(String.format("%sisEnabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsEnabled()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isRecommended` to the URL query string
    if (getIsRecommended() != null) {
      try {
        joiner.add(String.format("%sisRecommended%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsRecommended()), "UTF-8").replaceAll("\\+", "%20")));
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

