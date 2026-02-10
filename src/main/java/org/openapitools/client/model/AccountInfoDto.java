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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The account information parameters.
 */
@JsonPropertyOrder({
  AccountInfoDto.JSON_PROPERTY_PROVIDER,
  AccountInfoDto.JSON_PROPERTY_URL,
  AccountInfoDto.JSON_PROPERTY_LINKED
})

public class AccountInfoDto {
  public static final String JSON_PROPERTY_PROVIDER = "provider";
  @javax.annotation.Nullable
  private String provider;

  public static final String JSON_PROPERTY_URL = "url";
  @javax.annotation.Nullable
  private URI url;

  public static final String JSON_PROPERTY_LINKED = "linked";
  @javax.annotation.Nonnull
  private Boolean linked;

  public AccountInfoDto() {
  }


  public AccountInfoDto provider(@javax.annotation.Nullable String provider) {
    
    this.provider = provider;
    return this;
  }

  /**
   * The account provider.
   * @return provider
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProvider() {
    return provider;
  }


  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProvider(@javax.annotation.Nullable String provider) {
    this.provider = provider;
  }

  public AccountInfoDto url(@javax.annotation.Nullable URI url) {
    
    this.url = url;
    return this;
  }

  /**
   * The account URL.
   * @return url
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public URI getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUrl(@javax.annotation.Nullable URI url) {
    this.url = url;
  }

  public AccountInfoDto linked(@javax.annotation.Nonnull Boolean linked) {
    
    this.linked = linked;
    return this;
  }

  /**
   * Specifies if an account is linked with other profiles or not.
   * @return linked
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LINKED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getLinked() {
    return linked;
  }


  @JsonProperty(JSON_PROPERTY_LINKED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLinked(@javax.annotation.Nonnull Boolean linked) {
    this.linked = linked;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountInfoDto accountInfoDto = (AccountInfoDto) o;
    return Objects.equals(this.provider, accountInfoDto.provider) &&
        Objects.equals(this.url, accountInfoDto.url) &&
        Objects.equals(this.linked, accountInfoDto.linked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(provider, url, linked);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountInfoDto {\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    linked: ").append(toIndentedString(linked)).append("\n");
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

    // add `url` to the URL query string
    if (getUrl() != null) {
      try {
        joiner.add(String.format("%surl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `linked` to the URL query string
    if (getLinked() != null) {
      try {
        joiner.add(String.format("%slinked%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLinked()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

