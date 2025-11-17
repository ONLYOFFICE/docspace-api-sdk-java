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
import org.openapitools.client.model.RoomDataLifetimePeriod;
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
 * The room data lifetime information.
 */
@JsonPropertyOrder({
  RoomDataLifetimeDto.JSON_PROPERTY_DELETE_PERMANENTLY,
  RoomDataLifetimeDto.JSON_PROPERTY_PERIOD,
  RoomDataLifetimeDto.JSON_PROPERTY_VALUE,
  RoomDataLifetimeDto.JSON_PROPERTY_ENABLED
})

public class RoomDataLifetimeDto {
  public static final String JSON_PROPERTY_DELETE_PERMANENTLY = "deletePermanently";
  @javax.annotation.Nonnull
  private Boolean deletePermanently;

  public static final String JSON_PROPERTY_PERIOD = "period";
  @javax.annotation.Nonnull
  private RoomDataLifetimePeriod period;

  public static final String JSON_PROPERTY_VALUE = "value";
  @javax.annotation.Nullable
  private JsonNullable<Integer> value = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  @javax.annotation.Nullable
  private JsonNullable<Boolean> enabled = JsonNullable.<Boolean>undefined();

  public RoomDataLifetimeDto() {
  }

  public RoomDataLifetimeDto deletePermanently(@javax.annotation.Nonnull Boolean deletePermanently) {
    
    this.deletePermanently = deletePermanently;
    return this;
  }

  /**
   * Specifies whether to permanently delete the room data or not.
   * @return deletePermanently
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DELETE_PERMANENTLY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getDeletePermanently() {
    return deletePermanently;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_PERMANENTLY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDeletePermanently(@javax.annotation.Nonnull Boolean deletePermanently) {
    this.deletePermanently = deletePermanently;
  }

  public RoomDataLifetimeDto period(@javax.annotation.Nonnull RoomDataLifetimePeriod period) {
    
    this.period = period;
    return this;
  }

  /**
   * Get period
   * @return period
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PERIOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RoomDataLifetimePeriod getPeriod() {
    return period;
  }


  @JsonProperty(JSON_PROPERTY_PERIOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPeriod(@javax.annotation.Nonnull RoomDataLifetimePeriod period) {
    this.period = period;
  }

  public RoomDataLifetimeDto value(@javax.annotation.Nullable Integer value) {
    this.value = JsonNullable.<Integer>of(value);
    
    return this;
  }

  /**
   * Specifies the time period value of the room data lifetime.
   * minimum: 1
   * maximum: 999
   * @return value
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Integer getValue() {
        return value.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getValue_JsonNullable() {
    return value;
  }
  
  @JsonProperty(JSON_PROPERTY_VALUE)
  public void setValue_JsonNullable(JsonNullable<Integer> value) {
    this.value = value;
  }

  public void setValue(@javax.annotation.Nullable Integer value) {
    this.value = JsonNullable.<Integer>of(value);
  }

  public RoomDataLifetimeDto enabled(@javax.annotation.Nullable Boolean enabled) {
    this.enabled = JsonNullable.<Boolean>of(enabled);
    
    return this;
  }

  /**
   * Specifies whether the room data lifetime setting is enabled or not.
   * @return enabled
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getEnabled() {
        return enabled.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getEnabled_JsonNullable() {
    return enabled;
  }
  
  @JsonProperty(JSON_PROPERTY_ENABLED)
  public void setEnabled_JsonNullable(JsonNullable<Boolean> enabled) {
    this.enabled = enabled;
  }

  public void setEnabled(@javax.annotation.Nullable Boolean enabled) {
    this.enabled = JsonNullable.<Boolean>of(enabled);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomDataLifetimeDto roomDataLifetimeDto = (RoomDataLifetimeDto) o;
    return Objects.equals(this.deletePermanently, roomDataLifetimeDto.deletePermanently) &&
        Objects.equals(this.period, roomDataLifetimeDto.period) &&
        equalsNullable(this.value, roomDataLifetimeDto.value) &&
        equalsNullable(this.enabled, roomDataLifetimeDto.enabled);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletePermanently, period, hashCodeNullable(value), hashCodeNullable(enabled));
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
    sb.append("class RoomDataLifetimeDto {\n");
    sb.append("    deletePermanently: ").append(toIndentedString(deletePermanently)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

    // add `deletePermanently` to the URL query string
    if (getDeletePermanently() != null) {
      try {
        joiner.add(String.format("%sdeletePermanently%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDeletePermanently()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `period` to the URL query string
    if (getPeriod() != null) {
      try {
        joiner.add(String.format("%speriod%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPeriod()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `value` to the URL query string
    if (getValue() != null) {
      try {
        joiner.add(String.format("%svalue%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getValue()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
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

    return joiner.toString();
  }

}

