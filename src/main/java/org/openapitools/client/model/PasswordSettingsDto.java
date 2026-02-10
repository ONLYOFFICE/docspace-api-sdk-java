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
 * The password settings parameters.
 */
@JsonPropertyOrder({
  PasswordSettingsDto.JSON_PROPERTY_MIN_LENGTH,
  PasswordSettingsDto.JSON_PROPERTY_UPPER_CASE,
  PasswordSettingsDto.JSON_PROPERTY_DIGITS,
  PasswordSettingsDto.JSON_PROPERTY_SPEC_SYMBOLS,
  PasswordSettingsDto.JSON_PROPERTY_ALLOWED_CHARACTERS_REGEX_STR,
  PasswordSettingsDto.JSON_PROPERTY_DIGITS_REGEX_STR,
  PasswordSettingsDto.JSON_PROPERTY_UPPER_CASE_REGEX_STR,
  PasswordSettingsDto.JSON_PROPERTY_SPEC_SYMBOLS_REGEX_STR
})

public class PasswordSettingsDto {
  public static final String JSON_PROPERTY_MIN_LENGTH = "minLength";
  @javax.annotation.Nonnull
  private Integer minLength;

  public static final String JSON_PROPERTY_UPPER_CASE = "upperCase";
  @javax.annotation.Nonnull
  private Boolean upperCase;

  public static final String JSON_PROPERTY_DIGITS = "digits";
  @javax.annotation.Nonnull
  private Boolean digits;

  public static final String JSON_PROPERTY_SPEC_SYMBOLS = "specSymbols";
  @javax.annotation.Nonnull
  private Boolean specSymbols;

  public static final String JSON_PROPERTY_ALLOWED_CHARACTERS_REGEX_STR = "allowedCharactersRegexStr";
  @javax.annotation.Nullable
  private String allowedCharactersRegexStr;

  public static final String JSON_PROPERTY_DIGITS_REGEX_STR = "digitsRegexStr";
  @javax.annotation.Nullable
  private String digitsRegexStr;

  public static final String JSON_PROPERTY_UPPER_CASE_REGEX_STR = "upperCaseRegexStr";
  @javax.annotation.Nullable
  private String upperCaseRegexStr;

  public static final String JSON_PROPERTY_SPEC_SYMBOLS_REGEX_STR = "specSymbolsRegexStr";
  @javax.annotation.Nullable
  private String specSymbolsRegexStr;

  public PasswordSettingsDto() {
  }


  public PasswordSettingsDto minLength(@javax.annotation.Nonnull Integer minLength) {
    
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

  public PasswordSettingsDto upperCase(@javax.annotation.Nonnull Boolean upperCase) {
    
    this.upperCase = upperCase;
    return this;
  }

  /**
   * Specifies whether the password should contain the uppercase letters or not.
   * @return upperCase
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_UPPER_CASE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getUpperCase() {
    return upperCase;
  }


  @JsonProperty(JSON_PROPERTY_UPPER_CASE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUpperCase(@javax.annotation.Nonnull Boolean upperCase) {
    this.upperCase = upperCase;
  }

  public PasswordSettingsDto digits(@javax.annotation.Nonnull Boolean digits) {
    
    this.digits = digits;
    return this;
  }

  /**
   * Specifies whether the password should contain the digits or not.
   * @return digits
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DIGITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getDigits() {
    return digits;
  }


  @JsonProperty(JSON_PROPERTY_DIGITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDigits(@javax.annotation.Nonnull Boolean digits) {
    this.digits = digits;
  }

  public PasswordSettingsDto specSymbols(@javax.annotation.Nonnull Boolean specSymbols) {
    
    this.specSymbols = specSymbols;
    return this;
  }

  /**
   * Specifies whether the password should contain the special symbols or not.
   * @return specSymbols
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SPEC_SYMBOLS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getSpecSymbols() {
    return specSymbols;
  }


  @JsonProperty(JSON_PROPERTY_SPEC_SYMBOLS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSpecSymbols(@javax.annotation.Nonnull Boolean specSymbols) {
    this.specSymbols = specSymbols;
  }

  public PasswordSettingsDto allowedCharactersRegexStr(@javax.annotation.Nullable String allowedCharactersRegexStr) {
    
    this.allowedCharactersRegexStr = allowedCharactersRegexStr;
    return this;
  }

  /**
   * The allowed password characters in the regex string format.
   * @return allowedCharactersRegexStr
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOWED_CHARACTERS_REGEX_STR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAllowedCharactersRegexStr() {
    return allowedCharactersRegexStr;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED_CHARACTERS_REGEX_STR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAllowedCharactersRegexStr(@javax.annotation.Nullable String allowedCharactersRegexStr) {
    this.allowedCharactersRegexStr = allowedCharactersRegexStr;
  }

  public PasswordSettingsDto digitsRegexStr(@javax.annotation.Nullable String digitsRegexStr) {
    
    this.digitsRegexStr = digitsRegexStr;
    return this;
  }

  /**
   * The password digits in the regex string format.
   * @return digitsRegexStr
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIGITS_REGEX_STR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDigitsRegexStr() {
    return digitsRegexStr;
  }


  @JsonProperty(JSON_PROPERTY_DIGITS_REGEX_STR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDigitsRegexStr(@javax.annotation.Nullable String digitsRegexStr) {
    this.digitsRegexStr = digitsRegexStr;
  }

  public PasswordSettingsDto upperCaseRegexStr(@javax.annotation.Nullable String upperCaseRegexStr) {
    
    this.upperCaseRegexStr = upperCaseRegexStr;
    return this;
  }

  /**
   * The password uppercase letters in the regex string format.
   * @return upperCaseRegexStr
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPPER_CASE_REGEX_STR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUpperCaseRegexStr() {
    return upperCaseRegexStr;
  }


  @JsonProperty(JSON_PROPERTY_UPPER_CASE_REGEX_STR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUpperCaseRegexStr(@javax.annotation.Nullable String upperCaseRegexStr) {
    this.upperCaseRegexStr = upperCaseRegexStr;
  }

  public PasswordSettingsDto specSymbolsRegexStr(@javax.annotation.Nullable String specSymbolsRegexStr) {
    
    this.specSymbolsRegexStr = specSymbolsRegexStr;
    return this;
  }

  /**
   * The passaword special symbols in the regex string format.
   * @return specSymbolsRegexStr
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPEC_SYMBOLS_REGEX_STR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSpecSymbolsRegexStr() {
    return specSymbolsRegexStr;
  }


  @JsonProperty(JSON_PROPERTY_SPEC_SYMBOLS_REGEX_STR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSpecSymbolsRegexStr(@javax.annotation.Nullable String specSymbolsRegexStr) {
    this.specSymbolsRegexStr = specSymbolsRegexStr;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PasswordSettingsDto passwordSettingsDto = (PasswordSettingsDto) o;
    return Objects.equals(this.minLength, passwordSettingsDto.minLength) &&
        Objects.equals(this.upperCase, passwordSettingsDto.upperCase) &&
        Objects.equals(this.digits, passwordSettingsDto.digits) &&
        Objects.equals(this.specSymbols, passwordSettingsDto.specSymbols) &&
        Objects.equals(this.allowedCharactersRegexStr, passwordSettingsDto.allowedCharactersRegexStr) &&
        Objects.equals(this.digitsRegexStr, passwordSettingsDto.digitsRegexStr) &&
        Objects.equals(this.upperCaseRegexStr, passwordSettingsDto.upperCaseRegexStr) &&
        Objects.equals(this.specSymbolsRegexStr, passwordSettingsDto.specSymbolsRegexStr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minLength, upperCase, digits, specSymbols, allowedCharactersRegexStr, digitsRegexStr, upperCaseRegexStr, specSymbolsRegexStr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordSettingsDto {\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
    sb.append("    upperCase: ").append(toIndentedString(upperCase)).append("\n");
    sb.append("    digits: ").append(toIndentedString(digits)).append("\n");
    sb.append("    specSymbols: ").append(toIndentedString(specSymbols)).append("\n");
    sb.append("    allowedCharactersRegexStr: ").append(toIndentedString(allowedCharactersRegexStr)).append("\n");
    sb.append("    digitsRegexStr: ").append(toIndentedString(digitsRegexStr)).append("\n");
    sb.append("    upperCaseRegexStr: ").append(toIndentedString(upperCaseRegexStr)).append("\n");
    sb.append("    specSymbolsRegexStr: ").append(toIndentedString(specSymbolsRegexStr)).append("\n");
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

    // add `allowedCharactersRegexStr` to the URL query string
    if (getAllowedCharactersRegexStr() != null) {
      try {
        joiner.add(String.format("%sallowedCharactersRegexStr%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAllowedCharactersRegexStr()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `digitsRegexStr` to the URL query string
    if (getDigitsRegexStr() != null) {
      try {
        joiner.add(String.format("%sdigitsRegexStr%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDigitsRegexStr()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `upperCaseRegexStr` to the URL query string
    if (getUpperCaseRegexStr() != null) {
      try {
        joiner.add(String.format("%supperCaseRegexStr%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUpperCaseRegexStr()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `specSymbolsRegexStr` to the URL query string
    if (getSpecSymbolsRegexStr() != null) {
      try {
        joiner.add(String.format("%sspecSymbolsRegexStr%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSpecSymbolsRegexStr()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

