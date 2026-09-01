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
 * The pricing of a single web search provider, per request.
 */
@JsonPropertyOrder({
  AiWebSearchPricing.JSON_PROPERTY_ID,
  AiWebSearchPricing.JSON_PROPERTY_PROVIDER,
  AiWebSearchPricing.JSON_PROPERTY_PRICE,
  AiWebSearchPricing.JSON_PROPERTY_LINK
})

public class AiWebSearchPricing {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable  private JsonNullable<String> id = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PROVIDER = "provider";
  @javax.annotation.Nullable  private JsonNullable<String> provider = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PRICE = "price";
  @javax.annotation.Nullable  private Double price;

  public static final String JSON_PROPERTY_LINK = "link";
  @javax.annotation.Nullable  private JsonNullable<String> link = JsonNullable.<String>undefined();

  public AiWebSearchPricing() {
  }


  public AiWebSearchPricing id(@javax.annotation.Nullable String id) {
    this.id = JsonNullable.<String>of(id);
    
    return this;
  }

  /**
   * The identifier of the web search provider.
   * @return id
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getId() {
        return id.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getId_JsonNullable() {
    return id;
  }
  
  @JsonProperty(JSON_PROPERTY_ID)
  public void setId_JsonNullable(JsonNullable<String> id) {
    this.id = id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = JsonNullable.<String>of(id);
  }

  public AiWebSearchPricing provider(@javax.annotation.Nullable String provider) {
    this.provider = JsonNullable.<String>of(provider);
    
    return this;
  }

  /**
   * The provider that serves the web search requests.
   * @return provider
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getProvider() {
        return provider.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_PROVIDER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getProvider_JsonNullable() {
    return provider;
  }
  
  @JsonProperty(JSON_PROPERTY_PROVIDER)
  public void setProvider_JsonNullable(JsonNullable<String> provider) {
    this.provider = provider;
  }

  public void setProvider(@javax.annotation.Nullable String provider) {
    this.provider = JsonNullable.<String>of(provider);
  }

  public AiWebSearchPricing price(@javax.annotation.Nullable Double price) {
    
    this.price = price;
    return this;
  }

  /**
   * The price of a single web search request.
   * @return price
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PRICE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getPrice() {
    return price;
  }


  @JsonProperty(value = JSON_PROPERTY_PRICE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrice(@javax.annotation.Nullable Double price) {
    this.price = price;
  }

  public AiWebSearchPricing link(@javax.annotation.Nullable String link) {
    this.link = JsonNullable.<String>of(link);
    
    return this;
  }

  /**
   * The link to the pricing page of the provider.
   * @return link
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getLink() {
        return link.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_LINK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getLink_JsonNullable() {
    return link;
  }
  
  @JsonProperty(JSON_PROPERTY_LINK)
  public void setLink_JsonNullable(JsonNullable<String> link) {
    this.link = link;
  }

  public void setLink(@javax.annotation.Nullable String link) {
    this.link = JsonNullable.<String>of(link);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiWebSearchPricing aiWebSearchPricing = (AiWebSearchPricing) o;
    return equalsNullable(this.id, aiWebSearchPricing.id) &&
        equalsNullable(this.provider, aiWebSearchPricing.provider) &&
        Objects.equals(this.price, aiWebSearchPricing.price) &&
        equalsNullable(this.link, aiWebSearchPricing.link);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(id), hashCodeNullable(provider), price, hashCodeNullable(link));
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
    sb.append("class AiWebSearchPricing {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
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

    // add `provider` to the URL query string
    if (getProvider() != null) {
      try {
        joiner.add(String.format("%sprovider%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProvider()), "UTF-8").replaceAll("\\+", "%20")));
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

