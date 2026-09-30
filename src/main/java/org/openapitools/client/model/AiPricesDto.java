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
import org.openapitools.client.model.AiEntryPricingDtoAiChatPriceDto;
import org.openapitools.client.model.AiEntryPricingDtoAiEmbeddingPriceDto;
import org.openapitools.client.model.AiEntryPricingDtoAiImagePriceDto;
import org.openapitools.client.model.AiEntryPricingDtoDecimal;
import org.openapitools.client.model.CurrencyInfo;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * What the AI features cost out of the portal wallet, grouped by the kind of model, in one currency.
 */
@JsonPropertyOrder({
  AiPricesDto.JSON_PROPERTY_CHAT,
  AiPricesDto.JSON_PROPERTY_EMBEDDING,
  AiPricesDto.JSON_PROPERTY_IMAGE,
  AiPricesDto.JSON_PROPERTY_WEB_SEARCH,
  AiPricesDto.JSON_PROPERTY_CURRENCY
})

public class AiPricesDto {
  public static final String JSON_PROPERTY_CHAT = "chat";
  @javax.annotation.Nullable  private List<AiEntryPricingDtoAiChatPriceDto> chat;

  public static final String JSON_PROPERTY_EMBEDDING = "embedding";
  @javax.annotation.Nullable  private List<AiEntryPricingDtoAiEmbeddingPriceDto> embedding;

  public static final String JSON_PROPERTY_IMAGE = "image";
  @javax.annotation.Nullable  private List<AiEntryPricingDtoAiImagePriceDto> image;

  public static final String JSON_PROPERTY_WEB_SEARCH = "webSearch";
  @javax.annotation.Nullable  private List<AiEntryPricingDtoDecimal> webSearch;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  @javax.annotation.Nonnull  private CurrencyInfo currency;

  public AiPricesDto() {
  }


  public AiPricesDto chat(@javax.annotation.Nullable List<AiEntryPricingDtoAiChatPriceDto> chat) {
    
    this.chat = chat;
    return this;
  }

  public AiPricesDto addChatItem(AiEntryPricingDtoAiChatPriceDto chatItem) {
    if (this.chat == null) {
      this.chat = new ArrayList<>();
    }
    this.chat.add(chatItem);
    return this;
  }

  /**
   * The chat models on offer, each priced per million prompt and completion tokens. A model listed here is one  the installation can bill for, not necessarily one this portal may use -  `GET api/2.0/portal/payment/ai-model/restrictions` says which are allowed.
   * @return chat
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CHAT, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<AiEntryPricingDtoAiChatPriceDto> getChat() {
    return chat;
  }


  @JsonProperty(value = JSON_PROPERTY_CHAT, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChat(@javax.annotation.Nullable List<AiEntryPricingDtoAiChatPriceDto> chat) {
    this.chat = chat;
  }

  public AiPricesDto embedding(@javax.annotation.Nullable List<AiEntryPricingDtoAiEmbeddingPriceDto> embedding) {
    
    this.embedding = embedding;
    return this;
  }

  public AiPricesDto addEmbeddingItem(AiEntryPricingDtoAiEmbeddingPriceDto embeddingItem) {
    if (this.embedding == null) {
      this.embedding = new ArrayList<>();
    }
    this.embedding.add(embeddingItem);
    return this;
  }

  /**
   * The embedding models on offer, priced per million tokens of input; an embedding model has no completion  side, so its price object carries `prompt` alone.
   * @return embedding
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_EMBEDDING, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<AiEntryPricingDtoAiEmbeddingPriceDto> getEmbedding() {
    return embedding;
  }


  @JsonProperty(value = JSON_PROPERTY_EMBEDDING, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmbedding(@javax.annotation.Nullable List<AiEntryPricingDtoAiEmbeddingPriceDto> embedding) {
    this.embedding = embedding;
  }

  public AiPricesDto image(@javax.annotation.Nullable List<AiEntryPricingDtoAiImagePriceDto> image) {
    
    this.image = image;
    return this;
  }

  public AiPricesDto addImageItem(AiEntryPricingDtoAiImagePriceDto imageItem) {
    if (this.image == null) {
      this.image = new ArrayList<>();
    }
    this.image.add(imageItem);
    return this;
  }

  /**
   * The image models on offer, priced per million prompt and completion tokens plus a price for each image  produced.
   * @return image
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IMAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<AiEntryPricingDtoAiImagePriceDto> getImage() {
    return image;
  }


  @JsonProperty(value = JSON_PROPERTY_IMAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setImage(@javax.annotation.Nullable List<AiEntryPricingDtoAiImagePriceDto> image) {
    this.image = image;
  }

  public AiPricesDto webSearch(@javax.annotation.Nullable List<AiEntryPricingDtoDecimal> webSearch) {
    
    this.webSearch = webSearch;
    return this;
  }

  public AiPricesDto addWebSearchItem(AiEntryPricingDtoDecimal webSearchItem) {
    if (this.webSearch == null) {
      this.webSearch = new ArrayList<>();
    }
    this.webSearch.add(webSearchItem);
    return this;
  }

  /**
   * The web search providers on offer. Their `price` is a bare number - the cost of one search - rather than  an object, because there are no tokens to distinguish.
   * @return webSearch
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_WEB_SEARCH, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<AiEntryPricingDtoDecimal> getWebSearch() {
    return webSearch;
  }


  @JsonProperty(value = JSON_PROPERTY_WEB_SEARCH, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWebSearch(@javax.annotation.Nullable List<AiEntryPricingDtoDecimal> webSearch) {
    this.webSearch = webSearch;
  }

  public AiPricesDto currency(@javax.annotation.Nonnull CurrencyInfo currency) {
    
    this.currency = currency;
    return this;
  }

  /**
   * The currency every price above is expressed in, with its ISO code and symbol. One answer never mixes  currencies, so this is the only place to read it.
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
    AiPricesDto aiPricesDto = (AiPricesDto) o;
    return Objects.equals(this.chat, aiPricesDto.chat) &&
        Objects.equals(this.embedding, aiPricesDto.embedding) &&
        Objects.equals(this.image, aiPricesDto.image) &&
        Objects.equals(this.webSearch, aiPricesDto.webSearch) &&
        Objects.equals(this.currency, aiPricesDto.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chat, embedding, image, webSearch, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiPricesDto {\n");
    sb.append("    chat: ").append(toIndentedString(chat)).append("\n");
    sb.append("    embedding: ").append(toIndentedString(embedding)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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

    // add `image` to the URL query string
    if (getImage() != null) {
      for (int i = 0; i < getImage().size(); i++) {
        if (getImage().get(i) != null) {
          joiner.add(getImage().get(i).toUrlQueryString(String.format("%simage%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `webSearch` to the URL query string
    if (getWebSearch() != null) {
      for (int i = 0; i < getWebSearch().size(); i++) {
        if (getWebSearch().get(i) != null) {
          joiner.add(getWebSearch().get(i).toUrlQueryString(String.format("%swebSearch%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `currency` to the URL query string
    if (getCurrency() != null) {
      joiner.add(getCurrency().toUrlQueryString(prefix + "currency" + suffix));
    }

    return joiner.toString();
  }

}

