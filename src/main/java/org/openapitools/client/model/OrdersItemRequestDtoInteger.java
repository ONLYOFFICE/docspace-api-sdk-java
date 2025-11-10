/*
 * (c) Copyright Ascensio System SIA 2025
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
import org.openapitools.client.model.FileEntryType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * An item in the ordering request with its entry type and ID.
 */
@JsonPropertyOrder({
  OrdersItemRequestDtoInteger.JSON_PROPERTY_ENTRY_ID,
  OrdersItemRequestDtoInteger.JSON_PROPERTY_ENTRY_TYPE,
  OrdersItemRequestDtoInteger.JSON_PROPERTY_ORDER
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class OrdersItemRequestDtoInteger {
  public static final String JSON_PROPERTY_ENTRY_ID = "entryId";
  @javax.annotation.Nonnull
  private Integer entryId;

  public static final String JSON_PROPERTY_ENTRY_TYPE = "entryType";
  @javax.annotation.Nonnull
  private FileEntryType entryType;

  public static final String JSON_PROPERTY_ORDER = "order";
  @javax.annotation.Nonnull
  private Integer order;

  public OrdersItemRequestDtoInteger() {
  }

  public OrdersItemRequestDtoInteger entryId(@javax.annotation.Nonnull Integer entryId) {
    
    this.entryId = entryId;
    return this;
  }

  /**
   * The entry unique identifier (file or folder).
   * @return entryId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ENTRY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getEntryId() {
    return entryId;
  }


  @JsonProperty(JSON_PROPERTY_ENTRY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEntryId(@javax.annotation.Nonnull Integer entryId) {
    this.entryId = entryId;
  }

  public OrdersItemRequestDtoInteger entryType(@javax.annotation.Nonnull FileEntryType entryType) {
    
    this.entryType = entryType;
    return this;
  }

  /**
   * Get entryType
   * @return entryType
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ENTRY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FileEntryType getEntryType() {
    return entryType;
  }


  @JsonProperty(JSON_PROPERTY_ENTRY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEntryType(@javax.annotation.Nonnull FileEntryType entryType) {
    this.entryType = entryType;
  }

  public OrdersItemRequestDtoInteger order(@javax.annotation.Nonnull Integer order) {
    
    this.order = order;
    return this;
  }

  /**
   * The order value.
   * minimum: 1
   * maximum: 2147483647
   * @return order
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getOrder() {
    return order;
  }


  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrder(@javax.annotation.Nonnull Integer order) {
    this.order = order;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrdersItemRequestDtoInteger ordersItemRequestDtoInteger = (OrdersItemRequestDtoInteger) o;
    return Objects.equals(this.entryId, ordersItemRequestDtoInteger.entryId) &&
        Objects.equals(this.entryType, ordersItemRequestDtoInteger.entryType) &&
        Objects.equals(this.order, ordersItemRequestDtoInteger.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryId, entryType, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrdersItemRequestDtoInteger {\n");
    sb.append("    entryId: ").append(toIndentedString(entryId)).append("\n");
    sb.append("    entryType: ").append(toIndentedString(entryType)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

    // add `entryId` to the URL query string
    if (getEntryId() != null) {
      try {
        joiner.add(String.format("%sentryId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEntryId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `entryType` to the URL query string
    if (getEntryType() != null) {
      try {
        joiner.add(String.format("%sentryType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEntryType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `order` to the URL query string
    if (getOrder() != null) {
      try {
        joiner.add(String.format("%sorder%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOrder()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

