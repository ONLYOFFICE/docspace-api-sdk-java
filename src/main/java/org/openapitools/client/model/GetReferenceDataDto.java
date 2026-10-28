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
 * The body of a spreadsheet reference request: the source spreadsheet, and the three ways of naming the document it  refers to, which are tried in the order they are described.
 */
@JsonPropertyOrder({
  GetReferenceDataDto.JSON_PROPERTY_FILE_KEY,
  GetReferenceDataDto.JSON_PROPERTY_INSTANCE_ID,
  GetReferenceDataDto.JSON_PROPERTY_SOURCE_FILE_ID,
  GetReferenceDataDto.JSON_PROPERTY_PATH,
  GetReferenceDataDto.JSON_PROPERTY_LINK
})

public class GetReferenceDataDto {
  public static final String JSON_PROPERTY_FILE_KEY = "fileKey";
  @javax.annotation.Nullable  private String fileKey;

  public static final String JSON_PROPERTY_INSTANCE_ID = "instanceId";
  @javax.annotation.Nullable  private String instanceId;

  public static final String JSON_PROPERTY_SOURCE_FILE_ID = "sourceFileId";
  @javax.annotation.Nullable  private Integer sourceFileId;

  public static final String JSON_PROPERTY_PATH = "path";
  @javax.annotation.Nullable  private JsonNullable<String> path = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LINK = "link";
  @javax.annotation.Nullable  private JsonNullable<String> link = JsonNullable.<String>undefined();

  public GetReferenceDataDto() {
  }


  public GetReferenceDataDto fileKey(@javax.annotation.Nullable String fileKey) {
    
    this.fileKey = fileKey;
    return this;
  }

  /**
   * The id of the referenced file as the document service recorded it in the formula. It is tried first, and only  when `instanceId` names this portal.
   * @return fileKey
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_FILE_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFileKey() {
    return fileKey;
  }


  @JsonProperty(value = JSON_PROPERTY_FILE_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFileKey(@javax.annotation.Nullable String fileKey) {
    this.fileKey = fileKey;
  }

  public GetReferenceDataDto instanceId(@javax.annotation.Nullable String instanceId) {
    
    this.instanceId = instanceId;
    return this;
  }

  /**
   * The portal the reference was made on, as the document service recorded it. Only the id of this portal makes  the file key resolvable; any other value falls through to the path and the link.
   * @return instanceId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_INSTANCE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getInstanceId() {
    return instanceId;
  }


  @JsonProperty(value = JSON_PROPERTY_INSTANCE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInstanceId(@javax.annotation.Nullable String instanceId) {
    this.instanceId = instanceId;
  }

  public GetReferenceDataDto sourceFileId(@javax.annotation.Nullable Integer sourceFileId) {
    
    this.sourceFileId = sourceFileId;
    return this;
  }

  /**
   * The spreadsheet the formula sits in. The path is resolved against it - the referenced file is looked for among  the files lying next to it - and it is the file whose read access is checked.
   * @return sourceFileId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SOURCE_FILE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSourceFileId() {
    return sourceFileId;
  }


  @JsonProperty(value = JSON_PROPERTY_SOURCE_FILE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceFileId(@javax.annotation.Nullable Integer sourceFileId) {
    this.sourceFileId = sourceFileId;
  }

  public GetReferenceDataDto path(@javax.annotation.Nullable String path) {
    this.path = JsonNullable.<String>of(path);
    
    return this;
  }

  /**
   * The title of the referenced file exactly as the formula spells it, matched against the files lying next to the  source file. It is tried after the file key, and only when no link is given.
   * @return path
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getPath() {
        return path.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_PATH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getPath_JsonNullable() {
    return path;
  }
  
  @JsonProperty(JSON_PROPERTY_PATH)
  public void setPath_JsonNullable(JsonNullable<String> path) {
    this.path = path;
  }

  public void setPath(@javax.annotation.Nullable String path) {
    this.path = JsonNullable.<String>of(path);
  }

  public GetReferenceDataDto link(@javax.annotation.Nullable String link) {
    this.link = JsonNullable.<String>of(link);
    
    return this;
  }

  /**
   * The web address the formula points at, an editor link of this portal or one of its short links. It is tried  last, and an address belonging to another site is not resolved at all but handed back for the client to follow  as it is.
   * @return link
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getLink() {
        return link.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_LINK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getLink_JsonNullable() {
    return link;
  }
  
  @JsonProperty(JSON_PROPERTY_LINK)
  public void setLink_JsonNullable(JsonNullable<String> link) {
    this.link = link;
  }

  public void setLink(@javax.annotation.Nullable String link) {
    this.link = JsonNullable.<String>of(link);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetReferenceDataDto getReferenceDataDto = (GetReferenceDataDto) o;
    return Objects.equals(this.fileKey, getReferenceDataDto.fileKey) &&
        Objects.equals(this.instanceId, getReferenceDataDto.instanceId) &&
        Objects.equals(this.sourceFileId, getReferenceDataDto.sourceFileId) &&
        equalsNullable(this.path, getReferenceDataDto.path) &&
        equalsNullable(this.link, getReferenceDataDto.link);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileKey, instanceId, sourceFileId, hashCodeNullable(path), hashCodeNullable(link));
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
    sb.append("class GetReferenceDataDto {\n");
    sb.append("    fileKey: ").append(toIndentedString(fileKey)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    sourceFileId: ").append(toIndentedString(sourceFileId)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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

    // add `fileKey` to the URL query string
    if (getFileKey() != null) {
      try {
        joiner.add(String.format("%sfileKey%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFileKey()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `instanceId` to the URL query string
    if (getInstanceId() != null) {
      try {
        joiner.add(String.format("%sinstanceId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInstanceId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sourceFileId` to the URL query string
    if (getSourceFileId() != null) {
      try {
        joiner.add(String.format("%ssourceFileId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSourceFileId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `path` to the URL query string
    if (getPath() != null) {
      try {
        joiner.add(String.format("%spath%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPath()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `link` to the URL query string
    if (getLink() != null) {
      try {
        joiner.add(String.format("%slink%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLink()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

