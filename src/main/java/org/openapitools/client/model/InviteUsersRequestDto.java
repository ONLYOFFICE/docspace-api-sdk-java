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
import org.openapitools.client.model.UserInvitationRequestDto;
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
 * The request parameters for inviting users.
 */
@JsonPropertyOrder({
  InviteUsersRequestDto.JSON_PROPERTY_INVITATIONS,
  InviteUsersRequestDto.JSON_PROPERTY_CULTURE
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class InviteUsersRequestDto {
  public static final String JSON_PROPERTY_INVITATIONS = "invitations";
  @javax.annotation.Nonnull
  private List<UserInvitationRequestDto> invitations = new ArrayList<>();

  public static final String JSON_PROPERTY_CULTURE = "culture";
  @javax.annotation.Nullable
  private JsonNullable<String> culture = JsonNullable.<String>undefined();

  public InviteUsersRequestDto() {
  }

  public InviteUsersRequestDto invitations(@javax.annotation.Nonnull List<UserInvitationRequestDto> invitations) {
    
    this.invitations = invitations;
    return this;
  }

  public InviteUsersRequestDto addInvitationsItem(UserInvitationRequestDto invitationsItem) {
    if (this.invitations == null) {
      this.invitations = new ArrayList<>();
    }
    this.invitations.add(invitationsItem);
    return this;
  }

  /**
   * The list of user invitations.
   * @return invitations
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INVITATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<UserInvitationRequestDto> getInvitations() {
    return invitations;
  }


  @JsonProperty(JSON_PROPERTY_INVITATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInvitations(@javax.annotation.Nonnull List<UserInvitationRequestDto> invitations) {
    this.invitations = invitations;
  }

  public InviteUsersRequestDto culture(@javax.annotation.Nullable String culture) {
    this.culture = JsonNullable.<String>of(culture);
    
    return this;
  }

  /**
   * The culture code of invitations.
   * @return culture
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCulture() {
        return culture.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CULTURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCulture_JsonNullable() {
    return culture;
  }
  
  @JsonProperty(JSON_PROPERTY_CULTURE)
  public void setCulture_JsonNullable(JsonNullable<String> culture) {
    this.culture = culture;
  }

  public void setCulture(@javax.annotation.Nullable String culture) {
    this.culture = JsonNullable.<String>of(culture);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InviteUsersRequestDto inviteUsersRequestDto = (InviteUsersRequestDto) o;
    return Objects.equals(this.invitations, inviteUsersRequestDto.invitations) &&
        equalsNullable(this.culture, inviteUsersRequestDto.culture);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(invitations, hashCodeNullable(culture));
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
    sb.append("class InviteUsersRequestDto {\n");
    sb.append("    invitations: ").append(toIndentedString(invitations)).append("\n");
    sb.append("    culture: ").append(toIndentedString(culture)).append("\n");
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

    // add `invitations` to the URL query string
    if (getInvitations() != null) {
      for (int i = 0; i < getInvitations().size(); i++) {
        if (getInvitations().get(i) != null) {
          joiner.add(getInvitations().get(i).toUrlQueryString(String.format("%sinvitations%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `culture` to the URL query string
    if (getCulture() != null) {
      try {
        joiner.add(String.format("%sculture%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCulture()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

