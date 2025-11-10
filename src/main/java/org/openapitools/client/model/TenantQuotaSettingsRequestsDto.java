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
 * The request parameters for managing the tenant storage quota settings in a multi-tenant system.
 */
@JsonPropertyOrder({
  TenantQuotaSettingsRequestsDto.JSON_PROPERTY_TENANT_ID,
  TenantQuotaSettingsRequestsDto.JSON_PROPERTY_QUOTA
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class TenantQuotaSettingsRequestsDto {
  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @javax.annotation.Nonnull
  private Integer tenantId;

  public static final String JSON_PROPERTY_QUOTA = "quota";
  @javax.annotation.Nullable
  private Long quota;

  public TenantQuotaSettingsRequestsDto() {
  }

  public TenantQuotaSettingsRequestsDto tenantId(@javax.annotation.Nonnull Integer tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

  /**
   * The ID of the tenant whose quota is being configured.
   * @return tenantId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTenantId() {
    return tenantId;
  }


  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTenantId(@javax.annotation.Nonnull Integer tenantId) {
    this.tenantId = tenantId;
  }

  public TenantQuotaSettingsRequestsDto quota(@javax.annotation.Nullable Long quota) {
    
    this.quota = quota;
    return this;
  }

  /**
   * The storage quota limit in bytes allocated to the tenant.
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantQuotaSettingsRequestsDto tenantQuotaSettingsRequestsDto = (TenantQuotaSettingsRequestsDto) o;
    return Objects.equals(this.tenantId, tenantQuotaSettingsRequestsDto.tenantId) &&
        Objects.equals(this.quota, tenantQuotaSettingsRequestsDto.quota);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, quota);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantQuotaSettingsRequestsDto {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
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

    // add `tenantId` to the URL query string
    if (getTenantId() != null) {
      try {
        joiner.add(String.format("%stenantId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTenantId()), "UTF-8").replaceAll("\\+", "%20")));
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

    return joiner.toString();
  }

}

