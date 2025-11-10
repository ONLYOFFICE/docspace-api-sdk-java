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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The parameters for deleting a folder.
 */
@JsonPropertyOrder({
  DeleteFolder.JSON_PROPERTY_DELETE_AFTER,
  DeleteFolder.JSON_PROPERTY_IMMEDIATELY
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class DeleteFolder {
  public static final String JSON_PROPERTY_DELETE_AFTER = "deleteAfter";
  @javax.annotation.Nullable
  private Boolean deleteAfter;

  public static final String JSON_PROPERTY_IMMEDIATELY = "immediately";
  @javax.annotation.Nullable
  private Boolean immediately;

  public DeleteFolder() {
  }

  public DeleteFolder deleteAfter(@javax.annotation.Nullable Boolean deleteAfter) {
    
    this.deleteAfter = deleteAfter;
    return this;
  }

  /**
   * Specifies whether to delete a folder after the editing session is finished or not.
   * @return deleteAfter
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETE_AFTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDeleteAfter() {
    return deleteAfter;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_AFTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteAfter(@javax.annotation.Nullable Boolean deleteAfter) {
    this.deleteAfter = deleteAfter;
  }

  public DeleteFolder immediately(@javax.annotation.Nullable Boolean immediately) {
    
    this.immediately = immediately;
    return this;
  }

  /**
   * Specifies whether to move a folder to the \\Trash\\ folder or delete it immediately.
   * @return immediately
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMMEDIATELY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getImmediately() {
    return immediately;
  }


  @JsonProperty(JSON_PROPERTY_IMMEDIATELY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImmediately(@javax.annotation.Nullable Boolean immediately) {
    this.immediately = immediately;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteFolder deleteFolder = (DeleteFolder) o;
    return Objects.equals(this.deleteAfter, deleteFolder.deleteAfter) &&
        Objects.equals(this.immediately, deleteFolder.immediately);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteAfter, immediately);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteFolder {\n");
    sb.append("    deleteAfter: ").append(toIndentedString(deleteAfter)).append("\n");
    sb.append("    immediately: ").append(toIndentedString(immediately)).append("\n");
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

    // add `deleteAfter` to the URL query string
    if (getDeleteAfter() != null) {
      try {
        joiner.add(String.format("%sdeleteAfter%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDeleteAfter()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `immediately` to the URL query string
    if (getImmediately() != null) {
      try {
        joiner.add(String.format("%simmediately%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getImmediately()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

