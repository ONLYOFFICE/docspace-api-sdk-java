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
 * The request for updating a group.
 */
@JsonPropertyOrder({
  UpdateGroupRequest.JSON_PROPERTY_MEMBERS_TO_ADD,
  UpdateGroupRequest.JSON_PROPERTY_MEMBERS_TO_REMOVE,
  UpdateGroupRequest.JSON_PROPERTY_GROUP_MANAGER,
  UpdateGroupRequest.JSON_PROPERTY_GROUP_NAME
})

public class UpdateGroupRequest {
  public static final String JSON_PROPERTY_MEMBERS_TO_ADD = "membersToAdd";
  @javax.annotation.Nullable
  private JsonNullable<List<UUID>> membersToAdd = JsonNullable.<List<UUID>>undefined();

  public static final String JSON_PROPERTY_MEMBERS_TO_REMOVE = "membersToRemove";
  @javax.annotation.Nullable
  private JsonNullable<List<UUID>> membersToRemove = JsonNullable.<List<UUID>>undefined();

  public static final String JSON_PROPERTY_GROUP_MANAGER = "groupManager";
  @javax.annotation.Nullable
  private UUID groupManager;

  public static final String JSON_PROPERTY_GROUP_NAME = "groupName";
  @javax.annotation.Nullable
  private JsonNullable<String> groupName = JsonNullable.<String>undefined();

  public UpdateGroupRequest() {
  }


  public UpdateGroupRequest membersToAdd(@javax.annotation.Nullable List<UUID> membersToAdd) {
    this.membersToAdd = JsonNullable.<List<UUID>>of(membersToAdd);
    
    return this;
  }

  public UpdateGroupRequest addMembersToAddItem(UUID membersToAddItem) {
    if (this.membersToAdd == null || !this.membersToAdd.isPresent()) {
      this.membersToAdd = JsonNullable.<List<UUID>>of(new ArrayList<>());
    }
    try {
      this.membersToAdd.get().add(membersToAddItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of user IDs to add to the group.
   * @return membersToAdd
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<UUID> getMembersToAdd() {
        return membersToAdd.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MEMBERS_TO_ADD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<UUID>> getMembersToAdd_JsonNullable() {
    return membersToAdd;
  }
  
  @JsonProperty(JSON_PROPERTY_MEMBERS_TO_ADD)
  public void setMembersToAdd_JsonNullable(JsonNullable<List<UUID>> membersToAdd) {
    this.membersToAdd = membersToAdd;
  }

  public void setMembersToAdd(@javax.annotation.Nullable List<UUID> membersToAdd) {
    this.membersToAdd = JsonNullable.<List<UUID>>of(membersToAdd);
  }

  public UpdateGroupRequest membersToRemove(@javax.annotation.Nullable List<UUID> membersToRemove) {
    this.membersToRemove = JsonNullable.<List<UUID>>of(membersToRemove);
    
    return this;
  }

  public UpdateGroupRequest addMembersToRemoveItem(UUID membersToRemoveItem) {
    if (this.membersToRemove == null || !this.membersToRemove.isPresent()) {
      this.membersToRemove = JsonNullable.<List<UUID>>of(new ArrayList<>());
    }
    try {
      this.membersToRemove.get().add(membersToRemoveItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of user IDs to remove from the group.
   * @return membersToRemove
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<UUID> getMembersToRemove() {
        return membersToRemove.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MEMBERS_TO_REMOVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<UUID>> getMembersToRemove_JsonNullable() {
    return membersToRemove;
  }
  
  @JsonProperty(JSON_PROPERTY_MEMBERS_TO_REMOVE)
  public void setMembersToRemove_JsonNullable(JsonNullable<List<UUID>> membersToRemove) {
    this.membersToRemove = membersToRemove;
  }

  public void setMembersToRemove(@javax.annotation.Nullable List<UUID> membersToRemove) {
    this.membersToRemove = JsonNullable.<List<UUID>>of(membersToRemove);
  }

  public UpdateGroupRequest groupManager(@javax.annotation.Nullable UUID groupManager) {
    
    this.groupManager = groupManager;
    return this;
  }

  /**
   * The group manager ID.
   * @return groupManager
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_MANAGER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getGroupManager() {
    return groupManager;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_MANAGER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupManager(@javax.annotation.Nullable UUID groupManager) {
    this.groupManager = groupManager;
  }

  public UpdateGroupRequest groupName(@javax.annotation.Nullable String groupName) {
    this.groupName = JsonNullable.<String>of(groupName);
    
    return this;
  }

  /**
   * The group name.
   * @return groupName
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getGroupName() {
        return groupName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GROUP_NAME)
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
    UpdateGroupRequest updateGroupRequest = (UpdateGroupRequest) o;
    return equalsNullable(this.membersToAdd, updateGroupRequest.membersToAdd) &&
        equalsNullable(this.membersToRemove, updateGroupRequest.membersToRemove) &&
        Objects.equals(this.groupManager, updateGroupRequest.groupManager) &&
        equalsNullable(this.groupName, updateGroupRequest.groupName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(membersToAdd), hashCodeNullable(membersToRemove), groupManager, hashCodeNullable(groupName));
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
    sb.append("class UpdateGroupRequest {\n");
    sb.append("    membersToAdd: ").append(toIndentedString(membersToAdd)).append("\n");
    sb.append("    membersToRemove: ").append(toIndentedString(membersToRemove)).append("\n");
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

    // add `membersToAdd` to the URL query string
    if (getMembersToAdd() != null) {
      for (int i = 0; i < getMembersToAdd().size(); i++) {
        if (getMembersToAdd().get(i) != null) {
          try {
            joiner.add(String.format("%smembersToAdd%s%s=%s", prefix, suffix,
                "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
                URLEncoder.encode(String.valueOf(getMembersToAdd().get(i)), "UTF-8").replaceAll("\\+", "%20")));
          } catch (UnsupportedEncodingException e) {
            // Should never happen, UTF-8 is always supported
            throw new RuntimeException(e);
          }
        }
      }
    }

    // add `membersToRemove` to the URL query string
    if (getMembersToRemove() != null) {
      for (int i = 0; i < getMembersToRemove().size(); i++) {
        if (getMembersToRemove().get(i) != null) {
          try {
            joiner.add(String.format("%smembersToRemove%s%s=%s", prefix, suffix,
                "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
                URLEncoder.encode(String.valueOf(getMembersToRemove().get(i)), "UTF-8").replaceAll("\\+", "%20")));
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

