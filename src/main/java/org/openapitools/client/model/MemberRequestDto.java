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
import org.openapitools.client.model.Contact;
import org.openapitools.client.model.EmployeeType;
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
  MemberRequestDto.JSON_PROPERTY_LOCATION,
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
  @javax.annotation.Nullable  private JsonNullable<String> password = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PASSWORD_HASH = "passwordHash";
  @javax.annotation.Nullable  private JsonNullable<String> passwordHash = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EMAIL = "email";
  @javax.annotation.Nullable  private JsonNullable<String> email = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable  private EmployeeType type;

  public static final String JSON_PROPERTY_IS_USER = "isUser";
  @javax.annotation.Nullable  private JsonNullable<Boolean> isUser = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  @javax.annotation.Nullable  private JsonNullable<String> firstName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  @javax.annotation.Nullable  private JsonNullable<String> lastName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DEPARTMENT = "department";
  @javax.annotation.Nullable  private JsonNullable<List<UUID>> department = JsonNullable.<List<UUID>>undefined();

  public static final String JSON_PROPERTY_LOCATION = "location";
  @javax.annotation.Nullable  private JsonNullable<String> location = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COMMENT = "comment";
  @javax.annotation.Nullable  private JsonNullable<String> comment = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CONTACTS = "contacts";
  @javax.annotation.Nullable  private JsonNullable<List<Contact>> contacts = JsonNullable.<List<Contact>>undefined();

  public static final String JSON_PROPERTY_FILES = "files";
  @javax.annotation.Nullable  private JsonNullable<String> files = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FROM_INVITE_LINK = "fromInviteLink";
  @javax.annotation.Nullable  private Boolean fromInviteLink;

  public static final String JSON_PROPERTY_KEY = "key";
  @javax.annotation.Nullable  private JsonNullable<String> key = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CULTURE_NAME = "cultureName";
  @javax.annotation.Nullable  private JsonNullable<String> cultureName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TARGET = "target";
  @javax.annotation.Nullable  private UUID target;

  public static final String JSON_PROPERTY_SPAM = "spam";
  @javax.annotation.Nullable  private JsonNullable<Boolean> spam = JsonNullable.<Boolean>undefined();

  public MemberRequestDto() {
  }


  public MemberRequestDto password(@javax.annotation.Nullable String password) {
    this.password = JsonNullable.<String>of(password);
    
    return this;
  }

  /**
   * The password in plain text. It is checked against the portal password policy and rejected with 400 when it is  too weak. When neither this field nor `passwordHash` is sent, a random password is generated and nobody  learns it, so the account can only be used after a password recovery.
   * @return password
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getPassword() {
        return password.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_PASSWORD, required = false)
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
   * The password already hashed by the client, which is what the portal stores. It is a PBKDF2-HMACSHA256 hash of  the plain password, computed with the salt, the iteration count and the key size the portal settings publish,  and written as lowercase hexadecimal. When it is sent, `password` is ignored and the password policy is not  applied.
   * @return passwordHash
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getPasswordHash() {
        return passwordHash.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_PASSWORD_HASH, required = false)
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
   * The email address of the new account, up to 255 characters. It is required in practice and has to be a real  address, and it becomes the sign-in name of the account.
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

  public MemberRequestDto type(@javax.annotation.Nullable EmployeeType type) {
    
    this.type = type;
    return this;
  }

  /**
   * The type of the new account: `User`, `RoomAdmin` or `DocSpaceAdmin`. `Guest` is not accepted here, and the  value is ignored entirely when `fromInviteLink` is set, because the invitation link decides the type. When no  paid seat is free, the account is created as `User` whatever was asked for.
   * @return type
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EmployeeType getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@javax.annotation.Nullable EmployeeType type) {
    this.type = type;
  }

  public MemberRequestDto isUser(@javax.annotation.Nullable Boolean isUser) {
    this.isUser = JsonNullable.<Boolean>of(isUser);
    
    return this;
  }

  /**
   * Only chooses which entry the operation writes to the audit trail - the one for a guest or the one for a  member. It does not change the type of the account; `type` and the invitation link do that.
   * @return isUser
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getIsUser() {
        return isUser.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_IS_USER, required = false)
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
   * The first name, up to 255 characters. It is checked together with `lastName`, and a pair the portal does not  accept as a name answers 400.
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

  public MemberRequestDto lastName(@javax.annotation.Nullable String lastName) {
    this.lastName = JsonNullable.<String>of(lastName);
    
    return this;
  }

  /**
   * The last name, up to 255 characters. It is checked together with `firstName`, and a pair the portal does not  accept as a name answers 400.
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
   * The groups to put the new account into, by group ID. Read the IDs from `GET api/2.0/group`; an ID that  matches no group is skipped without an error.
   * @return department
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<UUID> getDepartment() {
        return department.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_DEPARTMENT, required = false)
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

  public MemberRequestDto location(@javax.annotation.Nullable String location) {
    this.location = JsonNullable.<String>of(location);
    
    return this;
  }

  /**
   * The free-text location shown on the profile. It is stored as it is given and is not validated.
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

  public MemberRequestDto comment(@javax.annotation.Nullable String comment) {
    this.comment = JsonNullable.<String>of(comment);
    
    return this;
  }

  /**
   * The free-text note kept with the profile, shown to administrators. It is stored as it is given.
   * @return comment
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getComment() {
        return comment.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_COMMENT, required = false)
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
   * The additional ways to reach the person, each as a type and a value pair. The type is a free-text label such  as `email`, `phone`, `skype` or `telegram`, and an entry with an empty value is dropped.
   * @return contacts
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<Contact> getContacts() {
        return contacts.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_CONTACTS, required = false)
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
   * The address the portal downloads the avatar from. It has to use HTTPS unless the request itself came over  HTTP, an address the portal refuses to fetch is rejected, and passing the default avatar path means no  avatar is downloaded.
   * @return files
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getFiles() {
        return files.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_FILES, required = false)
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
   * Set it to true when the account is created by somebody accepting an invitation, which makes `key` required  and lets the link decide the type. With the default false the caller has to hold the permission to add an  account of the requested type.
   * @return fromInviteLink
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_FROM_INVITE_LINK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFromInviteLink() {
    return fromInviteLink;
  }


  @JsonProperty(value = JSON_PROPERTY_FROM_INVITE_LINK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFromInviteLink(@javax.annotation.Nullable Boolean fromInviteLink) {
    this.fromInviteLink = fromInviteLink;
  }

  public MemberRequestDto key(@javax.annotation.Nullable String key) {
    this.key = JsonNullable.<String>of(key);
    
    return this;
  }

  /**
   * The key of the invitation link being accepted, taken from the link itself. It is read only when  `fromInviteLink` is true, and an expired or already used key answers 403.
   * @return key
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getKey() {
        return key.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_KEY, required = false)
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
   * The interface language of the new account, as a culture code. It is applied whether or not the portal has  that culture enabled, so send a code the portal supports.
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

  public MemberRequestDto target(@javax.annotation.Nullable UUID target) {
    
    this.target = target;
    return this;
  }

  /**
   * Not used. The handler reads nothing from this field, and it is kept only so that existing clients keep  working.
   * @return target
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TARGET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getTarget() {
    return target;
  }


  @JsonProperty(value = JSON_PROPERTY_TARGET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTarget(@javax.annotation.Nullable UUID target) {
    this.target = target;
  }

  public MemberRequestDto spam(@javax.annotation.Nullable Boolean spam) {
    this.spam = JsonNullable.<Boolean>of(spam);
    
    return this;
  }

  /**
   * Whether the account agrees to receive tips, updates and offers. It defaults to false, which means no such  mail is sent.
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
        equalsNullable(this.location, memberRequestDto.location) &&
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
    return Objects.hash(hashCodeNullable(password), hashCodeNullable(passwordHash), hashCodeNullable(email), type, hashCodeNullable(isUser), hashCodeNullable(firstName), hashCodeNullable(lastName), hashCodeNullable(department), hashCodeNullable(location), hashCodeNullable(comment), hashCodeNullable(contacts), hashCodeNullable(files), fromInviteLink, hashCodeNullable(key), hashCodeNullable(cultureName), target, hashCodeNullable(spam));
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
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

    // add `location` to the URL query string
    if (getLocation() != null) {
      try {
        joiner.add(String.format("%slocation%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLocation()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
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

