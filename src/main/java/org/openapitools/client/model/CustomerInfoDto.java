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
import org.openapitools.client.model.EmployeeDto;
import org.openapitools.client.model.PaymentMethodStatus;
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
 * The customer information.
 */
@JsonPropertyOrder({
  CustomerInfoDto.JSON_PROPERTY_PORTAL_ID,
  CustomerInfoDto.JSON_PROPERTY_PAYMENT_METHOD_STATUS,
  CustomerInfoDto.JSON_PROPERTY_EMAIL,
  CustomerInfoDto.JSON_PROPERTY_PAYER
})

public class CustomerInfoDto {
  public static final String JSON_PROPERTY_PORTAL_ID = "portalId";
  @javax.annotation.Nullable  private JsonNullable<String> portalId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PAYMENT_METHOD_STATUS = "paymentMethodStatus";
  @javax.annotation.Nullable  private PaymentMethodStatus paymentMethodStatus;

  public static final String JSON_PROPERTY_EMAIL = "email";
  @javax.annotation.Nullable  private JsonNullable<String> email = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PAYER = "payer";
  @javax.annotation.Nullable  private EmployeeDto payer;

  public CustomerInfoDto() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public CustomerInfoDto(
    @JsonProperty(JSON_PROPERTY_PORTAL_ID) String portalId, 
    @JsonProperty(JSON_PROPERTY_EMAIL) String email
  ) {
    this();
    this.portalId = portalId == null ? JsonNullable.<String>undefined() : JsonNullable.of(portalId);
    this.email = email == null ? JsonNullable.<String>undefined() : JsonNullable.of(email);
  }


  /**
   * The portal ID.
   * @return portalId
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getPortalId() {
    
    if (portalId == null) {
      portalId = JsonNullable.<String>undefined();
    }
    return portalId.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_PORTAL_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getPortalId_JsonNullable() {
    return portalId;
  }
  
  @JsonProperty(JSON_PROPERTY_PORTAL_ID)
  private void setPortalId_JsonNullable(JsonNullable<String> portalId) {
    this.portalId = portalId;
  }


  public CustomerInfoDto paymentMethodStatus(@javax.annotation.Nullable PaymentMethodStatus paymentMethodStatus) {
    
    this.paymentMethodStatus = paymentMethodStatus;
    return this;
  }

  /**
   * Get paymentMethodStatus
   * @return paymentMethodStatus
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PAYMENT_METHOD_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentMethodStatus getPaymentMethodStatus() {
    return paymentMethodStatus;
  }


  @JsonProperty(value = JSON_PROPERTY_PAYMENT_METHOD_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentMethodStatus(@javax.annotation.Nullable PaymentMethodStatus paymentMethodStatus) {
    this.paymentMethodStatus = paymentMethodStatus;
  }

  /**
   * The customer email address.
   * @return email
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getEmail() {
    
    if (email == null) {
      email = JsonNullable.<String>undefined();
    }
    return email.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_EMAIL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getEmail_JsonNullable() {
    return email;
  }
  
  @JsonProperty(JSON_PROPERTY_EMAIL)
  private void setEmail_JsonNullable(JsonNullable<String> email) {
    this.email = email;
  }


  public CustomerInfoDto payer(@javax.annotation.Nullable EmployeeDto payer) {
    
    this.payer = payer;
    return this;
  }

  /**
   * Get payer
   * @return payer
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PAYER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EmployeeDto getPayer() {
    return payer;
  }


  @JsonProperty(value = JSON_PROPERTY_PAYER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayer(@javax.annotation.Nullable EmployeeDto payer) {
    this.payer = payer;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerInfoDto customerInfoDto = (CustomerInfoDto) o;
    return equalsNullable(this.portalId, customerInfoDto.portalId) &&
        Objects.equals(this.paymentMethodStatus, customerInfoDto.paymentMethodStatus) &&
        equalsNullable(this.email, customerInfoDto.email) &&
        Objects.equals(this.payer, customerInfoDto.payer);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(portalId), paymentMethodStatus, hashCodeNullable(email), payer);
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
    sb.append("class CustomerInfoDto {\n");
    sb.append("    portalId: ").append(toIndentedString(portalId)).append("\n");
    sb.append("    paymentMethodStatus: ").append(toIndentedString(paymentMethodStatus)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    payer: ").append(toIndentedString(payer)).append("\n");
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

    // add `portalId` to the URL query string
    if (getPortalId() != null) {
      try {
        joiner.add(String.format("%sportalId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPortalId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `paymentMethodStatus` to the URL query string
    if (getPaymentMethodStatus() != null) {
      try {
        joiner.add(String.format("%spaymentMethodStatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPaymentMethodStatus()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `email` to the URL query string
    if (getEmail() != null) {
      try {
        joiner.add(String.format("%semail%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmail()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `payer` to the URL query string
    if (getPayer() != null) {
      joiner.add(getPayer().toUrlQueryString(prefix + "payer" + suffix));
    }

    return joiner.toString();
  }

}

