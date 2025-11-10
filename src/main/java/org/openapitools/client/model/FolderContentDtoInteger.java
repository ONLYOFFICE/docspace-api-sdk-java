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
import org.openapitools.client.model.FileEntryBaseDto;
import org.openapitools.client.model.FolderDtoInteger;
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
 * The folder content information.
 */
@JsonPropertyOrder({
  FolderContentDtoInteger.JSON_PROPERTY_FILES,
  FolderContentDtoInteger.JSON_PROPERTY_FOLDERS,
  FolderContentDtoInteger.JSON_PROPERTY_CURRENT,
  FolderContentDtoInteger.JSON_PROPERTY_PATH_PARTS,
  FolderContentDtoInteger.JSON_PROPERTY_START_INDEX,
  FolderContentDtoInteger.JSON_PROPERTY_COUNT,
  FolderContentDtoInteger.JSON_PROPERTY_TOTAL,
  FolderContentDtoInteger.JSON_PROPERTY_NEW
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class FolderContentDtoInteger {
  public static final String JSON_PROPERTY_FILES = "files";
  @javax.annotation.Nullable
  private JsonNullable<List<FileEntryBaseDto>> files = JsonNullable.<List<FileEntryBaseDto>>undefined();

  public static final String JSON_PROPERTY_FOLDERS = "folders";
  @javax.annotation.Nullable
  private JsonNullable<List<FileEntryBaseDto>> folders = JsonNullable.<List<FileEntryBaseDto>>undefined();

  public static final String JSON_PROPERTY_CURRENT = "current";
  @javax.annotation.Nullable
  private FolderDtoInteger current;

  public static final String JSON_PROPERTY_PATH_PARTS = "pathParts";
  @javax.annotation.Nullable
  private Object pathParts = null;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  @javax.annotation.Nullable
  private Integer startIndex;

  public static final String JSON_PROPERTY_COUNT = "count";
  @javax.annotation.Nullable
  private Integer count;

  public static final String JSON_PROPERTY_TOTAL = "total";
  @javax.annotation.Nonnull
  private Integer total;

  public static final String JSON_PROPERTY_NEW = "new";
  @javax.annotation.Nullable
  private Integer _new;

  public FolderContentDtoInteger() {
  }

  public FolderContentDtoInteger files(@javax.annotation.Nullable List<FileEntryBaseDto> files) {
    this.files = JsonNullable.<List<FileEntryBaseDto>>of(files);
    
    return this;
  }

  public FolderContentDtoInteger addFilesItem(FileEntryBaseDto filesItem) {
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
   * The list of files in the folder.
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

  public FolderContentDtoInteger folders(@javax.annotation.Nullable List<FileEntryBaseDto> folders) {
    this.folders = JsonNullable.<List<FileEntryBaseDto>>of(folders);
    
    return this;
  }

  public FolderContentDtoInteger addFoldersItem(FileEntryBaseDto foldersItem) {
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
   * The list of folders in the folder.
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

  public FolderContentDtoInteger current(@javax.annotation.Nullable FolderDtoInteger current) {
    
    this.current = current;
    return this;
  }

  /**
   * Get current
   * @return current
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FolderDtoInteger getCurrent() {
    return current;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrent(@javax.annotation.Nullable FolderDtoInteger current) {
    this.current = current;
  }

  public FolderContentDtoInteger pathParts(@javax.annotation.Nullable Object pathParts) {
    
    this.pathParts = pathParts;
    return this;
  }

  /**
   * The folder path.
   * @return pathParts
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATH_PARTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getPathParts() {
    return pathParts;
  }


  @JsonProperty(JSON_PROPERTY_PATH_PARTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPathParts(@javax.annotation.Nullable Object pathParts) {
    this.pathParts = pathParts;
  }

  public FolderContentDtoInteger startIndex(@javax.annotation.Nullable Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

  /**
   * The folder start index.
   * @return startIndex
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartIndex() {
    return startIndex;
  }


  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartIndex(@javax.annotation.Nullable Integer startIndex) {
    this.startIndex = startIndex;
  }

  public FolderContentDtoInteger count(@javax.annotation.Nullable Integer count) {
    
    this.count = count;
    return this;
  }

  /**
   * The number of folder elements.
   * @return count
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCount() {
    return count;
  }


  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCount(@javax.annotation.Nullable Integer count) {
    this.count = count;
  }

  public FolderContentDtoInteger total(@javax.annotation.Nonnull Integer total) {
    
    this.total = total;
    return this;
  }

  /**
   * The total number of elements in the folder.
   * @return total
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTotal() {
    return total;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotal(@javax.annotation.Nonnull Integer total) {
    this.total = total;
  }

  public FolderContentDtoInteger _new(@javax.annotation.Nullable Integer _new) {
    
    this._new = _new;
    return this;
  }

  /**
   * The new element index in the folder.
   * @return _new
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNew() {
    return _new;
  }


  @JsonProperty(JSON_PROPERTY_NEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNew(@javax.annotation.Nullable Integer _new) {
    this._new = _new;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FolderContentDtoInteger folderContentDtoInteger = (FolderContentDtoInteger) o;
    return equalsNullable(this.files, folderContentDtoInteger.files) &&
        equalsNullable(this.folders, folderContentDtoInteger.folders) &&
        Objects.equals(this.current, folderContentDtoInteger.current) &&
        Objects.equals(this.pathParts, folderContentDtoInteger.pathParts) &&
        Objects.equals(this.startIndex, folderContentDtoInteger.startIndex) &&
        Objects.equals(this.count, folderContentDtoInteger.count) &&
        Objects.equals(this.total, folderContentDtoInteger.total) &&
        Objects.equals(this._new, folderContentDtoInteger._new);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(files), hashCodeNullable(folders), current, pathParts, startIndex, count, total, _new);
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
    sb.append("class FolderContentDtoInteger {\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    folders: ").append(toIndentedString(folders)).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    pathParts: ").append(toIndentedString(pathParts)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    _new: ").append(toIndentedString(_new)).append("\n");
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

    // add `current` to the URL query string
    if (getCurrent() != null) {
      joiner.add(getCurrent().toUrlQueryString(prefix + "current" + suffix));
    }

    // add `pathParts` to the URL query string
    if (getPathParts() != null) {
      try {
        joiner.add(String.format("%spathParts%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPathParts()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `startIndex` to the URL query string
    if (getStartIndex() != null) {
      try {
        joiner.add(String.format("%sstartIndex%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStartIndex()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `count` to the URL query string
    if (getCount() != null) {
      try {
        joiner.add(String.format("%scount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `total` to the URL query string
    if (getTotal() != null) {
      try {
        joiner.add(String.format("%stotal%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTotal()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `new` to the URL query string
    if (getNew() != null) {
      try {
        joiner.add(String.format("%snew%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNew()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

