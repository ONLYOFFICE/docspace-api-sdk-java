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
 * The third-party backup request parameters.
 */
@JsonPropertyOrder({
  ThirdPartyBackupRequestDto.JSON_PROPERTY_URL,
  ThirdPartyBackupRequestDto.JSON_PROPERTY_LOGIN,
  ThirdPartyBackupRequestDto.JSON_PROPERTY_PASSWORD,
  ThirdPartyBackupRequestDto.JSON_PROPERTY_TOKEN,
  ThirdPartyBackupRequestDto.JSON_PROPERTY_CUSTOMER_TITLE,
  ThirdPartyBackupRequestDto.JSON_PROPERTY_PROVIDER_KEY
})

public class ThirdPartyBackupRequestDto {
  public static final String JSON_PROPERTY_URL = "url";
  @javax.annotation.Nullable
  private JsonNullable<String> url = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LOGIN = "login";
  @javax.annotation.Nullable
  private JsonNullable<String> login = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PASSWORD = "password";
  @javax.annotation.Nullable
  private JsonNullable<String> password = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TOKEN = "token";
  @javax.annotation.Nullable
  private JsonNullable<String> token = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CUSTOMER_TITLE = "customerTitle";
  @javax.annotation.Nullable
  private JsonNullable<String> customerTitle = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PROVIDER_KEY = "providerKey";
  @javax.annotation.Nullable
  private JsonNullable<String> providerKey = JsonNullable.<String>undefined();

  public ThirdPartyBackupRequestDto() {
  }

  public ThirdPartyBackupRequestDto url(@javax.annotation.Nullable String url) {
    this.url = JsonNullable.<String>of(url);
    
    return this;
  }

  /**
   * The connection URL for the sharepoint.
   * @return url
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getUrl() {
        return url.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUrl_JsonNullable() {
    return url;
  }
  
  @JsonProperty(JSON_PROPERTY_URL)
  public void setUrl_JsonNullable(JsonNullable<String> url) {
    this.url = url;
  }

  public void setUrl(@javax.annotation.Nullable String url) {
    this.url = JsonNullable.<String>of(url);
  }

  public ThirdPartyBackupRequestDto login(@javax.annotation.Nullable String login) {
    this.login = JsonNullable.<String>of(login);
    
    return this;
  }

  /**
   * The login.
   * @return login
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getLogin() {
        return login.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLogin_JsonNullable() {
    return login;
  }
  
  @JsonProperty(JSON_PROPERTY_LOGIN)
  public void setLogin_JsonNullable(JsonNullable<String> login) {
    this.login = login;
  }

  public void setLogin(@javax.annotation.Nullable String login) {
    this.login = JsonNullable.<String>of(login);
  }

  public ThirdPartyBackupRequestDto password(@javax.annotation.Nullable String password) {
    this.password = JsonNullable.<String>of(password);
    
    return this;
  }

  /**
   * The password.
   * @return password
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPassword() {
        return password.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPassword_JsonNullable() {
    return password;
  }
  
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  public void setPassword_JsonNullable(JsonNullable<String> password) {
    this.password = password;
  }

  public void setPassword(@javax.annotation.Nullable String password) {
    this.password = JsonNullable.<String>of(password);
  }

  public ThirdPartyBackupRequestDto token(@javax.annotation.Nullable String token) {
    this.token = JsonNullable.<String>of(token);
    
    return this;
  }

  /**
   * The authentication token.
   * @return token
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getToken() {
        return token.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getToken_JsonNullable() {
    return token;
  }
  
  @JsonProperty(JSON_PROPERTY_TOKEN)
  public void setToken_JsonNullable(JsonNullable<String> token) {
    this.token = token;
  }

  public void setToken(@javax.annotation.Nullable String token) {
    this.token = JsonNullable.<String>of(token);
  }

  public ThirdPartyBackupRequestDto customerTitle(@javax.annotation.Nullable String customerTitle) {
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

  public ThirdPartyBackupRequestDto providerKey(@javax.annotation.Nullable String providerKey) {
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
    ThirdPartyBackupRequestDto thirdPartyBackupRequestDto = (ThirdPartyBackupRequestDto) o;
    return equalsNullable(this.url, thirdPartyBackupRequestDto.url) &&
        equalsNullable(this.login, thirdPartyBackupRequestDto.login) &&
        equalsNullable(this.password, thirdPartyBackupRequestDto.password) &&
        equalsNullable(this.token, thirdPartyBackupRequestDto.token) &&
        equalsNullable(this.customerTitle, thirdPartyBackupRequestDto.customerTitle) &&
        equalsNullable(this.providerKey, thirdPartyBackupRequestDto.providerKey);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(url), hashCodeNullable(login), hashCodeNullable(password), hashCodeNullable(token), hashCodeNullable(customerTitle), hashCodeNullable(providerKey));
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
    sb.append("class ThirdPartyBackupRequestDto {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    customerTitle: ").append(toIndentedString(customerTitle)).append("\n");
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

    // add `url` to the URL query string
    if (getUrl() != null) {
      try {
        joiner.add(String.format("%surl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `login` to the URL query string
    if (getLogin() != null) {
      try {
        joiner.add(String.format("%slogin%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLogin()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `password` to the URL query string
    if (getPassword() != null) {
      try {
        joiner.add(String.format("%spassword%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPassword()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `token` to the URL query string
    if (getToken() != null) {
      try {
        joiner.add(String.format("%stoken%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getToken()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `customerTitle` to the URL query string
    if (getCustomerTitle() != null) {
      try {
        joiner.add(String.format("%scustomerTitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCustomerTitle()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `providerKey` to the URL query string
    if (getProviderKey() != null) {
      try {
        joiner.add(String.format("%sproviderKey%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProviderKey()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

