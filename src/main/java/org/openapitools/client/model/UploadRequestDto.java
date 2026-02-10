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
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.ContentDisposition;
import org.openapitools.client.model.ContentType;
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
 * The request parameters for uploading a file.
 */
@JsonPropertyOrder({
  UploadRequestDto.JSON_PROPERTY_FILE,
  UploadRequestDto.JSON_PROPERTY_CONTENT_TYPE,
  UploadRequestDto.JSON_PROPERTY_CONTENT_DISPOSITION,
  UploadRequestDto.JSON_PROPERTY_FILES,
  UploadRequestDto.JSON_PROPERTY_CREATE_NEW_IF_EXIST,
  UploadRequestDto.JSON_PROPERTY_STORE_ORIGINAL_FILE_FLAG,
  UploadRequestDto.JSON_PROPERTY_KEEP_CONVERT_STATUS,
  UploadRequestDto.JSON_PROPERTY_STREAM
})

public class UploadRequestDto {
  public static final String JSON_PROPERTY_FILE = "file";
  @javax.annotation.Nullable
  private JsonNullable<File> _file = JsonNullable.<File>undefined();

  public static final String JSON_PROPERTY_CONTENT_TYPE = "contentType";
  @javax.annotation.Nullable
  private ContentType contentType;

  public static final String JSON_PROPERTY_CONTENT_DISPOSITION = "contentDisposition";
  @javax.annotation.Nullable
  private ContentDisposition contentDisposition;

  public static final String JSON_PROPERTY_FILES = "files";
  @javax.annotation.Nullable
  private JsonNullable<List<File>> files = JsonNullable.<List<File>>undefined();

  public static final String JSON_PROPERTY_CREATE_NEW_IF_EXIST = "createNewIfExist";
  @javax.annotation.Nullable
  private Boolean createNewIfExist;

  public static final String JSON_PROPERTY_STORE_ORIGINAL_FILE_FLAG = "storeOriginalFileFlag";
  @javax.annotation.Nullable
  private JsonNullable<Boolean> storeOriginalFileFlag = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_KEEP_CONVERT_STATUS = "keepConvertStatus";
  @javax.annotation.Nullable
  private Boolean keepConvertStatus;

  public static final String JSON_PROPERTY_STREAM = "stream";
  @javax.annotation.Nullable
  private JsonNullable<File> stream = JsonNullable.<File>undefined();

  public UploadRequestDto() {
  }


  public UploadRequestDto _file(@javax.annotation.Nullable File _file) {
    this._file = JsonNullable.<File>of(_file);
    
    return this;
  }

  /**
   * The file to be uploaded.
   * @return _file
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public File getFile() {
        return _file.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<File> getFile_JsonNullable() {
    return _file;
  }
  
  @JsonProperty(JSON_PROPERTY_FILE)
  public void setFile_JsonNullable(JsonNullable<File> _file) {
    this._file = _file;
  }

  public void setFile(@javax.annotation.Nullable File _file) {
    this._file = JsonNullable.<File>of(_file);
  }

  public UploadRequestDto contentType(@javax.annotation.Nullable ContentType contentType) {
    
    this.contentType = contentType;
    return this;
  }

  /**
   * Get contentType
   * @return contentType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ContentType getContentType() {
    return contentType;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContentType(@javax.annotation.Nullable ContentType contentType) {
    this.contentType = contentType;
  }

  public UploadRequestDto contentDisposition(@javax.annotation.Nullable ContentDisposition contentDisposition) {
    
    this.contentDisposition = contentDisposition;
    return this;
  }

  /**
   * Get contentDisposition
   * @return contentDisposition
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENT_DISPOSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ContentDisposition getContentDisposition() {
    return contentDisposition;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT_DISPOSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContentDisposition(@javax.annotation.Nullable ContentDisposition contentDisposition) {
    this.contentDisposition = contentDisposition;
  }

  public UploadRequestDto files(@javax.annotation.Nullable List<File> files) {
    this.files = JsonNullable.<List<File>>of(files);
    
    return this;
  }

  public UploadRequestDto addFilesItem(File filesItem) {
    if (this.files == null || !this.files.isPresent()) {
      this.files = JsonNullable.<List<File>>of(new ArrayList<>());
    }
    try {
      this.files.get().add(filesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of files when specified as multipart/form-data.
   * @return files
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<File> getFiles() {
        return files.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<File>> getFiles_JsonNullable() {
    return files;
  }
  
  @JsonProperty(JSON_PROPERTY_FILES)
  public void setFiles_JsonNullable(JsonNullable<List<File>> files) {
    this.files = files;
  }

  public void setFiles(@javax.annotation.Nullable List<File> files) {
    this.files = JsonNullable.<List<File>>of(files);
  }

  public UploadRequestDto createNewIfExist(@javax.annotation.Nullable Boolean createNewIfExist) {
    
    this.createNewIfExist = createNewIfExist;
    return this;
  }

  /**
   * Specifies whether to create the new file if it already exists or not.
   * @return createNewIfExist
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_NEW_IF_EXIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCreateNewIfExist() {
    return createNewIfExist;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_NEW_IF_EXIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateNewIfExist(@javax.annotation.Nullable Boolean createNewIfExist) {
    this.createNewIfExist = createNewIfExist;
  }

  public UploadRequestDto storeOriginalFileFlag(@javax.annotation.Nullable Boolean storeOriginalFileFlag) {
    this.storeOriginalFileFlag = JsonNullable.<Boolean>of(storeOriginalFileFlag);
    
    return this;
  }

  /**
   * Specifies whether to upload documents in the original formats as well or not.
   * @return storeOriginalFileFlag
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getStoreOriginalFileFlag() {
        return storeOriginalFileFlag.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STORE_ORIGINAL_FILE_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getStoreOriginalFileFlag_JsonNullable() {
    return storeOriginalFileFlag;
  }
  
  @JsonProperty(JSON_PROPERTY_STORE_ORIGINAL_FILE_FLAG)
  public void setStoreOriginalFileFlag_JsonNullable(JsonNullable<Boolean> storeOriginalFileFlag) {
    this.storeOriginalFileFlag = storeOriginalFileFlag;
  }

  public void setStoreOriginalFileFlag(@javax.annotation.Nullable Boolean storeOriginalFileFlag) {
    this.storeOriginalFileFlag = JsonNullable.<Boolean>of(storeOriginalFileFlag);
  }

  public UploadRequestDto keepConvertStatus(@javax.annotation.Nullable Boolean keepConvertStatus) {
    
    this.keepConvertStatus = keepConvertStatus;
    return this;
  }

  /**
   * Specifies whether to keep the file converting status or not.
   * @return keepConvertStatus
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEEP_CONVERT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getKeepConvertStatus() {
    return keepConvertStatus;
  }


  @JsonProperty(JSON_PROPERTY_KEEP_CONVERT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeepConvertStatus(@javax.annotation.Nullable Boolean keepConvertStatus) {
    this.keepConvertStatus = keepConvertStatus;
  }

  public UploadRequestDto stream(@javax.annotation.Nullable File stream) {
    this.stream = JsonNullable.<File>of(stream);
    
    return this;
  }

  /**
   * The request input stream.
   * @return stream
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public File getStream() {
        return stream.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STREAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<File> getStream_JsonNullable() {
    return stream;
  }
  
  @JsonProperty(JSON_PROPERTY_STREAM)
  public void setStream_JsonNullable(JsonNullable<File> stream) {
    this.stream = stream;
  }

  public void setStream(@javax.annotation.Nullable File stream) {
    this.stream = JsonNullable.<File>of(stream);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadRequestDto uploadRequestDto = (UploadRequestDto) o;
    return equalsNullable(this._file, uploadRequestDto._file) &&
        Objects.equals(this.contentType, uploadRequestDto.contentType) &&
        Objects.equals(this.contentDisposition, uploadRequestDto.contentDisposition) &&
        equalsNullable(this.files, uploadRequestDto.files) &&
        Objects.equals(this.createNewIfExist, uploadRequestDto.createNewIfExist) &&
        equalsNullable(this.storeOriginalFileFlag, uploadRequestDto.storeOriginalFileFlag) &&
        Objects.equals(this.keepConvertStatus, uploadRequestDto.keepConvertStatus) &&
        equalsNullable(this.stream, uploadRequestDto.stream);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(_file), contentType, contentDisposition, hashCodeNullable(files), createNewIfExist, hashCodeNullable(storeOriginalFileFlag), keepConvertStatus, hashCodeNullable(stream));
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
    sb.append("class UploadRequestDto {\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    contentDisposition: ").append(toIndentedString(contentDisposition)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    createNewIfExist: ").append(toIndentedString(createNewIfExist)).append("\n");
    sb.append("    storeOriginalFileFlag: ").append(toIndentedString(storeOriginalFileFlag)).append("\n");
    sb.append("    keepConvertStatus: ").append(toIndentedString(keepConvertStatus)).append("\n");
    sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
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

    // add `file` to the URL query string
    if (getFile() != null) {
      try {
        joiner.add(String.format("%sfile%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFile()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `contentType` to the URL query string
    if (getContentType() != null) {
      joiner.add(getContentType().toUrlQueryString(prefix + "contentType" + suffix));
    }

    // add `contentDisposition` to the URL query string
    if (getContentDisposition() != null) {
      joiner.add(getContentDisposition().toUrlQueryString(prefix + "contentDisposition" + suffix));
    }

    // add `files` to the URL query string
    if (getFiles() != null) {
      for (int i = 0; i < getFiles().size(); i++) {
        if (getFiles().get(i) != null) {
          try {
            joiner.add(String.format("%sfiles%s%s=%s", prefix, suffix,
                "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
                URLEncoder.encode(String.valueOf(getFiles().get(i)), "UTF-8").replaceAll("\\+", "%20")));
          } catch (UnsupportedEncodingException e) {
            // Should never happen, UTF-8 is always supported
            throw new RuntimeException(e);
          }
        }
      }
    }

    // add `createNewIfExist` to the URL query string
    if (getCreateNewIfExist() != null) {
      try {
        joiner.add(String.format("%screateNewIfExist%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreateNewIfExist()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `storeOriginalFileFlag` to the URL query string
    if (getStoreOriginalFileFlag() != null) {
      try {
        joiner.add(String.format("%sstoreOriginalFileFlag%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStoreOriginalFileFlag()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `keepConvertStatus` to the URL query string
    if (getKeepConvertStatus() != null) {
      try {
        joiner.add(String.format("%skeepConvertStatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getKeepConvertStatus()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `stream` to the URL query string
    if (getStream() != null) {
      try {
        joiner.add(String.format("%sstream%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStream()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

