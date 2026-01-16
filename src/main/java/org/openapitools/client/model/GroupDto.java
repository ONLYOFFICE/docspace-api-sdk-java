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
import org.openapitools.client.model.EmployeeFullDto;
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
 * The group parameters.
 */
@JsonPropertyOrder({
  GroupDto.JSON_PROPERTY_NAME,
  GroupDto.JSON_PROPERTY_PARENT,
  GroupDto.JSON_PROPERTY_CATEGORY,
  GroupDto.JSON_PROPERTY_ID,
  GroupDto.JSON_PROPERTY_IS_L_D_A_P,
  GroupDto.JSON_PROPERTY_IS_SYSTEM,
  GroupDto.JSON_PROPERTY_MANAGER,
  GroupDto.JSON_PROPERTY_MEMBERS,
  GroupDto.JSON_PROPERTY_SHARED,
  GroupDto.JSON_PROPERTY_MEMBERS_COUNT
})

public class GroupDto {
  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_PARENT = "parent";
  @javax.annotation.Nullable
  private JsonNullable<UUID> parent = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_CATEGORY = "category";
  @javax.annotation.Nonnull
  private UUID category;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nonnull
  private UUID id;

  public static final String JSON_PROPERTY_IS_L_D_A_P = "isLDAP";
  @javax.annotation.Nonnull
  private Boolean isLDAP;

  public static final String JSON_PROPERTY_IS_SYSTEM = "isSystem";
  @javax.annotation.Nullable
  private JsonNullable<Boolean> isSystem = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_MANAGER = "manager";
  @javax.annotation.Nullable
  private EmployeeFullDto manager;

  public static final String JSON_PROPERTY_MEMBERS = "members";
  @javax.annotation.Nullable
  private JsonNullable<List<EmployeeFullDto>> members = JsonNullable.<List<EmployeeFullDto>>undefined();

  public static final String JSON_PROPERTY_SHARED = "shared";
  @javax.annotation.Nullable
  private JsonNullable<Boolean> shared = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_MEMBERS_COUNT = "membersCount";
  @javax.annotation.Nullable
  private Integer membersCount;

  public GroupDto() {
  }


  public GroupDto name(@javax.annotation.Nullable String name) {
    
    this.name = name;
    return this;
  }

  /**
   * The group name.
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }

  public GroupDto parent(@javax.annotation.Nullable UUID parent) {
    this.parent = JsonNullable.<UUID>of(parent);
    
    return this;
  }

  /**
   * The parent group ID.
   * @return parent
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public UUID getParent() {
        return parent.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PARENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UUID> getParent_JsonNullable() {
    return parent;
  }
  
  @JsonProperty(JSON_PROPERTY_PARENT)
  public void setParent_JsonNullable(JsonNullable<UUID> parent) {
    this.parent = parent;
  }

  public void setParent(@javax.annotation.Nullable UUID parent) {
    this.parent = JsonNullable.<UUID>of(parent);
  }

  public GroupDto category(@javax.annotation.Nonnull UUID category) {
    
    this.category = category;
    return this;
  }

  /**
   * The group category ID.
   * @return category
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getCategory() {
    return category;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCategory(@javax.annotation.Nonnull UUID category) {
    this.category = category;
  }

  public GroupDto id(@javax.annotation.Nonnull UUID id) {
    
    this.id = id;
    return this;
  }

  /**
   * The group ID.
   * @return id
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(@javax.annotation.Nonnull UUID id) {
    this.id = id;
  }

  public GroupDto isLDAP(@javax.annotation.Nonnull Boolean isLDAP) {
    
    this.isLDAP = isLDAP;
    return this;
  }

  /**
   * Specifies if the LDAP settings are enabled for the group or not.
   * @return isLDAP
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_L_D_A_P)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsLDAP() {
    return isLDAP;
  }


  @JsonProperty(JSON_PROPERTY_IS_L_D_A_P)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsLDAP(@javax.annotation.Nonnull Boolean isLDAP) {
    this.isLDAP = isLDAP;
  }

  public GroupDto isSystem(@javax.annotation.Nullable Boolean isSystem) {
    this.isSystem = JsonNullable.<Boolean>of(isSystem);
    
    return this;
  }

  /**
   * Indicates whether the group is a system group.
   * @return isSystem
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getIsSystem() {
        return isSystem.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IS_SYSTEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getIsSystem_JsonNullable() {
    return isSystem;
  }
  
  @JsonProperty(JSON_PROPERTY_IS_SYSTEM)
  public void setIsSystem_JsonNullable(JsonNullable<Boolean> isSystem) {
    this.isSystem = isSystem;
  }

  public void setIsSystem(@javax.annotation.Nullable Boolean isSystem) {
    this.isSystem = JsonNullable.<Boolean>of(isSystem);
  }

  public GroupDto manager(@javax.annotation.Nullable EmployeeFullDto manager) {
    
    this.manager = manager;
    return this;
  }

  /**
   * Get manager
   * @return manager
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MANAGER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EmployeeFullDto getManager() {
    return manager;
  }


  @JsonProperty(JSON_PROPERTY_MANAGER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManager(@javax.annotation.Nullable EmployeeFullDto manager) {
    this.manager = manager;
  }

  public GroupDto members(@javax.annotation.Nullable List<EmployeeFullDto> members) {
    this.members = JsonNullable.<List<EmployeeFullDto>>of(members);
    
    return this;
  }

  public GroupDto addMembersItem(EmployeeFullDto membersItem) {
    if (this.members == null || !this.members.isPresent()) {
      this.members = JsonNullable.<List<EmployeeFullDto>>of(new ArrayList<>());
    }
    try {
      this.members.get().add(membersItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of group members.
   * @return members
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<EmployeeFullDto> getMembers() {
        return members.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MEMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<EmployeeFullDto>> getMembers_JsonNullable() {
    return members;
  }
  
  @JsonProperty(JSON_PROPERTY_MEMBERS)
  public void setMembers_JsonNullable(JsonNullable<List<EmployeeFullDto>> members) {
    this.members = members;
  }

  public void setMembers(@javax.annotation.Nullable List<EmployeeFullDto> members) {
    this.members = JsonNullable.<List<EmployeeFullDto>>of(members);
  }

  public GroupDto shared(@javax.annotation.Nullable Boolean shared) {
    this.shared = JsonNullable.<Boolean>of(shared);
    
    return this;
  }

  /**
   * Specifies whether the group can be shared or not.
   * @return shared
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getShared() {
        return shared.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SHARED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getShared_JsonNullable() {
    return shared;
  }
  
  @JsonProperty(JSON_PROPERTY_SHARED)
  public void setShared_JsonNullable(JsonNullable<Boolean> shared) {
    this.shared = shared;
  }

  public void setShared(@javax.annotation.Nullable Boolean shared) {
    this.shared = JsonNullable.<Boolean>of(shared);
  }

  public GroupDto membersCount(@javax.annotation.Nullable Integer membersCount) {
    
    this.membersCount = membersCount;
    return this;
  }

  /**
   * The number of group members.
   * @return membersCount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEMBERS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMembersCount() {
    return membersCount;
  }


  @JsonProperty(JSON_PROPERTY_MEMBERS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMembersCount(@javax.annotation.Nullable Integer membersCount) {
    this.membersCount = membersCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupDto groupDto = (GroupDto) o;
    return Objects.equals(this.name, groupDto.name) &&
        equalsNullable(this.parent, groupDto.parent) &&
        Objects.equals(this.category, groupDto.category) &&
        Objects.equals(this.id, groupDto.id) &&
        Objects.equals(this.isLDAP, groupDto.isLDAP) &&
        equalsNullable(this.isSystem, groupDto.isSystem) &&
        Objects.equals(this.manager, groupDto.manager) &&
        equalsNullable(this.members, groupDto.members) &&
        equalsNullable(this.shared, groupDto.shared) &&
        Objects.equals(this.membersCount, groupDto.membersCount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, hashCodeNullable(parent), category, id, isLDAP, hashCodeNullable(isSystem), manager, hashCodeNullable(members), hashCodeNullable(shared), membersCount);
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
    sb.append("class GroupDto {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isLDAP: ").append(toIndentedString(isLDAP)).append("\n");
    sb.append("    isSystem: ").append(toIndentedString(isSystem)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    sb.append("    membersCount: ").append(toIndentedString(membersCount)).append("\n");
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

    // add `parent` to the URL query string
    if (getParent() != null) {
      try {
        joiner.add(String.format("%sparent%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getParent()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `category` to the URL query string
    if (getCategory() != null) {
      try {
        joiner.add(String.format("%scategory%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCategory()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isLDAP` to the URL query string
    if (getIsLDAP() != null) {
      try {
        joiner.add(String.format("%sisLDAP%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsLDAP()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isSystem` to the URL query string
    if (getIsSystem() != null) {
      try {
        joiner.add(String.format("%sisSystem%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsSystem()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `manager` to the URL query string
    if (getManager() != null) {
      joiner.add(getManager().toUrlQueryString(prefix + "manager" + suffix));
    }

    // add `members` to the URL query string
    if (getMembers() != null) {
      for (int i = 0; i < getMembers().size(); i++) {
        if (getMembers().get(i) != null) {
          joiner.add(getMembers().get(i).toUrlQueryString(String.format("%smembers%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `shared` to the URL query string
    if (getShared() != null) {
      try {
        joiner.add(String.format("%sshared%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getShared()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `membersCount` to the URL query string
    if (getMembersCount() != null) {
      try {
        joiner.add(String.format("%smembersCount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMembersCount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

