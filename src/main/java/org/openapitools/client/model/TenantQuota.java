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
 * The current tenant quota.
 */
@JsonPropertyOrder({
  TenantQuota.JSON_PROPERTY_TENANT_ID,
  TenantQuota.JSON_PROPERTY_NAME,
  TenantQuota.JSON_PROPERTY_PRICE,
  TenantQuota.JSON_PROPERTY_PRICE_CURRENCY_SYMBOL,
  TenantQuota.JSON_PROPERTY_PRICE_I_S_O_CURRENCY_SYMBOL,
  TenantQuota.JSON_PROPERTY_PRODUCT_ID,
  TenantQuota.JSON_PROPERTY_SERVICE_NAME,
  TenantQuota.JSON_PROPERTY_VISIBLE,
  TenantQuota.JSON_PROPERTY_WALLET,
  TenantQuota.JSON_PROPERTY_DUE_DATE,
  TenantQuota.JSON_PROPERTY_FEATURES,
  TenantQuota.JSON_PROPERTY_MAX_FILE_SIZE,
  TenantQuota.JSON_PROPERTY_MAX_TOTAL_SIZE,
  TenantQuota.JSON_PROPERTY_COUNT_USER,
  TenantQuota.JSON_PROPERTY_COUNT_ROOM_ADMIN,
  TenantQuota.JSON_PROPERTY_USERS_IN_ROOM,
  TenantQuota.JSON_PROPERTY_COUNT_ROOM,
  TenantQuota.JSON_PROPERTY_NON_PROFIT,
  TenantQuota.JSON_PROPERTY_TRIAL,
  TenantQuota.JSON_PROPERTY_FREE,
  TenantQuota.JSON_PROPERTY_UPDATE,
  TenantQuota.JSON_PROPERTY_AUDIT,
  TenantQuota.JSON_PROPERTY_DOCS_EDITION,
  TenantQuota.JSON_PROPERTY_LDAP,
  TenantQuota.JSON_PROPERTY_SSO,
  TenantQuota.JSON_PROPERTY_STATISTIC,
  TenantQuota.JSON_PROPERTY_BRANDING,
  TenantQuota.JSON_PROPERTY_CUSTOMIZATION,
  TenantQuota.JSON_PROPERTY_LIFETIME,
  TenantQuota.JSON_PROPERTY_CUSTOM,
  TenantQuota.JSON_PROPERTY_RESTORE,
  TenantQuota.JSON_PROPERTY_OAUTH,
  TenantQuota.JSON_PROPERTY_CONTENT_SEARCH,
  TenantQuota.JSON_PROPERTY_THIRD_PARTY,
  TenantQuota.JSON_PROPERTY_YEAR,
  TenantQuota.JSON_PROPERTY_COUNT_FREE_BACKUP,
  TenantQuota.JSON_PROPERTY_BACKUP,
  TenantQuota.JSON_PROPERTY_COUNT_A_I_AGENT
})

public class TenantQuota {
  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @javax.annotation.Nullable
  private Integer tenantId;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PRICE = "price";
  @javax.annotation.Nullable
  private Double price;

  public static final String JSON_PROPERTY_PRICE_CURRENCY_SYMBOL = "priceCurrencySymbol";
  @javax.annotation.Nullable
  private JsonNullable<String> priceCurrencySymbol = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PRICE_I_S_O_CURRENCY_SYMBOL = "priceISOCurrencySymbol";
  @javax.annotation.Nullable
  private JsonNullable<String> priceISOCurrencySymbol = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PRODUCT_ID = "productId";
  @javax.annotation.Nullable
  private JsonNullable<String> productId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SERVICE_NAME = "serviceName";
  @javax.annotation.Nullable
  private JsonNullable<String> serviceName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_VISIBLE = "visible";
  @javax.annotation.Nullable
  private Boolean visible;

  public static final String JSON_PROPERTY_WALLET = "wallet";
  @javax.annotation.Nullable
  private Boolean wallet;

  public static final String JSON_PROPERTY_DUE_DATE = "dueDate";
  @javax.annotation.Nullable
  private JsonNullable<OffsetDateTime> dueDate = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_FEATURES = "features";
  @javax.annotation.Nullable
  private JsonNullable<String> features = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MAX_FILE_SIZE = "maxFileSize";
  @javax.annotation.Nullable
  private Long maxFileSize;

  public static final String JSON_PROPERTY_MAX_TOTAL_SIZE = "maxTotalSize";
  @javax.annotation.Nullable
  private Long maxTotalSize;

  public static final String JSON_PROPERTY_COUNT_USER = "countUser";
  @javax.annotation.Nullable
  private Integer countUser;

  public static final String JSON_PROPERTY_COUNT_ROOM_ADMIN = "countRoomAdmin";
  @javax.annotation.Nullable
  private Integer countRoomAdmin;

  public static final String JSON_PROPERTY_USERS_IN_ROOM = "usersInRoom";
  @javax.annotation.Nullable
  private Integer usersInRoom;

  public static final String JSON_PROPERTY_COUNT_ROOM = "countRoom";
  @javax.annotation.Nullable
  private Integer countRoom;

  public static final String JSON_PROPERTY_NON_PROFIT = "nonProfit";
  @javax.annotation.Nullable
  private Boolean nonProfit;

  public static final String JSON_PROPERTY_TRIAL = "trial";
  @javax.annotation.Nullable
  private Boolean trial;

  public static final String JSON_PROPERTY_FREE = "free";
  @javax.annotation.Nullable
  private Boolean free;

  public static final String JSON_PROPERTY_UPDATE = "update";
  @javax.annotation.Nullable
  private Boolean update;

  public static final String JSON_PROPERTY_AUDIT = "audit";
  @javax.annotation.Nullable
  private Boolean audit;

  public static final String JSON_PROPERTY_DOCS_EDITION = "docsEdition";
  @javax.annotation.Nullable
  private Boolean docsEdition;

  public static final String JSON_PROPERTY_LDAP = "ldap";
  @javax.annotation.Nullable
  private Boolean ldap;

  public static final String JSON_PROPERTY_SSO = "sso";
  @javax.annotation.Nullable
  private Boolean sso;

  public static final String JSON_PROPERTY_STATISTIC = "statistic";
  @javax.annotation.Nullable
  private Boolean statistic;

  public static final String JSON_PROPERTY_BRANDING = "branding";
  @javax.annotation.Nullable
  private Boolean branding;

  public static final String JSON_PROPERTY_CUSTOMIZATION = "customization";
  @javax.annotation.Nullable
  private Boolean customization;

  public static final String JSON_PROPERTY_LIFETIME = "lifetime";
  @javax.annotation.Nullable
  private Boolean lifetime;

  public static final String JSON_PROPERTY_CUSTOM = "custom";
  @javax.annotation.Nullable
  private Boolean custom;

  public static final String JSON_PROPERTY_RESTORE = "restore";
  @javax.annotation.Nullable
  private Boolean restore;

  public static final String JSON_PROPERTY_OAUTH = "oauth";
  @javax.annotation.Nullable
  private Boolean oauth;

  public static final String JSON_PROPERTY_CONTENT_SEARCH = "contentSearch";
  @javax.annotation.Nullable
  private Boolean contentSearch;

  public static final String JSON_PROPERTY_THIRD_PARTY = "thirdParty";
  @javax.annotation.Nullable
  private Boolean thirdParty;

  public static final String JSON_PROPERTY_YEAR = "year";
  @javax.annotation.Nullable
  private Boolean year;

  public static final String JSON_PROPERTY_COUNT_FREE_BACKUP = "countFreeBackup";
  @javax.annotation.Nullable
  private Integer countFreeBackup;

  public static final String JSON_PROPERTY_BACKUP = "backup";
  @javax.annotation.Nullable
  private Boolean backup;

  public static final String JSON_PROPERTY_COUNT_A_I_AGENT = "countAIAgent";
  @javax.annotation.Nullable
  private Integer countAIAgent;

  public TenantQuota() {
  }

  public TenantQuota tenantId(@javax.annotation.Nullable Integer tenantId) {
    
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

  public TenantQuota name(@javax.annotation.Nullable String name) {
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

  public TenantQuota price(@javax.annotation.Nullable Double price) {
    
    this.price = price;
    return this;
  }

  /**
   * The tenant price.
   * @return price
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getPrice() {
    return price;
  }


  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrice(@javax.annotation.Nullable Double price) {
    this.price = price;
  }

  public TenantQuota priceCurrencySymbol(@javax.annotation.Nullable String priceCurrencySymbol) {
    this.priceCurrencySymbol = JsonNullable.<String>of(priceCurrencySymbol);
    
    return this;
  }

  /**
   * The tenant price currency symbol.
   * @return priceCurrencySymbol
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPriceCurrencySymbol() {
        return priceCurrencySymbol.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRICE_CURRENCY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPriceCurrencySymbol_JsonNullable() {
    return priceCurrencySymbol;
  }
  
  @JsonProperty(JSON_PROPERTY_PRICE_CURRENCY_SYMBOL)
  public void setPriceCurrencySymbol_JsonNullable(JsonNullable<String> priceCurrencySymbol) {
    this.priceCurrencySymbol = priceCurrencySymbol;
  }

  public void setPriceCurrencySymbol(@javax.annotation.Nullable String priceCurrencySymbol) {
    this.priceCurrencySymbol = JsonNullable.<String>of(priceCurrencySymbol);
  }

  public TenantQuota priceISOCurrencySymbol(@javax.annotation.Nullable String priceISOCurrencySymbol) {
    this.priceISOCurrencySymbol = JsonNullable.<String>of(priceISOCurrencySymbol);
    
    return this;
  }

  /**
   * The tenant price three-character ISO 4217 currency symbol.
   * @return priceISOCurrencySymbol
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPriceISOCurrencySymbol() {
        return priceISOCurrencySymbol.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRICE_I_S_O_CURRENCY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPriceISOCurrencySymbol_JsonNullable() {
    return priceISOCurrencySymbol;
  }
  
  @JsonProperty(JSON_PROPERTY_PRICE_I_S_O_CURRENCY_SYMBOL)
  public void setPriceISOCurrencySymbol_JsonNullable(JsonNullable<String> priceISOCurrencySymbol) {
    this.priceISOCurrencySymbol = priceISOCurrencySymbol;
  }

  public void setPriceISOCurrencySymbol(@javax.annotation.Nullable String priceISOCurrencySymbol) {
    this.priceISOCurrencySymbol = JsonNullable.<String>of(priceISOCurrencySymbol);
  }

  public TenantQuota productId(@javax.annotation.Nullable String productId) {
    this.productId = JsonNullable.<String>of(productId);
    
    return this;
  }

  /**
   * The tenant product ID.
   * @return productId
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getProductId() {
        return productId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getProductId_JsonNullable() {
    return productId;
  }
  
  @JsonProperty(JSON_PROPERTY_PRODUCT_ID)
  public void setProductId_JsonNullable(JsonNullable<String> productId) {
    this.productId = productId;
  }

  public void setProductId(@javax.annotation.Nullable String productId) {
    this.productId = JsonNullable.<String>of(productId);
  }

  public TenantQuota serviceName(@javax.annotation.Nullable String serviceName) {
    this.serviceName = JsonNullable.<String>of(serviceName);
    
    return this;
  }

  /**
   * The service name.
   * @return serviceName
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getServiceName() {
        return serviceName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SERVICE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getServiceName_JsonNullable() {
    return serviceName;
  }
  
  @JsonProperty(JSON_PROPERTY_SERVICE_NAME)
  public void setServiceName_JsonNullable(JsonNullable<String> serviceName) {
    this.serviceName = serviceName;
  }

  public void setServiceName(@javax.annotation.Nullable String serviceName) {
    this.serviceName = JsonNullable.<String>of(serviceName);
  }

  public TenantQuota visible(@javax.annotation.Nullable Boolean visible) {
    
    this.visible = visible;
    return this;
  }

  /**
   * Specifies if the tenant quota is visible or not.
   * @return visible
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VISIBLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getVisible() {
    return visible;
  }


  @JsonProperty(JSON_PROPERTY_VISIBLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisible(@javax.annotation.Nullable Boolean visible) {
    this.visible = visible;
  }

  public TenantQuota wallet(@javax.annotation.Nullable Boolean wallet) {
    
    this.wallet = wallet;
    return this;
  }

  /**
   * Specifies if the tenant quota applies to the wallet or not
   * @return wallet
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WALLET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getWallet() {
    return wallet;
  }


  @JsonProperty(JSON_PROPERTY_WALLET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWallet(@javax.annotation.Nullable Boolean wallet) {
    this.wallet = wallet;
  }

  public TenantQuota dueDate(@javax.annotation.Nullable OffsetDateTime dueDate) {
    this.dueDate = JsonNullable.<OffsetDateTime>of(dueDate);
    
    return this;
  }

  /**
   * The quota due date.
   * @return dueDate
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public OffsetDateTime getDueDate() {
        return dueDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DUE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getDueDate_JsonNullable() {
    return dueDate;
  }
  
  @JsonProperty(JSON_PROPERTY_DUE_DATE)
  public void setDueDate_JsonNullable(JsonNullable<OffsetDateTime> dueDate) {
    this.dueDate = dueDate;
  }

  public void setDueDate(@javax.annotation.Nullable OffsetDateTime dueDate) {
    this.dueDate = JsonNullable.<OffsetDateTime>of(dueDate);
  }

  public TenantQuota features(@javax.annotation.Nullable String features) {
    this.features = JsonNullable.<String>of(features);
    
    return this;
  }

  /**
   * The tenant quota features.
   * @return features
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getFeatures() {
        return features.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FEATURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFeatures_JsonNullable() {
    return features;
  }
  
  @JsonProperty(JSON_PROPERTY_FEATURES)
  public void setFeatures_JsonNullable(JsonNullable<String> features) {
    this.features = features;
  }

  public void setFeatures(@javax.annotation.Nullable String features) {
    this.features = JsonNullable.<String>of(features);
  }

  public TenantQuota maxFileSize(@javax.annotation.Nullable Long maxFileSize) {
    
    this.maxFileSize = maxFileSize;
    return this;
  }

  /**
   * The tenant maximum file size.
   * @return maxFileSize
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_FILE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMaxFileSize() {
    return maxFileSize;
  }


  @JsonProperty(JSON_PROPERTY_MAX_FILE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxFileSize(@javax.annotation.Nullable Long maxFileSize) {
    this.maxFileSize = maxFileSize;
  }

  public TenantQuota maxTotalSize(@javax.annotation.Nullable Long maxTotalSize) {
    
    this.maxTotalSize = maxTotalSize;
    return this;
  }

  /**
   * The tenant maximum total size.
   * @return maxTotalSize
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_TOTAL_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMaxTotalSize() {
    return maxTotalSize;
  }


  @JsonProperty(JSON_PROPERTY_MAX_TOTAL_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxTotalSize(@javax.annotation.Nullable Long maxTotalSize) {
    this.maxTotalSize = maxTotalSize;
  }

  public TenantQuota countUser(@javax.annotation.Nullable Integer countUser) {
    
    this.countUser = countUser;
    return this;
  }

  /**
   * The number of portal users.
   * @return countUser
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNT_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCountUser() {
    return countUser;
  }


  @JsonProperty(JSON_PROPERTY_COUNT_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountUser(@javax.annotation.Nullable Integer countUser) {
    this.countUser = countUser;
  }

  public TenantQuota countRoomAdmin(@javax.annotation.Nullable Integer countRoomAdmin) {
    
    this.countRoomAdmin = countRoomAdmin;
    return this;
  }

  /**
   * The number of portal room administrators.
   * @return countRoomAdmin
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNT_ROOM_ADMIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCountRoomAdmin() {
    return countRoomAdmin;
  }


  @JsonProperty(JSON_PROPERTY_COUNT_ROOM_ADMIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountRoomAdmin(@javax.annotation.Nullable Integer countRoomAdmin) {
    this.countRoomAdmin = countRoomAdmin;
  }

  public TenantQuota usersInRoom(@javax.annotation.Nullable Integer usersInRoom) {
    
    this.usersInRoom = usersInRoom;
    return this;
  }

  /**
   * The number of room users.
   * @return usersInRoom
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USERS_IN_ROOM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUsersInRoom() {
    return usersInRoom;
  }


  @JsonProperty(JSON_PROPERTY_USERS_IN_ROOM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsersInRoom(@javax.annotation.Nullable Integer usersInRoom) {
    this.usersInRoom = usersInRoom;
  }

  public TenantQuota countRoom(@javax.annotation.Nullable Integer countRoom) {
    
    this.countRoom = countRoom;
    return this;
  }

  /**
   * The number of rooms.
   * @return countRoom
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNT_ROOM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCountRoom() {
    return countRoom;
  }


  @JsonProperty(JSON_PROPERTY_COUNT_ROOM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountRoom(@javax.annotation.Nullable Integer countRoom) {
    this.countRoom = countRoom;
  }

  public TenantQuota nonProfit(@javax.annotation.Nullable Boolean nonProfit) {
    
    this.nonProfit = nonProfit;
    return this;
  }

  /**
   * Specifies if the tenant quota is nonprofit or not.
   * @return nonProfit
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NON_PROFIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNonProfit() {
    return nonProfit;
  }


  @JsonProperty(JSON_PROPERTY_NON_PROFIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNonProfit(@javax.annotation.Nullable Boolean nonProfit) {
    this.nonProfit = nonProfit;
  }

  public TenantQuota trial(@javax.annotation.Nullable Boolean trial) {
    
    this.trial = trial;
    return this;
  }

  /**
   * Specifies if the tenant quota is trial or not.
   * @return trial
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRIAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTrial() {
    return trial;
  }


  @JsonProperty(JSON_PROPERTY_TRIAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrial(@javax.annotation.Nullable Boolean trial) {
    this.trial = trial;
  }

  public TenantQuota free(@javax.annotation.Nullable Boolean free) {
    
    this.free = free;
    return this;
  }

  /**
   * Specifies if the tenant quota is free or not.
   * @return free
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FREE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFree() {
    return free;
  }


  @JsonProperty(JSON_PROPERTY_FREE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFree(@javax.annotation.Nullable Boolean free) {
    this.free = free;
  }

  public TenantQuota update(@javax.annotation.Nullable Boolean update) {
    
    this.update = update;
    return this;
  }

  /**
   * Specifies if the tenant quota is updated or not.
   * @return update
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUpdate() {
    return update;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdate(@javax.annotation.Nullable Boolean update) {
    this.update = update;
  }

  public TenantQuota audit(@javax.annotation.Nullable Boolean audit) {
    
    this.audit = audit;
    return this;
  }

  /**
   * Specifies if the audit trail is available or not.
   * @return audit
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAudit() {
    return audit;
  }


  @JsonProperty(JSON_PROPERTY_AUDIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAudit(@javax.annotation.Nullable Boolean audit) {
    this.audit = audit;
  }

  public TenantQuota docsEdition(@javax.annotation.Nullable Boolean docsEdition) {
    
    this.docsEdition = docsEdition;
    return this;
  }

  /**
   * Specifies if ONLYOFFICE Docs is included in the tenant quota or not.
   * @return docsEdition
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOCS_EDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDocsEdition() {
    return docsEdition;
  }


  @JsonProperty(JSON_PROPERTY_DOCS_EDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocsEdition(@javax.annotation.Nullable Boolean docsEdition) {
    this.docsEdition = docsEdition;
  }

  public TenantQuota ldap(@javax.annotation.Nullable Boolean ldap) {
    
    this.ldap = ldap;
    return this;
  }

  /**
   * Specifies if the LDAP settings are available or not.
   * @return ldap
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LDAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getLdap() {
    return ldap;
  }


  @JsonProperty(JSON_PROPERTY_LDAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLdap(@javax.annotation.Nullable Boolean ldap) {
    this.ldap = ldap;
  }

  public TenantQuota sso(@javax.annotation.Nullable Boolean sso) {
    
    this.sso = sso;
    return this;
  }

  /**
   * Specifies if the SSO settings are available or not.
   * @return sso
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SSO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSso() {
    return sso;
  }


  @JsonProperty(JSON_PROPERTY_SSO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSso(@javax.annotation.Nullable Boolean sso) {
    this.sso = sso;
  }

  public TenantQuota statistic(@javax.annotation.Nullable Boolean statistic) {
    
    this.statistic = statistic;
    return this;
  }

  /**
   * Specifies if the statistics settings are available or not.
   * @return statistic
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATISTIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getStatistic() {
    return statistic;
  }


  @JsonProperty(JSON_PROPERTY_STATISTIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatistic(@javax.annotation.Nullable Boolean statistic) {
    this.statistic = statistic;
  }

  public TenantQuota branding(@javax.annotation.Nullable Boolean branding) {
    
    this.branding = branding;
    return this;
  }

  /**
   * Specifies if the branding settings are available or not.
   * @return branding
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BRANDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBranding() {
    return branding;
  }


  @JsonProperty(JSON_PROPERTY_BRANDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBranding(@javax.annotation.Nullable Boolean branding) {
    this.branding = branding;
  }

  public TenantQuota customization(@javax.annotation.Nullable Boolean customization) {
    
    this.customization = customization;
    return this;
  }

  /**
   * Specifies if the customization settings are available or not.
   * @return customization
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCustomization() {
    return customization;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomization(@javax.annotation.Nullable Boolean customization) {
    this.customization = customization;
  }

  public TenantQuota lifetime(@javax.annotation.Nullable Boolean lifetime) {
    
    this.lifetime = lifetime;
    return this;
  }

  /**
   * Specifies if the license has the lifetime settings or not.
   * @return lifetime
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIFETIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getLifetime() {
    return lifetime;
  }


  @JsonProperty(JSON_PROPERTY_LIFETIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLifetime(@javax.annotation.Nullable Boolean lifetime) {
    this.lifetime = lifetime;
  }

  public TenantQuota custom(@javax.annotation.Nullable Boolean custom) {
    
    this.custom = custom;
    return this;
  }

  /**
   * Specifies if the custom domain URL is available or not.
   * @return custom
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCustom() {
    return custom;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustom(@javax.annotation.Nullable Boolean custom) {
    this.custom = custom;
  }

  public TenantQuota restore(@javax.annotation.Nullable Boolean restore) {
    
    this.restore = restore;
    return this;
  }

  /**
   * Specifies if the restore is enabled or not.
   * @return restore
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESTORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRestore() {
    return restore;
  }


  @JsonProperty(JSON_PROPERTY_RESTORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRestore(@javax.annotation.Nullable Boolean restore) {
    this.restore = restore;
  }

  public TenantQuota oauth(@javax.annotation.Nullable Boolean oauth) {
    
    this.oauth = oauth;
    return this;
  }

  /**
   * Specifies if Oauth is available or not.
   * @return oauth
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OAUTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOauth() {
    return oauth;
  }


  @JsonProperty(JSON_PROPERTY_OAUTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOauth(@javax.annotation.Nullable Boolean oauth) {
    this.oauth = oauth;
  }

  public TenantQuota contentSearch(@javax.annotation.Nullable Boolean contentSearch) {
    
    this.contentSearch = contentSearch;
    return this;
  }

  /**
   * Specifies if the content search is available or not.
   * @return contentSearch
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENT_SEARCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getContentSearch() {
    return contentSearch;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT_SEARCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContentSearch(@javax.annotation.Nullable Boolean contentSearch) {
    this.contentSearch = contentSearch;
  }

  public TenantQuota thirdParty(@javax.annotation.Nullable Boolean thirdParty) {
    
    this.thirdParty = thirdParty;
    return this;
  }

  /**
   * Specifies if the third-party accounts linking is available or not.
   * @return thirdParty
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THIRD_PARTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getThirdParty() {
    return thirdParty;
  }


  @JsonProperty(JSON_PROPERTY_THIRD_PARTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThirdParty(@javax.annotation.Nullable Boolean thirdParty) {
    this.thirdParty = thirdParty;
  }

  public TenantQuota year(@javax.annotation.Nullable Boolean year) {
    
    this.year = year;
    return this;
  }

  /**
   * Specifies if the tenant quota is yearly subscription or not.
   * @return year
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getYear() {
    return year;
  }


  @JsonProperty(JSON_PROPERTY_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYear(@javax.annotation.Nullable Boolean year) {
    this.year = year;
  }

  public TenantQuota countFreeBackup(@javax.annotation.Nullable Integer countFreeBackup) {
    
    this.countFreeBackup = countFreeBackup;
    return this;
  }

  /**
   * The number of free backups within a month.
   * @return countFreeBackup
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNT_FREE_BACKUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCountFreeBackup() {
    return countFreeBackup;
  }


  @JsonProperty(JSON_PROPERTY_COUNT_FREE_BACKUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountFreeBackup(@javax.annotation.Nullable Integer countFreeBackup) {
    this.countFreeBackup = countFreeBackup;
  }

  public TenantQuota backup(@javax.annotation.Nullable Boolean backup) {
    
    this.backup = backup;
    return this;
  }

  /**
   * Specifies if the backup anabled as a wallet service or not.
   * @return backup
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BACKUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBackup() {
    return backup;
  }


  @JsonProperty(JSON_PROPERTY_BACKUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBackup(@javax.annotation.Nullable Boolean backup) {
    this.backup = backup;
  }

  public TenantQuota countAIAgent(@javax.annotation.Nullable Integer countAIAgent) {
    
    this.countAIAgent = countAIAgent;
    return this;
  }

  /**
   * The number of AI agents.
   * @return countAIAgent
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNT_A_I_AGENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCountAIAgent() {
    return countAIAgent;
  }


  @JsonProperty(JSON_PROPERTY_COUNT_A_I_AGENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountAIAgent(@javax.annotation.Nullable Integer countAIAgent) {
    this.countAIAgent = countAIAgent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantQuota tenantQuota = (TenantQuota) o;
    return Objects.equals(this.tenantId, tenantQuota.tenantId) &&
        equalsNullable(this.name, tenantQuota.name) &&
        Objects.equals(this.price, tenantQuota.price) &&
        equalsNullable(this.priceCurrencySymbol, tenantQuota.priceCurrencySymbol) &&
        equalsNullable(this.priceISOCurrencySymbol, tenantQuota.priceISOCurrencySymbol) &&
        equalsNullable(this.productId, tenantQuota.productId) &&
        equalsNullable(this.serviceName, tenantQuota.serviceName) &&
        Objects.equals(this.visible, tenantQuota.visible) &&
        Objects.equals(this.wallet, tenantQuota.wallet) &&
        equalsNullable(this.dueDate, tenantQuota.dueDate) &&
        equalsNullable(this.features, tenantQuota.features) &&
        Objects.equals(this.maxFileSize, tenantQuota.maxFileSize) &&
        Objects.equals(this.maxTotalSize, tenantQuota.maxTotalSize) &&
        Objects.equals(this.countUser, tenantQuota.countUser) &&
        Objects.equals(this.countRoomAdmin, tenantQuota.countRoomAdmin) &&
        Objects.equals(this.usersInRoom, tenantQuota.usersInRoom) &&
        Objects.equals(this.countRoom, tenantQuota.countRoom) &&
        Objects.equals(this.nonProfit, tenantQuota.nonProfit) &&
        Objects.equals(this.trial, tenantQuota.trial) &&
        Objects.equals(this.free, tenantQuota.free) &&
        Objects.equals(this.update, tenantQuota.update) &&
        Objects.equals(this.audit, tenantQuota.audit) &&
        Objects.equals(this.docsEdition, tenantQuota.docsEdition) &&
        Objects.equals(this.ldap, tenantQuota.ldap) &&
        Objects.equals(this.sso, tenantQuota.sso) &&
        Objects.equals(this.statistic, tenantQuota.statistic) &&
        Objects.equals(this.branding, tenantQuota.branding) &&
        Objects.equals(this.customization, tenantQuota.customization) &&
        Objects.equals(this.lifetime, tenantQuota.lifetime) &&
        Objects.equals(this.custom, tenantQuota.custom) &&
        Objects.equals(this.restore, tenantQuota.restore) &&
        Objects.equals(this.oauth, tenantQuota.oauth) &&
        Objects.equals(this.contentSearch, tenantQuota.contentSearch) &&
        Objects.equals(this.thirdParty, tenantQuota.thirdParty) &&
        Objects.equals(this.year, tenantQuota.year) &&
        Objects.equals(this.countFreeBackup, tenantQuota.countFreeBackup) &&
        Objects.equals(this.backup, tenantQuota.backup) &&
        Objects.equals(this.countAIAgent, tenantQuota.countAIAgent);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, hashCodeNullable(name), price, hashCodeNullable(priceCurrencySymbol), hashCodeNullable(priceISOCurrencySymbol), hashCodeNullable(productId), hashCodeNullable(serviceName), visible, wallet, hashCodeNullable(dueDate), hashCodeNullable(features), maxFileSize, maxTotalSize, countUser, countRoomAdmin, usersInRoom, countRoom, nonProfit, trial, free, update, audit, docsEdition, ldap, sso, statistic, branding, customization, lifetime, custom, restore, oauth, contentSearch, thirdParty, year, countFreeBackup, backup, countAIAgent);
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
    sb.append("class TenantQuota {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    priceCurrencySymbol: ").append(toIndentedString(priceCurrencySymbol)).append("\n");
    sb.append("    priceISOCurrencySymbol: ").append(toIndentedString(priceISOCurrencySymbol)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    wallet: ").append(toIndentedString(wallet)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    maxFileSize: ").append(toIndentedString(maxFileSize)).append("\n");
    sb.append("    maxTotalSize: ").append(toIndentedString(maxTotalSize)).append("\n");
    sb.append("    countUser: ").append(toIndentedString(countUser)).append("\n");
    sb.append("    countRoomAdmin: ").append(toIndentedString(countRoomAdmin)).append("\n");
    sb.append("    usersInRoom: ").append(toIndentedString(usersInRoom)).append("\n");
    sb.append("    countRoom: ").append(toIndentedString(countRoom)).append("\n");
    sb.append("    nonProfit: ").append(toIndentedString(nonProfit)).append("\n");
    sb.append("    trial: ").append(toIndentedString(trial)).append("\n");
    sb.append("    free: ").append(toIndentedString(free)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("    audit: ").append(toIndentedString(audit)).append("\n");
    sb.append("    docsEdition: ").append(toIndentedString(docsEdition)).append("\n");
    sb.append("    ldap: ").append(toIndentedString(ldap)).append("\n");
    sb.append("    sso: ").append(toIndentedString(sso)).append("\n");
    sb.append("    statistic: ").append(toIndentedString(statistic)).append("\n");
    sb.append("    branding: ").append(toIndentedString(branding)).append("\n");
    sb.append("    customization: ").append(toIndentedString(customization)).append("\n");
    sb.append("    lifetime: ").append(toIndentedString(lifetime)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    restore: ").append(toIndentedString(restore)).append("\n");
    sb.append("    oauth: ").append(toIndentedString(oauth)).append("\n");
    sb.append("    contentSearch: ").append(toIndentedString(contentSearch)).append("\n");
    sb.append("    thirdParty: ").append(toIndentedString(thirdParty)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    countFreeBackup: ").append(toIndentedString(countFreeBackup)).append("\n");
    sb.append("    backup: ").append(toIndentedString(backup)).append("\n");
    sb.append("    countAIAgent: ").append(toIndentedString(countAIAgent)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `price` to the URL query string
    if (getPrice() != null) {
      try {
        joiner.add(String.format("%sprice%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPrice()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `priceCurrencySymbol` to the URL query string
    if (getPriceCurrencySymbol() != null) {
      try {
        joiner.add(String.format("%spriceCurrencySymbol%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPriceCurrencySymbol()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `priceISOCurrencySymbol` to the URL query string
    if (getPriceISOCurrencySymbol() != null) {
      try {
        joiner.add(String.format("%spriceISOCurrencySymbol%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPriceISOCurrencySymbol()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `productId` to the URL query string
    if (getProductId() != null) {
      try {
        joiner.add(String.format("%sproductId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProductId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `serviceName` to the URL query string
    if (getServiceName() != null) {
      try {
        joiner.add(String.format("%sserviceName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getServiceName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `visible` to the URL query string
    if (getVisible() != null) {
      try {
        joiner.add(String.format("%svisible%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVisible()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `wallet` to the URL query string
    if (getWallet() != null) {
      try {
        joiner.add(String.format("%swallet%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWallet()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `dueDate` to the URL query string
    if (getDueDate() != null) {
      try {
        joiner.add(String.format("%sdueDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDueDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `features` to the URL query string
    if (getFeatures() != null) {
      try {
        joiner.add(String.format("%sfeatures%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFeatures()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `maxFileSize` to the URL query string
    if (getMaxFileSize() != null) {
      try {
        joiner.add(String.format("%smaxFileSize%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxFileSize()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `maxTotalSize` to the URL query string
    if (getMaxTotalSize() != null) {
      try {
        joiner.add(String.format("%smaxTotalSize%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxTotalSize()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `countUser` to the URL query string
    if (getCountUser() != null) {
      try {
        joiner.add(String.format("%scountUser%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCountUser()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `countRoomAdmin` to the URL query string
    if (getCountRoomAdmin() != null) {
      try {
        joiner.add(String.format("%scountRoomAdmin%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCountRoomAdmin()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `usersInRoom` to the URL query string
    if (getUsersInRoom() != null) {
      try {
        joiner.add(String.format("%susersInRoom%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUsersInRoom()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `countRoom` to the URL query string
    if (getCountRoom() != null) {
      try {
        joiner.add(String.format("%scountRoom%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCountRoom()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `nonProfit` to the URL query string
    if (getNonProfit() != null) {
      try {
        joiner.add(String.format("%snonProfit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNonProfit()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `trial` to the URL query string
    if (getTrial() != null) {
      try {
        joiner.add(String.format("%strial%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTrial()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `free` to the URL query string
    if (getFree() != null) {
      try {
        joiner.add(String.format("%sfree%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFree()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `update` to the URL query string
    if (getUpdate() != null) {
      try {
        joiner.add(String.format("%supdate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUpdate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `audit` to the URL query string
    if (getAudit() != null) {
      try {
        joiner.add(String.format("%saudit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAudit()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `docsEdition` to the URL query string
    if (getDocsEdition() != null) {
      try {
        joiner.add(String.format("%sdocsEdition%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDocsEdition()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `ldap` to the URL query string
    if (getLdap() != null) {
      try {
        joiner.add(String.format("%sldap%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLdap()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sso` to the URL query string
    if (getSso() != null) {
      try {
        joiner.add(String.format("%ssso%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSso()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `statistic` to the URL query string
    if (getStatistic() != null) {
      try {
        joiner.add(String.format("%sstatistic%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatistic()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `branding` to the URL query string
    if (getBranding() != null) {
      try {
        joiner.add(String.format("%sbranding%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBranding()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `customization` to the URL query string
    if (getCustomization() != null) {
      try {
        joiner.add(String.format("%scustomization%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCustomization()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `lifetime` to the URL query string
    if (getLifetime() != null) {
      try {
        joiner.add(String.format("%slifetime%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLifetime()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `custom` to the URL query string
    if (getCustom() != null) {
      try {
        joiner.add(String.format("%scustom%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCustom()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `restore` to the URL query string
    if (getRestore() != null) {
      try {
        joiner.add(String.format("%srestore%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRestore()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `oauth` to the URL query string
    if (getOauth() != null) {
      try {
        joiner.add(String.format("%soauth%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOauth()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `contentSearch` to the URL query string
    if (getContentSearch() != null) {
      try {
        joiner.add(String.format("%scontentSearch%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getContentSearch()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `thirdParty` to the URL query string
    if (getThirdParty() != null) {
      try {
        joiner.add(String.format("%sthirdParty%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getThirdParty()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `year` to the URL query string
    if (getYear() != null) {
      try {
        joiner.add(String.format("%syear%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getYear()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `countFreeBackup` to the URL query string
    if (getCountFreeBackup() != null) {
      try {
        joiner.add(String.format("%scountFreeBackup%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCountFreeBackup()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `backup` to the URL query string
    if (getBackup() != null) {
      try {
        joiner.add(String.format("%sbackup%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBackup()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `countAIAgent` to the URL query string
    if (getCountAIAgent() != null) {
      try {
        joiner.add(String.format("%scountAIAgent%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCountAIAgent()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

