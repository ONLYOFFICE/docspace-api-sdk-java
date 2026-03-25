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
import org.openapitools.client.model.ValidationResult;
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
 * The confirmation parameters.
 */
@JsonPropertyOrder({
  ConfirmDto.JSON_PROPERTY_RESULT,
  ConfirmDto.JSON_PROPERTY_ROOM_ID,
  ConfirmDto.JSON_PROPERTY_TITLE,
  ConfirmDto.JSON_PROPERTY_EMAIL,
  ConfirmDto.JSON_PROPERTY_IS_AGENT
})

public class ConfirmDto {
  public static final String JSON_PROPERTY_RESULT = "result";
  @javax.annotation.Nonnull  private ValidationResult result;

  public static final String JSON_PROPERTY_ROOM_ID = "roomId";
  @javax.annotation.Nullable  private JsonNullable<String> roomId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable  private JsonNullable<String> title = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EMAIL = "email";
  @javax.annotation.Nullable  private JsonNullable<String> email = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IS_AGENT = "isAgent";
  @javax.annotation.Nullable  private Boolean isAgent;

  public ConfirmDto() {
  }


  public ConfirmDto result(@javax.annotation.Nonnull ValidationResult result) {
    
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_RESULT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ValidationResult getResult() {
    return result;
  }


  @JsonProperty(value = JSON_PROPERTY_RESULT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResult(@javax.annotation.Nonnull ValidationResult result) {
    this.result = result;
  }

  public ConfirmDto roomId(@javax.annotation.Nullable String roomId) {
    this.roomId = JsonNullable.<String>of(roomId);
    
    return this;
  }

  /**
   * The confirmation room ID.
   * @return roomId
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getRoomId() {
        return roomId.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ROOM_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getRoomId_JsonNullable() {
    return roomId;
  }
  
  @JsonProperty(JSON_PROPERTY_ROOM_ID)
  public void setRoomId_JsonNullable(JsonNullable<String> roomId) {
    this.roomId = roomId;
  }

  public void setRoomId(@javax.annotation.Nullable String roomId) {
    this.roomId = JsonNullable.<String>of(roomId);
  }

  public ConfirmDto title(@javax.annotation.Nullable String title) {
    this.title = JsonNullable.<String>of(title);
    
    return this;
  }

  /**
   * The confirmation title.
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

  public ConfirmDto email(@javax.annotation.Nullable String email) {
    this.email = JsonNullable.<String>of(email);
    
    return this;
  }

  /**
   * The confirmation email.
   * @return email
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getEmail() {
        return email.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_EMAIL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getEmail_JsonNullable() {
    return email;
  }
  
  @JsonProperty(JSON_PROPERTY_EMAIL)
  public void setEmail_JsonNullable(JsonNullable<String> email) {
    this.email = email;
  }

  public void setEmail(@javax.annotation.Nullable String email) {
    this.email = JsonNullable.<String>of(email);
  }

  public ConfirmDto isAgent(@javax.annotation.Nullable Boolean isAgent) {
    
    this.isAgent = isAgent;
    return this;
  }

  /**
   * The confirmation is agent.
   * @return isAgent
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IS_AGENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsAgent() {
    return isAgent;
  }


  @JsonProperty(value = JSON_PROPERTY_IS_AGENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsAgent(@javax.annotation.Nullable Boolean isAgent) {
    this.isAgent = isAgent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfirmDto confirmDto = (ConfirmDto) o;
    return Objects.equals(this.result, confirmDto.result) &&
        equalsNullable(this.roomId, confirmDto.roomId) &&
        equalsNullable(this.title, confirmDto.title) &&
        equalsNullable(this.email, confirmDto.email) &&
        Objects.equals(this.isAgent, confirmDto.isAgent);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, hashCodeNullable(roomId), hashCodeNullable(title), hashCodeNullable(email), isAgent);
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
    sb.append("class ConfirmDto {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    isAgent: ").append(toIndentedString(isAgent)).append("\n");
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

    // add `roomId` to the URL query string
    if (getRoomId() != null) {
      try {
        joiner.add(String.format("%sroomId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRoomId()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `email` to the URL query string
    if (getEmail() != null) {
      try {
        joiner.add(String.format("%semail%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmail()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isAgent` to the URL query string
    if (getIsAgent() != null) {
      try {
        joiner.add(String.format("%sisAgent%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsAgent()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

