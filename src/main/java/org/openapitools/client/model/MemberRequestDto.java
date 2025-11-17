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
import org.openapitools.client.model.EmployeeType;
import org.openapitools.client.model.SexEnum;
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
 * The user request parameters.
 */
@JsonPropertyOrder({
  MemberRequestDto.JSON_PROPERTY_PASSWORD,
  MemberRequestDto.JSON_PROPERTY_PASSWORD_HASH,
  MemberRequestDto.JSON_PROPERTY_EMAIL,
  MemberRequestDto.JSON_PROPERTY_TYPE,
  MemberRequestDto.JSON_PROPERTY_IS_USER,
  MemberRequestDto.JSON_PROPERTY_FIRST_NAME,
  MemberRequestDto.JSON_PROPERTY_LAST_NAME,
  MemberRequestDto.JSON_PROPERTY_DEPARTMENT,
  MemberRequestDto.JSON_PROPERTY_TITLE,
  MemberRequestDto.JSON_PROPERTY_LOCATION,
  MemberRequestDto.JSON_PROPERTY_SEX,
  MemberRequestDto.JSON_PROPERTY_BIRTHDAY,
  MemberRequestDto.JSON_PROPERTY_WORKSFROM,
  MemberRequestDto.JSON_PROPERTY_COMMENT,
  MemberRequestDto.JSON_PROPERTY_CONTACTS,
  MemberRequestDto.JSON_PROPERTY_FILES,
  MemberRequestDto.JSON_PROPERTY_FROM_INVITE_LINK,
  MemberRequestDto.JSON_PROPERTY_KEY,
  MemberRequestDto.JSON_PROPERTY_CULTURE_NAME,
  MemberRequestDto.JSON_PROPERTY_TARGET,
  MemberRequestDto.JSON_PROPERTY_SPAM
})

public class MemberRequestDto {
  public static final String JSON_PROPERTY_PASSWORD = "password";
  @javax.annotation.Nullable
  private JsonNullable<String> password = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PASSWORD_HASH = "passwordHash";
  @javax.annotation.Nullable
  private JsonNullable<String> passwordHash = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EMAIL = "email";
  @javax.annotation.Nullable
  private JsonNullable<String> email = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable
  private EmployeeType type;

  public static final String JSON_PROPERTY_IS_USER = "isUser";
  @javax.annotation.Nullable
  private JsonNullable<Boolean> isUser = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  @javax.annotation.Nullable
  private JsonNullable<String> firstName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  @javax.annotation.Nullable
  private JsonNullable<String> lastName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DEPARTMENT = "department";
  @javax.annotation.Nullable
  private JsonNullable<List<UUID>> department = JsonNullable.<List<UUID>>undefined();

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable
  private JsonNullable<String> title = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LOCATION = "location";
  @javax.annotation.Nullable
  private JsonNullable<String> location = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SEX = "sex";
  @javax.annotation.Nullable
  private SexEnum sex;

  public static final String JSON_PROPERTY_BIRTHDAY = "birthday";
  @javax.annotation.Nullable
  private ApiDateTime birthday;

  public static final String JSON_PROPERTY_WORKSFROM = "worksfrom";
  @javax.annotation.Nullable
  private ApiDateTime worksfrom;

  public static final String JSON_PROPERTY_COMMENT = "comment";
  @javax.annotation.Nullable
  private JsonNullable<String> comment = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CONTACTS = "contacts";
  @javax.annotation.Nullable
  private JsonNullable<List<Contact>> contacts = JsonNullable.<List<Contact>>undefined();

  public static final String JSON_PROPERTY_FILES = "files";
  @javax.annotation.Nullable
  private JsonNullable<String> files = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FROM_INVITE_LINK = "fromInviteLink";
  @javax.annotation.Nullable
  private Boolean fromInviteLink;

  public static final String JSON_PROPERTY_KEY = "key";
  @javax.annotation.Nullable
  private JsonNullable<String> key = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CULTURE_NAME = "cultureName";
  @javax.annotation.Nullable
  private JsonNullable<String> cultureName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TARGET = "target";
  @javax.annotation.Nullable
  private UUID target;

  public static final String JSON_PROPERTY_SPAM = "spam";
  @javax.annotation.Nullable
  private JsonNullable<Boolean> spam = JsonNullable.<Boolean>undefined();

  public MemberRequestDto() {
  }

  public MemberRequestDto password(@javax.annotation.Nullable String password) {
    this.password = JsonNullable.<String>of(password);
    
    return this;
  }

  /**
   * The user password.
   * @return password
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPassword() {
        return password.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPassword_JsonNullable() {
    return password;
  }
  
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  public void setPassword_JsonNullable(JsonNullable<String> password) {
    this.password = password;
  }

  public void setPassword(@javax.annotation.Nullable String password) {
    this.password = JsonNullable.<String>of(password);
  }

  public MemberRequestDto passwordHash(@javax.annotation.Nullable String passwordHash) {
    this.passwordHash = JsonNullable.<String>of(passwordHash);
    
    return this;
  }

  /**
   * The user password hash.
   * @return passwordHash
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPasswordHash() {
        return passwordHash.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PASSWORD_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPasswordHash_JsonNullable() {
    return passwordHash;
  }
  
  @JsonProperty(JSON_PROPERTY_PASSWORD_HASH)
  public void setPasswordHash_JsonNullable(JsonNullable<String> passwordHash) {
    this.passwordHash = passwordHash;
  }

  public void setPasswordHash(@javax.annotation.Nullable String passwordHash) {
    this.passwordHash = JsonNullable.<String>of(passwordHash);
  }

  public MemberRequestDto email(@javax.annotation.Nullable String email) {
    this.email = JsonNullable.<String>of(email);
    
    return this;
  }

  /**
   * The user email address.
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

  public MemberRequestDto type(@javax.annotation.Nullable EmployeeType type) {
    
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EmployeeType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@javax.annotation.Nullable EmployeeType type) {
    this.type = type;
  }

  public MemberRequestDto isUser(@javax.annotation.Nullable Boolean isUser) {
    this.isUser = JsonNullable.<Boolean>of(isUser);
    
    return this;
  }

  /**
   * Specifies if this is a guest or a user.
   * @return isUser
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getIsUser() {
        return isUser.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IS_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getIsUser_JsonNullable() {
    return isUser;
  }
  
  @JsonProperty(JSON_PROPERTY_IS_USER)
  public void setIsUser_JsonNullable(JsonNullable<Boolean> isUser) {
    this.isUser = isUser;
  }

  public void setIsUser(@javax.annotation.Nullable Boolean isUser) {
    this.isUser = JsonNullable.<Boolean>of(isUser);
  }

  public MemberRequestDto firstName(@javax.annotation.Nullable String firstName) {
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

  public MemberRequestDto lastName(@javax.annotation.Nullable String lastName) {
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

  public MemberRequestDto department(@javax.annotation.Nullable List<UUID> department) {
    this.department = JsonNullable.<List<UUID>>of(department);
    
    return this;
  }

  public MemberRequestDto addDepartmentItem(UUID departmentItem) {
    if (this.department == null || !this.department.isPresent()) {
      this.department = JsonNullable.<List<UUID>>of(new ArrayList<>());
    }
    try {
      this.department.get().add(departmentItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of the user departments IDs.
   * @return department
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<UUID> getDepartment() {
        return department.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DEPARTMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<UUID>> getDepartment_JsonNullable() {
    return department;
  }
  
  @JsonProperty(JSON_PROPERTY_DEPARTMENT)
  public void setDepartment_JsonNullable(JsonNullable<List<UUID>> department) {
    this.department = department;
  }

  public void setDepartment(@javax.annotation.Nullable List<UUID> department) {
    this.department = JsonNullable.<List<UUID>>of(department);
  }

  public MemberRequestDto title(@javax.annotation.Nullable String title) {
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

  public MemberRequestDto location(@javax.annotation.Nullable String location) {
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

  public MemberRequestDto sex(@javax.annotation.Nullable SexEnum sex) {
    
    this.sex = sex;
    return this;
  }

  /**
   * Get sex
   * @return sex
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SexEnum getSex() {
    return sex;
  }


  @JsonProperty(JSON_PROPERTY_SEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSex(@javax.annotation.Nullable SexEnum sex) {
    this.sex = sex;
  }

  public MemberRequestDto birthday(@javax.annotation.Nullable ApiDateTime birthday) {
    
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

  public MemberRequestDto worksfrom(@javax.annotation.Nullable ApiDateTime worksfrom) {
    
    this.worksfrom = worksfrom;
    return this;
  }

  /**
   * Get worksfrom
   * @return worksfrom
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WORKSFROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDateTime getWorksfrom() {
    return worksfrom;
  }


  @JsonProperty(JSON_PROPERTY_WORKSFROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWorksfrom(@javax.annotation.Nullable ApiDateTime worksfrom) {
    this.worksfrom = worksfrom;
  }

  public MemberRequestDto comment(@javax.annotation.Nullable String comment) {
    this.comment = JsonNullable.<String>of(comment);
    
    return this;
  }

  /**
   * The user comment.
   * @return comment
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getComment() {
        return comment.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getComment_JsonNullable() {
    return comment;
  }
  
  @JsonProperty(JSON_PROPERTY_COMMENT)
  public void setComment_JsonNullable(JsonNullable<String> comment) {
    this.comment = comment;
  }

  public void setComment(@javax.annotation.Nullable String comment) {
    this.comment = JsonNullable.<String>of(comment);
  }

  public MemberRequestDto contacts(@javax.annotation.Nullable List<Contact> contacts) {
    this.contacts = JsonNullable.<List<Contact>>of(contacts);
    
    return this;
  }

  public MemberRequestDto addContactsItem(Contact contactsItem) {
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
   * The list of the user contacts.
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

  public MemberRequestDto files(@javax.annotation.Nullable String files) {
    this.files = JsonNullable.<String>of(files);
    
    return this;
  }

  /**
   * The avatar photo URL.
   * @return files
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getFiles() {
        return files.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFiles_JsonNullable() {
    return files;
  }
  
  @JsonProperty(JSON_PROPERTY_FILES)
  public void setFiles_JsonNullable(JsonNullable<String> files) {
    this.files = files;
  }

  public void setFiles(@javax.annotation.Nullable String files) {
    this.files = JsonNullable.<String>of(files);
  }

  public MemberRequestDto fromInviteLink(@javax.annotation.Nullable Boolean fromInviteLink) {
    
    this.fromInviteLink = fromInviteLink;
    return this;
  }

  /**
   * Specifies if the user is added via the invitation link or not.
   * @return fromInviteLink
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FROM_INVITE_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFromInviteLink() {
    return fromInviteLink;
  }


  @JsonProperty(JSON_PROPERTY_FROM_INVITE_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFromInviteLink(@javax.annotation.Nullable Boolean fromInviteLink) {
    this.fromInviteLink = fromInviteLink;
  }

  public MemberRequestDto key(@javax.annotation.Nullable String key) {
    this.key = JsonNullable.<String>of(key);
    
    return this;
  }

  /**
   * The user key.
   * @return key
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getKey() {
        return key.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getKey_JsonNullable() {
    return key;
  }
  
  @JsonProperty(JSON_PROPERTY_KEY)
  public void setKey_JsonNullable(JsonNullable<String> key) {
    this.key = key;
  }

  public void setKey(@javax.annotation.Nullable String key) {
    this.key = JsonNullable.<String>of(key);
  }

  public MemberRequestDto cultureName(@javax.annotation.Nullable String cultureName) {
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

  public MemberRequestDto target(@javax.annotation.Nullable UUID target) {
    
    this.target = target;
    return this;
  }

  /**
   * The user target ID.
   * @return target
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getTarget() {
    return target;
  }


  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTarget(@javax.annotation.Nullable UUID target) {
    this.target = target;
  }

  public MemberRequestDto spam(@javax.annotation.Nullable Boolean spam) {
    this.spam = JsonNullable.<Boolean>of(spam);
    
    return this;
  }

  /**
   * Specifies if tips, updates and offers are allowed to be sent to the user or not.
   * @return spam
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getSpam() {
        return spam.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SPAM)
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberRequestDto memberRequestDto = (MemberRequestDto) o;
    return equalsNullable(this.password, memberRequestDto.password) &&
        equalsNullable(this.passwordHash, memberRequestDto.passwordHash) &&
        equalsNullable(this.email, memberRequestDto.email) &&
        Objects.equals(this.type, memberRequestDto.type) &&
        equalsNullable(this.isUser, memberRequestDto.isUser) &&
        equalsNullable(this.firstName, memberRequestDto.firstName) &&
        equalsNullable(this.lastName, memberRequestDto.lastName) &&
        equalsNullable(this.department, memberRequestDto.department) &&
        equalsNullable(this.title, memberRequestDto.title) &&
        equalsNullable(this.location, memberRequestDto.location) &&
        Objects.equals(this.sex, memberRequestDto.sex) &&
        Objects.equals(this.birthday, memberRequestDto.birthday) &&
        Objects.equals(this.worksfrom, memberRequestDto.worksfrom) &&
        equalsNullable(this.comment, memberRequestDto.comment) &&
        equalsNullable(this.contacts, memberRequestDto.contacts) &&
        equalsNullable(this.files, memberRequestDto.files) &&
        Objects.equals(this.fromInviteLink, memberRequestDto.fromInviteLink) &&
        equalsNullable(this.key, memberRequestDto.key) &&
        equalsNullable(this.cultureName, memberRequestDto.cultureName) &&
        Objects.equals(this.target, memberRequestDto.target) &&
        equalsNullable(this.spam, memberRequestDto.spam);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(password), hashCodeNullable(passwordHash), hashCodeNullable(email), type, hashCodeNullable(isUser), hashCodeNullable(firstName), hashCodeNullable(lastName), hashCodeNullable(department), hashCodeNullable(title), hashCodeNullable(location), sex, birthday, worksfrom, hashCodeNullable(comment), hashCodeNullable(contacts), hashCodeNullable(files), fromInviteLink, hashCodeNullable(key), hashCodeNullable(cultureName), target, hashCodeNullable(spam));
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
    sb.append("class MemberRequestDto {\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    passwordHash: ").append(toIndentedString(passwordHash)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isUser: ").append(toIndentedString(isUser)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("    worksfrom: ").append(toIndentedString(worksfrom)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    fromInviteLink: ").append(toIndentedString(fromInviteLink)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    cultureName: ").append(toIndentedString(cultureName)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    spam: ").append(toIndentedString(spam)).append("\n");
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

    // add `password` to the URL query string
    if (getPassword() != null) {
      try {
        joiner.add(String.format("%spassword%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPassword()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `passwordHash` to the URL query string
    if (getPasswordHash() != null) {
      try {
        joiner.add(String.format("%spasswordHash%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPasswordHash()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `type` to the URL query string
    if (getType() != null) {
      try {
        joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isUser` to the URL query string
    if (getIsUser() != null) {
      try {
        joiner.add(String.format("%sisUser%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsUser()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `department` to the URL query string
    if (getDepartment() != null) {
      for (int i = 0; i < getDepartment().size(); i++) {
        if (getDepartment().get(i) != null) {
          try {
            joiner.add(String.format("%sdepartment%s%s=%s", prefix, suffix,
                "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
                URLEncoder.encode(String.valueOf(getDepartment().get(i)), "UTF-8").replaceAll("\\+", "%20")));
          } catch (UnsupportedEncodingException e) {
            // Should never happen, UTF-8 is always supported
            throw new RuntimeException(e);
          }
        }
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

    // add `location` to the URL query string
    if (getLocation() != null) {
      try {
        joiner.add(String.format("%slocation%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLocation()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `birthday` to the URL query string
    if (getBirthday() != null) {
      joiner.add(getBirthday().toUrlQueryString(prefix + "birthday" + suffix));
    }

    // add `worksfrom` to the URL query string
    if (getWorksfrom() != null) {
      joiner.add(getWorksfrom().toUrlQueryString(prefix + "worksfrom" + suffix));
    }

    // add `comment` to the URL query string
    if (getComment() != null) {
      try {
        joiner.add(String.format("%scomment%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getComment()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `files` to the URL query string
    if (getFiles() != null) {
      try {
        joiner.add(String.format("%sfiles%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFiles()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `fromInviteLink` to the URL query string
    if (getFromInviteLink() != null) {
      try {
        joiner.add(String.format("%sfromInviteLink%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFromInviteLink()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `key` to the URL query string
    if (getKey() != null) {
      try {
        joiner.add(String.format("%skey%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getKey()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `target` to the URL query string
    if (getTarget() != null) {
      try {
        joiner.add(String.format("%starget%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTarget()), "UTF-8").replaceAll("\\+", "%20")));
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

    return joiner.toString();
  }

}

