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
 * Default template setting
 */
@JsonPropertyOrder({
  DefaultTemplateItemDto.JSON_PROPERTY_SELECTED_FILE,
  DefaultTemplateItemDto.JSON_PROPERTY_FILE_EXTENSION,
  DefaultTemplateItemDto.JSON_PROPERTY_FILE_TITLE,
  DefaultTemplateItemDto.JSON_PROPERTY_LAST_MODIFIED,
  DefaultTemplateItemDto.JSON_PROPERTY_FILE_SIZE,
  DefaultTemplateItemDto.JSON_PROPERTY_VIEW_URL
})

public class DefaultTemplateItemDto {
  public static final String JSON_PROPERTY_SELECTED_FILE = "selectedFile";
  @javax.annotation.Nullable  private JsonNullable<Integer> selectedFile = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_FILE_EXTENSION = "fileExtension";
  @javax.annotation.Nullable  private String fileExtension;

  public static final String JSON_PROPERTY_FILE_TITLE = "fileTitle";
  @javax.annotation.Nullable  private JsonNullable<String> fileTitle = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LAST_MODIFIED = "lastModified";
  @javax.annotation.Nullable  private JsonNullable<OffsetDateTime> lastModified = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_FILE_SIZE = "fileSize";
  @javax.annotation.Nullable  private JsonNullable<Long> fileSize = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_VIEW_URL = "viewUrl";
  @javax.annotation.Nullable  private JsonNullable<String> viewUrl = JsonNullable.<String>undefined();

  public DefaultTemplateItemDto() {
  }


  public DefaultTemplateItemDto selectedFile(@javax.annotation.Nullable Integer selectedFile) {
    this.selectedFile = JsonNullable.<Integer>of(selectedFile);
    
    return this;
  }

  /**
   * File id to use as a default template
   * @return selectedFile
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Integer getSelectedFile() {
        return selectedFile.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SELECTED_FILE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Integer> getSelectedFile_JsonNullable() {
    return selectedFile;
  }
  
  @JsonProperty(JSON_PROPERTY_SELECTED_FILE)
  public void setSelectedFile_JsonNullable(JsonNullable<Integer> selectedFile) {
    this.selectedFile = selectedFile;
  }

  public void setSelectedFile(@javax.annotation.Nullable Integer selectedFile) {
    this.selectedFile = JsonNullable.<Integer>of(selectedFile);
  }

  public DefaultTemplateItemDto fileExtension(@javax.annotation.Nullable String fileExtension) {
    
    this.fileExtension = fileExtension;
    return this;
  }

  /**
   * Extension of a default template
   * @return fileExtension
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_FILE_EXTENSION, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFileExtension() {
    return fileExtension;
  }


  @JsonProperty(value = JSON_PROPERTY_FILE_EXTENSION, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFileExtension(@javax.annotation.Nullable String fileExtension) {
    this.fileExtension = fileExtension;
  }

  public DefaultTemplateItemDto fileTitle(@javax.annotation.Nullable String fileTitle) {
    this.fileTitle = JsonNullable.<String>of(fileTitle);
    
    return this;
  }

  /**
   * Title of a default template
   * @return fileTitle
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getFileTitle() {
        return fileTitle.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_FILE_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getFileTitle_JsonNullable() {
    return fileTitle;
  }
  
  @JsonProperty(JSON_PROPERTY_FILE_TITLE)
  public void setFileTitle_JsonNullable(JsonNullable<String> fileTitle) {
    this.fileTitle = fileTitle;
  }

  public void setFileTitle(@javax.annotation.Nullable String fileTitle) {
    this.fileTitle = JsonNullable.<String>of(fileTitle);
  }

  public DefaultTemplateItemDto lastModified(@javax.annotation.Nullable OffsetDateTime lastModified) {
    this.lastModified = JsonNullable.<OffsetDateTime>of(lastModified);
    
    return this;
  }

  /**
   * Last modified date of a default template
   * @return lastModified
   */
  @javax.annotation.Nullable  @JsonIgnore

  public OffsetDateTime getLastModified() {
        return lastModified.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_LAST_MODIFIED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getLastModified_JsonNullable() {
    return lastModified;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED)
  public void setLastModified_JsonNullable(JsonNullable<OffsetDateTime> lastModified) {
    this.lastModified = lastModified;
  }

  public void setLastModified(@javax.annotation.Nullable OffsetDateTime lastModified) {
    this.lastModified = JsonNullable.<OffsetDateTime>of(lastModified);
  }

  public DefaultTemplateItemDto fileSize(@javax.annotation.Nullable Long fileSize) {
    this.fileSize = JsonNullable.<Long>of(fileSize);
    
    return this;
  }

  /**
   * Filesize (in bytes) of a default template
   * @return fileSize
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Long getFileSize() {
        return fileSize.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_FILE_SIZE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getFileSize_JsonNullable() {
    return fileSize;
  }
  
  @JsonProperty(JSON_PROPERTY_FILE_SIZE)
  public void setFileSize_JsonNullable(JsonNullable<Long> fileSize) {
    this.fileSize = fileSize;
  }

  public void setFileSize(@javax.annotation.Nullable Long fileSize) {
    this.fileSize = JsonNullable.<Long>of(fileSize);
  }

  public DefaultTemplateItemDto viewUrl(@javax.annotation.Nullable String viewUrl) {
    this.viewUrl = JsonNullable.<String>of(viewUrl);
    
    return this;
  }

  /**
   * View url of a default template
   * @return viewUrl
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getViewUrl() {
        return viewUrl.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_VIEW_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getViewUrl_JsonNullable() {
    return viewUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_VIEW_URL)
  public void setViewUrl_JsonNullable(JsonNullable<String> viewUrl) {
    this.viewUrl = viewUrl;
  }

  public void setViewUrl(@javax.annotation.Nullable String viewUrl) {
    this.viewUrl = JsonNullable.<String>of(viewUrl);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefaultTemplateItemDto defaultTemplateItemDto = (DefaultTemplateItemDto) o;
    return equalsNullable(this.selectedFile, defaultTemplateItemDto.selectedFile) &&
        Objects.equals(this.fileExtension, defaultTemplateItemDto.fileExtension) &&
        equalsNullable(this.fileTitle, defaultTemplateItemDto.fileTitle) &&
        equalsNullable(this.lastModified, defaultTemplateItemDto.lastModified) &&
        equalsNullable(this.fileSize, defaultTemplateItemDto.fileSize) &&
        equalsNullable(this.viewUrl, defaultTemplateItemDto.viewUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(selectedFile), fileExtension, hashCodeNullable(fileTitle), hashCodeNullable(lastModified), hashCodeNullable(fileSize), hashCodeNullable(viewUrl));
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
    sb.append("class DefaultTemplateItemDto {\n");
    sb.append("    selectedFile: ").append(toIndentedString(selectedFile)).append("\n");
    sb.append("    fileExtension: ").append(toIndentedString(fileExtension)).append("\n");
    sb.append("    fileTitle: ").append(toIndentedString(fileTitle)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    viewUrl: ").append(toIndentedString(viewUrl)).append("\n");
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

    // add `selectedFile` to the URL query string
    if (getSelectedFile() != null) {
      try {
        joiner.add(String.format("%sselectedFile%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSelectedFile()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `fileExtension` to the URL query string
    if (getFileExtension() != null) {
      try {
        joiner.add(String.format("%sfileExtension%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFileExtension()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `fileTitle` to the URL query string
    if (getFileTitle() != null) {
      try {
        joiner.add(String.format("%sfileTitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFileTitle()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `lastModified` to the URL query string
    if (getLastModified() != null) {
      try {
        joiner.add(String.format("%slastModified%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLastModified()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `fileSize` to the URL query string
    if (getFileSize() != null) {
      try {
        joiner.add(String.format("%sfileSize%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFileSize()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `viewUrl` to the URL query string
    if (getViewUrl() != null) {
      try {
        joiner.add(String.format("%sviewUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getViewUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

