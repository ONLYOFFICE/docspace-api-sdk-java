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
 * The database tenant partner parameters.
 */
@JsonPropertyOrder({
  DbTenantPartner.JSON_PROPERTY_TENANT_ID,
  DbTenantPartner.JSON_PROPERTY_PARTNER_ID,
  DbTenantPartner.JSON_PROPERTY_AFFILIATE_ID,
  DbTenantPartner.JSON_PROPERTY_CAMPAIGN
})

public class DbTenantPartner {
  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @javax.annotation.Nullable
  private Integer tenantId;

  public static final String JSON_PROPERTY_PARTNER_ID = "partnerId";
  @javax.annotation.Nullable
  private JsonNullable<String> partnerId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_AFFILIATE_ID = "affiliateId";
  @javax.annotation.Nullable
  private JsonNullable<String> affiliateId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CAMPAIGN = "campaign";
  @javax.annotation.Nullable
  private JsonNullable<String> campaign = JsonNullable.<String>undefined();

  public DbTenantPartner() {
  }

  public DbTenantPartner tenantId(@javax.annotation.Nullable Integer tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

  /**
   * The tenant ID.
   * @return tenantId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTenantId() {
    return tenantId;
  }


  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantId(@javax.annotation.Nullable Integer tenantId) {
    this.tenantId = tenantId;
  }

  public DbTenantPartner partnerId(@javax.annotation.Nullable String partnerId) {
    this.partnerId = JsonNullable.<String>of(partnerId);
    
    return this;
  }

  /**
   * The partner ID.
   * @return partnerId
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPartnerId() {
        return partnerId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PARTNER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPartnerId_JsonNullable() {
    return partnerId;
  }
  
  @JsonProperty(JSON_PROPERTY_PARTNER_ID)
  public void setPartnerId_JsonNullable(JsonNullable<String> partnerId) {
    this.partnerId = partnerId;
  }

  public void setPartnerId(@javax.annotation.Nullable String partnerId) {
    this.partnerId = JsonNullable.<String>of(partnerId);
  }

  public DbTenantPartner affiliateId(@javax.annotation.Nullable String affiliateId) {
    this.affiliateId = JsonNullable.<String>of(affiliateId);
    
    return this;
  }

  /**
   * The affiliate ID.
   * @return affiliateId
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getAffiliateId() {
        return affiliateId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AFFILIATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAffiliateId_JsonNullable() {
    return affiliateId;
  }
  
  @JsonProperty(JSON_PROPERTY_AFFILIATE_ID)
  public void setAffiliateId_JsonNullable(JsonNullable<String> affiliateId) {
    this.affiliateId = affiliateId;
  }

  public void setAffiliateId(@javax.annotation.Nullable String affiliateId) {
    this.affiliateId = JsonNullable.<String>of(affiliateId);
  }

  public DbTenantPartner campaign(@javax.annotation.Nullable String campaign) {
    this.campaign = JsonNullable.<String>of(campaign);
    
    return this;
  }

  /**
   * The tenant partner campaign.
   * @return campaign
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCampaign() {
        return campaign.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CAMPAIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCampaign_JsonNullable() {
    return campaign;
  }
  
  @JsonProperty(JSON_PROPERTY_CAMPAIGN)
  public void setCampaign_JsonNullable(JsonNullable<String> campaign) {
    this.campaign = campaign;
  }

  public void setCampaign(@javax.annotation.Nullable String campaign) {
    this.campaign = JsonNullable.<String>of(campaign);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbTenantPartner dbTenantPartner = (DbTenantPartner) o;
    return Objects.equals(this.tenantId, dbTenantPartner.tenantId) &&
        equalsNullable(this.partnerId, dbTenantPartner.partnerId) &&
        equalsNullable(this.affiliateId, dbTenantPartner.affiliateId) &&
        equalsNullable(this.campaign, dbTenantPartner.campaign);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, hashCodeNullable(partnerId), hashCodeNullable(affiliateId), hashCodeNullable(campaign));
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
    sb.append("class DbTenantPartner {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    affiliateId: ").append(toIndentedString(affiliateId)).append("\n");
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
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

    // add `partnerId` to the URL query string
    if (getPartnerId() != null) {
      try {
        joiner.add(String.format("%spartnerId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPartnerId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `affiliateId` to the URL query string
    if (getAffiliateId() != null) {
      try {
        joiner.add(String.format("%saffiliateId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAffiliateId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `campaign` to the URL query string
    if (getCampaign() != null) {
      try {
        joiner.add(String.format("%scampaign%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCampaign()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

