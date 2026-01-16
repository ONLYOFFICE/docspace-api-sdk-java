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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The request parameters for configuring the password complexity requirements.
 */
@JsonPropertyOrder({
  PasswordSettingsRequestsDto.JSON_PROPERTY_MIN_LENGTH,
  PasswordSettingsRequestsDto.JSON_PROPERTY_UPPER_CASE,
  PasswordSettingsRequestsDto.JSON_PROPERTY_DIGITS,
  PasswordSettingsRequestsDto.JSON_PROPERTY_SPEC_SYMBOLS
})

public class PasswordSettingsRequestsDto {
  public static final String JSON_PROPERTY_MIN_LENGTH = "minLength";
  @javax.annotation.Nonnull
  private Integer minLength;

  public static final String JSON_PROPERTY_UPPER_CASE = "upperCase";
  @javax.annotation.Nullable
  private Boolean upperCase;

  public static final String JSON_PROPERTY_DIGITS = "digits";
  @javax.annotation.Nullable
  private Boolean digits;

  public static final String JSON_PROPERTY_SPEC_SYMBOLS = "specSymbols";
  @javax.annotation.Nullable
  private Boolean specSymbols;

  public PasswordSettingsRequestsDto() {
  }


  public PasswordSettingsRequestsDto minLength(@javax.annotation.Nonnull Integer minLength) {
    
    this.minLength = minLength;
    return this;
  }

  /**
   * The minimum number of characters required for valid passwords.
   * @return minLength
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MIN_LENGTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getMinLength() {
    return minLength;
  }


  @JsonProperty(JSON_PROPERTY_MIN_LENGTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMinLength(@javax.annotation.Nonnull Integer minLength) {
    this.minLength = minLength;
  }

  public PasswordSettingsRequestsDto upperCase(@javax.annotation.Nullable Boolean upperCase) {
    
    this.upperCase = upperCase;
    return this;
  }

  /**
   * Specifies whether the password should contain the uppercase letters or not.
   * @return upperCase
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPPER_CASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUpperCase() {
    return upperCase;
  }


  @JsonProperty(JSON_PROPERTY_UPPER_CASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpperCase(@javax.annotation.Nullable Boolean upperCase) {
    this.upperCase = upperCase;
  }

  public PasswordSettingsRequestsDto digits(@javax.annotation.Nullable Boolean digits) {
    
    this.digits = digits;
    return this;
  }

  /**
   * Specifies whether the password should contain the digits or not.
   * @return digits
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIGITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDigits() {
    return digits;
  }


  @JsonProperty(JSON_PROPERTY_DIGITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDigits(@javax.annotation.Nullable Boolean digits) {
    this.digits = digits;
  }

  public PasswordSettingsRequestsDto specSymbols(@javax.annotation.Nullable Boolean specSymbols) {
    
    this.specSymbols = specSymbols;
    return this;
  }

  /**
   * Specifies whether the password should contain the special symbols or not.
   * @return specSymbols
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPEC_SYMBOLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSpecSymbols() {
    return specSymbols;
  }


  @JsonProperty(JSON_PROPERTY_SPEC_SYMBOLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpecSymbols(@javax.annotation.Nullable Boolean specSymbols) {
    this.specSymbols = specSymbols;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PasswordSettingsRequestsDto passwordSettingsRequestsDto = (PasswordSettingsRequestsDto) o;
    return Objects.equals(this.minLength, passwordSettingsRequestsDto.minLength) &&
        Objects.equals(this.upperCase, passwordSettingsRequestsDto.upperCase) &&
        Objects.equals(this.digits, passwordSettingsRequestsDto.digits) &&
        Objects.equals(this.specSymbols, passwordSettingsRequestsDto.specSymbols);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minLength, upperCase, digits, specSymbols);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordSettingsRequestsDto {\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
    sb.append("    upperCase: ").append(toIndentedString(upperCase)).append("\n");
    sb.append("    digits: ").append(toIndentedString(digits)).append("\n");
    sb.append("    specSymbols: ").append(toIndentedString(specSymbols)).append("\n");
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

    // add `minLength` to the URL query string
    if (getMinLength() != null) {
      try {
        joiner.add(String.format("%sminLength%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMinLength()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `upperCase` to the URL query string
    if (getUpperCase() != null) {
      try {
        joiner.add(String.format("%supperCase%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUpperCase()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `digits` to the URL query string
    if (getDigits() != null) {
      try {
        joiner.add(String.format("%sdigits%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDigits()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `specSymbols` to the URL query string
    if (getSpecSymbols() != null) {
      try {
        joiner.add(String.format("%sspecSymbols%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSpecSymbols()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

