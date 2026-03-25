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
import org.openapitools.client.model.EmployeeFullDto;
import org.openapitools.client.model.FileShare;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The group member security information.
 */
@JsonPropertyOrder({
  GroupMemberSecurityRequestDto.JSON_PROPERTY_USER,
  GroupMemberSecurityRequestDto.JSON_PROPERTY_GROUP_ACCESS,
  GroupMemberSecurityRequestDto.JSON_PROPERTY_USER_ACCESS,
  GroupMemberSecurityRequestDto.JSON_PROPERTY_OVERRIDDEN,
  GroupMemberSecurityRequestDto.JSON_PROPERTY_CAN_EDIT_ACCESS,
  GroupMemberSecurityRequestDto.JSON_PROPERTY_OWNER
})

public class GroupMemberSecurityRequestDto {
  public static final String JSON_PROPERTY_USER = "user";
  @javax.annotation.Nonnull  private EmployeeFullDto user;

  public static final String JSON_PROPERTY_GROUP_ACCESS = "groupAccess";
  @javax.annotation.Nonnull  private FileShare groupAccess;

  public static final String JSON_PROPERTY_USER_ACCESS = "userAccess";
  @javax.annotation.Nullable  private FileShare userAccess;

  public static final String JSON_PROPERTY_OVERRIDDEN = "overridden";
  @javax.annotation.Nonnull  private Boolean overridden;

  public static final String JSON_PROPERTY_CAN_EDIT_ACCESS = "canEditAccess";
  @javax.annotation.Nonnull  private Boolean canEditAccess;

  public static final String JSON_PROPERTY_OWNER = "owner";
  @javax.annotation.Nonnull  private Boolean owner;

  public GroupMemberSecurityRequestDto() {
  }


  public GroupMemberSecurityRequestDto user(@javax.annotation.Nonnull EmployeeFullDto user) {
    
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_USER, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public EmployeeFullDto getUser() {
    return user;
  }


  @JsonProperty(value = JSON_PROPERTY_USER, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUser(@javax.annotation.Nonnull EmployeeFullDto user) {
    this.user = user;
  }

  public GroupMemberSecurityRequestDto groupAccess(@javax.annotation.Nonnull FileShare groupAccess) {
    
    this.groupAccess = groupAccess;
    return this;
  }

  /**
   * Get groupAccess
   * @return groupAccess
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_GROUP_ACCESS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FileShare getGroupAccess() {
    return groupAccess;
  }


  @JsonProperty(value = JSON_PROPERTY_GROUP_ACCESS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGroupAccess(@javax.annotation.Nonnull FileShare groupAccess) {
    this.groupAccess = groupAccess;
  }

  public GroupMemberSecurityRequestDto userAccess(@javax.annotation.Nullable FileShare userAccess) {
    
    this.userAccess = userAccess;
    return this;
  }

  /**
   * Get userAccess
   * @return userAccess
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_USER_ACCESS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FileShare getUserAccess() {
    return userAccess;
  }


  @JsonProperty(value = JSON_PROPERTY_USER_ACCESS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserAccess(@javax.annotation.Nullable FileShare userAccess) {
    this.userAccess = userAccess;
  }

  public GroupMemberSecurityRequestDto overridden(@javax.annotation.Nonnull Boolean overridden) {
    
    this.overridden = overridden;
    return this;
  }

  /**
   * Specifies if the group access rights are overridden or not.
   * @return overridden
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_OVERRIDDEN, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getOverridden() {
    return overridden;
  }


  @JsonProperty(value = JSON_PROPERTY_OVERRIDDEN, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOverridden(@javax.annotation.Nonnull Boolean overridden) {
    this.overridden = overridden;
  }

  public GroupMemberSecurityRequestDto canEditAccess(@javax.annotation.Nonnull Boolean canEditAccess) {
    
    this.canEditAccess = canEditAccess;
    return this;
  }

  /**
   * Specifies if the group member can edit the group access rights or not.
   * @return canEditAccess
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_CAN_EDIT_ACCESS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getCanEditAccess() {
    return canEditAccess;
  }


  @JsonProperty(value = JSON_PROPERTY_CAN_EDIT_ACCESS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCanEditAccess(@javax.annotation.Nonnull Boolean canEditAccess) {
    this.canEditAccess = canEditAccess;
  }

  public GroupMemberSecurityRequestDto owner(@javax.annotation.Nonnull Boolean owner) {
    
    this.owner = owner;
    return this;
  }

  /**
   * Specifies if the group member is a group owner or not.
   * @return owner
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_OWNER, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getOwner() {
    return owner;
  }


  @JsonProperty(value = JSON_PROPERTY_OWNER, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOwner(@javax.annotation.Nonnull Boolean owner) {
    this.owner = owner;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupMemberSecurityRequestDto groupMemberSecurityRequestDto = (GroupMemberSecurityRequestDto) o;
    return Objects.equals(this.user, groupMemberSecurityRequestDto.user) &&
        Objects.equals(this.groupAccess, groupMemberSecurityRequestDto.groupAccess) &&
        Objects.equals(this.userAccess, groupMemberSecurityRequestDto.userAccess) &&
        Objects.equals(this.overridden, groupMemberSecurityRequestDto.overridden) &&
        Objects.equals(this.canEditAccess, groupMemberSecurityRequestDto.canEditAccess) &&
        Objects.equals(this.owner, groupMemberSecurityRequestDto.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, groupAccess, userAccess, overridden, canEditAccess, owner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupMemberSecurityRequestDto {\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    groupAccess: ").append(toIndentedString(groupAccess)).append("\n");
    sb.append("    userAccess: ").append(toIndentedString(userAccess)).append("\n");
    sb.append("    overridden: ").append(toIndentedString(overridden)).append("\n");
    sb.append("    canEditAccess: ").append(toIndentedString(canEditAccess)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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

    // add `user` to the URL query string
    if (getUser() != null) {
      joiner.add(getUser().toUrlQueryString(prefix + "user" + suffix));
    }

    // add `groupAccess` to the URL query string
    if (getGroupAccess() != null) {
      try {
        joiner.add(String.format("%sgroupAccess%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getGroupAccess()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `userAccess` to the URL query string
    if (getUserAccess() != null) {
      try {
        joiner.add(String.format("%suserAccess%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUserAccess()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `overridden` to the URL query string
    if (getOverridden() != null) {
      try {
        joiner.add(String.format("%soverridden%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOverridden()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `canEditAccess` to the URL query string
    if (getCanEditAccess() != null) {
      try {
        joiner.add(String.format("%scanEditAccess%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCanEditAccess()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `owner` to the URL query string
    if (getOwner() != null) {
      try {
        joiner.add(String.format("%sowner%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOwner()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

