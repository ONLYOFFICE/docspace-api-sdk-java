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
import org.openapitools.client.model.AiProviderType;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * AiProfilesListProviderModelsRequest
 */
@JsonPropertyOrder({
  AiProfilesListProviderModelsRequest.JSON_PROPERTY_PROVIDER_TYPE,
  AiProfilesListProviderModelsRequest.JSON_PROPERTY_BASE_URL,
  AiProfilesListProviderModelsRequest.JSON_PROPERTY_API_KEY
})
@JsonTypeName("aiProfilesListProviderModels_request")

public class AiProfilesListProviderModelsRequest {
  public static final String JSON_PROPERTY_PROVIDER_TYPE = "providerType";
  @javax.annotation.Nonnull  private AiProviderType providerType;

  public static final String JSON_PROPERTY_BASE_URL = "baseUrl";
  @javax.annotation.Nonnull  private String baseUrl;

  public static final String JSON_PROPERTY_API_KEY = "apiKey";
  @javax.annotation.Nullable  private String apiKey;

  public AiProfilesListProviderModelsRequest() {
  }


  public AiProfilesListProviderModelsRequest providerType(@javax.annotation.Nonnull AiProviderType providerType) {
    
    this.providerType = providerType;
    return this;
  }

  /**
   * Provider whose catalog to list.
   * @return providerType
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_PROVIDER_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AiProviderType getProviderType() {
    return providerType;
  }


  @JsonProperty(value = JSON_PROPERTY_PROVIDER_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProviderType(@javax.annotation.Nonnull AiProviderType providerType) {
    this.providerType = providerType;
  }

  public AiProfilesListProviderModelsRequest baseUrl(@javax.annotation.Nonnull String baseUrl) {
    
    this.baseUrl = baseUrl;
    return this;
  }

  /**
   * Provider API base URL.
   * @return baseUrl
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_BASE_URL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBaseUrl() {
    return baseUrl;
  }


  @JsonProperty(value = JSON_PROPERTY_BASE_URL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBaseUrl(@javax.annotation.Nonnull String baseUrl) {
    this.baseUrl = baseUrl;
  }

  public AiProfilesListProviderModelsRequest apiKey(@javax.annotation.Nullable String apiKey) {
    
    this.apiKey = apiKey;
    return this;
  }

  /**
   * Provider API key. Omit it for a provider that needs none; the request is then made without one.
   * @return apiKey
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_API_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getApiKey() {
    return apiKey;
  }


  @JsonProperty(value = JSON_PROPERTY_API_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApiKey(@javax.annotation.Nullable String apiKey) {
    this.apiKey = apiKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiProfilesListProviderModelsRequest aiProfilesListProviderModelsRequest = (AiProfilesListProviderModelsRequest) o;
    return Objects.equals(this.providerType, aiProfilesListProviderModelsRequest.providerType) &&
        Objects.equals(this.baseUrl, aiProfilesListProviderModelsRequest.baseUrl) &&
        Objects.equals(this.apiKey, aiProfilesListProviderModelsRequest.apiKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerType, baseUrl, apiKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiProfilesListProviderModelsRequest {\n");
    sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
    sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
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

    // add `providerType` to the URL query string
    if (getProviderType() != null) {
      joiner.add(getProviderType().toUrlQueryString(prefix + "providerType" + suffix));
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

    // add `apiKey` to the URL query string
    if (getApiKey() != null) {
      try {
        joiner.add(String.format("%sapiKey%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getApiKey()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

