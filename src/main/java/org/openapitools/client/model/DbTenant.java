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
import java.util.UUID;
import org.openapitools.client.model.DbTenantPartner;
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
 * The database tenant parameters.
 */
@JsonPropertyOrder({
  DbTenant.JSON_PROPERTY_ID,
  DbTenant.JSON_PROPERTY_NAME,
  DbTenant.JSON_PROPERTY_ALIAS,
  DbTenant.JSON_PROPERTY_MAPPED_DOMAIN,
  DbTenant.JSON_PROPERTY_VERSION,
  DbTenant.JSON_PROPERTY_VERSION_CHANGED_FIELD,
  DbTenant.JSON_PROPERTY_VERSION_CHANGED,
  DbTenant.JSON_PROPERTY_LANGUAGE,
  DbTenant.JSON_PROPERTY_TIME_ZONE,
  DbTenant.JSON_PROPERTY_TRUSTED_DOMAINS_RAW,
  DbTenant.JSON_PROPERTY_TRUSTED_DOMAINS_ENABLED,
  DbTenant.JSON_PROPERTY_STATUS,
  DbTenant.JSON_PROPERTY_STATUS_CHANGED,
  DbTenant.JSON_PROPERTY_STATUS_CHANGED_HACK,
  DbTenant.JSON_PROPERTY_CREATION_DATE_TIME,
  DbTenant.JSON_PROPERTY_OWNER_ID,
  DbTenant.JSON_PROPERTY_PAYMENT_ID,
  DbTenant.JSON_PROPERTY_INDUSTRY,
  DbTenant.JSON_PROPERTY_LAST_MODIFIED,
  DbTenant.JSON_PROPERTY_CALLS,
  DbTenant.JSON_PROPERTY_PARTNER
})

public class DbTenant {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Integer id;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ALIAS = "alias";
  @javax.annotation.Nullable
  private JsonNullable<String> alias = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MAPPED_DOMAIN = "mappedDomain";
  @javax.annotation.Nullable
  private JsonNullable<String> mappedDomain = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Integer version;

  public static final String JSON_PROPERTY_VERSION_CHANGED_FIELD = "versionChangedField";
  @javax.annotation.Nullable
  private JsonNullable<OffsetDateTime> VersionChangedField = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_VERSION_CHANGED = "versionChanged";
  @javax.annotation.Nullable
  private OffsetDateTime versionChanged;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  @javax.annotation.Nullable
  private JsonNullable<String> language = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TIME_ZONE = "timeZone";
  @javax.annotation.Nullable
  private JsonNullable<String> timeZone = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TRUSTED_DOMAINS_RAW = "trustedDomainsRaw";
  @javax.annotation.Nullable
  private JsonNullable<String> trustedDomainsRaw = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TRUSTED_DOMAINS_ENABLED = "trustedDomainsEnabled";
  @javax.annotation.Nullable
  private TenantTrustedDomainsType trustedDomainsEnabled;

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nullable
  private TenantStatus status;

  public static final String JSON_PROPERTY_STATUS_CHANGED = "statusChanged";
  @javax.annotation.Nullable
  private JsonNullable<OffsetDateTime> statusChanged = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_STATUS_CHANGED_HACK = "statusChangedHack";
  @javax.annotation.Nullable
  private OffsetDateTime statusChangedHack;

  public static final String JSON_PROPERTY_CREATION_DATE_TIME = "creationDateTime";
  @javax.annotation.Nullable
  private OffsetDateTime creationDateTime;

  public static final String JSON_PROPERTY_OWNER_ID = "ownerId";
  @javax.annotation.Nullable
  private JsonNullable<UUID> ownerId = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_PAYMENT_ID = "paymentId";
  @javax.annotation.Nullable
  private JsonNullable<String> paymentId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_INDUSTRY = "industry";
  @javax.annotation.Nullable
  private TenantIndustry industry;

  public static final String JSON_PROPERTY_LAST_MODIFIED = "lastModified";
  @javax.annotation.Nullable
  private OffsetDateTime lastModified;

  public static final String JSON_PROPERTY_CALLS = "calls";
  @javax.annotation.Nullable
  private Boolean calls;

  public static final String JSON_PROPERTY_PARTNER = "partner";
  @javax.annotation.Nullable
  private DbTenantPartner partner;

  public DbTenant() {
  }


  public DbTenant id(@javax.annotation.Nullable Integer id) {
    
    this.id = id;
    return this;
  }

  /**
   * The tenant ID.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable Integer id) {
    this.id = id;
  }

  public DbTenant name(@javax.annotation.Nullable String name) {
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

  public DbTenant alias(@javax.annotation.Nullable String alias) {
    this.alias = JsonNullable.<String>of(alias);
    
    return this;
  }

  /**
   * The tenant alias.
   * @return alias
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getAlias() {
        return alias.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ALIAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAlias_JsonNullable() {
    return alias;
  }
  
  @JsonProperty(JSON_PROPERTY_ALIAS)
  public void setAlias_JsonNullable(JsonNullable<String> alias) {
    this.alias = alias;
  }

  public void setAlias(@javax.annotation.Nullable String alias) {
    this.alias = JsonNullable.<String>of(alias);
  }

  public DbTenant mappedDomain(@javax.annotation.Nullable String mappedDomain) {
    this.mappedDomain = JsonNullable.<String>of(mappedDomain);
    
    return this;
  }

  /**
   * Mapped domain
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

  public DbTenant version(@javax.annotation.Nullable Integer version) {
    
    this.version = version;
    return this;
  }

  /**
   * The tenant version.
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

  public DbTenant VersionChangedField(@javax.annotation.Nullable OffsetDateTime VersionChangedField) {
    this.VersionChangedField = JsonNullable.<OffsetDateTime>of(VersionChangedField);
    
    return this;
  }

  /**
   * The Version_changed field.
   * @return VersionChangedField
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public OffsetDateTime getVersionChangedField() {
        return VersionChangedField.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VERSION_CHANGED_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getVersionChangedField_JsonNullable() {
    return VersionChangedField;
  }
  
  @JsonProperty(JSON_PROPERTY_VERSION_CHANGED_FIELD)
  public void setVersionChangedField_JsonNullable(JsonNullable<OffsetDateTime> VersionChangedField) {
    this.VersionChangedField = VersionChangedField;
  }

  public void setVersionChangedField(@javax.annotation.Nullable OffsetDateTime VersionChangedField) {
    this.VersionChangedField = JsonNullable.<OffsetDateTime>of(VersionChangedField);
  }

  public DbTenant versionChanged(@javax.annotation.Nullable OffsetDateTime versionChanged) {
    
    this.versionChanged = versionChanged;
    return this;
  }

  /**
   * The date and time when the version was changed.
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

  public DbTenant language(@javax.annotation.Nullable String language) {
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

  public DbTenant timeZone(@javax.annotation.Nullable String timeZone) {
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

  public DbTenant trustedDomainsRaw(@javax.annotation.Nullable String trustedDomainsRaw) {
    this.trustedDomainsRaw = JsonNullable.<String>of(trustedDomainsRaw);
    
    return this;
  }

  /**
   * The tenant trusted domains raw.
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

  public DbTenant trustedDomainsEnabled(@javax.annotation.Nullable TenantTrustedDomainsType trustedDomainsEnabled) {
    
    this.trustedDomainsEnabled = trustedDomainsEnabled;
    return this;
  }

  /**
   * Get trustedDomainsEnabled
   * @return trustedDomainsEnabled
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRUSTED_DOMAINS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TenantTrustedDomainsType getTrustedDomainsEnabled() {
    return trustedDomainsEnabled;
  }


  @JsonProperty(JSON_PROPERTY_TRUSTED_DOMAINS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrustedDomainsEnabled(@javax.annotation.Nullable TenantTrustedDomainsType trustedDomainsEnabled) {
    this.trustedDomainsEnabled = trustedDomainsEnabled;
  }

  public DbTenant status(@javax.annotation.Nullable TenantStatus status) {
    
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

  public DbTenant statusChanged(@javax.annotation.Nullable OffsetDateTime statusChanged) {
    this.statusChanged = JsonNullable.<OffsetDateTime>of(statusChanged);
    
    return this;
  }

  /**
   * The date and time when the tenant status was changed.
   * @return statusChanged
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public OffsetDateTime getStatusChanged() {
        return statusChanged.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STATUS_CHANGED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getStatusChanged_JsonNullable() {
    return statusChanged;
  }
  
  @JsonProperty(JSON_PROPERTY_STATUS_CHANGED)
  public void setStatusChanged_JsonNullable(JsonNullable<OffsetDateTime> statusChanged) {
    this.statusChanged = statusChanged;
  }

  public void setStatusChanged(@javax.annotation.Nullable OffsetDateTime statusChanged) {
    this.statusChanged = JsonNullable.<OffsetDateTime>of(statusChanged);
  }

  public DbTenant statusChangedHack(@javax.annotation.Nullable OffsetDateTime statusChangedHack) {
    
    this.statusChangedHack = statusChangedHack;
    return this;
  }

  /**
   * The hacked date and time when the tenant status was changed.
   * @return statusChangedHack
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS_CHANGED_HACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStatusChangedHack() {
    return statusChangedHack;
  }


  @JsonProperty(JSON_PROPERTY_STATUS_CHANGED_HACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatusChangedHack(@javax.annotation.Nullable OffsetDateTime statusChangedHack) {
    this.statusChangedHack = statusChangedHack;
  }

  public DbTenant creationDateTime(@javax.annotation.Nullable OffsetDateTime creationDateTime) {
    
    this.creationDateTime = creationDateTime;
    return this;
  }

  /**
   * The tenant creation date.
   * @return creationDateTime
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATION_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreationDateTime() {
    return creationDateTime;
  }


  @JsonProperty(JSON_PROPERTY_CREATION_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreationDateTime(@javax.annotation.Nullable OffsetDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public DbTenant ownerId(@javax.annotation.Nullable UUID ownerId) {
    this.ownerId = JsonNullable.<UUID>of(ownerId);
    
    return this;
  }

  /**
   * The tenant owner ID.
   * @return ownerId
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public UUID getOwnerId() {
        return ownerId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OWNER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UUID> getOwnerId_JsonNullable() {
    return ownerId;
  }
  
  @JsonProperty(JSON_PROPERTY_OWNER_ID)
  public void setOwnerId_JsonNullable(JsonNullable<UUID> ownerId) {
    this.ownerId = ownerId;
  }

  public void setOwnerId(@javax.annotation.Nullable UUID ownerId) {
    this.ownerId = JsonNullable.<UUID>of(ownerId);
  }

  public DbTenant paymentId(@javax.annotation.Nullable String paymentId) {
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

  public DbTenant industry(@javax.annotation.Nullable TenantIndustry industry) {
    
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

  public DbTenant lastModified(@javax.annotation.Nullable OffsetDateTime lastModified) {
    
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

  public DbTenant calls(@javax.annotation.Nullable Boolean calls) {
    
    this.calls = calls;
    return this;
  }

  /**
   * Specifies if the calls are available for the current tenant or not.
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

  public DbTenant partner(@javax.annotation.Nullable DbTenantPartner partner) {
    
    this.partner = partner;
    return this;
  }

  /**
   * Get partner
   * @return partner
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARTNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DbTenantPartner getPartner() {
    return partner;
  }


  @JsonProperty(JSON_PROPERTY_PARTNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPartner(@javax.annotation.Nullable DbTenantPartner partner) {
    this.partner = partner;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbTenant dbTenant = (DbTenant) o;
    return Objects.equals(this.id, dbTenant.id) &&
        equalsNullable(this.name, dbTenant.name) &&
        equalsNullable(this.alias, dbTenant.alias) &&
        equalsNullable(this.mappedDomain, dbTenant.mappedDomain) &&
        Objects.equals(this.version, dbTenant.version) &&
        equalsNullable(this.VersionChangedField, dbTenant.VersionChangedField) &&
        Objects.equals(this.versionChanged, dbTenant.versionChanged) &&
        equalsNullable(this.language, dbTenant.language) &&
        equalsNullable(this.timeZone, dbTenant.timeZone) &&
        equalsNullable(this.trustedDomainsRaw, dbTenant.trustedDomainsRaw) &&
        Objects.equals(this.trustedDomainsEnabled, dbTenant.trustedDomainsEnabled) &&
        Objects.equals(this.status, dbTenant.status) &&
        equalsNullable(this.statusChanged, dbTenant.statusChanged) &&
        Objects.equals(this.statusChangedHack, dbTenant.statusChangedHack) &&
        Objects.equals(this.creationDateTime, dbTenant.creationDateTime) &&
        equalsNullable(this.ownerId, dbTenant.ownerId) &&
        equalsNullable(this.paymentId, dbTenant.paymentId) &&
        Objects.equals(this.industry, dbTenant.industry) &&
        Objects.equals(this.lastModified, dbTenant.lastModified) &&
        Objects.equals(this.calls, dbTenant.calls) &&
        Objects.equals(this.partner, dbTenant.partner);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(name), hashCodeNullable(alias), hashCodeNullable(mappedDomain), version, hashCodeNullable(VersionChangedField), versionChanged, hashCodeNullable(language), hashCodeNullable(timeZone), hashCodeNullable(trustedDomainsRaw), trustedDomainsEnabled, status, hashCodeNullable(statusChanged), statusChangedHack, creationDateTime, hashCodeNullable(ownerId), hashCodeNullable(paymentId), industry, lastModified, calls, partner);
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
    sb.append("class DbTenant {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    mappedDomain: ").append(toIndentedString(mappedDomain)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    VersionChangedField: ").append(toIndentedString(VersionChangedField)).append("\n");
    sb.append("    versionChanged: ").append(toIndentedString(versionChanged)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    trustedDomainsRaw: ").append(toIndentedString(trustedDomainsRaw)).append("\n");
    sb.append("    trustedDomainsEnabled: ").append(toIndentedString(trustedDomainsEnabled)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusChanged: ").append(toIndentedString(statusChanged)).append("\n");
    sb.append("    statusChangedHack: ").append(toIndentedString(statusChangedHack)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    calls: ").append(toIndentedString(calls)).append("\n");
    sb.append("    partner: ").append(toIndentedString(partner)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `alias` to the URL query string
    if (getAlias() != null) {
      try {
        joiner.add(String.format("%salias%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAlias()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `version` to the URL query string
    if (getVersion() != null) {
      try {
        joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `version_Changed` to the URL query string
    if (getVersionChanged() != null) {
      try {
        joiner.add(String.format("%sversion_Changed%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersionChanged()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `language` to the URL query string
    if (getLanguage() != null) {
      try {
        joiner.add(String.format("%slanguage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLanguage()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `trustedDomainsRaw` to the URL query string
    if (getTrustedDomainsRaw() != null) {
      try {
        joiner.add(String.format("%strustedDomainsRaw%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTrustedDomainsRaw()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `trustedDomainsEnabled` to the URL query string
    if (getTrustedDomainsEnabled() != null) {
      try {
        joiner.add(String.format("%strustedDomainsEnabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTrustedDomainsEnabled()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `statusChanged` to the URL query string
    if (getStatusChanged() != null) {
      try {
        joiner.add(String.format("%sstatusChanged%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatusChanged()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `statusChangedHack` to the URL query string
    if (getStatusChangedHack() != null) {
      try {
        joiner.add(String.format("%sstatusChangedHack%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatusChangedHack()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `industry` to the URL query string
    if (getIndustry() != null) {
      try {
        joiner.add(String.format("%sindustry%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIndustry()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `calls` to the URL query string
    if (getCalls() != null) {
      try {
        joiner.add(String.format("%scalls%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCalls()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `partner` to the URL query string
    if (getPartner() != null) {
      joiner.add(getPartner().toUrlQueryString(prefix + "partner" + suffix));
    }

    return joiner.toString();
  }

}

