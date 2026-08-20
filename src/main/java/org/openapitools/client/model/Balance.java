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
import org.openapitools.client.model.SubAccount;
import org.openapitools.client.model.TransactionInfo;
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
  Balance.JSON_PROPERTY_SUB_ACCOUNT_NUMBER,
  Balance.JSON_PROPERTY_ACCOUNT_NAME,
  Balance.JSON_PROPERTY_ACCOUNT_CURRENCY,
  Balance.JSON_PROPERTY_SUB_ACCOUNTS,
  Balance.JSON_PROPERTY_LAST_CREDIT
})

public class Balance {
  public static final String JSON_PROPERTY_ACCOUNT_NUMBER = "accountNumber";
  @javax.annotation.Nullable  private Integer accountNumber;

  public static final String JSON_PROPERTY_SUB_ACCOUNT_NUMBER = "subAccountNumber";
  @javax.annotation.Nullable  private Integer subAccountNumber;

  public static final String JSON_PROPERTY_ACCOUNT_NAME = "accountName";
  @javax.annotation.Nullable  private JsonNullable<String> accountName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ACCOUNT_CURRENCY = "accountCurrency";
  @javax.annotation.Nullable  private JsonNullable<String> accountCurrency = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SUB_ACCOUNTS = "subAccounts";
  @javax.annotation.Nullable  private JsonNullable<List<SubAccount>> subAccounts = JsonNullable.<List<SubAccount>>undefined();

  public static final String JSON_PROPERTY_LAST_CREDIT = "lastCredit";
  @javax.annotation.Nullable  private TransactionInfo lastCredit;

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
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ACCOUNT_NUMBER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAccountNumber() {
    return accountNumber;
  }


  @JsonProperty(value = JSON_PROPERTY_ACCOUNT_NUMBER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountNumber(@javax.annotation.Nullable Integer accountNumber) {
    this.accountNumber = accountNumber;
  }

  public Balance subAccountNumber(@javax.annotation.Nullable Integer subAccountNumber) {
    
    this.subAccountNumber = subAccountNumber;
    return this;
  }

  /**
   * The sub-account number.
   * @return subAccountNumber
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SUB_ACCOUNT_NUMBER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSubAccountNumber() {
    return subAccountNumber;
  }


  @JsonProperty(value = JSON_PROPERTY_SUB_ACCOUNT_NUMBER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubAccountNumber(@javax.annotation.Nullable Integer subAccountNumber) {
    this.subAccountNumber = subAccountNumber;
  }

  public Balance accountName(@javax.annotation.Nullable String accountName) {
    this.accountName = JsonNullable.<String>of(accountName);
    
    return this;
  }

  /**
   * The account name.
   * @return accountName
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getAccountName() {
        return accountName.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ACCOUNT_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getAccountName_JsonNullable() {
    return accountName;
  }
  
  @JsonProperty(JSON_PROPERTY_ACCOUNT_NAME)
  public void setAccountName_JsonNullable(JsonNullable<String> accountName) {
    this.accountName = accountName;
  }

  public void setAccountName(@javax.annotation.Nullable String accountName) {
    this.accountName = JsonNullable.<String>of(accountName);
  }

  public Balance accountCurrency(@javax.annotation.Nullable String accountCurrency) {
    this.accountCurrency = JsonNullable.<String>of(accountCurrency);
    
    return this;
  }

  /**
   * The account currency.
   * @return accountCurrency
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getAccountCurrency() {
        return accountCurrency.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ACCOUNT_CURRENCY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getAccountCurrency_JsonNullable() {
    return accountCurrency;
  }
  
  @JsonProperty(JSON_PROPERTY_ACCOUNT_CURRENCY)
  public void setAccountCurrency_JsonNullable(JsonNullable<String> accountCurrency) {
    this.accountCurrency = accountCurrency;
  }

  public void setAccountCurrency(@javax.annotation.Nullable String accountCurrency) {
    this.accountCurrency = JsonNullable.<String>of(accountCurrency);
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
  @javax.annotation.Nullable  @JsonIgnore

  public List<SubAccount> getSubAccounts() {
        return subAccounts.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SUB_ACCOUNTS, required = false)
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

  public Balance lastCredit(@javax.annotation.Nullable TransactionInfo lastCredit) {
    
    this.lastCredit = lastCredit;
    return this;
  }

  /**
   * Get lastCredit
   * @return lastCredit
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_LAST_CREDIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransactionInfo getLastCredit() {
    return lastCredit;
  }


  @JsonProperty(value = JSON_PROPERTY_LAST_CREDIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastCredit(@javax.annotation.Nullable TransactionInfo lastCredit) {
    this.lastCredit = lastCredit;
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
        Objects.equals(this.subAccountNumber, balance.subAccountNumber) &&
        equalsNullable(this.accountName, balance.accountName) &&
        equalsNullable(this.accountCurrency, balance.accountCurrency) &&
        equalsNullable(this.subAccounts, balance.subAccounts) &&
        Objects.equals(this.lastCredit, balance.lastCredit);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, subAccountNumber, hashCodeNullable(accountName), hashCodeNullable(accountCurrency), hashCodeNullable(subAccounts), lastCredit);
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
    sb.append("    subAccountNumber: ").append(toIndentedString(subAccountNumber)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountCurrency: ").append(toIndentedString(accountCurrency)).append("\n");
    sb.append("    subAccounts: ").append(toIndentedString(subAccounts)).append("\n");
    sb.append("    lastCredit: ").append(toIndentedString(lastCredit)).append("\n");
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

    // add `subAccountNumber` to the URL query string
    if (getSubAccountNumber() != null) {
      try {
        joiner.add(String.format("%ssubAccountNumber%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSubAccountNumber()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `accountName` to the URL query string
    if (getAccountName() != null) {
      try {
        joiner.add(String.format("%saccountName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAccountName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `accountCurrency` to the URL query string
    if (getAccountCurrency() != null) {
      try {
        joiner.add(String.format("%saccountCurrency%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAccountCurrency()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `lastCredit` to the URL query string
    if (getLastCredit() != null) {
      joiner.add(getLastCredit().toUrlQueryString(prefix + "lastCredit" + suffix));
    }

    return joiner.toString();
  }

}

