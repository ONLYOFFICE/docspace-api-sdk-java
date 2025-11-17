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
 * The parameters required for the mobile phone verification.
 */
@JsonPropertyOrder({
  MobileRequestsDto.JSON_PROPERTY_MOBILE_PHONE
})

public class MobileRequestsDto {
  public static final String JSON_PROPERTY_MOBILE_PHONE = "mobilePhone";
  @javax.annotation.Nullable
  private JsonNullable<String> mobilePhone = JsonNullable.<String>undefined();

  public MobileRequestsDto() {
  }

  public MobileRequestsDto mobilePhone(@javax.annotation.Nullable String mobilePhone) {
    this.mobilePhone = JsonNullable.<String>of(mobilePhone);
    
    return this;
  }

  /**
   * The user&#39;s mobile phone number.
   * @return mobilePhone
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getMobilePhone() {
        return mobilePhone.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MOBILE_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMobilePhone_JsonNullable() {
    return mobilePhone;
  }
  
  @JsonProperty(JSON_PROPERTY_MOBILE_PHONE)
  public void setMobilePhone_JsonNullable(JsonNullable<String> mobilePhone) {
    this.mobilePhone = mobilePhone;
  }

  public void setMobilePhone(@javax.annotation.Nullable String mobilePhone) {
    this.mobilePhone = JsonNullable.<String>of(mobilePhone);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MobileRequestsDto mobileRequestsDto = (MobileRequestsDto) o;
    return equalsNullable(this.mobilePhone, mobileRequestsDto.mobilePhone);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(mobilePhone));
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
    sb.append("class MobileRequestsDto {\n");
    sb.append("    mobilePhone: ").append(toIndentedString(mobilePhone)).append("\n");
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

    // add `mobilePhone` to the URL query string
    if (getMobilePhone() != null) {
      try {
        joiner.add(String.format("%smobilePhone%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMobilePhone()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

