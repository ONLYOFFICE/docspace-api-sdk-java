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
 * The TFA app code.
 */
@JsonPropertyOrder({
  TfaAppCodeDto.JSON_PROPERTY_IS_USED,
  TfaAppCodeDto.JSON_PROPERTY_CODE
})

public class TfaAppCodeDto {
  public static final String JSON_PROPERTY_IS_USED = "isUsed";
  @javax.annotation.Nullable  private Boolean isUsed;

  public static final String JSON_PROPERTY_CODE = "code";
  @javax.annotation.Nullable  private JsonNullable<String> code = JsonNullable.<String>undefined();

  public TfaAppCodeDto() {
  }


  public TfaAppCodeDto isUsed(@javax.annotation.Nullable Boolean isUsed) {
    
    this.isUsed = isUsed;
    return this;
  }

  /**
   * The TFA app code usage status.
   * @return isUsed
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IS_USED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsUsed() {
    return isUsed;
  }


  @JsonProperty(value = JSON_PROPERTY_IS_USED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsUsed(@javax.annotation.Nullable Boolean isUsed) {
    this.isUsed = isUsed;
  }

  public TfaAppCodeDto code(@javax.annotation.Nullable String code) {
    this.code = JsonNullable.<String>of(code);
    
    return this;
  }

  /**
   * The TFA app code.
   * @return code
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getCode() {
        return code.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_CODE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getCode_JsonNullable() {
    return code;
  }
  
  @JsonProperty(JSON_PROPERTY_CODE)
  public void setCode_JsonNullable(JsonNullable<String> code) {
    this.code = code;
  }

  public void setCode(@javax.annotation.Nullable String code) {
    this.code = JsonNullable.<String>of(code);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TfaAppCodeDto tfaAppCodeDto = (TfaAppCodeDto) o;
    return Objects.equals(this.isUsed, tfaAppCodeDto.isUsed) &&
        equalsNullable(this.code, tfaAppCodeDto.code);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(isUsed, hashCodeNullable(code));
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
    sb.append("class TfaAppCodeDto {\n");
    sb.append("    isUsed: ").append(toIndentedString(isUsed)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

    // add `isUsed` to the URL query string
    if (getIsUsed() != null) {
      try {
        joiner.add(String.format("%sisUsed%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsUsed()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `code` to the URL query string
    if (getCode() != null) {
      try {
        joiner.add(String.format("%scode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCode()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

