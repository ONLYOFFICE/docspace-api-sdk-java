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
import java.math.BigDecimal;
import org.openapitools.client.model.AiProviderType;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * AI model metadata. Describes a single model available from a provider.
 */
@JsonPropertyOrder({
  AiModel.JSON_PROPERTY_ID,
  AiModel.JSON_PROPERTY_NAME,
  AiModel.JSON_PROPERTY_PROVIDER,
  AiModel.JSON_PROPERTY_REASONING,
  AiModel.JSON_PROPERTY_CAPABILITIES
})

public class AiModel {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nonnull  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull  private String name;

  public static final String JSON_PROPERTY_PROVIDER = "provider";
  @javax.annotation.Nonnull  private AiProviderType provider;

  public static final String JSON_PROPERTY_REASONING = "reasoning";
  @javax.annotation.Nullable  private Boolean reasoning;

  public static final String JSON_PROPERTY_CAPABILITIES = "capabilities";
  @javax.annotation.Nullable  private BigDecimal capabilities;

  public AiModel() {
  }


  public AiModel id(@javax.annotation.Nonnull String id) {
    
    this.id = id;
    return this;
  }

  /**
   * Model identifier as used by the provider API (e.g. `gpt-4o`, `claude-sonnet-4-20250514`).
   * @return id
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(@javax.annotation.Nonnull String id) {
    this.id = id;
  }

  public AiModel name(@javax.annotation.Nonnull String name) {
    
    this.name = name;
    return this;
  }

  /**
   * Human-readable model name for display in the UI.
   * @return name
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(value = JSON_PROPERTY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }

  public AiModel provider(@javax.annotation.Nonnull AiProviderType provider) {
    
    this.provider = provider;
    return this;
  }

  /**
   * Provider that offers this model.
   * @return provider
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_PROVIDER, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AiProviderType getProvider() {
    return provider;
  }


  @JsonProperty(value = JSON_PROPERTY_PROVIDER, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProvider(@javax.annotation.Nonnull AiProviderType provider) {
    this.provider = provider;
  }

  public AiModel reasoning(@javax.annotation.Nullable Boolean reasoning) {
    
    this.reasoning = reasoning;
    return this;
  }

  /**
   * Whether this model supports extended thinking / chain-of-thought reasoning.
   * @return reasoning
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_REASONING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getReasoning() {
    return reasoning;
  }


  @JsonProperty(value = JSON_PROPERTY_REASONING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReasoning(@javax.annotation.Nullable Boolean reasoning) {
    this.reasoning = reasoning;
  }

  public AiModel capabilities(@javax.annotation.Nullable BigDecimal capabilities) {
    
    this.capabilities = capabilities;
    return this;
  }

  /**
   * Bitmask of model capabilities (Chat, Image, Vision, Tools, etc.). Used to filter models per `ActionType`.
   * @return capabilities
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CAPABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCapabilities() {
    return capabilities;
  }


  @JsonProperty(value = JSON_PROPERTY_CAPABILITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCapabilities(@javax.annotation.Nullable BigDecimal capabilities) {
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
    AiModel aiModel = (AiModel) o;
    return Objects.equals(this.id, aiModel.id) &&
        Objects.equals(this.name, aiModel.name) &&
        Objects.equals(this.provider, aiModel.provider) &&
        Objects.equals(this.reasoning, aiModel.reasoning) &&
        Objects.equals(this.capabilities, aiModel.capabilities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, provider, reasoning, capabilities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    reasoning: ").append(toIndentedString(reasoning)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `provider` to the URL query string
    if (getProvider() != null) {
      joiner.add(getProvider().toUrlQueryString(prefix + "provider" + suffix));
    }

    // add `reasoning` to the URL query string
    if (getReasoning() != null) {
      try {
        joiner.add(String.format("%sreasoning%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReasoning()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `capabilities` to the URL query string
    if (getCapabilities() != null) {
      try {
        joiner.add(String.format("%scapabilities%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCapabilities()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

