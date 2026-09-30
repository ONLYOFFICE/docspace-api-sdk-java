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
 * Represents the Docs Connect server information.
 */
@JsonPropertyOrder({
  DocsCloudServerInfo.JSON_PROPERTY_VERSION,
  DocsCloudServerInfo.JSON_PROPERTY_PACKAGE_TYPE,
  DocsCloudServerInfo.JSON_PROPERTY_DATE
})

public class DocsCloudServerInfo {
  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable  private JsonNullable<String> version = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PACKAGE_TYPE = "packageType";
  @javax.annotation.Nullable  private JsonNullable<String> packageType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DATE = "date";
  @javax.annotation.Nullable  private OffsetDateTime date;

  public DocsCloudServerInfo() {
  }


  public DocsCloudServerInfo version(@javax.annotation.Nullable String version) {
    this.version = JsonNullable.<String>of(version);
    
    return this;
  }

  /**
   * The server version.
   * @return version
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getVersion() {
        return version.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getVersion_JsonNullable() {
    return version;
  }
  
  @JsonProperty(JSON_PROPERTY_VERSION)
  public void setVersion_JsonNullable(JsonNullable<String> version) {
    this.version = version;
  }

  public void setVersion(@javax.annotation.Nullable String version) {
    this.version = JsonNullable.<String>of(version);
  }

  public DocsCloudServerInfo packageType(@javax.annotation.Nullable String packageType) {
    this.packageType = JsonNullable.<String>of(packageType);
    
    return this;
  }

  /**
   * The server package type (Open Source, Enterprise Edition or Developer Edition).
   * @return packageType
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getPackageType() {
        return packageType.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_PACKAGE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getPackageType_JsonNullable() {
    return packageType;
  }
  
  @JsonProperty(JSON_PROPERTY_PACKAGE_TYPE)
  public void setPackageType_JsonNullable(JsonNullable<String> packageType) {
    this.packageType = packageType;
  }

  public void setPackageType(@javax.annotation.Nullable String packageType) {
    this.packageType = JsonNullable.<String>of(packageType);
  }

  public DocsCloudServerInfo date(@javax.annotation.Nullable OffsetDateTime date) {
    
    this.date = date;
    return this;
  }

  /**
   * The server build date.
   * @return date
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDate() {
    return date;
  }


  @JsonProperty(value = JSON_PROPERTY_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(@javax.annotation.Nullable OffsetDateTime date) {
    this.date = date;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocsCloudServerInfo docsCloudServerInfo = (DocsCloudServerInfo) o;
    return equalsNullable(this.version, docsCloudServerInfo.version) &&
        equalsNullable(this.packageType, docsCloudServerInfo.packageType) &&
        Objects.equals(this.date, docsCloudServerInfo.date);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(version), hashCodeNullable(packageType), date);
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
    sb.append("class DocsCloudServerInfo {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

    // add `version` to the URL query string
    if (getVersion() != null) {
      try {
        joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `packageType` to the URL query string
    if (getPackageType() != null) {
      try {
        joiner.add(String.format("%spackageType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPackageType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `date` to the URL query string
    if (getDate() != null) {
      try {
        joiner.add(String.format("%sdate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

