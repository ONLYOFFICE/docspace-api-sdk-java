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
 * The backups of a portal, split by who paid for them.
 */
@JsonPropertyOrder({
  BackupsCountResultDto.JSON_PROPERTY_FREE,
  BackupsCountResultDto.JSON_PROPERTY_PAID
})

public class BackupsCountResultDto {
  public static final String JSON_PROPERTY_FREE = "free";
  @javax.annotation.Nullable  private Integer free;

  public static final String JSON_PROPERTY_PAID = "paid";
  @javax.annotation.Nullable  private Integer paid;

  public BackupsCountResultDto() {
  }


  public BackupsCountResultDto free(@javax.annotation.Nullable Integer free) {
    
    this.free = free;
    return this;
  }

  /**
   * The number of backups covered by the free monthly allowance.
   * @return free
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_FREE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFree() {
    return free;
  }


  @JsonProperty(value = JSON_PROPERTY_FREE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFree(@javax.annotation.Nullable Integer free) {
    this.free = free;
  }

  public BackupsCountResultDto paid(@javax.annotation.Nullable Integer paid) {
    
    this.paid = paid;
    return this;
  }

  /**
   * The number of backups charged to the portal wallet.
   * @return paid
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PAID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPaid() {
    return paid;
  }


  @JsonProperty(value = JSON_PROPERTY_PAID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaid(@javax.annotation.Nullable Integer paid) {
    this.paid = paid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackupsCountResultDto backupsCountResultDto = (BackupsCountResultDto) o;
    return Objects.equals(this.free, backupsCountResultDto.free) &&
        Objects.equals(this.paid, backupsCountResultDto.paid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(free, paid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackupsCountResultDto {\n");
    sb.append("    free: ").append(toIndentedString(free)).append("\n");
    sb.append("    paid: ").append(toIndentedString(paid)).append("\n");
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

    // add `free` to the URL query string
    if (getFree() != null) {
      try {
        joiner.add(String.format("%sfree%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFree()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `paid` to the URL query string
    if (getPaid() != null) {
      try {
        joiner.add(String.format("%spaid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPaid()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

