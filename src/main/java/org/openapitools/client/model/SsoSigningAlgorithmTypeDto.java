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
 * The signing algorithms the SSO settings accept.
 */
@JsonPropertyOrder({
  SsoSigningAlgorithmTypeDto.JSON_PROPERTY_RSA_SHA1,
  SsoSigningAlgorithmTypeDto.JSON_PROPERTY_RSA_SHA256,
  SsoSigningAlgorithmTypeDto.JSON_PROPERTY_RSA_SHA512
})

public class SsoSigningAlgorithmTypeDto {
  public static final String JSON_PROPERTY_RSA_SHA1 = "rsaSha1";
  @javax.annotation.Nullable  private JsonNullable<String> rsaSha1 = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_RSA_SHA256 = "rsaSha256";
  @javax.annotation.Nullable  private JsonNullable<String> rsaSha256 = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_RSA_SHA512 = "rsaSha512";
  @javax.annotation.Nullable  private JsonNullable<String> rsaSha512 = JsonNullable.<String>undefined();

  public SsoSigningAlgorithmTypeDto() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public SsoSigningAlgorithmTypeDto(
    @JsonProperty(JSON_PROPERTY_RSA_SHA1) String rsaSha1, 
    @JsonProperty(JSON_PROPERTY_RSA_SHA256) String rsaSha256, 
    @JsonProperty(JSON_PROPERTY_RSA_SHA512) String rsaSha512
  ) {
    this();
    this.rsaSha1 = rsaSha1 == null ? JsonNullable.<String>undefined() : JsonNullable.of(rsaSha1);
    this.rsaSha256 = rsaSha256 == null ? JsonNullable.<String>undefined() : JsonNullable.of(rsaSha256);
    this.rsaSha512 = rsaSha512 == null ? JsonNullable.<String>undefined() : JsonNullable.of(rsaSha512);
  }


  /**
   * The RSA-SHA1 signing algorithm, which the built-in configuration uses. SHA-1 is the weakest of the three  and some identity providers no longer accept it.
   * @return rsaSha1
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getRsaSha1() {
    
    if (rsaSha1 == null) {
      rsaSha1 = JsonNullable.<String>undefined();
    }
    return rsaSha1.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_RSA_SHA1, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getRsaSha1_JsonNullable() {
    return rsaSha1;
  }
  
  @JsonProperty(JSON_PROPERTY_RSA_SHA1)
  private void setRsaSha1_JsonNullable(JsonNullable<String> rsaSha1) {
    this.rsaSha1 = rsaSha1;
  }


  /**
   * The RSA-SHA256 signing algorithm.
   * @return rsaSha256
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getRsaSha256() {
    
    if (rsaSha256 == null) {
      rsaSha256 = JsonNullable.<String>undefined();
    }
    return rsaSha256.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_RSA_SHA256, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getRsaSha256_JsonNullable() {
    return rsaSha256;
  }
  
  @JsonProperty(JSON_PROPERTY_RSA_SHA256)
  private void setRsaSha256_JsonNullable(JsonNullable<String> rsaSha256) {
    this.rsaSha256 = rsaSha256;
  }


  /**
   * The RSA-SHA512 signing algorithm.
   * @return rsaSha512
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getRsaSha512() {
    
    if (rsaSha512 == null) {
      rsaSha512 = JsonNullable.<String>undefined();
    }
    return rsaSha512.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_RSA_SHA512, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getRsaSha512_JsonNullable() {
    return rsaSha512;
  }
  
  @JsonProperty(JSON_PROPERTY_RSA_SHA512)
  private void setRsaSha512_JsonNullable(JsonNullable<String> rsaSha512) {
    this.rsaSha512 = rsaSha512;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SsoSigningAlgorithmTypeDto ssoSigningAlgorithmTypeDto = (SsoSigningAlgorithmTypeDto) o;
    return equalsNullable(this.rsaSha1, ssoSigningAlgorithmTypeDto.rsaSha1) &&
        equalsNullable(this.rsaSha256, ssoSigningAlgorithmTypeDto.rsaSha256) &&
        equalsNullable(this.rsaSha512, ssoSigningAlgorithmTypeDto.rsaSha512);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(rsaSha1), hashCodeNullable(rsaSha256), hashCodeNullable(rsaSha512));
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
    sb.append("class SsoSigningAlgorithmTypeDto {\n");
    sb.append("    rsaSha1: ").append(toIndentedString(rsaSha1)).append("\n");
    sb.append("    rsaSha256: ").append(toIndentedString(rsaSha256)).append("\n");
    sb.append("    rsaSha512: ").append(toIndentedString(rsaSha512)).append("\n");
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

    // add `rsaSha1` to the URL query string
    if (getRsaSha1() != null) {
      try {
        joiner.add(String.format("%srsaSha1%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRsaSha1()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `rsaSha256` to the URL query string
    if (getRsaSha256() != null) {
      try {
        joiner.add(String.format("%srsaSha256%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRsaSha256()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `rsaSha512` to the URL query string
    if (getRsaSha512() != null) {
      try {
        joiner.add(String.format("%srsaSha512%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRsaSha512()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

