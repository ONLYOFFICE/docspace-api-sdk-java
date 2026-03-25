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
 * Default AI provider information.
 */
@JsonPropertyOrder({
  DefaultProviderDto.JSON_PROPERTY_PROVIDER_ID,
  DefaultProviderDto.JSON_PROPERTY_DEFAULT_MODEL,
  DefaultProviderDto.JSON_PROPERTY_PROVIDER_TITLE
})

public class DefaultProviderDto {
  public static final String JSON_PROPERTY_PROVIDER_ID = "providerId";
  @javax.annotation.Nullable  private Integer providerId;

  public static final String JSON_PROPERTY_DEFAULT_MODEL = "defaultModel";
  @javax.annotation.Nullable  private String defaultModel;

  public static final String JSON_PROPERTY_PROVIDER_TITLE = "providerTitle";
  @javax.annotation.Nullable  private JsonNullable<String> providerTitle = JsonNullable.<String>undefined();

  public DefaultProviderDto() {
  }


  public DefaultProviderDto providerId(@javax.annotation.Nullable Integer providerId) {
    
    this.providerId = providerId;
    return this;
  }

  /**
   * AI provider identifier.
   * @return providerId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PROVIDER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getProviderId() {
    return providerId;
  }


  @JsonProperty(value = JSON_PROPERTY_PROVIDER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProviderId(@javax.annotation.Nullable Integer providerId) {
    this.providerId = providerId;
  }

  public DefaultProviderDto defaultModel(@javax.annotation.Nullable String defaultModel) {
    
    this.defaultModel = defaultModel;
    return this;
  }

  /**
   * Default model identifier used with this provider.
   * @return defaultModel
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DEFAULT_MODEL, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDefaultModel() {
    return defaultModel;
  }


  @JsonProperty(value = JSON_PROPERTY_DEFAULT_MODEL, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDefaultModel(@javax.annotation.Nullable String defaultModel) {
    this.defaultModel = defaultModel;
  }

  public DefaultProviderDto providerTitle(@javax.annotation.Nullable String providerTitle) {
    this.providerTitle = JsonNullable.<String>of(providerTitle);
    
    return this;
  }

  /**
   * AI provider title.
   * @return providerTitle
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getProviderTitle() {
        return providerTitle.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_PROVIDER_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getProviderTitle_JsonNullable() {
    return providerTitle;
  }
  
  @JsonProperty(JSON_PROPERTY_PROVIDER_TITLE)
  public void setProviderTitle_JsonNullable(JsonNullable<String> providerTitle) {
    this.providerTitle = providerTitle;
  }

  public void setProviderTitle(@javax.annotation.Nullable String providerTitle) {
    this.providerTitle = JsonNullable.<String>of(providerTitle);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefaultProviderDto defaultProviderDto = (DefaultProviderDto) o;
    return Objects.equals(this.providerId, defaultProviderDto.providerId) &&
        Objects.equals(this.defaultModel, defaultProviderDto.defaultModel) &&
        equalsNullable(this.providerTitle, defaultProviderDto.providerTitle);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerId, defaultModel, hashCodeNullable(providerTitle));
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
    sb.append("class DefaultProviderDto {\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    defaultModel: ").append(toIndentedString(defaultModel)).append("\n");
    sb.append("    providerTitle: ").append(toIndentedString(providerTitle)).append("\n");
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

    // add `providerId` to the URL query string
    if (getProviderId() != null) {
      try {
        joiner.add(String.format("%sproviderId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProviderId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `defaultModel` to the URL query string
    if (getDefaultModel() != null) {
      try {
        joiner.add(String.format("%sdefaultModel%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDefaultModel()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `providerTitle` to the URL query string
    if (getProviderTitle() != null) {
      try {
        joiner.add(String.format("%sproviderTitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProviderTitle()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

