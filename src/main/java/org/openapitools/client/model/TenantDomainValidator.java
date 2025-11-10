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
 * The domain validator.
 */
@JsonPropertyOrder({
  TenantDomainValidator.JSON_PROPERTY_REGEX,
  TenantDomainValidator.JSON_PROPERTY_MIN_LENGTH,
  TenantDomainValidator.JSON_PROPERTY_MAX_LENGTH
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class TenantDomainValidator {
  public static final String JSON_PROPERTY_REGEX = "regex";
  @javax.annotation.Nullable
  private JsonNullable<String> regex = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MIN_LENGTH = "minLength";
  @javax.annotation.Nullable
  private Integer minLength;

  public static final String JSON_PROPERTY_MAX_LENGTH = "maxLength";
  @javax.annotation.Nullable
  private Integer maxLength;

  public TenantDomainValidator() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public TenantDomainValidator(
    @JsonProperty(JSON_PROPERTY_REGEX) String regex, 
    @JsonProperty(JSON_PROPERTY_MIN_LENGTH) Integer minLength, 
    @JsonProperty(JSON_PROPERTY_MAX_LENGTH) Integer maxLength
  ) {
    this();
    this.regex = regex == null ? JsonNullable.<String>undefined() : JsonNullable.of(regex);
    this.minLength = minLength;
    this.maxLength = maxLength;
  }

  /**
   * The regex string to validate a domain.
   * @return regex
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getRegex() {
    
    if (regex == null) {
      regex = JsonNullable.<String>undefined();
    }
    return regex.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REGEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getRegex_JsonNullable() {
    return regex;
  }
  
  @JsonProperty(JSON_PROPERTY_REGEX)
  private void setRegex_JsonNullable(JsonNullable<String> regex) {
    this.regex = regex;
  }


  /**
   * The minimum length of the valid domain.
   * @return minLength
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIN_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMinLength() {
    return minLength;
  }



  /**
   * The maximum length of the valid domain.
   * @return maxLength
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxLength() {
    return maxLength;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantDomainValidator tenantDomainValidator = (TenantDomainValidator) o;
    return equalsNullable(this.regex, tenantDomainValidator.regex) &&
        Objects.equals(this.minLength, tenantDomainValidator.minLength) &&
        Objects.equals(this.maxLength, tenantDomainValidator.maxLength);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(regex), minLength, maxLength);
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
    sb.append("class TenantDomainValidator {\n");
    sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
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

    // add `regex` to the URL query string
    if (getRegex() != null) {
      try {
        joiner.add(String.format("%sregex%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRegex()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `minLength` to the URL query string
    if (getMinLength() != null) {
      try {
        joiner.add(String.format("%sminLength%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMinLength()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `maxLength` to the URL query string
    if (getMaxLength() != null) {
      try {
        joiner.add(String.format("%smaxLength%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxLength()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

