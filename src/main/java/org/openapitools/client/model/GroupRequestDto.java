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
 * The group request parameters.
 */
@JsonPropertyOrder({
  GroupRequestDto.JSON_PROPERTY_MEMBERS,
  GroupRequestDto.JSON_PROPERTY_GROUP_MANAGER,
  GroupRequestDto.JSON_PROPERTY_GROUP_NAME
})

public class GroupRequestDto {
  public static final String JSON_PROPERTY_MEMBERS = "members";
  @javax.annotation.Nullable  private JsonNullable<List<UUID>> members = JsonNullable.<List<UUID>>undefined();

  public static final String JSON_PROPERTY_GROUP_MANAGER = "groupManager";
  @javax.annotation.Nullable  private UUID groupManager;

  public static final String JSON_PROPERTY_GROUP_NAME = "groupName";
  @javax.annotation.Nullable  private String groupName;

  public GroupRequestDto() {
  }


  public GroupRequestDto members(@javax.annotation.Nullable List<UUID> members) {
    this.members = JsonNullable.<List<UUID>>of(members);
    
    return this;
  }

  public GroupRequestDto addMembersItem(UUID membersItem) {
    if (this.members == null || !this.members.isPresent()) {
      this.members = JsonNullable.<List<UUID>>of(new ArrayList<>());
    }
    try {
      this.members.get().add(membersItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of group member IDs.
   * @return members
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<UUID> getMembers() {
        return members.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_MEMBERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<UUID>> getMembers_JsonNullable() {
    return members;
  }
  
  @JsonProperty(JSON_PROPERTY_MEMBERS)
  public void setMembers_JsonNullable(JsonNullable<List<UUID>> members) {
    this.members = members;
  }

  public void setMembers(@javax.annotation.Nullable List<UUID> members) {
    this.members = JsonNullable.<List<UUID>>of(members);
  }

  public GroupRequestDto groupManager(@javax.annotation.Nullable UUID groupManager) {
    
    this.groupManager = groupManager;
    return this;
  }

  /**
   * The group manager ID.
   * @return groupManager
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_GROUP_MANAGER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getGroupManager() {
    return groupManager;
  }


  @JsonProperty(value = JSON_PROPERTY_GROUP_MANAGER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupManager(@javax.annotation.Nullable UUID groupManager) {
    this.groupManager = groupManager;
  }

  public GroupRequestDto groupName(@javax.annotation.Nullable String groupName) {
    
    this.groupName = groupName;
    return this;
  }

  /**
   * The group name.
   * @return groupName
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_GROUP_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getGroupName() {
    return groupName;
  }


  @JsonProperty(value = JSON_PROPERTY_GROUP_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGroupName(@javax.annotation.Nullable String groupName) {
    this.groupName = groupName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupRequestDto groupRequestDto = (GroupRequestDto) o;
    return equalsNullable(this.members, groupRequestDto.members) &&
        Objects.equals(this.groupManager, groupRequestDto.groupManager) &&
        Objects.equals(this.groupName, groupRequestDto.groupName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(members), groupManager, groupName);
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
    sb.append("class GroupRequestDto {\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    groupManager: ").append(toIndentedString(groupManager)).append("\n");
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

    // add `members` to the URL query string
    if (getMembers() != null) {
      for (int i = 0; i < getMembers().size(); i++) {
        if (getMembers().get(i) != null) {
          try {
            joiner.add(String.format("%smembers%s%s=%s", prefix, suffix,
                "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
                URLEncoder.encode(String.valueOf(getMembers().get(i)), "UTF-8").replaceAll("\\+", "%20")));
          } catch (UnsupportedEncodingException e) {
            // Should never happen, UTF-8 is always supported
            throw new RuntimeException(e);
          }
        }
      }
    }

    // add `groupManager` to the URL query string
    if (getGroupManager() != null) {
      try {
        joiner.add(String.format("%sgroupManager%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getGroupManager()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
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

