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
 * The request parameters for the user generic information.
 */
@JsonPropertyOrder({
  MemberBaseRequestDto.JSON_PROPERTY_PASSWORD,
  MemberBaseRequestDto.JSON_PROPERTY_PASSWORD_HASH,
  MemberBaseRequestDto.JSON_PROPERTY_EMAIL,
  MemberBaseRequestDto.JSON_PROPERTY_ENC_EMAIL
})

public class MemberBaseRequestDto {
  public static final String JSON_PROPERTY_PASSWORD = "password";
  @javax.annotation.Nullable
  private JsonNullable<String> password = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PASSWORD_HASH = "passwordHash";
  @javax.annotation.Nullable
  private JsonNullable<String> passwordHash = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EMAIL = "email";
  @javax.annotation.Nullable
  private JsonNullable<String> email = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ENC_EMAIL = "encEmail";
  @javax.annotation.Nullable
  private JsonNullable<String> encEmail = JsonNullable.<String>undefined();

  public MemberBaseRequestDto() {
  }

  public MemberBaseRequestDto password(@javax.annotation.Nullable String password) {
    this.password = JsonNullable.<String>of(password);
    
    return this;
  }

  /**
   * The user password.
   * @return password
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPassword() {
        return password.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPassword_JsonNullable() {
    return password;
  }
  
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  public void setPassword_JsonNullable(JsonNullable<String> password) {
    this.password = password;
  }

  public void setPassword(@javax.annotation.Nullable String password) {
    this.password = JsonNullable.<String>of(password);
  }

  public MemberBaseRequestDto passwordHash(@javax.annotation.Nullable String passwordHash) {
    this.passwordHash = JsonNullable.<String>of(passwordHash);
    
    return this;
  }

  /**
   * The user password hash.
   * @return passwordHash
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPasswordHash() {
        return passwordHash.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PASSWORD_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPasswordHash_JsonNullable() {
    return passwordHash;
  }
  
  @JsonProperty(JSON_PROPERTY_PASSWORD_HASH)
  public void setPasswordHash_JsonNullable(JsonNullable<String> passwordHash) {
    this.passwordHash = passwordHash;
  }

  public void setPasswordHash(@javax.annotation.Nullable String passwordHash) {
    this.passwordHash = JsonNullable.<String>of(passwordHash);
  }

  public MemberBaseRequestDto email(@javax.annotation.Nullable String email) {
    this.email = JsonNullable.<String>of(email);
    
    return this;
  }

  /**
   * The user email address.
   * @return email
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getEmail() {
        return email.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getEmail_JsonNullable() {
    return email;
  }
  
  @JsonProperty(JSON_PROPERTY_EMAIL)
  public void setEmail_JsonNullable(JsonNullable<String> email) {
    this.email = email;
  }

  public void setEmail(@javax.annotation.Nullable String email) {
    this.email = JsonNullable.<String>of(email);
  }

  public MemberBaseRequestDto encEmail(@javax.annotation.Nullable String encEmail) {
    this.encEmail = JsonNullable.<String>of(encEmail);
    
    return this;
  }

  /**
   * The user encrypted email address.
   * @return encEmail
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getEncEmail() {
        return encEmail.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENC_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getEncEmail_JsonNullable() {
    return encEmail;
  }
  
  @JsonProperty(JSON_PROPERTY_ENC_EMAIL)
  public void setEncEmail_JsonNullable(JsonNullable<String> encEmail) {
    this.encEmail = encEmail;
  }

  public void setEncEmail(@javax.annotation.Nullable String encEmail) {
    this.encEmail = JsonNullable.<String>of(encEmail);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberBaseRequestDto memberBaseRequestDto = (MemberBaseRequestDto) o;
    return equalsNullable(this.password, memberBaseRequestDto.password) &&
        equalsNullable(this.passwordHash, memberBaseRequestDto.passwordHash) &&
        equalsNullable(this.email, memberBaseRequestDto.email) &&
        equalsNullable(this.encEmail, memberBaseRequestDto.encEmail);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(password), hashCodeNullable(passwordHash), hashCodeNullable(email), hashCodeNullable(encEmail));
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
    sb.append("class MemberBaseRequestDto {\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    passwordHash: ").append(toIndentedString(passwordHash)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    encEmail: ").append(toIndentedString(encEmail)).append("\n");
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

    // add `password` to the URL query string
    if (getPassword() != null) {
      try {
        joiner.add(String.format("%spassword%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPassword()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `passwordHash` to the URL query string
    if (getPasswordHash() != null) {
      try {
        joiner.add(String.format("%spasswordHash%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPasswordHash()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `email` to the URL query string
    if (getEmail() != null) {
      try {
        joiner.add(String.format("%semail%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmail()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `encEmail` to the URL query string
    if (getEncEmail() != null) {
      try {
        joiner.add(String.format("%sencEmail%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEncEmail()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

