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
import org.openapitools.client.model.EmployeeDto;
import org.openapitools.client.model.GroupSummaryDto;
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
 * The security information.
 */
@JsonPropertyOrder({
  SecurityDto.JSON_PROPERTY_WEB_ITEM_ID,
  SecurityDto.JSON_PROPERTY_USERS,
  SecurityDto.JSON_PROPERTY_GROUPS,
  SecurityDto.JSON_PROPERTY_ENABLED,
  SecurityDto.JSON_PROPERTY_IS_SUB_ITEM
})

public class SecurityDto {
  public static final String JSON_PROPERTY_WEB_ITEM_ID = "webItemId";
  @javax.annotation.Nullable  private JsonNullable<String> webItemId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_USERS = "users";
  @javax.annotation.Nullable  private JsonNullable<List<EmployeeDto>> users = JsonNullable.<List<EmployeeDto>>undefined();

  public static final String JSON_PROPERTY_GROUPS = "groups";
  @javax.annotation.Nullable  private JsonNullable<List<GroupSummaryDto>> groups = JsonNullable.<List<GroupSummaryDto>>undefined();

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  @javax.annotation.Nullable  private Boolean enabled;

  public static final String JSON_PROPERTY_IS_SUB_ITEM = "isSubItem";
  @javax.annotation.Nullable  private Boolean isSubItem;

  public SecurityDto() {
  }


  public SecurityDto webItemId(@javax.annotation.Nullable String webItemId) {
    this.webItemId = JsonNullable.<String>of(webItemId);
    
    return this;
  }

  /**
   * The module ID.
   * @return webItemId
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getWebItemId() {
        return webItemId.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_WEB_ITEM_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getWebItemId_JsonNullable() {
    return webItemId;
  }
  
  @JsonProperty(JSON_PROPERTY_WEB_ITEM_ID)
  public void setWebItemId_JsonNullable(JsonNullable<String> webItemId) {
    this.webItemId = webItemId;
  }

  public void setWebItemId(@javax.annotation.Nullable String webItemId) {
    this.webItemId = JsonNullable.<String>of(webItemId);
  }

  public SecurityDto users(@javax.annotation.Nullable List<EmployeeDto> users) {
    this.users = JsonNullable.<List<EmployeeDto>>of(users);
    
    return this;
  }

  public SecurityDto addUsersItem(EmployeeDto usersItem) {
    if (this.users == null || !this.users.isPresent()) {
      this.users = JsonNullable.<List<EmployeeDto>>of(new ArrayList<>());
    }
    try {
      this.users.get().add(usersItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of users with the access to the module.
   * @return users
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<EmployeeDto> getUsers() {
        return users.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_USERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<EmployeeDto>> getUsers_JsonNullable() {
    return users;
  }
  
  @JsonProperty(JSON_PROPERTY_USERS)
  public void setUsers_JsonNullable(JsonNullable<List<EmployeeDto>> users) {
    this.users = users;
  }

  public void setUsers(@javax.annotation.Nullable List<EmployeeDto> users) {
    this.users = JsonNullable.<List<EmployeeDto>>of(users);
  }

  public SecurityDto groups(@javax.annotation.Nullable List<GroupSummaryDto> groups) {
    this.groups = JsonNullable.<List<GroupSummaryDto>>of(groups);
    
    return this;
  }

  public SecurityDto addGroupsItem(GroupSummaryDto groupsItem) {
    if (this.groups == null || !this.groups.isPresent()) {
      this.groups = JsonNullable.<List<GroupSummaryDto>>of(new ArrayList<>());
    }
    try {
      this.groups.get().add(groupsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of groups with the access to the module.
   * @return groups
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<GroupSummaryDto> getGroups() {
        return groups.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_GROUPS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<GroupSummaryDto>> getGroups_JsonNullable() {
    return groups;
  }
  
  @JsonProperty(JSON_PROPERTY_GROUPS)
  public void setGroups_JsonNullable(JsonNullable<List<GroupSummaryDto>> groups) {
    this.groups = groups;
  }

  public void setGroups(@javax.annotation.Nullable List<GroupSummaryDto> groups) {
    this.groups = JsonNullable.<List<GroupSummaryDto>>of(groups);
  }

  public SecurityDto enabled(@javax.annotation.Nullable Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

  /**
   * Specifies if the security settings are enabled or not.
   * @return enabled
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(value = JSON_PROPERTY_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabled(@javax.annotation.Nullable Boolean enabled) {
    this.enabled = enabled;
  }

  public SecurityDto isSubItem(@javax.annotation.Nullable Boolean isSubItem) {
    
    this.isSubItem = isSubItem;
    return this;
  }

  /**
   * Specifies if the module is a subitem or not.
   * @return isSubItem
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IS_SUB_ITEM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsSubItem() {
    return isSubItem;
  }


  @JsonProperty(value = JSON_PROPERTY_IS_SUB_ITEM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsSubItem(@javax.annotation.Nullable Boolean isSubItem) {
    this.isSubItem = isSubItem;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityDto securityDto = (SecurityDto) o;
    return equalsNullable(this.webItemId, securityDto.webItemId) &&
        equalsNullable(this.users, securityDto.users) &&
        equalsNullable(this.groups, securityDto.groups) &&
        Objects.equals(this.enabled, securityDto.enabled) &&
        Objects.equals(this.isSubItem, securityDto.isSubItem);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(webItemId), hashCodeNullable(users), hashCodeNullable(groups), enabled, isSubItem);
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
    sb.append("class SecurityDto {\n");
    sb.append("    webItemId: ").append(toIndentedString(webItemId)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    isSubItem: ").append(toIndentedString(isSubItem)).append("\n");
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

    // add `webItemId` to the URL query string
    if (getWebItemId() != null) {
      try {
        joiner.add(String.format("%swebItemId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWebItemId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `users` to the URL query string
    if (getUsers() != null) {
      for (int i = 0; i < getUsers().size(); i++) {
        if (getUsers().get(i) != null) {
          joiner.add(getUsers().get(i).toUrlQueryString(String.format("%susers%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `groups` to the URL query string
    if (getGroups() != null) {
      for (int i = 0; i < getGroups().size(); i++) {
        if (getGroups().get(i) != null) {
          joiner.add(getGroups().get(i).toUrlQueryString(String.format("%sgroups%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `enabled` to the URL query string
    if (getEnabled() != null) {
      try {
        joiner.add(String.format("%senabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnabled()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isSubItem` to the URL query string
    if (getIsSubItem() != null) {
      try {
        joiner.add(String.format("%sisSubItem%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsSubItem()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

