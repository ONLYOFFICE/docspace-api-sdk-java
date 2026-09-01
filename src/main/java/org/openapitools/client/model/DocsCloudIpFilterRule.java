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
 * Represents the IP filter rule of a DocsCloud tenant.
 */
@JsonPropertyOrder({
  DocsCloudIpFilterRule.JSON_PROPERTY_ADDRESS,
  DocsCloudIpFilterRule.JSON_PROPERTY_ALLOWED
})

public class DocsCloudIpFilterRule {
  public static final String JSON_PROPERTY_ADDRESS = "address";
  @javax.annotation.Nullable  private JsonNullable<String> address = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ALLOWED = "allowed";
  @javax.annotation.Nullable  private Boolean allowed;

  public DocsCloudIpFilterRule() {
  }


  public DocsCloudIpFilterRule address(@javax.annotation.Nullable String address) {
    this.address = JsonNullable.<String>of(address);
    
    return this;
  }

  /**
   * The IP address.
   * @return address
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getAddress() {
        return address.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ADDRESS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getAddress_JsonNullable() {
    return address;
  }
  
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  public void setAddress_JsonNullable(JsonNullable<String> address) {
    this.address = address;
  }

  public void setAddress(@javax.annotation.Nullable String address) {
    this.address = JsonNullable.<String>of(address);
  }

  public DocsCloudIpFilterRule allowed(@javax.annotation.Nullable Boolean allowed) {
    
    this.allowed = allowed;
    return this;
  }

  /**
   * Whether the IP address is allowed.
   * @return allowed
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ALLOWED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowed() {
    return allowed;
  }


  @JsonProperty(value = JSON_PROPERTY_ALLOWED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowed(@javax.annotation.Nullable Boolean allowed) {
    this.allowed = allowed;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocsCloudIpFilterRule docsCloudIpFilterRule = (DocsCloudIpFilterRule) o;
    return equalsNullable(this.address, docsCloudIpFilterRule.address) &&
        Objects.equals(this.allowed, docsCloudIpFilterRule.allowed);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(address), allowed);
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
    sb.append("class DocsCloudIpFilterRule {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    allowed: ").append(toIndentedString(allowed)).append("\n");
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

    // add `address` to the URL query string
    if (getAddress() != null) {
      try {
        joiner.add(String.format("%saddress%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAddress()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `allowed` to the URL query string
    if (getAllowed() != null) {
      try {
        joiner.add(String.format("%sallowed%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAllowed()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

