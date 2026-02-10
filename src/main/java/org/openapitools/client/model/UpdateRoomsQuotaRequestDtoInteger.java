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
 * The request parameters for updating the room quota.
 */
@JsonPropertyOrder({
  UpdateRoomsQuotaRequestDtoInteger.JSON_PROPERTY_ROOM_IDS,
  UpdateRoomsQuotaRequestDtoInteger.JSON_PROPERTY_QUOTA
})

public class UpdateRoomsQuotaRequestDtoInteger {
  public static final String JSON_PROPERTY_ROOM_IDS = "roomIds";
  @javax.annotation.Nullable
  private JsonNullable<List<DuplicateRequestDtoAllOfFileIds>> roomIds = JsonNullable.<List<DuplicateRequestDtoAllOfFileIds>>undefined();

  public static final String JSON_PROPERTY_QUOTA = "quota";
  @javax.annotation.Nullable
  private Long quota;

  public UpdateRoomsQuotaRequestDtoInteger() {
  }


  public UpdateRoomsQuotaRequestDtoInteger roomIds(@javax.annotation.Nullable List<DuplicateRequestDtoAllOfFileIds> roomIds) {
    this.roomIds = JsonNullable.<List<DuplicateRequestDtoAllOfFileIds>>of(roomIds);
    
    return this;
  }

  public UpdateRoomsQuotaRequestDtoInteger addRoomIdsItem(DuplicateRequestDtoAllOfFileIds roomIdsItem) {
    if (this.roomIds == null || !this.roomIds.isPresent()) {
      this.roomIds = JsonNullable.<List<DuplicateRequestDtoAllOfFileIds>>of(new ArrayList<>());
    }
    try {
      this.roomIds.get().add(roomIdsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of room IDs.
   * @return roomIds
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<DuplicateRequestDtoAllOfFileIds> getRoomIds() {
        return roomIds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ROOM_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<DuplicateRequestDtoAllOfFileIds>> getRoomIds_JsonNullable() {
    return roomIds;
  }
  
  @JsonProperty(JSON_PROPERTY_ROOM_IDS)
  public void setRoomIds_JsonNullable(JsonNullable<List<DuplicateRequestDtoAllOfFileIds>> roomIds) {
    this.roomIds = roomIds;
  }

  public void setRoomIds(@javax.annotation.Nullable List<DuplicateRequestDtoAllOfFileIds> roomIds) {
    this.roomIds = JsonNullable.<List<DuplicateRequestDtoAllOfFileIds>>of(roomIds);
  }

  public UpdateRoomsQuotaRequestDtoInteger quota(@javax.annotation.Nullable Long quota) {
    
    this.quota = quota;
    return this;
  }

  /**
   * The room quota.
   * @return quota
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUOTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getQuota() {
    return quota;
  }


  @JsonProperty(JSON_PROPERTY_QUOTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuota(@javax.annotation.Nullable Long quota) {
    this.quota = quota;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateRoomsQuotaRequestDtoInteger updateRoomsQuotaRequestDtoInteger = (UpdateRoomsQuotaRequestDtoInteger) o;
    return equalsNullable(this.roomIds, updateRoomsQuotaRequestDtoInteger.roomIds) &&
        Objects.equals(this.quota, updateRoomsQuotaRequestDtoInteger.quota);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(roomIds), quota);
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
    sb.append("class UpdateRoomsQuotaRequestDtoInteger {\n");
    sb.append("    roomIds: ").append(toIndentedString(roomIds)).append("\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
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

    // add `roomIds` to the URL query string
    if (getRoomIds() != null) {
      for (int i = 0; i < getRoomIds().size(); i++) {
        if (getRoomIds().get(i) != null) {
          joiner.add(getRoomIds().get(i).toUrlQueryString(String.format("%sroomIds%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `quota` to the URL query string
    if (getQuota() != null) {
      try {
        joiner.add(String.format("%squota%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getQuota()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

