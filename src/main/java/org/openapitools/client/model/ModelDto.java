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
import org.openapitools.client.model.AiChatPrice;
import org.openapitools.client.model.CurrencyInfo;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The AI model information.
 */
@JsonPropertyOrder({
  ModelDto.JSON_PROPERTY_PROVIDER_ID,
  ModelDto.JSON_PROPERTY_PROVIDER_TITLE,
  ModelDto.JSON_PROPERTY_MODEL_ID,
  ModelDto.JSON_PROPERTY_PRICE,
  ModelDto.JSON_PROPERTY_CURRENCY
})

public class ModelDto {
  public static final String JSON_PROPERTY_PROVIDER_ID = "providerId";
  @javax.annotation.Nullable  private Integer providerId;

  public static final String JSON_PROPERTY_PROVIDER_TITLE = "providerTitle";
  @javax.annotation.Nullable  private String providerTitle;

  public static final String JSON_PROPERTY_MODEL_ID = "modelId";
  @javax.annotation.Nullable  private String modelId;

  public static final String JSON_PROPERTY_PRICE = "price";
  @javax.annotation.Nullable  private AiChatPrice price;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  @javax.annotation.Nullable  private CurrencyInfo currency;

  public ModelDto() {
  }


  public ModelDto providerId(@javax.annotation.Nullable Integer providerId) {
    
    this.providerId = providerId;
    return this;
  }

  /**
   * The unique identifier of the AI provider that offers this model.
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

  public ModelDto providerTitle(@javax.annotation.Nullable String providerTitle) {
    
    this.providerTitle = providerTitle;
    return this;
  }

  /**
   * The human-readable display name of the AI provider (e.g., OpenAI, Anthropic).
   * @return providerTitle
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PROVIDER_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProviderTitle() {
    return providerTitle;
  }


  @JsonProperty(value = JSON_PROPERTY_PROVIDER_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProviderTitle(@javax.annotation.Nullable String providerTitle) {
    this.providerTitle = providerTitle;
  }

  public ModelDto modelId(@javax.annotation.Nullable String modelId) {
    
    this.modelId = modelId;
    return this;
  }

  /**
   * The model identifier as recognized by the AI provider (e.g., gpt-4o, claude-sonnet-4-20250514).
   * @return modelId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_MODEL_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getModelId() {
    return modelId;
  }


  @JsonProperty(value = JSON_PROPERTY_MODEL_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setModelId(@javax.annotation.Nullable String modelId) {
    this.modelId = modelId;
  }

  public ModelDto price(@javax.annotation.Nullable AiChatPrice price) {
    
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PRICE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AiChatPrice getPrice() {
    return price;
  }


  @JsonProperty(value = JSON_PROPERTY_PRICE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrice(@javax.annotation.Nullable AiChatPrice price) {
    this.price = price;
  }

  public ModelDto currency(@javax.annotation.Nullable CurrencyInfo currency) {
    
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CURRENCY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CurrencyInfo getCurrency() {
    return currency;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENCY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(@javax.annotation.Nullable CurrencyInfo currency) {
    this.currency = currency;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelDto modelDto = (ModelDto) o;
    return Objects.equals(this.providerId, modelDto.providerId) &&
        Objects.equals(this.providerTitle, modelDto.providerTitle) &&
        Objects.equals(this.modelId, modelDto.modelId) &&
        Objects.equals(this.price, modelDto.price) &&
        Objects.equals(this.currency, modelDto.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerId, providerTitle, modelId, price, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelDto {\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    providerTitle: ").append(toIndentedString(providerTitle)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

    // add `providerTitle` to the URL query string
    if (getProviderTitle() != null) {
      try {
        joiner.add(String.format("%sproviderTitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProviderTitle()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `price` to the URL query string
    if (getPrice() != null) {
      joiner.add(getPrice().toUrlQueryString(prefix + "price" + suffix));
    }

    // add `currency` to the URL query string
    if (getCurrency() != null) {
      joiner.add(getCurrency().toUrlQueryString(prefix + "currency" + suffix));
    }

    return joiner.toString();
  }

}

