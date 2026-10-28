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
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The plan being bought and the two pages the hosted checkout returns the buyer to.
 */
@JsonPropertyOrder({
  PaymentUrlRequestDto.JSON_PROPERTY_BACK_URL,
  PaymentUrlRequestDto.JSON_PROPERTY_SUCCESS_URL,
  PaymentUrlRequestDto.JSON_PROPERTY_QUANTITY
})

public class PaymentUrlRequestDto {
  public static final String JSON_PROPERTY_BACK_URL = "backUrl";
  @javax.annotation.Nonnull  private URI backUrl;

  public static final String JSON_PROPERTY_SUCCESS_URL = "successUrl";
  @javax.annotation.Nonnull  private URI successUrl;

  public static final String JSON_PROPERTY_QUANTITY = "quantity";
  @javax.annotation.Nonnull  private Map<String, Integer> quantity = new HashMap<>();

  public PaymentUrlRequestDto() {
  }


  public PaymentUrlRequestDto backUrl(@javax.annotation.Nonnull URI backUrl) {
    
    this.backUrl = backUrl;
    return this;
  }

  /**
   * The absolute address the hosted checkout page sends the buyer back to when the purchase is abandoned. It has  to be a well-formed URL and is carried into the checkout page as it is given, so it must be reachable by the  buyer rather than by the portal.
   * @return backUrl
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_BACK_URL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public URI getBackUrl() {
    return backUrl;
  }


  @JsonProperty(value = JSON_PROPERTY_BACK_URL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBackUrl(@javax.annotation.Nonnull URI backUrl) {
    this.backUrl = backUrl;
  }

  public PaymentUrlRequestDto successUrl(@javax.annotation.Nonnull URI successUrl) {
    
    this.successUrl = successUrl;
    return this;
  }

  /**
   * The absolute address the hosted checkout page sends the buyer to once the payment provider accepts the  purchase. Reaching it says the provider took the money, not that the portal has already been switched to the  new plan, so a client that lands here reads the plan back rather than assuming it.
   * @return successUrl
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_SUCCESS_URL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public URI getSuccessUrl() {
    return successUrl;
  }


  @JsonProperty(value = JSON_PROPERTY_SUCCESS_URL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSuccessUrl(@javax.annotation.Nonnull URI successUrl) {
    this.successUrl = successUrl;
  }

  public PaymentUrlRequestDto quantity(@javax.annotation.Nonnull Map<String, Integer> quantity) {
    
    this.quantity = quantity;
    return this;
  }

  public PaymentUrlRequestDto putQuantityItem(String key, Integer quantityItem) {
    this.quantity.put(key, quantityItem);
    return this;
  }

  /**
   * The plan being bought, as a single pair of the plan name and the number of units of it. The key is the `name`  of a monthly, non-wallet quota from `GET api/2.0/portal/payment/quotas`, and the value is how many  administrators the plan is to cover, which has to be greater than zero. Exactly one pair is accepted; yearly  and wallet products are refused with 400, and wallet services are bought through  `PUT api/2.0/portal/payment/updatewallet` instead.
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
    PaymentUrlRequestDto paymentUrlRequestDto = (PaymentUrlRequestDto) o;
    return Objects.equals(this.backUrl, paymentUrlRequestDto.backUrl) &&
        Objects.equals(this.successUrl, paymentUrlRequestDto.successUrl) &&
        Objects.equals(this.quantity, paymentUrlRequestDto.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backUrl, successUrl, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentUrlRequestDto {\n");
    sb.append("    backUrl: ").append(toIndentedString(backUrl)).append("\n");
    sb.append("    successUrl: ").append(toIndentedString(successUrl)).append("\n");
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

    // add `backUrl` to the URL query string
    if (getBackUrl() != null) {
      try {
        joiner.add(String.format("%sbackUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBackUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `successUrl` to the URL query string
    if (getSuccessUrl() != null) {
      try {
        joiner.add(String.format("%ssuccessUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSuccessUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

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

