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
import org.openapitools.client.model.DuplicateRequestDtoAllOfFileIds;
import org.openapitools.client.model.SearchArea;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The name, the icon and the rooms of a room group to create.
 */
@JsonPropertyOrder({
  RoomGroupRequestDto.JSON_PROPERTY_NAME,
  RoomGroupRequestDto.JSON_PROPERTY_ICON,
  RoomGroupRequestDto.JSON_PROPERTY_ROOMS,
  RoomGroupRequestDto.JSON_PROPERTY_SEARCH_AREA
})

public class RoomGroupRequestDto {
  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull  private String name;

  public static final String JSON_PROPERTY_ICON = "icon";
  @javax.annotation.Nonnull  private String icon;

  public static final String JSON_PROPERTY_ROOMS = "rooms";
  @javax.annotation.Nonnull  private List<DuplicateRequestDtoAllOfFileIds> rooms = new ArrayList<>();

  public static final String JSON_PROPERTY_SEARCH_AREA = "searchArea";
  @javax.annotation.Nullable  private SearchArea searchArea;

  public RoomGroupRequestDto() {
  }


  public RoomGroupRequestDto name(@javax.annotation.Nonnull String name) {
    
    this.name = name;
    return this;
  }

  /**
   * The name to show the group under. Surrounding spaces are trimmed before it is stored, a name that is blank  once trimmed is refused, and the name does not have to differ from the names of the caller's other groups.
   * @return name
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(value = JSON_PROPERTY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }

  public RoomGroupRequestDto icon(@javax.annotation.Nonnull String icon) {
    
    this.icon = icon;
    return this;
  }

  /**
   * The icon of the group, given as the identifier of one of the built-in covers listed by  `GET api/2.0/files/rooms/covers`. An uploaded image cannot be used, and any value that is not one of those  identifiers is refused.
   * @return icon
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_ICON, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIcon() {
    return icon;
  }


  @JsonProperty(value = JSON_PROPERTY_ICON, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIcon(@javax.annotation.Nonnull String icon) {
    this.icon = icon;
  }

  public RoomGroupRequestDto rooms(@javax.annotation.Nonnull List<DuplicateRequestDtoAllOfFileIds> rooms) {
    
    this.rooms = rooms;
    return this;
  }

  public RoomGroupRequestDto addRoomsItem(DuplicateRequestDtoAllOfFileIds roomsItem) {
    if (this.rooms == null) {
      this.rooms = new ArrayList<>();
    }
    this.rooms.add(roomsItem);
    return this;
  }

  /**
   * The rooms to gather in the group, each given as a number for a room stored in the portal or as a string for a  room on a connected third-party account. Every identifier has to name a room the caller can read; repeats are  collapsed, and an element of any other shape - a decimal number, a number sent as a string, null - is refused.
   * @return rooms
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_ROOMS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<DuplicateRequestDtoAllOfFileIds> getRooms() {
    return rooms;
  }


  @JsonProperty(value = JSON_PROPERTY_ROOMS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRooms(@javax.annotation.Nonnull List<DuplicateRequestDtoAllOfFileIds> rooms) {
    this.rooms = rooms;
  }

  public RoomGroupRequestDto searchArea(@javax.annotation.Nullable SearchArea searchArea) {
    
    this.searchArea = searchArea;
    return this;
  }

  /**
   * The section the group belongs to: Active for Rooms and Forms for Forms. Active when omitted.
   * @return searchArea
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SEARCH_AREA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SearchArea getSearchArea() {
    return searchArea;
  }


  @JsonProperty(value = JSON_PROPERTY_SEARCH_AREA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSearchArea(@javax.annotation.Nullable SearchArea searchArea) {
    this.searchArea = searchArea;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomGroupRequestDto roomGroupRequestDto = (RoomGroupRequestDto) o;
    return Objects.equals(this.name, roomGroupRequestDto.name) &&
        Objects.equals(this.icon, roomGroupRequestDto.icon) &&
        Objects.equals(this.rooms, roomGroupRequestDto.rooms) &&
        Objects.equals(this.searchArea, roomGroupRequestDto.searchArea);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, icon, rooms, searchArea);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomGroupRequestDto {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    rooms: ").append(toIndentedString(rooms)).append("\n");
    sb.append("    searchArea: ").append(toIndentedString(searchArea)).append("\n");
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
      try {
        joiner.add(String.format("%sicon%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIcon()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `searchArea` to the URL query string
    if (getSearchArea() != null) {
      try {
        joiner.add(String.format("%ssearchArea%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSearchArea()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

