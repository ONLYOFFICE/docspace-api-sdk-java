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
import java.util.UUID;
import org.openapitools.client.model.FileEntryBaseDto;
import org.openapitools.client.model.MultiSizeLogoCover;
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
 * The room security parameters.
 */
@JsonPropertyOrder({
  RoomGroupDto.JSON_PROPERTY_ID,
  RoomGroupDto.JSON_PROPERTY_NAME,
  RoomGroupDto.JSON_PROPERTY_ICON,
  RoomGroupDto.JSON_PROPERTY_USER_ID,
  RoomGroupDto.JSON_PROPERTY_ROOMS,
  RoomGroupDto.JSON_PROPERTY_TOTAL_ROOMS
})

public class RoomGroupDto {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable  private Integer id;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ICON = "icon";
  @javax.annotation.Nullable  private MultiSizeLogoCover icon;

  public static final String JSON_PROPERTY_USER_ID = "userId";
  @javax.annotation.Nullable  private UUID userId;

  public static final String JSON_PROPERTY_ROOMS = "rooms";
  @javax.annotation.Nullable  private JsonNullable<List<FileEntryBaseDto>> rooms = JsonNullable.<List<FileEntryBaseDto>>undefined();

  public static final String JSON_PROPERTY_TOTAL_ROOMS = "totalRooms";
  @javax.annotation.Nullable  private Integer totalRooms;

  public RoomGroupDto() {
  }


  public RoomGroupDto id(@javax.annotation.Nullable Integer id) {
    
    this.id = id;
    return this;
  }

  /**
   * The group ID.
   * @return id
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable Integer id) {
    this.id = id;
  }

  public RoomGroupDto name(@javax.annotation.Nullable String name) {
    this.name = JsonNullable.<String>of(name);
    
    return this;
  }

  /**
   * Group name
   * @return name
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = JsonNullable.<String>of(name);
  }

  public RoomGroupDto icon(@javax.annotation.Nullable MultiSizeLogoCover icon) {
    
    this.icon = icon;
    return this;
  }

  /**
   * Get icon
   * @return icon
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ICON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MultiSizeLogoCover getIcon() {
    return icon;
  }


  @JsonProperty(value = JSON_PROPERTY_ICON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIcon(@javax.annotation.Nullable MultiSizeLogoCover icon) {
    this.icon = icon;
  }

  public RoomGroupDto userId(@javax.annotation.Nullable UUID userId) {
    
    this.userId = userId;
    return this;
  }

  /**
   * The user ID.
   * @return userId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_USER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getUserId() {
    return userId;
  }


  @JsonProperty(value = JSON_PROPERTY_USER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(@javax.annotation.Nullable UUID userId) {
    this.userId = userId;
  }

  public RoomGroupDto rooms(@javax.annotation.Nullable List<FileEntryBaseDto> rooms) {
    this.rooms = JsonNullable.<List<FileEntryBaseDto>>of(rooms);
    
    return this;
  }

  public RoomGroupDto addRoomsItem(FileEntryBaseDto roomsItem) {
    if (this.rooms == null || !this.rooms.isPresent()) {
      this.rooms = JsonNullable.<List<FileEntryBaseDto>>of(new ArrayList<>());
    }
    try {
      this.rooms.get().add(roomsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of rooms in the group.
   * @return rooms
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<FileEntryBaseDto> getRooms() {
        return rooms.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ROOMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<FileEntryBaseDto>> getRooms_JsonNullable() {
    return rooms;
  }
  
  @JsonProperty(JSON_PROPERTY_ROOMS)
  public void setRooms_JsonNullable(JsonNullable<List<FileEntryBaseDto>> rooms) {
    this.rooms = rooms;
  }

  public void setRooms(@javax.annotation.Nullable List<FileEntryBaseDto> rooms) {
    this.rooms = JsonNullable.<List<FileEntryBaseDto>>of(rooms);
  }

  public RoomGroupDto totalRooms(@javax.annotation.Nullable Integer totalRooms) {
    
    this.totalRooms = totalRooms;
    return this;
  }

  /**
   * Total number of rooms in the group.
   * @return totalRooms
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TOTAL_ROOMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalRooms() {
    return totalRooms;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL_ROOMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalRooms(@javax.annotation.Nullable Integer totalRooms) {
    this.totalRooms = totalRooms;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomGroupDto roomGroupDto = (RoomGroupDto) o;
    return Objects.equals(this.id, roomGroupDto.id) &&
        equalsNullable(this.name, roomGroupDto.name) &&
        Objects.equals(this.icon, roomGroupDto.icon) &&
        Objects.equals(this.userId, roomGroupDto.userId) &&
        equalsNullable(this.rooms, roomGroupDto.rooms) &&
        Objects.equals(this.totalRooms, roomGroupDto.totalRooms);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(name), icon, userId, hashCodeNullable(rooms), totalRooms);
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
    sb.append("class RoomGroupDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    rooms: ").append(toIndentedString(rooms)).append("\n");
    sb.append("    totalRooms: ").append(toIndentedString(totalRooms)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `icon` to the URL query string
    if (getIcon() != null) {
      joiner.add(getIcon().toUrlQueryString(prefix + "icon" + suffix));
    }

    // add `userId` to the URL query string
    if (getUserId() != null) {
      try {
        joiner.add(String.format("%suserId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUserId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `rooms` to the URL query string
    if (getRooms() != null) {
      for (int i = 0; i < getRooms().size(); i++) {
        if (getRooms().get(i) != null) {
          joiner.add(getRooms().get(i).toUrlQueryString(String.format("%srooms%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `totalRooms` to the URL query string
    if (getTotalRooms() != null) {
      try {
        joiner.add(String.format("%stotalRooms%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTotalRooms()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

