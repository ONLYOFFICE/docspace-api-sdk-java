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
 * The request parameters for configuring notification settings for the chat or collaboration rooms.
 */
@JsonPropertyOrder({
  RoomsNotificationsSettingsRequestDto.JSON_PROPERTY_ROOMS_ID,
  RoomsNotificationsSettingsRequestDto.JSON_PROPERTY_MUTE
})

public class RoomsNotificationsSettingsRequestDto {
  public static final String JSON_PROPERTY_ROOMS_ID = "roomsId";
  @javax.annotation.Nullable
  private JsonNullable<Object> roomsId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_MUTE = "mute";
  @javax.annotation.Nullable
  private Boolean mute;

  public RoomsNotificationsSettingsRequestDto() {
  }


  public RoomsNotificationsSettingsRequestDto roomsId(@javax.annotation.Nullable Object roomsId) {
    this.roomsId = JsonNullable.<Object>of(roomsId);
    
    return this;
  }

  /**
   * The target room identifier.
   * @return roomsId
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getRoomsId() {
        return roomsId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ROOMS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getRoomsId_JsonNullable() {
    return roomsId;
  }
  
  @JsonProperty(JSON_PROPERTY_ROOMS_ID)
  public void setRoomsId_JsonNullable(JsonNullable<Object> roomsId) {
    this.roomsId = roomsId;
  }

  public void setRoomsId(@javax.annotation.Nullable Object roomsId) {
    this.roomsId = JsonNullable.<Object>of(roomsId);
  }

  public RoomsNotificationsSettingsRequestDto mute(@javax.annotation.Nullable Boolean mute) {
    
    this.mute = mute;
    return this;
  }

  /**
   * Specifies whether the notifications will be delivered to the specified room or not.
   * @return mute
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMute() {
    return mute;
  }


  @JsonProperty(JSON_PROPERTY_MUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMute(@javax.annotation.Nullable Boolean mute) {
    this.mute = mute;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomsNotificationsSettingsRequestDto roomsNotificationsSettingsRequestDto = (RoomsNotificationsSettingsRequestDto) o;
    return equalsNullable(this.roomsId, roomsNotificationsSettingsRequestDto.roomsId) &&
        Objects.equals(this.mute, roomsNotificationsSettingsRequestDto.mute);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(roomsId), mute);
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
    sb.append("class RoomsNotificationsSettingsRequestDto {\n");
    sb.append("    roomsId: ").append(toIndentedString(roomsId)).append("\n");
    sb.append("    mute: ").append(toIndentedString(mute)).append("\n");
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

    // add `roomsId` to the URL query string
    if (getRoomsId() != null) {
      try {
        joiner.add(String.format("%sroomsId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRoomsId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `mute` to the URL query string
    if (getMute() != null) {
      try {
        joiner.add(String.format("%smute%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMute()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

