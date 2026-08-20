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
  SignupAccountRequestDto.JSON_PROPERTY_KEY,
  SignupAccountRequestDto.JSON_PROPERTY_CULTURE,
  SignupAccountRequestDto.JSON_PROPERTY_SERIALIZED_PROFILE
})

public class SignupAccountRequestDto {
  public static final String JSON_PROPERTY_EMPLOYEE_TYPE = "employeeType";
  @javax.annotation.Nullable  private EmployeeType employeeType;

  public static final String JSON_PROPERTY_KEY = "key";
  @javax.annotation.Nullable  private String key;

  public static final String JSON_PROPERTY_CULTURE = "culture";
  @javax.annotation.Nullable  private JsonNullable<String> culture = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SERIALIZED_PROFILE = "serializedProfile";
  @javax.annotation.Nullable  private String serializedProfile;

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
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_EMPLOYEE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EmployeeType getEmployeeType() {
    return employeeType;
  }


  @JsonProperty(value = JSON_PROPERTY_EMPLOYEE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmployeeType(@javax.annotation.Nullable EmployeeType employeeType) {
    this.employeeType = employeeType;
  }

  public SignupAccountRequestDto key(@javax.annotation.Nullable String key) {
    
    this.key = key;
    return this;
  }

  /**
   * The user link key.
   * @return key
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getKey() {
    return key;
  }


  @JsonProperty(value = JSON_PROPERTY_KEY, required = false)
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
  @javax.annotation.Nullable  @JsonIgnore

  public String getCulture() {
        return culture.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_CULTURE, required = false)
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
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SERIALIZED_PROFILE, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSerializedProfile() {
    return serializedProfile;
  }


  @JsonProperty(value = JSON_PROPERTY_SERIALIZED_PROFILE, required = false)
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
        Objects.equals(this.key, signupAccountRequestDto.key) &&
        equalsNullable(this.culture, signupAccountRequestDto.culture) &&
        Objects.equals(this.serializedProfile, signupAccountRequestDto.serializedProfile);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeType, key, hashCodeNullable(culture), serializedProfile);
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

