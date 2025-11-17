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
 * The tenant quota settings.
 */
@JsonPropertyOrder({
  TenantQuotaSettings.JSON_PROPERTY_ENABLE_QUOTA,
  TenantQuotaSettings.JSON_PROPERTY_QUOTA,
  TenantQuotaSettings.JSON_PROPERTY_LAST_RECALCULATE_DATE,
  TenantQuotaSettings.JSON_PROPERTY_LAST_MODIFIED
})

public class TenantQuotaSettings {
  public static final String JSON_PROPERTY_ENABLE_QUOTA = "enableQuota";
  @javax.annotation.Nullable
  private Boolean enableQuota;

  public static final String JSON_PROPERTY_QUOTA = "quota";
  @javax.annotation.Nullable
  private Long quota;

  public static final String JSON_PROPERTY_LAST_RECALCULATE_DATE = "lastRecalculateDate";
  @javax.annotation.Nullable
  private JsonNullable<OffsetDateTime> lastRecalculateDate = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_LAST_MODIFIED = "lastModified";
  @javax.annotation.Nullable
  private OffsetDateTime lastModified;

  public TenantQuotaSettings() {
  }

  public TenantQuotaSettings enableQuota(@javax.annotation.Nullable Boolean enableQuota) {
    
    this.enableQuota = enableQuota;
    return this;
  }

  /**
   * Specifies if the tenant quota is enabled or not.
   * @return enableQuota
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLE_QUOTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnableQuota() {
    return enableQuota;
  }


  @JsonProperty(JSON_PROPERTY_ENABLE_QUOTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnableQuota(@javax.annotation.Nullable Boolean enableQuota) {
    this.enableQuota = enableQuota;
  }

  public TenantQuotaSettings quota(@javax.annotation.Nullable Long quota) {
    
    this.quota = quota;
    return this;
  }

  /**
   * The tenant quota.
   * @return quota
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUOTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getQuota() {
    return quota;
  }


  @JsonProperty(JSON_PROPERTY_QUOTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuota(@javax.annotation.Nullable Long quota) {
    this.quota = quota;
  }

  public TenantQuotaSettings lastRecalculateDate(@javax.annotation.Nullable OffsetDateTime lastRecalculateDate) {
    this.lastRecalculateDate = JsonNullable.<OffsetDateTime>of(lastRecalculateDate);
    
    return this;
  }

  /**
   * The date of the last tenant quota recalculation.
   * @return lastRecalculateDate
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public OffsetDateTime getLastRecalculateDate() {
        return lastRecalculateDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_RECALCULATE_DATE)
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

  public TenantQuotaSettings lastModified(@javax.annotation.Nullable OffsetDateTime lastModified) {
    
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
    TenantQuotaSettings tenantQuotaSettings = (TenantQuotaSettings) o;
    return Objects.equals(this.enableQuota, tenantQuotaSettings.enableQuota) &&
        Objects.equals(this.quota, tenantQuotaSettings.quota) &&
        equalsNullable(this.lastRecalculateDate, tenantQuotaSettings.lastRecalculateDate) &&
        Objects.equals(this.lastModified, tenantQuotaSettings.lastModified);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableQuota, quota, hashCodeNullable(lastRecalculateDate), lastModified);
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
    sb.append("class TenantQuotaSettings {\n");
    sb.append("    enableQuota: ").append(toIndentedString(enableQuota)).append("\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
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

    // add `quota` to the URL query string
    if (getQuota() != null) {
      try {
        joiner.add(String.format("%squota%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getQuota()), "UTF-8").replaceAll("\\+", "%20")));
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

