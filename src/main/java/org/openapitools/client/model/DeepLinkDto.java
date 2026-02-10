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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The deep link parameters.
 */
@JsonPropertyOrder({
  DeepLinkDto.JSON_PROPERTY_ANDROID_PACKAGE_NAME,
  DeepLinkDto.JSON_PROPERTY_URL,
  DeepLinkDto.JSON_PROPERTY_IOS_PACKAGE_ID
})

public class DeepLinkDto {
  public static final String JSON_PROPERTY_ANDROID_PACKAGE_NAME = "androidPackageName";
  @javax.annotation.Nullable
  private String androidPackageName;

  public static final String JSON_PROPERTY_URL = "url";
  @javax.annotation.Nullable
  private String url;

  public static final String JSON_PROPERTY_IOS_PACKAGE_ID = "iosPackageId";
  @javax.annotation.Nullable
  private String iosPackageId;

  public DeepLinkDto() {
  }


  public DeepLinkDto androidPackageName(@javax.annotation.Nullable String androidPackageName) {
    
    this.androidPackageName = androidPackageName;
    return this;
  }

  /**
   * The Android package name.
   * @return androidPackageName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANDROID_PACKAGE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAndroidPackageName() {
    return androidPackageName;
  }


  @JsonProperty(JSON_PROPERTY_ANDROID_PACKAGE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAndroidPackageName(@javax.annotation.Nullable String androidPackageName) {
    this.androidPackageName = androidPackageName;
  }

  public DeepLinkDto url(@javax.annotation.Nullable String url) {
    
    this.url = url;
    return this;
  }

  /**
   * The deep link URL.
   * @return url
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUrl(@javax.annotation.Nullable String url) {
    this.url = url;
  }

  public DeepLinkDto iosPackageId(@javax.annotation.Nullable String iosPackageId) {
    
    this.iosPackageId = iosPackageId;
    return this;
  }

  /**
   * The deep link IOS package ID.
   * @return iosPackageId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IOS_PACKAGE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIosPackageId() {
    return iosPackageId;
  }


  @JsonProperty(JSON_PROPERTY_IOS_PACKAGE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIosPackageId(@javax.annotation.Nullable String iosPackageId) {
    this.iosPackageId = iosPackageId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeepLinkDto deepLinkDto = (DeepLinkDto) o;
    return Objects.equals(this.androidPackageName, deepLinkDto.androidPackageName) &&
        Objects.equals(this.url, deepLinkDto.url) &&
        Objects.equals(this.iosPackageId, deepLinkDto.iosPackageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(androidPackageName, url, iosPackageId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeepLinkDto {\n");
    sb.append("    androidPackageName: ").append(toIndentedString(androidPackageName)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    iosPackageId: ").append(toIndentedString(iosPackageId)).append("\n");
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

    // add `androidPackageName` to the URL query string
    if (getAndroidPackageName() != null) {
      try {
        joiner.add(String.format("%sandroidPackageName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAndroidPackageName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `url` to the URL query string
    if (getUrl() != null) {
      try {
        joiner.add(String.format("%surl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `iosPackageId` to the URL query string
    if (getIosPackageId() != null) {
      try {
        joiner.add(String.format("%siosPackageId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIosPackageId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

