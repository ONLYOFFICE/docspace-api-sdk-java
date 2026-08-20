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
 * AiWebSearchPricing
 */
@JsonPropertyOrder({
  AiWebSearchPricing.JSON_PROPERTY_PROVIDER,
  AiWebSearchPricing.JSON_PROPERTY_SEARCH,
  AiWebSearchPricing.JSON_PROPERTY_CONTENTS
})

public class AiWebSearchPricing {
  public static final String JSON_PROPERTY_PROVIDER = "provider";
  @javax.annotation.Nullable  private JsonNullable<String> provider = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SEARCH = "search";
  @javax.annotation.Nullable  private Double search;

  public static final String JSON_PROPERTY_CONTENTS = "contents";
  @javax.annotation.Nullable  private Double contents;

  public AiWebSearchPricing() {
  }


  public AiWebSearchPricing provider(@javax.annotation.Nullable String provider) {
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

  public AiWebSearchPricing search(@javax.annotation.Nullable Double search) {
    
    this.search = search;
    return this;
  }

  /**
   * Get search
   * @return search
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SEARCH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getSearch() {
    return search;
  }


  @JsonProperty(value = JSON_PROPERTY_SEARCH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSearch(@javax.annotation.Nullable Double search) {
    this.search = search;
  }

  public AiWebSearchPricing contents(@javax.annotation.Nullable Double contents) {
    
    this.contents = contents;
    return this;
  }

  /**
   * Get contents
   * @return contents
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CONTENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getContents() {
    return contents;
  }


  @JsonProperty(value = JSON_PROPERTY_CONTENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContents(@javax.annotation.Nullable Double contents) {
    this.contents = contents;
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
    return equalsNullable(this.provider, aiWebSearchPricing.provider) &&
        Objects.equals(this.search, aiWebSearchPricing.search) &&
        Objects.equals(this.contents, aiWebSearchPricing.contents);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(provider), search, contents);
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
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
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

    // add `provider` to the URL query string
    if (getProvider() != null) {
      try {
        joiner.add(String.format("%sprovider%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProvider()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `search` to the URL query string
    if (getSearch() != null) {
      try {
        joiner.add(String.format("%ssearch%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSearch()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `contents` to the URL query string
    if (getContents() != null) {
      try {
        joiner.add(String.format("%scontents%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getContents()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

