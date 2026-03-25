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
import org.openapitools.client.model.ItemKeyValuePairStringBoolean;
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
 * The request parameters for configuring security settings across multiple web modules.
 */
@JsonPropertyOrder({
  WebItemsSecurityRequestsDto.JSON_PROPERTY_ITEMS
})

public class WebItemsSecurityRequestsDto {
  public static final String JSON_PROPERTY_ITEMS = "items";
  @javax.annotation.Nullable  private JsonNullable<List<ItemKeyValuePairStringBoolean>> items = JsonNullable.<List<ItemKeyValuePairStringBoolean>>undefined();

  public WebItemsSecurityRequestsDto() {
  }


  public WebItemsSecurityRequestsDto items(@javax.annotation.Nullable List<ItemKeyValuePairStringBoolean> items) {
    this.items = JsonNullable.<List<ItemKeyValuePairStringBoolean>>of(items);
    
    return this;
  }

  public WebItemsSecurityRequestsDto addItemsItem(ItemKeyValuePairStringBoolean itemsItem) {
    if (this.items == null || !this.items.isPresent()) {
      this.items = JsonNullable.<List<ItemKeyValuePairStringBoolean>>of(new ArrayList<>());
    }
    try {
      this.items.get().add(itemsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of module security configurations.
   * @return items
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<ItemKeyValuePairStringBoolean> getItems() {
        return items.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ITEMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<ItemKeyValuePairStringBoolean>> getItems_JsonNullable() {
    return items;
  }
  
  @JsonProperty(JSON_PROPERTY_ITEMS)
  public void setItems_JsonNullable(JsonNullable<List<ItemKeyValuePairStringBoolean>> items) {
    this.items = items;
  }

  public void setItems(@javax.annotation.Nullable List<ItemKeyValuePairStringBoolean> items) {
    this.items = JsonNullable.<List<ItemKeyValuePairStringBoolean>>of(items);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebItemsSecurityRequestsDto webItemsSecurityRequestsDto = (WebItemsSecurityRequestsDto) o;
    return equalsNullable(this.items, webItemsSecurityRequestsDto.items);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(items));
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
    sb.append("class WebItemsSecurityRequestsDto {\n");
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

