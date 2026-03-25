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
 * The AI agent quota settings.
 */
@JsonPropertyOrder({
  TenantAiAgentQuotaSettings.JSON_PROPERTY_ENABLE_QUOTA,
  TenantAiAgentQuotaSettings.JSON_PROPERTY_DEFAULT_QUOTA,
  TenantAiAgentQuotaSettings.JSON_PROPERTY_LAST_RECALCULATE_DATE,
  TenantAiAgentQuotaSettings.JSON_PROPERTY_LAST_MODIFIED
})

public class TenantAiAgentQuotaSettings {
  public static final String JSON_PROPERTY_ENABLE_QUOTA = "enableQuota";
  @javax.annotation.Nullable  private Boolean enableQuota;

  public static final String JSON_PROPERTY_DEFAULT_QUOTA = "defaultQuota";
  @javax.annotation.Nullable  private Long defaultQuota;

  public static final String JSON_PROPERTY_LAST_RECALCULATE_DATE = "lastRecalculateDate";
  @javax.annotation.Nullable  private JsonNullable<OffsetDateTime> lastRecalculateDate = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_LAST_MODIFIED = "lastModified";
  @javax.annotation.Nullable  private OffsetDateTime lastModified;

  public TenantAiAgentQuotaSettings() {
  }


  public TenantAiAgentQuotaSettings enableQuota(@javax.annotation.Nullable Boolean enableQuota) {
    
    this.enableQuota = enableQuota;
    return this;
  }

  /**
   * Specifies if the quota is enabled for the tenant entity or not.
   * @return enableQuota
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ENABLE_QUOTA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnableQuota() {
    return enableQuota;
  }


  @JsonProperty(value = JSON_PROPERTY_ENABLE_QUOTA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnableQuota(@javax.annotation.Nullable Boolean enableQuota) {
    this.enableQuota = enableQuota;
  }

  public TenantAiAgentQuotaSettings defaultQuota(@javax.annotation.Nullable Long defaultQuota) {
    
    this.defaultQuota = defaultQuota;
    return this;
  }

  /**
   * The default quota of the tenant entity.
   * @return defaultQuota
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DEFAULT_QUOTA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDefaultQuota() {
    return defaultQuota;
  }


  @JsonProperty(value = JSON_PROPERTY_DEFAULT_QUOTA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultQuota(@javax.annotation.Nullable Long defaultQuota) {
    this.defaultQuota = defaultQuota;
  }

  public TenantAiAgentQuotaSettings lastRecalculateDate(@javax.annotation.Nullable OffsetDateTime lastRecalculateDate) {
    this.lastRecalculateDate = JsonNullable.<OffsetDateTime>of(lastRecalculateDate);
    
    return this;
  }

  /**
   * The date of the last quota recalculation.
   * @return lastRecalculateDate
   */
  @javax.annotation.Nullable  @JsonIgnore

  public OffsetDateTime getLastRecalculateDate() {
        return lastRecalculateDate.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_LAST_RECALCULATE_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getLastRecalculateDate_JsonNullable() {
    return lastRecalculateDate;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST_RECALCULATE_DATE)
  public void setLastRecalculateDate_JsonNullable(JsonNullable<OffsetDateTime> lastRecalculateDate) {
    this.lastRecalculateDate = lastRecalculateDate;
  }

  public void setLastRecalculateDate(@javax.annotation.Nullable OffsetDateTime lastRecalculateDate) {
    this.lastRecalculateDate = JsonNullable.<OffsetDateTime>of(lastRecalculateDate);
  }

  public TenantAiAgentQuotaSettings lastModified(@javax.annotation.Nullable OffsetDateTime lastModified) {
    
    this.lastModified = lastModified;
    return this;
  }

  /**
   * The timestamp indicating when the settings were last modified.
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
    TenantAiAgentQuotaSettings tenantAiAgentQuotaSettings = (TenantAiAgentQuotaSettings) o;
    return Objects.equals(this.enableQuota, tenantAiAgentQuotaSettings.enableQuota) &&
        Objects.equals(this.defaultQuota, tenantAiAgentQuotaSettings.defaultQuota) &&
        equalsNullable(this.lastRecalculateDate, tenantAiAgentQuotaSettings.lastRecalculateDate) &&
        Objects.equals(this.lastModified, tenantAiAgentQuotaSettings.lastModified);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableQuota, defaultQuota, hashCodeNullable(lastRecalculateDate), lastModified);
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
    sb.append("class TenantAiAgentQuotaSettings {\n");
    sb.append("    enableQuota: ").append(toIndentedString(enableQuota)).append("\n");
    sb.append("    defaultQuota: ").append(toIndentedString(defaultQuota)).append("\n");
    sb.append("    lastRecalculateDate: ").append(toIndentedString(lastRecalculateDate)).append("\n");
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

    // add `enableQuota` to the URL query string
    if (getEnableQuota() != null) {
      try {
        joiner.add(String.format("%senableQuota%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnableQuota()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `defaultQuota` to the URL query string
    if (getDefaultQuota() != null) {
      try {
        joiner.add(String.format("%sdefaultQuota%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDefaultQuota()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `lastRecalculateDate` to the URL query string
    if (getLastRecalculateDate() != null) {
      try {
        joiner.add(String.format("%slastRecalculateDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLastRecalculateDate()), "UTF-8").replaceAll("\\+", "%20")));
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

