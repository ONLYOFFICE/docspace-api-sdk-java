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
import org.openapitools.client.model.AiEmbeddingPrice;
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
 * AiEmbeddingModelPricing
 */
@JsonPropertyOrder({
  AiEmbeddingModelPricing.JSON_PROPERTY_ID,
  AiEmbeddingModelPricing.JSON_PROPERTY_ALIAS,
  AiEmbeddingModelPricing.JSON_PROPERTY_OWNED_BY,
  AiEmbeddingModelPricing.JSON_PROPERTY_PROVIDER,
  AiEmbeddingModelPricing.JSON_PROPERTY_PRICE
})

public class AiEmbeddingModelPricing {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable  private String id;

  public static final String JSON_PROPERTY_ALIAS = "alias";
  @javax.annotation.Nullable  private JsonNullable<String> alias = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_OWNED_BY = "ownedBy";
  @javax.annotation.Nullable  private JsonNullable<String> ownedBy = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PROVIDER = "provider";
  @javax.annotation.Nullable  private JsonNullable<String> provider = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PRICE = "price";
  @javax.annotation.Nonnull  private AiEmbeddingPrice price;

  public AiEmbeddingModelPricing() {
  }


  public AiEmbeddingModelPricing id(@javax.annotation.Nullable String id) {
    
    this.id = id;
    return this;
  }

  /**
   * Get id
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

  public AiEmbeddingModelPricing alias(@javax.annotation.Nullable String alias) {
    this.alias = JsonNullable.<String>of(alias);
    
    return this;
  }

  /**
   * Get alias
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

  public AiEmbeddingModelPricing ownedBy(@javax.annotation.Nullable String ownedBy) {
    this.ownedBy = JsonNullable.<String>of(ownedBy);
    
    return this;
  }

  /**
   * Get ownedBy
   * @return ownedBy
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getOwnedBy() {
        return ownedBy.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_OWNED_BY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getOwnedBy_JsonNullable() {
    return ownedBy;
  }
  
  @JsonProperty(JSON_PROPERTY_OWNED_BY)
  public void setOwnedBy_JsonNullable(JsonNullable<String> ownedBy) {
    this.ownedBy = ownedBy;
  }

  public void setOwnedBy(@javax.annotation.Nullable String ownedBy) {
    this.ownedBy = JsonNullable.<String>of(ownedBy);
  }

  public AiEmbeddingModelPricing provider(@javax.annotation.Nullable String provider) {
    this.provider = JsonNullable.<String>of(provider);
    
    return this;
  }

  /**
   * Get provider
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

  public AiEmbeddingModelPricing price(@javax.annotation.Nonnull AiEmbeddingPrice price) {
    
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_PRICE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AiEmbeddingPrice getPrice() {
    return price;
  }


  @JsonProperty(value = JSON_PROPERTY_PRICE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPrice(@javax.annotation.Nonnull AiEmbeddingPrice price) {
    this.price = price;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiEmbeddingModelPricing aiEmbeddingModelPricing = (AiEmbeddingModelPricing) o;
    return Objects.equals(this.id, aiEmbeddingModelPricing.id) &&
        equalsNullable(this.alias, aiEmbeddingModelPricing.alias) &&
        equalsNullable(this.ownedBy, aiEmbeddingModelPricing.ownedBy) &&
        equalsNullable(this.provider, aiEmbeddingModelPricing.provider) &&
        Objects.equals(this.price, aiEmbeddingModelPricing.price);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(alias), hashCodeNullable(ownedBy), hashCodeNullable(provider), price);
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
    sb.append("class AiEmbeddingModelPricing {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    ownedBy: ").append(toIndentedString(ownedBy)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

    // add `ownedBy` to the URL query string
    if (getOwnedBy() != null) {
      try {
        joiner.add(String.format("%sownedBy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOwnedBy()), "UTF-8").replaceAll("\\+", "%20")));
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
      joiner.add(getPrice().toUrlQueryString(prefix + "price" + suffix));
    }

    return joiner.toString();
  }

}

