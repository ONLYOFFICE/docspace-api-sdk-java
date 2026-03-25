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
 * The quota parameters.  &lt;example&gt;  {    id: 1,    quantity: 50,    wallet: false,    dueDate: 2026-03-31T00:00:00Z,    nextQuantity: 100,    state: Active  }  &lt;/example&gt;
 */
@JsonPropertyOrder({
  Quota.JSON_PROPERTY_ID,
  Quota.JSON_PROPERTY_QUANTITY,
  Quota.JSON_PROPERTY_WALLET,
  Quota.JSON_PROPERTY_DUE_DATE,
  Quota.JSON_PROPERTY_NEXT_QUANTITY,
  Quota.JSON_PROPERTY_STATE
})

public class Quota {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable  private Integer id;

  public static final String JSON_PROPERTY_QUANTITY = "quantity";
  @javax.annotation.Nullable  private Integer quantity;

  public static final String JSON_PROPERTY_WALLET = "wallet";
  @javax.annotation.Nullable  private Boolean wallet;

  public static final String JSON_PROPERTY_DUE_DATE = "dueDate";
  @javax.annotation.Nullable  private JsonNullable<OffsetDateTime> dueDate = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_NEXT_QUANTITY = "nextQuantity";
  @javax.annotation.Nullable  private JsonNullable<Integer> nextQuantity = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nullable  private QuotaState state;

  public Quota() {
  }


  public Quota id(@javax.annotation.Nullable Integer id) {
    
    this.id = id;
    return this;
  }

  /**
   * The quota ID.
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

  public Quota quantity(@javax.annotation.Nullable Integer quantity) {
    
    this.quantity = quantity;
    return this;
  }

  /**
   * The quota quantity.
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

  public Quota wallet(@javax.annotation.Nullable Boolean wallet) {
    
    this.wallet = wallet;
    return this;
  }

  /**
   * The quota applies to the wallet or not
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

  public Quota dueDate(@javax.annotation.Nullable OffsetDateTime dueDate) {
    this.dueDate = JsonNullable.<OffsetDateTime>of(dueDate);
    
    return this;
  }

  /**
   * The quota due date.
   * @return dueDate
   */
  @javax.annotation.Nullable  @JsonIgnore

  public OffsetDateTime getDueDate() {
        return dueDate.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_DUE_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getDueDate_JsonNullable() {
    return dueDate;
  }
  
  @JsonProperty(JSON_PROPERTY_DUE_DATE)
  public void setDueDate_JsonNullable(JsonNullable<OffsetDateTime> dueDate) {
    this.dueDate = dueDate;
  }

  public void setDueDate(@javax.annotation.Nullable OffsetDateTime dueDate) {
    this.dueDate = JsonNullable.<OffsetDateTime>of(dueDate);
  }

  public Quota nextQuantity(@javax.annotation.Nullable Integer nextQuantity) {
    this.nextQuantity = JsonNullable.<Integer>of(nextQuantity);
    
    return this;
  }

  /**
   * The quota next quantity.
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

  public Quota state(@javax.annotation.Nullable QuotaState state) {
    
    this.state = state;
    return this;
  }

  /**
   * Get state
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
    Quota quota = (Quota) o;
    return Objects.equals(this.id, quota.id) &&
        Objects.equals(this.quantity, quota.quantity) &&
        Objects.equals(this.wallet, quota.wallet) &&
        equalsNullable(this.dueDate, quota.dueDate) &&
        equalsNullable(this.nextQuantity, quota.nextQuantity) &&
        Objects.equals(this.state, quota.state);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, quantity, wallet, hashCodeNullable(dueDate), hashCodeNullable(nextQuantity), state);
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
    sb.append("class Quota {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    wallet: ").append(toIndentedString(wallet)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    nextQuantity: ").append(toIndentedString(nextQuantity)).append("\n");
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

    // add `dueDate` to the URL query string
    if (getDueDate() != null) {
      try {
        joiner.add(String.format("%sdueDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDueDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
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

