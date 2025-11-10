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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.client.model.ApiDateTime;
import org.openapitools.client.model.Contact;
import org.openapitools.client.model.DarkThemeSettingsType;
import org.openapitools.client.model.EmployeeActivationStatus;
import org.openapitools.client.model.EmployeeDto;
import org.openapitools.client.model.EmployeeStatus;
import org.openapitools.client.model.GroupSummaryDto;
import org.openapitools.client.model.MobilePhoneActivationStatus;
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
 * The full list of user parameters.
 */
@JsonPropertyOrder({
  EmployeeFullDto.JSON_PROPERTY_ID,
  EmployeeFullDto.JSON_PROPERTY_DISPLAY_NAME,
  EmployeeFullDto.JSON_PROPERTY_TITLE,
  EmployeeFullDto.JSON_PROPERTY_AVATAR,
  EmployeeFullDto.JSON_PROPERTY_AVATAR_ORIGINAL,
  EmployeeFullDto.JSON_PROPERTY_AVATAR_MAX,
  EmployeeFullDto.JSON_PROPERTY_AVATAR_MEDIUM,
  EmployeeFullDto.JSON_PROPERTY_AVATAR_SMALL,
  EmployeeFullDto.JSON_PROPERTY_PROFILE_URL,
  EmployeeFullDto.JSON_PROPERTY_HAS_AVATAR,
  EmployeeFullDto.JSON_PROPERTY_IS_ANONIM,
  EmployeeFullDto.JSON_PROPERTY_FIRST_NAME,
  EmployeeFullDto.JSON_PROPERTY_LAST_NAME,
  EmployeeFullDto.JSON_PROPERTY_USER_NAME,
  EmployeeFullDto.JSON_PROPERTY_EMAIL,
  EmployeeFullDto.JSON_PROPERTY_CONTACTS,
  EmployeeFullDto.JSON_PROPERTY_BIRTHDAY,
  EmployeeFullDto.JSON_PROPERTY_SEX,
  EmployeeFullDto.JSON_PROPERTY_STATUS,
  EmployeeFullDto.JSON_PROPERTY_ACTIVATION_STATUS,
  EmployeeFullDto.JSON_PROPERTY_TERMINATED,
  EmployeeFullDto.JSON_PROPERTY_DEPARTMENT,
  EmployeeFullDto.JSON_PROPERTY_WORK_FROM,
  EmployeeFullDto.JSON_PROPERTY_GROUPS,
  EmployeeFullDto.JSON_PROPERTY_LOCATION,
  EmployeeFullDto.JSON_PROPERTY_NOTES,
  EmployeeFullDto.JSON_PROPERTY_IS_ADMIN,
  EmployeeFullDto.JSON_PROPERTY_IS_ROOM_ADMIN,
  EmployeeFullDto.JSON_PROPERTY_IS_L_D_A_P,
  EmployeeFullDto.JSON_PROPERTY_LIST_ADMIN_MODULES,
  EmployeeFullDto.JSON_PROPERTY_IS_OWNER,
  EmployeeFullDto.JSON_PROPERTY_IS_VISITOR,
  EmployeeFullDto.JSON_PROPERTY_IS_COLLABORATOR,
  EmployeeFullDto.JSON_PROPERTY_CULTURE_NAME,
  EmployeeFullDto.JSON_PROPERTY_MOBILE_PHONE,
  EmployeeFullDto.JSON_PROPERTY_MOBILE_PHONE_ACTIVATION_STATUS,
  EmployeeFullDto.JSON_PROPERTY_IS_S_S_O,
  EmployeeFullDto.JSON_PROPERTY_THEME,
  EmployeeFullDto.JSON_PROPERTY_QUOTA_LIMIT,
  EmployeeFullDto.JSON_PROPERTY_USED_SPACE,
  EmployeeFullDto.JSON_PROPERTY_SHARED,
  EmployeeFullDto.JSON_PROPERTY_IS_CUSTOM_QUOTA,
  EmployeeFullDto.JSON_PROPERTY_LOGIN_EVENT_ID,
  EmployeeFullDto.JSON_PROPERTY_AUTH_COOKIE_LIFETIME,
  EmployeeFullDto.JSON_PROPERTY_CREATED_BY,
  EmployeeFullDto.JSON_PROPERTY_REGISTRATION_DATE,
  EmployeeFullDto.JSON_PROPERTY_HAS_PERSONAL_FOLDER,
  EmployeeFullDto.JSON_PROPERTY_TFA_APP_ENABLED
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class EmployeeFullDto {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private UUID id;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  @javax.annotation.Nullable
  private JsonNullable<String> displayName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable
  private JsonNullable<String> title = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_AVATAR = "avatar";
  @javax.annotation.Nullable
  private JsonNullable<String> avatar = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_AVATAR_ORIGINAL = "avatarOriginal";
  @javax.annotation.Nullable
  private JsonNullable<String> avatarOriginal = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_AVATAR_MAX = "avatarMax";
  @javax.annotation.Nullable
  private JsonNullable<String> avatarMax = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_AVATAR_MEDIUM = "avatarMedium";
  @javax.annotation.Nullable
  private JsonNullable<String> avatarMedium = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_AVATAR_SMALL = "avatarSmall";
  @javax.annotation.Nullable
  private JsonNullable<String> avatarSmall = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PROFILE_URL = "profileUrl";
  @javax.annotation.Nullable
  private JsonNullable<String> profileUrl = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_HAS_AVATAR = "hasAvatar";
  @javax.annotation.Nullable
  private Boolean hasAvatar;

  public static final String JSON_PROPERTY_IS_ANONIM = "isAnonim";
  @javax.annotation.Nullable
  private Boolean isAnonim;

  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  @javax.annotation.Nullable
  private JsonNullable<String> firstName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  @javax.annotation.Nullable
  private JsonNullable<String> lastName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_USER_NAME = "userName";
  @javax.annotation.Nullable
  private JsonNullable<String> userName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EMAIL = "email";
  @javax.annotation.Nullable
  private JsonNullable<String> email = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CONTACTS = "contacts";
  @javax.annotation.Nullable
  private JsonNullable<List<Contact>> contacts = JsonNullable.<List<Contact>>undefined();

  public static final String JSON_PROPERTY_BIRTHDAY = "birthday";
  @javax.annotation.Nullable
  private ApiDateTime birthday;

  public static final String JSON_PROPERTY_SEX = "sex";
  @javax.annotation.Nullable
  private JsonNullable<String> sex = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nullable
  private EmployeeStatus status;

  public static final String JSON_PROPERTY_ACTIVATION_STATUS = "activationStatus";
  @javax.annotation.Nullable
  private EmployeeActivationStatus activationStatus;

  public static final String JSON_PROPERTY_TERMINATED = "terminated";
  @javax.annotation.Nullable
  private ApiDateTime terminated;

  public static final String JSON_PROPERTY_DEPARTMENT = "department";
  @javax.annotation.Nullable
  private JsonNullable<String> department = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_WORK_FROM = "workFrom";
  @javax.annotation.Nullable
  private ApiDateTime workFrom;

  public static final String JSON_PROPERTY_GROUPS = "groups";
  @javax.annotation.Nullable
  private JsonNullable<List<GroupSummaryDto>> groups = JsonNullable.<List<GroupSummaryDto>>undefined();

  public static final String JSON_PROPERTY_LOCATION = "location";
  @javax.annotation.Nullable
  private JsonNullable<String> location = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NOTES = "notes";
  @javax.annotation.Nullable
  private JsonNullable<String> notes = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IS_ADMIN = "isAdmin";
  @javax.annotation.Nullable
  private Boolean isAdmin;

  public static final String JSON_PROPERTY_IS_ROOM_ADMIN = "isRoomAdmin";
  @javax.annotation.Nullable
  private Boolean isRoomAdmin;

  public static final String JSON_PROPERTY_IS_L_D_A_P = "isLDAP";
  @javax.annotation.Nullable
  private Boolean isLDAP;

  public static final String JSON_PROPERTY_LIST_ADMIN_MODULES = "listAdminModules";
  @javax.annotation.Nullable
  private JsonNullable<List<String>> listAdminModules = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_IS_OWNER = "isOwner";
  @javax.annotation.Nullable
  private Boolean isOwner;

  public static final String JSON_PROPERTY_IS_VISITOR = "isVisitor";
  @javax.annotation.Nullable
  private Boolean isVisitor;

  public static final String JSON_PROPERTY_IS_COLLABORATOR = "isCollaborator";
  @javax.annotation.Nullable
  private Boolean isCollaborator;

  public static final String JSON_PROPERTY_CULTURE_NAME = "cultureName";
  @javax.annotation.Nullable
  private JsonNullable<String> cultureName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MOBILE_PHONE = "mobilePhone";
  @javax.annotation.Nullable
  private JsonNullable<String> mobilePhone = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MOBILE_PHONE_ACTIVATION_STATUS = "mobilePhoneActivationStatus";
  @javax.annotation.Nullable
  private MobilePhoneActivationStatus mobilePhoneActivationStatus;

  public static final String JSON_PROPERTY_IS_S_S_O = "isSSO";
  @javax.annotation.Nullable
  private Boolean isSSO;

  public static final String JSON_PROPERTY_THEME = "theme";
  @javax.annotation.Nullable
  private DarkThemeSettingsType theme;

  public static final String JSON_PROPERTY_QUOTA_LIMIT = "quotaLimit";
  @javax.annotation.Nullable
  private JsonNullable<Long> quotaLimit = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_USED_SPACE = "usedSpace";
  @javax.annotation.Nullable
  private JsonNullable<Double> usedSpace = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_SHARED = "shared";
  @javax.annotation.Nullable
  private JsonNullable<Boolean> shared = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_IS_CUSTOM_QUOTA = "isCustomQuota";
  @javax.annotation.Nullable
  private JsonNullable<Boolean> isCustomQuota = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_LOGIN_EVENT_ID = "loginEventId";
  @javax.annotation.Nullable
  private JsonNullable<Integer> loginEventId = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_AUTH_COOKIE_LIFETIME = "authCookieLifetime";
  @javax.annotation.Nullable
  private JsonNullable<Double> authCookieLifetime = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  @javax.annotation.Nullable
  private EmployeeDto createdBy;

  public static final String JSON_PROPERTY_REGISTRATION_DATE = "registrationDate";
  @javax.annotation.Nullable
  private ApiDateTime registrationDate;

  public static final String JSON_PROPERTY_HAS_PERSONAL_FOLDER = "hasPersonalFolder";
  @javax.annotation.Nullable
  private Boolean hasPersonalFolder;

  public static final String JSON_PROPERTY_TFA_APP_ENABLED = "tfaAppEnabled";
  @javax.annotation.Nullable
  private JsonNullable<Boolean> tfaAppEnabled = JsonNullable.<Boolean>undefined();

  public EmployeeFullDto() {
  }

  public EmployeeFullDto id(@javax.annotation.Nullable UUID id) {
    
    this.id = id;
    return this;
  }

  /**
   * The user ID.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable UUID id) {
    this.id = id;
  }

  public EmployeeFullDto displayName(@javax.annotation.Nullable String displayName) {
    this.displayName = JsonNullable.<String>of(displayName);
    
    return this;
  }

  /**
   * The user display name.
   * @return displayName
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getDisplayName() {
        return displayName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDisplayName_JsonNullable() {
    return displayName;
  }
  
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  public void setDisplayName_JsonNullable(JsonNullable<String> displayName) {
    this.displayName = displayName;
  }

  public void setDisplayName(@javax.annotation.Nullable String displayName) {
    this.displayName = JsonNullable.<String>of(displayName);
  }

  public EmployeeFullDto title(@javax.annotation.Nullable String title) {
    this.title = JsonNullable.<String>of(title);
    
    return this;
  }

  /**
   * The user title.
   * @return title
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getTitle() {
        return title.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTitle_JsonNullable() {
    return title;
  }
  
  @JsonProperty(JSON_PROPERTY_TITLE)
  public void setTitle_JsonNullable(JsonNullable<String> title) {
    this.title = title;
  }

  public void setTitle(@javax.annotation.Nullable String title) {
    this.title = JsonNullable.<String>of(title);
  }

  public EmployeeFullDto avatar(@javax.annotation.Nullable String avatar) {
    this.avatar = JsonNullable.<String>of(avatar);
    
    return this;
  }

  /**
   * The user avatar.
   * @return avatar
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getAvatar() {
        return avatar.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AVATAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAvatar_JsonNullable() {
    return avatar;
  }
  
  @JsonProperty(JSON_PROPERTY_AVATAR)
  public void setAvatar_JsonNullable(JsonNullable<String> avatar) {
    this.avatar = avatar;
  }

  public void setAvatar(@javax.annotation.Nullable String avatar) {
    this.avatar = JsonNullable.<String>of(avatar);
  }

  public EmployeeFullDto avatarOriginal(@javax.annotation.Nullable String avatarOriginal) {
    this.avatarOriginal = JsonNullable.<String>of(avatarOriginal);
    
    return this;
  }

  /**
   * The user original size avatar.
   * @return avatarOriginal
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getAvatarOriginal() {
        return avatarOriginal.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AVATAR_ORIGINAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAvatarOriginal_JsonNullable() {
    return avatarOriginal;
  }
  
  @JsonProperty(JSON_PROPERTY_AVATAR_ORIGINAL)
  public void setAvatarOriginal_JsonNullable(JsonNullable<String> avatarOriginal) {
    this.avatarOriginal = avatarOriginal;
  }

  public void setAvatarOriginal(@javax.annotation.Nullable String avatarOriginal) {
    this.avatarOriginal = JsonNullable.<String>of(avatarOriginal);
  }

  public EmployeeFullDto avatarMax(@javax.annotation.Nullable String avatarMax) {
    this.avatarMax = JsonNullable.<String>of(avatarMax);
    
    return this;
  }

  /**
   * The user maximum size avatar.
   * @return avatarMax
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getAvatarMax() {
        return avatarMax.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AVATAR_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAvatarMax_JsonNullable() {
    return avatarMax;
  }
  
  @JsonProperty(JSON_PROPERTY_AVATAR_MAX)
  public void setAvatarMax_JsonNullable(JsonNullable<String> avatarMax) {
    this.avatarMax = avatarMax;
  }

  public void setAvatarMax(@javax.annotation.Nullable String avatarMax) {
    this.avatarMax = JsonNullable.<String>of(avatarMax);
  }

  public EmployeeFullDto avatarMedium(@javax.annotation.Nullable String avatarMedium) {
    this.avatarMedium = JsonNullable.<String>of(avatarMedium);
    
    return this;
  }

  /**
   * The user medium size avatar.
   * @return avatarMedium
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getAvatarMedium() {
        return avatarMedium.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AVATAR_MEDIUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAvatarMedium_JsonNullable() {
    return avatarMedium;
  }
  
  @JsonProperty(JSON_PROPERTY_AVATAR_MEDIUM)
  public void setAvatarMedium_JsonNullable(JsonNullable<String> avatarMedium) {
    this.avatarMedium = avatarMedium;
  }

  public void setAvatarMedium(@javax.annotation.Nullable String avatarMedium) {
    this.avatarMedium = JsonNullable.<String>of(avatarMedium);
  }

  public EmployeeFullDto avatarSmall(@javax.annotation.Nullable String avatarSmall) {
    this.avatarSmall = JsonNullable.<String>of(avatarSmall);
    
    return this;
  }

  /**
   * The user small size avatar.
   * @return avatarSmall
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getAvatarSmall() {
        return avatarSmall.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AVATAR_SMALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAvatarSmall_JsonNullable() {
    return avatarSmall;
  }
  
  @JsonProperty(JSON_PROPERTY_AVATAR_SMALL)
  public void setAvatarSmall_JsonNullable(JsonNullable<String> avatarSmall) {
    this.avatarSmall = avatarSmall;
  }

  public void setAvatarSmall(@javax.annotation.Nullable String avatarSmall) {
    this.avatarSmall = JsonNullable.<String>of(avatarSmall);
  }

  public EmployeeFullDto profileUrl(@javax.annotation.Nullable String profileUrl) {
    this.profileUrl = JsonNullable.<String>of(profileUrl);
    
    return this;
  }

  /**
   * The user profile URL.
   * @return profileUrl
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getProfileUrl() {
        return profileUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROFILE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getProfileUrl_JsonNullable() {
    return profileUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_PROFILE_URL)
  public void setProfileUrl_JsonNullable(JsonNullable<String> profileUrl) {
    this.profileUrl = profileUrl;
  }

  public void setProfileUrl(@javax.annotation.Nullable String profileUrl) {
    this.profileUrl = JsonNullable.<String>of(profileUrl);
  }

  public EmployeeFullDto hasAvatar(@javax.annotation.Nullable Boolean hasAvatar) {
    
    this.hasAvatar = hasAvatar;
    return this;
  }

  /**
   * Specifies if the user has an avatar or not.
   * @return hasAvatar
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_AVATAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasAvatar() {
    return hasAvatar;
  }


  @JsonProperty(JSON_PROPERTY_HAS_AVATAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasAvatar(@javax.annotation.Nullable Boolean hasAvatar) {
    this.hasAvatar = hasAvatar;
  }

  public EmployeeFullDto isAnonim(@javax.annotation.Nullable Boolean isAnonim) {
    
    this.isAnonim = isAnonim;
    return this;
  }

  /**
   * Specifies if the user is anonymous or not.
   * @return isAnonim
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ANONIM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsAnonim() {
    return isAnonim;
  }


  @JsonProperty(JSON_PROPERTY_IS_ANONIM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsAnonim(@javax.annotation.Nullable Boolean isAnonim) {
    this.isAnonim = isAnonim;
  }

  public EmployeeFullDto firstName(@javax.annotation.Nullable String firstName) {
    this.firstName = JsonNullable.<String>of(firstName);
    
    return this;
  }

  /**
   * The user first name.
   * @return firstName
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getFirstName() {
        return firstName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFirstName_JsonNullable() {
    return firstName;
  }
  
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  public void setFirstName_JsonNullable(JsonNullable<String> firstName) {
    this.firstName = firstName;
  }

  public void setFirstName(@javax.annotation.Nullable String firstName) {
    this.firstName = JsonNullable.<String>of(firstName);
  }

  public EmployeeFullDto lastName(@javax.annotation.Nullable String lastName) {
    this.lastName = JsonNullable.<String>of(lastName);
    
    return this;
  }

  /**
   * The user last name.
   * @return lastName
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getLastName() {
        return lastName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLastName_JsonNullable() {
    return lastName;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  public void setLastName_JsonNullable(JsonNullable<String> lastName) {
    this.lastName = lastName;
  }

  public void setLastName(@javax.annotation.Nullable String lastName) {
    this.lastName = JsonNullable.<String>of(lastName);
  }

  public EmployeeFullDto userName(@javax.annotation.Nullable String userName) {
    this.userName = JsonNullable.<String>of(userName);
    
    return this;
  }

  /**
   * The user username.
   * @return userName
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getUserName() {
        return userName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUserName_JsonNullable() {
    return userName;
  }
  
  @JsonProperty(JSON_PROPERTY_USER_NAME)
  public void setUserName_JsonNullable(JsonNullable<String> userName) {
    this.userName = userName;
  }

  public void setUserName(@javax.annotation.Nullable String userName) {
    this.userName = JsonNullable.<String>of(userName);
  }

  public EmployeeFullDto email(@javax.annotation.Nullable String email) {
    this.email = JsonNullable.<String>of(email);
    
    return this;
  }

  /**
   * The user email.
   * @return email
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getEmail() {
        return email.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getEmail_JsonNullable() {
    return email;
  }
  
  @JsonProperty(JSON_PROPERTY_EMAIL)
  public void setEmail_JsonNullable(JsonNullable<String> email) {
    this.email = email;
  }

  public void setEmail(@javax.annotation.Nullable String email) {
    this.email = JsonNullable.<String>of(email);
  }

  public EmployeeFullDto contacts(@javax.annotation.Nullable List<Contact> contacts) {
    this.contacts = JsonNullable.<List<Contact>>of(contacts);
    
    return this;
  }

  public EmployeeFullDto addContactsItem(Contact contactsItem) {
    if (this.contacts == null || !this.contacts.isPresent()) {
      this.contacts = JsonNullable.<List<Contact>>of(new ArrayList<>());
    }
    try {
      this.contacts.get().add(contactsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of user contacts.
   * @return contacts
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<Contact> getContacts() {
        return contacts.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONTACTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<Contact>> getContacts_JsonNullable() {
    return contacts;
  }
  
  @JsonProperty(JSON_PROPERTY_CONTACTS)
  public void setContacts_JsonNullable(JsonNullable<List<Contact>> contacts) {
    this.contacts = contacts;
  }

  public void setContacts(@javax.annotation.Nullable List<Contact> contacts) {
    this.contacts = JsonNullable.<List<Contact>>of(contacts);
  }

  public EmployeeFullDto birthday(@javax.annotation.Nullable ApiDateTime birthday) {
    
    this.birthday = birthday;
    return this;
  }

  /**
   * Get birthday
   * @return birthday
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BIRTHDAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDateTime getBirthday() {
    return birthday;
  }


  @JsonProperty(JSON_PROPERTY_BIRTHDAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBirthday(@javax.annotation.Nullable ApiDateTime birthday) {
    this.birthday = birthday;
  }

  public EmployeeFullDto sex(@javax.annotation.Nullable String sex) {
    this.sex = JsonNullable.<String>of(sex);
    
    return this;
  }

  /**
   * The user sex.
   * @return sex
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getSex() {
        return sex.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSex_JsonNullable() {
    return sex;
  }
  
  @JsonProperty(JSON_PROPERTY_SEX)
  public void setSex_JsonNullable(JsonNullable<String> sex) {
    this.sex = sex;
  }

  public void setSex(@javax.annotation.Nullable String sex) {
    this.sex = JsonNullable.<String>of(sex);
  }

  public EmployeeFullDto status(@javax.annotation.Nullable EmployeeStatus status) {
    
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

  public EmployeeStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(@javax.annotation.Nullable EmployeeStatus status) {
    this.status = status;
  }

  public EmployeeFullDto activationStatus(@javax.annotation.Nullable EmployeeActivationStatus activationStatus) {
    
    this.activationStatus = activationStatus;
    return this;
  }

  /**
   * Get activationStatus
   * @return activationStatus
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVATION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EmployeeActivationStatus getActivationStatus() {
    return activationStatus;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVATION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActivationStatus(@javax.annotation.Nullable EmployeeActivationStatus activationStatus) {
    this.activationStatus = activationStatus;
  }

  public EmployeeFullDto terminated(@javax.annotation.Nullable ApiDateTime terminated) {
    
    this.terminated = terminated;
    return this;
  }

  /**
   * Get terminated
   * @return terminated
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TERMINATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDateTime getTerminated() {
    return terminated;
  }


  @JsonProperty(JSON_PROPERTY_TERMINATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTerminated(@javax.annotation.Nullable ApiDateTime terminated) {
    this.terminated = terminated;
  }

  public EmployeeFullDto department(@javax.annotation.Nullable String department) {
    this.department = JsonNullable.<String>of(department);
    
    return this;
  }

  /**
   * The user department.
   * @return department
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getDepartment() {
        return department.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DEPARTMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDepartment_JsonNullable() {
    return department;
  }
  
  @JsonProperty(JSON_PROPERTY_DEPARTMENT)
  public void setDepartment_JsonNullable(JsonNullable<String> department) {
    this.department = department;
  }

  public void setDepartment(@javax.annotation.Nullable String department) {
    this.department = JsonNullable.<String>of(department);
  }

  public EmployeeFullDto workFrom(@javax.annotation.Nullable ApiDateTime workFrom) {
    
    this.workFrom = workFrom;
    return this;
  }

  /**
   * Get workFrom
   * @return workFrom
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WORK_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDateTime getWorkFrom() {
    return workFrom;
  }


  @JsonProperty(JSON_PROPERTY_WORK_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWorkFrom(@javax.annotation.Nullable ApiDateTime workFrom) {
    this.workFrom = workFrom;
  }

  public EmployeeFullDto groups(@javax.annotation.Nullable List<GroupSummaryDto> groups) {
    this.groups = JsonNullable.<List<GroupSummaryDto>>of(groups);
    
    return this;
  }

  public EmployeeFullDto addGroupsItem(GroupSummaryDto groupsItem) {
    if (this.groups == null || !this.groups.isPresent()) {
      this.groups = JsonNullable.<List<GroupSummaryDto>>of(new ArrayList<>());
    }
    try {
      this.groups.get().add(groupsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of user groups.
   * @return groups
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<GroupSummaryDto> getGroups() {
        return groups.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<GroupSummaryDto>> getGroups_JsonNullable() {
    return groups;
  }
  
  @JsonProperty(JSON_PROPERTY_GROUPS)
  public void setGroups_JsonNullable(JsonNullable<List<GroupSummaryDto>> groups) {
    this.groups = groups;
  }

  public void setGroups(@javax.annotation.Nullable List<GroupSummaryDto> groups) {
    this.groups = JsonNullable.<List<GroupSummaryDto>>of(groups);
  }

  public EmployeeFullDto location(@javax.annotation.Nullable String location) {
    this.location = JsonNullable.<String>of(location);
    
    return this;
  }

  /**
   * The user location.
   * @return location
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getLocation() {
        return location.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLocation_JsonNullable() {
    return location;
  }
  
  @JsonProperty(JSON_PROPERTY_LOCATION)
  public void setLocation_JsonNullable(JsonNullable<String> location) {
    this.location = location;
  }

  public void setLocation(@javax.annotation.Nullable String location) {
    this.location = JsonNullable.<String>of(location);
  }

  public EmployeeFullDto notes(@javax.annotation.Nullable String notes) {
    this.notes = JsonNullable.<String>of(notes);
    
    return this;
  }

  /**
   * The user notes.
   * @return notes
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getNotes() {
        return notes.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getNotes_JsonNullable() {
    return notes;
  }
  
  @JsonProperty(JSON_PROPERTY_NOTES)
  public void setNotes_JsonNullable(JsonNullable<String> notes) {
    this.notes = notes;
  }

  public void setNotes(@javax.annotation.Nullable String notes) {
    this.notes = JsonNullable.<String>of(notes);
  }

  public EmployeeFullDto isAdmin(@javax.annotation.Nullable Boolean isAdmin) {
    
    this.isAdmin = isAdmin;
    return this;
  }

  /**
   * Specifies if the user is an administrator or not.
   * @return isAdmin
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ADMIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsAdmin() {
    return isAdmin;
  }


  @JsonProperty(JSON_PROPERTY_IS_ADMIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsAdmin(@javax.annotation.Nullable Boolean isAdmin) {
    this.isAdmin = isAdmin;
  }

  public EmployeeFullDto isRoomAdmin(@javax.annotation.Nullable Boolean isRoomAdmin) {
    
    this.isRoomAdmin = isRoomAdmin;
    return this;
  }

  /**
   * Specifies if the user is a room administrator or not.
   * @return isRoomAdmin
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ROOM_ADMIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsRoomAdmin() {
    return isRoomAdmin;
  }


  @JsonProperty(JSON_PROPERTY_IS_ROOM_ADMIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRoomAdmin(@javax.annotation.Nullable Boolean isRoomAdmin) {
    this.isRoomAdmin = isRoomAdmin;
  }

  public EmployeeFullDto isLDAP(@javax.annotation.Nullable Boolean isLDAP) {
    
    this.isLDAP = isLDAP;
    return this;
  }

  /**
   * Specifies if the LDAP settings are enabled for the user or not.
   * @return isLDAP
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_L_D_A_P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsLDAP() {
    return isLDAP;
  }


  @JsonProperty(JSON_PROPERTY_IS_L_D_A_P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsLDAP(@javax.annotation.Nullable Boolean isLDAP) {
    this.isLDAP = isLDAP;
  }

  public EmployeeFullDto listAdminModules(@javax.annotation.Nullable List<String> listAdminModules) {
    this.listAdminModules = JsonNullable.<List<String>>of(listAdminModules);
    
    return this;
  }

  public EmployeeFullDto addListAdminModulesItem(String listAdminModulesItem) {
    if (this.listAdminModules == null || !this.listAdminModules.isPresent()) {
      this.listAdminModules = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.listAdminModules.get().add(listAdminModulesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of the administrator modules.
   * @return listAdminModules
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<String> getListAdminModules() {
        return listAdminModules.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LIST_ADMIN_MODULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getListAdminModules_JsonNullable() {
    return listAdminModules;
  }
  
  @JsonProperty(JSON_PROPERTY_LIST_ADMIN_MODULES)
  public void setListAdminModules_JsonNullable(JsonNullable<List<String>> listAdminModules) {
    this.listAdminModules = listAdminModules;
  }

  public void setListAdminModules(@javax.annotation.Nullable List<String> listAdminModules) {
    this.listAdminModules = JsonNullable.<List<String>>of(listAdminModules);
  }

  public EmployeeFullDto isOwner(@javax.annotation.Nullable Boolean isOwner) {
    
    this.isOwner = isOwner;
    return this;
  }

  /**
   * Specifies if the user is a portal owner or not.
   * @return isOwner
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsOwner() {
    return isOwner;
  }


  @JsonProperty(JSON_PROPERTY_IS_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsOwner(@javax.annotation.Nullable Boolean isOwner) {
    this.isOwner = isOwner;
  }

  public EmployeeFullDto isVisitor(@javax.annotation.Nullable Boolean isVisitor) {
    
    this.isVisitor = isVisitor;
    return this;
  }

  /**
   * Specifies if the user is a portal visitor or not.
   * @return isVisitor
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_VISITOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsVisitor() {
    return isVisitor;
  }


  @JsonProperty(JSON_PROPERTY_IS_VISITOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsVisitor(@javax.annotation.Nullable Boolean isVisitor) {
    this.isVisitor = isVisitor;
  }

  public EmployeeFullDto isCollaborator(@javax.annotation.Nullable Boolean isCollaborator) {
    
    this.isCollaborator = isCollaborator;
    return this;
  }

  /**
   * Specifies if the user is a portal collaborator or not.
   * @return isCollaborator
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_COLLABORATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsCollaborator() {
    return isCollaborator;
  }


  @JsonProperty(JSON_PROPERTY_IS_COLLABORATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsCollaborator(@javax.annotation.Nullable Boolean isCollaborator) {
    this.isCollaborator = isCollaborator;
  }

  public EmployeeFullDto cultureName(@javax.annotation.Nullable String cultureName) {
    this.cultureName = JsonNullable.<String>of(cultureName);
    
    return this;
  }

  /**
   * The user culture code.
   * @return cultureName
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCultureName() {
        return cultureName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CULTURE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCultureName_JsonNullable() {
    return cultureName;
  }
  
  @JsonProperty(JSON_PROPERTY_CULTURE_NAME)
  public void setCultureName_JsonNullable(JsonNullable<String> cultureName) {
    this.cultureName = cultureName;
  }

  public void setCultureName(@javax.annotation.Nullable String cultureName) {
    this.cultureName = JsonNullable.<String>of(cultureName);
  }

  public EmployeeFullDto mobilePhone(@javax.annotation.Nullable String mobilePhone) {
    this.mobilePhone = JsonNullable.<String>of(mobilePhone);
    
    return this;
  }

  /**
   * The user mobile phone number.
   * @return mobilePhone
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getMobilePhone() {
        return mobilePhone.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MOBILE_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMobilePhone_JsonNullable() {
    return mobilePhone;
  }
  
  @JsonProperty(JSON_PROPERTY_MOBILE_PHONE)
  public void setMobilePhone_JsonNullable(JsonNullable<String> mobilePhone) {
    this.mobilePhone = mobilePhone;
  }

  public void setMobilePhone(@javax.annotation.Nullable String mobilePhone) {
    this.mobilePhone = JsonNullable.<String>of(mobilePhone);
  }

  public EmployeeFullDto mobilePhoneActivationStatus(@javax.annotation.Nullable MobilePhoneActivationStatus mobilePhoneActivationStatus) {
    
    this.mobilePhoneActivationStatus = mobilePhoneActivationStatus;
    return this;
  }

  /**
   * Get mobilePhoneActivationStatus
   * @return mobilePhoneActivationStatus
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOBILE_PHONE_ACTIVATION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MobilePhoneActivationStatus getMobilePhoneActivationStatus() {
    return mobilePhoneActivationStatus;
  }


  @JsonProperty(JSON_PROPERTY_MOBILE_PHONE_ACTIVATION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMobilePhoneActivationStatus(@javax.annotation.Nullable MobilePhoneActivationStatus mobilePhoneActivationStatus) {
    this.mobilePhoneActivationStatus = mobilePhoneActivationStatus;
  }

  public EmployeeFullDto isSSO(@javax.annotation.Nullable Boolean isSSO) {
    
    this.isSSO = isSSO;
    return this;
  }

  /**
   * Specifies if the SSO settings are enabled for the user or not.
   * @return isSSO
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_S_S_O)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsSSO() {
    return isSSO;
  }


  @JsonProperty(JSON_PROPERTY_IS_S_S_O)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsSSO(@javax.annotation.Nullable Boolean isSSO) {
    this.isSSO = isSSO;
  }

  public EmployeeFullDto theme(@javax.annotation.Nullable DarkThemeSettingsType theme) {
    
    this.theme = theme;
    return this;
  }

  /**
   * Get theme
   * @return theme
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DarkThemeSettingsType getTheme() {
    return theme;
  }


  @JsonProperty(JSON_PROPERTY_THEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTheme(@javax.annotation.Nullable DarkThemeSettingsType theme) {
    this.theme = theme;
  }

  public EmployeeFullDto quotaLimit(@javax.annotation.Nullable Long quotaLimit) {
    this.quotaLimit = JsonNullable.<Long>of(quotaLimit);
    
    return this;
  }

  /**
   * The user quota limit.
   * @return quotaLimit
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Long getQuotaLimit() {
        return quotaLimit.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_QUOTA_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Long> getQuotaLimit_JsonNullable() {
    return quotaLimit;
  }
  
  @JsonProperty(JSON_PROPERTY_QUOTA_LIMIT)
  public void setQuotaLimit_JsonNullable(JsonNullable<Long> quotaLimit) {
    this.quotaLimit = quotaLimit;
  }

  public void setQuotaLimit(@javax.annotation.Nullable Long quotaLimit) {
    this.quotaLimit = JsonNullable.<Long>of(quotaLimit);
  }

  public EmployeeFullDto usedSpace(@javax.annotation.Nullable Double usedSpace) {
    this.usedSpace = JsonNullable.<Double>of(usedSpace);
    
    return this;
  }

  /**
   * The portal used space of the user.
   * @return usedSpace
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Double getUsedSpace() {
        return usedSpace.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USED_SPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getUsedSpace_JsonNullable() {
    return usedSpace;
  }
  
  @JsonProperty(JSON_PROPERTY_USED_SPACE)
  public void setUsedSpace_JsonNullable(JsonNullable<Double> usedSpace) {
    this.usedSpace = usedSpace;
  }

  public void setUsedSpace(@javax.annotation.Nullable Double usedSpace) {
    this.usedSpace = JsonNullable.<Double>of(usedSpace);
  }

  public EmployeeFullDto shared(@javax.annotation.Nullable Boolean shared) {
    this.shared = JsonNullable.<Boolean>of(shared);
    
    return this;
  }

  /**
   * Specifies if the user has access rights.
   * @return shared
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getShared() {
        return shared.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SHARED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getShared_JsonNullable() {
    return shared;
  }
  
  @JsonProperty(JSON_PROPERTY_SHARED)
  public void setShared_JsonNullable(JsonNullable<Boolean> shared) {
    this.shared = shared;
  }

  public void setShared(@javax.annotation.Nullable Boolean shared) {
    this.shared = JsonNullable.<Boolean>of(shared);
  }

  public EmployeeFullDto isCustomQuota(@javax.annotation.Nullable Boolean isCustomQuota) {
    this.isCustomQuota = JsonNullable.<Boolean>of(isCustomQuota);
    
    return this;
  }

  /**
   * Specifies if the user has a custom quota or not.
   * @return isCustomQuota
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getIsCustomQuota() {
        return isCustomQuota.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IS_CUSTOM_QUOTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getIsCustomQuota_JsonNullable() {
    return isCustomQuota;
  }
  
  @JsonProperty(JSON_PROPERTY_IS_CUSTOM_QUOTA)
  public void setIsCustomQuota_JsonNullable(JsonNullable<Boolean> isCustomQuota) {
    this.isCustomQuota = isCustomQuota;
  }

  public void setIsCustomQuota(@javax.annotation.Nullable Boolean isCustomQuota) {
    this.isCustomQuota = JsonNullable.<Boolean>of(isCustomQuota);
  }

  public EmployeeFullDto loginEventId(@javax.annotation.Nullable Integer loginEventId) {
    this.loginEventId = JsonNullable.<Integer>of(loginEventId);
    
    return this;
  }

  /**
   * The current login event ID.
   * @return loginEventId
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Integer getLoginEventId() {
        return loginEventId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOGIN_EVENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getLoginEventId_JsonNullable() {
    return loginEventId;
  }
  
  @JsonProperty(JSON_PROPERTY_LOGIN_EVENT_ID)
  public void setLoginEventId_JsonNullable(JsonNullable<Integer> loginEventId) {
    this.loginEventId = loginEventId;
  }

  public void setLoginEventId(@javax.annotation.Nullable Integer loginEventId) {
    this.loginEventId = JsonNullable.<Integer>of(loginEventId);
  }

  public EmployeeFullDto authCookieLifetime(@javax.annotation.Nullable Double authCookieLifetime) {
    this.authCookieLifetime = JsonNullable.<Double>of(authCookieLifetime);
    
    return this;
  }

  /**
   * The auth cookie lifetime in seconds.
   * @return authCookieLifetime
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Double getAuthCookieLifetime() {
        return authCookieLifetime.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AUTH_COOKIE_LIFETIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getAuthCookieLifetime_JsonNullable() {
    return authCookieLifetime;
  }
  
  @JsonProperty(JSON_PROPERTY_AUTH_COOKIE_LIFETIME)
  public void setAuthCookieLifetime_JsonNullable(JsonNullable<Double> authCookieLifetime) {
    this.authCookieLifetime = authCookieLifetime;
  }

  public void setAuthCookieLifetime(@javax.annotation.Nullable Double authCookieLifetime) {
    this.authCookieLifetime = JsonNullable.<Double>of(authCookieLifetime);
  }

  public EmployeeFullDto createdBy(@javax.annotation.Nullable EmployeeDto createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EmployeeDto getCreatedBy() {
    return createdBy;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedBy(@javax.annotation.Nullable EmployeeDto createdBy) {
    this.createdBy = createdBy;
  }

  public EmployeeFullDto registrationDate(@javax.annotation.Nullable ApiDateTime registrationDate) {
    
    this.registrationDate = registrationDate;
    return this;
  }

  /**
   * Get registrationDate
   * @return registrationDate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REGISTRATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDateTime getRegistrationDate() {
    return registrationDate;
  }


  @JsonProperty(JSON_PROPERTY_REGISTRATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegistrationDate(@javax.annotation.Nullable ApiDateTime registrationDate) {
    this.registrationDate = registrationDate;
  }

  public EmployeeFullDto hasPersonalFolder(@javax.annotation.Nullable Boolean hasPersonalFolder) {
    
    this.hasPersonalFolder = hasPersonalFolder;
    return this;
  }

  /**
   * Specifies if the user has a personal folder or not.
   * @return hasPersonalFolder
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_PERSONAL_FOLDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasPersonalFolder() {
    return hasPersonalFolder;
  }


  @JsonProperty(JSON_PROPERTY_HAS_PERSONAL_FOLDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasPersonalFolder(@javax.annotation.Nullable Boolean hasPersonalFolder) {
    this.hasPersonalFolder = hasPersonalFolder;
  }

  public EmployeeFullDto tfaAppEnabled(@javax.annotation.Nullable Boolean tfaAppEnabled) {
    this.tfaAppEnabled = JsonNullable.<Boolean>of(tfaAppEnabled);
    
    return this;
  }

  /**
   * Indicates whether the user has enabled two-factor authentication (TFA) using an authentication app.
   * @return tfaAppEnabled
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getTfaAppEnabled() {
        return tfaAppEnabled.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TFA_APP_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getTfaAppEnabled_JsonNullable() {
    return tfaAppEnabled;
  }
  
  @JsonProperty(JSON_PROPERTY_TFA_APP_ENABLED)
  public void setTfaAppEnabled_JsonNullable(JsonNullable<Boolean> tfaAppEnabled) {
    this.tfaAppEnabled = tfaAppEnabled;
  }

  public void setTfaAppEnabled(@javax.annotation.Nullable Boolean tfaAppEnabled) {
    this.tfaAppEnabled = JsonNullable.<Boolean>of(tfaAppEnabled);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeFullDto employeeFullDto = (EmployeeFullDto) o;
    return Objects.equals(this.id, employeeFullDto.id) &&
        equalsNullable(this.displayName, employeeFullDto.displayName) &&
        equalsNullable(this.title, employeeFullDto.title) &&
        equalsNullable(this.avatar, employeeFullDto.avatar) &&
        equalsNullable(this.avatarOriginal, employeeFullDto.avatarOriginal) &&
        equalsNullable(this.avatarMax, employeeFullDto.avatarMax) &&
        equalsNullable(this.avatarMedium, employeeFullDto.avatarMedium) &&
        equalsNullable(this.avatarSmall, employeeFullDto.avatarSmall) &&
        equalsNullable(this.profileUrl, employeeFullDto.profileUrl) &&
        Objects.equals(this.hasAvatar, employeeFullDto.hasAvatar) &&
        Objects.equals(this.isAnonim, employeeFullDto.isAnonim) &&
        equalsNullable(this.firstName, employeeFullDto.firstName) &&
        equalsNullable(this.lastName, employeeFullDto.lastName) &&
        equalsNullable(this.userName, employeeFullDto.userName) &&
        equalsNullable(this.email, employeeFullDto.email) &&
        equalsNullable(this.contacts, employeeFullDto.contacts) &&
        Objects.equals(this.birthday, employeeFullDto.birthday) &&
        equalsNullable(this.sex, employeeFullDto.sex) &&
        Objects.equals(this.status, employeeFullDto.status) &&
        Objects.equals(this.activationStatus, employeeFullDto.activationStatus) &&
        Objects.equals(this.terminated, employeeFullDto.terminated) &&
        equalsNullable(this.department, employeeFullDto.department) &&
        Objects.equals(this.workFrom, employeeFullDto.workFrom) &&
        equalsNullable(this.groups, employeeFullDto.groups) &&
        equalsNullable(this.location, employeeFullDto.location) &&
        equalsNullable(this.notes, employeeFullDto.notes) &&
        Objects.equals(this.isAdmin, employeeFullDto.isAdmin) &&
        Objects.equals(this.isRoomAdmin, employeeFullDto.isRoomAdmin) &&
        Objects.equals(this.isLDAP, employeeFullDto.isLDAP) &&
        equalsNullable(this.listAdminModules, employeeFullDto.listAdminModules) &&
        Objects.equals(this.isOwner, employeeFullDto.isOwner) &&
        Objects.equals(this.isVisitor, employeeFullDto.isVisitor) &&
        Objects.equals(this.isCollaborator, employeeFullDto.isCollaborator) &&
        equalsNullable(this.cultureName, employeeFullDto.cultureName) &&
        equalsNullable(this.mobilePhone, employeeFullDto.mobilePhone) &&
        Objects.equals(this.mobilePhoneActivationStatus, employeeFullDto.mobilePhoneActivationStatus) &&
        Objects.equals(this.isSSO, employeeFullDto.isSSO) &&
        Objects.equals(this.theme, employeeFullDto.theme) &&
        equalsNullable(this.quotaLimit, employeeFullDto.quotaLimit) &&
        equalsNullable(this.usedSpace, employeeFullDto.usedSpace) &&
        equalsNullable(this.shared, employeeFullDto.shared) &&
        equalsNullable(this.isCustomQuota, employeeFullDto.isCustomQuota) &&
        equalsNullable(this.loginEventId, employeeFullDto.loginEventId) &&
        equalsNullable(this.authCookieLifetime, employeeFullDto.authCookieLifetime) &&
        Objects.equals(this.createdBy, employeeFullDto.createdBy) &&
        Objects.equals(this.registrationDate, employeeFullDto.registrationDate) &&
        Objects.equals(this.hasPersonalFolder, employeeFullDto.hasPersonalFolder) &&
        equalsNullable(this.tfaAppEnabled, employeeFullDto.tfaAppEnabled);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(displayName), hashCodeNullable(title), hashCodeNullable(avatar), hashCodeNullable(avatarOriginal), hashCodeNullable(avatarMax), hashCodeNullable(avatarMedium), hashCodeNullable(avatarSmall), hashCodeNullable(profileUrl), hasAvatar, isAnonim, hashCodeNullable(firstName), hashCodeNullable(lastName), hashCodeNullable(userName), hashCodeNullable(email), hashCodeNullable(contacts), birthday, hashCodeNullable(sex), status, activationStatus, terminated, hashCodeNullable(department), workFrom, hashCodeNullable(groups), hashCodeNullable(location), hashCodeNullable(notes), isAdmin, isRoomAdmin, isLDAP, hashCodeNullable(listAdminModules), isOwner, isVisitor, isCollaborator, hashCodeNullable(cultureName), hashCodeNullable(mobilePhone), mobilePhoneActivationStatus, isSSO, theme, hashCodeNullable(quotaLimit), hashCodeNullable(usedSpace), hashCodeNullable(shared), hashCodeNullable(isCustomQuota), hashCodeNullable(loginEventId), hashCodeNullable(authCookieLifetime), createdBy, registrationDate, hasPersonalFolder, hashCodeNullable(tfaAppEnabled));
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
    sb.append("class EmployeeFullDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    avatarOriginal: ").append(toIndentedString(avatarOriginal)).append("\n");
    sb.append("    avatarMax: ").append(toIndentedString(avatarMax)).append("\n");
    sb.append("    avatarMedium: ").append(toIndentedString(avatarMedium)).append("\n");
    sb.append("    avatarSmall: ").append(toIndentedString(avatarSmall)).append("\n");
    sb.append("    profileUrl: ").append(toIndentedString(profileUrl)).append("\n");
    sb.append("    hasAvatar: ").append(toIndentedString(hasAvatar)).append("\n");
    sb.append("    isAnonim: ").append(toIndentedString(isAnonim)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    activationStatus: ").append(toIndentedString(activationStatus)).append("\n");
    sb.append("    terminated: ").append(toIndentedString(terminated)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    workFrom: ").append(toIndentedString(workFrom)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    isAdmin: ").append(toIndentedString(isAdmin)).append("\n");
    sb.append("    isRoomAdmin: ").append(toIndentedString(isRoomAdmin)).append("\n");
    sb.append("    isLDAP: ").append(toIndentedString(isLDAP)).append("\n");
    sb.append("    listAdminModules: ").append(toIndentedString(listAdminModules)).append("\n");
    sb.append("    isOwner: ").append(toIndentedString(isOwner)).append("\n");
    sb.append("    isVisitor: ").append(toIndentedString(isVisitor)).append("\n");
    sb.append("    isCollaborator: ").append(toIndentedString(isCollaborator)).append("\n");
    sb.append("    cultureName: ").append(toIndentedString(cultureName)).append("\n");
    sb.append("    mobilePhone: ").append(toIndentedString(mobilePhone)).append("\n");
    sb.append("    mobilePhoneActivationStatus: ").append(toIndentedString(mobilePhoneActivationStatus)).append("\n");
    sb.append("    isSSO: ").append(toIndentedString(isSSO)).append("\n");
    sb.append("    theme: ").append(toIndentedString(theme)).append("\n");
    sb.append("    quotaLimit: ").append(toIndentedString(quotaLimit)).append("\n");
    sb.append("    usedSpace: ").append(toIndentedString(usedSpace)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    sb.append("    isCustomQuota: ").append(toIndentedString(isCustomQuota)).append("\n");
    sb.append("    loginEventId: ").append(toIndentedString(loginEventId)).append("\n");
    sb.append("    authCookieLifetime: ").append(toIndentedString(authCookieLifetime)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    registrationDate: ").append(toIndentedString(registrationDate)).append("\n");
    sb.append("    hasPersonalFolder: ").append(toIndentedString(hasPersonalFolder)).append("\n");
    sb.append("    tfaAppEnabled: ").append(toIndentedString(tfaAppEnabled)).append("\n");
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

    // add `displayName` to the URL query string
    if (getDisplayName() != null) {
      try {
        joiner.add(String.format("%sdisplayName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDisplayName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `title` to the URL query string
    if (getTitle() != null) {
      try {
        joiner.add(String.format("%stitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTitle()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `avatar` to the URL query string
    if (getAvatar() != null) {
      try {
        joiner.add(String.format("%savatar%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAvatar()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `avatarOriginal` to the URL query string
    if (getAvatarOriginal() != null) {
      try {
        joiner.add(String.format("%savatarOriginal%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAvatarOriginal()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `avatarMax` to the URL query string
    if (getAvatarMax() != null) {
      try {
        joiner.add(String.format("%savatarMax%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAvatarMax()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `avatarMedium` to the URL query string
    if (getAvatarMedium() != null) {
      try {
        joiner.add(String.format("%savatarMedium%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAvatarMedium()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `avatarSmall` to the URL query string
    if (getAvatarSmall() != null) {
      try {
        joiner.add(String.format("%savatarSmall%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAvatarSmall()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `profileUrl` to the URL query string
    if (getProfileUrl() != null) {
      try {
        joiner.add(String.format("%sprofileUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProfileUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `hasAvatar` to the URL query string
    if (getHasAvatar() != null) {
      try {
        joiner.add(String.format("%shasAvatar%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHasAvatar()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isAnonim` to the URL query string
    if (getIsAnonim() != null) {
      try {
        joiner.add(String.format("%sisAnonim%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsAnonim()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `firstName` to the URL query string
    if (getFirstName() != null) {
      try {
        joiner.add(String.format("%sfirstName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFirstName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `lastName` to the URL query string
    if (getLastName() != null) {
      try {
        joiner.add(String.format("%slastName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLastName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `userName` to the URL query string
    if (getUserName() != null) {
      try {
        joiner.add(String.format("%suserName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUserName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `email` to the URL query string
    if (getEmail() != null) {
      try {
        joiner.add(String.format("%semail%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmail()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `contacts` to the URL query string
    if (getContacts() != null) {
      for (int i = 0; i < getContacts().size(); i++) {
        if (getContacts().get(i) != null) {
          joiner.add(getContacts().get(i).toUrlQueryString(String.format("%scontacts%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `birthday` to the URL query string
    if (getBirthday() != null) {
      joiner.add(getBirthday().toUrlQueryString(prefix + "birthday" + suffix));
    }

    // add `sex` to the URL query string
    if (getSex() != null) {
      try {
        joiner.add(String.format("%ssex%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSex()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `activationStatus` to the URL query string
    if (getActivationStatus() != null) {
      try {
        joiner.add(String.format("%sactivationStatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getActivationStatus()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `terminated` to the URL query string
    if (getTerminated() != null) {
      joiner.add(getTerminated().toUrlQueryString(prefix + "terminated" + suffix));
    }

    // add `department` to the URL query string
    if (getDepartment() != null) {
      try {
        joiner.add(String.format("%sdepartment%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDepartment()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `workFrom` to the URL query string
    if (getWorkFrom() != null) {
      joiner.add(getWorkFrom().toUrlQueryString(prefix + "workFrom" + suffix));
    }

    // add `groups` to the URL query string
    if (getGroups() != null) {
      for (int i = 0; i < getGroups().size(); i++) {
        if (getGroups().get(i) != null) {
          joiner.add(getGroups().get(i).toUrlQueryString(String.format("%sgroups%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `location` to the URL query string
    if (getLocation() != null) {
      try {
        joiner.add(String.format("%slocation%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLocation()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `notes` to the URL query string
    if (getNotes() != null) {
      try {
        joiner.add(String.format("%snotes%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNotes()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isAdmin` to the URL query string
    if (getIsAdmin() != null) {
      try {
        joiner.add(String.format("%sisAdmin%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsAdmin()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isRoomAdmin` to the URL query string
    if (getIsRoomAdmin() != null) {
      try {
        joiner.add(String.format("%sisRoomAdmin%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsRoomAdmin()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isLDAP` to the URL query string
    if (getIsLDAP() != null) {
      try {
        joiner.add(String.format("%sisLDAP%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsLDAP()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `listAdminModules` to the URL query string
    if (getListAdminModules() != null) {
      for (int i = 0; i < getListAdminModules().size(); i++) {
        try {
          joiner.add(String.format("%slistAdminModules%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getListAdminModules().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `isOwner` to the URL query string
    if (getIsOwner() != null) {
      try {
        joiner.add(String.format("%sisOwner%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsOwner()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isVisitor` to the URL query string
    if (getIsVisitor() != null) {
      try {
        joiner.add(String.format("%sisVisitor%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsVisitor()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isCollaborator` to the URL query string
    if (getIsCollaborator() != null) {
      try {
        joiner.add(String.format("%sisCollaborator%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsCollaborator()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `cultureName` to the URL query string
    if (getCultureName() != null) {
      try {
        joiner.add(String.format("%scultureName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCultureName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `mobilePhone` to the URL query string
    if (getMobilePhone() != null) {
      try {
        joiner.add(String.format("%smobilePhone%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMobilePhone()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `mobilePhoneActivationStatus` to the URL query string
    if (getMobilePhoneActivationStatus() != null) {
      try {
        joiner.add(String.format("%smobilePhoneActivationStatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMobilePhoneActivationStatus()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isSSO` to the URL query string
    if (getIsSSO() != null) {
      try {
        joiner.add(String.format("%sisSSO%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsSSO()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `theme` to the URL query string
    if (getTheme() != null) {
      try {
        joiner.add(String.format("%stheme%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTheme()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `quotaLimit` to the URL query string
    if (getQuotaLimit() != null) {
      try {
        joiner.add(String.format("%squotaLimit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getQuotaLimit()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `usedSpace` to the URL query string
    if (getUsedSpace() != null) {
      try {
        joiner.add(String.format("%susedSpace%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUsedSpace()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `shared` to the URL query string
    if (getShared() != null) {
      try {
        joiner.add(String.format("%sshared%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getShared()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isCustomQuota` to the URL query string
    if (getIsCustomQuota() != null) {
      try {
        joiner.add(String.format("%sisCustomQuota%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsCustomQuota()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `loginEventId` to the URL query string
    if (getLoginEventId() != null) {
      try {
        joiner.add(String.format("%sloginEventId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLoginEventId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `authCookieLifetime` to the URL query string
    if (getAuthCookieLifetime() != null) {
      try {
        joiner.add(String.format("%sauthCookieLifetime%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAuthCookieLifetime()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `createdBy` to the URL query string
    if (getCreatedBy() != null) {
      joiner.add(getCreatedBy().toUrlQueryString(prefix + "createdBy" + suffix));
    }

    // add `registrationDate` to the URL query string
    if (getRegistrationDate() != null) {
      joiner.add(getRegistrationDate().toUrlQueryString(prefix + "registrationDate" + suffix));
    }

    // add `hasPersonalFolder` to the URL query string
    if (getHasPersonalFolder() != null) {
      try {
        joiner.add(String.format("%shasPersonalFolder%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHasPersonalFolder()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `tfaAppEnabled` to the URL query string
    if (getTfaAppEnabled() != null) {
      try {
        joiner.add(String.format("%stfaAppEnabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTfaAppEnabled()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

