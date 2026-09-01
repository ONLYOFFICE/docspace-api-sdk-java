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
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * A file attachment draft to persist.
 */
@JsonPropertyOrder({
  AiAttachmentsSaveFileRequestInput.JSON_PROPERTY_PATH,
  AiAttachmentsSaveFileRequestInput.JSON_PROPERTY_CONTENT,
  AiAttachmentsSaveFileRequestInput.JSON_PROPERTY_TYPE,
  AiAttachmentsSaveFileRequestInput.JSON_PROPERTY_TITLE
})
@JsonTypeName("aiAttachmentsSaveFile_request_input")

public class AiAttachmentsSaveFileRequestInput {
  public static final String JSON_PROPERTY_PATH = "path";
  @javax.annotation.Nonnull  private String path;

  public static final String JSON_PROPERTY_CONTENT = "content";
  @javax.annotation.Nonnull  private String content;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nonnull  private BigDecimal type;

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable  private String title;

  public AiAttachmentsSaveFileRequestInput() {
  }


  public AiAttachmentsSaveFileRequestInput path(@javax.annotation.Nonnull String path) {
    
    this.path = path;
    return this;
  }

  /**
   * Storage path/key of the file.
   * @return path
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_PATH, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPath() {
    return path;
  }


  @JsonProperty(value = JSON_PROPERTY_PATH, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPath(@javax.annotation.Nonnull String path) {
    this.path = path;
  }

  public AiAttachmentsSaveFileRequestInput content(@javax.annotation.Nonnull String content) {
    
    this.content = content;
    return this;
  }

  /**
   * File contents.
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

  public AiAttachmentsSaveFileRequestInput type(@javax.annotation.Nonnull BigDecimal type) {
    
    this.type = type;
    return this;
  }

  /**
   * File type discriminator.
   * @return type
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(@javax.annotation.Nonnull BigDecimal type) {
    this.type = type;
  }

  public AiAttachmentsSaveFileRequestInput title(@javax.annotation.Nullable String title) {
    
    this.title = title;
    return this;
  }

  /**
   * Optional display title.
   * @return title
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(value = JSON_PROPERTY_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(@javax.annotation.Nullable String title) {
    this.title = title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiAttachmentsSaveFileRequestInput aiAttachmentsSaveFileRequestInput = (AiAttachmentsSaveFileRequestInput) o;
    return Objects.equals(this.path, aiAttachmentsSaveFileRequestInput.path) &&
        Objects.equals(this.content, aiAttachmentsSaveFileRequestInput.content) &&
        Objects.equals(this.type, aiAttachmentsSaveFileRequestInput.type) &&
        Objects.equals(this.title, aiAttachmentsSaveFileRequestInput.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, content, type, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiAttachmentsSaveFileRequestInput {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

    // add `path` to the URL query string
    if (getPath() != null) {
      try {
        joiner.add(String.format("%spath%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPath()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `type` to the URL query string
    if (getType() != null) {
      try {
        joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), "UTF-8").replaceAll("\\+", "%20")));
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

