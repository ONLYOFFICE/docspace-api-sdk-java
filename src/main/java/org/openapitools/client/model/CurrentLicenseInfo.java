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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The current license information.
 */
@JsonPropertyOrder({
  CurrentLicenseInfo.JSON_PROPERTY_TRIAL,
  CurrentLicenseInfo.JSON_PROPERTY_DUE_DATE
})

public class CurrentLicenseInfo {
  public static final String JSON_PROPERTY_TRIAL = "trial";
  @javax.annotation.Nonnull
  private Boolean trial;

  public static final String JSON_PROPERTY_DUE_DATE = "dueDate";
  @javax.annotation.Nonnull
  private OffsetDateTime dueDate;

  public CurrentLicenseInfo() {
  }

  public CurrentLicenseInfo trial(@javax.annotation.Nonnull Boolean trial) {
    
    this.trial = trial;
    return this;
  }

  /**
   * Specifies whether the license is trial or not.
   * @return trial
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TRIAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getTrial() {
    return trial;
  }


  @JsonProperty(JSON_PROPERTY_TRIAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTrial(@javax.annotation.Nonnull Boolean trial) {
    this.trial = trial;
  }

  public CurrentLicenseInfo dueDate(@javax.annotation.Nonnull OffsetDateTime dueDate) {
    
    this.dueDate = dueDate;
    return this;
  }

  /**
   * The date when the license expires.
   * @return dueDate
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DUE_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getDueDate() {
    return dueDate;
  }


  @JsonProperty(JSON_PROPERTY_DUE_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDueDate(@javax.annotation.Nonnull OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentLicenseInfo currentLicenseInfo = (CurrentLicenseInfo) o;
    return Objects.equals(this.trial, currentLicenseInfo.trial) &&
        Objects.equals(this.dueDate, currentLicenseInfo.dueDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trial, dueDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentLicenseInfo {\n");
    sb.append("    trial: ").append(toIndentedString(trial)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
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

    // add `trial` to the URL query string
    if (getTrial() != null) {
      try {
        joiner.add(String.format("%strial%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTrial()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `dueDate` to the URL query string
    if (getDueDate() != null) {
      try {
        joiner.add(String.format("%sdueDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDueDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

