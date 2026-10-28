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
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Web-search provider configuration. Credentials and provider selection for the built-in web-search tool group.
 */
@JsonPropertyOrder({
  AiWebSearchConfig.JSON_PROPERTY_PROVIDER,
  AiWebSearchConfig.JSON_PROPERTY_KEY,
  AiWebSearchConfig.JSON_PROPERTY_BASE_URL,
  AiWebSearchConfig.JSON_PROPERTY_IS_CLOUD_PROVIDER,
  AiWebSearchConfig.JSON_PROPERTY_HEADERS
})

public class AiWebSearchConfig {
  public static final String JSON_PROPERTY_PROVIDER = "provider";
  @javax.annotation.Nonnull  private String provider;

  public static final String JSON_PROPERTY_KEY = "key";
  @javax.annotation.Nullable  private String key;

  public static final String JSON_PROPERTY_BASE_URL = "baseUrl";
  @javax.annotation.Nullable  private String baseUrl;

  public static final String JSON_PROPERTY_IS_CLOUD_PROVIDER = "isCloudProvider";
  @javax.annotation.Nullable  private Boolean isCloudProvider;

  public static final String JSON_PROPERTY_HEADERS = "headers";
  @javax.annotation.Nullable  private Map<String, String> headers = new HashMap<>();

  public AiWebSearchConfig() {
  }


  public AiWebSearchConfig provider(@javax.annotation.Nonnull String provider) {
    
    this.provider = provider;
    return this;
  }

  /**
   * Provider identifier (e.g. `exa`).
   * @return provider
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_PROVIDER, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProvider() {
    return provider;
  }


  @JsonProperty(value = JSON_PROPERTY_PROVIDER, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProvider(@javax.annotation.Nonnull String provider) {
    this.provider = provider;
  }

  public AiWebSearchConfig key(@javax.annotation.Nullable String key) {
    
    this.key = key;
    return this;
  }

  /**
   * API key for the provider. Optional for self-hosted or keyless setups.
   * @return key
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKey() {
    return key;
  }


  @JsonProperty(value = JSON_PROPERTY_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKey(@javax.annotation.Nullable String key) {
    this.key = key;
  }

  public AiWebSearchConfig baseUrl(@javax.annotation.Nullable String baseUrl) {
    
    this.baseUrl = baseUrl;
    return this;
  }

  /**
   * Optional override for the provider's base URL.
   * @return baseUrl
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_BASE_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBaseUrl() {
    return baseUrl;
  }


  @JsonProperty(value = JSON_PROPERTY_BASE_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBaseUrl(@javax.annotation.Nullable String baseUrl) {
    this.baseUrl = baseUrl;
  }

  public AiWebSearchConfig isCloudProvider(@javax.annotation.Nullable Boolean isCloudProvider) {
    
    this.isCloudProvider = isCloudProvider;
    return this;
  }

  /**
   * Whether this provider is cloud-hosted (vs. self-hosted).
   * @return isCloudProvider
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IS_CLOUD_PROVIDER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsCloudProvider() {
    return isCloudProvider;
  }


  @JsonProperty(value = JSON_PROPERTY_IS_CLOUD_PROVIDER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsCloudProvider(@javax.annotation.Nullable Boolean isCloudProvider) {
    this.isCloudProvider = isCloudProvider;
  }

  public AiWebSearchConfig headers(@javax.annotation.Nullable Map<String, String> headers) {
    
    this.headers = headers;
    return this;
  }

  public AiWebSearchConfig putHeadersItem(String key, String headersItem) {
    if (this.headers == null) {
      this.headers = new HashMap<>();
    }
    this.headers.put(key, headersItem);
    return this;
  }

  /**
   * Extra HTTP headers sent with each request to the ONLYOFFICE / cloud backend (e.g. `X-Tenant`). Merged after the derived `Authorization` header, so a custom header of the same name wins.
   * @return headers
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_HEADERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getHeaders() {
    return headers;
  }


  @JsonProperty(value = JSON_PROPERTY_HEADERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeaders(@javax.annotation.Nullable Map<String, String> headers) {
    this.headers = headers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiWebSearchConfig aiWebSearchConfig = (AiWebSearchConfig) o;
    return Objects.equals(this.provider, aiWebSearchConfig.provider) &&
        Objects.equals(this.key, aiWebSearchConfig.key) &&
        Objects.equals(this.baseUrl, aiWebSearchConfig.baseUrl) &&
        Objects.equals(this.isCloudProvider, aiWebSearchConfig.isCloudProvider) &&
        Objects.equals(this.headers, aiWebSearchConfig.headers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(provider, key, baseUrl, isCloudProvider, headers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiWebSearchConfig {\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
    sb.append("    isCloudProvider: ").append(toIndentedString(isCloudProvider)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
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

    // add `provider` to the URL query string
    if (getProvider() != null) {
      try {
        joiner.add(String.format("%sprovider%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProvider()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `baseUrl` to the URL query string
    if (getBaseUrl() != null) {
      try {
        joiner.add(String.format("%sbaseUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBaseUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isCloudProvider` to the URL query string
    if (getIsCloudProvider() != null) {
      try {
        joiner.add(String.format("%sisCloudProvider%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsCloudProvider()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `headers` to the URL query string
    if (getHeaders() != null) {
      for (String _key : getHeaders().keySet()) {
        try {
          joiner.add(String.format("%sheaders%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getHeaders().get(_key), URLEncoder.encode(String.valueOf(getHeaders().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}

