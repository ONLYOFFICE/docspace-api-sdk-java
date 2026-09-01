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
 * Minimal provider connection configuration. Used to connect to a provider API.
 */
@JsonPropertyOrder({
  AiTProvider.JSON_PROPERTY_TYPE,
  AiTProvider.JSON_PROPERTY_NAME,
  AiTProvider.JSON_PROPERTY_KEY,
  AiTProvider.JSON_PROPERTY_BASE_URL
})

public class AiTProvider {
  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nonnull  private AiProviderType type;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull  private String name;

  public static final String JSON_PROPERTY_KEY = "key";
  @javax.annotation.Nullable  private String key;

  public static final String JSON_PROPERTY_BASE_URL = "baseUrl";
  @javax.annotation.Nonnull  private String baseUrl;

  public AiTProvider() {
  }


  public AiTProvider type(@javax.annotation.Nonnull AiProviderType type) {
    
    this.type = type;
    return this;
  }

  /**
   * Provider type identifier.
   * @return type
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AiProviderType getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(@javax.annotation.Nonnull AiProviderType type) {
    this.type = type;
  }

  public AiTProvider name(@javax.annotation.Nonnull String name) {
    
    this.name = name;
    return this;
  }

  /**
   * User-defined display name for this provider connection.
   * @return name
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(value = JSON_PROPERTY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }

  public AiTProvider key(@javax.annotation.Nullable String key) {
    
    this.key = key;
    return this;
  }

  /**
   * API key or token. Optional for local providers (Ollama, LM Studio).
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

  public AiTProvider baseUrl(@javax.annotation.Nonnull String baseUrl) {
    
    this.baseUrl = baseUrl;
    return this;
  }

  /**
   * Base URL of the provider API.
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiTProvider aiTProvider = (AiTProvider) o;
    return Objects.equals(this.type, aiTProvider.type) &&
        Objects.equals(this.name, aiTProvider.name) &&
        Objects.equals(this.key, aiTProvider.key) &&
        Objects.equals(this.baseUrl, aiTProvider.baseUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, key, baseUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiTProvider {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
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

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(getType().toUrlQueryString(prefix + "type" + suffix));
    }

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

    // add `baseUrl` to the URL query string
    if (getBaseUrl() != null) {
      try {
        joiner.add(String.format("%sbaseUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBaseUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

