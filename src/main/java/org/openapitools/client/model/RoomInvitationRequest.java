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
import org.openapitools.client.model.RoomInvitation;
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
 * The request parameters for inviting users to the room.
 */
@JsonPropertyOrder({
  RoomInvitationRequest.JSON_PROPERTY_INVITATIONS,
  RoomInvitationRequest.JSON_PROPERTY_NOTIFY,
  RoomInvitationRequest.JSON_PROPERTY_MESSAGE,
  RoomInvitationRequest.JSON_PROPERTY_CULTURE,
  RoomInvitationRequest.JSON_PROPERTY_FORCE
})

public class RoomInvitationRequest {
  public static final String JSON_PROPERTY_INVITATIONS = "invitations";
  @javax.annotation.Nullable  private JsonNullable<List<RoomInvitation>> invitations = JsonNullable.<List<RoomInvitation>>undefined();

  public static final String JSON_PROPERTY_NOTIFY = "notify";
  @javax.annotation.Nullable  private Boolean notify;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  @javax.annotation.Nullable  private JsonNullable<String> message = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CULTURE = "culture";
  @javax.annotation.Nullable  private JsonNullable<String> culture = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FORCE = "force";
  @javax.annotation.Nullable  private Boolean force;

  public RoomInvitationRequest() {
  }


  public RoomInvitationRequest invitations(@javax.annotation.Nullable List<RoomInvitation> invitations) {
    this.invitations = JsonNullable.<List<RoomInvitation>>of(invitations);
    
    return this;
  }

  public RoomInvitationRequest addInvitationsItem(RoomInvitation invitationsItem) {
    if (this.invitations == null || !this.invitations.isPresent()) {
      this.invitations = JsonNullable.<List<RoomInvitation>>of(new ArrayList<>());
    }
    try {
      this.invitations.get().add(invitationsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The collection of invitation parameters.
   * @return invitations
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<RoomInvitation> getInvitations() {
        return invitations.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_INVITATIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<RoomInvitation>> getInvitations_JsonNullable() {
    return invitations;
  }
  
  @JsonProperty(JSON_PROPERTY_INVITATIONS)
  public void setInvitations_JsonNullable(JsonNullable<List<RoomInvitation>> invitations) {
    this.invitations = invitations;
  }

  public void setInvitations(@javax.annotation.Nullable List<RoomInvitation> invitations) {
    this.invitations = JsonNullable.<List<RoomInvitation>>of(invitations);
  }

  public RoomInvitationRequest notify(@javax.annotation.Nullable Boolean notify) {
    
    this.notify = notify;
    return this;
  }

  /**
   * Specifies whether to notify users about the shared room or not.
   * @return notify
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_NOTIFY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNotify() {
    return notify;
  }


  @JsonProperty(value = JSON_PROPERTY_NOTIFY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotify(@javax.annotation.Nullable Boolean notify) {
    this.notify = notify;
  }

  public RoomInvitationRequest message(@javax.annotation.Nullable String message) {
    this.message = JsonNullable.<String>of(message);
    
    return this;
  }

  /**
   * The message to send when notifying about the shared room.
   * @return message
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getMessage() {
        return message.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_MESSAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getMessage_JsonNullable() {
    return message;
  }
  
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  public void setMessage_JsonNullable(JsonNullable<String> message) {
    this.message = message;
  }

  public void setMessage(@javax.annotation.Nullable String message) {
    this.message = JsonNullable.<String>of(message);
  }

  public RoomInvitationRequest culture(@javax.annotation.Nullable String culture) {
    this.culture = JsonNullable.<String>of(culture);
    
    return this;
  }

  /**
   * The language of the room invitation.
   * @return culture
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getCulture() {
        return culture.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_CULTURE, required = false)
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

  public RoomInvitationRequest force(@javax.annotation.Nullable Boolean force) {
    
    this.force = force;
    return this;
  }

  /**
   * Specifies whether to forcibly delete a user with form roles from the room.
   * @return force
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_FORCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getForce() {
    return force;
  }


  @JsonProperty(value = JSON_PROPERTY_FORCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForce(@javax.annotation.Nullable Boolean force) {
    this.force = force;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomInvitationRequest roomInvitationRequest = (RoomInvitationRequest) o;
    return equalsNullable(this.invitations, roomInvitationRequest.invitations) &&
        Objects.equals(this.notify, roomInvitationRequest.notify) &&
        equalsNullable(this.message, roomInvitationRequest.message) &&
        equalsNullable(this.culture, roomInvitationRequest.culture) &&
        Objects.equals(this.force, roomInvitationRequest.force);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(invitations), notify, hashCodeNullable(message), hashCodeNullable(culture), force);
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
    sb.append("class RoomInvitationRequest {\n");
    sb.append("    invitations: ").append(toIndentedString(invitations)).append("\n");
    sb.append("    notify: ").append(toIndentedString(notify)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    culture: ").append(toIndentedString(culture)).append("\n");
    sb.append("    force: ").append(toIndentedString(force)).append("\n");
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

    // add `notify` to the URL query string
    if (getNotify() != null) {
      try {
        joiner.add(String.format("%snotify%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNotify()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `message` to the URL query string
    if (getMessage() != null) {
      try {
        joiner.add(String.format("%smessage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMessage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
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

    // add `force` to the URL query string
    if (getForce() != null) {
      try {
        joiner.add(String.format("%sforce%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getForce()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

