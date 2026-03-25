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
 * The provider information.
 */
@JsonPropertyOrder({
  ProviderDto.JSON_PROPERTY_NAME,
  ProviderDto.JSON_PROPERTY_KEY,
  ProviderDto.JSON_PROPERTY_CONNECTED,
  ProviderDto.JSON_PROPERTY_OAUTH,
  ProviderDto.JSON_PROPERTY_REDIRECT_URL,
  ProviderDto.JSON_PROPERTY_REQUIRED_CONNECTION_URL,
  ProviderDto.JSON_PROPERTY_CLIENT_ID
})

public class ProviderDto {
  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_KEY = "key";
  @javax.annotation.Nullable  private JsonNullable<String> key = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CONNECTED = "connected";
  @javax.annotation.Nullable  private Boolean connected;

  public static final String JSON_PROPERTY_OAUTH = "oauth";
  @javax.annotation.Nullable  private Boolean oauth;

  public static final String JSON_PROPERTY_REDIRECT_URL = "redirectUrl";
  @javax.annotation.Nullable  private JsonNullable<String> redirectUrl = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_REQUIRED_CONNECTION_URL = "requiredConnectionUrl";
  @javax.annotation.Nullable  private Boolean requiredConnectionUrl;

  public static final String JSON_PROPERTY_CLIENT_ID = "clientId";
  @javax.annotation.Nullable  private JsonNullable<String> clientId = JsonNullable.<String>undefined();

  public ProviderDto() {
  }


  public ProviderDto name(@javax.annotation.Nullable String name) {
    this.name = JsonNullable.<String>of(name);
    
    return this;
  }

  /**
   * The provider name.
   * @return name
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = JsonNullable.<String>of(name);
  }

  public ProviderDto key(@javax.annotation.Nullable String key) {
    this.key = JsonNullable.<String>of(key);
    
    return this;
  }

  /**
   * The provider key.
   * @return key
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getKey() {
        return key.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getKey_JsonNullable() {
    return key;
  }
  
  @JsonProperty(JSON_PROPERTY_KEY)
  public void setKey_JsonNullable(JsonNullable<String> key) {
    this.key = key;
  }

  public void setKey(@javax.annotation.Nullable String key) {
    this.key = JsonNullable.<String>of(key);
  }

  public ProviderDto connected(@javax.annotation.Nullable Boolean connected) {
    
    this.connected = connected;
    return this;
  }

  /**
   * Specifies whether the provider is connected.
   * @return connected
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CONNECTED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getConnected() {
    return connected;
  }


  @JsonProperty(value = JSON_PROPERTY_CONNECTED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnected(@javax.annotation.Nullable Boolean connected) {
    this.connected = connected;
  }

  public ProviderDto oauth(@javax.annotation.Nullable Boolean oauth) {
    
    this.oauth = oauth;
    return this;
  }

  /**
   * Specifies if the provider is OAuth.
   * @return oauth
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_OAUTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOauth() {
    return oauth;
  }


  @JsonProperty(value = JSON_PROPERTY_OAUTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOauth(@javax.annotation.Nullable Boolean oauth) {
    this.oauth = oauth;
  }

  public ProviderDto redirectUrl(@javax.annotation.Nullable String redirectUrl) {
    this.redirectUrl = JsonNullable.<String>of(redirectUrl);
    
    return this;
  }

  /**
   * The provider redirect URL.
   * @return redirectUrl
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getRedirectUrl() {
        return redirectUrl.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_REDIRECT_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getRedirectUrl_JsonNullable() {
    return redirectUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_REDIRECT_URL)
  public void setRedirectUrl_JsonNullable(JsonNullable<String> redirectUrl) {
    this.redirectUrl = redirectUrl;
  }

  public void setRedirectUrl(@javax.annotation.Nullable String redirectUrl) {
    this.redirectUrl = JsonNullable.<String>of(redirectUrl);
  }

  public ProviderDto requiredConnectionUrl(@javax.annotation.Nullable Boolean requiredConnectionUrl) {
    
    this.requiredConnectionUrl = requiredConnectionUrl;
    return this;
  }

  /**
   * The required connection URL flag.
   * @return requiredConnectionUrl
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_REQUIRED_CONNECTION_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRequiredConnectionUrl() {
    return requiredConnectionUrl;
  }


  @JsonProperty(value = JSON_PROPERTY_REQUIRED_CONNECTION_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequiredConnectionUrl(@javax.annotation.Nullable Boolean requiredConnectionUrl) {
    this.requiredConnectionUrl = requiredConnectionUrl;
  }

  public ProviderDto clientId(@javax.annotation.Nullable String clientId) {
    this.clientId = JsonNullable.<String>of(clientId);
    
    return this;
  }

  /**
   * The provider OAuth client ID.
   * @return clientId
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getClientId() {
        return clientId.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_CLIENT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getClientId_JsonNullable() {
    return clientId;
  }
  
  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  public void setClientId_JsonNullable(JsonNullable<String> clientId) {
    this.clientId = clientId;
  }

  public void setClientId(@javax.annotation.Nullable String clientId) {
    this.clientId = JsonNullable.<String>of(clientId);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProviderDto providerDto = (ProviderDto) o;
    return equalsNullable(this.name, providerDto.name) &&
        equalsNullable(this.key, providerDto.key) &&
        Objects.equals(this.connected, providerDto.connected) &&
        Objects.equals(this.oauth, providerDto.oauth) &&
        equalsNullable(this.redirectUrl, providerDto.redirectUrl) &&
        Objects.equals(this.requiredConnectionUrl, providerDto.requiredConnectionUrl) &&
        equalsNullable(this.clientId, providerDto.clientId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(name), hashCodeNullable(key), connected, oauth, hashCodeNullable(redirectUrl), requiredConnectionUrl, hashCodeNullable(clientId));
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
    sb.append("class ProviderDto {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    connected: ").append(toIndentedString(connected)).append("\n");
    sb.append("    oauth: ").append(toIndentedString(oauth)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
    sb.append("    requiredConnectionUrl: ").append(toIndentedString(requiredConnectionUrl)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `key` to the URL query string
    if (getKey() != null) {
      try {
        joiner.add(String.format("%skey%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getKey()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `connected` to the URL query string
    if (getConnected() != null) {
      try {
        joiner.add(String.format("%sconnected%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConnected()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `oauth` to the URL query string
    if (getOauth() != null) {
      try {
        joiner.add(String.format("%soauth%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOauth()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `redirectUrl` to the URL query string
    if (getRedirectUrl() != null) {
      try {
        joiner.add(String.format("%sredirectUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRedirectUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `requiredConnectionUrl` to the URL query string
    if (getRequiredConnectionUrl() != null) {
      try {
        joiner.add(String.format("%srequiredConnectionUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRequiredConnectionUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `clientId` to the URL query string
    if (getClientId() != null) {
      try {
        joiner.add(String.format("%sclientId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getClientId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

