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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.client.model.TenantIndustry;
import org.openapitools.client.model.TenantStatus;
import org.openapitools.client.model.TenantTrustedDomainsType;
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
 * The tenant parameters.
 */
@JsonPropertyOrder({
  TenantDto.JSON_PROPERTY_AFFILIATE_ID,
  TenantDto.JSON_PROPERTY_TENANT_ALIAS,
  TenantDto.JSON_PROPERTY_CALLS,
  TenantDto.JSON_PROPERTY_CAMPAIGN,
  TenantDto.JSON_PROPERTY_CREATION_DATE_TIME,
  TenantDto.JSON_PROPERTY_HOSTED_REGION,
  TenantDto.JSON_PROPERTY_TENANT_ID,
  TenantDto.JSON_PROPERTY_INDUSTRY,
  TenantDto.JSON_PROPERTY_LANGUAGE,
  TenantDto.JSON_PROPERTY_LAST_MODIFIED,
  TenantDto.JSON_PROPERTY_MAPPED_DOMAIN,
  TenantDto.JSON_PROPERTY_NAME,
  TenantDto.JSON_PROPERTY_OWNER_ID,
  TenantDto.JSON_PROPERTY_PAYMENT_ID,
  TenantDto.JSON_PROPERTY_SPAM,
  TenantDto.JSON_PROPERTY_STATUS,
  TenantDto.JSON_PROPERTY_STATUS_CHANGE_DATE,
  TenantDto.JSON_PROPERTY_TIME_ZONE,
  TenantDto.JSON_PROPERTY_TRUSTED_DOMAINS,
  TenantDto.JSON_PROPERTY_TRUSTED_DOMAINS_RAW,
  TenantDto.JSON_PROPERTY_TRUSTED_DOMAINS_TYPE,
  TenantDto.JSON_PROPERTY_VERSION,
  TenantDto.JSON_PROPERTY_VERSION_CHANGED,
  TenantDto.JSON_PROPERTY_REGION
})

public class TenantDto {
  public static final String JSON_PROPERTY_AFFILIATE_ID = "affiliateId";
  @javax.annotation.Nullable
  private JsonNullable<String> affiliateId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TENANT_ALIAS = "tenantAlias";
  @javax.annotation.Nullable
  private JsonNullable<String> tenantAlias = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CALLS = "calls";
  @javax.annotation.Nullable
  private Boolean calls;

  public static final String JSON_PROPERTY_CAMPAIGN = "campaign";
  @javax.annotation.Nullable
  private JsonNullable<String> campaign = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CREATION_DATE_TIME = "creationDateTime";
  @javax.annotation.Nullable
  private OffsetDateTime creationDateTime;

  public static final String JSON_PROPERTY_HOSTED_REGION = "hostedRegion";
  @javax.annotation.Nullable
  private JsonNullable<String> hostedRegion = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @javax.annotation.Nullable
  private Integer tenantId;

  public static final String JSON_PROPERTY_INDUSTRY = "industry";
  @javax.annotation.Nullable
  private TenantIndustry industry;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  @javax.annotation.Nullable
  private JsonNullable<String> language = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LAST_MODIFIED = "lastModified";
  @javax.annotation.Nullable
  private OffsetDateTime lastModified;

  public static final String JSON_PROPERTY_MAPPED_DOMAIN = "mappedDomain";
  @javax.annotation.Nullable
  private JsonNullable<String> mappedDomain = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_OWNER_ID = "ownerId";
  @javax.annotation.Nullable
  private UUID ownerId;

  public static final String JSON_PROPERTY_PAYMENT_ID = "paymentId";
  @javax.annotation.Nullable
  private JsonNullable<String> paymentId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SPAM = "spam";
  @javax.annotation.Nullable
  private Boolean spam;

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nullable
  private TenantStatus status;

  public static final String JSON_PROPERTY_STATUS_CHANGE_DATE = "statusChangeDate";
  @javax.annotation.Nullable
  private OffsetDateTime statusChangeDate;

  public static final String JSON_PROPERTY_TIME_ZONE = "timeZone";
  @javax.annotation.Nullable
  private JsonNullable<String> timeZone = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TRUSTED_DOMAINS = "trustedDomains";
  @javax.annotation.Nullable
  private JsonNullable<List<String>> trustedDomains = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_TRUSTED_DOMAINS_RAW = "trustedDomainsRaw";
  @javax.annotation.Nullable
  private JsonNullable<String> trustedDomainsRaw = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TRUSTED_DOMAINS_TYPE = "trustedDomainsType";
  @javax.annotation.Nullable
  private TenantTrustedDomainsType trustedDomainsType;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Integer version;

  public static final String JSON_PROPERTY_VERSION_CHANGED = "versionChanged";
  @javax.annotation.Nullable
  private OffsetDateTime versionChanged;

  public static final String JSON_PROPERTY_REGION = "region";
  @javax.annotation.Nullable
  private JsonNullable<String> region = JsonNullable.<String>undefined();

  public TenantDto() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public TenantDto(
    @JsonProperty(JSON_PROPERTY_CREATION_DATE_TIME) OffsetDateTime creationDateTime, 
    @JsonProperty(JSON_PROPERTY_TENANT_ID) Integer tenantId, 
    @JsonProperty(JSON_PROPERTY_STATUS_CHANGE_DATE) OffsetDateTime statusChangeDate
  ) {
    this();
    this.creationDateTime = creationDateTime;
    this.tenantId = tenantId;
    this.statusChangeDate = statusChangeDate;
  }


  public TenantDto affiliateId(@javax.annotation.Nullable String affiliateId) {
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

  public TenantDto tenantAlias(@javax.annotation.Nullable String tenantAlias) {
    this.tenantAlias = JsonNullable.<String>of(tenantAlias);
    
    return this;
  }

  /**
   * The tenant alias.
   * @return tenantAlias
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getTenantAlias() {
        return tenantAlias.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TENANT_ALIAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTenantAlias_JsonNullable() {
    return tenantAlias;
  }
  
  @JsonProperty(JSON_PROPERTY_TENANT_ALIAS)
  public void setTenantAlias_JsonNullable(JsonNullable<String> tenantAlias) {
    this.tenantAlias = tenantAlias;
  }

  public void setTenantAlias(@javax.annotation.Nullable String tenantAlias) {
    this.tenantAlias = JsonNullable.<String>of(tenantAlias);
  }

  public TenantDto calls(@javax.annotation.Nullable Boolean calls) {
    
    this.calls = calls;
    return this;
  }

  /**
   * Specifies if the calls are available for this tenant or not.
   * @return calls
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CALLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCalls() {
    return calls;
  }


  @JsonProperty(JSON_PROPERTY_CALLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCalls(@javax.annotation.Nullable Boolean calls) {
    this.calls = calls;
  }

  public TenantDto campaign(@javax.annotation.Nullable String campaign) {
    this.campaign = JsonNullable.<String>of(campaign);
    
    return this;
  }

  /**
   * The tenant campaign.
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

  /**
   * The tenant creation date and time.
   * @return creationDateTime
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATION_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreationDateTime() {
    return creationDateTime;
  }



  public TenantDto hostedRegion(@javax.annotation.Nullable String hostedRegion) {
    this.hostedRegion = JsonNullable.<String>of(hostedRegion);
    
    return this;
  }

  /**
   * The hosted region.
   * @return hostedRegion
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getHostedRegion() {
        return hostedRegion.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HOSTED_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getHostedRegion_JsonNullable() {
    return hostedRegion;
  }
  
  @JsonProperty(JSON_PROPERTY_HOSTED_REGION)
  public void setHostedRegion_JsonNullable(JsonNullable<String> hostedRegion) {
    this.hostedRegion = hostedRegion;
  }

  public void setHostedRegion(@javax.annotation.Nullable String hostedRegion) {
    this.hostedRegion = JsonNullable.<String>of(hostedRegion);
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



  public TenantDto industry(@javax.annotation.Nullable TenantIndustry industry) {
    
    this.industry = industry;
    return this;
  }

  /**
   * Get industry
   * @return industry
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDUSTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TenantIndustry getIndustry() {
    return industry;
  }


  @JsonProperty(JSON_PROPERTY_INDUSTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndustry(@javax.annotation.Nullable TenantIndustry industry) {
    this.industry = industry;
  }

  public TenantDto language(@javax.annotation.Nullable String language) {
    this.language = JsonNullable.<String>of(language);
    
    return this;
  }

  /**
   * The tenant language.
   * @return language
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getLanguage() {
        return language.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLanguage_JsonNullable() {
    return language;
  }
  
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  public void setLanguage_JsonNullable(JsonNullable<String> language) {
    this.language = language;
  }

  public void setLanguage(@javax.annotation.Nullable String language) {
    this.language = JsonNullable.<String>of(language);
  }

  public TenantDto lastModified(@javax.annotation.Nullable OffsetDateTime lastModified) {
    
    this.lastModified = lastModified;
    return this;
  }

  /**
   * The date and time when the tenant was last modified.
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

  public TenantDto mappedDomain(@javax.annotation.Nullable String mappedDomain) {
    this.mappedDomain = JsonNullable.<String>of(mappedDomain);
    
    return this;
  }

  /**
   * The tenant mapped domain.
   * @return mappedDomain
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getMappedDomain() {
        return mappedDomain.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MAPPED_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMappedDomain_JsonNullable() {
    return mappedDomain;
  }
  
  @JsonProperty(JSON_PROPERTY_MAPPED_DOMAIN)
  public void setMappedDomain_JsonNullable(JsonNullable<String> mappedDomain) {
    this.mappedDomain = mappedDomain;
  }

  public void setMappedDomain(@javax.annotation.Nullable String mappedDomain) {
    this.mappedDomain = JsonNullable.<String>of(mappedDomain);
  }

  public TenantDto name(@javax.annotation.Nullable String name) {
    this.name = JsonNullable.<String>of(name);
    
    return this;
  }

  /**
   * The tenant name.
   * @return name
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = JsonNullable.<String>of(name);
  }

  public TenantDto ownerId(@javax.annotation.Nullable UUID ownerId) {
    
    this.ownerId = ownerId;
    return this;
  }

  /**
   * The tenant owner ID.
   * @return ownerId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OWNER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getOwnerId() {
    return ownerId;
  }


  @JsonProperty(JSON_PROPERTY_OWNER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOwnerId(@javax.annotation.Nullable UUID ownerId) {
    this.ownerId = ownerId;
  }

  public TenantDto paymentId(@javax.annotation.Nullable String paymentId) {
    this.paymentId = JsonNullable.<String>of(paymentId);
    
    return this;
  }

  /**
   * The tenant payment ID.
   * @return paymentId
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPaymentId() {
        return paymentId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPaymentId_JsonNullable() {
    return paymentId;
  }
  
  @JsonProperty(JSON_PROPERTY_PAYMENT_ID)
  public void setPaymentId_JsonNullable(JsonNullable<String> paymentId) {
    this.paymentId = paymentId;
  }

  public void setPaymentId(@javax.annotation.Nullable String paymentId) {
    this.paymentId = JsonNullable.<String>of(paymentId);
  }

  public TenantDto spam(@javax.annotation.Nullable Boolean spam) {
    
    this.spam = spam;
    return this;
  }

  /**
   * Specifies if the ONLYOFFICE newsletter is allowed or not.
   * @return spam
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSpam() {
    return spam;
  }


  @JsonProperty(JSON_PROPERTY_SPAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpam(@javax.annotation.Nullable Boolean spam) {
    this.spam = spam;
  }

  public TenantDto status(@javax.annotation.Nullable TenantStatus status) {
    
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TenantStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(@javax.annotation.Nullable TenantStatus status) {
    this.status = status;
  }

  /**
   * The date and time when the tenant status was changed.
   * @return statusChangeDate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS_CHANGE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStatusChangeDate() {
    return statusChangeDate;
  }



  public TenantDto timeZone(@javax.annotation.Nullable String timeZone) {
    this.timeZone = JsonNullable.<String>of(timeZone);
    
    return this;
  }

  /**
   * The tenant time zone.
   * @return timeZone
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getTimeZone() {
        return timeZone.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTimeZone_JsonNullable() {
    return timeZone;
  }
  
  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  public void setTimeZone_JsonNullable(JsonNullable<String> timeZone) {
    this.timeZone = timeZone;
  }

  public void setTimeZone(@javax.annotation.Nullable String timeZone) {
    this.timeZone = JsonNullable.<String>of(timeZone);
  }

  public TenantDto trustedDomains(@javax.annotation.Nullable List<String> trustedDomains) {
    this.trustedDomains = JsonNullable.<List<String>>of(trustedDomains);
    
    return this;
  }

  public TenantDto addTrustedDomainsItem(String trustedDomainsItem) {
    if (this.trustedDomains == null || !this.trustedDomains.isPresent()) {
      this.trustedDomains = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.trustedDomains.get().add(trustedDomainsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of tenant trusted domains.
   * @return trustedDomains
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<String> getTrustedDomains() {
        return trustedDomains.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TRUSTED_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getTrustedDomains_JsonNullable() {
    return trustedDomains;
  }
  
  @JsonProperty(JSON_PROPERTY_TRUSTED_DOMAINS)
  public void setTrustedDomains_JsonNullable(JsonNullable<List<String>> trustedDomains) {
    this.trustedDomains = trustedDomains;
  }

  public void setTrustedDomains(@javax.annotation.Nullable List<String> trustedDomains) {
    this.trustedDomains = JsonNullable.<List<String>>of(trustedDomains);
  }

  public TenantDto trustedDomainsRaw(@javax.annotation.Nullable String trustedDomainsRaw) {
    this.trustedDomainsRaw = JsonNullable.<String>of(trustedDomainsRaw);
    
    return this;
  }

  /**
   * The tenant trusted domains in the string format.
   * @return trustedDomainsRaw
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getTrustedDomainsRaw() {
        return trustedDomainsRaw.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TRUSTED_DOMAINS_RAW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTrustedDomainsRaw_JsonNullable() {
    return trustedDomainsRaw;
  }
  
  @JsonProperty(JSON_PROPERTY_TRUSTED_DOMAINS_RAW)
  public void setTrustedDomainsRaw_JsonNullable(JsonNullable<String> trustedDomainsRaw) {
    this.trustedDomainsRaw = trustedDomainsRaw;
  }

  public void setTrustedDomainsRaw(@javax.annotation.Nullable String trustedDomainsRaw) {
    this.trustedDomainsRaw = JsonNullable.<String>of(trustedDomainsRaw);
  }

  public TenantDto trustedDomainsType(@javax.annotation.Nullable TenantTrustedDomainsType trustedDomainsType) {
    
    this.trustedDomainsType = trustedDomainsType;
    return this;
  }

  /**
   * Get trustedDomainsType
   * @return trustedDomainsType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRUSTED_DOMAINS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TenantTrustedDomainsType getTrustedDomainsType() {
    return trustedDomainsType;
  }


  @JsonProperty(JSON_PROPERTY_TRUSTED_DOMAINS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrustedDomainsType(@javax.annotation.Nullable TenantTrustedDomainsType trustedDomainsType) {
    this.trustedDomainsType = trustedDomainsType;
  }

  public TenantDto version(@javax.annotation.Nullable Integer version) {
    
    this.version = version;
    return this;
  }

  /**
   * The tenant version
   * @return version
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(@javax.annotation.Nullable Integer version) {
    this.version = version;
  }

  public TenantDto versionChanged(@javax.annotation.Nullable OffsetDateTime versionChanged) {
    
    this.versionChanged = versionChanged;
    return this;
  }

  /**
   * The date and time when the tenant version was changed.
   * @return versionChanged
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION_CHANGED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getVersionChanged() {
    return versionChanged;
  }


  @JsonProperty(JSON_PROPERTY_VERSION_CHANGED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersionChanged(@javax.annotation.Nullable OffsetDateTime versionChanged) {
    this.versionChanged = versionChanged;
  }

  public TenantDto region(@javax.annotation.Nullable String region) {
    this.region = JsonNullable.<String>of(region);
    
    return this;
  }

  /**
   * The tenant AWS region.
   * @return region
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getRegion() {
        return region.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getRegion_JsonNullable() {
    return region;
  }
  
  @JsonProperty(JSON_PROPERTY_REGION)
  public void setRegion_JsonNullable(JsonNullable<String> region) {
    this.region = region;
  }

  public void setRegion(@javax.annotation.Nullable String region) {
    this.region = JsonNullable.<String>of(region);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantDto tenantDto = (TenantDto) o;
    return equalsNullable(this.affiliateId, tenantDto.affiliateId) &&
        equalsNullable(this.tenantAlias, tenantDto.tenantAlias) &&
        Objects.equals(this.calls, tenantDto.calls) &&
        equalsNullable(this.campaign, tenantDto.campaign) &&
        Objects.equals(this.creationDateTime, tenantDto.creationDateTime) &&
        equalsNullable(this.hostedRegion, tenantDto.hostedRegion) &&
        Objects.equals(this.tenantId, tenantDto.tenantId) &&
        Objects.equals(this.industry, tenantDto.industry) &&
        equalsNullable(this.language, tenantDto.language) &&
        Objects.equals(this.lastModified, tenantDto.lastModified) &&
        equalsNullable(this.mappedDomain, tenantDto.mappedDomain) &&
        equalsNullable(this.name, tenantDto.name) &&
        Objects.equals(this.ownerId, tenantDto.ownerId) &&
        equalsNullable(this.paymentId, tenantDto.paymentId) &&
        Objects.equals(this.spam, tenantDto.spam) &&
        Objects.equals(this.status, tenantDto.status) &&
        Objects.equals(this.statusChangeDate, tenantDto.statusChangeDate) &&
        equalsNullable(this.timeZone, tenantDto.timeZone) &&
        equalsNullable(this.trustedDomains, tenantDto.trustedDomains) &&
        equalsNullable(this.trustedDomainsRaw, tenantDto.trustedDomainsRaw) &&
        Objects.equals(this.trustedDomainsType, tenantDto.trustedDomainsType) &&
        Objects.equals(this.version, tenantDto.version) &&
        Objects.equals(this.versionChanged, tenantDto.versionChanged) &&
        equalsNullable(this.region, tenantDto.region);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(affiliateId), hashCodeNullable(tenantAlias), calls, hashCodeNullable(campaign), creationDateTime, hashCodeNullable(hostedRegion), tenantId, industry, hashCodeNullable(language), lastModified, hashCodeNullable(mappedDomain), hashCodeNullable(name), ownerId, hashCodeNullable(paymentId), spam, status, statusChangeDate, hashCodeNullable(timeZone), hashCodeNullable(trustedDomains), hashCodeNullable(trustedDomainsRaw), trustedDomainsType, version, versionChanged, hashCodeNullable(region));
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
    sb.append("class TenantDto {\n");
    sb.append("    affiliateId: ").append(toIndentedString(affiliateId)).append("\n");
    sb.append("    tenantAlias: ").append(toIndentedString(tenantAlias)).append("\n");
    sb.append("    calls: ").append(toIndentedString(calls)).append("\n");
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    hostedRegion: ").append(toIndentedString(hostedRegion)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    mappedDomain: ").append(toIndentedString(mappedDomain)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    spam: ").append(toIndentedString(spam)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusChangeDate: ").append(toIndentedString(statusChangeDate)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    trustedDomains: ").append(toIndentedString(trustedDomains)).append("\n");
    sb.append("    trustedDomainsRaw: ").append(toIndentedString(trustedDomainsRaw)).append("\n");
    sb.append("    trustedDomainsType: ").append(toIndentedString(trustedDomainsType)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    versionChanged: ").append(toIndentedString(versionChanged)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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

    // add `affiliateId` to the URL query string
    if (getAffiliateId() != null) {
      try {
        joiner.add(String.format("%saffiliateId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAffiliateId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `tenantAlias` to the URL query string
    if (getTenantAlias() != null) {
      try {
        joiner.add(String.format("%stenantAlias%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTenantAlias()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `calls` to the URL query string
    if (getCalls() != null) {
      try {
        joiner.add(String.format("%scalls%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCalls()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `creationDateTime` to the URL query string
    if (getCreationDateTime() != null) {
      try {
        joiner.add(String.format("%screationDateTime%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreationDateTime()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `hostedRegion` to the URL query string
    if (getHostedRegion() != null) {
      try {
        joiner.add(String.format("%shostedRegion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHostedRegion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `tenantId` to the URL query string
    if (getTenantId() != null) {
      try {
        joiner.add(String.format("%stenantId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTenantId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `industry` to the URL query string
    if (getIndustry() != null) {
      try {
        joiner.add(String.format("%sindustry%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIndustry()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `language` to the URL query string
    if (getLanguage() != null) {
      try {
        joiner.add(String.format("%slanguage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLanguage()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `mappedDomain` to the URL query string
    if (getMappedDomain() != null) {
      try {
        joiner.add(String.format("%smappedDomain%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMappedDomain()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `ownerId` to the URL query string
    if (getOwnerId() != null) {
      try {
        joiner.add(String.format("%sownerId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOwnerId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `paymentId` to the URL query string
    if (getPaymentId() != null) {
      try {
        joiner.add(String.format("%spaymentId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPaymentId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `spam` to the URL query string
    if (getSpam() != null) {
      try {
        joiner.add(String.format("%sspam%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSpam()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
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

    // add `statusChangeDate` to the URL query string
    if (getStatusChangeDate() != null) {
      try {
        joiner.add(String.format("%sstatusChangeDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatusChangeDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `timeZone` to the URL query string
    if (getTimeZone() != null) {
      try {
        joiner.add(String.format("%stimeZone%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTimeZone()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `trustedDomains` to the URL query string
    if (getTrustedDomains() != null) {
      for (int i = 0; i < getTrustedDomains().size(); i++) {
        try {
          joiner.add(String.format("%strustedDomains%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getTrustedDomains().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `trustedDomainsRaw` to the URL query string
    if (getTrustedDomainsRaw() != null) {
      try {
        joiner.add(String.format("%strustedDomainsRaw%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTrustedDomainsRaw()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `trustedDomainsType` to the URL query string
    if (getTrustedDomainsType() != null) {
      try {
        joiner.add(String.format("%strustedDomainsType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTrustedDomainsType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      try {
        joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `versionChanged` to the URL query string
    if (getVersionChanged() != null) {
      try {
        joiner.add(String.format("%sversionChanged%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersionChanged()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `region` to the URL query string
    if (getRegion() != null) {
      try {
        joiner.add(String.format("%sregion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRegion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

