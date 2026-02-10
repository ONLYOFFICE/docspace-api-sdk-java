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
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.FileEntryBaseDto;
import org.openapitools.client.model.FileOperationType;
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
 * The file operation information.
 */
@JsonPropertyOrder({
  FileOperationDto.JSON_PROPERTY_ID,
  FileOperationDto.JSON_PROPERTY_OPERATION,
  FileOperationDto.JSON_PROPERTY_PROGRESS,
  FileOperationDto.JSON_PROPERTY_ERROR,
  FileOperationDto.JSON_PROPERTY_PROCESSED,
  FileOperationDto.JSON_PROPERTY_FINISHED,
  FileOperationDto.JSON_PROPERTY_URL,
  FileOperationDto.JSON_PROPERTY_FILES,
  FileOperationDto.JSON_PROPERTY_FOLDERS
})

public class FileOperationDto {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private String id;

  public static final String JSON_PROPERTY_OPERATION = "Operation";
  @javax.annotation.Nonnull
  private FileOperationType operation;

  public static final String JSON_PROPERTY_PROGRESS = "progress";
  @javax.annotation.Nonnull
  private Integer progress;

  public static final String JSON_PROPERTY_ERROR = "error";
  @javax.annotation.Nullable
  private String error;

  public static final String JSON_PROPERTY_PROCESSED = "processed";
  @javax.annotation.Nullable
  private String processed;

  public static final String JSON_PROPERTY_FINISHED = "finished";
  @javax.annotation.Nonnull
  private Boolean finished;

  public static final String JSON_PROPERTY_URL = "url";
  @javax.annotation.Nullable
  private JsonNullable<URI> url = JsonNullable.<URI>undefined();

  public static final String JSON_PROPERTY_FILES = "files";
  @javax.annotation.Nullable
  private JsonNullable<List<FileEntryBaseDto>> files = JsonNullable.<List<FileEntryBaseDto>>undefined();

  public static final String JSON_PROPERTY_FOLDERS = "folders";
  @javax.annotation.Nullable
  private JsonNullable<List<FileEntryBaseDto>> folders = JsonNullable.<List<FileEntryBaseDto>>undefined();

  public FileOperationDto() {
  }


  public FileOperationDto id(@javax.annotation.Nullable String id) {
    
    this.id = id;
    return this;
  }

  /**
   * The file operation ID.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }

  public FileOperationDto operation(@javax.annotation.Nonnull FileOperationType operation) {
    
    this.operation = operation;
    return this;
  }

  /**
   * Get operation
   * @return operation
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OPERATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FileOperationType getOperation() {
    return operation;
  }


  @JsonProperty(JSON_PROPERTY_OPERATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOperation(@javax.annotation.Nonnull FileOperationType operation) {
    this.operation = operation;
  }

  public FileOperationDto progress(@javax.annotation.Nonnull Integer progress) {
    
    this.progress = progress;
    return this;
  }

  /**
   * The file operation progress in percentage.
   * @return progress
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROGRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getProgress() {
    return progress;
  }


  @JsonProperty(JSON_PROPERTY_PROGRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProgress(@javax.annotation.Nonnull Integer progress) {
    this.progress = progress;
  }

  public FileOperationDto error(@javax.annotation.Nullable String error) {
    
    this.error = error;
    return this;
  }

  /**
   * The file operation error message.
   * @return error
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getError() {
    return error;
  }


  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setError(@javax.annotation.Nullable String error) {
    this.error = error;
  }

  public FileOperationDto processed(@javax.annotation.Nullable String processed) {
    
    this.processed = processed;
    return this;
  }

  /**
   * The file operation processing status.
   * @return processed
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROCESSED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProcessed() {
    return processed;
  }


  @JsonProperty(JSON_PROPERTY_PROCESSED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProcessed(@javax.annotation.Nullable String processed) {
    this.processed = processed;
  }

  public FileOperationDto finished(@javax.annotation.Nonnull Boolean finished) {
    
    this.finished = finished;
    return this;
  }

  /**
   * Specifies if the file operation is finished or not.
   * @return finished
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FINISHED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getFinished() {
    return finished;
  }


  @JsonProperty(JSON_PROPERTY_FINISHED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFinished(@javax.annotation.Nonnull Boolean finished) {
    this.finished = finished;
  }

  public FileOperationDto url(@javax.annotation.Nullable URI url) {
    this.url = JsonNullable.<URI>of(url);
    
    return this;
  }

  /**
   * The file operation URL.
   * @return url
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public URI getUrl() {
        return url.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<URI> getUrl_JsonNullable() {
    return url;
  }
  
  @JsonProperty(JSON_PROPERTY_URL)
  public void setUrl_JsonNullable(JsonNullable<URI> url) {
    this.url = url;
  }

  public void setUrl(@javax.annotation.Nullable URI url) {
    this.url = JsonNullable.<URI>of(url);
  }

  public FileOperationDto files(@javax.annotation.Nullable List<FileEntryBaseDto> files) {
    this.files = JsonNullable.<List<FileEntryBaseDto>>of(files);
    
    return this;
  }

  public FileOperationDto addFilesItem(FileEntryBaseDto filesItem) {
    if (this.files == null || !this.files.isPresent()) {
      this.files = JsonNullable.<List<FileEntryBaseDto>>of(new ArrayList<>());
    }
    try {
      this.files.get().add(filesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of files of the file operation.
   * @return files
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<FileEntryBaseDto> getFiles() {
        return files.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<FileEntryBaseDto>> getFiles_JsonNullable() {
    return files;
  }
  
  @JsonProperty(JSON_PROPERTY_FILES)
  public void setFiles_JsonNullable(JsonNullable<List<FileEntryBaseDto>> files) {
    this.files = files;
  }

  public void setFiles(@javax.annotation.Nullable List<FileEntryBaseDto> files) {
    this.files = JsonNullable.<List<FileEntryBaseDto>>of(files);
  }

  public FileOperationDto folders(@javax.annotation.Nullable List<FileEntryBaseDto> folders) {
    this.folders = JsonNullable.<List<FileEntryBaseDto>>of(folders);
    
    return this;
  }

  public FileOperationDto addFoldersItem(FileEntryBaseDto foldersItem) {
    if (this.folders == null || !this.folders.isPresent()) {
      this.folders = JsonNullable.<List<FileEntryBaseDto>>of(new ArrayList<>());
    }
    try {
      this.folders.get().add(foldersItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of folders of the file operation.
   * @return folders
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<FileEntryBaseDto> getFolders() {
        return folders.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FOLDERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<FileEntryBaseDto>> getFolders_JsonNullable() {
    return folders;
  }
  
  @JsonProperty(JSON_PROPERTY_FOLDERS)
  public void setFolders_JsonNullable(JsonNullable<List<FileEntryBaseDto>> folders) {
    this.folders = folders;
  }

  public void setFolders(@javax.annotation.Nullable List<FileEntryBaseDto> folders) {
    this.folders = JsonNullable.<List<FileEntryBaseDto>>of(folders);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileOperationDto fileOperationDto = (FileOperationDto) o;
    return Objects.equals(this.id, fileOperationDto.id) &&
        Objects.equals(this.operation, fileOperationDto.operation) &&
        Objects.equals(this.progress, fileOperationDto.progress) &&
        Objects.equals(this.error, fileOperationDto.error) &&
        Objects.equals(this.processed, fileOperationDto.processed) &&
        Objects.equals(this.finished, fileOperationDto.finished) &&
        equalsNullable(this.url, fileOperationDto.url) &&
        equalsNullable(this.files, fileOperationDto.files) &&
        equalsNullable(this.folders, fileOperationDto.folders);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, operation, progress, error, processed, finished, hashCodeNullable(url), hashCodeNullable(files), hashCodeNullable(folders));
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
    sb.append("class FileOperationDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    processed: ").append(toIndentedString(processed)).append("\n");
    sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    folders: ").append(toIndentedString(folders)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `Operation` to the URL query string
    if (getOperation() != null) {
      try {
        joiner.add(String.format("%sOperation%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOperation()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `progress` to the URL query string
    if (getProgress() != null) {
      try {
        joiner.add(String.format("%sprogress%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProgress()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `error` to the URL query string
    if (getError() != null) {
      try {
        joiner.add(String.format("%serror%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getError()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `processed` to the URL query string
    if (getProcessed() != null) {
      try {
        joiner.add(String.format("%sprocessed%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProcessed()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `finished` to the URL query string
    if (getFinished() != null) {
      try {
        joiner.add(String.format("%sfinished%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFinished()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `files` to the URL query string
    if (getFiles() != null) {
      for (int i = 0; i < getFiles().size(); i++) {
        if (getFiles().get(i) != null) {
          joiner.add(getFiles().get(i).toUrlQueryString(String.format("%sfiles%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `folders` to the URL query string
    if (getFolders() != null) {
      for (int i = 0; i < getFolders().size(); i++) {
        if (getFolders().get(i) != null) {
          joiner.add(getFolders().get(i).toUrlQueryString(String.format("%sfolders%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

