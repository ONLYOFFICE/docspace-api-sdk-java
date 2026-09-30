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
import org.openapitools.client.model.ApiDateTime;
import org.openapitools.client.model.QuotaState;
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
 * One quota the subscription is made of - the plan itself or an add-on - with its quantity and its own deadline.
 */
@JsonPropertyOrder({
  TariffQuotaDto.JSON_PROPERTY_ID,
  TariffQuotaDto.JSON_PROPERTY_QUANTITY,
  TariffQuotaDto.JSON_PROPERTY_WALLET,
  TariffQuotaDto.JSON_PROPERTY_ADDITIONAL,
  TariffQuotaDto.JSON_PROPERTY_DUE_DATE,
  TariffQuotaDto.JSON_PROPERTY_NEXT_QUANTITY,
  TariffQuotaDto.JSON_PROPERTY_NEXT_QUOTA,
  TariffQuotaDto.JSON_PROPERTY_STATE
})

public class TariffQuotaDto {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable  private Integer id;

  public static final String JSON_PROPERTY_QUANTITY = "quantity";
  @javax.annotation.Nullable  private Integer quantity;

  public static final String JSON_PROPERTY_WALLET = "wallet";
  @javax.annotation.Nullable  private Boolean wallet;

  public static final String JSON_PROPERTY_ADDITIONAL = "additional";
  @javax.annotation.Nullable  private Boolean additional;

  public static final String JSON_PROPERTY_DUE_DATE = "dueDate";
  @javax.annotation.Nullable  private ApiDateTime dueDate;

  public static final String JSON_PROPERTY_NEXT_QUANTITY = "nextQuantity";
  @javax.annotation.Nullable  private JsonNullable<Integer> nextQuantity = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_NEXT_QUOTA = "nextQuota";
  @javax.annotation.Nullable  private JsonNullable<Integer> nextQuota = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nullable  private QuotaState state;

  public TariffQuotaDto() {
  }


  public TariffQuotaDto id(@javax.annotation.Nullable Integer id) {
    
    this.id = id;
    return this;
  }

  /**
   * The quota this entry stands for. `GET api/2.0/portal/payment/quotas` describes the quota behind the ID,  including what its `quantity` counts; a negative ID belongs to a built-in quota rather than a purchased  one.
   * @return id
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable Integer id) {
    this.id = id;
  }

  public TariffQuotaDto quantity(@javax.annotation.Nullable Integer quantity) {
    
    this.quantity = quantity;
    return this;
  }

  /**
   * How much of the quota the portal holds, in whatever the quota itself is measured in - seats for a plan,  gigabytes for storage. It is `1` for a quota that is simply on or off.
   * @return quantity
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_QUANTITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getQuantity() {
    return quantity;
  }


  @JsonProperty(value = JSON_PROPERTY_QUANTITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuantity(@javax.annotation.Nullable Integer quantity) {
    this.quantity = quantity;
  }

  public TariffQuotaDto wallet(@javax.annotation.Nullable Boolean wallet) {
    
    this.wallet = wallet;
    return this;
  }

  /**
   * Whether the quota is paid for out of the portal wallet as it is consumed, rather than being part of the  subscription charged per period.
   * @return wallet
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_WALLET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getWallet() {
    return wallet;
  }


  @JsonProperty(value = JSON_PROPERTY_WALLET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWallet(@javax.annotation.Nullable Boolean wallet) {
    this.wallet = wallet;
  }

  public TariffQuotaDto additional(@javax.annotation.Nullable Boolean additional) {
    
    this.additional = additional;
    return this;
  }

  /**
   * Whether this is an add-on bought on top of the plan rather than the plan itself. Exactly one entry of  `quotas` is the plan, and the rest are add-ons.
   * @return additional
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ADDITIONAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAdditional() {
    return additional;
  }


  @JsonProperty(value = JSON_PROPERTY_ADDITIONAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditional(@javax.annotation.Nullable Boolean additional) {
    this.additional = additional;
  }

  public TariffQuotaDto dueDate(@javax.annotation.Nullable ApiDateTime dueDate) {
    
    this.dueDate = dueDate;
    return this;
  }

  /**
   * When this quota runs out, in the portal time zone. An add-on can end earlier or later than the  subscription; a quota with no deadline of its own reports the subscription's `dueDate` instead of an empty  value.
   * @return dueDate
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DUE_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDateTime getDueDate() {
    return dueDate;
  }


  @JsonProperty(value = JSON_PROPERTY_DUE_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDueDate(@javax.annotation.Nullable ApiDateTime dueDate) {
    this.dueDate = dueDate;
  }

  public TariffQuotaDto nextQuantity(@javax.annotation.Nullable Integer nextQuantity) {
    this.nextQuantity = JsonNullable.<Integer>of(nextQuantity);
    
    return this;
  }

  /**
   * The quantity the next period is going to be charged for, when a change has been scheduled. It is empty  while `quantity` simply carries over.
   * @return nextQuantity
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Integer getNextQuantity() {
        return nextQuantity.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_NEXT_QUANTITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Integer> getNextQuantity_JsonNullable() {
    return nextQuantity;
  }
  
  @JsonProperty(JSON_PROPERTY_NEXT_QUANTITY)
  public void setNextQuantity_JsonNullable(JsonNullable<Integer> nextQuantity) {
    this.nextQuantity = nextQuantity;
  }

  public void setNextQuantity(@javax.annotation.Nullable Integer nextQuantity) {
    this.nextQuantity = JsonNullable.<Integer>of(nextQuantity);
  }

  public TariffQuotaDto nextQuota(@javax.annotation.Nullable Integer nextQuota) {
    this.nextQuota = JsonNullable.<Integer>of(nextQuota);
    
    return this;
  }

  /**
   * The quota this one is scheduled to be replaced by at the start of the next period, empty when no such  switch is planned. `GET api/2.0/portal/tariff/upcoming` already reports the charge for the replacement.
   * @return nextQuota
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Integer getNextQuota() {
        return nextQuota.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_NEXT_QUOTA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Integer> getNextQuota_JsonNullable() {
    return nextQuota;
  }
  
  @JsonProperty(JSON_PROPERTY_NEXT_QUOTA)
  public void setNextQuota_JsonNullable(JsonNullable<Integer> nextQuota) {
    this.nextQuota = nextQuota;
  }

  public void setNextQuota(@javax.annotation.Nullable Integer nextQuota) {
    this.nextQuota = JsonNullable.<Integer>of(nextQuota);
  }

  public TariffQuotaDto state(@javax.annotation.Nullable QuotaState state) {
    
    this.state = state;
    return this;
  }

  /**
   * Whether the quota is still running or its deadline has passed. It is empty for a quota that has no  deadline of its own, which means it lasts as long as the subscription does.
   * @return state
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_STATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public QuotaState getState() {
    return state;
  }


  @JsonProperty(value = JSON_PROPERTY_STATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(@javax.annotation.Nullable QuotaState state) {
    this.state = state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TariffQuotaDto tariffQuotaDto = (TariffQuotaDto) o;
    return Objects.equals(this.id, tariffQuotaDto.id) &&
        Objects.equals(this.quantity, tariffQuotaDto.quantity) &&
        Objects.equals(this.wallet, tariffQuotaDto.wallet) &&
        Objects.equals(this.additional, tariffQuotaDto.additional) &&
        Objects.equals(this.dueDate, tariffQuotaDto.dueDate) &&
        equalsNullable(this.nextQuantity, tariffQuotaDto.nextQuantity) &&
        equalsNullable(this.nextQuota, tariffQuotaDto.nextQuota) &&
        Objects.equals(this.state, tariffQuotaDto.state);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, quantity, wallet, additional, dueDate, hashCodeNullable(nextQuantity), hashCodeNullable(nextQuota), state);
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
    sb.append("class TariffQuotaDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    wallet: ").append(toIndentedString(wallet)).append("\n");
    sb.append("    additional: ").append(toIndentedString(additional)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    nextQuantity: ").append(toIndentedString(nextQuantity)).append("\n");
    sb.append("    nextQuota: ").append(toIndentedString(nextQuota)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `quantity` to the URL query string
    if (getQuantity() != null) {
      try {
        joiner.add(String.format("%squantity%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getQuantity()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `wallet` to the URL query string
    if (getWallet() != null) {
      try {
        joiner.add(String.format("%swallet%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWallet()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `additional` to the URL query string
    if (getAdditional() != null) {
      try {
        joiner.add(String.format("%sadditional%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAdditional()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `dueDate` to the URL query string
    if (getDueDate() != null) {
      joiner.add(getDueDate().toUrlQueryString(prefix + "dueDate" + suffix));
    }

    // add `nextQuantity` to the URL query string
    if (getNextQuantity() != null) {
      try {
        joiner.add(String.format("%snextQuantity%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNextQuantity()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `nextQuota` to the URL query string
    if (getNextQuota() != null) {
      try {
        joiner.add(String.format("%snextQuota%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNextQuota()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `state` to the URL query string
    if (getState() != null) {
      try {
        joiner.add(String.format("%sstate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getState()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

