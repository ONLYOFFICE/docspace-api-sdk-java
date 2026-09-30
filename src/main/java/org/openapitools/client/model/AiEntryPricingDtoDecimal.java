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
 * One AI model or service on the price list: how to name it, who provides it, and what it costs.
 */
@JsonPropertyOrder({
  AiEntryPricingDtoDecimal.JSON_PROPERTY_ID,
  AiEntryPricingDtoDecimal.JSON_PROPERTY_ALIAS,
  AiEntryPricingDtoDecimal.JSON_PROPERTY_PROVIDER,
  AiEntryPricingDtoDecimal.JSON_PROPERTY_IMAGE,
  AiEntryPricingDtoDecimal.JSON_PROPERTY_PRICE,
  AiEntryPricingDtoDecimal.JSON_PROPERTY_LINK
})

public class AiEntryPricingDtoDecimal {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable  private String id;

  public static final String JSON_PROPERTY_ALIAS = "alias";
  @javax.annotation.Nullable  private String alias;

  public static final String JSON_PROPERTY_PROVIDER = "provider";
  @javax.annotation.Nullable  private String provider;

  public static final String JSON_PROPERTY_IMAGE = "image";
  @javax.annotation.Nullable  private String image;

  public static final String JSON_PROPERTY_PRICE = "price";
  @javax.annotation.Nonnull  private Double price;

  public static final String JSON_PROPERTY_LINK = "link";
  @javax.annotation.Nullable  private String link;

  public AiEntryPricingDtoDecimal() {
  }


  public AiEntryPricingDtoDecimal id(@javax.annotation.Nullable String id) {
    
    this.id = id;
    return this;
  }

  /**
   * The model identifier to send to the AI operations. It is the value to branch on, while `alias` is for display  only.
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

  public AiEntryPricingDtoDecimal alias(@javax.annotation.Nullable String alias) {
    
    this.alias = alias;
    return this;
  }

  /**
   * The model name as the vendor writes it, meant to be shown to a person rather than matched on.
   * @return alias
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ALIAS, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAlias() {
    return alias;
  }


  @JsonProperty(value = JSON_PROPERTY_ALIAS, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAlias(@javax.annotation.Nullable String alias) {
    this.alias = alias;
  }

  public AiEntryPricingDtoDecimal provider(@javax.annotation.Nullable String provider) {
    
    this.provider = provider;
    return this;
  }

  /**
   * Who runs the model. Two entries can share a provider, and one provider's models can be priced quite  differently, so the price always belongs to the entry and never to the provider.
   * @return provider
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PROVIDER, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProvider() {
    return provider;
  }


  @JsonProperty(value = JSON_PROPERTY_PROVIDER, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProvider(@javax.annotation.Nullable String provider) {
    this.provider = provider;
  }

  public AiEntryPricingDtoDecimal image(@javax.annotation.Nullable String image) {
    
    this.image = image;
    return this;
  }

  /**
   * The absolute URL of the provider's icon, for rendering next to the entry.
   * @return image
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IMAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getImage() {
    return image;
  }


  @JsonProperty(value = JSON_PROPERTY_IMAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setImage(@javax.annotation.Nullable String image) {
    this.image = image;
  }

  public AiEntryPricingDtoDecimal price(@javax.annotation.Nonnull Double price) {
    
    this.price = price;
    return this;
  }

  /**
   * What the entry costs, in the currency the answer names. Amounts per token are normalised per million  tokens, so they are not the price of a single call.
   * @return price
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_PRICE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getPrice() {
    return price;
  }


  @JsonProperty(value = JSON_PROPERTY_PRICE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPrice(@javax.annotation.Nonnull Double price) {
    this.price = price;
  }

  public AiEntryPricingDtoDecimal link(@javax.annotation.Nullable String link) {
    
    this.link = link;
    return this;
  }

  /**
   * The provider's own page for the model, for a person to read the model's terms. It is empty when the  provider publishes none.
   * @return link
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_LINK, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLink() {
    return link;
  }


  @JsonProperty(value = JSON_PROPERTY_LINK, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLink(@javax.annotation.Nullable String link) {
    this.link = link;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiEntryPricingDtoDecimal aiEntryPricingDtoDecimal = (AiEntryPricingDtoDecimal) o;
    return Objects.equals(this.id, aiEntryPricingDtoDecimal.id) &&
        Objects.equals(this.alias, aiEntryPricingDtoDecimal.alias) &&
        Objects.equals(this.provider, aiEntryPricingDtoDecimal.provider) &&
        Objects.equals(this.image, aiEntryPricingDtoDecimal.image) &&
        Objects.equals(this.price, aiEntryPricingDtoDecimal.price) &&
        Objects.equals(this.link, aiEntryPricingDtoDecimal.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, alias, provider, image, price, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiEntryPricingDtoDecimal {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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

    // add `provider` to the URL query string
    if (getProvider() != null) {
      try {
        joiner.add(String.format("%sprovider%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProvider()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `image` to the URL query string
    if (getImage() != null) {
      try {
        joiner.add(String.format("%simage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getImage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `price` to the URL query string
    if (getPrice() != null) {
      try {
        joiner.add(String.format("%sprice%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPrice()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `link` to the URL query string
    if (getLink() != null) {
      try {
        joiner.add(String.format("%slink%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLink()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

