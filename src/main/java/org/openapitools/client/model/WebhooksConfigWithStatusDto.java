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
import org.openapitools.client.model.WebhooksConfigDto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The webhook configuration with its status.
 */
@JsonPropertyOrder({
  WebhooksConfigWithStatusDto.JSON_PROPERTY_CONFIGS,
  WebhooksConfigWithStatusDto.JSON_PROPERTY_STATUS
})

public class WebhooksConfigWithStatusDto {
  public static final String JSON_PROPERTY_CONFIGS = "configs";
  @javax.annotation.Nullable  private WebhooksConfigDto configs;

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nullable  private Integer status;

  public WebhooksConfigWithStatusDto() {
  }


  public WebhooksConfigWithStatusDto configs(@javax.annotation.Nullable WebhooksConfigDto configs) {
    
    this.configs = configs;
    return this;
  }

  /**
   * Get configs
   * @return configs
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CONFIGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WebhooksConfigDto getConfigs() {
    return configs;
  }


  @JsonProperty(value = JSON_PROPERTY_CONFIGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfigs(@javax.annotation.Nullable WebhooksConfigDto configs) {
    this.configs = configs;
  }

  public WebhooksConfigWithStatusDto status(@javax.annotation.Nullable Integer status) {
    
    this.status = status;
    return this;
  }

  /**
   * The webhook status.
   * @return status
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStatus() {
    return status;
  }


  @JsonProperty(value = JSON_PROPERTY_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(@javax.annotation.Nullable Integer status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhooksConfigWithStatusDto webhooksConfigWithStatusDto = (WebhooksConfigWithStatusDto) o;
    return Objects.equals(this.configs, webhooksConfigWithStatusDto.configs) &&
        Objects.equals(this.status, webhooksConfigWithStatusDto.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configs, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhooksConfigWithStatusDto {\n");
    sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

    // add `configs` to the URL query string
    if (getConfigs() != null) {
      joiner.add(getConfigs().toUrlQueryString(prefix + "configs" + suffix));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      try {
        joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatus()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

