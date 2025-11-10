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
 * MigratingApiFiles
 */
@JsonPropertyOrder({
  MigratingApiFiles.JSON_PROPERTY_FOLDERS_COUNT,
  MigratingApiFiles.JSON_PROPERTY_FILES_COUNT,
  MigratingApiFiles.JSON_PROPERTY_BYTES_TOTAL
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class MigratingApiFiles {
  public static final String JSON_PROPERTY_FOLDERS_COUNT = "foldersCount";
  @javax.annotation.Nullable
  private Integer foldersCount;

  public static final String JSON_PROPERTY_FILES_COUNT = "filesCount";
  @javax.annotation.Nullable
  private Integer filesCount;

  public static final String JSON_PROPERTY_BYTES_TOTAL = "bytesTotal";
  @javax.annotation.Nullable
  private Long bytesTotal;

  public MigratingApiFiles() {
  }

  public MigratingApiFiles foldersCount(@javax.annotation.Nullable Integer foldersCount) {
    
    this.foldersCount = foldersCount;
    return this;
  }

  /**
   * Get foldersCount
   * @return foldersCount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FOLDERS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFoldersCount() {
    return foldersCount;
  }


  @JsonProperty(JSON_PROPERTY_FOLDERS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFoldersCount(@javax.annotation.Nullable Integer foldersCount) {
    this.foldersCount = foldersCount;
  }

  public MigratingApiFiles filesCount(@javax.annotation.Nullable Integer filesCount) {
    
    this.filesCount = filesCount;
    return this;
  }

  /**
   * Get filesCount
   * @return filesCount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFilesCount() {
    return filesCount;
  }


  @JsonProperty(JSON_PROPERTY_FILES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilesCount(@javax.annotation.Nullable Integer filesCount) {
    this.filesCount = filesCount;
  }

  public MigratingApiFiles bytesTotal(@javax.annotation.Nullable Long bytesTotal) {
    
    this.bytesTotal = bytesTotal;
    return this;
  }

  /**
   * Get bytesTotal
   * @return bytesTotal
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BYTES_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getBytesTotal() {
    return bytesTotal;
  }


  @JsonProperty(JSON_PROPERTY_BYTES_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBytesTotal(@javax.annotation.Nullable Long bytesTotal) {
    this.bytesTotal = bytesTotal;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigratingApiFiles migratingApiFiles = (MigratingApiFiles) o;
    return Objects.equals(this.foldersCount, migratingApiFiles.foldersCount) &&
        Objects.equals(this.filesCount, migratingApiFiles.filesCount) &&
        Objects.equals(this.bytesTotal, migratingApiFiles.bytesTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(foldersCount, filesCount, bytesTotal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigratingApiFiles {\n");
    sb.append("    foldersCount: ").append(toIndentedString(foldersCount)).append("\n");
    sb.append("    filesCount: ").append(toIndentedString(filesCount)).append("\n");
    sb.append("    bytesTotal: ").append(toIndentedString(bytesTotal)).append("\n");
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

    // add `foldersCount` to the URL query string
    if (getFoldersCount() != null) {
      try {
        joiner.add(String.format("%sfoldersCount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFoldersCount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `filesCount` to the URL query string
    if (getFilesCount() != null) {
      try {
        joiner.add(String.format("%sfilesCount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFilesCount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `bytesTotal` to the URL query string
    if (getBytesTotal() != null) {
      try {
        joiner.add(String.format("%sbytesTotal%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBytesTotal()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

