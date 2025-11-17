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
import java.time.OffsetDateTime;
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
 * OAuth20Token
 */
@JsonPropertyOrder({
  OAuth20Token.JSON_PROPERTY_ACCESS_TOKEN,
  OAuth20Token.JSON_PROPERTY_REFRESH_TOKEN,
  OAuth20Token.JSON_PROPERTY_EXPIRES_IN,
  OAuth20Token.JSON_PROPERTY_CLIENT_ID,
  OAuth20Token.JSON_PROPERTY_CLIENT_SECRET,
  OAuth20Token.JSON_PROPERTY_REDIRECT_URI,
  OAuth20Token.JSON_PROPERTY_TIMESTAMP,
  OAuth20Token.JSON_PROPERTY_IS_EXPIRED
})

public class OAuth20Token {
  public static final String JSON_PROPERTY_ACCESS_TOKEN = "access_token";
  @javax.annotation.Nullable
  private JsonNullable<String> accessToken = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_REFRESH_TOKEN = "refresh_token";
  @javax.annotation.Nullable
  private JsonNullable<String> refreshToken = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EXPIRES_IN = "expires_in";
  @javax.annotation.Nullable
  private Long expiresIn;

  public static final String JSON_PROPERTY_CLIENT_ID = "client_id";
  @javax.annotation.Nullable
  private JsonNullable<String> clientId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CLIENT_SECRET = "client_secret";
  @javax.annotation.Nullable
  private JsonNullable<String> clientSecret = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_REDIRECT_URI = "redirect_uri";
  @javax.annotation.Nullable
  private JsonNullable<URI> redirectUri = JsonNullable.<URI>undefined();

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  @javax.annotation.Nullable
  private OffsetDateTime timestamp;

  public static final String JSON_PROPERTY_IS_EXPIRED = "isExpired";
  @javax.annotation.Nullable
  private Boolean isExpired;

  public OAuth20Token() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public OAuth20Token(
    @JsonProperty(JSON_PROPERTY_IS_EXPIRED) Boolean isExpired
  ) {
    this();
    this.isExpired = isExpired;
  }

  public OAuth20Token accessToken(@javax.annotation.Nullable String accessToken) {
    this.accessToken = JsonNullable.<String>of(accessToken);
    
    return this;
  }

  /**
   * Get accessToken
   * @return accessToken
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getAccessToken() {
        return accessToken.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ACCESS_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAccessToken_JsonNullable() {
    return accessToken;
  }
  
  @JsonProperty(JSON_PROPERTY_ACCESS_TOKEN)
  public void setAccessToken_JsonNullable(JsonNullable<String> accessToken) {
    this.accessToken = accessToken;
  }

  public void setAccessToken(@javax.annotation.Nullable String accessToken) {
    this.accessToken = JsonNullable.<String>of(accessToken);
  }

  public OAuth20Token refreshToken(@javax.annotation.Nullable String refreshToken) {
    this.refreshToken = JsonNullable.<String>of(refreshToken);
    
    return this;
  }

  /**
   * Get refreshToken
   * @return refreshToken
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getRefreshToken() {
        return refreshToken.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REFRESH_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getRefreshToken_JsonNullable() {
    return refreshToken;
  }
  
  @JsonProperty(JSON_PROPERTY_REFRESH_TOKEN)
  public void setRefreshToken_JsonNullable(JsonNullable<String> refreshToken) {
    this.refreshToken = refreshToken;
  }

  public void setRefreshToken(@javax.annotation.Nullable String refreshToken) {
    this.refreshToken = JsonNullable.<String>of(refreshToken);
  }

  public OAuth20Token expiresIn(@javax.annotation.Nullable Long expiresIn) {
    
    this.expiresIn = expiresIn;
    return this;
  }

  /**
   * Get expiresIn
   * @return expiresIn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRES_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getExpiresIn() {
    return expiresIn;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRES_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiresIn(@javax.annotation.Nullable Long expiresIn) {
    this.expiresIn = expiresIn;
  }

  public OAuth20Token clientId(@javax.annotation.Nullable String clientId) {
    this.clientId = JsonNullable.<String>of(clientId);
    
    return this;
  }

  /**
   * Get clientId
   * @return clientId
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getClientId() {
        return clientId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
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

  public OAuth20Token clientSecret(@javax.annotation.Nullable String clientSecret) {
    this.clientSecret = JsonNullable.<String>of(clientSecret);
    
    return this;
  }

  /**
   * Get clientSecret
   * @return clientSecret
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getClientSecret() {
        return clientSecret.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CLIENT_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getClientSecret_JsonNullable() {
    return clientSecret;
  }
  
  @JsonProperty(JSON_PROPERTY_CLIENT_SECRET)
  public void setClientSecret_JsonNullable(JsonNullable<String> clientSecret) {
    this.clientSecret = clientSecret;
  }

  public void setClientSecret(@javax.annotation.Nullable String clientSecret) {
    this.clientSecret = JsonNullable.<String>of(clientSecret);
  }

  public OAuth20Token redirectUri(@javax.annotation.Nullable URI redirectUri) {
    this.redirectUri = JsonNullable.<URI>of(redirectUri);
    
    return this;
  }

  /**
   * Get redirectUri
   * @return redirectUri
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public URI getRedirectUri() {
        return redirectUri.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REDIRECT_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<URI> getRedirectUri_JsonNullable() {
    return redirectUri;
  }
  
  @JsonProperty(JSON_PROPERTY_REDIRECT_URI)
  public void setRedirectUri_JsonNullable(JsonNullable<URI> redirectUri) {
    this.redirectUri = redirectUri;
  }

  public void setRedirectUri(@javax.annotation.Nullable URI redirectUri) {
    this.redirectUri = JsonNullable.<URI>of(redirectUri);
  }

  public OAuth20Token timestamp(@javax.annotation.Nullable OffsetDateTime timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }


  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimestamp(@javax.annotation.Nullable OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * Get isExpired
   * @return isExpired
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_EXPIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsExpired() {
    return isExpired;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuth20Token oauth20Token = (OAuth20Token) o;
    return equalsNullable(this.accessToken, oauth20Token.accessToken) &&
        equalsNullable(this.refreshToken, oauth20Token.refreshToken) &&
        Objects.equals(this.expiresIn, oauth20Token.expiresIn) &&
        equalsNullable(this.clientId, oauth20Token.clientId) &&
        equalsNullable(this.clientSecret, oauth20Token.clientSecret) &&
        equalsNullable(this.redirectUri, oauth20Token.redirectUri) &&
        Objects.equals(this.timestamp, oauth20Token.timestamp) &&
        Objects.equals(this.isExpired, oauth20Token.isExpired);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(accessToken), hashCodeNullable(refreshToken), expiresIn, hashCodeNullable(clientId), hashCodeNullable(clientSecret), hashCodeNullable(redirectUri), timestamp, isExpired);
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
    sb.append("class OAuth20Token {\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    isExpired: ").append(toIndentedString(isExpired)).append("\n");
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

    // add `access_token` to the URL query string
    if (getAccessToken() != null) {
      try {
        joiner.add(String.format("%saccess_token%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAccessToken()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `refresh_token` to the URL query string
    if (getRefreshToken() != null) {
      try {
        joiner.add(String.format("%srefresh_token%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRefreshToken()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `expires_in` to the URL query string
    if (getExpiresIn() != null) {
      try {
        joiner.add(String.format("%sexpires_in%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExpiresIn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `client_id` to the URL query string
    if (getClientId() != null) {
      try {
        joiner.add(String.format("%sclient_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getClientId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `client_secret` to the URL query string
    if (getClientSecret() != null) {
      try {
        joiner.add(String.format("%sclient_secret%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getClientSecret()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `redirect_uri` to the URL query string
    if (getRedirectUri() != null) {
      try {
        joiner.add(String.format("%sredirect_uri%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRedirectUri()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `timestamp` to the URL query string
    if (getTimestamp() != null) {
      try {
        joiner.add(String.format("%stimestamp%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTimestamp()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isExpired` to the URL query string
    if (getIsExpired() != null) {
      try {
        joiner.add(String.format("%sisExpired%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsExpired()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

