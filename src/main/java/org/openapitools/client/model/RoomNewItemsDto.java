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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.FileEntryBaseDto;
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
 * The room new items information.
 */
@JsonPropertyOrder({
  RoomNewItemsDto.JSON_PROPERTY_ROOM,
  RoomNewItemsDto.JSON_PROPERTY_ITEMS
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class RoomNewItemsDto {
  public static final String JSON_PROPERTY_ROOM = "room";
  @javax.annotation.Nullable
  private FileEntryBaseDto room;

  public static final String JSON_PROPERTY_ITEMS = "items";
  @javax.annotation.Nullable
  private JsonNullable<List<FileEntryBaseDto>> items = JsonNullable.<List<FileEntryBaseDto>>undefined();

  public RoomNewItemsDto() {
  }

  public RoomNewItemsDto room(@javax.annotation.Nullable FileEntryBaseDto room) {
    
    this.room = room;
    return this;
  }

  /**
   * Get room
   * @return room
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROOM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FileEntryBaseDto getRoom() {
    return room;
  }


  @JsonProperty(JSON_PROPERTY_ROOM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoom(@javax.annotation.Nullable FileEntryBaseDto room) {
    this.room = room;
  }

  public RoomNewItemsDto items(@javax.annotation.Nullable List<FileEntryBaseDto> items) {
    this.items = JsonNullable.<List<FileEntryBaseDto>>of(items);
    
    return this;
  }

  public RoomNewItemsDto addItemsItem(FileEntryBaseDto itemsItem) {
    if (this.items == null || !this.items.isPresent()) {
      this.items = JsonNullable.<List<FileEntryBaseDto>>of(new ArrayList<>());
    }
    try {
      this.items.get().add(itemsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of file entry items.
   * @return items
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<FileEntryBaseDto> getItems() {
        return items.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<FileEntryBaseDto>> getItems_JsonNullable() {
    return items;
  }
  
  @JsonProperty(JSON_PROPERTY_ITEMS)
  public void setItems_JsonNullable(JsonNullable<List<FileEntryBaseDto>> items) {
    this.items = items;
  }

  public void setItems(@javax.annotation.Nullable List<FileEntryBaseDto> items) {
    this.items = JsonNullable.<List<FileEntryBaseDto>>of(items);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomNewItemsDto roomNewItemsDto = (RoomNewItemsDto) o;
    return Objects.equals(this.room, roomNewItemsDto.room) &&
        equalsNullable(this.items, roomNewItemsDto.items);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(room, hashCodeNullable(items));
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
    sb.append("class RoomNewItemsDto {\n");
    sb.append("    room: ").append(toIndentedString(room)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

    // add `room` to the URL query string
    if (getRoom() != null) {
      joiner.add(getRoom().toUrlQueryString(prefix + "room" + suffix));
    }

    // add `items` to the URL query string
    if (getItems() != null) {
      for (int i = 0; i < getItems().size(); i++) {
        if (getItems().get(i) != null) {
          joiner.add(getItems().get(i).toUrlQueryString(String.format("%sitems%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

