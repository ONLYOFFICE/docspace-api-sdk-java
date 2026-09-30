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
import org.openapitools.client.model.DocsCloudQuotaUser;
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
 * Represents the current user quota of a Docs Connect tenant.
 */
@JsonPropertyOrder({
  DocsCloudQuota.JSON_PROPERTY_USERS,
  DocsCloudQuota.JSON_PROPERTY_USERS_VIEW
})

public class DocsCloudQuota {
  public static final String JSON_PROPERTY_USERS = "users";
  @javax.annotation.Nullable  private JsonNullable<List<DocsCloudQuotaUser>> users = JsonNullable.<List<DocsCloudQuotaUser>>undefined();

  public static final String JSON_PROPERTY_USERS_VIEW = "usersView";
  @javax.annotation.Nullable  private JsonNullable<List<DocsCloudQuotaUser>> usersView = JsonNullable.<List<DocsCloudQuotaUser>>undefined();

  public DocsCloudQuota() {
  }


  public DocsCloudQuota users(@javax.annotation.Nullable List<DocsCloudQuotaUser> users) {
    this.users = JsonNullable.<List<DocsCloudQuotaUser>>of(users);
    
    return this;
  }

  public DocsCloudQuota addUsersItem(DocsCloudQuotaUser usersItem) {
    if (this.users == null || !this.users.isPresent()) {
      this.users = JsonNullable.<List<DocsCloudQuotaUser>>of(new ArrayList<>());
    }
    try {
      this.users.get().add(usersItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The editor users.
   * @return users
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<DocsCloudQuotaUser> getUsers() {
        return users.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_USERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<DocsCloudQuotaUser>> getUsers_JsonNullable() {
    return users;
  }
  
  @JsonProperty(JSON_PROPERTY_USERS)
  public void setUsers_JsonNullable(JsonNullable<List<DocsCloudQuotaUser>> users) {
    this.users = users;
  }

  public void setUsers(@javax.annotation.Nullable List<DocsCloudQuotaUser> users) {
    this.users = JsonNullable.<List<DocsCloudQuotaUser>>of(users);
  }

  public DocsCloudQuota usersView(@javax.annotation.Nullable List<DocsCloudQuotaUser> usersView) {
    this.usersView = JsonNullable.<List<DocsCloudQuotaUser>>of(usersView);
    
    return this;
  }

  public DocsCloudQuota addUsersViewItem(DocsCloudQuotaUser usersViewItem) {
    if (this.usersView == null || !this.usersView.isPresent()) {
      this.usersView = JsonNullable.<List<DocsCloudQuotaUser>>of(new ArrayList<>());
    }
    try {
      this.usersView.get().add(usersViewItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The viewer users.
   * @return usersView
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<DocsCloudQuotaUser> getUsersView() {
        return usersView.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_USERS_VIEW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<DocsCloudQuotaUser>> getUsersView_JsonNullable() {
    return usersView;
  }
  
  @JsonProperty(JSON_PROPERTY_USERS_VIEW)
  public void setUsersView_JsonNullable(JsonNullable<List<DocsCloudQuotaUser>> usersView) {
    this.usersView = usersView;
  }

  public void setUsersView(@javax.annotation.Nullable List<DocsCloudQuotaUser> usersView) {
    this.usersView = JsonNullable.<List<DocsCloudQuotaUser>>of(usersView);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocsCloudQuota docsCloudQuota = (DocsCloudQuota) o;
    return equalsNullable(this.users, docsCloudQuota.users) &&
        equalsNullable(this.usersView, docsCloudQuota.usersView);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(users), hashCodeNullable(usersView));
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
    sb.append("class DocsCloudQuota {\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    usersView: ").append(toIndentedString(usersView)).append("\n");
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

    // add `users` to the URL query string
    if (getUsers() != null) {
      for (int i = 0; i < getUsers().size(); i++) {
        if (getUsers().get(i) != null) {
          joiner.add(getUsers().get(i).toUrlQueryString(String.format("%susers%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `usersView` to the URL query string
    if (getUsersView() != null) {
      for (int i = 0; i < getUsersView().size(); i++) {
        if (getUsersView().get(i) != null) {
          joiner.add(getUsersView().get(i).toUrlQueryString(String.format("%susersView%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

