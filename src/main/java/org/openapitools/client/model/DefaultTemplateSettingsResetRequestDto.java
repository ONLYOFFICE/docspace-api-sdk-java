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
 * Default templates settings reset request parameters.
 */
@JsonPropertyOrder({
  DefaultTemplateSettingsResetRequestDto.JSON_PROPERTY_FILE_EXTENSION
})

public class DefaultTemplateSettingsResetRequestDto {
  public static final String JSON_PROPERTY_FILE_EXTENSION = "fileExtension";
  @javax.annotation.Nullable  private String fileExtension;

  public DefaultTemplateSettingsResetRequestDto() {
  }


  public DefaultTemplateSettingsResetRequestDto fileExtension(@javax.annotation.Nullable String fileExtension) {
    
    this.fileExtension = fileExtension;
    return this;
  }

  /**
   * File extension of a template to reset
   * @return fileExtension
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_FILE_EXTENSION, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFileExtension() {
    return fileExtension;
  }


  @JsonProperty(value = JSON_PROPERTY_FILE_EXTENSION, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFileExtension(@javax.annotation.Nullable String fileExtension) {
    this.fileExtension = fileExtension;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefaultTemplateSettingsResetRequestDto defaultTemplateSettingsResetRequestDto = (DefaultTemplateSettingsResetRequestDto) o;
    return Objects.equals(this.fileExtension, defaultTemplateSettingsResetRequestDto.fileExtension);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileExtension);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultTemplateSettingsResetRequestDto {\n");
    sb.append("    fileExtension: ").append(toIndentedString(fileExtension)).append("\n");
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

    // add `fileExtension` to the URL query string
    if (getFileExtension() != null) {
      try {
        joiner.add(String.format("%sfileExtension%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFileExtension()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

