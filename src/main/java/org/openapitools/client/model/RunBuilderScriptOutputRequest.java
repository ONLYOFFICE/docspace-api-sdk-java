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
 * Where one produced file goes.
 */
@JsonPropertyOrder({
  RunBuilderScriptOutputRequest.JSON_PROPERTY_FILE_ID,
  RunBuilderScriptOutputRequest.JSON_PROPERTY_FOLDER_ID,
  RunBuilderScriptOutputRequest.JSON_PROPERTY_TITLE
})

public class RunBuilderScriptOutputRequest {
  public static final String JSON_PROPERTY_FILE_ID = "fileId";
  @javax.annotation.Nullable  private JsonNullable<Integer> fileId = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_FOLDER_ID = "folderId";
  @javax.annotation.Nullable  private JsonNullable<Integer> folderId = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable  private JsonNullable<String> title = JsonNullable.<String>undefined();

  public RunBuilderScriptOutputRequest() {
  }


  public RunBuilderScriptOutputRequest fileId(@javax.annotation.Nullable Integer fileId) {
    this.fileId = JsonNullable.<Integer>of(fileId);
    
    return this;
  }

  /**
   * The id of a portal file to store the result in as a new version, as reported by a folder listing such as  `GET api/2.0/files/{folderId}`.
   * @return fileId
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Integer getFileId() {
        return fileId.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_FILE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Integer> getFileId_JsonNullable() {
    return fileId;
  }
  
  @JsonProperty(JSON_PROPERTY_FILE_ID)
  public void setFileId_JsonNullable(JsonNullable<Integer> fileId) {
    this.fileId = fileId;
  }

  public void setFileId(@javax.annotation.Nullable Integer fileId) {
    this.fileId = JsonNullable.<Integer>of(fileId);
  }

  public RunBuilderScriptOutputRequest folderId(@javax.annotation.Nullable Integer folderId) {
    this.folderId = JsonNullable.<Integer>of(folderId);
    
    return this;
  }

  /**
   * The id of a folder to save the result in as a new file, as reported by a folder listing such as  `GET api/2.0/files/{folderId}`.
   * @return folderId
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Integer getFolderId() {
        return folderId.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_FOLDER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Integer> getFolderId_JsonNullable() {
    return folderId;
  }
  
  @JsonProperty(JSON_PROPERTY_FOLDER_ID)
  public void setFolderId_JsonNullable(JsonNullable<Integer> folderId) {
    this.folderId = folderId;
  }

  public void setFolderId(@javax.annotation.Nullable Integer folderId) {
    this.folderId = JsonNullable.<Integer>of(folderId);
  }

  public RunBuilderScriptOutputRequest title(@javax.annotation.Nullable String title) {
    this.title = JsonNullable.<String>of(title);
    
    return this;
  }

  /**
   * The title of the new file, when it has to differ from the name the script saved the result under.
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunBuilderScriptOutputRequest runBuilderScriptOutputRequest = (RunBuilderScriptOutputRequest) o;
    return equalsNullable(this.fileId, runBuilderScriptOutputRequest.fileId) &&
        equalsNullable(this.folderId, runBuilderScriptOutputRequest.folderId) &&
        equalsNullable(this.title, runBuilderScriptOutputRequest.title);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(fileId), hashCodeNullable(folderId), hashCodeNullable(title));
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
    sb.append("class RunBuilderScriptOutputRequest {\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

    // add `fileId` to the URL query string
    if (getFileId() != null) {
      try {
        joiner.add(String.format("%sfileId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFileId()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `title` to the URL query string
    if (getTitle() != null) {
      try {
        joiner.add(String.format("%stitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTitle()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

