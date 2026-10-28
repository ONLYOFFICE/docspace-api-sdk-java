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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The body of a file settings switch: a single flag carrying the state to store.
 */
@JsonPropertyOrder({
  SettingsRequestDto.JSON_PROPERTY_SET
})

public class SettingsRequestDto {
  public static final String JSON_PROPERTY_SET = "set";
  @javax.annotation.Nullable  private Boolean set;

  public SettingsRequestDto() {
  }


  public SettingsRequestDto set(@javax.annotation.Nullable Boolean set) {
    
    this.set = set;
    return this;
  }

  /**
   * The state to store for the setting the operation addresses: true switches it on, false switches it off. The  flag carries no meaning of its own - what is switched, who is allowed to switch it, and whether the value  belongs to the calling account or to the whole portal are stated by the operation that binds this body. The  answer repeats the value the portal read back afterwards, which is not always the one that was sent.
   * @return set
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSet() {
    return set;
  }


  @JsonProperty(value = JSON_PROPERTY_SET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSet(@javax.annotation.Nullable Boolean set) {
    this.set = set;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettingsRequestDto settingsRequestDto = (SettingsRequestDto) o;
    return Objects.equals(this.set, settingsRequestDto.set);
  }

  @Override
  public int hashCode() {
    return Objects.hash(set);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettingsRequestDto {\n");
    sb.append("    set: ").append(toIndentedString(set)).append("\n");
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

    // add `set` to the URL query string
    if (getSet() != null) {
      try {
        joiner.add(String.format("%sset%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSet()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

