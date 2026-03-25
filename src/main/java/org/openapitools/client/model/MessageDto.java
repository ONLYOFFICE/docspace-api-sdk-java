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
import org.openapitools.client.model.ApiDateTime;
import org.openapitools.client.model.MessageContentDto;
import org.openapitools.client.model.Role;
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
 * The chat message information.
 */
@JsonPropertyOrder({
  MessageDto.JSON_PROPERTY_ID,
  MessageDto.JSON_PROPERTY_ROLE,
  MessageDto.JSON_PROPERTY_CONTENTS,
  MessageDto.JSON_PROPERTY_CREATED_ON
})

public class MessageDto {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable  private Long id;

  public static final String JSON_PROPERTY_ROLE = "role";
  @javax.annotation.Nullable  private Role role;

  public static final String JSON_PROPERTY_CONTENTS = "contents";
  @javax.annotation.Nullable  private JsonNullable<List<MessageContentDto>> contents = JsonNullable.<List<MessageContentDto>>undefined();

  public static final String JSON_PROPERTY_CREATED_ON = "createdOn";
  @javax.annotation.Nullable  private ApiDateTime createdOn;

  public MessageDto() {
  }


  public MessageDto id(@javax.annotation.Nullable Long id) {
    
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the message.
   * @return id
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable Long id) {
    this.id = id;
  }

  public MessageDto role(@javax.annotation.Nullable Role role) {
    
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ROLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Role getRole() {
    return role;
  }


  @JsonProperty(value = JSON_PROPERTY_ROLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRole(@javax.annotation.Nullable Role role) {
    this.role = role;
  }

  public MessageDto contents(@javax.annotation.Nullable List<MessageContentDto> contents) {
    this.contents = JsonNullable.<List<MessageContentDto>>of(contents);
    
    return this;
  }

  public MessageDto addContentsItem(MessageContentDto contentsItem) {
    if (this.contents == null || !this.contents.isPresent()) {
      this.contents = JsonNullable.<List<MessageContentDto>>of(new ArrayList<>());
    }
    try {
      this.contents.get().add(contentsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The ordered collection of content blocks that make up the message body (text, tool calls, or attachments).
   * @return contents
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<MessageContentDto> getContents() {
        return contents.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_CONTENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<MessageContentDto>> getContents_JsonNullable() {
    return contents;
  }
  
  @JsonProperty(JSON_PROPERTY_CONTENTS)
  public void setContents_JsonNullable(JsonNullable<List<MessageContentDto>> contents) {
    this.contents = contents;
  }

  public void setContents(@javax.annotation.Nullable List<MessageContentDto> contents) {
    this.contents = JsonNullable.<List<MessageContentDto>>of(contents);
  }

  public MessageDto createdOn(@javax.annotation.Nullable ApiDateTime createdOn) {
    
    this.createdOn = createdOn;
    return this;
  }

  /**
   * Get createdOn
   * @return createdOn
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CREATED_ON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDateTime getCreatedOn() {
    return createdOn;
  }


  @JsonProperty(value = JSON_PROPERTY_CREATED_ON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedOn(@javax.annotation.Nullable ApiDateTime createdOn) {
    this.createdOn = createdOn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageDto messageDto = (MessageDto) o;
    return Objects.equals(this.id, messageDto.id) &&
        Objects.equals(this.role, messageDto.role) &&
        equalsNullable(this.contents, messageDto.contents) &&
        Objects.equals(this.createdOn, messageDto.createdOn);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, role, hashCodeNullable(contents), createdOn);
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
    sb.append("class MessageDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
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

    // add `role` to the URL query string
    if (getRole() != null) {
      try {
        joiner.add(String.format("%srole%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRole()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `contents` to the URL query string
    if (getContents() != null) {
      for (int i = 0; i < getContents().size(); i++) {
        if (getContents().get(i) != null) {
          joiner.add(getContents().get(i).toUrlQueryString(String.format("%scontents%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `createdOn` to the URL query string
    if (getCreatedOn() != null) {
      joiner.add(getCreatedOn().toUrlQueryString(prefix + "createdOn" + suffix));
    }

    return joiner.toString();
  }

}

