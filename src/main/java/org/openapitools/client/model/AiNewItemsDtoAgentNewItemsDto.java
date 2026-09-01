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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.AiAgentNewItemsDto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The new item parameters.
 */
@JsonPropertyOrder({
  AiNewItemsDtoAgentNewItemsDto.JSON_PROPERTY_DATE,
  AiNewItemsDtoAgentNewItemsDto.JSON_PROPERTY_ITEMS
})

public class AiNewItemsDtoAgentNewItemsDto {
  public static final String JSON_PROPERTY_DATE = "date";
  @javax.annotation.Nullable  private OffsetDateTime date;

  public static final String JSON_PROPERTY_ITEMS = "items";
  @javax.annotation.Nullable  private List<AiAgentNewItemsDto> items;

  public AiNewItemsDtoAgentNewItemsDto() {
  }


  public AiNewItemsDtoAgentNewItemsDto date(@javax.annotation.Nullable OffsetDateTime date) {
    
    this.date = date;
    return this;
  }

  /**
   * The date and time when the new item was created.
   * @return date
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getDate() {
    return date;
  }


  @JsonProperty(value = JSON_PROPERTY_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDate(@javax.annotation.Nullable OffsetDateTime date) {
    this.date = date;
  }

  public AiNewItemsDtoAgentNewItemsDto items(@javax.annotation.Nullable List<AiAgentNewItemsDto> items) {
    
    this.items = items;
    return this;
  }

  public AiNewItemsDtoAgentNewItemsDto addItemsItem(AiAgentNewItemsDto itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * The list of items.
   * @return items
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ITEMS, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<AiAgentNewItemsDto> getItems() {
    return items;
  }


  @JsonProperty(value = JSON_PROPERTY_ITEMS, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setItems(@javax.annotation.Nullable List<AiAgentNewItemsDto> items) {
    this.items = items;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiNewItemsDtoAgentNewItemsDto aiNewItemsDtoAgentNewItemsDto = (AiNewItemsDtoAgentNewItemsDto) o;
    return Objects.equals(this.date, aiNewItemsDtoAgentNewItemsDto.date) &&
        Objects.equals(this.items, aiNewItemsDtoAgentNewItemsDto.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiNewItemsDtoAgentNewItemsDto {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

    // add `date` to the URL query string
    if (getDate() != null) {
      try {
        joiner.add(String.format("%sdate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `items` to the URL query string
    if (getItems() != null) {
      for (int i = 0; i < getItems().size(); i++) {
        if (getItems().get(i) != null) {
          joiner.add(getItems().get(i).toUrlQueryString(String.format("%sitems%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

