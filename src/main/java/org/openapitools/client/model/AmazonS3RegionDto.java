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
 * An Amazon S3 region.
 */
@JsonPropertyOrder({
  AmazonS3RegionDto.JSON_PROPERTY_SYSTEM_NAME,
  AmazonS3RegionDto.JSON_PROPERTY_DISPLAY_NAME,
  AmazonS3RegionDto.JSON_PROPERTY_PARTITION_NAME,
  AmazonS3RegionDto.JSON_PROPERTY_PARTITION_DNS_SUFFIX,
  AmazonS3RegionDto.JSON_PROPERTY_PARTITION_REGION_REGEX,
  AmazonS3RegionDto.JSON_PROPERTY_HOSTNAME_TEMPLATE
})

public class AmazonS3RegionDto {
  public static final String JSON_PROPERTY_SYSTEM_NAME = "systemName";
  @javax.annotation.Nullable  private JsonNullable<String> systemName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  @javax.annotation.Nullable  private JsonNullable<String> displayName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PARTITION_NAME = "partitionName";
  @javax.annotation.Nullable  private JsonNullable<String> partitionName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PARTITION_DNS_SUFFIX = "partitionDnsSuffix";
  @javax.annotation.Nullable  private JsonNullable<String> partitionDnsSuffix = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PARTITION_REGION_REGEX = "partitionRegionRegex";
  @javax.annotation.Nullable  private JsonNullable<String> partitionRegionRegex = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_HOSTNAME_TEMPLATE = "hostnameTemplate";
  @javax.annotation.Nullable  private JsonNullable<String> hostnameTemplate = JsonNullable.<String>undefined();

  public AmazonS3RegionDto() {
  }


  public AmazonS3RegionDto systemName(@javax.annotation.Nullable String systemName) {
    this.systemName = JsonNullable.<String>of(systemName);
    
    return this;
  }

  /**
   * The region code to send as the region value when configuring an Amazon S3 storage or backup target. It is  the one field of this object that is an argument elsewhere; a code the server does not list here cannot be  reached, so pick one from this list rather than typing it.
   * @return systemName
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getSystemName() {
        return systemName.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SYSTEM_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getSystemName_JsonNullable() {
    return systemName;
  }
  
  @JsonProperty(JSON_PROPERTY_SYSTEM_NAME)
  public void setSystemName_JsonNullable(JsonNullable<String> systemName) {
    this.systemName = systemName;
  }

  public void setSystemName(@javax.annotation.Nullable String systemName) {
    this.systemName = JsonNullable.<String>of(systemName);
  }

  public AmazonS3RegionDto displayName(@javax.annotation.Nullable String displayName) {
    this.displayName = JsonNullable.<String>of(displayName);
    
    return this;
  }

  /**
   * The region name as Amazon writes it, in English regardless of the portal language, for showing in a  picker next to `systemName`.
   * @return displayName
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getDisplayName() {
        return displayName.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_DISPLAY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDisplayName_JsonNullable() {
    return displayName;
  }
  
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  public void setDisplayName_JsonNullable(JsonNullable<String> displayName) {
    this.displayName = displayName;
  }

  public void setDisplayName(@javax.annotation.Nullable String displayName) {
    this.displayName = JsonNullable.<String>of(displayName);
  }

  public AmazonS3RegionDto partitionName(@javax.annotation.Nullable String partitionName) {
    this.partitionName = JsonNullable.<String>of(partitionName);
    
    return this;
  }

  /**
   * The Amazon partition the region sits in - the ordinary commercial cloud, the Chinese one, or a government  one. Regions of different partitions are not reachable with the same credentials.
   * @return partitionName
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getPartitionName() {
        return partitionName.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_PARTITION_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getPartitionName_JsonNullable() {
    return partitionName;
  }
  
  @JsonProperty(JSON_PROPERTY_PARTITION_NAME)
  public void setPartitionName_JsonNullable(JsonNullable<String> partitionName) {
    this.partitionName = partitionName;
  }

  public void setPartitionName(@javax.annotation.Nullable String partitionName) {
    this.partitionName = JsonNullable.<String>of(partitionName);
  }

  public AmazonS3RegionDto partitionDnsSuffix(@javax.annotation.Nullable String partitionDnsSuffix) {
    this.partitionDnsSuffix = JsonNullable.<String>of(partitionDnsSuffix);
    
    return this;
  }

  /**
   * The domain the partition's service host names end in, which differs from partition to partition.
   * @return partitionDnsSuffix
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getPartitionDnsSuffix() {
        return partitionDnsSuffix.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_PARTITION_DNS_SUFFIX, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getPartitionDnsSuffix_JsonNullable() {
    return partitionDnsSuffix;
  }
  
  @JsonProperty(JSON_PROPERTY_PARTITION_DNS_SUFFIX)
  public void setPartitionDnsSuffix_JsonNullable(JsonNullable<String> partitionDnsSuffix) {
    this.partitionDnsSuffix = partitionDnsSuffix;
  }

  public void setPartitionDnsSuffix(@javax.annotation.Nullable String partitionDnsSuffix) {
    this.partitionDnsSuffix = JsonNullable.<String>of(partitionDnsSuffix);
  }

  public AmazonS3RegionDto partitionRegionRegex(@javax.annotation.Nullable String partitionRegionRegex) {
    this.partitionRegionRegex = JsonNullable.<String>of(partitionRegionRegex);
    
    return this;
  }

  /**
   * The pattern every region code of this partition matches, for validating a code before sending it.
   * @return partitionRegionRegex
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getPartitionRegionRegex() {
        return partitionRegionRegex.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_PARTITION_REGION_REGEX, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getPartitionRegionRegex_JsonNullable() {
    return partitionRegionRegex;
  }
  
  @JsonProperty(JSON_PROPERTY_PARTITION_REGION_REGEX)
  public void setPartitionRegionRegex_JsonNullable(JsonNullable<String> partitionRegionRegex) {
    this.partitionRegionRegex = partitionRegionRegex;
  }

  public void setPartitionRegionRegex(@javax.annotation.Nullable String partitionRegionRegex) {
    this.partitionRegionRegex = JsonNullable.<String>of(partitionRegionRegex);
  }

  public AmazonS3RegionDto hostnameTemplate(@javax.annotation.Nullable String hostnameTemplate) {
    this.hostnameTemplate = JsonNullable.<String>of(hostnameTemplate);
    
    return this;
  }

  /**
   * How a service host name of the partition is assembled, with `{service}`, `{region}` and `{dnsSuffix}` to  be filled in. It is reference material - the portal builds its own endpoints from `systemName`.
   * @return hostnameTemplate
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getHostnameTemplate() {
        return hostnameTemplate.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_HOSTNAME_TEMPLATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getHostnameTemplate_JsonNullable() {
    return hostnameTemplate;
  }
  
  @JsonProperty(JSON_PROPERTY_HOSTNAME_TEMPLATE)
  public void setHostnameTemplate_JsonNullable(JsonNullable<String> hostnameTemplate) {
    this.hostnameTemplate = hostnameTemplate;
  }

  public void setHostnameTemplate(@javax.annotation.Nullable String hostnameTemplate) {
    this.hostnameTemplate = JsonNullable.<String>of(hostnameTemplate);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AmazonS3RegionDto amazonS3RegionDto = (AmazonS3RegionDto) o;
    return equalsNullable(this.systemName, amazonS3RegionDto.systemName) &&
        equalsNullable(this.displayName, amazonS3RegionDto.displayName) &&
        equalsNullable(this.partitionName, amazonS3RegionDto.partitionName) &&
        equalsNullable(this.partitionDnsSuffix, amazonS3RegionDto.partitionDnsSuffix) &&
        equalsNullable(this.partitionRegionRegex, amazonS3RegionDto.partitionRegionRegex) &&
        equalsNullable(this.hostnameTemplate, amazonS3RegionDto.hostnameTemplate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(systemName), hashCodeNullable(displayName), hashCodeNullable(partitionName), hashCodeNullable(partitionDnsSuffix), hashCodeNullable(partitionRegionRegex), hashCodeNullable(hostnameTemplate));
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
    sb.append("class AmazonS3RegionDto {\n");
    sb.append("    systemName: ").append(toIndentedString(systemName)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    partitionName: ").append(toIndentedString(partitionName)).append("\n");
    sb.append("    partitionDnsSuffix: ").append(toIndentedString(partitionDnsSuffix)).append("\n");
    sb.append("    partitionRegionRegex: ").append(toIndentedString(partitionRegionRegex)).append("\n");
    sb.append("    hostnameTemplate: ").append(toIndentedString(hostnameTemplate)).append("\n");
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

    // add `systemName` to the URL query string
    if (getSystemName() != null) {
      try {
        joiner.add(String.format("%ssystemName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSystemName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `displayName` to the URL query string
    if (getDisplayName() != null) {
      try {
        joiner.add(String.format("%sdisplayName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDisplayName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `partitionName` to the URL query string
    if (getPartitionName() != null) {
      try {
        joiner.add(String.format("%spartitionName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPartitionName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `partitionDnsSuffix` to the URL query string
    if (getPartitionDnsSuffix() != null) {
      try {
        joiner.add(String.format("%spartitionDnsSuffix%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPartitionDnsSuffix()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `partitionRegionRegex` to the URL query string
    if (getPartitionRegionRegex() != null) {
      try {
        joiner.add(String.format("%spartitionRegionRegex%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPartitionRegionRegex()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `hostnameTemplate` to the URL query string
    if (getHostnameTemplate() != null) {
      try {
        joiner.add(String.format("%shostnameTemplate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHostnameTemplate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

