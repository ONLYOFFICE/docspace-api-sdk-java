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
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The request parameters for specifying payment quantity.
 */
@JsonPropertyOrder({
  QuantityRequestDto.JSON_PROPERTY_QUANTITY
})

public class QuantityRequestDto {
  public static final String JSON_PROPERTY_QUANTITY = "quantity";
  @javax.annotation.Nonnull  private Map<String, Integer> quantity = new HashMap<>();

  public QuantityRequestDto() {
  }


  public QuantityRequestDto quantity(@javax.annotation.Nonnull Map<String, Integer> quantity) {
    
    this.quantity = quantity;
    return this;
  }

  public QuantityRequestDto putQuantityItem(String key, Integer quantityItem) {
    this.quantity.put(key, quantityItem);
    return this;
  }

  /**
   * The mapping of item identifiers to their respective quantities in the payment.
   * @return quantity
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_QUANTITY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Map<String, Integer> getQuantity() {
    return quantity;
  }


  @JsonProperty(value = JSON_PROPERTY_QUANTITY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQuantity(@javax.annotation.Nonnull Map<String, Integer> quantity) {
    this.quantity = quantity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuantityRequestDto quantityRequestDto = (QuantityRequestDto) o;
    return Objects.equals(this.quantity, quantityRequestDto.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuantityRequestDto {\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

    return joiner.toString();
  }

}

