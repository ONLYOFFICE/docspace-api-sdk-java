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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.SubAccount;
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
 * Represents a balance with an account number and a list of sub-accounts.
 */
@JsonPropertyOrder({
  Balance.JSON_PROPERTY_ACCOUNT_NUMBER,
  Balance.JSON_PROPERTY_SUB_ACCOUNTS
})

public class Balance {
  public static final String JSON_PROPERTY_ACCOUNT_NUMBER = "accountNumber";
  @javax.annotation.Nullable
  private Integer accountNumber;

  public static final String JSON_PROPERTY_SUB_ACCOUNTS = "subAccounts";
  @javax.annotation.Nullable
  private JsonNullable<List<SubAccount>> subAccounts = JsonNullable.<List<SubAccount>>undefined();

  public Balance() {
  }


  public Balance accountNumber(@javax.annotation.Nullable Integer accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * The account number.
   * @return accountNumber
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAccountNumber() {
    return accountNumber;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountNumber(@javax.annotation.Nullable Integer accountNumber) {
    this.accountNumber = accountNumber;
  }

  public Balance subAccounts(@javax.annotation.Nullable List<SubAccount> subAccounts) {
    this.subAccounts = JsonNullable.<List<SubAccount>>of(subAccounts);
    
    return this;
  }

  public Balance addSubAccountsItem(SubAccount subAccountsItem) {
    if (this.subAccounts == null || !this.subAccounts.isPresent()) {
      this.subAccounts = JsonNullable.<List<SubAccount>>of(new ArrayList<>());
    }
    try {
      this.subAccounts.get().add(subAccountsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * A list of sub-accounts.
   * @return subAccounts
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<SubAccount> getSubAccounts() {
        return subAccounts.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUB_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<SubAccount>> getSubAccounts_JsonNullable() {
    return subAccounts;
  }
  
  @JsonProperty(JSON_PROPERTY_SUB_ACCOUNTS)
  public void setSubAccounts_JsonNullable(JsonNullable<List<SubAccount>> subAccounts) {
    this.subAccounts = subAccounts;
  }

  public void setSubAccounts(@javax.annotation.Nullable List<SubAccount> subAccounts) {
    this.subAccounts = JsonNullable.<List<SubAccount>>of(subAccounts);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Balance balance = (Balance) o;
    return Objects.equals(this.accountNumber, balance.accountNumber) &&
        equalsNullable(this.subAccounts, balance.subAccounts);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, hashCodeNullable(subAccounts));
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
    sb.append("class Balance {\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    subAccounts: ").append(toIndentedString(subAccounts)).append("\n");
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

    // add `accountNumber` to the URL query string
    if (getAccountNumber() != null) {
      try {
        joiner.add(String.format("%saccountNumber%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAccountNumber()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `subAccounts` to the URL query string
    if (getSubAccounts() != null) {
      for (int i = 0; i < getSubAccounts().size(); i++) {
        if (getSubAccounts().get(i) != null) {
          joiner.add(getSubAccounts().get(i).toUrlQueryString(String.format("%ssubAccounts%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

