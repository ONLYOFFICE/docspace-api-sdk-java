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
 * PasswordHasher
 */
@JsonPropertyOrder({
  PasswordHasher.JSON_PROPERTY_SIZE,
  PasswordHasher.JSON_PROPERTY_ITERATIONS,
  PasswordHasher.JSON_PROPERTY_SALT
})

public class PasswordHasher {
  public static final String JSON_PROPERTY_SIZE = "size";
  @javax.annotation.Nullable  private Integer size;

  public static final String JSON_PROPERTY_ITERATIONS = "iterations";
  @javax.annotation.Nullable  private Integer iterations;

  public static final String JSON_PROPERTY_SALT = "salt";
  @javax.annotation.Nullable  private JsonNullable<String> salt = JsonNullable.<String>undefined();

  public PasswordHasher() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public PasswordHasher(
    @JsonProperty(JSON_PROPERTY_SIZE) Integer size, 
    @JsonProperty(JSON_PROPERTY_ITERATIONS) Integer iterations, 
    @JsonProperty(JSON_PROPERTY_SALT) String salt
  ) {
    this();
    this.size = size;
    this.iterations = iterations;
    this.salt = salt == null ? JsonNullable.<String>undefined() : JsonNullable.of(salt);
  }


  /**
   * Get size
   * @return size
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SIZE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSize() {
    return size;
  }



  /**
   * Get iterations
   * @return iterations
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ITERATIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIterations() {
    return iterations;
  }



  /**
   * Get salt
   * @return salt
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getSalt() {
    
    if (salt == null) {
      salt = JsonNullable.<String>undefined();
    }
    return salt.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SALT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getSalt_JsonNullable() {
    return salt;
  }
  
  @JsonProperty(JSON_PROPERTY_SALT)
  private void setSalt_JsonNullable(JsonNullable<String> salt) {
    this.salt = salt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PasswordHasher passwordHasher = (PasswordHasher) o;
    return Objects.equals(this.size, passwordHasher.size) &&
        Objects.equals(this.iterations, passwordHasher.iterations) &&
        equalsNullable(this.salt, passwordHasher.salt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, iterations, hashCodeNullable(salt));
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
    sb.append("class PasswordHasher {\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    iterations: ").append(toIndentedString(iterations)).append("\n");
    sb.append("    salt: ").append(toIndentedString(salt)).append("\n");
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

    // add `size` to the URL query string
    if (getSize() != null) {
      try {
        joiner.add(String.format("%ssize%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSize()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `iterations` to the URL query string
    if (getIterations() != null) {
      try {
        joiner.add(String.format("%siterations%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIterations()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `salt` to the URL query string
    if (getSalt() != null) {
      try {
        joiner.add(String.format("%ssalt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSalt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

