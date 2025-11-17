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
import org.openapitools.client.model.NotificationChannelDto;
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
 * The notification channel settings.
 */
@JsonPropertyOrder({
  NotificationChannelStatusDto.JSON_PROPERTY_CHANNELS
})

public class NotificationChannelStatusDto {
  public static final String JSON_PROPERTY_CHANNELS = "channels";
  @javax.annotation.Nullable
  private JsonNullable<List<NotificationChannelDto>> channels = JsonNullable.<List<NotificationChannelDto>>undefined();

  public NotificationChannelStatusDto() {
  }

  public NotificationChannelStatusDto channels(@javax.annotation.Nullable List<NotificationChannelDto> channels) {
    this.channels = JsonNullable.<List<NotificationChannelDto>>of(channels);
    
    return this;
  }

  public NotificationChannelStatusDto addChannelsItem(NotificationChannelDto channelsItem) {
    if (this.channels == null || !this.channels.isPresent()) {
      this.channels = JsonNullable.<List<NotificationChannelDto>>of(new ArrayList<>());
    }
    try {
      this.channels.get().add(channelsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of notification channels.
   * @return channels
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<NotificationChannelDto> getChannels() {
        return channels.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CHANNELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<NotificationChannelDto>> getChannels_JsonNullable() {
    return channels;
  }
  
  @JsonProperty(JSON_PROPERTY_CHANNELS)
  public void setChannels_JsonNullable(JsonNullable<List<NotificationChannelDto>> channels) {
    this.channels = channels;
  }

  public void setChannels(@javax.annotation.Nullable List<NotificationChannelDto> channels) {
    this.channels = JsonNullable.<List<NotificationChannelDto>>of(channels);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationChannelStatusDto notificationChannelStatusDto = (NotificationChannelStatusDto) o;
    return equalsNullable(this.channels, notificationChannelStatusDto.channels);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(channels));
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
    sb.append("class NotificationChannelStatusDto {\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
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

    // add `channels` to the URL query string
    if (getChannels() != null) {
      for (int i = 0; i < getChannels().size(); i++) {
        if (getChannels().get(i) != null) {
          joiner.add(getChannels().get(i).toUrlQueryString(String.format("%schannels%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

