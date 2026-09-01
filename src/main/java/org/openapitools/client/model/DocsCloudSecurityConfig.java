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
 * Represents the security configuration of a DocsCloud tenant.
 */
@JsonPropertyOrder({
  DocsCloudSecurityConfig.JSON_PROPERTY_SECRET,
  DocsCloudSecurityConfig.JSON_PROPERTY_HEADER
})

public class DocsCloudSecurityConfig {
  public static final String JSON_PROPERTY_SECRET = "secret";
  @javax.annotation.Nullable  private JsonNullable<String> secret = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_HEADER = "header";
  @javax.annotation.Nullable  private JsonNullable<String> header = JsonNullable.<String>undefined();

  public DocsCloudSecurityConfig() {
  }


  public DocsCloudSecurityConfig secret(@javax.annotation.Nullable String secret) {
    this.secret = JsonNullable.<String>of(secret);
    
    return this;
  }

  /**
   * The security secret.
   * @return secret
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getSecret() {
        return secret.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SECRET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getSecret_JsonNullable() {
    return secret;
  }
  
  @JsonProperty(JSON_PROPERTY_SECRET)
  public void setSecret_JsonNullable(JsonNullable<String> secret) {
    this.secret = secret;
  }

  public void setSecret(@javax.annotation.Nullable String secret) {
    this.secret = JsonNullable.<String>of(secret);
  }

  public DocsCloudSecurityConfig header(@javax.annotation.Nullable String header) {
    this.header = JsonNullable.<String>of(header);
    
    return this;
  }

  /**
   * The security header name.
   * @return header
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getHeader() {
        return header.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_HEADER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getHeader_JsonNullable() {
    return header;
  }
  
  @JsonProperty(JSON_PROPERTY_HEADER)
  public void setHeader_JsonNullable(JsonNullable<String> header) {
    this.header = header;
  }

  public void setHeader(@javax.annotation.Nullable String header) {
    this.header = JsonNullable.<String>of(header);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocsCloudSecurityConfig docsCloudSecurityConfig = (DocsCloudSecurityConfig) o;
    return equalsNullable(this.secret, docsCloudSecurityConfig.secret) &&
        equalsNullable(this.header, docsCloudSecurityConfig.header);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(secret), hashCodeNullable(header));
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
    sb.append("class DocsCloudSecurityConfig {\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
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

    // add `secret` to the URL query string
    if (getSecret() != null) {
      try {
        joiner.add(String.format("%ssecret%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSecret()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `header` to the URL query string
    if (getHeader() != null) {
      try {
        joiner.add(String.format("%sheader%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHeader()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

