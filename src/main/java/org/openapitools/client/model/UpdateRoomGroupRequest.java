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
 * UpdateRoomGroupRequest
 */
@JsonPropertyOrder({
  UpdateRoomGroupRequest.JSON_PROPERTY_ROOMS_TO_ADD,
  UpdateRoomGroupRequest.JSON_PROPERTY_ROOMS_TO_REMOVE,
  UpdateRoomGroupRequest.JSON_PROPERTY_GROUP_NAME
})

public class UpdateRoomGroupRequest {
  public static final String JSON_PROPERTY_ROOMS_TO_ADD = "roomsToAdd";
  @javax.annotation.Nullable  private JsonNullable<List<DuplicateRequestDtoAllOfFileIds>> roomsToAdd = JsonNullable.<List<DuplicateRequestDtoAllOfFileIds>>undefined();

  public static final String JSON_PROPERTY_ROOMS_TO_REMOVE = "roomsToRemove";
  @javax.annotation.Nullable  private JsonNullable<List<DuplicateRequestDtoAllOfFileIds>> roomsToRemove = JsonNullable.<List<DuplicateRequestDtoAllOfFileIds>>undefined();

  public static final String JSON_PROPERTY_GROUP_NAME = "groupName";
  @javax.annotation.Nullable  private JsonNullable<String> groupName = JsonNullable.<String>undefined();

  public UpdateRoomGroupRequest() {
  }


  public UpdateRoomGroupRequest roomsToAdd(@javax.annotation.Nullable List<DuplicateRequestDtoAllOfFileIds> roomsToAdd) {
    this.roomsToAdd = JsonNullable.<List<DuplicateRequestDtoAllOfFileIds>>of(roomsToAdd);
    
    return this;
  }

  public UpdateRoomGroupRequest addRoomsToAddItem(DuplicateRequestDtoAllOfFileIds roomsToAddItem) {
    if (this.roomsToAdd == null || !this.roomsToAdd.isPresent()) {
      this.roomsToAdd = JsonNullable.<List<DuplicateRequestDtoAllOfFileIds>>of(new ArrayList<>());
    }
    try {
      this.roomsToAdd.get().add(roomsToAddItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of room IDs to add to the group.
   * @return roomsToAdd
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<DuplicateRequestDtoAllOfFileIds> getRoomsToAdd() {
        return roomsToAdd.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ROOMS_TO_ADD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<DuplicateRequestDtoAllOfFileIds>> getRoomsToAdd_JsonNullable() {
    return roomsToAdd;
  }
  
  @JsonProperty(JSON_PROPERTY_ROOMS_TO_ADD)
  public void setRoomsToAdd_JsonNullable(JsonNullable<List<DuplicateRequestDtoAllOfFileIds>> roomsToAdd) {
    this.roomsToAdd = roomsToAdd;
  }

  public void setRoomsToAdd(@javax.annotation.Nullable List<DuplicateRequestDtoAllOfFileIds> roomsToAdd) {
    this.roomsToAdd = JsonNullable.<List<DuplicateRequestDtoAllOfFileIds>>of(roomsToAdd);
  }

  public UpdateRoomGroupRequest roomsToRemove(@javax.annotation.Nullable List<DuplicateRequestDtoAllOfFileIds> roomsToRemove) {
    this.roomsToRemove = JsonNullable.<List<DuplicateRequestDtoAllOfFileIds>>of(roomsToRemove);
    
    return this;
  }

  public UpdateRoomGroupRequest addRoomsToRemoveItem(DuplicateRequestDtoAllOfFileIds roomsToRemoveItem) {
    if (this.roomsToRemove == null || !this.roomsToRemove.isPresent()) {
      this.roomsToRemove = JsonNullable.<List<DuplicateRequestDtoAllOfFileIds>>of(new ArrayList<>());
    }
    try {
      this.roomsToRemove.get().add(roomsToRemoveItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of room IDs to remove from the group.
   * @return roomsToRemove
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<DuplicateRequestDtoAllOfFileIds> getRoomsToRemove() {
        return roomsToRemove.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ROOMS_TO_REMOVE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<DuplicateRequestDtoAllOfFileIds>> getRoomsToRemove_JsonNullable() {
    return roomsToRemove;
  }
  
  @JsonProperty(JSON_PROPERTY_ROOMS_TO_REMOVE)
  public void setRoomsToRemove_JsonNullable(JsonNullable<List<DuplicateRequestDtoAllOfFileIds>> roomsToRemove) {
    this.roomsToRemove = roomsToRemove;
  }

  public void setRoomsToRemove(@javax.annotation.Nullable List<DuplicateRequestDtoAllOfFileIds> roomsToRemove) {
    this.roomsToRemove = JsonNullable.<List<DuplicateRequestDtoAllOfFileIds>>of(roomsToRemove);
  }

  public UpdateRoomGroupRequest groupName(@javax.annotation.Nullable String groupName) {
    this.groupName = JsonNullable.<String>of(groupName);
    
    return this;
  }

  /**
   * The group name.
   * @return groupName
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getGroupName() {
        return groupName.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_GROUP_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getGroupName_JsonNullable() {
    return groupName;
  }
  
  @JsonProperty(JSON_PROPERTY_GROUP_NAME)
  public void setGroupName_JsonNullable(JsonNullable<String> groupName) {
    this.groupName = groupName;
  }

  public void setGroupName(@javax.annotation.Nullable String groupName) {
    this.groupName = JsonNullable.<String>of(groupName);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateRoomGroupRequest updateRoomGroupRequest = (UpdateRoomGroupRequest) o;
    return equalsNullable(this.roomsToAdd, updateRoomGroupRequest.roomsToAdd) &&
        equalsNullable(this.roomsToRemove, updateRoomGroupRequest.roomsToRemove) &&
        equalsNullable(this.groupName, updateRoomGroupRequest.groupName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(roomsToAdd), hashCodeNullable(roomsToRemove), hashCodeNullable(groupName));
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
    sb.append("class UpdateRoomGroupRequest {\n");
    sb.append("    roomsToAdd: ").append(toIndentedString(roomsToAdd)).append("\n");
    sb.append("    roomsToRemove: ").append(toIndentedString(roomsToRemove)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
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

    // add `roomsToAdd` to the URL query string
    if (getRoomsToAdd() != null) {
      for (int i = 0; i < getRoomsToAdd().size(); i++) {
        if (getRoomsToAdd().get(i) != null) {
          joiner.add(getRoomsToAdd().get(i).toUrlQueryString(String.format("%sroomsToAdd%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `roomsToRemove` to the URL query string
    if (getRoomsToRemove() != null) {
      for (int i = 0; i < getRoomsToRemove().size(); i++) {
        if (getRoomsToRemove().get(i) != null) {
          joiner.add(getRoomsToRemove().get(i).toUrlQueryString(String.format("%sroomsToRemove%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `groupName` to the URL query string
    if (getGroupName() != null) {
      try {
        joiner.add(String.format("%sgroupName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getGroupName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

