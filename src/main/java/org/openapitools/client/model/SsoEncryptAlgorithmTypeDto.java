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
 * The encryption algorithms the SSO settings accept.
 */
@JsonPropertyOrder({
  SsoEncryptAlgorithmTypeDto.JSON_PROPERTY_AES128,
  SsoEncryptAlgorithmTypeDto.JSON_PROPERTY_AES256,
  SsoEncryptAlgorithmTypeDto.JSON_PROPERTY_TRI_DEC
})

public class SsoEncryptAlgorithmTypeDto {
  public static final String JSON_PROPERTY_AES128 = "aes128";
  @javax.annotation.Nullable  private JsonNullable<String> aes128 = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_AES256 = "aes256";
  @javax.annotation.Nullable  private JsonNullable<String> aes256 = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TRI_DEC = "triDec";
  @javax.annotation.Nullable  private JsonNullable<String> triDec = JsonNullable.<String>undefined();

  public SsoEncryptAlgorithmTypeDto() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public SsoEncryptAlgorithmTypeDto(
    @JsonProperty(JSON_PROPERTY_AES128) String aes128, 
    @JsonProperty(JSON_PROPERTY_AES256) String aes256, 
    @JsonProperty(JSON_PROPERTY_TRI_DEC) String triDec
  ) {
    this();
    this.aes128 = aes128 == null ? JsonNullable.<String>undefined() : JsonNullable.of(aes128);
    this.aes256 = aes256 == null ? JsonNullable.<String>undefined() : JsonNullable.of(aes256);
    this.triDec = triDec == null ? JsonNullable.<String>undefined() : JsonNullable.of(triDec);
  }


  /**
   * The AES-128-CBC encryption algorithm, which the built-in configuration uses.
   * @return aes128
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getAes128() {
    
    if (aes128 == null) {
      aes128 = JsonNullable.<String>undefined();
    }
    return aes128.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_AES128, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getAes128_JsonNullable() {
    return aes128;
  }
  
  @JsonProperty(JSON_PROPERTY_AES128)
  private void setAes128_JsonNullable(JsonNullable<String> aes128) {
    this.aes128 = aes128;
  }


  /**
   * The AES-256-CBC encryption algorithm, the strongest of the three.
   * @return aes256
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getAes256() {
    
    if (aes256 == null) {
      aes256 = JsonNullable.<String>undefined();
    }
    return aes256.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_AES256, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getAes256_JsonNullable() {
    return aes256;
  }
  
  @JsonProperty(JSON_PROPERTY_AES256)
  private void setAes256_JsonNullable(JsonNullable<String> aes256) {
    this.aes256 = aes256;
  }


  /**
   * The Triple DES CBC encryption algorithm, kept for identity providers that support nothing newer.
   * @return triDec
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getTriDec() {
    
    if (triDec == null) {
      triDec = JsonNullable.<String>undefined();
    }
    return triDec.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_TRI_DEC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getTriDec_JsonNullable() {
    return triDec;
  }
  
  @JsonProperty(JSON_PROPERTY_TRI_DEC)
  private void setTriDec_JsonNullable(JsonNullable<String> triDec) {
    this.triDec = triDec;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SsoEncryptAlgorithmTypeDto ssoEncryptAlgorithmTypeDto = (SsoEncryptAlgorithmTypeDto) o;
    return equalsNullable(this.aes128, ssoEncryptAlgorithmTypeDto.aes128) &&
        equalsNullable(this.aes256, ssoEncryptAlgorithmTypeDto.aes256) &&
        equalsNullable(this.triDec, ssoEncryptAlgorithmTypeDto.triDec);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(aes128), hashCodeNullable(aes256), hashCodeNullable(triDec));
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
    sb.append("class SsoEncryptAlgorithmTypeDto {\n");
    sb.append("    aes128: ").append(toIndentedString(aes128)).append("\n");
    sb.append("    aes256: ").append(toIndentedString(aes256)).append("\n");
    sb.append("    triDec: ").append(toIndentedString(triDec)).append("\n");
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

    // add `aes128` to the URL query string
    if (getAes128() != null) {
      try {
        joiner.add(String.format("%saes128%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAes128()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `aes256` to the URL query string
    if (getAes256() != null) {
      try {
        joiner.add(String.format("%saes256%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAes256()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `triDec` to the URL query string
    if (getTriDec() != null) {
      try {
        joiner.add(String.format("%striDec%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTriDec()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

