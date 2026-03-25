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
 * SetupCode
 */
@JsonPropertyOrder({
  SetupCode.JSON_PROPERTY_ACCOUNT,
  SetupCode.JSON_PROPERTY_MANUAL_ENTRY_KEY,
  SetupCode.JSON_PROPERTY_QR_CODE_SETUP_IMAGE_URL
})

public class SetupCode {
  public static final String JSON_PROPERTY_ACCOUNT = "account";
  @javax.annotation.Nullable  private JsonNullable<String> account = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MANUAL_ENTRY_KEY = "manualEntryKey";
  @javax.annotation.Nullable  private JsonNullable<String> manualEntryKey = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_QR_CODE_SETUP_IMAGE_URL = "qrCodeSetupImageUrl";
  @javax.annotation.Nullable  private JsonNullable<String> qrCodeSetupImageUrl = JsonNullable.<String>undefined();

  public SetupCode() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public SetupCode(
    @JsonProperty(JSON_PROPERTY_ACCOUNT) String account, 
    @JsonProperty(JSON_PROPERTY_MANUAL_ENTRY_KEY) String manualEntryKey, 
    @JsonProperty(JSON_PROPERTY_QR_CODE_SETUP_IMAGE_URL) String qrCodeSetupImageUrl
  ) {
    this();
    this.account = account == null ? JsonNullable.<String>undefined() : JsonNullable.of(account);
    this.manualEntryKey = manualEntryKey == null ? JsonNullable.<String>undefined() : JsonNullable.of(manualEntryKey);
    this.qrCodeSetupImageUrl = qrCodeSetupImageUrl == null ? JsonNullable.<String>undefined() : JsonNullable.of(qrCodeSetupImageUrl);
  }


  /**
   * Get account
   * @return account
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getAccount() {
    
    if (account == null) {
      account = JsonNullable.<String>undefined();
    }
    return account.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ACCOUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getAccount_JsonNullable() {
    return account;
  }
  
  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  private void setAccount_JsonNullable(JsonNullable<String> account) {
    this.account = account;
  }


  /**
   * Get manualEntryKey
   * @return manualEntryKey
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getManualEntryKey() {
    
    if (manualEntryKey == null) {
      manualEntryKey = JsonNullable.<String>undefined();
    }
    return manualEntryKey.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_MANUAL_ENTRY_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getManualEntryKey_JsonNullable() {
    return manualEntryKey;
  }
  
  @JsonProperty(JSON_PROPERTY_MANUAL_ENTRY_KEY)
  private void setManualEntryKey_JsonNullable(JsonNullable<String> manualEntryKey) {
    this.manualEntryKey = manualEntryKey;
  }


  /**
   * Get qrCodeSetupImageUrl
   * @return qrCodeSetupImageUrl
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getQrCodeSetupImageUrl() {
    
    if (qrCodeSetupImageUrl == null) {
      qrCodeSetupImageUrl = JsonNullable.<String>undefined();
    }
    return qrCodeSetupImageUrl.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_QR_CODE_SETUP_IMAGE_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getQrCodeSetupImageUrl_JsonNullable() {
    return qrCodeSetupImageUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_QR_CODE_SETUP_IMAGE_URL)
  private void setQrCodeSetupImageUrl_JsonNullable(JsonNullable<String> qrCodeSetupImageUrl) {
    this.qrCodeSetupImageUrl = qrCodeSetupImageUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetupCode setupCode = (SetupCode) o;
    return equalsNullable(this.account, setupCode.account) &&
        equalsNullable(this.manualEntryKey, setupCode.manualEntryKey) &&
        equalsNullable(this.qrCodeSetupImageUrl, setupCode.qrCodeSetupImageUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(account), hashCodeNullable(manualEntryKey), hashCodeNullable(qrCodeSetupImageUrl));
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
    sb.append("class SetupCode {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    manualEntryKey: ").append(toIndentedString(manualEntryKey)).append("\n");
    sb.append("    qrCodeSetupImageUrl: ").append(toIndentedString(qrCodeSetupImageUrl)).append("\n");
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

    // add `account` to the URL query string
    if (getAccount() != null) {
      try {
        joiner.add(String.format("%saccount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAccount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `manualEntryKey` to the URL query string
    if (getManualEntryKey() != null) {
      try {
        joiner.add(String.format("%smanualEntryKey%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getManualEntryKey()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `qrCodeSetupImageUrl` to the URL query string
    if (getQrCodeSetupImageUrl() != null) {
      try {
        joiner.add(String.format("%sqrCodeSetupImageUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getQrCodeSetupImageUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

