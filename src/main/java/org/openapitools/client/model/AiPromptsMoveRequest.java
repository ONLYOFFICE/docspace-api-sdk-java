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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * AiPromptsMoveRequest
 */
@JsonPropertyOrder({
  AiPromptsMoveRequest.JSON_PROPERTY_ID,
  AiPromptsMoveRequest.JSON_PROPERTY_FOLDER_ID
})
@JsonTypeName("aiPromptsMove_request")

public class AiPromptsMoveRequest {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nonnull  private String id;

  public static final String JSON_PROPERTY_FOLDER_ID = "folderId";
  @javax.annotation.Nullable  private String folderId;

  public AiPromptsMoveRequest() {
  }


  public AiPromptsMoveRequest id(@javax.annotation.Nonnull String id) {
    
    this.id = id;
    return this;
  }

  /**
   * Prompt id to move.
   * @return id
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(@javax.annotation.Nonnull String id) {
    this.id = id;
  }

  public AiPromptsMoveRequest folderId(@javax.annotation.Nullable String folderId) {
    
    this.folderId = folderId;
    return this;
  }

  /**
   * Target folder id, or `null` for root.
   * @return folderId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_FOLDER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFolderId() {
    return folderId;
  }


  @JsonProperty(value = JSON_PROPERTY_FOLDER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFolderId(@javax.annotation.Nullable String folderId) {
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
    AiPromptsMoveRequest aiPromptsMoveRequest = (AiPromptsMoveRequest) o;
    return Objects.equals(this.id, aiPromptsMoveRequest.id) &&
        Objects.equals(this.folderId, aiPromptsMoveRequest.folderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, folderId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiPromptsMoveRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

    return joiner.toString();
  }

}

