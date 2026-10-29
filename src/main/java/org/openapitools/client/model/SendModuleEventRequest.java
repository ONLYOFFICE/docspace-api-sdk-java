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
 * A socket event from an integration module: who receives it in the portal, its name and its payload.
 */
@JsonPropertyOrder({
  SendModuleEventRequest.JSON_PROPERTY_ROOM,
  SendModuleEventRequest.JSON_PROPERTY_USER,
  SendModuleEventRequest.JSON_PROPERTY_EVENT,
  SendModuleEventRequest.JSON_PROPERTY_MESSAGE
})

public class SendModuleEventRequest {
  public static final String JSON_PROPERTY_ROOM = "room";
  @javax.annotation.Nullable  private JsonNullable<String> room = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_USER = "user";
  @javax.annotation.Nullable  private JsonNullable<String> user = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EVENT = "event";
  @javax.annotation.Nullable  private JsonNullable<String> event = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MESSAGE = "message";
  @javax.annotation.Nullable  private JsonNullable<String> message = JsonNullable.<String>undefined();

  public SendModuleEventRequest() {
  }


  public SendModuleEventRequest room(@javax.annotation.Nullable String room) {
    this.room = JsonNullable.<String>of(room);
    
    return this;
  }

  /**
   * A room of the module in this portal: everyone subscribed to `plugin-{module}-{room}` receives the event. Latin  letters, digits and the characters `_ . : -`.
   * @return room
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getRoom() {
        return room.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ROOM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getRoom_JsonNullable() {
    return room;
  }
  
  @JsonProperty(JSON_PROPERTY_ROOM)
  public void setRoom_JsonNullable(JsonNullable<String> room) {
    this.room = room;
  }

  public void setRoom(@javax.annotation.Nullable String room) {
    this.room = JsonNullable.<String>of(room);
  }

  public SendModuleEventRequest user(@javax.annotation.Nullable String user) {
    this.user = JsonNullable.<String>of(user);
    
    return this;
  }

  /**
   * The e-mail of the portal user who receives the event; with single sign-on it is the same e-mail the module's own  application knows the person by. Only that user's open sessions receive it.
   * @return user
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getUser() {
        return user.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_USER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getUser_JsonNullable() {
    return user;
  }
  
  @JsonProperty(JSON_PROPERTY_USER)
  public void setUser_JsonNullable(JsonNullable<String> user) {
    this.user = user;
  }

  public void setUser(@javax.annotation.Nullable String user) {
    this.user = JsonNullable.<String>of(user);
  }

  public SendModuleEventRequest event(@javax.annotation.Nullable String event) {
    this.event = JsonNullable.<String>of(event);
    
    return this;
  }

  /**
   * The event name. Browsers receive it as `plugin:{module}:{event}`. Latin letters, digits and the characters  `_ . : -`.
   * @return event
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getEvent() {
        return event.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_EVENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getEvent_JsonNullable() {
    return event;
  }
  
  @JsonProperty(JSON_PROPERTY_EVENT)
  public void setEvent_JsonNullable(JsonNullable<String> event) {
    this.event = event;
  }

  public void setEvent(@javax.annotation.Nullable String event) {
    this.event = JsonNullable.<String>of(event);
  }

  public SendModuleEventRequest message(@javax.annotation.Nullable String message) {
    this.message = JsonNullable.<String>of(message);
    
    return this;
  }

  /**
   * Passed to the browser as it is, as `{ message }`. Meant as a signal to re-read, such as an unread count; use  JSON text for structured data and keep personal content out of it.
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendModuleEventRequest sendModuleEventRequest = (SendModuleEventRequest) o;
    return equalsNullable(this.room, sendModuleEventRequest.room) &&
        equalsNullable(this.user, sendModuleEventRequest.user) &&
        equalsNullable(this.event, sendModuleEventRequest.event) &&
        equalsNullable(this.message, sendModuleEventRequest.message);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(room), hashCodeNullable(user), hashCodeNullable(event), hashCodeNullable(message));
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
    sb.append("class SendModuleEventRequest {\n");
    sb.append("    room: ").append(toIndentedString(room)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

    // add `room` to the URL query string
    if (getRoom() != null) {
      try {
        joiner.add(String.format("%sroom%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRoom()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `user` to the URL query string
    if (getUser() != null) {
      try {
        joiner.add(String.format("%suser%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUser()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `event` to the URL query string
    if (getEvent() != null) {
      try {
        joiner.add(String.format("%sevent%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEvent()), "UTF-8").replaceAll("\\+", "%20")));
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

    return joiner.toString();
  }

}

