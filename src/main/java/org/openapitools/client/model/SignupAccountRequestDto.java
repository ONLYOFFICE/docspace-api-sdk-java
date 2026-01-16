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
import org.openapitools.client.model.EmployeeType;
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
 * The request parameters for creating a third-party account.
 */
@JsonPropertyOrder({
  SignupAccountRequestDto.JSON_PROPERTY_EMPLOYEE_TYPE,
  SignupAccountRequestDto.JSON_PROPERTY_FIRST_NAME,
  SignupAccountRequestDto.JSON_PROPERTY_LAST_NAME,
  SignupAccountRequestDto.JSON_PROPERTY_EMAIL,
  SignupAccountRequestDto.JSON_PROPERTY_PASSWORD_HASH,
  SignupAccountRequestDto.JSON_PROPERTY_KEY,
  SignupAccountRequestDto.JSON_PROPERTY_CULTURE,
  SignupAccountRequestDto.JSON_PROPERTY_SERIALIZED_PROFILE
})

public class SignupAccountRequestDto {
  public static final String JSON_PROPERTY_EMPLOYEE_TYPE = "employeeType";
  @javax.annotation.Nullable
  private EmployeeType employeeType;

  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  @javax.annotation.Nullable
  private JsonNullable<String> firstName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  @javax.annotation.Nullable
  private JsonNullable<String> lastName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EMAIL = "email";
  @javax.annotation.Nullable
  private JsonNullable<String> email = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PASSWORD_HASH = "passwordHash";
  @javax.annotation.Nullable
  private JsonNullable<String> passwordHash = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_KEY = "key";
  @javax.annotation.Nullable
  private String key;

  public static final String JSON_PROPERTY_CULTURE = "culture";
  @javax.annotation.Nullable
  private JsonNullable<String> culture = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SERIALIZED_PROFILE = "serializedProfile";
  @javax.annotation.Nullable
  private String serializedProfile;

  public SignupAccountRequestDto() {
  }


  public SignupAccountRequestDto employeeType(@javax.annotation.Nullable EmployeeType employeeType) {
    
    this.employeeType = employeeType;
    return this;
  }

  /**
   * Get employeeType
   * @return employeeType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMPLOYEE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EmployeeType getEmployeeType() {
    return employeeType;
  }


  @JsonProperty(JSON_PROPERTY_EMPLOYEE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmployeeType(@javax.annotation.Nullable EmployeeType employeeType) {
    this.employeeType = employeeType;
  }

  public SignupAccountRequestDto firstName(@javax.annotation.Nullable String firstName) {
    this.firstName = JsonNullable.<String>of(firstName);
    
    return this;
  }

  /**
   * The user first name.
   * @return firstName
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getFirstName() {
        return firstName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFirstName_JsonNullable() {
    return firstName;
  }
  
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  public void setFirstName_JsonNullable(JsonNullable<String> firstName) {
    this.firstName = firstName;
  }

  public void setFirstName(@javax.annotation.Nullable String firstName) {
    this.firstName = JsonNullable.<String>of(firstName);
  }

  public SignupAccountRequestDto lastName(@javax.annotation.Nullable String lastName) {
    this.lastName = JsonNullable.<String>of(lastName);
    
    return this;
  }

  /**
   * The user last name.
   * @return lastName
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getLastName() {
        return lastName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLastName_JsonNullable() {
    return lastName;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  public void setLastName_JsonNullable(JsonNullable<String> lastName) {
    this.lastName = lastName;
  }

  public void setLastName(@javax.annotation.Nullable String lastName) {
    this.lastName = JsonNullable.<String>of(lastName);
  }

  public SignupAccountRequestDto email(@javax.annotation.Nullable String email) {
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

  public SignupAccountRequestDto passwordHash(@javax.annotation.Nullable String passwordHash) {
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

  public SignupAccountRequestDto key(@javax.annotation.Nullable String key) {
    
    this.key = key;
    return this;
  }

  /**
   * The user link key.
   * @return key
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getKey() {
    return key;
  }


  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKey(@javax.annotation.Nullable String key) {
    this.key = key;
  }

  public SignupAccountRequestDto culture(@javax.annotation.Nullable String culture) {
    this.culture = JsonNullable.<String>of(culture);
    
    return this;
  }

  /**
   * The user culture code.
   * @return culture
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCulture() {
        return culture.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CULTURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCulture_JsonNullable() {
    return culture;
  }
  
  @JsonProperty(JSON_PROPERTY_CULTURE)
  public void setCulture_JsonNullable(JsonNullable<String> culture) {
    this.culture = culture;
  }

  public void setCulture(@javax.annotation.Nullable String culture) {
    this.culture = JsonNullable.<String>of(culture);
  }

  public SignupAccountRequestDto serializedProfile(@javax.annotation.Nullable String serializedProfile) {
    
    this.serializedProfile = serializedProfile;
    return this;
  }

  /**
   * The third-party profile in the serialized format
   * @return serializedProfile
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERIALIZED_PROFILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSerializedProfile() {
    return serializedProfile;
  }


  @JsonProperty(JSON_PROPERTY_SERIALIZED_PROFILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSerializedProfile(@javax.annotation.Nullable String serializedProfile) {
    this.serializedProfile = serializedProfile;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignupAccountRequestDto signupAccountRequestDto = (SignupAccountRequestDto) o;
    return Objects.equals(this.employeeType, signupAccountRequestDto.employeeType) &&
        equalsNullable(this.firstName, signupAccountRequestDto.firstName) &&
        equalsNullable(this.lastName, signupAccountRequestDto.lastName) &&
        equalsNullable(this.email, signupAccountRequestDto.email) &&
        equalsNullable(this.passwordHash, signupAccountRequestDto.passwordHash) &&
        Objects.equals(this.key, signupAccountRequestDto.key) &&
        equalsNullable(this.culture, signupAccountRequestDto.culture) &&
        Objects.equals(this.serializedProfile, signupAccountRequestDto.serializedProfile);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeType, hashCodeNullable(firstName), hashCodeNullable(lastName), hashCodeNullable(email), hashCodeNullable(passwordHash), key, hashCodeNullable(culture), serializedProfile);
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
    sb.append("class SignupAccountRequestDto {\n");
    sb.append("    employeeType: ").append(toIndentedString(employeeType)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    passwordHash: ").append(toIndentedString(passwordHash)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    culture: ").append(toIndentedString(culture)).append("\n");
    sb.append("    serializedProfile: ").append(toIndentedString(serializedProfile)).append("\n");
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

    // add `employeeType` to the URL query string
    if (getEmployeeType() != null) {
      try {
        joiner.add(String.format("%semployeeType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmployeeType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `firstName` to the URL query string
    if (getFirstName() != null) {
      try {
        joiner.add(String.format("%sfirstName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFirstName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `lastName` to the URL query string
    if (getLastName() != null) {
      try {
        joiner.add(String.format("%slastName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLastName()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `passwordHash` to the URL query string
    if (getPasswordHash() != null) {
      try {
        joiner.add(String.format("%spasswordHash%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPasswordHash()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `culture` to the URL query string
    if (getCulture() != null) {
      try {
        joiner.add(String.format("%sculture%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCulture()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `serializedProfile` to the URL query string
    if (getSerializedProfile() != null) {
      try {
        joiner.add(String.format("%sserializedProfile%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSerializedProfile()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

