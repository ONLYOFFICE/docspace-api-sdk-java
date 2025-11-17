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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The request parameters for updating the user invitation settings.
 */
@JsonPropertyOrder({
  TenantUserInvitationSettingsRequestDto.JSON_PROPERTY_ALLOW_INVITING_MEMBERS,
  TenantUserInvitationSettingsRequestDto.JSON_PROPERTY_ALLOW_INVITING_GUESTS
})

public class TenantUserInvitationSettingsRequestDto {
  public static final String JSON_PROPERTY_ALLOW_INVITING_MEMBERS = "allowInvitingMembers";
  @javax.annotation.Nullable
  private Boolean allowInvitingMembers;

  public static final String JSON_PROPERTY_ALLOW_INVITING_GUESTS = "allowInvitingGuests";
  @javax.annotation.Nullable
  private Boolean allowInvitingGuests;

  public TenantUserInvitationSettingsRequestDto() {
  }

  public TenantUserInvitationSettingsRequestDto allowInvitingMembers(@javax.annotation.Nullable Boolean allowInvitingMembers) {
    
    this.allowInvitingMembers = allowInvitingMembers;
    return this;
  }

  /**
   * Specifies whether to allow inviting new DocSpace members through the Contacts section.
   * @return allowInvitingMembers
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOW_INVITING_MEMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowInvitingMembers() {
    return allowInvitingMembers;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_INVITING_MEMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowInvitingMembers(@javax.annotation.Nullable Boolean allowInvitingMembers) {
    this.allowInvitingMembers = allowInvitingMembers;
  }

  public TenantUserInvitationSettingsRequestDto allowInvitingGuests(@javax.annotation.Nullable Boolean allowInvitingGuests) {
    
    this.allowInvitingGuests = allowInvitingGuests;
    return this;
  }

  /**
   * Specifies whether to allow all DocSpace members to invite external guests to the rooms.
   * @return allowInvitingGuests
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOW_INVITING_GUESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowInvitingGuests() {
    return allowInvitingGuests;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_INVITING_GUESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowInvitingGuests(@javax.annotation.Nullable Boolean allowInvitingGuests) {
    this.allowInvitingGuests = allowInvitingGuests;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantUserInvitationSettingsRequestDto tenantUserInvitationSettingsRequestDto = (TenantUserInvitationSettingsRequestDto) o;
    return Objects.equals(this.allowInvitingMembers, tenantUserInvitationSettingsRequestDto.allowInvitingMembers) &&
        Objects.equals(this.allowInvitingGuests, tenantUserInvitationSettingsRequestDto.allowInvitingGuests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowInvitingMembers, allowInvitingGuests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantUserInvitationSettingsRequestDto {\n");
    sb.append("    allowInvitingMembers: ").append(toIndentedString(allowInvitingMembers)).append("\n");
    sb.append("    allowInvitingGuests: ").append(toIndentedString(allowInvitingGuests)).append("\n");
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

    // add `allowInvitingMembers` to the URL query string
    if (getAllowInvitingMembers() != null) {
      try {
        joiner.add(String.format("%sallowInvitingMembers%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAllowInvitingMembers()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `allowInvitingGuests` to the URL query string
    if (getAllowInvitingGuests() != null) {
      try {
        joiner.add(String.format("%sallowInvitingGuests%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAllowInvitingGuests()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

