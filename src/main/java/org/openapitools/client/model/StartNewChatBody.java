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
import org.openapitools.client.model.ContinueChatBodyFilesInner;
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
 * Parameters for starting a new AI chat session.
 */
@JsonPropertyOrder({
  StartNewChatBody.JSON_PROPERTY_MESSAGE,
  StartNewChatBody.JSON_PROPERTY_CONTEXT_FOLDER_ID,
  StartNewChatBody.JSON_PROPERTY_FILES
})

public class StartNewChatBody {
  public static final String JSON_PROPERTY_MESSAGE = "message";
  @javax.annotation.Nullable  private String message;

  public static final String JSON_PROPERTY_CONTEXT_FOLDER_ID = "contextFolderId";
  @javax.annotation.Nullable  private JsonNullable<Integer> contextFolderId = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_FILES = "files";
  @javax.annotation.Nullable  private JsonNullable<List<ContinueChatBodyFilesInner>> files = JsonNullable.<List<ContinueChatBodyFilesInner>>undefined();

  public StartNewChatBody() {
  }


  public StartNewChatBody message(@javax.annotation.Nullable String message) {
    
    this.message = message;
    return this;
  }

  /**
   * The initial user message to send to the AI assistant.
   * @return message
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_MESSAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(value = JSON_PROPERTY_MESSAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMessage(@javax.annotation.Nullable String message) {
    this.message = message;
  }

  public StartNewChatBody contextFolderId(@javax.annotation.Nullable Integer contextFolderId) {
    this.contextFolderId = JsonNullable.<Integer>of(contextFolderId);
    
    return this;
  }

  /**
   * The optional collection of file identifiers to attach as context for the AI model.
   * @return contextFolderId
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Integer getContextFolderId() {
        return contextFolderId.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_CONTEXT_FOLDER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Integer> getContextFolderId_JsonNullable() {
    return contextFolderId;
  }
  
  @JsonProperty(JSON_PROPERTY_CONTEXT_FOLDER_ID)
  public void setContextFolderId_JsonNullable(JsonNullable<Integer> contextFolderId) {
    this.contextFolderId = contextFolderId;
  }

  public void setContextFolderId(@javax.annotation.Nullable Integer contextFolderId) {
    this.contextFolderId = JsonNullable.<Integer>of(contextFolderId);
  }

  public StartNewChatBody files(@javax.annotation.Nullable List<ContinueChatBodyFilesInner> files) {
    this.files = JsonNullable.<List<ContinueChatBodyFilesInner>>of(files);
    
    return this;
  }

  public StartNewChatBody addFilesItem(ContinueChatBodyFilesInner filesItem) {
    if (this.files == null || !this.files.isPresent()) {
      this.files = JsonNullable.<List<ContinueChatBodyFilesInner>>of(new ArrayList<>());
    }
    try {
      this.files.get().add(filesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of attached files.
   * @return files
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<ContinueChatBodyFilesInner> getFiles() {
        return files.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_FILES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<ContinueChatBodyFilesInner>> getFiles_JsonNullable() {
    return files;
  }
  
  @JsonProperty(JSON_PROPERTY_FILES)
  public void setFiles_JsonNullable(JsonNullable<List<ContinueChatBodyFilesInner>> files) {
    this.files = files;
  }

  public void setFiles(@javax.annotation.Nullable List<ContinueChatBodyFilesInner> files) {
    this.files = JsonNullable.<List<ContinueChatBodyFilesInner>>of(files);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartNewChatBody startNewChatBody = (StartNewChatBody) o;
    return Objects.equals(this.message, startNewChatBody.message) &&
        equalsNullable(this.contextFolderId, startNewChatBody.contextFolderId) &&
        equalsNullable(this.files, startNewChatBody.files);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, hashCodeNullable(contextFolderId), hashCodeNullable(files));
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
    sb.append("class StartNewChatBody {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    contextFolderId: ").append(toIndentedString(contextFolderId)).append("\n");
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

    // add `message` to the URL query string
    if (getMessage() != null) {
      try {
        joiner.add(String.format("%smessage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMessage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `contextFolderId` to the URL query string
    if (getContextFolderId() != null) {
      try {
        joiner.add(String.format("%scontextFolderId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getContextFolderId()), "UTF-8").replaceAll("\\+", "%20")));
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

