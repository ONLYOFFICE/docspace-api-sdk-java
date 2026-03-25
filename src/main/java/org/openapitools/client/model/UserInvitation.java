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
 * The user invitation parameters.
 */
@JsonPropertyOrder({
  UserInvitation.JSON_PROPERTY_USERS_IDS,
  UserInvitation.JSON_PROPERTY_RESEND_ALL
})

public class UserInvitation {
  public static final String JSON_PROPERTY_USERS_IDS = "usersIds";
  @javax.annotation.Nullable  private JsonNullable<List<UUID>> usersIds = JsonNullable.<List<UUID>>undefined();

  public static final String JSON_PROPERTY_RESEND_ALL = "resendAll";
  @javax.annotation.Nullable  private Boolean resendAll;

  public UserInvitation() {
  }


  public UserInvitation usersIds(@javax.annotation.Nullable List<UUID> usersIds) {
    this.usersIds = JsonNullable.<List<UUID>>of(usersIds);
    
    return this;
  }

  public UserInvitation addUsersIdsItem(UUID usersIdsItem) {
    if (this.usersIds == null || !this.usersIds.isPresent()) {
      this.usersIds = JsonNullable.<List<UUID>>of(new ArrayList<>());
    }
    try {
      this.usersIds.get().add(usersIdsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of user IDs.
   * @return usersIds
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<UUID> getUsersIds() {
        return usersIds.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_USERS_IDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<UUID>> getUsersIds_JsonNullable() {
    return usersIds;
  }
  
  @JsonProperty(JSON_PROPERTY_USERS_IDS)
  public void setUsersIds_JsonNullable(JsonNullable<List<UUID>> usersIds) {
    this.usersIds = usersIds;
  }

  public void setUsersIds(@javax.annotation.Nullable List<UUID> usersIds) {
    this.usersIds = JsonNullable.<List<UUID>>of(usersIds);
  }

  public UserInvitation resendAll(@javax.annotation.Nullable Boolean resendAll) {
    
    this.resendAll = resendAll;
    return this;
  }

  /**
   * Specifies whether to resend all user invitations or not.
   * @return resendAll
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_RESEND_ALL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getResendAll() {
    return resendAll;
  }


  @JsonProperty(value = JSON_PROPERTY_RESEND_ALL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResendAll(@javax.annotation.Nullable Boolean resendAll) {
    this.resendAll = resendAll;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserInvitation userInvitation = (UserInvitation) o;
    return equalsNullable(this.usersIds, userInvitation.usersIds) &&
        Objects.equals(this.resendAll, userInvitation.resendAll);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(usersIds), resendAll);
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
    sb.append("class UserInvitation {\n");
    sb.append("    usersIds: ").append(toIndentedString(usersIds)).append("\n");
    sb.append("    resendAll: ").append(toIndentedString(resendAll)).append("\n");
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

    // add `usersIds` to the URL query string
    if (getUsersIds() != null) {
      for (int i = 0; i < getUsersIds().size(); i++) {
        if (getUsersIds().get(i) != null) {
          try {
            joiner.add(String.format("%susersIds%s%s=%s", prefix, suffix,
                "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
                URLEncoder.encode(String.valueOf(getUsersIds().get(i)), "UTF-8").replaceAll("\\+", "%20")));
          } catch (UnsupportedEncodingException e) {
            // Should never happen, UTF-8 is always supported
            throw new RuntimeException(e);
          }
        }
      }
    }

    // add `resendAll` to the URL query string
    if (getResendAll() != null) {
      try {
        joiner.add(String.format("%sresendAll%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getResendAll()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

