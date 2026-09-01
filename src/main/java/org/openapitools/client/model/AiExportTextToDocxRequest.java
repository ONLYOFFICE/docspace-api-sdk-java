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
import org.openapitools.client.model.AiExportTextToDocxRequestFolderId;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * AiExportTextToDocxRequest
 */
@JsonPropertyOrder({
  AiExportTextToDocxRequest.JSON_PROPERTY_TITLE,
  AiExportTextToDocxRequest.JSON_PROPERTY_CONTENT,
  AiExportTextToDocxRequest.JSON_PROPERTY_FOLDER_ID
})
@JsonTypeName("aiExportTextToDocx_request")

public class AiExportTextToDocxRequest {
  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nonnull  private String title;

  public static final String JSON_PROPERTY_CONTENT = "content";
  @javax.annotation.Nonnull  private String content;

  public static final String JSON_PROPERTY_FOLDER_ID = "folderId";
  @javax.annotation.Nonnull  private AiExportTextToDocxRequestFolderId folderId;

  public AiExportTextToDocxRequest() {
  }


  public AiExportTextToDocxRequest title(@javax.annotation.Nonnull String title) {
    
    this.title = title;
    return this;
  }

  /**
   * Document title (also the file name).
   * @return title
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_TITLE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(value = JSON_PROPERTY_TITLE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTitle(@javax.annotation.Nonnull String title) {
    this.title = title;
  }

  public AiExportTextToDocxRequest content(@javax.annotation.Nonnull String content) {
    
    this.content = content;
    return this;
  }

  /**
   * Markdown content to convert.
   * @return content
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_CONTENT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getContent() {
    return content;
  }


  @JsonProperty(value = JSON_PROPERTY_CONTENT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContent(@javax.annotation.Nonnull String content) {
    this.content = content;
  }

  public AiExportTextToDocxRequest folderId(@javax.annotation.Nonnull AiExportTextToDocxRequestFolderId folderId) {
    
    this.folderId = folderId;
    return this;
  }

  /**
   * Get folderId
   * @return folderId
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_FOLDER_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AiExportTextToDocxRequestFolderId getFolderId() {
    return folderId;
  }


  @JsonProperty(value = JSON_PROPERTY_FOLDER_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFolderId(@javax.annotation.Nonnull AiExportTextToDocxRequestFolderId folderId) {
    this.folderId = folderId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiExportTextToDocxRequest aiExportTextToDocxRequest = (AiExportTextToDocxRequest) o;
    return Objects.equals(this.title, aiExportTextToDocxRequest.title) &&
        Objects.equals(this.content, aiExportTextToDocxRequest.content) &&
        Objects.equals(this.folderId, aiExportTextToDocxRequest.folderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, content, folderId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiExportTextToDocxRequest {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
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

    // add `title` to the URL query string
    if (getTitle() != null) {
      try {
        joiner.add(String.format("%stitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTitle()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `content` to the URL query string
    if (getContent() != null) {
      try {
        joiner.add(String.format("%scontent%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getContent()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `folderId` to the URL query string
    if (getFolderId() != null) {
      joiner.add(getFolderId().toUrlQueryString(prefix + "folderId" + suffix));
    }

    return joiner.toString();
  }

}

