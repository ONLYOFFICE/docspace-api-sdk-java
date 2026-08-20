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
import org.openapitools.client.model.CheckDestFolderResult;
import org.openapitools.client.model.FileEntryBaseDto;
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
 * The result of checking whether files can be moved or copied to the specified folder.
 */
@JsonPropertyOrder({
  CheckDestFolderDto.JSON_PROPERTY_RESULT,
  CheckDestFolderDto.JSON_PROPERTY_FILES
})

public class CheckDestFolderDto {
  public static final String JSON_PROPERTY_RESULT = "result";
  @javax.annotation.Nullable  private CheckDestFolderResult result;

  public static final String JSON_PROPERTY_FILES = "files";
  @javax.annotation.Nullable  private JsonNullable<List<FileEntryBaseDto>> files = JsonNullable.<List<FileEntryBaseDto>>undefined();

  public CheckDestFolderDto() {
  }


  public CheckDestFolderDto result(@javax.annotation.Nullable CheckDestFolderResult result) {
    
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_RESULT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CheckDestFolderResult getResult() {
    return result;
  }


  @JsonProperty(value = JSON_PROPERTY_RESULT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResult(@javax.annotation.Nullable CheckDestFolderResult result) {
    this.result = result;
  }

  public CheckDestFolderDto files(@javax.annotation.Nullable List<FileEntryBaseDto> files) {
    this.files = JsonNullable.<List<FileEntryBaseDto>>of(files);
    
    return this;
  }

  public CheckDestFolderDto addFilesItem(FileEntryBaseDto filesItem) {
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
   * The list of files in the destination folder.
   * @return files
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<FileEntryBaseDto> getFiles() {
        return files.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_FILES, required = false)
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckDestFolderDto checkDestFolderDto = (CheckDestFolderDto) o;
    return Objects.equals(this.result, checkDestFolderDto.result) &&
        equalsNullable(this.files, checkDestFolderDto.files);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, hashCodeNullable(files));
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
    sb.append("class CheckDestFolderDto {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
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

    // add `result` to the URL query string
    if (getResult() != null) {
      try {
        joiner.add(String.format("%sresult%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getResult()), "UTF-8").replaceAll("\\+", "%20")));
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

    return joiner.toString();
  }

}

