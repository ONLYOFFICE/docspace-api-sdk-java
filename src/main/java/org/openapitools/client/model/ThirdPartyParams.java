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
import org.openapitools.client.model.AuthData;
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
 * The third-party account parameters.
 */
@JsonPropertyOrder({
  ThirdPartyParams.JSON_PROPERTY_AUTH_DATA,
  ThirdPartyParams.JSON_PROPERTY_CORPORATE,
  ThirdPartyParams.JSON_PROPERTY_ROOMS_STORAGE,
  ThirdPartyParams.JSON_PROPERTY_CUSTOMER_TITLE,
  ThirdPartyParams.JSON_PROPERTY_PROVIDER_ID,
  ThirdPartyParams.JSON_PROPERTY_PROVIDER_KEY
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class ThirdPartyParams {
  public static final String JSON_PROPERTY_AUTH_DATA = "auth_data";
  @javax.annotation.Nullable
  private AuthData authData;

  public static final String JSON_PROPERTY_CORPORATE = "corporate";
  @javax.annotation.Nullable
  private Boolean corporate;

  public static final String JSON_PROPERTY_ROOMS_STORAGE = "roomsStorage";
  @javax.annotation.Nullable
  private Boolean roomsStorage;

  public static final String JSON_PROPERTY_CUSTOMER_TITLE = "customer_title";
  @javax.annotation.Nullable
  private JsonNullable<String> customerTitle = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PROVIDER_ID = "provider_id";
  @javax.annotation.Nullable
  private JsonNullable<Integer> providerId = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_PROVIDER_KEY = "provider_key";
  @javax.annotation.Nullable
  private JsonNullable<String> providerKey = JsonNullable.<String>undefined();

  public ThirdPartyParams() {
  }

  public ThirdPartyParams authData(@javax.annotation.Nullable AuthData authData) {
    
    this.authData = authData;
    return this;
  }

  /**
   * Get authData
   * @return authData
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTH_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AuthData getAuthData() {
    return authData;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthData(@javax.annotation.Nullable AuthData authData) {
    this.authData = authData;
  }

  public ThirdPartyParams corporate(@javax.annotation.Nullable Boolean corporate) {
    
    this.corporate = corporate;
    return this;
  }

  /**
   * Specifies if this is a corporate account or not.
   * @return corporate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CORPORATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCorporate() {
    return corporate;
  }


  @JsonProperty(JSON_PROPERTY_CORPORATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCorporate(@javax.annotation.Nullable Boolean corporate) {
    this.corporate = corporate;
  }

  public ThirdPartyParams roomsStorage(@javax.annotation.Nullable Boolean roomsStorage) {
    
    this.roomsStorage = roomsStorage;
    return this;
  }

  /**
   * Specifies if this is a room storage or not.
   * @return roomsStorage
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROOMS_STORAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRoomsStorage() {
    return roomsStorage;
  }


  @JsonProperty(JSON_PROPERTY_ROOMS_STORAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoomsStorage(@javax.annotation.Nullable Boolean roomsStorage) {
    this.roomsStorage = roomsStorage;
  }

  public ThirdPartyParams customerTitle(@javax.annotation.Nullable String customerTitle) {
    this.customerTitle = JsonNullable.<String>of(customerTitle);
    
    return this;
  }

  /**
   * The customer title.
   * @return customerTitle
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCustomerTitle() {
        return customerTitle.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CUSTOMER_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCustomerTitle_JsonNullable() {
    return customerTitle;
  }
  
  @JsonProperty(JSON_PROPERTY_CUSTOMER_TITLE)
  public void setCustomerTitle_JsonNullable(JsonNullable<String> customerTitle) {
    this.customerTitle = customerTitle;
  }

  public void setCustomerTitle(@javax.annotation.Nullable String customerTitle) {
    this.customerTitle = JsonNullable.<String>of(customerTitle);
  }

  public ThirdPartyParams providerId(@javax.annotation.Nullable Integer providerId) {
    this.providerId = JsonNullable.<Integer>of(providerId);
    
    return this;
  }

  /**
   * The provider ID.
   * @return providerId
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Integer getProviderId() {
        return providerId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROVIDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getProviderId_JsonNullable() {
    return providerId;
  }
  
  @JsonProperty(JSON_PROPERTY_PROVIDER_ID)
  public void setProviderId_JsonNullable(JsonNullable<Integer> providerId) {
    this.providerId = providerId;
  }

  public void setProviderId(@javax.annotation.Nullable Integer providerId) {
    this.providerId = JsonNullable.<Integer>of(providerId);
  }

  public ThirdPartyParams providerKey(@javax.annotation.Nullable String providerKey) {
    this.providerKey = JsonNullable.<String>of(providerKey);
    
    return this;
  }

  /**
   * The provider key.
   * @return providerKey
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getProviderKey() {
        return providerKey.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROVIDER_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getProviderKey_JsonNullable() {
    return providerKey;
  }
  
  @JsonProperty(JSON_PROPERTY_PROVIDER_KEY)
  public void setProviderKey_JsonNullable(JsonNullable<String> providerKey) {
    this.providerKey = providerKey;
  }

  public void setProviderKey(@javax.annotation.Nullable String providerKey) {
    this.providerKey = JsonNullable.<String>of(providerKey);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThirdPartyParams thirdPartyParams = (ThirdPartyParams) o;
    return Objects.equals(this.authData, thirdPartyParams.authData) &&
        Objects.equals(this.corporate, thirdPartyParams.corporate) &&
        Objects.equals(this.roomsStorage, thirdPartyParams.roomsStorage) &&
        equalsNullable(this.customerTitle, thirdPartyParams.customerTitle) &&
        equalsNullable(this.providerId, thirdPartyParams.providerId) &&
        equalsNullable(this.providerKey, thirdPartyParams.providerKey);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(authData, corporate, roomsStorage, hashCodeNullable(customerTitle), hashCodeNullable(providerId), hashCodeNullable(providerKey));
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
    sb.append("class ThirdPartyParams {\n");
    sb.append("    authData: ").append(toIndentedString(authData)).append("\n");
    sb.append("    corporate: ").append(toIndentedString(corporate)).append("\n");
    sb.append("    roomsStorage: ").append(toIndentedString(roomsStorage)).append("\n");
    sb.append("    customerTitle: ").append(toIndentedString(customerTitle)).append("\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    providerKey: ").append(toIndentedString(providerKey)).append("\n");
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

    // add `auth_data` to the URL query string
    if (getAuthData() != null) {
      joiner.add(getAuthData().toUrlQueryString(prefix + "auth_data" + suffix));
    }

    // add `corporate` to the URL query string
    if (getCorporate() != null) {
      try {
        joiner.add(String.format("%scorporate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCorporate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `roomsStorage` to the URL query string
    if (getRoomsStorage() != null) {
      try {
        joiner.add(String.format("%sroomsStorage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRoomsStorage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `customer_title` to the URL query string
    if (getCustomerTitle() != null) {
      try {
        joiner.add(String.format("%scustomer_title%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCustomerTitle()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `provider_id` to the URL query string
    if (getProviderId() != null) {
      try {
        joiner.add(String.format("%sprovider_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProviderId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `provider_key` to the URL query string
    if (getProviderKey() != null) {
      try {
        joiner.add(String.format("%sprovider_key%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProviderKey()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

