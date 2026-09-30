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
import org.openapitools.client.model.FileDto;
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
 * How far a chunked upload has got, and the file it produced once the last byte has arrived.
 */
@JsonPropertyOrder({
  UploadSessionResponseDto.JSON_PROPERTY_ID,
  UploadSessionResponseDto.JSON_PROPERTY_FOLDER_ID,
  UploadSessionResponseDto.JSON_PROPERTY_VERSION,
  UploadSessionResponseDto.JSON_PROPERTY_TITLE,
  UploadSessionResponseDto.JSON_PROPERTY_PROVIDER_KEY,
  UploadSessionResponseDto.JSON_PROPERTY_UPLOADED,
  UploadSessionResponseDto.JSON_PROPERTY_FILE
})

public class UploadSessionResponseDto {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable  private Integer id;

  public static final String JSON_PROPERTY_FOLDER_ID = "folderId";
  @javax.annotation.Nullable  private Integer folderId;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable  private Integer version;

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable  private JsonNullable<String> title = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PROVIDER_KEY = "providerKey";
  @javax.annotation.Nullable  private JsonNullable<String> providerKey = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_UPLOADED = "uploaded";
  @javax.annotation.Nullable  private Boolean uploaded;

  public static final String JSON_PROPERTY_FILE = "file";
  @javax.annotation.Nullable  private FileDto _file;

  public UploadSessionResponseDto() {
  }


  public UploadSessionResponseDto id(@javax.annotation.Nullable Integer id) {
    
    this.id = id;
    return this;
  }

  /**
   * The file the parts are being written into. An upload that took over a file of the same title carries it from  the start, while an upload that creates a new file has nothing to name yet and reports 0 until the answer that  sets `uploaded` to true.
   * @return id
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable Integer id) {
    this.id = id;
  }

  public UploadSessionResponseDto folderId(@javax.annotation.Nullable Integer folderId) {
    
    this.folderId = folderId;
    return this;
  }

  /**
   * The folder receiving the file. It is the folder the upload was reserved against, or the sub-folder created for  it when the reservation declared a relative path.
   * @return folderId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_FOLDER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFolderId() {
    return folderId;
  }


  @JsonProperty(value = JSON_PROPERTY_FOLDER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFolderId(@javax.annotation.Nullable Integer folderId) {
    this.folderId = folderId;
  }

  public UploadSessionResponseDto version(@javax.annotation.Nullable Integer version) {
    
    this.version = version;
    return this;
  }

  /**
   * The revision the content is being written as: 1 for a file that did not exist, the next number when the upload  took over a file of the same title, and the unchanged current number for an upload opened over an existing  file, which replaces its content in place.
   * @return version
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersion() {
    return version;
  }


  @JsonProperty(value = JSON_PROPERTY_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(@javax.annotation.Nullable Integer version) {
    this.version = version;
  }

  public UploadSessionResponseDto title(@javax.annotation.Nullable String title) {
    this.title = JsonNullable.<String>of(title);
    
    return this;
  }

  /**
   * The title the file is stored under, after characters a title cannot hold were replaced and, where a second  copy was asked for, a numeric suffix was added - so it can differ from the name that was sent.
   * @return title
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getTitle() {
        return title.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getTitle_JsonNullable() {
    return title;
  }
  
  @JsonProperty(JSON_PROPERTY_TITLE)
  public void setTitle_JsonNullable(JsonNullable<String> title) {
    this.title = title;
  }

  public void setTitle(@javax.annotation.Nullable String title) {
    this.title = JsonNullable.<String>of(title);
  }

  public UploadSessionResponseDto providerKey(@javax.annotation.Nullable String providerKey) {
    this.providerKey = JsonNullable.<String>of(providerKey);
    
    return this;
  }

  /**
   * The third-party service holding the destination, such as `GoogleDrive` or `OneDrive`, and null for a folder  stored on the portal itself.
   * @return providerKey
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getProviderKey() {
        return providerKey.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_PROVIDER_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getProviderKey_JsonNullable() {
    return providerKey;
  }
  
  @JsonProperty(JSON_PROPERTY_PROVIDER_KEY)
  public void setProviderKey_JsonNullable(JsonNullable<String> providerKey) {
    this.providerKey = providerKey;
  }

  public void setProviderKey(@javax.annotation.Nullable String providerKey) {
    this.providerKey = JsonNullable.<String>of(providerKey);
  }

  public UploadSessionResponseDto uploaded(@javax.annotation.Nullable Boolean uploaded) {
    
    this.uploaded = uploaded;
    return this;
  }

  /**
   * False while bytes are still missing, when the answer only reports progress; true in the answer that reports  the stored file, which is also the answer that arrives with 201.
   * @return uploaded
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_UPLOADED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUploaded() {
    return uploaded;
  }


  @JsonProperty(value = JSON_PROPERTY_UPLOADED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUploaded(@javax.annotation.Nullable Boolean uploaded) {
    this.uploaded = uploaded;
  }

  public UploadSessionResponseDto _file(@javax.annotation.Nullable FileDto _file) {
    
    this._file = _file;
    return this;
  }

  /**
   * The file as it stands. It is filled in both answers, but while `uploaded` is false it describes a file that  has not been written yet, so its identifier, size and links are only worth reading once that flag turns true.
   * @return _file
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_FILE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FileDto getFile() {
    return _file;
  }


  @JsonProperty(value = JSON_PROPERTY_FILE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFile(@javax.annotation.Nullable FileDto _file) {
    this._file = _file;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadSessionResponseDto uploadSessionResponseDto = (UploadSessionResponseDto) o;
    return Objects.equals(this.id, uploadSessionResponseDto.id) &&
        Objects.equals(this.folderId, uploadSessionResponseDto.folderId) &&
        Objects.equals(this.version, uploadSessionResponseDto.version) &&
        equalsNullable(this.title, uploadSessionResponseDto.title) &&
        equalsNullable(this.providerKey, uploadSessionResponseDto.providerKey) &&
        Objects.equals(this.uploaded, uploadSessionResponseDto.uploaded) &&
        Objects.equals(this._file, uploadSessionResponseDto._file);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, folderId, version, hashCodeNullable(title), hashCodeNullable(providerKey), uploaded, _file);
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
    sb.append("class UploadSessionResponseDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    providerKey: ").append(toIndentedString(providerKey)).append("\n");
    sb.append("    uploaded: ").append(toIndentedString(uploaded)).append("\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
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

    // add `folderId` to the URL query string
    if (getFolderId() != null) {
      try {
        joiner.add(String.format("%sfolderId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFolderId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      try {
        joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `title` to the URL query string
    if (getTitle() != null) {
      try {
        joiner.add(String.format("%stitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTitle()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `providerKey` to the URL query string
    if (getProviderKey() != null) {
      try {
        joiner.add(String.format("%sproviderKey%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProviderKey()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `uploaded` to the URL query string
    if (getUploaded() != null) {
      try {
        joiner.add(String.format("%suploaded%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUploaded()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `file` to the URL query string
    if (getFile() != null) {
      joiner.add(getFile().toUrlQueryString(prefix + "file" + suffix));
    }

    return joiner.toString();
  }

}

