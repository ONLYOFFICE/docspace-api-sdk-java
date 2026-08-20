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
 * The file draft parameters.
 */
@JsonPropertyOrder({
  DraftLocationInteger.JSON_PROPERTY_FOLDER_ID,
  DraftLocationInteger.JSON_PROPERTY_FOLDER_TITLE,
  DraftLocationInteger.JSON_PROPERTY_FILE_ID,
  DraftLocationInteger.JSON_PROPERTY_FILE_TITLE
})

public class DraftLocationInteger {
  public static final String JSON_PROPERTY_FOLDER_ID = "folderId";
  @javax.annotation.Nullable  private Integer folderId;

  public static final String JSON_PROPERTY_FOLDER_TITLE = "folderTitle";
  @javax.annotation.Nullable  private JsonNullable<String> folderTitle = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FILE_ID = "fileId";
  @javax.annotation.Nullable  private Integer fileId;

  public static final String JSON_PROPERTY_FILE_TITLE = "fileTitle";
  @javax.annotation.Nullable  private JsonNullable<String> fileTitle = JsonNullable.<String>undefined();

  public DraftLocationInteger() {
  }


  public DraftLocationInteger folderId(@javax.annotation.Nullable Integer folderId) {
    
    this.folderId = folderId;
    return this;
  }

  /**
   * The InProcess folder ID of the draft.
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

  public DraftLocationInteger folderTitle(@javax.annotation.Nullable String folderTitle) {
    this.folderTitle = JsonNullable.<String>of(folderTitle);
    
    return this;
  }

  /**
   * The InProcess folder title of the draft.
   * @return folderTitle
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getFolderTitle() {
        return folderTitle.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_FOLDER_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getFolderTitle_JsonNullable() {
    return folderTitle;
  }
  
  @JsonProperty(JSON_PROPERTY_FOLDER_TITLE)
  public void setFolderTitle_JsonNullable(JsonNullable<String> folderTitle) {
    this.folderTitle = folderTitle;
  }

  public void setFolderTitle(@javax.annotation.Nullable String folderTitle) {
    this.folderTitle = JsonNullable.<String>of(folderTitle);
  }

  public DraftLocationInteger fileId(@javax.annotation.Nullable Integer fileId) {
    
    this.fileId = fileId;
    return this;
  }

  /**
   * The draft ID.
   * @return fileId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_FILE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFileId() {
    return fileId;
  }


  @JsonProperty(value = JSON_PROPERTY_FILE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileId(@javax.annotation.Nullable Integer fileId) {
    this.fileId = fileId;
  }

  public DraftLocationInteger fileTitle(@javax.annotation.Nullable String fileTitle) {
    this.fileTitle = JsonNullable.<String>of(fileTitle);
    
    return this;
  }

  /**
   * The draft title.
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DraftLocationInteger draftLocationInteger = (DraftLocationInteger) o;
    return Objects.equals(this.folderId, draftLocationInteger.folderId) &&
        equalsNullable(this.folderTitle, draftLocationInteger.folderTitle) &&
        Objects.equals(this.fileId, draftLocationInteger.fileId) &&
        equalsNullable(this.fileTitle, draftLocationInteger.fileTitle);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(folderId, hashCodeNullable(folderTitle), fileId, hashCodeNullable(fileTitle));
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
    sb.append("class DraftLocationInteger {\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    folderTitle: ").append(toIndentedString(folderTitle)).append("\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    fileTitle: ").append(toIndentedString(fileTitle)).append("\n");
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

    // add `folderId` to the URL query string
    if (getFolderId() != null) {
      try {
        joiner.add(String.format("%sfolderId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFolderId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `folderTitle` to the URL query string
    if (getFolderTitle() != null) {
      try {
        joiner.add(String.format("%sfolderTitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFolderTitle()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `fileId` to the URL query string
    if (getFileId() != null) {
      try {
        joiner.add(String.format("%sfileId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFileId()), "UTF-8").replaceAll("\\+", "%20")));
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

    return joiner.toString();
  }

}

