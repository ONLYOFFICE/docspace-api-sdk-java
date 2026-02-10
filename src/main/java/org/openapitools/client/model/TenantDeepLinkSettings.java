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
import java.time.OffsetDateTime;
import org.openapitools.client.model.DeepLinkHandlingMode;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The deep link settings.
 */
@JsonPropertyOrder({
  TenantDeepLinkSettings.JSON_PROPERTY_HANDLING_MODE,
  TenantDeepLinkSettings.JSON_PROPERTY_LAST_MODIFIED
})

public class TenantDeepLinkSettings {
  public static final String JSON_PROPERTY_HANDLING_MODE = "handlingMode";
  @javax.annotation.Nullable
  private DeepLinkHandlingMode handlingMode;

  public static final String JSON_PROPERTY_LAST_MODIFIED = "lastModified";
  @javax.annotation.Nullable
  private OffsetDateTime lastModified;

  public TenantDeepLinkSettings() {
  }


  public TenantDeepLinkSettings handlingMode(@javax.annotation.Nullable DeepLinkHandlingMode handlingMode) {
    
    this.handlingMode = handlingMode;
    return this;
  }

  /**
   * Get handlingMode
   * @return handlingMode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HANDLING_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DeepLinkHandlingMode getHandlingMode() {
    return handlingMode;
  }


  @JsonProperty(JSON_PROPERTY_HANDLING_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHandlingMode(@javax.annotation.Nullable DeepLinkHandlingMode handlingMode) {
    this.handlingMode = handlingMode;
  }

  public TenantDeepLinkSettings lastModified(@javax.annotation.Nullable OffsetDateTime lastModified) {
    
    this.lastModified = lastModified;
    return this;
  }

  /**
   * Get lastModified
   * @return lastModified
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastModified() {
    return lastModified;
  }


  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastModified(@javax.annotation.Nullable OffsetDateTime lastModified) {
    this.lastModified = lastModified;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantDeepLinkSettings tenantDeepLinkSettings = (TenantDeepLinkSettings) o;
    return Objects.equals(this.handlingMode, tenantDeepLinkSettings.handlingMode) &&
        Objects.equals(this.lastModified, tenantDeepLinkSettings.lastModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handlingMode, lastModified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantDeepLinkSettings {\n");
    sb.append("    handlingMode: ").append(toIndentedString(handlingMode)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
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

    // add `handlingMode` to the URL query string
    if (getHandlingMode() != null) {
      try {
        joiner.add(String.format("%shandlingMode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHandlingMode()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `lastModified` to the URL query string
    if (getLastModified() != null) {
      try {
        joiner.add(String.format("%slastModified%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLastModified()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

