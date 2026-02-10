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
 * The request parameters for hiding the confirmation dialog when converting.
 */
@JsonPropertyOrder({
  HideConfirmConvertRequestDto.JSON_PROPERTY_SAVE
})

public class HideConfirmConvertRequestDto {
  public static final String JSON_PROPERTY_SAVE = "save";
  @javax.annotation.Nullable
  private Boolean save;

  public HideConfirmConvertRequestDto() {
  }


  public HideConfirmConvertRequestDto save(@javax.annotation.Nullable Boolean save) {
    
    this.save = save;
    return this;
  }

  /**
   * Specifies whether to set the specified settings or not.
   * @return save
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SAVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSave() {
    return save;
  }


  @JsonProperty(JSON_PROPERTY_SAVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSave(@javax.annotation.Nullable Boolean save) {
    this.save = save;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HideConfirmConvertRequestDto hideConfirmConvertRequestDto = (HideConfirmConvertRequestDto) o;
    return Objects.equals(this.save, hideConfirmConvertRequestDto.save);
  }

  @Override
  public int hashCode() {
    return Objects.hash(save);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HideConfirmConvertRequestDto {\n");
    sb.append("    save: ").append(toIndentedString(save)).append("\n");
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

    // add `save` to the URL query string
    if (getSave() != null) {
      try {
        joiner.add(String.format("%ssave%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSave()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

