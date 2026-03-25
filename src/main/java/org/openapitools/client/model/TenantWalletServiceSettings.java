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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * The wallet services settings.
 */
@JsonPropertyOrder({
  TenantWalletServiceSettings.JSON_PROPERTY_ENABLED_SERVICES,
  TenantWalletServiceSettings.JSON_PROPERTY_LAST_MODIFIED
})

public class TenantWalletServiceSettings {
  /**
   * The list of the enabled wallet services.
   */
  public enum EnabledServicesEnum {
    AITools(Integer.valueOf(-13)),
    
    Backup(Integer.valueOf(-12)),
    
    Storage(Integer.valueOf(-11));

    private Integer value;

    EnabledServicesEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EnabledServicesEnum fromValue(Integer value) {
      for (EnabledServicesEnum b : EnabledServicesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  public static final String JSON_PROPERTY_ENABLED_SERVICES = "enabledServices";
  @javax.annotation.Nullable  private JsonNullable<List<EnabledServicesEnum>> enabledServices = JsonNullable.<List<EnabledServicesEnum>>undefined();

  public static final String JSON_PROPERTY_LAST_MODIFIED = "lastModified";
  @javax.annotation.Nullable  private OffsetDateTime lastModified;

  public TenantWalletServiceSettings() {
  }


  public TenantWalletServiceSettings enabledServices(@javax.annotation.Nullable List<EnabledServicesEnum> enabledServices) {
    this.enabledServices = JsonNullable.<List<EnabledServicesEnum>>of(enabledServices);
    
    return this;
  }

  public TenantWalletServiceSettings addEnabledServicesItem(EnabledServicesEnum enabledServicesItem) {
    if (this.enabledServices == null || !this.enabledServices.isPresent()) {
      this.enabledServices = JsonNullable.<List<EnabledServicesEnum>>of(new ArrayList<>());
    }
    try {
      this.enabledServices.get().add(enabledServicesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of the enabled wallet services.
   * @return enabledServices
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<EnabledServicesEnum> getEnabledServices() {
        return enabledServices.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ENABLED_SERVICES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<EnabledServicesEnum>> getEnabledServices_JsonNullable() {
    return enabledServices;
  }
  
  @JsonProperty(JSON_PROPERTY_ENABLED_SERVICES)
  public void setEnabledServices_JsonNullable(JsonNullable<List<EnabledServicesEnum>> enabledServices) {
    this.enabledServices = enabledServices;
  }

  public void setEnabledServices(@javax.annotation.Nullable List<EnabledServicesEnum> enabledServices) {
    this.enabledServices = JsonNullable.<List<EnabledServicesEnum>>of(enabledServices);
  }

  public TenantWalletServiceSettings lastModified(@javax.annotation.Nullable OffsetDateTime lastModified) {
    
    this.lastModified = lastModified;
    return this;
  }

  /**
   * The date and time when the wallet services settings were last modified.
   * @return lastModified
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_LAST_MODIFIED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastModified() {
    return lastModified;
  }


  @JsonProperty(value = JSON_PROPERTY_LAST_MODIFIED, required = false)
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
    TenantWalletServiceSettings tenantWalletServiceSettings = (TenantWalletServiceSettings) o;
    return equalsNullable(this.enabledServices, tenantWalletServiceSettings.enabledServices) &&
        Objects.equals(this.lastModified, tenantWalletServiceSettings.lastModified);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(enabledServices), lastModified);
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
    sb.append("class TenantWalletServiceSettings {\n");
    sb.append("    enabledServices: ").append(toIndentedString(enabledServices)).append("\n");
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

    // add `enabledServices` to the URL query string
    if (getEnabledServices() != null) {
      for (int i = 0; i < getEnabledServices().size(); i++) {
        try {
          joiner.add(String.format("%senabledServices%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getEnabledServices().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
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

