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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.AiFileEntryBaseDto;
import org.openapitools.client.model.AiFolderDto;
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
 * One page of the contents of a folder or of a section: its entries split into files and folders, the folder itself,  and the counters needed to page through the rest.
 */
@JsonPropertyOrder({
  AiFolderContentDto.JSON_PROPERTY_FILES,
  AiFolderContentDto.JSON_PROPERTY_FOLDERS,
  AiFolderContentDto.JSON_PROPERTY_CURRENT,
  AiFolderContentDto.JSON_PROPERTY_PATH_PARTS,
  AiFolderContentDto.JSON_PROPERTY_START_INDEX,
  AiFolderContentDto.JSON_PROPERTY_COUNT,
  AiFolderContentDto.JSON_PROPERTY_TOTAL,
  AiFolderContentDto.JSON_PROPERTY_NEW
})

public class AiFolderContentDto {
  public static final String JSON_PROPERTY_FILES = "files";
  @javax.annotation.Nullable  private JsonNullable<List<AiFileEntryBaseDto>> files = JsonNullable.<List<AiFileEntryBaseDto>>undefined();

  public static final String JSON_PROPERTY_FOLDERS = "folders";
  @javax.annotation.Nullable  private JsonNullable<List<AiFileEntryBaseDto>> folders = JsonNullable.<List<AiFileEntryBaseDto>>undefined();

  public static final String JSON_PROPERTY_CURRENT = "current";
  @javax.annotation.Nullable  private AiFolderDto current;

  public static final String JSON_PROPERTY_PATH_PARTS = "pathParts";
  @javax.annotation.Nullable  private Object pathParts = null;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  @javax.annotation.Nullable  private Integer startIndex;

  public static final String JSON_PROPERTY_COUNT = "count";
  @javax.annotation.Nullable  private Integer count;

  public static final String JSON_PROPERTY_TOTAL = "total";
  @javax.annotation.Nonnull  private Integer total;

  public static final String JSON_PROPERTY_NEW = "new";
  @javax.annotation.Nullable  private Integer _new;

  public AiFolderContentDto() {
  }


  public AiFolderContentDto files(@javax.annotation.Nullable List<AiFileEntryBaseDto> files) {
    this.files = JsonNullable.<List<AiFileEntryBaseDto>>of(files);
    
    return this;
  }

  public AiFolderContentDto addFilesItem(AiFileEntryBaseDto filesItem) {
    if (this.files == null || !this.files.isPresent()) {
      this.files = JsonNullable.<List<AiFileEntryBaseDto>>of(new ArrayList<>());
    }
    try {
      this.files.get().add(filesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The file entries of this page. It is empty when the folder holds no files, when the filters matched none of  them, and in the sections that list rooms only.
   * @return files
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<AiFileEntryBaseDto> getFiles() {
        return files.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_FILES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<AiFileEntryBaseDto>> getFiles_JsonNullable() {
    return files;
  }
  
  @JsonProperty(JSON_PROPERTY_FILES)
  public void setFiles_JsonNullable(JsonNullable<List<AiFileEntryBaseDto>> files) {
    this.files = files;
  }

  public void setFiles(@javax.annotation.Nullable List<AiFileEntryBaseDto> files) {
    this.files = JsonNullable.<List<AiFileEntryBaseDto>>of(files);
  }

  public AiFolderContentDto folders(@javax.annotation.Nullable List<AiFileEntryBaseDto> folders) {
    this.folders = JsonNullable.<List<AiFileEntryBaseDto>>of(folders);
    
    return this;
  }

  public AiFolderContentDto addFoldersItem(AiFileEntryBaseDto foldersItem) {
    if (this.folders == null || !this.folders.isPresent()) {
      this.folders = JsonNullable.<List<AiFileEntryBaseDto>>of(new ArrayList<>());
    }
    try {
      this.folders.get().add(foldersItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The folder entries of this page. In a section of rooms these entries are the rooms themselves, which is where  their type, tags, logo and quota are read from.
   * @return folders
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<AiFileEntryBaseDto> getFolders() {
        return folders.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_FOLDERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<AiFileEntryBaseDto>> getFolders_JsonNullable() {
    return folders;
  }
  
  @JsonProperty(JSON_PROPERTY_FOLDERS)
  public void setFolders_JsonNullable(JsonNullable<List<AiFileEntryBaseDto>> folders) {
    this.folders = folders;
  }

  public void setFolders(@javax.annotation.Nullable List<AiFileEntryBaseDto> folders) {
    this.folders = JsonNullable.<List<AiFileEntryBaseDto>>of(folders);
  }

  public AiFolderContentDto current(@javax.annotation.Nullable AiFolderDto current) {
    
    this.current = current;
    return this;
  }

  /**
   * The folder or section the page was read from, with its own title, type and access rights. It describes the  container, not the entries, and is filled in even when the page is empty.
   * @return current
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CURRENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AiFolderDto getCurrent() {
    return current;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrent(@javax.annotation.Nullable AiFolderDto current) {
    this.current = current;
  }

  public AiFolderContentDto pathParts(@javax.annotation.Nullable Object pathParts) {
    
    this.pathParts = pathParts;
    return this;
  }

  /**
   * Get pathParts
   * @return pathParts
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PATH_PARTS, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getPathParts() {
    return pathParts;
  }


  @JsonProperty(value = JSON_PROPERTY_PATH_PARTS, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPathParts(@javax.annotation.Nullable Object pathParts) {
    this.pathParts = pathParts;
  }

  public AiFolderContentDto startIndex(@javax.annotation.Nullable Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

  /**
   * The position of the first entry of this page in the whole result, echoing the requested start index. Add the  number of entries received to it to ask for the next page.
   * @return startIndex
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_START_INDEX, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartIndex() {
    return startIndex;
  }


  @JsonProperty(value = JSON_PROPERTY_START_INDEX, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartIndex(@javax.annotation.Nullable Integer startIndex) {
    this.startIndex = startIndex;
  }

  public AiFolderContentDto count(@javax.annotation.Nullable Integer count) {
    
    this.count = count;
    return this;
  }

  /**
   * How many entries this page carries, files and folders together. A page shorter than the requested size means  the result is exhausted.
   * @return count
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCount() {
    return count;
  }


  @JsonProperty(value = JSON_PROPERTY_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCount(@javax.annotation.Nullable Integer count) {
    this.count = count;
  }

  public AiFolderContentDto total(@javax.annotation.Nonnull Integer total) {
    
    this.total = total;
    return this;
  }

  /**
   * How many entries matched before paging was applied, across the whole folder. Page until the start index plus  the entries received reaches it.
   * @return total
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_TOTAL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTotal() {
    return total;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotal(@javax.annotation.Nonnull Integer total) {
    this.total = total;
  }

  public AiFolderContentDto _new(@javax.annotation.Nullable Integer _new) {
    
    this._new = _new;
    return this;
  }

  /**
   * How many entries of this folder are marked as new for the caller. It is 0 for every listing when the account  has switched the new-item badges off, so a zero here does not prove that nothing has changed.
   * @return _new
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_NEW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNew() {
    return _new;
  }


  @JsonProperty(value = JSON_PROPERTY_NEW, required = false)
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
    AiFolderContentDto aiFolderContentDto = (AiFolderContentDto) o;
    return equalsNullable(this.files, aiFolderContentDto.files) &&
        equalsNullable(this.folders, aiFolderContentDto.folders) &&
        Objects.equals(this.current, aiFolderContentDto.current) &&
        Objects.equals(this.pathParts, aiFolderContentDto.pathParts) &&
        Objects.equals(this.startIndex, aiFolderContentDto.startIndex) &&
        Objects.equals(this.count, aiFolderContentDto.count) &&
        Objects.equals(this.total, aiFolderContentDto.total) &&
        Objects.equals(this._new, aiFolderContentDto._new);
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
    sb.append("class AiFolderContentDto {\n");
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

