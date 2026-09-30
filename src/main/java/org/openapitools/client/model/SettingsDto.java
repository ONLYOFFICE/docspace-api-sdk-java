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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.client.model.CultureSpecificExternalResources;
import org.openapitools.client.model.DeepLinkDto;
import org.openapitools.client.model.FirebaseDto;
import org.openapitools.client.model.FolderType;
import org.openapitools.client.model.FormGalleryDto;
import org.openapitools.client.model.PasswordHasher;
import org.openapitools.client.model.PluginsDto;
import org.openapitools.client.model.RecaptchaType;
import org.openapitools.client.model.TenantDomainValidator;
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
 * The general configuration of the current portal, as the client shell needs it before and after sign-in.
 */
@JsonPropertyOrder({
  SettingsDto.JSON_PROPERTY_TIMEZONE,
  SettingsDto.JSON_PROPERTY_TRUSTED_DOMAINS,
  SettingsDto.JSON_PROPERTY_TRUSTED_DOMAINS_TYPE,
  SettingsDto.JSON_PROPERTY_CULTURE,
  SettingsDto.JSON_PROPERTY_UTC_OFFSET,
  SettingsDto.JSON_PROPERTY_UTC_HOURS_OFFSET,
  SettingsDto.JSON_PROPERTY_GREETING_SETTINGS,
  SettingsDto.JSON_PROPERTY_OWNER_ID,
  SettingsDto.JSON_PROPERTY_NAME_SCHEMA_ID,
  SettingsDto.JSON_PROPERTY_ENABLED_JOIN,
  SettingsDto.JSON_PROPERTY_ENABLE_ADM_MESS,
  SettingsDto.JSON_PROPERTY_THIRDPARTY_ENABLE,
  SettingsDto.JSON_PROPERTY_DOC_SPACE,
  SettingsDto.JSON_PROPERTY_STANDALONE,
  SettingsDto.JSON_PROPERTY_IS_AMI,
  SettingsDto.JSON_PROPERTY_BASE_DOMAIN,
  SettingsDto.JSON_PROPERTY_WIZARD_TOKEN,
  SettingsDto.JSON_PROPERTY_PASSWORD_HASH,
  SettingsDto.JSON_PROPERTY_FIREBASE,
  SettingsDto.JSON_PROPERTY_VERSION,
  SettingsDto.JSON_PROPERTY_RECAPTCHA_TYPE,
  SettingsDto.JSON_PROPERTY_RECAPTCHA_PUBLIC_KEY,
  SettingsDto.JSON_PROPERTY_DEBUG_INFO,
  SettingsDto.JSON_PROPERTY_SOCKET_URL,
  SettingsDto.JSON_PROPERTY_TENANT_STATUS,
  SettingsDto.JSON_PROPERTY_TENANT_ALIAS,
  SettingsDto.JSON_PROPERTY_DISPLAY_ABOUT,
  SettingsDto.JSON_PROPERTY_DOMAIN_VALIDATOR,
  SettingsDto.JSON_PROPERTY_ZENDESK_KEY,
  SettingsDto.JSON_PROPERTY_TAG_MANAGER_ID,
  SettingsDto.JSON_PROPERTY_COOKIE_SETTINGS_ENABLED,
  SettingsDto.JSON_PROPERTY_LIMITED_ACCESS_SPACE,
  SettingsDto.JSON_PROPERTY_LIMITED_ACCESS_DEV_TOOLS_FOR_USERS,
  SettingsDto.JSON_PROPERTY_DISPLAY_BANNERS,
  SettingsDto.JSON_PROPERTY_AI_ENABLED,
  SettingsDto.JSON_PROPERTY_WALLET_LOW_BALANCE,
  SettingsDto.JSON_PROPERTY_USER_NAME_REGEX,
  SettingsDto.JSON_PROPERTY_INVITATION_LIMIT,
  SettingsDto.JSON_PROPERTY_PLUGINS,
  SettingsDto.JSON_PROPERTY_DEEP_LINK,
  SettingsDto.JSON_PROPERTY_FORM_GALLERY,
  SettingsDto.JSON_PROPERTY_MAX_IMAGE_UPLOAD_SIZE,
  SettingsDto.JSON_PROPERTY_LOGO_TEXT,
  SettingsDto.JSON_PROPERTY_EXTERNAL_RESOURCES,
  SettingsDto.JSON_PROPERTY_DEFAULT_FOLDER_TYPE,
  SettingsDto.JSON_PROPERTY_EXTERNAL_DB_ENABLED
})

public class SettingsDto {
  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  @javax.annotation.Nullable  private JsonNullable<String> timezone = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TRUSTED_DOMAINS = "trustedDomains";
  @javax.annotation.Nullable  private JsonNullable<List<String>> trustedDomains = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_TRUSTED_DOMAINS_TYPE = "trustedDomainsType";
  @javax.annotation.Nullable  private TenantTrustedDomainsType trustedDomainsType;

  public static final String JSON_PROPERTY_CULTURE = "culture";
  @javax.annotation.Nullable  private String culture;

  public static final String JSON_PROPERTY_UTC_OFFSET = "utcOffset";
  @javax.annotation.Nullable  private String utcOffset;

  public static final String JSON_PROPERTY_UTC_HOURS_OFFSET = "utcHoursOffset";
  @javax.annotation.Nullable  private Double utcHoursOffset;

  public static final String JSON_PROPERTY_GREETING_SETTINGS = "greetingSettings";
  @javax.annotation.Nullable  private JsonNullable<String> greetingSettings = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_OWNER_ID = "ownerId";
  @javax.annotation.Nullable  private UUID ownerId;

  public static final String JSON_PROPERTY_NAME_SCHEMA_ID = "nameSchemaId";
  @javax.annotation.Nullable  private JsonNullable<String> nameSchemaId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ENABLED_JOIN = "enabledJoin";
  @javax.annotation.Nullable  private JsonNullable<Boolean> enabledJoin = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_ENABLE_ADM_MESS = "enableAdmMess";
  @javax.annotation.Nullable  private JsonNullable<Boolean> enableAdmMess = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_THIRDPARTY_ENABLE = "thirdpartyEnable";
  @javax.annotation.Nullable  private JsonNullable<Boolean> thirdpartyEnable = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_DOC_SPACE = "docSpace";
  @javax.annotation.Nullable  private Boolean docSpace;

  public static final String JSON_PROPERTY_STANDALONE = "standalone";
  @javax.annotation.Nullable  private Boolean standalone;

  public static final String JSON_PROPERTY_IS_AMI = "isAmi";
  @javax.annotation.Nullable  private Boolean isAmi;

  public static final String JSON_PROPERTY_BASE_DOMAIN = "baseDomain";
  @javax.annotation.Nullable  private String baseDomain;

  public static final String JSON_PROPERTY_WIZARD_TOKEN = "wizardToken";
  @javax.annotation.Nullable  private JsonNullable<String> wizardToken = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PASSWORD_HASH = "passwordHash";
  @javax.annotation.Nullable  private PasswordHasher passwordHash;

  public static final String JSON_PROPERTY_FIREBASE = "firebase";
  @javax.annotation.Nullable  private FirebaseDto firebase;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable  private JsonNullable<String> version = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_RECAPTCHA_TYPE = "recaptchaType";
  @javax.annotation.Nullable  private RecaptchaType recaptchaType;

  public static final String JSON_PROPERTY_RECAPTCHA_PUBLIC_KEY = "recaptchaPublicKey";
  @javax.annotation.Nullable  private JsonNullable<String> recaptchaPublicKey = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DEBUG_INFO = "debugInfo";
  @javax.annotation.Nullable  private Boolean debugInfo;

  public static final String JSON_PROPERTY_SOCKET_URL = "socketUrl";
  @javax.annotation.Nullable  private JsonNullable<String> socketUrl = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TENANT_STATUS = "tenantStatus";
  @javax.annotation.Nullable  private TenantStatus tenantStatus;

  public static final String JSON_PROPERTY_TENANT_ALIAS = "tenantAlias";
  @javax.annotation.Nullable  private JsonNullable<String> tenantAlias = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DISPLAY_ABOUT = "displayAbout";
  @javax.annotation.Nullable  private Boolean displayAbout;

  public static final String JSON_PROPERTY_DOMAIN_VALIDATOR = "domainValidator";
  @javax.annotation.Nullable  private TenantDomainValidator domainValidator;

  public static final String JSON_PROPERTY_ZENDESK_KEY = "zendeskKey";
  @javax.annotation.Nullable  private JsonNullable<String> zendeskKey = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TAG_MANAGER_ID = "tagManagerId";
  @javax.annotation.Nullable  private JsonNullable<String> tagManagerId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COOKIE_SETTINGS_ENABLED = "cookieSettingsEnabled";
  @javax.annotation.Nonnull  private Boolean cookieSettingsEnabled;

  public static final String JSON_PROPERTY_LIMITED_ACCESS_SPACE = "limitedAccessSpace";
  @javax.annotation.Nullable  private Boolean limitedAccessSpace;

  public static final String JSON_PROPERTY_LIMITED_ACCESS_DEV_TOOLS_FOR_USERS = "limitedAccessDevToolsForUsers";
  @javax.annotation.Nullable  private Boolean limitedAccessDevToolsForUsers;

  public static final String JSON_PROPERTY_DISPLAY_BANNERS = "displayBanners";
  @javax.annotation.Nullable  private Boolean displayBanners;

  public static final String JSON_PROPERTY_AI_ENABLED = "aiEnabled";
  @javax.annotation.Nullable  private Boolean aiEnabled;

  public static final String JSON_PROPERTY_WALLET_LOW_BALANCE = "walletLowBalance";
  @javax.annotation.Nullable  private JsonNullable<Boolean> walletLowBalance = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_USER_NAME_REGEX = "userNameRegex";
  @javax.annotation.Nullable  private JsonNullable<String> userNameRegex = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_INVITATION_LIMIT = "invitationLimit";
  @javax.annotation.Nullable  private JsonNullable<Integer> invitationLimit = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_PLUGINS = "plugins";
  @javax.annotation.Nullable  private PluginsDto plugins;

  public static final String JSON_PROPERTY_DEEP_LINK = "deepLink";
  @javax.annotation.Nonnull  private DeepLinkDto deepLink;

  public static final String JSON_PROPERTY_FORM_GALLERY = "formGallery";
  @javax.annotation.Nullable  private FormGalleryDto formGallery;

  public static final String JSON_PROPERTY_MAX_IMAGE_UPLOAD_SIZE = "maxImageUploadSize";
  @javax.annotation.Nullable  private Long maxImageUploadSize;

  public static final String JSON_PROPERTY_LOGO_TEXT = "logoText";
  @javax.annotation.Nullable  private JsonNullable<String> logoText = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EXTERNAL_RESOURCES = "externalResources";
  @javax.annotation.Nullable  private CultureSpecificExternalResources externalResources;

  public static final String JSON_PROPERTY_DEFAULT_FOLDER_TYPE = "defaultFolderType";
  @javax.annotation.Nullable  private FolderType defaultFolderType;

  public static final String JSON_PROPERTY_EXTERNAL_DB_ENABLED = "externalDbEnabled";
  @javax.annotation.Nullable  private Boolean externalDbEnabled;

  public SettingsDto() {
  }


  public SettingsDto timezone(@javax.annotation.Nullable String timezone) {
    this.timezone = JsonNullable.<String>of(timezone);
    
    return this;
  }

  /**
   * The portal time zone as an IANA identifier, which is the zone every date this API returns in portal time  is expressed in. Filled in for a signed-in caller only.
   * @return timezone
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getTimezone() {
        return timezone.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_TIMEZONE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getTimezone_JsonNullable() {
    return timezone;
  }
  
  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  public void setTimezone_JsonNullable(JsonNullable<String> timezone) {
    this.timezone = timezone;
  }

  public void setTimezone(@javax.annotation.Nullable String timezone) {
    this.timezone = JsonNullable.<String>of(timezone);
  }

  public SettingsDto trustedDomains(@javax.annotation.Nullable List<String> trustedDomains) {
    this.trustedDomains = JsonNullable.<List<String>>of(trustedDomains);
    
    return this;
  }

  public SettingsDto addTrustedDomainsItem(String trustedDomainsItem) {
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
   * The mail domains a new member may register or be invited from without confirming the address. It is filled  in for a signed-in caller, and for an anonymous one only while `enabledJoin` is `true`; it is empty  whenever `trustedDomainsType` is not `Custom`.
   * @return trustedDomains
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<String> getTrustedDomains() {
        return trustedDomains.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_TRUSTED_DOMAINS, required = false)
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

  public SettingsDto trustedDomainsType(@javax.annotation.Nullable TenantTrustedDomainsType trustedDomainsType) {
    
    this.trustedDomainsType = trustedDomainsType;
    return this;
  }

  /**
   * How the mail domains above are applied: no domain trusted, every domain trusted, or only the listed ones.  Filled in under the same conditions as `trustedDomains`.
   * @return trustedDomainsType
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TRUSTED_DOMAINS_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TenantTrustedDomainsType getTrustedDomainsType() {
    return trustedDomainsType;
  }


  @JsonProperty(value = JSON_PROPERTY_TRUSTED_DOMAINS_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrustedDomainsType(@javax.annotation.Nullable TenantTrustedDomainsType trustedDomainsType) {
    this.trustedDomainsType = trustedDomainsType;
  }

  public SettingsDto culture(@javax.annotation.Nullable String culture) {
    
    this.culture = culture;
    return this;
  }

  /**
   * The default language of the portal as a culture name, which is what unauthenticated pages are rendered in.  A signed-in member may have a language of their own, and that one is not reported here.
   * @return culture
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CULTURE, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCulture() {
    return culture;
  }


  @JsonProperty(value = JSON_PROPERTY_CULTURE, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCulture(@javax.annotation.Nullable String culture) {
    this.culture = culture;
  }

  public SettingsDto utcOffset(@javax.annotation.Nullable String utcOffset) {
    
    this.utcOffset = utcOffset;
    return this;
  }

  /**
   * The portal's offset from UTC as a time span, positive east of UTC. Filled in for a signed-in caller only,  and taken at the moment of the call, so it already reflects daylight saving time.
   * @return utcOffset
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_UTC_OFFSET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUtcOffset() {
    return utcOffset;
  }


  @JsonProperty(value = JSON_PROPERTY_UTC_OFFSET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUtcOffset(@javax.annotation.Nullable String utcOffset) {
    this.utcOffset = utcOffset;
  }

  public SettingsDto utcHoursOffset(@javax.annotation.Nullable Double utcHoursOffset) {
    
    this.utcHoursOffset = utcHoursOffset;
    return this;
  }

  /**
   * The same offset in hours, fractional for a zone that is not on a whole hour. It is there so a client does  not have to parse `utcOffset`.
   * @return utcHoursOffset
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_UTC_HOURS_OFFSET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getUtcHoursOffset() {
    return utcHoursOffset;
  }


  @JsonProperty(value = JSON_PROPERTY_UTC_HOURS_OFFSET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUtcHoursOffset(@javax.annotation.Nullable Double utcHoursOffset) {
    this.utcHoursOffset = utcHoursOffset;
  }

  public SettingsDto greetingSettings(@javax.annotation.Nullable String greetingSettings) {
    this.greetingSettings = JsonNullable.<String>of(greetingSettings);
    
    return this;
  }

  /**
   * The portal title shown on the login page and in letters. It falls back to the product name in the portal  language while the portal has been given no title of its own.
   * @return greetingSettings
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getGreetingSettings() {
        return greetingSettings.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_GREETING_SETTINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getGreetingSettings_JsonNullable() {
    return greetingSettings;
  }
  
  @JsonProperty(JSON_PROPERTY_GREETING_SETTINGS)
  public void setGreetingSettings_JsonNullable(JsonNullable<String> greetingSettings) {
    this.greetingSettings = greetingSettings;
  }

  public void setGreetingSettings(@javax.annotation.Nullable String greetingSettings) {
    this.greetingSettings = JsonNullable.<String>of(greetingSettings);
  }

  public SettingsDto ownerId(@javax.annotation.Nullable UUID ownerId) {
    
    this.ownerId = ownerId;
    return this;
  }

  /**
   * The portal owner, the one account that cannot be removed or demoted. Filled in for a signed-in caller  only, and the empty GUID for an anonymous one.
   * @return ownerId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_OWNER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getOwnerId() {
    return ownerId;
  }


  @JsonProperty(value = JSON_PROPERTY_OWNER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOwnerId(@javax.annotation.Nullable UUID ownerId) {
    this.ownerId = ownerId;
  }

  public SettingsDto nameSchemaId(@javax.annotation.Nullable String nameSchemaId) {
    this.nameSchemaId = JsonNullable.<String>of(nameSchemaId);
    
    return this;
  }

  /**
   * The naming scheme the portal uses for its own vocabulary - what a member, a group or a room is called in  the interface. `GET api/2.0/settings/customschemas/{id}` spells that vocabulary out. Filled in for a  signed-in caller only.
   * @return nameSchemaId
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getNameSchemaId() {
        return nameSchemaId.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_NAME_SCHEMA_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getNameSchemaId_JsonNullable() {
    return nameSchemaId;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME_SCHEMA_ID)
  public void setNameSchemaId_JsonNullable(JsonNullable<String> nameSchemaId) {
    this.nameSchemaId = nameSchemaId;
  }

  public void setNameSchemaId(@javax.annotation.Nullable String nameSchemaId) {
    this.nameSchemaId = JsonNullable.<String>of(nameSchemaId);
  }

  public SettingsDto enabledJoin(@javax.annotation.Nullable Boolean enabledJoin) {
    this.enabledJoin = JsonNullable.<Boolean>of(enabledJoin);
    
    return this;
  }

  /**
   * Whether someone who is not invited may still register, which is the case when the portal trusts every mail  domain or a list of them. It is computed for an anonymous caller only and left out entirely for a  signed-in one, so a missing value is not a `false`.
   * @return enabledJoin
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getEnabledJoin() {
        return enabledJoin.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ENABLED_JOIN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getEnabledJoin_JsonNullable() {
    return enabledJoin;
  }
  
  @JsonProperty(JSON_PROPERTY_ENABLED_JOIN)
  public void setEnabledJoin_JsonNullable(JsonNullable<Boolean> enabledJoin) {
    this.enabledJoin = enabledJoin;
  }

  public void setEnabledJoin(@javax.annotation.Nullable Boolean enabledJoin) {
    this.enabledJoin = JsonNullable.<Boolean>of(enabledJoin);
  }

  public SettingsDto enableAdmMess(@javax.annotation.Nullable Boolean enableAdmMess) {
    this.enableAdmMess = JsonNullable.<Boolean>of(enableAdmMess);
    
    return this;
  }

  /**
   * Whether the login page may offer the form for writing to the portal administrators. It is also `true`  while the portal's payment has lapsed, whatever the setting says, so it can be set on a portal where an  administrator switched the form off.
   * @return enableAdmMess
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getEnableAdmMess() {
        return enableAdmMess.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ENABLE_ADM_MESS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getEnableAdmMess_JsonNullable() {
    return enableAdmMess;
  }
  
  @JsonProperty(JSON_PROPERTY_ENABLE_ADM_MESS)
  public void setEnableAdmMess_JsonNullable(JsonNullable<Boolean> enableAdmMess) {
    this.enableAdmMess = enableAdmMess;
  }

  public void setEnableAdmMess(@javax.annotation.Nullable Boolean enableAdmMess) {
    this.enableAdmMess = JsonNullable.<Boolean>of(enableAdmMess);
  }

  public SettingsDto thirdpartyEnable(@javax.annotation.Nullable Boolean thirdpartyEnable) {
    this.thirdpartyEnable = JsonNullable.<Boolean>of(thirdpartyEnable);
    
    return this;
  }

  /**
   * Whether the login page may offer sign-in through an external identity provider. It is computed for an  anonymous caller only; `GET api/2.0/capabilities` reports the same thing with the list of providers.
   * @return thirdpartyEnable
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getThirdpartyEnable() {
        return thirdpartyEnable.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_THIRDPARTY_ENABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getThirdpartyEnable_JsonNullable() {
    return thirdpartyEnable;
  }
  
  @JsonProperty(JSON_PROPERTY_THIRDPARTY_ENABLE)
  public void setThirdpartyEnable_JsonNullable(JsonNullable<Boolean> thirdpartyEnable) {
    this.thirdpartyEnable = thirdpartyEnable;
  }

  public void setThirdpartyEnable(@javax.annotation.Nullable Boolean thirdpartyEnable) {
    this.thirdpartyEnable = JsonNullable.<Boolean>of(thirdpartyEnable);
  }

  public SettingsDto docSpace(@javax.annotation.Nullable Boolean docSpace) {
    
    this.docSpace = docSpace;
    return this;
  }

  /**
   * Always `true` in this product. It exists so a client that also talks to older ONLYOFFICE portals can tell  them apart, and is not a feature switch.
   * @return docSpace
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DOC_SPACE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDocSpace() {
    return docSpace;
  }


  @JsonProperty(value = JSON_PROPERTY_DOC_SPACE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocSpace(@javax.annotation.Nullable Boolean docSpace) {
    this.docSpace = docSpace;
  }

  public SettingsDto standalone(@javax.annotation.Nullable Boolean standalone) {
    
    this.standalone = standalone;
    return this;
  }

  /**
   * Whether this is a server installation someone administers themselves rather than a portal in the cloud.  Several fields below and a number of operations behave differently in the two, so a client that has to  branch on the deployment reads it here.
   * @return standalone
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_STANDALONE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getStandalone() {
    return standalone;
  }


  @JsonProperty(value = JSON_PROPERTY_STANDALONE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStandalone(@javax.annotation.Nullable Boolean standalone) {
    this.standalone = standalone;
  }

  public SettingsDto isAmi(@javax.annotation.Nullable Boolean isAmi) {
    
    this.isAmi = isAmi;
    return this;
  }

  /**
   * Whether the installation runs from an Amazon machine image, which is a server installation that can read  its own instance metadata. It is `false` on every cloud portal.
   * @return isAmi
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IS_AMI, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsAmi() {
    return isAmi;
  }


  @JsonProperty(value = JSON_PROPERTY_IS_AMI, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsAmi(@javax.annotation.Nullable Boolean isAmi) {
    this.isAmi = isAmi;
  }

  public SettingsDto baseDomain(@javax.annotation.Nullable String baseDomain) {
    
    this.baseDomain = baseDomain;
    return this;
  }

  /**
   * The domain new portals of this installation are created under, which is what a portal name is checked  against and appended to. It is empty on an installation that serves a single portal on a fixed address.
   * @return baseDomain
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_BASE_DOMAIN, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBaseDomain() {
    return baseDomain;
  }


  @JsonProperty(value = JSON_PROPERTY_BASE_DOMAIN, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBaseDomain(@javax.annotation.Nullable String baseDomain) {
    this.baseDomain = baseDomain;
  }

  public SettingsDto wizardToken(@javax.annotation.Nullable String wizardToken) {
    this.wizardToken = JsonNullable.<String>of(wizardToken);
    
    return this;
  }

  /**
   * The token that authorizes the first-run setup wizard. It is handed out to anonymous callers only, and only  while the wizard has not been completed; once it has, the field stays empty for good.
   * @return wizardToken
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getWizardToken() {
        return wizardToken.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_WIZARD_TOKEN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getWizardToken_JsonNullable() {
    return wizardToken;
  }
  
  @JsonProperty(JSON_PROPERTY_WIZARD_TOKEN)
  public void setWizardToken_JsonNullable(JsonNullable<String> wizardToken) {
    this.wizardToken = wizardToken;
  }

  public void setWizardToken(@javax.annotation.Nullable String wizardToken) {
    this.wizardToken = JsonNullable.<String>of(wizardToken);
  }

  public SettingsDto passwordHash(@javax.annotation.Nullable PasswordHasher passwordHash) {
    
    this.passwordHash = passwordHash;
    return this;
  }

  /**
   * The parameters for hashing a password in the client before it is sent - the salt, the iteration count and  the hash size. It is filled in for an anonymous caller and, for a signed-in one, only when  `withPassword=true` is asked for. Hash with exactly these parameters and send the result as  `passwordHash`, since the portal cannot reproduce the hash from a different set.
   * @return passwordHash
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PASSWORD_HASH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PasswordHasher getPasswordHash() {
    return passwordHash;
  }


  @JsonProperty(value = JSON_PROPERTY_PASSWORD_HASH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPasswordHash(@javax.annotation.Nullable PasswordHasher passwordHash) {
    this.passwordHash = passwordHash;
  }

  public SettingsDto firebase(@javax.annotation.Nullable FirebaseDto firebase) {
    
    this.firebase = firebase;
    return this;
  }

  /**
   * The Firebase project a mobile or web client sends push registrations to. Filled in for a signed-in caller  only, and its own fields are empty strings on an installation that configures no Firebase project.
   * @return firebase
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_FIREBASE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FirebaseDto getFirebase() {
    return firebase;
  }


  @JsonProperty(value = JSON_PROPERTY_FIREBASE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirebase(@javax.annotation.Nullable FirebaseDto firebase) {
    this.firebase = firebase;
  }

  public SettingsDto version(@javax.annotation.Nullable String version) {
    this.version = JsonNullable.<String>of(version);
    
    return this;
  }

  /**
   * The product version of the portal, empty when the installation does not publish one. It is the version of  the server, not of this API, whose own version is fixed at 2.0.
   * @return version
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getVersion() {
        return version.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getVersion_JsonNullable() {
    return version;
  }
  
  @JsonProperty(JSON_PROPERTY_VERSION)
  public void setVersion_JsonNullable(JsonNullable<String> version) {
    this.version = version;
  }

  public void setVersion(@javax.annotation.Nullable String version) {
    this.version = JsonNullable.<String>of(version);
  }

  public SettingsDto recaptchaType(@javax.annotation.Nullable RecaptchaType recaptchaType) {
    
    this.recaptchaType = recaptchaType;
    return this;
  }

  /**
   * Which CAPTCHA the login form has to render, decided by the installation's configuration. Computed for an  anonymous caller only.
   * @return recaptchaType
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_RECAPTCHA_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecaptchaType getRecaptchaType() {
    return recaptchaType;
  }


  @JsonProperty(value = JSON_PROPERTY_RECAPTCHA_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecaptchaType(@javax.annotation.Nullable RecaptchaType recaptchaType) {
    this.recaptchaType = recaptchaType;
  }

  public SettingsDto recaptchaPublicKey(@javax.annotation.Nullable String recaptchaPublicKey) {
    this.recaptchaPublicKey = JsonNullable.<String>of(recaptchaPublicKey);
    
    return this;
  }

  /**
   * The site key for the CAPTCHA named by `recaptchaType`, safe to embed in a page. It is empty when the  installation configures no CAPTCHA, in which case the login form asks for none.
   * @return recaptchaPublicKey
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getRecaptchaPublicKey() {
        return recaptchaPublicKey.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_RECAPTCHA_PUBLIC_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getRecaptchaPublicKey_JsonNullable() {
    return recaptchaPublicKey;
  }
  
  @JsonProperty(JSON_PROPERTY_RECAPTCHA_PUBLIC_KEY)
  public void setRecaptchaPublicKey_JsonNullable(JsonNullable<String> recaptchaPublicKey) {
    this.recaptchaPublicKey = recaptchaPublicKey;
  }

  public void setRecaptchaPublicKey(@javax.annotation.Nullable String recaptchaPublicKey) {
    this.recaptchaPublicKey = JsonNullable.<String>of(recaptchaPublicKey);
  }

  public SettingsDto debugInfo(@javax.annotation.Nullable Boolean debugInfo) {
    
    this.debugInfo = debugInfo;
    return this;
  }

  /**
   * Whether the client may collect and send diagnostic information. Filled in for a signed-in caller only, and  `false` unless the installation switched it on.
   * @return debugInfo
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DEBUG_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDebugInfo() {
    return debugInfo;
  }


  @JsonProperty(value = JSON_PROPERTY_DEBUG_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDebugInfo(@javax.annotation.Nullable Boolean debugInfo) {
    this.debugInfo = debugInfo;
  }

  public SettingsDto socketUrl(@javax.annotation.Nullable String socketUrl) {
    this.socketUrl = JsonNullable.<String>of(socketUrl);
    
    return this;
  }

  /**
   * The address of the socket service that pushes live updates to a client. It is filled in for a signed-in  caller and for an anonymous one who arrives with an external sharing link, and is empty when the  installation runs no socket service - a client then has to poll.
   * @return socketUrl
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getSocketUrl() {
        return socketUrl.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SOCKET_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getSocketUrl_JsonNullable() {
    return socketUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_SOCKET_URL)
  public void setSocketUrl_JsonNullable(JsonNullable<String> socketUrl) {
    this.socketUrl = socketUrl;
  }

  public void setSocketUrl(@javax.annotation.Nullable String socketUrl) {
    this.socketUrl = JsonNullable.<String>of(socketUrl);
  }

  public SettingsDto tenantStatus(@javax.annotation.Nullable TenantStatus tenantStatus) {
    
    this.tenantStatus = tenantStatus;
    return this;
  }

  /**
   * The lifecycle state of the portal. Anything other than active means most operations are refused for the  moment, because the portal is being transferred, restored, encrypted or removed.
   * @return tenantStatus
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TENANT_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TenantStatus getTenantStatus() {
    return tenantStatus;
  }


  @JsonProperty(value = JSON_PROPERTY_TENANT_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantStatus(@javax.annotation.Nullable TenantStatus tenantStatus) {
    this.tenantStatus = tenantStatus;
  }

  public SettingsDto tenantAlias(@javax.annotation.Nullable String tenantAlias) {
    this.tenantAlias = JsonNullable.<String>of(tenantAlias);
    
    return this;
  }

  /**
   * The portal's own name within the installation, which together with `baseDomain` forms the address it is  reached at. `PUT api/2.0/portal/portalrename` changes it.
   * @return tenantAlias
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getTenantAlias() {
        return tenantAlias.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_TENANT_ALIAS, required = false)
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

  public SettingsDto displayAbout(@javax.annotation.Nullable Boolean displayAbout) {
    
    this.displayAbout = displayAbout;
    return this;
  }

  /**
   * Whether the interface may show the About page. A cloud portal always may; a server installation may unless  its plan includes branding and the vendor details hide the page.
   * @return displayAbout
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DISPLAY_ABOUT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDisplayAbout() {
    return displayAbout;
  }


  @JsonProperty(value = JSON_PROPERTY_DISPLAY_ABOUT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayAbout(@javax.annotation.Nullable Boolean displayAbout) {
    this.displayAbout = displayAbout;
  }

  public SettingsDto domainValidator(@javax.annotation.Nullable TenantDomainValidator domainValidator) {
    
    this.domainValidator = domainValidator;
    return this;
  }

  /**
   * The rules a portal name is checked against - its length limits and the pattern it has to match - so a  client can validate a rename before sending it. Filled in for a signed-in caller only.
   * @return domainValidator
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DOMAIN_VALIDATOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TenantDomainValidator getDomainValidator() {
    return domainValidator;
  }


  @JsonProperty(value = JSON_PROPERTY_DOMAIN_VALIDATOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDomainValidator(@javax.annotation.Nullable TenantDomainValidator domainValidator) {
    this.domainValidator = domainValidator;
  }

  public SettingsDto zendeskKey(@javax.annotation.Nullable String zendeskKey) {
    this.zendeskKey = JsonNullable.<String>of(zendeskKey);
    
    return this;
  }

  /**
   * The key that lets the client open the vendor's support chat, empty when the installation configures none.  Filled in for a signed-in caller only.
   * @return zendeskKey
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getZendeskKey() {
        return zendeskKey.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ZENDESK_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getZendeskKey_JsonNullable() {
    return zendeskKey;
  }
  
  @JsonProperty(JSON_PROPERTY_ZENDESK_KEY)
  public void setZendeskKey_JsonNullable(JsonNullable<String> zendeskKey) {
    this.zendeskKey = zendeskKey;
  }

  public void setZendeskKey(@javax.annotation.Nullable String zendeskKey) {
    this.zendeskKey = JsonNullable.<String>of(zendeskKey);
  }

  public SettingsDto tagManagerId(@javax.annotation.Nullable String tagManagerId) {
    this.tagManagerId = JsonNullable.<String>of(tagManagerId);
    
    return this;
  }

  /**
   * The Google Tag Manager container the client should load, empty when the installation configures none.  Filled in for a signed-in caller only.
   * @return tagManagerId
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getTagManagerId() {
        return tagManagerId.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_TAG_MANAGER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getTagManagerId_JsonNullable() {
    return tagManagerId;
  }
  
  @JsonProperty(JSON_PROPERTY_TAG_MANAGER_ID)
  public void setTagManagerId_JsonNullable(JsonNullable<String> tagManagerId) {
    this.tagManagerId = tagManagerId;
  }

  public void setTagManagerId(@javax.annotation.Nullable String tagManagerId) {
    this.tagManagerId = JsonNullable.<String>of(tagManagerId);
  }

  public SettingsDto cookieSettingsEnabled(@javax.annotation.Nonnull Boolean cookieSettingsEnabled) {
    
    this.cookieSettingsEnabled = cookieSettingsEnabled;
    return this;
  }

  /**
   * Whether the portal limits how long an authentication session stays valid. The limit itself is read with  `GET api/2.0/settings/cookiesettings`; while this is `false` a session is honoured for a year.
   * @return cookieSettingsEnabled
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_COOKIE_SETTINGS_ENABLED, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getCookieSettingsEnabled() {
    return cookieSettingsEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_COOKIE_SETTINGS_ENABLED, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCookieSettingsEnabled(@javax.annotation.Nonnull Boolean cookieSettingsEnabled) {
    this.cookieSettingsEnabled = cookieSettingsEnabled;
  }

  public SettingsDto limitedAccessSpace(@javax.annotation.Nullable Boolean limitedAccessSpace) {
    
    this.limitedAccessSpace = limitedAccessSpace;
    return this;
  }

  /**
   * Whether the space-management section is restricted to the portal owner. Filled in for a signed-in caller  only.
   * @return limitedAccessSpace
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_LIMITED_ACCESS_SPACE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getLimitedAccessSpace() {
    return limitedAccessSpace;
  }


  @JsonProperty(value = JSON_PROPERTY_LIMITED_ACCESS_SPACE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimitedAccessSpace(@javax.annotation.Nullable Boolean limitedAccessSpace) {
    this.limitedAccessSpace = limitedAccessSpace;
  }

  public SettingsDto limitedAccessDevToolsForUsers(@javax.annotation.Nullable Boolean limitedAccessDevToolsForUsers) {
    
    this.limitedAccessDevToolsForUsers = limitedAccessDevToolsForUsers;
    return this;
  }

  /**
   * Whether the Developer Tools section is hidden from members who are not administrators. Filled in for a  signed-in caller only.
   * @return limitedAccessDevToolsForUsers
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_LIMITED_ACCESS_DEV_TOOLS_FOR_USERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getLimitedAccessDevToolsForUsers() {
    return limitedAccessDevToolsForUsers;
  }


  @JsonProperty(value = JSON_PROPERTY_LIMITED_ACCESS_DEV_TOOLS_FOR_USERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimitedAccessDevToolsForUsers(@javax.annotation.Nullable Boolean limitedAccessDevToolsForUsers) {
    this.limitedAccessDevToolsForUsers = limitedAccessDevToolsForUsers;
  }

  public SettingsDto displayBanners(@javax.annotation.Nullable Boolean displayBanners) {
    
    this.displayBanners = displayBanners;
    return this;
  }

  /**
   * Whether the interface may show the vendor's promotional banners. A cloud portal always reports `true`; on  a server installation it follows the banner setting. Filled in for a signed-in caller only.
   * @return displayBanners
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DISPLAY_BANNERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDisplayBanners() {
    return displayBanners;
  }


  @JsonProperty(value = JSON_PROPERTY_DISPLAY_BANNERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayBanners(@javax.annotation.Nullable Boolean displayBanners) {
    this.displayBanners = displayBanners;
  }

  public SettingsDto aiEnabled(@javax.annotation.Nullable Boolean aiEnabled) {
    
    this.aiEnabled = aiEnabled;
    return this;
  }

  /**
   * Whether the AI features - chat, agents and vectorisation - may be used on this portal. While it is  `false` the AI Agents folder is hidden and the AI operations are refused. Filled in for a signed-in caller  only.
   * @return aiEnabled
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_AI_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAiEnabled() {
    return aiEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_AI_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAiEnabled(@javax.annotation.Nullable Boolean aiEnabled) {
    this.aiEnabled = aiEnabled;
  }

  public SettingsDto walletLowBalance(@javax.annotation.Nullable Boolean walletLowBalance) {
    this.walletLowBalance = JsonNullable.<Boolean>of(walletLowBalance);
    
    return this;
  }

  /**
   * Whether the portal wallet has already dropped below its low-balance threshold, so a client can warn about  AI operations being cut off. It is reported to DocSpace administrators only and left empty for everyone  else, which is not the same as a healthy balance.
   * @return walletLowBalance
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getWalletLowBalance() {
        return walletLowBalance.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_WALLET_LOW_BALANCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getWalletLowBalance_JsonNullable() {
    return walletLowBalance;
  }
  
  @JsonProperty(JSON_PROPERTY_WALLET_LOW_BALANCE)
  public void setWalletLowBalance_JsonNullable(JsonNullable<Boolean> walletLowBalance) {
    this.walletLowBalance = walletLowBalance;
  }

  public void setWalletLowBalance(@javax.annotation.Nullable Boolean walletLowBalance) {
    this.walletLowBalance = JsonNullable.<Boolean>of(walletLowBalance);
  }

  public SettingsDto userNameRegex(@javax.annotation.Nullable String userNameRegex) {
    this.userNameRegex = JsonNullable.<String>of(userNameRegex);
    
    return this;
  }

  /**
   * The pattern a member's first and last name has to match, so a client can validate a name before sending  it. It is a .NET regular expression and is applied to each name part separately.
   * @return userNameRegex
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getUserNameRegex() {
        return userNameRegex.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_USER_NAME_REGEX, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getUserNameRegex_JsonNullable() {
    return userNameRegex;
  }
  
  @JsonProperty(JSON_PROPERTY_USER_NAME_REGEX)
  public void setUserNameRegex_JsonNullable(JsonNullable<String> userNameRegex) {
    this.userNameRegex = userNameRegex;
  }

  public void setUserNameRegex(@javax.annotation.Nullable String userNameRegex) {
    this.userNameRegex = JsonNullable.<String>of(userNameRegex);
  }

  public SettingsDto invitationLimit(@javax.annotation.Nullable Integer invitationLimit) {
    this.invitationLimit = JsonNullable.<Integer>of(invitationLimit);
    
    return this;
  }

  /**
   * How many invitations the portal may still send in the current window. Filled in for a signed-in caller  only, and set to the maximum value of a 32-bit integer on an installation that limits nothing.
   * @return invitationLimit
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Integer getInvitationLimit() {
        return invitationLimit.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_INVITATION_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Integer> getInvitationLimit_JsonNullable() {
    return invitationLimit;
  }
  
  @JsonProperty(JSON_PROPERTY_INVITATION_LIMIT)
  public void setInvitationLimit_JsonNullable(JsonNullable<Integer> invitationLimit) {
    this.invitationLimit = invitationLimit;
  }

  public void setInvitationLimit(@javax.annotation.Nullable Integer invitationLimit) {
    this.invitationLimit = JsonNullable.<Integer>of(invitationLimit);
  }

  public SettingsDto plugins(@javax.annotation.Nullable PluginsDto plugins) {
    
    this.plugins = plugins;
    return this;
  }

  /**
   * What the installation allows to be done with web plugins. Filled in for a signed-in caller only, with all  three flags `false` unless the installation switched plugins on.
   * @return plugins
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PLUGINS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PluginsDto getPlugins() {
    return plugins;
  }


  @JsonProperty(value = JSON_PROPERTY_PLUGINS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlugins(@javax.annotation.Nullable PluginsDto plugins) {
    this.plugins = plugins;
  }

  public SettingsDto deepLink(@javax.annotation.Nonnull DeepLinkDto deepLink) {
    
    this.deepLink = deepLink;
    return this;
  }

  /**
   * What a mobile client needs to hand a document link over to the installed application instead of opening it  in the browser. Its fields are empty strings when the installation configures no application.
   * @return deepLink
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_DEEP_LINK, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DeepLinkDto getDeepLink() {
    return deepLink;
  }


  @JsonProperty(value = JSON_PROPERTY_DEEP_LINK, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDeepLink(@javax.annotation.Nonnull DeepLinkDto deepLink) {
    this.deepLink = deepLink;
  }

  public SettingsDto formGallery(@javax.annotation.Nullable FormGalleryDto formGallery) {
    
    this.formGallery = formGallery;
    return this;
  }

  /**
   * Where the ready-made form templates are served from and which extension they carry. Filled in for a  signed-in caller only.
   * @return formGallery
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_FORM_GALLERY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FormGalleryDto getFormGallery() {
    return formGallery;
  }


  @JsonProperty(value = JSON_PROPERTY_FORM_GALLERY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormGallery(@javax.annotation.Nullable FormGalleryDto formGallery) {
    this.formGallery = formGallery;
  }

  public SettingsDto maxImageUploadSize(@javax.annotation.Nullable Long maxImageUploadSize) {
    
    this.maxImageUploadSize = maxImageUploadSize;
    return this;
  }

  /**
   * The largest image the portal accepts as a logo or an avatar, in bytes. Filled in for a signed-in caller  only, and a larger upload is refused rather than resized.
   * @return maxImageUploadSize
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_MAX_IMAGE_UPLOAD_SIZE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMaxImageUploadSize() {
    return maxImageUploadSize;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_IMAGE_UPLOAD_SIZE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxImageUploadSize(@javax.annotation.Nullable Long maxImageUploadSize) {
    this.maxImageUploadSize = maxImageUploadSize;
  }

  public SettingsDto logoText(@javax.annotation.Nullable String logoText) {
    this.logoText = JsonNullable.<String>of(logoText);
    
    return this;
  }

  /**
   * The wordmark to print next to the portal logo. It falls back to the built-in one while the portal has  stored no text of its own, so it is never empty.
   * @return logoText
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getLogoText() {
        return logoText.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_LOGO_TEXT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getLogoText_JsonNullable() {
    return logoText;
  }
  
  @JsonProperty(JSON_PROPERTY_LOGO_TEXT)
  public void setLogoText_JsonNullable(JsonNullable<String> logoText) {
    this.logoText = logoText;
  }

  public void setLogoText(@javax.annotation.Nullable String logoText) {
    this.logoText = JsonNullable.<String>of(logoText);
  }

  public SettingsDto externalResources(@javax.annotation.Nullable CultureSpecificExternalResources externalResources) {
    
    this.externalResources = externalResources;
    return this;
  }

  /**
   * The addresses of the vendor's help, support, forum and video resources, already picked for the portal  language. An entry is missing when the installation configures no address for it or the resource is  switched off, which `GET api/2.0/settings/rebranding/additional` reports flag by flag.
   * @return externalResources
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_EXTERNAL_RESOURCES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CultureSpecificExternalResources getExternalResources() {
    return externalResources;
  }


  @JsonProperty(value = JSON_PROPERTY_EXTERNAL_RESOURCES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalResources(@javax.annotation.Nullable CultureSpecificExternalResources externalResources) {
    this.externalResources = externalResources;
  }

  public SettingsDto defaultFolderType(@javax.annotation.Nullable FolderType defaultFolderType) {
    
    this.defaultFolderType = defaultFolderType;
    return this;
  }

  /**
   * The section the client should open after sign-in, which is the caller's own preference rather than a  portal-wide one. Filled in for a signed-in caller only.
   * @return defaultFolderType
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DEFAULT_FOLDER_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FolderType getDefaultFolderType() {
    return defaultFolderType;
  }


  @JsonProperty(value = JSON_PROPERTY_DEFAULT_FOLDER_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultFolderType(@javax.annotation.Nullable FolderType defaultFolderType) {
    this.defaultFolderType = defaultFolderType;
  }

  public SettingsDto externalDbEnabled(@javax.annotation.Nullable Boolean externalDbEnabled) {
    
    this.externalDbEnabled = externalDbEnabled;
    return this;
  }

  /**
   * Whether the installation has an external database wired up for form results, without which the operations  that write form results there are refused. Filled in for a signed-in caller only.
   * @return externalDbEnabled
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_EXTERNAL_DB_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getExternalDbEnabled() {
    return externalDbEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_EXTERNAL_DB_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalDbEnabled(@javax.annotation.Nullable Boolean externalDbEnabled) {
    this.externalDbEnabled = externalDbEnabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettingsDto settingsDto = (SettingsDto) o;
    return equalsNullable(this.timezone, settingsDto.timezone) &&
        equalsNullable(this.trustedDomains, settingsDto.trustedDomains) &&
        Objects.equals(this.trustedDomainsType, settingsDto.trustedDomainsType) &&
        Objects.equals(this.culture, settingsDto.culture) &&
        Objects.equals(this.utcOffset, settingsDto.utcOffset) &&
        Objects.equals(this.utcHoursOffset, settingsDto.utcHoursOffset) &&
        equalsNullable(this.greetingSettings, settingsDto.greetingSettings) &&
        Objects.equals(this.ownerId, settingsDto.ownerId) &&
        equalsNullable(this.nameSchemaId, settingsDto.nameSchemaId) &&
        equalsNullable(this.enabledJoin, settingsDto.enabledJoin) &&
        equalsNullable(this.enableAdmMess, settingsDto.enableAdmMess) &&
        equalsNullable(this.thirdpartyEnable, settingsDto.thirdpartyEnable) &&
        Objects.equals(this.docSpace, settingsDto.docSpace) &&
        Objects.equals(this.standalone, settingsDto.standalone) &&
        Objects.equals(this.isAmi, settingsDto.isAmi) &&
        Objects.equals(this.baseDomain, settingsDto.baseDomain) &&
        equalsNullable(this.wizardToken, settingsDto.wizardToken) &&
        Objects.equals(this.passwordHash, settingsDto.passwordHash) &&
        Objects.equals(this.firebase, settingsDto.firebase) &&
        equalsNullable(this.version, settingsDto.version) &&
        Objects.equals(this.recaptchaType, settingsDto.recaptchaType) &&
        equalsNullable(this.recaptchaPublicKey, settingsDto.recaptchaPublicKey) &&
        Objects.equals(this.debugInfo, settingsDto.debugInfo) &&
        equalsNullable(this.socketUrl, settingsDto.socketUrl) &&
        Objects.equals(this.tenantStatus, settingsDto.tenantStatus) &&
        equalsNullable(this.tenantAlias, settingsDto.tenantAlias) &&
        Objects.equals(this.displayAbout, settingsDto.displayAbout) &&
        Objects.equals(this.domainValidator, settingsDto.domainValidator) &&
        equalsNullable(this.zendeskKey, settingsDto.zendeskKey) &&
        equalsNullable(this.tagManagerId, settingsDto.tagManagerId) &&
        Objects.equals(this.cookieSettingsEnabled, settingsDto.cookieSettingsEnabled) &&
        Objects.equals(this.limitedAccessSpace, settingsDto.limitedAccessSpace) &&
        Objects.equals(this.limitedAccessDevToolsForUsers, settingsDto.limitedAccessDevToolsForUsers) &&
        Objects.equals(this.displayBanners, settingsDto.displayBanners) &&
        Objects.equals(this.aiEnabled, settingsDto.aiEnabled) &&
        equalsNullable(this.walletLowBalance, settingsDto.walletLowBalance) &&
        equalsNullable(this.userNameRegex, settingsDto.userNameRegex) &&
        equalsNullable(this.invitationLimit, settingsDto.invitationLimit) &&
        Objects.equals(this.plugins, settingsDto.plugins) &&
        Objects.equals(this.deepLink, settingsDto.deepLink) &&
        Objects.equals(this.formGallery, settingsDto.formGallery) &&
        Objects.equals(this.maxImageUploadSize, settingsDto.maxImageUploadSize) &&
        equalsNullable(this.logoText, settingsDto.logoText) &&
        Objects.equals(this.externalResources, settingsDto.externalResources) &&
        Objects.equals(this.defaultFolderType, settingsDto.defaultFolderType) &&
        Objects.equals(this.externalDbEnabled, settingsDto.externalDbEnabled);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(timezone), hashCodeNullable(trustedDomains), trustedDomainsType, culture, utcOffset, utcHoursOffset, hashCodeNullable(greetingSettings), ownerId, hashCodeNullable(nameSchemaId), hashCodeNullable(enabledJoin), hashCodeNullable(enableAdmMess), hashCodeNullable(thirdpartyEnable), docSpace, standalone, isAmi, baseDomain, hashCodeNullable(wizardToken), passwordHash, firebase, hashCodeNullable(version), recaptchaType, hashCodeNullable(recaptchaPublicKey), debugInfo, hashCodeNullable(socketUrl), tenantStatus, hashCodeNullable(tenantAlias), displayAbout, domainValidator, hashCodeNullable(zendeskKey), hashCodeNullable(tagManagerId), cookieSettingsEnabled, limitedAccessSpace, limitedAccessDevToolsForUsers, displayBanners, aiEnabled, hashCodeNullable(walletLowBalance), hashCodeNullable(userNameRegex), hashCodeNullable(invitationLimit), plugins, deepLink, formGallery, maxImageUploadSize, hashCodeNullable(logoText), externalResources, defaultFolderType, externalDbEnabled);
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
    sb.append("class SettingsDto {\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    trustedDomains: ").append(toIndentedString(trustedDomains)).append("\n");
    sb.append("    trustedDomainsType: ").append(toIndentedString(trustedDomainsType)).append("\n");
    sb.append("    culture: ").append(toIndentedString(culture)).append("\n");
    sb.append("    utcOffset: ").append(toIndentedString(utcOffset)).append("\n");
    sb.append("    utcHoursOffset: ").append(toIndentedString(utcHoursOffset)).append("\n");
    sb.append("    greetingSettings: ").append(toIndentedString(greetingSettings)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    nameSchemaId: ").append(toIndentedString(nameSchemaId)).append("\n");
    sb.append("    enabledJoin: ").append(toIndentedString(enabledJoin)).append("\n");
    sb.append("    enableAdmMess: ").append(toIndentedString(enableAdmMess)).append("\n");
    sb.append("    thirdpartyEnable: ").append(toIndentedString(thirdpartyEnable)).append("\n");
    sb.append("    docSpace: ").append(toIndentedString(docSpace)).append("\n");
    sb.append("    standalone: ").append(toIndentedString(standalone)).append("\n");
    sb.append("    isAmi: ").append(toIndentedString(isAmi)).append("\n");
    sb.append("    baseDomain: ").append(toIndentedString(baseDomain)).append("\n");
    sb.append("    wizardToken: ").append(toIndentedString(wizardToken)).append("\n");
    sb.append("    passwordHash: ").append(toIndentedString(passwordHash)).append("\n");
    sb.append("    firebase: ").append(toIndentedString(firebase)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    recaptchaType: ").append(toIndentedString(recaptchaType)).append("\n");
    sb.append("    recaptchaPublicKey: ").append(toIndentedString(recaptchaPublicKey)).append("\n");
    sb.append("    debugInfo: ").append(toIndentedString(debugInfo)).append("\n");
    sb.append("    socketUrl: ").append(toIndentedString(socketUrl)).append("\n");
    sb.append("    tenantStatus: ").append(toIndentedString(tenantStatus)).append("\n");
    sb.append("    tenantAlias: ").append(toIndentedString(tenantAlias)).append("\n");
    sb.append("    displayAbout: ").append(toIndentedString(displayAbout)).append("\n");
    sb.append("    domainValidator: ").append(toIndentedString(domainValidator)).append("\n");
    sb.append("    zendeskKey: ").append(toIndentedString(zendeskKey)).append("\n");
    sb.append("    tagManagerId: ").append(toIndentedString(tagManagerId)).append("\n");
    sb.append("    cookieSettingsEnabled: ").append(toIndentedString(cookieSettingsEnabled)).append("\n");
    sb.append("    limitedAccessSpace: ").append(toIndentedString(limitedAccessSpace)).append("\n");
    sb.append("    limitedAccessDevToolsForUsers: ").append(toIndentedString(limitedAccessDevToolsForUsers)).append("\n");
    sb.append("    displayBanners: ").append(toIndentedString(displayBanners)).append("\n");
    sb.append("    aiEnabled: ").append(toIndentedString(aiEnabled)).append("\n");
    sb.append("    walletLowBalance: ").append(toIndentedString(walletLowBalance)).append("\n");
    sb.append("    userNameRegex: ").append(toIndentedString(userNameRegex)).append("\n");
    sb.append("    invitationLimit: ").append(toIndentedString(invitationLimit)).append("\n");
    sb.append("    plugins: ").append(toIndentedString(plugins)).append("\n");
    sb.append("    deepLink: ").append(toIndentedString(deepLink)).append("\n");
    sb.append("    formGallery: ").append(toIndentedString(formGallery)).append("\n");
    sb.append("    maxImageUploadSize: ").append(toIndentedString(maxImageUploadSize)).append("\n");
    sb.append("    logoText: ").append(toIndentedString(logoText)).append("\n");
    sb.append("    externalResources: ").append(toIndentedString(externalResources)).append("\n");
    sb.append("    defaultFolderType: ").append(toIndentedString(defaultFolderType)).append("\n");
    sb.append("    externalDbEnabled: ").append(toIndentedString(externalDbEnabled)).append("\n");
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

    // add `timezone` to the URL query string
    if (getTimezone() != null) {
      try {
        joiner.add(String.format("%stimezone%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTimezone()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `trustedDomainsType` to the URL query string
    if (getTrustedDomainsType() != null) {
      try {
        joiner.add(String.format("%strustedDomainsType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTrustedDomainsType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `culture` to the URL query string
    if (getCulture() != null) {
      try {
        joiner.add(String.format("%sculture%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCulture()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `utcOffset` to the URL query string
    if (getUtcOffset() != null) {
      try {
        joiner.add(String.format("%sutcOffset%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUtcOffset()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `utcHoursOffset` to the URL query string
    if (getUtcHoursOffset() != null) {
      try {
        joiner.add(String.format("%sutcHoursOffset%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUtcHoursOffset()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `greetingSettings` to the URL query string
    if (getGreetingSettings() != null) {
      try {
        joiner.add(String.format("%sgreetingSettings%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getGreetingSettings()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `nameSchemaId` to the URL query string
    if (getNameSchemaId() != null) {
      try {
        joiner.add(String.format("%snameSchemaId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNameSchemaId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `enabledJoin` to the URL query string
    if (getEnabledJoin() != null) {
      try {
        joiner.add(String.format("%senabledJoin%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnabledJoin()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `enableAdmMess` to the URL query string
    if (getEnableAdmMess() != null) {
      try {
        joiner.add(String.format("%senableAdmMess%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnableAdmMess()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `thirdpartyEnable` to the URL query string
    if (getThirdpartyEnable() != null) {
      try {
        joiner.add(String.format("%sthirdpartyEnable%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getThirdpartyEnable()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `docSpace` to the URL query string
    if (getDocSpace() != null) {
      try {
        joiner.add(String.format("%sdocSpace%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDocSpace()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `standalone` to the URL query string
    if (getStandalone() != null) {
      try {
        joiner.add(String.format("%sstandalone%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStandalone()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isAmi` to the URL query string
    if (getIsAmi() != null) {
      try {
        joiner.add(String.format("%sisAmi%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsAmi()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `baseDomain` to the URL query string
    if (getBaseDomain() != null) {
      try {
        joiner.add(String.format("%sbaseDomain%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBaseDomain()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `wizardToken` to the URL query string
    if (getWizardToken() != null) {
      try {
        joiner.add(String.format("%swizardToken%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWizardToken()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `passwordHash` to the URL query string
    if (getPasswordHash() != null) {
      joiner.add(getPasswordHash().toUrlQueryString(prefix + "passwordHash" + suffix));
    }

    // add `firebase` to the URL query string
    if (getFirebase() != null) {
      joiner.add(getFirebase().toUrlQueryString(prefix + "firebase" + suffix));
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

    // add `recaptchaType` to the URL query string
    if (getRecaptchaType() != null) {
      try {
        joiner.add(String.format("%srecaptchaType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRecaptchaType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `recaptchaPublicKey` to the URL query string
    if (getRecaptchaPublicKey() != null) {
      try {
        joiner.add(String.format("%srecaptchaPublicKey%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRecaptchaPublicKey()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `debugInfo` to the URL query string
    if (getDebugInfo() != null) {
      try {
        joiner.add(String.format("%sdebugInfo%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDebugInfo()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `socketUrl` to the URL query string
    if (getSocketUrl() != null) {
      try {
        joiner.add(String.format("%ssocketUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSocketUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `tenantStatus` to the URL query string
    if (getTenantStatus() != null) {
      try {
        joiner.add(String.format("%stenantStatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTenantStatus()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `displayAbout` to the URL query string
    if (getDisplayAbout() != null) {
      try {
        joiner.add(String.format("%sdisplayAbout%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDisplayAbout()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `domainValidator` to the URL query string
    if (getDomainValidator() != null) {
      joiner.add(getDomainValidator().toUrlQueryString(prefix + "domainValidator" + suffix));
    }

    // add `zendeskKey` to the URL query string
    if (getZendeskKey() != null) {
      try {
        joiner.add(String.format("%szendeskKey%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getZendeskKey()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `tagManagerId` to the URL query string
    if (getTagManagerId() != null) {
      try {
        joiner.add(String.format("%stagManagerId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTagManagerId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `cookieSettingsEnabled` to the URL query string
    if (getCookieSettingsEnabled() != null) {
      try {
        joiner.add(String.format("%scookieSettingsEnabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCookieSettingsEnabled()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `limitedAccessSpace` to the URL query string
    if (getLimitedAccessSpace() != null) {
      try {
        joiner.add(String.format("%slimitedAccessSpace%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLimitedAccessSpace()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `limitedAccessDevToolsForUsers` to the URL query string
    if (getLimitedAccessDevToolsForUsers() != null) {
      try {
        joiner.add(String.format("%slimitedAccessDevToolsForUsers%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLimitedAccessDevToolsForUsers()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `displayBanners` to the URL query string
    if (getDisplayBanners() != null) {
      try {
        joiner.add(String.format("%sdisplayBanners%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDisplayBanners()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `aiEnabled` to the URL query string
    if (getAiEnabled() != null) {
      try {
        joiner.add(String.format("%saiEnabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAiEnabled()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `walletLowBalance` to the URL query string
    if (getWalletLowBalance() != null) {
      try {
        joiner.add(String.format("%swalletLowBalance%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWalletLowBalance()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `userNameRegex` to the URL query string
    if (getUserNameRegex() != null) {
      try {
        joiner.add(String.format("%suserNameRegex%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUserNameRegex()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `invitationLimit` to the URL query string
    if (getInvitationLimit() != null) {
      try {
        joiner.add(String.format("%sinvitationLimit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInvitationLimit()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `plugins` to the URL query string
    if (getPlugins() != null) {
      joiner.add(getPlugins().toUrlQueryString(prefix + "plugins" + suffix));
    }

    // add `deepLink` to the URL query string
    if (getDeepLink() != null) {
      joiner.add(getDeepLink().toUrlQueryString(prefix + "deepLink" + suffix));
    }

    // add `formGallery` to the URL query string
    if (getFormGallery() != null) {
      joiner.add(getFormGallery().toUrlQueryString(prefix + "formGallery" + suffix));
    }

    // add `maxImageUploadSize` to the URL query string
    if (getMaxImageUploadSize() != null) {
      try {
        joiner.add(String.format("%smaxImageUploadSize%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxImageUploadSize()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `logoText` to the URL query string
    if (getLogoText() != null) {
      try {
        joiner.add(String.format("%slogoText%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLogoText()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `externalResources` to the URL query string
    if (getExternalResources() != null) {
      joiner.add(getExternalResources().toUrlQueryString(prefix + "externalResources" + suffix));
    }

    // add `defaultFolderType` to the URL query string
    if (getDefaultFolderType() != null) {
      try {
        joiner.add(String.format("%sdefaultFolderType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDefaultFolderType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `externalDbEnabled` to the URL query string
    if (getExternalDbEnabled() != null) {
      try {
        joiner.add(String.format("%sexternalDbEnabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExternalDbEnabled()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

