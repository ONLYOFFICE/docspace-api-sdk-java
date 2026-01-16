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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.IpRestrictionBase;
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
 * The parameters for configuring new IP restriction settings.
 */
@JsonPropertyOrder({
  IpRestrictionsDto.JSON_PROPERTY_IP_RESTRICTIONS,
  IpRestrictionsDto.JSON_PROPERTY_ENABLE
})

public class IpRestrictionsDto {
  public static final String JSON_PROPERTY_IP_RESTRICTIONS = "ipRestrictions";
  @javax.annotation.Nullable
  private List<IpRestrictionBase> ipRestrictions;

  public static final String JSON_PROPERTY_ENABLE = "enable";
  @javax.annotation.Nullable
  private JsonNullable<Boolean> enable = JsonNullable.<Boolean>undefined();

  public IpRestrictionsDto() {
  }


  public IpRestrictionsDto ipRestrictions(@javax.annotation.Nullable List<IpRestrictionBase> ipRestrictions) {
    
    this.ipRestrictions = ipRestrictions;
    return this;
  }

  public IpRestrictionsDto addIpRestrictionsItem(IpRestrictionBase ipRestrictionsItem) {
    if (this.ipRestrictions == null) {
      this.ipRestrictions = new ArrayList<>();
    }
    this.ipRestrictions.add(ipRestrictionsItem);
    return this;
  }

  /**
   * The list of IP restriction addresses.
   * @return ipRestrictions
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IP_RESTRICTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<IpRestrictionBase> getIpRestrictions() {
    return ipRestrictions;
  }


  @JsonProperty(JSON_PROPERTY_IP_RESTRICTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIpRestrictions(@javax.annotation.Nullable List<IpRestrictionBase> ipRestrictions) {
    this.ipRestrictions = ipRestrictions;
  }

  public IpRestrictionsDto enable(@javax.annotation.Nullable Boolean enable) {
    this.enable = JsonNullable.<Boolean>of(enable);
    
    return this;
  }

  /**
   * Specifies whether to enable IP restrictions or not.
   * @return enable
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getEnable() {
        return enable.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getEnable_JsonNullable() {
    return enable;
  }
  
  @JsonProperty(JSON_PROPERTY_ENABLE)
  public void setEnable_JsonNullable(JsonNullable<Boolean> enable) {
    this.enable = enable;
  }

  public void setEnable(@javax.annotation.Nullable Boolean enable) {
    this.enable = JsonNullable.<Boolean>of(enable);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpRestrictionsDto ipRestrictionsDto = (IpRestrictionsDto) o;
    return Objects.equals(this.ipRestrictions, ipRestrictionsDto.ipRestrictions) &&
        equalsNullable(this.enable, ipRestrictionsDto.enable);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipRestrictions, hashCodeNullable(enable));
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
    sb.append("class IpRestrictionsDto {\n");
    sb.append("    ipRestrictions: ").append(toIndentedString(ipRestrictions)).append("\n");
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

    // add `ipRestrictions` to the URL query string
    if (getIpRestrictions() != null) {
      for (int i = 0; i < getIpRestrictions().size(); i++) {
        if (getIpRestrictions().get(i) != null) {
          joiner.add(getIpRestrictions().get(i).toUrlQueryString(String.format("%sipRestrictions%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
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

