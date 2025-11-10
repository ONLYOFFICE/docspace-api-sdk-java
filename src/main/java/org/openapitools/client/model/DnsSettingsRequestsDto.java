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
 * The request parameters for managing the DNS (Domain Name System) settings.
 */
@JsonPropertyOrder({
  DnsSettingsRequestsDto.JSON_PROPERTY_DNS_NAME,
  DnsSettingsRequestsDto.JSON_PROPERTY_ENABLE
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class DnsSettingsRequestsDto {
  public static final String JSON_PROPERTY_DNS_NAME = "dnsName";
  @javax.annotation.Nullable
  private JsonNullable<String> dnsName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ENABLE = "enable";
  @javax.annotation.Nullable
  private Boolean enable;

  public DnsSettingsRequestsDto() {
  }

  public DnsSettingsRequestsDto dnsName(@javax.annotation.Nullable String dnsName) {
    this.dnsName = JsonNullable.<String>of(dnsName);
    
    return this;
  }

  /**
   * The DNS (Domain Name System) configuration name.
   * @return dnsName
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getDnsName() {
        return dnsName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DNS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDnsName_JsonNullable() {
    return dnsName;
  }
  
  @JsonProperty(JSON_PROPERTY_DNS_NAME)
  public void setDnsName_JsonNullable(JsonNullable<String> dnsName) {
    this.dnsName = dnsName;
  }

  public void setDnsName(@javax.annotation.Nullable String dnsName) {
    this.dnsName = JsonNullable.<String>of(dnsName);
  }

  public DnsSettingsRequestsDto enable(@javax.annotation.Nullable Boolean enable) {
    
    this.enable = enable;
    return this;
  }

  /**
   * Specifies whether the DNS settings are enabled.
   * @return enable
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnable() {
    return enable;
  }


  @JsonProperty(JSON_PROPERTY_ENABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnable(@javax.annotation.Nullable Boolean enable) {
    this.enable = enable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsSettingsRequestsDto dnsSettingsRequestsDto = (DnsSettingsRequestsDto) o;
    return equalsNullable(this.dnsName, dnsSettingsRequestsDto.dnsName) &&
        Objects.equals(this.enable, dnsSettingsRequestsDto.enable);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(dnsName), enable);
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
    sb.append("class DnsSettingsRequestsDto {\n");
    sb.append("    dnsName: ").append(toIndentedString(dnsName)).append("\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
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

    // add `dnsName` to the URL query string
    if (getDnsName() != null) {
      try {
        joiner.add(String.format("%sdnsName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDnsName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `enable` to the URL query string
    if (getEnable() != null) {
      try {
        joiner.add(String.format("%senable%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnable()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

