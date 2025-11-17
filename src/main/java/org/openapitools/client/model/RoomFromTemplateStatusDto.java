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
 * The progress parameters of creating a room from the template.
 */
@JsonPropertyOrder({
  RoomFromTemplateStatusDto.JSON_PROPERTY_ROOM_ID,
  RoomFromTemplateStatusDto.JSON_PROPERTY_PROGRESS,
  RoomFromTemplateStatusDto.JSON_PROPERTY_ERROR,
  RoomFromTemplateStatusDto.JSON_PROPERTY_IS_COMPLETED
})

public class RoomFromTemplateStatusDto {
  public static final String JSON_PROPERTY_ROOM_ID = "roomId";
  @javax.annotation.Nonnull
  private Integer roomId;

  public static final String JSON_PROPERTY_PROGRESS = "progress";
  @javax.annotation.Nonnull
  private Double progress;

  public static final String JSON_PROPERTY_ERROR = "error";
  @javax.annotation.Nullable
  private String error;

  public static final String JSON_PROPERTY_IS_COMPLETED = "isCompleted";
  @javax.annotation.Nonnull
  private Boolean isCompleted;

  public RoomFromTemplateStatusDto() {
  }

  public RoomFromTemplateStatusDto roomId(@javax.annotation.Nonnull Integer roomId) {
    
    this.roomId = roomId;
    return this;
  }

  /**
   * The room ID.
   * @return roomId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ROOM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getRoomId() {
    return roomId;
  }


  @JsonProperty(JSON_PROPERTY_ROOM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRoomId(@javax.annotation.Nonnull Integer roomId) {
    this.roomId = roomId;
  }

  public RoomFromTemplateStatusDto progress(@javax.annotation.Nonnull Double progress) {
    
    this.progress = progress;
    return this;
  }

  /**
   * The progress of creating a room from the template.
   * @return progress
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROGRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getProgress() {
    return progress;
  }


  @JsonProperty(JSON_PROPERTY_PROGRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProgress(@javax.annotation.Nonnull Double progress) {
    this.progress = progress;
  }

  public RoomFromTemplateStatusDto error(@javax.annotation.Nullable String error) {
    
    this.error = error;
    return this;
  }

  /**
   * The error message that is sent when a room is not created successfully from the template.
   * @return error
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getError() {
    return error;
  }


  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setError(@javax.annotation.Nullable String error) {
    this.error = error;
  }

  public RoomFromTemplateStatusDto isCompleted(@javax.annotation.Nonnull Boolean isCompleted) {
    
    this.isCompleted = isCompleted;
    return this;
  }

  /**
   * Specifies whether the process of creating a room from the template is completed.
   * @return isCompleted
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_COMPLETED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsCompleted() {
    return isCompleted;
  }


  @JsonProperty(JSON_PROPERTY_IS_COMPLETED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsCompleted(@javax.annotation.Nonnull Boolean isCompleted) {
    this.isCompleted = isCompleted;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomFromTemplateStatusDto roomFromTemplateStatusDto = (RoomFromTemplateStatusDto) o;
    return Objects.equals(this.roomId, roomFromTemplateStatusDto.roomId) &&
        Objects.equals(this.progress, roomFromTemplateStatusDto.progress) &&
        Objects.equals(this.error, roomFromTemplateStatusDto.error) &&
        Objects.equals(this.isCompleted, roomFromTemplateStatusDto.isCompleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roomId, progress, error, isCompleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomFromTemplateStatusDto {\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    isCompleted: ").append(toIndentedString(isCompleted)).append("\n");
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

    // add `roomId` to the URL query string
    if (getRoomId() != null) {
      try {
        joiner.add(String.format("%sroomId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRoomId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `progress` to the URL query string
    if (getProgress() != null) {
      try {
        joiner.add(String.format("%sprogress%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProgress()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `error` to the URL query string
    if (getError() != null) {
      try {
        joiner.add(String.format("%serror%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getError()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isCompleted` to the URL query string
    if (getIsCompleted() != null) {
      try {
        joiner.add(String.format("%sisCompleted%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsCompleted()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

