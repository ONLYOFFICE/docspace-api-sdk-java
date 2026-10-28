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
 * The SAML bindings the SSO settings accept.
 */
@JsonPropertyOrder({
  SsoBindingTypeDto.JSON_PROPERTY_SAML20_HTTP_POST,
  SsoBindingTypeDto.JSON_PROPERTY_SAML20_HTTP_REDIRECT
})

public class SsoBindingTypeDto {
  public static final String JSON_PROPERTY_SAML20_HTTP_POST = "saml20HttpPost";
  @javax.annotation.Nullable  private JsonNullable<String> saml20HttpPost = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SAML20_HTTP_REDIRECT = "saml20HttpRedirect";
  @javax.annotation.Nullable  private JsonNullable<String> saml20HttpRedirect = JsonNullable.<String>undefined();

  public SsoBindingTypeDto() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public SsoBindingTypeDto(
    @JsonProperty(JSON_PROPERTY_SAML20_HTTP_POST) String saml20HttpPost, 
    @JsonProperty(JSON_PROPERTY_SAML20_HTTP_REDIRECT) String saml20HttpRedirect
  ) {
    this();
    this.saml20HttpPost = saml20HttpPost == null ? JsonNullable.<String>undefined() : JsonNullable.of(saml20HttpPost);
    this.saml20HttpRedirect = saml20HttpRedirect == null ? JsonNullable.<String>undefined() : JsonNullable.of(saml20HttpRedirect);
  }


  /**
   * The SAML 2.0 HTTP POST binding, which carries the request in a self-submitting form. It is what the  built-in configuration uses and the one to pick when requests are signed, since it has no length limit.
   * @return saml20HttpPost
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getSaml20HttpPost() {
    
    if (saml20HttpPost == null) {
      saml20HttpPost = JsonNullable.<String>undefined();
    }
    return saml20HttpPost.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SAML20_HTTP_POST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getSaml20HttpPost_JsonNullable() {
    return saml20HttpPost;
  }
  
  @JsonProperty(JSON_PROPERTY_SAML20_HTTP_POST)
  private void setSaml20HttpPost_JsonNullable(JsonNullable<String> saml20HttpPost) {
    this.saml20HttpPost = saml20HttpPost;
  }


  /**
   * The SAML 2.0 HTTP redirect binding, which carries the request in the query string and is therefore bound  by the length a URL may have.
   * @return saml20HttpRedirect
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getSaml20HttpRedirect() {
    
    if (saml20HttpRedirect == null) {
      saml20HttpRedirect = JsonNullable.<String>undefined();
    }
    return saml20HttpRedirect.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SAML20_HTTP_REDIRECT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getSaml20HttpRedirect_JsonNullable() {
    return saml20HttpRedirect;
  }
  
  @JsonProperty(JSON_PROPERTY_SAML20_HTTP_REDIRECT)
  private void setSaml20HttpRedirect_JsonNullable(JsonNullable<String> saml20HttpRedirect) {
    this.saml20HttpRedirect = saml20HttpRedirect;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SsoBindingTypeDto ssoBindingTypeDto = (SsoBindingTypeDto) o;
    return equalsNullable(this.saml20HttpPost, ssoBindingTypeDto.saml20HttpPost) &&
        equalsNullable(this.saml20HttpRedirect, ssoBindingTypeDto.saml20HttpRedirect);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(saml20HttpPost), hashCodeNullable(saml20HttpRedirect));
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
    sb.append("class SsoBindingTypeDto {\n");
    sb.append("    saml20HttpPost: ").append(toIndentedString(saml20HttpPost)).append("\n");
    sb.append("    saml20HttpRedirect: ").append(toIndentedString(saml20HttpRedirect)).append("\n");
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

    // add `saml20HttpPost` to the URL query string
    if (getSaml20HttpPost() != null) {
      try {
        joiner.add(String.format("%ssaml20HttpPost%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSaml20HttpPost()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `saml20HttpRedirect` to the URL query string
    if (getSaml20HttpRedirect() != null) {
      try {
        joiner.add(String.format("%ssaml20HttpRedirect%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSaml20HttpRedirect()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

