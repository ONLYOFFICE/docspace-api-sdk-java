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
import java.net.URI;
import org.openapitools.client.model.OAuth20Token;
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
 * The authentication data.
 */
@JsonPropertyOrder({
  AuthData.JSON_PROPERTY_LOGIN,
  AuthData.JSON_PROPERTY_PASSWORD,
  AuthData.JSON_PROPERTY_RAW_TOKEN,
  AuthData.JSON_PROPERTY_URL,
  AuthData.JSON_PROPERTY_PROVIDER,
  AuthData.JSON_PROPERTY_TOKEN
})

public class AuthData {
  public static final String JSON_PROPERTY_LOGIN = "login";
  @javax.annotation.Nullable
  private JsonNullable<String> login = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PASSWORD = "password";
  @javax.annotation.Nullable
  private JsonNullable<String> password = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_RAW_TOKEN = "rawToken";
  @javax.annotation.Nullable
  private JsonNullable<String> rawToken = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_URL = "url";
  @javax.annotation.Nullable
  private JsonNullable<URI> url = JsonNullable.<URI>undefined();

  public static final String JSON_PROPERTY_PROVIDER = "provider";
  @javax.annotation.Nullable
  private JsonNullable<String> provider = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TOKEN = "token";
  @javax.annotation.Nullable
  private OAuth20Token token;

  public AuthData() {
  }

  public AuthData login(@javax.annotation.Nullable String login) {
    this.login = JsonNullable.<String>of(login);
    
    return this;
  }

  /**
   * The authentication login.
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

  public AuthData password(@javax.annotation.Nullable String password) {
    this.password = JsonNullable.<String>of(password);
    
    return this;
  }

  /**
   * The authentication password.
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

  public AuthData rawToken(@javax.annotation.Nullable String rawToken) {
    this.rawToken = JsonNullable.<String>of(rawToken);
    
    return this;
  }

  /**
   * The authentication raw token.
   * @return rawToken
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getRawToken() {
        return rawToken.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RAW_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getRawToken_JsonNullable() {
    return rawToken;
  }
  
  @JsonProperty(JSON_PROPERTY_RAW_TOKEN)
  public void setRawToken_JsonNullable(JsonNullable<String> rawToken) {
    this.rawToken = rawToken;
  }

  public void setRawToken(@javax.annotation.Nullable String rawToken) {
    this.rawToken = JsonNullable.<String>of(rawToken);
  }

  public AuthData url(@javax.annotation.Nullable URI url) {
    this.url = JsonNullable.<URI>of(url);
    
    return this;
  }

  /**
   * The authentication URL.
   * @return url
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public URI getUrl() {
        return url.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<URI> getUrl_JsonNullable() {
    return url;
  }
  
  @JsonProperty(JSON_PROPERTY_URL)
  public void setUrl_JsonNullable(JsonNullable<URI> url) {
    this.url = url;
  }

  public void setUrl(@javax.annotation.Nullable URI url) {
    this.url = JsonNullable.<URI>of(url);
  }

  public AuthData provider(@javax.annotation.Nullable String provider) {
    this.provider = JsonNullable.<String>of(provider);
    
    return this;
  }

  /**
   * The authentication provider.
   * @return provider
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getProvider() {
        return provider.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getProvider_JsonNullable() {
    return provider;
  }
  
  @JsonProperty(JSON_PROPERTY_PROVIDER)
  public void setProvider_JsonNullable(JsonNullable<String> provider) {
    this.provider = provider;
  }

  public void setProvider(@javax.annotation.Nullable String provider) {
    this.provider = JsonNullable.<String>of(provider);
  }

  public AuthData token(@javax.annotation.Nullable OAuth20Token token) {
    
    this.token = token;
    return this;
  }

  /**
   * Get token
   * @return token
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OAuth20Token getToken() {
    return token;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToken(@javax.annotation.Nullable OAuth20Token token) {
    this.token = token;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthData authData = (AuthData) o;
    return equalsNullable(this.login, authData.login) &&
        equalsNullable(this.password, authData.password) &&
        equalsNullable(this.rawToken, authData.rawToken) &&
        equalsNullable(this.url, authData.url) &&
        equalsNullable(this.provider, authData.provider) &&
        Objects.equals(this.token, authData.token);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(login), hashCodeNullable(password), hashCodeNullable(rawToken), hashCodeNullable(url), hashCodeNullable(provider), token);
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
    sb.append("class AuthData {\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    rawToken: ").append(toIndentedString(rawToken)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

    // add `rawToken` to the URL query string
    if (getRawToken() != null) {
      try {
        joiner.add(String.format("%srawToken%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRawToken()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `url` to the URL query string
    if (getUrl() != null) {
      try {
        joiner.add(String.format("%surl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `provider` to the URL query string
    if (getProvider() != null) {
      try {
        joiner.add(String.format("%sprovider%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProvider()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `token` to the URL query string
    if (getToken() != null) {
      joiner.add(getToken().toUrlQueryString(prefix + "token" + suffix));
    }

    return joiner.toString();
  }

}

