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
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Represents the license information of a DocsCloud tenant.
 */
@JsonPropertyOrder({
  DocsCloudLicenseInfo.JSON_PROPERTY_VALID,
  DocsCloudLicenseInfo.JSON_PROPERTY_TRIAL,
  DocsCloudLicenseInfo.JSON_PROPERTY_BUILD_DATE
})

public class DocsCloudLicenseInfo {
  public static final String JSON_PROPERTY_VALID = "valid";
  @javax.annotation.Nullable  private OffsetDateTime valid;

  public static final String JSON_PROPERTY_TRIAL = "trial";
  @javax.annotation.Nullable  private Boolean trial;

  public static final String JSON_PROPERTY_BUILD_DATE = "buildDate";
  @javax.annotation.Nullable  private OffsetDateTime buildDate;

  public DocsCloudLicenseInfo() {
  }


  public DocsCloudLicenseInfo valid(@javax.annotation.Nullable OffsetDateTime valid) {
    
    this.valid = valid;
    return this;
  }

  /**
   * The date and time until which the license is valid.
   * @return valid
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_VALID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getValid() {
    return valid;
  }


  @JsonProperty(value = JSON_PROPERTY_VALID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValid(@javax.annotation.Nullable OffsetDateTime valid) {
    this.valid = valid;
  }

  public DocsCloudLicenseInfo trial(@javax.annotation.Nullable Boolean trial) {
    
    this.trial = trial;
    return this;
  }

  /**
   * Whether the license is a trial.
   * @return trial
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TRIAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTrial() {
    return trial;
  }


  @JsonProperty(value = JSON_PROPERTY_TRIAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrial(@javax.annotation.Nullable Boolean trial) {
    this.trial = trial;
  }

  public DocsCloudLicenseInfo buildDate(@javax.annotation.Nullable OffsetDateTime buildDate) {
    
    this.buildDate = buildDate;
    return this;
  }

  /**
   * The license build date.
   * @return buildDate
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_BUILD_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getBuildDate() {
    return buildDate;
  }


  @JsonProperty(value = JSON_PROPERTY_BUILD_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuildDate(@javax.annotation.Nullable OffsetDateTime buildDate) {
    this.buildDate = buildDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocsCloudLicenseInfo docsCloudLicenseInfo = (DocsCloudLicenseInfo) o;
    return Objects.equals(this.valid, docsCloudLicenseInfo.valid) &&
        Objects.equals(this.trial, docsCloudLicenseInfo.trial) &&
        Objects.equals(this.buildDate, docsCloudLicenseInfo.buildDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, trial, buildDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocsCloudLicenseInfo {\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    trial: ").append(toIndentedString(trial)).append("\n");
    sb.append("    buildDate: ").append(toIndentedString(buildDate)).append("\n");
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

    // add `valid` to the URL query string
    if (getValid() != null) {
      try {
        joiner.add(String.format("%svalid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getValid()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `trial` to the URL query string
    if (getTrial() != null) {
      try {
        joiner.add(String.format("%strial%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTrial()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `buildDate` to the URL query string
    if (getBuildDate() != null) {
      try {
        joiner.add(String.format("%sbuildDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBuildDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

