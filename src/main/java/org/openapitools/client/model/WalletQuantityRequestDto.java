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
import java.util.HashMap;
import java.util.Map;
import org.openapitools.client.model.ProductQuantityType;
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
 * The request parameters for specifying wallet payment quantity.
 */
@JsonPropertyOrder({
  WalletQuantityRequestDto.JSON_PROPERTY_QUANTITY,
  WalletQuantityRequestDto.JSON_PROPERTY_PRODUCT_QUANTITY_TYPE
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class WalletQuantityRequestDto {
  public static final String JSON_PROPERTY_QUANTITY = "quantity";
  @javax.annotation.Nullable
  private JsonNullable<Map<String, Integer>> quantity = JsonNullable.<Map<String, Integer>>undefined();

  public static final String JSON_PROPERTY_PRODUCT_QUANTITY_TYPE = "productQuantityType";
  @javax.annotation.Nullable
  private ProductQuantityType productQuantityType;

  public WalletQuantityRequestDto() {
  }

  public WalletQuantityRequestDto quantity(@javax.annotation.Nullable Map<String, Integer> quantity) {
    this.quantity = JsonNullable.<Map<String, Integer>>of(quantity);
    
    return this;
  }

  public WalletQuantityRequestDto putQuantityItem(String key, Integer quantityItem) {
    if (this.quantity == null || !this.quantity.isPresent()) {
      this.quantity = JsonNullable.<Map<String, Integer>>of(new HashMap<>());
    }
    try {
      this.quantity.get().put(key, quantityItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The mapping of item identifiers to their respective quantities in the payment.
   * @return quantity
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Map<String, Integer> getQuantity() {
        return quantity.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Map<String, Integer>> getQuantity_JsonNullable() {
    return quantity;
  }
  
  @JsonProperty(JSON_PROPERTY_QUANTITY)
  public void setQuantity_JsonNullable(JsonNullable<Map<String, Integer>> quantity) {
    this.quantity = quantity;
  }

  public void setQuantity(@javax.annotation.Nullable Map<String, Integer> quantity) {
    this.quantity = JsonNullable.<Map<String, Integer>>of(quantity);
  }

  public WalletQuantityRequestDto productQuantityType(@javax.annotation.Nullable ProductQuantityType productQuantityType) {
    
    this.productQuantityType = productQuantityType;
    return this;
  }

  /**
   * Get productQuantityType
   * @return productQuantityType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCT_QUANTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProductQuantityType getProductQuantityType() {
    return productQuantityType;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_QUANTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductQuantityType(@javax.annotation.Nullable ProductQuantityType productQuantityType) {
    this.productQuantityType = productQuantityType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletQuantityRequestDto walletQuantityRequestDto = (WalletQuantityRequestDto) o;
    return equalsNullable(this.quantity, walletQuantityRequestDto.quantity) &&
        Objects.equals(this.productQuantityType, walletQuantityRequestDto.productQuantityType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(quantity), productQuantityType);
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
    sb.append("class WalletQuantityRequestDto {\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    productQuantityType: ").append(toIndentedString(productQuantityType)).append("\n");
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

    // add `quantity` to the URL query string
    if (getQuantity() != null) {
      for (String _key : getQuantity().keySet()) {
        try {
          joiner.add(String.format("%squantity%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getQuantity().get(_key), URLEncoder.encode(String.valueOf(getQuantity().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `productQuantityType` to the URL query string
    if (getProductQuantityType() != null) {
      try {
        joiner.add(String.format("%sproductQuantityType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProductQuantityType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

