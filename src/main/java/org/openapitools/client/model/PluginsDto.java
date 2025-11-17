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
 * The plugins parameters.
 */
@JsonPropertyOrder({
  PluginsDto.JSON_PROPERTY_ENABLED,
  PluginsDto.JSON_PROPERTY_UPLOAD,
  PluginsDto.JSON_PROPERTY_DELETE
})

public class PluginsDto {
  public static final String JSON_PROPERTY_ENABLED = "enabled";
  @javax.annotation.Nullable
  private Boolean enabled;

  public static final String JSON_PROPERTY_UPLOAD = "upload";
  @javax.annotation.Nullable
  private Boolean upload;

  public static final String JSON_PROPERTY_DELETE = "delete";
  @javax.annotation.Nullable
  private Boolean delete;

  public PluginsDto() {
  }

  public PluginsDto enabled(@javax.annotation.Nullable Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

  /**
   * Specifies if the plugins are enabled or not.
   * @return enabled
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabled(@javax.annotation.Nullable Boolean enabled) {
    this.enabled = enabled;
  }

  public PluginsDto upload(@javax.annotation.Nullable Boolean upload) {
    
    this.upload = upload;
    return this;
  }

  /**
   * Specifies if the plugins can be uploaded or not.
   * @return upload
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUpload() {
    return upload;
  }


  @JsonProperty(JSON_PROPERTY_UPLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpload(@javax.annotation.Nullable Boolean upload) {
    this.upload = upload;
  }

  public PluginsDto delete(@javax.annotation.Nullable Boolean delete) {
    
    this.delete = delete;
    return this;
  }

  /**
   * Specifies if the plugins can be deleted or not.
   * @return delete
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDelete() {
    return delete;
  }


  @JsonProperty(JSON_PROPERTY_DELETE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDelete(@javax.annotation.Nullable Boolean delete) {
    this.delete = delete;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PluginsDto pluginsDto = (PluginsDto) o;
    return Objects.equals(this.enabled, pluginsDto.enabled) &&
        Objects.equals(this.upload, pluginsDto.upload) &&
        Objects.equals(this.delete, pluginsDto.delete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, upload, delete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginsDto {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    upload: ").append(toIndentedString(upload)).append("\n");
    sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
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

    // add `enabled` to the URL query string
    if (getEnabled() != null) {
      try {
        joiner.add(String.format("%senabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnabled()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `upload` to the URL query string
    if (getUpload() != null) {
      try {
        joiner.add(String.format("%supload%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUpload()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `delete` to the URL query string
    if (getDelete() != null) {
      try {
        joiner.add(String.format("%sdelete%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDelete()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

