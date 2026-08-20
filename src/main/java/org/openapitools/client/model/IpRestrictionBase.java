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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * IpRestrictionBase
 */
@JsonPropertyOrder({
  IpRestrictionBase.JSON_PROPERTY_IP,
  IpRestrictionBase.JSON_PROPERTY_FOR_ADMIN
})

public class IpRestrictionBase {
  public static final String JSON_PROPERTY_IP = "ip";
  @javax.annotation.Nullable  private String ip;

  public static final String JSON_PROPERTY_FOR_ADMIN = "forAdmin";
  @javax.annotation.Nullable  private Boolean forAdmin;

  public IpRestrictionBase() {
  }


  public IpRestrictionBase ip(@javax.annotation.Nullable String ip) {
    
    this.ip = ip;
    return this;
  }

  /**
   * Get ip
   * @return ip
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IP, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIp() {
    return ip;
  }


  @JsonProperty(value = JSON_PROPERTY_IP, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIp(@javax.annotation.Nullable String ip) {
    this.ip = ip;
  }

  public IpRestrictionBase forAdmin(@javax.annotation.Nullable Boolean forAdmin) {
    
    this.forAdmin = forAdmin;
    return this;
  }

  /**
   * Get forAdmin
   * @return forAdmin
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_FOR_ADMIN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getForAdmin() {
    return forAdmin;
  }


  @JsonProperty(value = JSON_PROPERTY_FOR_ADMIN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForAdmin(@javax.annotation.Nullable Boolean forAdmin) {
    this.forAdmin = forAdmin;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpRestrictionBase ipRestrictionBase = (IpRestrictionBase) o;
    return Objects.equals(this.ip, ipRestrictionBase.ip) &&
        Objects.equals(this.forAdmin, ipRestrictionBase.forAdmin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ip, forAdmin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpRestrictionBase {\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    forAdmin: ").append(toIndentedString(forAdmin)).append("\n");
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

    // add `ip` to the URL query string
    if (getIp() != null) {
      try {
        joiner.add(String.format("%sip%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIp()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `forAdmin` to the URL query string
    if (getForAdmin() != null) {
      try {
        joiner.add(String.format("%sforAdmin%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getForAdmin()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

