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
import java.util.UUID;
import org.openapitools.client.model.EmployeeActivationStatus;
import org.openapitools.client.model.EmployeeStatus;
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
 * The user information.
 */
@JsonPropertyOrder({
  UserInfo.JSON_PROPERTY_ID,
  UserInfo.JSON_PROPERTY_FIRST_NAME,
  UserInfo.JSON_PROPERTY_LAST_NAME,
  UserInfo.JSON_PROPERTY_USER_NAME,
  UserInfo.JSON_PROPERTY_BIRTH_DATE,
  UserInfo.JSON_PROPERTY_SEX,
  UserInfo.JSON_PROPERTY_STATUS,
  UserInfo.JSON_PROPERTY_ACTIVATION_STATUS,
  UserInfo.JSON_PROPERTY_TERMINATED_DATE,
  UserInfo.JSON_PROPERTY_TITLE,
  UserInfo.JSON_PROPERTY_WORK_FROM_DATE,
  UserInfo.JSON_PROPERTY_EMAIL,
  UserInfo.JSON_PROPERTY_CONTACTS,
  UserInfo.JSON_PROPERTY_CONTACTS_LIST,
  UserInfo.JSON_PROPERTY_LOCATION,
  UserInfo.JSON_PROPERTY_NOTES,
  UserInfo.JSON_PROPERTY_REMOVED,
  UserInfo.JSON_PROPERTY_LAST_MODIFIED,
  UserInfo.JSON_PROPERTY_TENANT_ID,
  UserInfo.JSON_PROPERTY_IS_ACTIVE,
  UserInfo.JSON_PROPERTY_CULTURE_NAME,
  UserInfo.JSON_PROPERTY_MOBILE_PHONE,
  UserInfo.JSON_PROPERTY_MOBILE_PHONE_ACTIVATION_STATUS,
  UserInfo.JSON_PROPERTY_SID,
  UserInfo.JSON_PROPERTY_LDAP_QOUTA,
  UserInfo.JSON_PROPERTY_SSO_NAME_ID,
  UserInfo.JSON_PROPERTY_SSO_SESSION_ID,
  UserInfo.JSON_PROPERTY_CREATE_DATE,
  UserInfo.JSON_PROPERTY_CREATED_BY,
  UserInfo.JSON_PROPERTY_SPAM,
  UserInfo.JSON_PROPERTY_CHECK_ACTIVATION
})

public class UserInfo {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable  private UUID id;

  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  @javax.annotation.Nullable  private JsonNullable<String> firstName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  @javax.annotation.Nullable  private JsonNullable<String> lastName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_USER_NAME = "userName";
  @javax.annotation.Nullable  private JsonNullable<String> userName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BIRTH_DATE = "birthDate";
  @javax.annotation.Nullable  private JsonNullable<OffsetDateTime> birthDate = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_SEX = "sex";
  @javax.annotation.Nullable  private JsonNullable<Boolean> sex = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nullable  private EmployeeStatus status;

  public static final String JSON_PROPERTY_ACTIVATION_STATUS = "activationStatus";
  @javax.annotation.Nullable  private EmployeeActivationStatus activationStatus;

  public static final String JSON_PROPERTY_TERMINATED_DATE = "terminatedDate";
  @javax.annotation.Nullable  private JsonNullable<OffsetDateTime> terminatedDate = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable  private JsonNullable<String> title = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_WORK_FROM_DATE = "workFromDate";
  @javax.annotation.Nullable  private JsonNullable<OffsetDateTime> workFromDate = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_EMAIL = "email";
  @javax.annotation.Nullable  private JsonNullable<String> email = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CONTACTS = "contacts";
  @javax.annotation.Nullable  private JsonNullable<String> contacts = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CONTACTS_LIST = "contactsList";
  @javax.annotation.Nullable  private JsonNullable<List<String>> contactsList = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_LOCATION = "location";
  @javax.annotation.Nullable  private JsonNullable<String> location = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NOTES = "notes";
  @javax.annotation.Nullable  private JsonNullable<String> notes = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_REMOVED = "removed";
  @javax.annotation.Nullable  private Boolean removed;

  public static final String JSON_PROPERTY_LAST_MODIFIED = "lastModified";
  @javax.annotation.Nullable  private OffsetDateTime lastModified;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @javax.annotation.Nullable  private Integer tenantId;

  public static final String JSON_PROPERTY_IS_ACTIVE = "isActive";
  @javax.annotation.Nullable  private Boolean isActive;

  public static final String JSON_PROPERTY_CULTURE_NAME = "cultureName";
  @javax.annotation.Nullable  private JsonNullable<String> cultureName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MOBILE_PHONE = "mobilePhone";
  @javax.annotation.Nullable  private JsonNullable<String> mobilePhone = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MOBILE_PHONE_ACTIVATION_STATUS = "mobilePhoneActivationStatus";
  @javax.annotation.Nullable  private MobilePhoneActivationStatus mobilePhoneActivationStatus;

  public static final String JSON_PROPERTY_SID = "sid";
  @javax.annotation.Nullable  private JsonNullable<String> sid = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LDAP_QOUTA = "ldapQouta";
  @javax.annotation.Nullable  private Long ldapQouta;

  public static final String JSON_PROPERTY_SSO_NAME_ID = "ssoNameId";
  @javax.annotation.Nullable  private JsonNullable<String> ssoNameId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SSO_SESSION_ID = "ssoSessionId";
  @javax.annotation.Nullable  private JsonNullable<String> ssoSessionId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CREATE_DATE = "createDate";
  @javax.annotation.Nullable  private OffsetDateTime createDate;

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  @javax.annotation.Nullable  private JsonNullable<UUID> createdBy = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_SPAM = "spam";
  @javax.annotation.Nullable  private JsonNullable<Boolean> spam = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_CHECK_ACTIVATION = "checkActivation";
  @javax.annotation.Nullable  private Boolean checkActivation;

  public UserInfo() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public UserInfo(
    @JsonProperty(JSON_PROPERTY_IS_ACTIVE) Boolean isActive, 
    @JsonProperty(JSON_PROPERTY_CHECK_ACTIVATION) Boolean checkActivation
  ) {
    this();
    this.isActive = isActive;
    this.checkActivation = checkActivation;
  }


  public UserInfo id(@javax.annotation.Nullable UUID id) {
    
    this.id = id;
    return this;
  }

  /**
   * The user ID.
   * @return id
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable UUID id) {
    this.id = id;
  }

  public UserInfo firstName(@javax.annotation.Nullable String firstName) {
    this.firstName = JsonNullable.<String>of(firstName);
    
    return this;
  }

  /**
   * The user&#39;s first name.
   * @return firstName
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getFirstName() {
        return firstName.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_FIRST_NAME, required = false)
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

  public UserInfo lastName(@javax.annotation.Nullable String lastName) {
    this.lastName = JsonNullable.<String>of(lastName);
    
    return this;
  }

  /**
   * The user&#39;s last name.
   * @return lastName
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getLastName() {
        return lastName.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_LAST_NAME, required = false)
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

  public UserInfo userName(@javax.annotation.Nullable String userName) {
    this.userName = JsonNullable.<String>of(userName);
    
    return this;
  }

  /**
   * The user username.
   * @return userName
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getUserName() {
        return userName.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_USER_NAME, required = false)
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

  public UserInfo birthDate(@javax.annotation.Nullable OffsetDateTime birthDate) {
    this.birthDate = JsonNullable.<OffsetDateTime>of(birthDate);
    
    return this;
  }

  /**
   * The user birthday.
   * @return birthDate
   */
  @javax.annotation.Nullable  @JsonIgnore

  public OffsetDateTime getBirthDate() {
        return birthDate.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_BIRTH_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getBirthDate_JsonNullable() {
    return birthDate;
  }
  
  @JsonProperty(JSON_PROPERTY_BIRTH_DATE)
  public void setBirthDate_JsonNullable(JsonNullable<OffsetDateTime> birthDate) {
    this.birthDate = birthDate;
  }

  public void setBirthDate(@javax.annotation.Nullable OffsetDateTime birthDate) {
    this.birthDate = JsonNullable.<OffsetDateTime>of(birthDate);
  }

  public UserInfo sex(@javax.annotation.Nullable Boolean sex) {
    this.sex = JsonNullable.<Boolean>of(sex);
    
    return this;
  }

  /**
   * The user sex (male or female).
   * @return sex
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getSex() {
        return sex.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SEX, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getSex_JsonNullable() {
    return sex;
  }
  
  @JsonProperty(JSON_PROPERTY_SEX)
  public void setSex_JsonNullable(JsonNullable<Boolean> sex) {
    this.sex = sex;
  }

  public void setSex(@javax.annotation.Nullable Boolean sex) {
    this.sex = JsonNullable.<Boolean>of(sex);
  }

  public UserInfo status(@javax.annotation.Nullable EmployeeStatus status) {
    
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EmployeeStatus getStatus() {
    return status;
  }


  @JsonProperty(value = JSON_PROPERTY_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(@javax.annotation.Nullable EmployeeStatus status) {
    this.status = status;
  }

  public UserInfo activationStatus(@javax.annotation.Nullable EmployeeActivationStatus activationStatus) {
    
    this.activationStatus = activationStatus;
    return this;
  }

  /**
   * Get activationStatus
   * @return activationStatus
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ACTIVATION_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EmployeeActivationStatus getActivationStatus() {
    return activationStatus;
  }


  @JsonProperty(value = JSON_PROPERTY_ACTIVATION_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActivationStatus(@javax.annotation.Nullable EmployeeActivationStatus activationStatus) {
    this.activationStatus = activationStatus;
  }

  public UserInfo terminatedDate(@javax.annotation.Nullable OffsetDateTime terminatedDate) {
    this.terminatedDate = JsonNullable.<OffsetDateTime>of(terminatedDate);
    
    return this;
  }

  /**
   * The date and time when the user account was terminated.
   * @return terminatedDate
   */
  @javax.annotation.Nullable  @JsonIgnore

  public OffsetDateTime getTerminatedDate() {
        return terminatedDate.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_TERMINATED_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getTerminatedDate_JsonNullable() {
    return terminatedDate;
  }
  
  @JsonProperty(JSON_PROPERTY_TERMINATED_DATE)
  public void setTerminatedDate_JsonNullable(JsonNullable<OffsetDateTime> terminatedDate) {
    this.terminatedDate = terminatedDate;
  }

  public void setTerminatedDate(@javax.annotation.Nullable OffsetDateTime terminatedDate) {
    this.terminatedDate = JsonNullable.<OffsetDateTime>of(terminatedDate);
  }

  public UserInfo title(@javax.annotation.Nullable String title) {
    this.title = JsonNullable.<String>of(title);
    
    return this;
  }

  /**
   * The user title.
   * @return title
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getTitle() {
        return title.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_TITLE, required = false)
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

  public UserInfo workFromDate(@javax.annotation.Nullable OffsetDateTime workFromDate) {
    this.workFromDate = JsonNullable.<OffsetDateTime>of(workFromDate);
    
    return this;
  }

  /**
   * The user registration date.
   * @return workFromDate
   */
  @javax.annotation.Nullable  @JsonIgnore

  public OffsetDateTime getWorkFromDate() {
        return workFromDate.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_WORK_FROM_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getWorkFromDate_JsonNullable() {
    return workFromDate;
  }
  
  @JsonProperty(JSON_PROPERTY_WORK_FROM_DATE)
  public void setWorkFromDate_JsonNullable(JsonNullable<OffsetDateTime> workFromDate) {
    this.workFromDate = workFromDate;
  }

  public void setWorkFromDate(@javax.annotation.Nullable OffsetDateTime workFromDate) {
    this.workFromDate = JsonNullable.<OffsetDateTime>of(workFromDate);
  }

  public UserInfo email(@javax.annotation.Nullable String email) {
    this.email = JsonNullable.<String>of(email);
    
    return this;
  }

  /**
   * The user email address.
   * @return email
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getEmail() {
        return email.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_EMAIL, required = false)
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

  public UserInfo contacts(@javax.annotation.Nullable String contacts) {
    this.contacts = JsonNullable.<String>of(contacts);
    
    return this;
  }

  /**
   * The list of user contacts in the string format.
   * @return contacts
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getContacts() {
        return contacts.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_CONTACTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getContacts_JsonNullable() {
    return contacts;
  }
  
  @JsonProperty(JSON_PROPERTY_CONTACTS)
  public void setContacts_JsonNullable(JsonNullable<String> contacts) {
    this.contacts = contacts;
  }

  public void setContacts(@javax.annotation.Nullable String contacts) {
    this.contacts = JsonNullable.<String>of(contacts);
  }

  public UserInfo contactsList(@javax.annotation.Nullable List<String> contactsList) {
    this.contactsList = JsonNullable.<List<String>>of(contactsList);
    
    return this;
  }

  public UserInfo addContactsListItem(String contactsListItem) {
    if (this.contactsList == null || !this.contactsList.isPresent()) {
      this.contactsList = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.contactsList.get().add(contactsListItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of user contacts.
   * @return contactsList
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<String> getContactsList() {
        return contactsList.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_CONTACTS_LIST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getContactsList_JsonNullable() {
    return contactsList;
  }
  
  @JsonProperty(JSON_PROPERTY_CONTACTS_LIST)
  public void setContactsList_JsonNullable(JsonNullable<List<String>> contactsList) {
    this.contactsList = contactsList;
  }

  public void setContactsList(@javax.annotation.Nullable List<String> contactsList) {
    this.contactsList = JsonNullable.<List<String>>of(contactsList);
  }

  public UserInfo location(@javax.annotation.Nullable String location) {
    this.location = JsonNullable.<String>of(location);
    
    return this;
  }

  /**
   * The user location.
   * @return location
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getLocation() {
        return location.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_LOCATION, required = false)
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

  public UserInfo notes(@javax.annotation.Nullable String notes) {
    this.notes = JsonNullable.<String>of(notes);
    
    return this;
  }

  /**
   * The user notes.
   * @return notes
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getNotes() {
        return notes.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_NOTES, required = false)
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

  public UserInfo removed(@javax.annotation.Nullable Boolean removed) {
    
    this.removed = removed;
    return this;
  }

  /**
   * Specifies if the user account was removed or not.
   * @return removed
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_REMOVED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRemoved() {
    return removed;
  }


  @JsonProperty(value = JSON_PROPERTY_REMOVED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemoved(@javax.annotation.Nullable Boolean removed) {
    this.removed = removed;
  }

  public UserInfo lastModified(@javax.annotation.Nullable OffsetDateTime lastModified) {
    
    this.lastModified = lastModified;
    return this;
  }

  /**
   * The date and time when the user account was last modified.
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

  public UserInfo tenantId(@javax.annotation.Nullable Integer tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

  /**
   * The tenant ID.
   * @return tenantId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTenantId() {
    return tenantId;
  }


  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantId(@javax.annotation.Nullable Integer tenantId) {
    this.tenantId = tenantId;
  }

  /**
   * Specifies if the user is active or not.
   * @return isActive
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IS_ACTIVE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsActive() {
    return isActive;
  }



  public UserInfo cultureName(@javax.annotation.Nullable String cultureName) {
    this.cultureName = JsonNullable.<String>of(cultureName);
    
    return this;
  }

  /**
   * The user culture code.
   * @return cultureName
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getCultureName() {
        return cultureName.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_CULTURE_NAME, required = false)
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

  public UserInfo mobilePhone(@javax.annotation.Nullable String mobilePhone) {
    this.mobilePhone = JsonNullable.<String>of(mobilePhone);
    
    return this;
  }

  /**
   * The user mobile phone.
   * @return mobilePhone
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getMobilePhone() {
        return mobilePhone.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_MOBILE_PHONE, required = false)
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

  public UserInfo mobilePhoneActivationStatus(@javax.annotation.Nullable MobilePhoneActivationStatus mobilePhoneActivationStatus) {
    
    this.mobilePhoneActivationStatus = mobilePhoneActivationStatus;
    return this;
  }

  /**
   * Get mobilePhoneActivationStatus
   * @return mobilePhoneActivationStatus
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_MOBILE_PHONE_ACTIVATION_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MobilePhoneActivationStatus getMobilePhoneActivationStatus() {
    return mobilePhoneActivationStatus;
  }


  @JsonProperty(value = JSON_PROPERTY_MOBILE_PHONE_ACTIVATION_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMobilePhoneActivationStatus(@javax.annotation.Nullable MobilePhoneActivationStatus mobilePhoneActivationStatus) {
    this.mobilePhoneActivationStatus = mobilePhoneActivationStatus;
  }

  public UserInfo sid(@javax.annotation.Nullable String sid) {
    this.sid = JsonNullable.<String>of(sid);
    
    return this;
  }

  /**
   * The LDAP user identifier.
   * @return sid
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getSid() {
        return sid.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getSid_JsonNullable() {
    return sid;
  }
  
  @JsonProperty(JSON_PROPERTY_SID)
  public void setSid_JsonNullable(JsonNullable<String> sid) {
    this.sid = sid;
  }

  public void setSid(@javax.annotation.Nullable String sid) {
    this.sid = JsonNullable.<String>of(sid);
  }

  public UserInfo ldapQouta(@javax.annotation.Nullable Long ldapQouta) {
    
    this.ldapQouta = ldapQouta;
    return this;
  }

  /**
   * The LDAP user quota attribute.
   * @return ldapQouta
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_LDAP_QOUTA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLdapQouta() {
    return ldapQouta;
  }


  @JsonProperty(value = JSON_PROPERTY_LDAP_QOUTA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLdapQouta(@javax.annotation.Nullable Long ldapQouta) {
    this.ldapQouta = ldapQouta;
  }

  public UserInfo ssoNameId(@javax.annotation.Nullable String ssoNameId) {
    this.ssoNameId = JsonNullable.<String>of(ssoNameId);
    
    return this;
  }

  /**
   * The SSO SAML user identifier.
   * @return ssoNameId
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getSsoNameId() {
        return ssoNameId.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SSO_NAME_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getSsoNameId_JsonNullable() {
    return ssoNameId;
  }
  
  @JsonProperty(JSON_PROPERTY_SSO_NAME_ID)
  public void setSsoNameId_JsonNullable(JsonNullable<String> ssoNameId) {
    this.ssoNameId = ssoNameId;
  }

  public void setSsoNameId(@javax.annotation.Nullable String ssoNameId) {
    this.ssoNameId = JsonNullable.<String>of(ssoNameId);
  }

  public UserInfo ssoSessionId(@javax.annotation.Nullable String ssoSessionId) {
    this.ssoSessionId = JsonNullable.<String>of(ssoSessionId);
    
    return this;
  }

  /**
   * The SSO SAML user session identifier.
   * @return ssoSessionId
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getSsoSessionId() {
        return ssoSessionId.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SSO_SESSION_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getSsoSessionId_JsonNullable() {
    return ssoSessionId;
  }
  
  @JsonProperty(JSON_PROPERTY_SSO_SESSION_ID)
  public void setSsoSessionId_JsonNullable(JsonNullable<String> ssoSessionId) {
    this.ssoSessionId = ssoSessionId;
  }

  public void setSsoSessionId(@javax.annotation.Nullable String ssoSessionId) {
    this.ssoSessionId = JsonNullable.<String>of(ssoSessionId);
  }

  public UserInfo createDate(@javax.annotation.Nullable OffsetDateTime createDate) {
    
    this.createDate = createDate;
    return this;
  }

  /**
   * The date and time when the user account was created.
   * @return createDate
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CREATE_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreateDate() {
    return createDate;
  }


  @JsonProperty(value = JSON_PROPERTY_CREATE_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateDate(@javax.annotation.Nullable OffsetDateTime createDate) {
    this.createDate = createDate;
  }

  public UserInfo createdBy(@javax.annotation.Nullable UUID createdBy) {
    this.createdBy = JsonNullable.<UUID>of(createdBy);
    
    return this;
  }

  /**
   * The ID of the user who created the current user account.
   * @return createdBy
   */
  @javax.annotation.Nullable  @JsonIgnore

  public UUID getCreatedBy() {
        return createdBy.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_CREATED_BY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<UUID> getCreatedBy_JsonNullable() {
    return createdBy;
  }
  
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  public void setCreatedBy_JsonNullable(JsonNullable<UUID> createdBy) {
    this.createdBy = createdBy;
  }

  public void setCreatedBy(@javax.annotation.Nullable UUID createdBy) {
    this.createdBy = JsonNullable.<UUID>of(createdBy);
  }

  public UserInfo spam(@javax.annotation.Nullable Boolean spam) {
    this.spam = JsonNullable.<Boolean>of(spam);
    
    return this;
  }

  /**
   * Specifies if tips, updates and offers are allowed to be sent to the user or not.
   * @return spam
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getSpam() {
        return spam.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SPAM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getSpam_JsonNullable() {
    return spam;
  }
  
  @JsonProperty(JSON_PROPERTY_SPAM)
  public void setSpam_JsonNullable(JsonNullable<Boolean> spam) {
    this.spam = spam;
  }

  public void setSpam(@javax.annotation.Nullable Boolean spam) {
    this.spam = JsonNullable.<Boolean>of(spam);
  }

  /**
   * Indicates whether the activation status of the employee or recipient is unchecked or inactive.  Depending on the context, this property evaluates the activation or eligibility status accordingly.
   * @return checkActivation
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CHECK_ACTIVATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCheckActivation() {
    return checkActivation;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserInfo userInfo = (UserInfo) o;
    return Objects.equals(this.id, userInfo.id) &&
        equalsNullable(this.firstName, userInfo.firstName) &&
        equalsNullable(this.lastName, userInfo.lastName) &&
        equalsNullable(this.userName, userInfo.userName) &&
        equalsNullable(this.birthDate, userInfo.birthDate) &&
        equalsNullable(this.sex, userInfo.sex) &&
        Objects.equals(this.status, userInfo.status) &&
        Objects.equals(this.activationStatus, userInfo.activationStatus) &&
        equalsNullable(this.terminatedDate, userInfo.terminatedDate) &&
        equalsNullable(this.title, userInfo.title) &&
        equalsNullable(this.workFromDate, userInfo.workFromDate) &&
        equalsNullable(this.email, userInfo.email) &&
        equalsNullable(this.contacts, userInfo.contacts) &&
        equalsNullable(this.contactsList, userInfo.contactsList) &&
        equalsNullable(this.location, userInfo.location) &&
        equalsNullable(this.notes, userInfo.notes) &&
        Objects.equals(this.removed, userInfo.removed) &&
        Objects.equals(this.lastModified, userInfo.lastModified) &&
        Objects.equals(this.tenantId, userInfo.tenantId) &&
        Objects.equals(this.isActive, userInfo.isActive) &&
        equalsNullable(this.cultureName, userInfo.cultureName) &&
        equalsNullable(this.mobilePhone, userInfo.mobilePhone) &&
        Objects.equals(this.mobilePhoneActivationStatus, userInfo.mobilePhoneActivationStatus) &&
        equalsNullable(this.sid, userInfo.sid) &&
        Objects.equals(this.ldapQouta, userInfo.ldapQouta) &&
        equalsNullable(this.ssoNameId, userInfo.ssoNameId) &&
        equalsNullable(this.ssoSessionId, userInfo.ssoSessionId) &&
        Objects.equals(this.createDate, userInfo.createDate) &&
        equalsNullable(this.createdBy, userInfo.createdBy) &&
        equalsNullable(this.spam, userInfo.spam) &&
        Objects.equals(this.checkActivation, userInfo.checkActivation);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(firstName), hashCodeNullable(lastName), hashCodeNullable(userName), hashCodeNullable(birthDate), hashCodeNullable(sex), status, activationStatus, hashCodeNullable(terminatedDate), hashCodeNullable(title), hashCodeNullable(workFromDate), hashCodeNullable(email), hashCodeNullable(contacts), hashCodeNullable(contactsList), hashCodeNullable(location), hashCodeNullable(notes), removed, lastModified, tenantId, isActive, hashCodeNullable(cultureName), hashCodeNullable(mobilePhone), mobilePhoneActivationStatus, hashCodeNullable(sid), ldapQouta, hashCodeNullable(ssoNameId), hashCodeNullable(ssoSessionId), createDate, hashCodeNullable(createdBy), hashCodeNullable(spam), checkActivation);
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
    sb.append("class UserInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    activationStatus: ").append(toIndentedString(activationStatus)).append("\n");
    sb.append("    terminatedDate: ").append(toIndentedString(terminatedDate)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    workFromDate: ").append(toIndentedString(workFromDate)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    contactsList: ").append(toIndentedString(contactsList)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    removed: ").append(toIndentedString(removed)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    cultureName: ").append(toIndentedString(cultureName)).append("\n");
    sb.append("    mobilePhone: ").append(toIndentedString(mobilePhone)).append("\n");
    sb.append("    mobilePhoneActivationStatus: ").append(toIndentedString(mobilePhoneActivationStatus)).append("\n");
    sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
    sb.append("    ldapQouta: ").append(toIndentedString(ldapQouta)).append("\n");
    sb.append("    ssoNameId: ").append(toIndentedString(ssoNameId)).append("\n");
    sb.append("    ssoSessionId: ").append(toIndentedString(ssoSessionId)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    spam: ").append(toIndentedString(spam)).append("\n");
    sb.append("    checkActivation: ").append(toIndentedString(checkActivation)).append("\n");
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

    // add `birthDate` to the URL query string
    if (getBirthDate() != null) {
      try {
        joiner.add(String.format("%sbirthDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBirthDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
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

    // add `terminatedDate` to the URL query string
    if (getTerminatedDate() != null) {
      try {
        joiner.add(String.format("%sterminatedDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTerminatedDate()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `workFromDate` to the URL query string
    if (getWorkFromDate() != null) {
      try {
        joiner.add(String.format("%sworkFromDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWorkFromDate()), "UTF-8").replaceAll("\\+", "%20")));
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
      try {
        joiner.add(String.format("%scontacts%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getContacts()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `contactsList` to the URL query string
    if (getContactsList() != null) {
      for (int i = 0; i < getContactsList().size(); i++) {
        try {
          joiner.add(String.format("%scontactsList%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getContactsList().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
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

    // add `removed` to the URL query string
    if (getRemoved() != null) {
      try {
        joiner.add(String.format("%sremoved%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRemoved()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `tenantId` to the URL query string
    if (getTenantId() != null) {
      try {
        joiner.add(String.format("%stenantId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTenantId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isActive` to the URL query string
    if (getIsActive() != null) {
      try {
        joiner.add(String.format("%sisActive%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsActive()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `sid` to the URL query string
    if (getSid() != null) {
      try {
        joiner.add(String.format("%ssid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSid()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `ldapQouta` to the URL query string
    if (getLdapQouta() != null) {
      try {
        joiner.add(String.format("%sldapQouta%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLdapQouta()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `ssoNameId` to the URL query string
    if (getSsoNameId() != null) {
      try {
        joiner.add(String.format("%sssoNameId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSsoNameId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `ssoSessionId` to the URL query string
    if (getSsoSessionId() != null) {
      try {
        joiner.add(String.format("%sssoSessionId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSsoSessionId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `createDate` to the URL query string
    if (getCreateDate() != null) {
      try {
        joiner.add(String.format("%screateDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreateDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `createdBy` to the URL query string
    if (getCreatedBy() != null) {
      try {
        joiner.add(String.format("%screatedBy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedBy()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `checkActivation` to the URL query string
    if (getCheckActivation() != null) {
      try {
        joiner.add(String.format("%scheckActivation%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCheckActivation()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

