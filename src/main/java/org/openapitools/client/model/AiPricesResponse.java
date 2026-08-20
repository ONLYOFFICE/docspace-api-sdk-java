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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.AiChatModelPricing;
import org.openapitools.client.model.AiEmbeddingModelPricing;
import org.openapitools.client.model.AiWebSearchPricing;
import org.openapitools.client.model.CurrencyInfo;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * AiPricesResponse
 */
@JsonPropertyOrder({
  AiPricesResponse.JSON_PROPERTY_CHAT,
  AiPricesResponse.JSON_PROPERTY_EMBEDDING,
  AiPricesResponse.JSON_PROPERTY_WEB_SEARCH,
  AiPricesResponse.JSON_PROPERTY_CURRENCY
})

public class AiPricesResponse {
  public static final String JSON_PROPERTY_CHAT = "chat";
  @javax.annotation.Nullable  private List<AiChatModelPricing> chat;

  public static final String JSON_PROPERTY_EMBEDDING = "embedding";
  @javax.annotation.Nullable  private List<AiEmbeddingModelPricing> embedding;

  public static final String JSON_PROPERTY_WEB_SEARCH = "webSearch";
  @javax.annotation.Nonnull  private AiWebSearchPricing webSearch;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  @javax.annotation.Nonnull  private CurrencyInfo currency;

  public AiPricesResponse() {
  }


  public AiPricesResponse chat(@javax.annotation.Nullable List<AiChatModelPricing> chat) {
    
    this.chat = chat;
    return this;
  }

  public AiPricesResponse addChatItem(AiChatModelPricing chatItem) {
    if (this.chat == null) {
      this.chat = new ArrayList<>();
    }
    this.chat.add(chatItem);
    return this;
  }

  /**
   * Get chat
   * @return chat
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CHAT, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<AiChatModelPricing> getChat() {
    return chat;
  }


  @JsonProperty(value = JSON_PROPERTY_CHAT, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChat(@javax.annotation.Nullable List<AiChatModelPricing> chat) {
    this.chat = chat;
  }

  public AiPricesResponse embedding(@javax.annotation.Nullable List<AiEmbeddingModelPricing> embedding) {
    
    this.embedding = embedding;
    return this;
  }

  public AiPricesResponse addEmbeddingItem(AiEmbeddingModelPricing embeddingItem) {
    if (this.embedding == null) {
      this.embedding = new ArrayList<>();
    }
    this.embedding.add(embeddingItem);
    return this;
  }

  /**
   * Get embedding
   * @return embedding
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_EMBEDDING, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<AiEmbeddingModelPricing> getEmbedding() {
    return embedding;
  }


  @JsonProperty(value = JSON_PROPERTY_EMBEDDING, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmbedding(@javax.annotation.Nullable List<AiEmbeddingModelPricing> embedding) {
    this.embedding = embedding;
  }

  public AiPricesResponse webSearch(@javax.annotation.Nonnull AiWebSearchPricing webSearch) {
    
    this.webSearch = webSearch;
    return this;
  }

  /**
   * Get webSearch
   * @return webSearch
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_WEB_SEARCH, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AiWebSearchPricing getWebSearch() {
    return webSearch;
  }


  @JsonProperty(value = JSON_PROPERTY_WEB_SEARCH, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWebSearch(@javax.annotation.Nonnull AiWebSearchPricing webSearch) {
    this.webSearch = webSearch;
  }

  public AiPricesResponse currency(@javax.annotation.Nonnull CurrencyInfo currency) {
    
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_CURRENCY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CurrencyInfo getCurrency() {
    return currency;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENCY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrency(@javax.annotation.Nonnull CurrencyInfo currency) {
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
    AiPricesResponse aiPricesResponse = (AiPricesResponse) o;
    return Objects.equals(this.chat, aiPricesResponse.chat) &&
        Objects.equals(this.embedding, aiPricesResponse.embedding) &&
        Objects.equals(this.webSearch, aiPricesResponse.webSearch) &&
        Objects.equals(this.currency, aiPricesResponse.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chat, embedding, webSearch, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiPricesResponse {\n");
    sb.append("    chat: ").append(toIndentedString(chat)).append("\n");
    sb.append("    embedding: ").append(toIndentedString(embedding)).append("\n");
    sb.append("    webSearch: ").append(toIndentedString(webSearch)).append("\n");
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

    // add `chat` to the URL query string
    if (getChat() != null) {
      for (int i = 0; i < getChat().size(); i++) {
        if (getChat().get(i) != null) {
          joiner.add(getChat().get(i).toUrlQueryString(String.format("%schat%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `embedding` to the URL query string
    if (getEmbedding() != null) {
      for (int i = 0; i < getEmbedding().size(); i++) {
        if (getEmbedding().get(i) != null) {
          joiner.add(getEmbedding().get(i).toUrlQueryString(String.format("%sembedding%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `webSearch` to the URL query string
    if (getWebSearch() != null) {
      joiner.add(getWebSearch().toUrlQueryString(prefix + "webSearch" + suffix));
    }

    // add `currency` to the URL query string
    if (getCurrency() != null) {
      joiner.add(getCurrency().toUrlQueryString(prefix + "currency" + suffix));
    }

    return joiner.toString();
  }

}

