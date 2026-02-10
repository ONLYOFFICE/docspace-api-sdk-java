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
import org.openapitools.client.model.TenantDeepLinkSettings;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The request parameters for managing the deep link configuration.
 */
@JsonPropertyOrder({
  DeepLinkConfigurationRequestsDto.JSON_PROPERTY_DEEP_LINK_SETTINGS
})

public class DeepLinkConfigurationRequestsDto {
  public static final String JSON_PROPERTY_DEEP_LINK_SETTINGS = "deepLinkSettings";
  @javax.annotation.Nullable
  private TenantDeepLinkSettings deepLinkSettings;

  public DeepLinkConfigurationRequestsDto() {
  }


  public DeepLinkConfigurationRequestsDto deepLinkSettings(@javax.annotation.Nullable TenantDeepLinkSettings deepLinkSettings) {
    
    this.deepLinkSettings = deepLinkSettings;
    return this;
  }

  /**
   * Get deepLinkSettings
   * @return deepLinkSettings
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEEP_LINK_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TenantDeepLinkSettings getDeepLinkSettings() {
    return deepLinkSettings;
  }


  @JsonProperty(JSON_PROPERTY_DEEP_LINK_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeepLinkSettings(@javax.annotation.Nullable TenantDeepLinkSettings deepLinkSettings) {
    this.deepLinkSettings = deepLinkSettings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeepLinkConfigurationRequestsDto deepLinkConfigurationRequestsDto = (DeepLinkConfigurationRequestsDto) o;
    return Objects.equals(this.deepLinkSettings, deepLinkConfigurationRequestsDto.deepLinkSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deepLinkSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeepLinkConfigurationRequestsDto {\n");
    sb.append("    deepLinkSettings: ").append(toIndentedString(deepLinkSettings)).append("\n");
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

    // add `deepLinkSettings` to the URL query string
    if (getDeepLinkSettings() != null) {
      joiner.add(getDeepLinkSettings().toUrlQueryString(prefix + "deepLinkSettings" + suffix));
    }

    return joiner.toString();
  }

}

