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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * ExchangeToken200Response
 */
@JsonPropertyOrder({
  ExchangeToken200Response.JSON_PROPERTY_ACCESS_TOKEN,
  ExchangeToken200Response.JSON_PROPERTY_TOKEN_TYPE,
  ExchangeToken200Response.JSON_PROPERTY_EXPIRES_IN,
  ExchangeToken200Response.JSON_PROPERTY_REFRESH_TOKEN
})
@JsonTypeName("exchangeToken_200_response")

public class ExchangeToken200Response {
  public static final String JSON_PROPERTY_ACCESS_TOKEN = "access_token";
  @javax.annotation.Nullable  private String accessToken;

  public static final String JSON_PROPERTY_TOKEN_TYPE = "token_type";
  @javax.annotation.Nullable  private String tokenType;

  public static final String JSON_PROPERTY_EXPIRES_IN = "expires_in";
  @javax.annotation.Nullable  private Integer expiresIn;

  public static final String JSON_PROPERTY_REFRESH_TOKEN = "refresh_token";
  @javax.annotation.Nullable  private String refreshToken;

  public ExchangeToken200Response() {
  }


  public ExchangeToken200Response accessToken(@javax.annotation.Nullable String accessToken) {
    
    this.accessToken = accessToken;
    return this;
  }

  /**
   * The access token issued by the authorization server.
   * @return accessToken
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ACCESS_TOKEN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccessToken() {
    return accessToken;
  }


  @JsonProperty(value = JSON_PROPERTY_ACCESS_TOKEN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccessToken(@javax.annotation.Nullable String accessToken) {
    this.accessToken = accessToken;
  }

  public ExchangeToken200Response tokenType(@javax.annotation.Nullable String tokenType) {
    
    this.tokenType = tokenType;
    return this;
  }

  /**
   * The type of token issued, typically 'Bearer'.
   * @return tokenType
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TOKEN_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTokenType() {
    return tokenType;
  }


  @JsonProperty(value = JSON_PROPERTY_TOKEN_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTokenType(@javax.annotation.Nullable String tokenType) {
    this.tokenType = tokenType;
  }

  public ExchangeToken200Response expiresIn(@javax.annotation.Nullable Integer expiresIn) {
    
    this.expiresIn = expiresIn;
    return this;
  }

  /**
   * The number of seconds until the access token expires.
   * @return expiresIn
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_EXPIRES_IN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getExpiresIn() {
    return expiresIn;
  }


  @JsonProperty(value = JSON_PROPERTY_EXPIRES_IN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiresIn(@javax.annotation.Nullable Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  public ExchangeToken200Response refreshToken(@javax.annotation.Nullable String refreshToken) {
    
    this.refreshToken = refreshToken;
    return this;
  }

  /**
   * The token used to obtain a new access token when the current one expires.
   * @return refreshToken
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_REFRESH_TOKEN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRefreshToken() {
    return refreshToken;
  }


  @JsonProperty(value = JSON_PROPERTY_REFRESH_TOKEN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefreshToken(@javax.annotation.Nullable String refreshToken) {
    this.refreshToken = refreshToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExchangeToken200Response exchangeToken200Response = (ExchangeToken200Response) o;
    return Objects.equals(this.accessToken, exchangeToken200Response.accessToken) &&
        Objects.equals(this.tokenType, exchangeToken200Response.tokenType) &&
        Objects.equals(this.expiresIn, exchangeToken200Response.expiresIn) &&
        Objects.equals(this.refreshToken, exchangeToken200Response.refreshToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, tokenType, expiresIn, refreshToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangeToken200Response {\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
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

    // add `token_type` to the URL query string
    if (getTokenType() != null) {
      try {
        joiner.add(String.format("%stoken_type%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTokenType()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `refresh_token` to the URL query string
    if (getRefreshToken() != null) {
      try {
        joiner.add(String.format("%srefresh_token%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRefreshToken()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

