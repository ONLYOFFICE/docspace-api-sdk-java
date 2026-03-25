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
import org.openapitools.client.model.ApiDateTime;
import org.openapitools.client.model.Contact;
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
 * The request parameters for updating the user information.
 */
@JsonPropertyOrder({
  UpdateMemberRequestDto.JSON_PROPERTY_USER_ID,
  UpdateMemberRequestDto.JSON_PROPERTY_DISABLE,
  UpdateMemberRequestDto.JSON_PROPERTY_EMAIL,
  UpdateMemberRequestDto.JSON_PROPERTY_IS_USER,
  UpdateMemberRequestDto.JSON_PROPERTY_FIRST_NAME,
  UpdateMemberRequestDto.JSON_PROPERTY_LAST_NAME,
  UpdateMemberRequestDto.JSON_PROPERTY_DEPARTMENT,
  UpdateMemberRequestDto.JSON_PROPERTY_TITLE,
  UpdateMemberRequestDto.JSON_PROPERTY_LOCATION,
  UpdateMemberRequestDto.JSON_PROPERTY_SEX,
  UpdateMemberRequestDto.JSON_PROPERTY_BIRTHDAY,
  UpdateMemberRequestDto.JSON_PROPERTY_WORKSFROM,
  UpdateMemberRequestDto.JSON_PROPERTY_COMMENT,
  UpdateMemberRequestDto.JSON_PROPERTY_CONTACTS,
  UpdateMemberRequestDto.JSON_PROPERTY_FILES,
  UpdateMemberRequestDto.JSON_PROPERTY_SPAM
})

public class UpdateMemberRequestDto {
  public static final String JSON_PROPERTY_USER_ID = "userId";
  @javax.annotation.Nullable  private JsonNullable<String> userId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DISABLE = "disable";
  @javax.annotation.Nullable  private JsonNullable<Boolean> disable = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_EMAIL = "email";
  @javax.annotation.Nullable  private JsonNullable<String> email = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IS_USER = "isUser";
  @javax.annotation.Nullable  private JsonNullable<Boolean> isUser = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  @javax.annotation.Nullable  private JsonNullable<String> firstName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  @javax.annotation.Nullable  private JsonNullable<String> lastName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DEPARTMENT = "department";
  @javax.annotation.Nullable  private JsonNullable<List<UUID>> department = JsonNullable.<List<UUID>>undefined();

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable  private JsonNullable<String> title = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LOCATION = "location";
  @javax.annotation.Nullable  private JsonNullable<String> location = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SEX = "sex";
  @javax.annotation.Nullable  private SexEnum sex;

  public static final String JSON_PROPERTY_BIRTHDAY = "birthday";
  @javax.annotation.Nullable  private ApiDateTime birthday;

  public static final String JSON_PROPERTY_WORKSFROM = "worksfrom";
  @javax.annotation.Nullable  private ApiDateTime worksfrom;

  public static final String JSON_PROPERTY_COMMENT = "comment";
  @javax.annotation.Nullable  private JsonNullable<String> comment = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CONTACTS = "contacts";
  @javax.annotation.Nullable  private JsonNullable<List<Contact>> contacts = JsonNullable.<List<Contact>>undefined();

  public static final String JSON_PROPERTY_FILES = "files";
  @javax.annotation.Nullable  private JsonNullable<String> files = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SPAM = "spam";
  @javax.annotation.Nullable  private JsonNullable<Boolean> spam = JsonNullable.<Boolean>undefined();

  public UpdateMemberRequestDto() {
  }


  public UpdateMemberRequestDto userId(@javax.annotation.Nullable String userId) {
    this.userId = JsonNullable.<String>of(userId);
    
    return this;
  }

  /**
   * The user ID.
   * @return userId
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getUserId() {
        return userId.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_USER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getUserId_JsonNullable() {
    return userId;
  }
  
  @JsonProperty(JSON_PROPERTY_USER_ID)
  public void setUserId_JsonNullable(JsonNullable<String> userId) {
    this.userId = userId;
  }

  public void setUserId(@javax.annotation.Nullable String userId) {
    this.userId = JsonNullable.<String>of(userId);
  }

  public UpdateMemberRequestDto disable(@javax.annotation.Nullable Boolean disable) {
    this.disable = JsonNullable.<Boolean>of(disable);
    
    return this;
  }

  /**
   * Specifies whether to disable a user or not.
   * @return disable
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getDisable() {
        return disable.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_DISABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getDisable_JsonNullable() {
    return disable;
  }
  
  @JsonProperty(JSON_PROPERTY_DISABLE)
  public void setDisable_JsonNullable(JsonNullable<Boolean> disable) {
    this.disable = disable;
  }

  public void setDisable(@javax.annotation.Nullable Boolean disable) {
    this.disable = JsonNullable.<Boolean>of(disable);
  }

  public UpdateMemberRequestDto email(@javax.annotation.Nullable String email) {
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

  public UpdateMemberRequestDto isUser(@javax.annotation.Nullable Boolean isUser) {
    this.isUser = JsonNullable.<Boolean>of(isUser);
    
    return this;
  }

  /**
   * Specifies if this is a guest or a user.
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

  public UpdateMemberRequestDto firstName(@javax.annotation.Nullable String firstName) {
    this.firstName = JsonNullable.<String>of(firstName);
    
    return this;
  }

  /**
   * The user first name.
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

  public UpdateMemberRequestDto lastName(@javax.annotation.Nullable String lastName) {
    this.lastName = JsonNullable.<String>of(lastName);
    
    return this;
  }

  /**
   * The user last name.
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

  public UpdateMemberRequestDto department(@javax.annotation.Nullable List<UUID> department) {
    this.department = JsonNullable.<List<UUID>>of(department);
    
    return this;
  }

  public UpdateMemberRequestDto addDepartmentItem(UUID departmentItem) {
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
   * The list of the user departments.
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

  public UpdateMemberRequestDto title(@javax.annotation.Nullable String title) {
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

  public UpdateMemberRequestDto location(@javax.annotation.Nullable String location) {
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

  public UpdateMemberRequestDto sex(@javax.annotation.Nullable SexEnum sex) {
    
    this.sex = sex;
    return this;
  }

  /**
   * Get sex
   * @return sex
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SEX, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SexEnum getSex() {
    return sex;
  }


  @JsonProperty(value = JSON_PROPERTY_SEX, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSex(@javax.annotation.Nullable SexEnum sex) {
    this.sex = sex;
  }

  public UpdateMemberRequestDto birthday(@javax.annotation.Nullable ApiDateTime birthday) {
    
    this.birthday = birthday;
    return this;
  }

  /**
   * Get birthday
   * @return birthday
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_BIRTHDAY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDateTime getBirthday() {
    return birthday;
  }


  @JsonProperty(value = JSON_PROPERTY_BIRTHDAY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBirthday(@javax.annotation.Nullable ApiDateTime birthday) {
    this.birthday = birthday;
  }

  public UpdateMemberRequestDto worksfrom(@javax.annotation.Nullable ApiDateTime worksfrom) {
    
    this.worksfrom = worksfrom;
    return this;
  }

  /**
   * Get worksfrom
   * @return worksfrom
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_WORKSFROM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDateTime getWorksfrom() {
    return worksfrom;
  }


  @JsonProperty(value = JSON_PROPERTY_WORKSFROM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWorksfrom(@javax.annotation.Nullable ApiDateTime worksfrom) {
    this.worksfrom = worksfrom;
  }

  public UpdateMemberRequestDto comment(@javax.annotation.Nullable String comment) {
    this.comment = JsonNullable.<String>of(comment);
    
    return this;
  }

  /**
   * The user comment.
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

  public UpdateMemberRequestDto contacts(@javax.annotation.Nullable List<Contact> contacts) {
    this.contacts = JsonNullable.<List<Contact>>of(contacts);
    
    return this;
  }

  public UpdateMemberRequestDto addContactsItem(Contact contactsItem) {
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

  public UpdateMemberRequestDto files(@javax.annotation.Nullable String files) {
    this.files = JsonNullable.<String>of(files);
    
    return this;
  }

  /**
   * The user avatar photo URL.
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

  public UpdateMemberRequestDto spam(@javax.annotation.Nullable Boolean spam) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateMemberRequestDto updateMemberRequestDto = (UpdateMemberRequestDto) o;
    return equalsNullable(this.userId, updateMemberRequestDto.userId) &&
        equalsNullable(this.disable, updateMemberRequestDto.disable) &&
        equalsNullable(this.email, updateMemberRequestDto.email) &&
        equalsNullable(this.isUser, updateMemberRequestDto.isUser) &&
        equalsNullable(this.firstName, updateMemberRequestDto.firstName) &&
        equalsNullable(this.lastName, updateMemberRequestDto.lastName) &&
        equalsNullable(this.department, updateMemberRequestDto.department) &&
        equalsNullable(this.title, updateMemberRequestDto.title) &&
        equalsNullable(this.location, updateMemberRequestDto.location) &&
        Objects.equals(this.sex, updateMemberRequestDto.sex) &&
        Objects.equals(this.birthday, updateMemberRequestDto.birthday) &&
        Objects.equals(this.worksfrom, updateMemberRequestDto.worksfrom) &&
        equalsNullable(this.comment, updateMemberRequestDto.comment) &&
        equalsNullable(this.contacts, updateMemberRequestDto.contacts) &&
        equalsNullable(this.files, updateMemberRequestDto.files) &&
        equalsNullable(this.spam, updateMemberRequestDto.spam);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(userId), hashCodeNullable(disable), hashCodeNullable(email), hashCodeNullable(isUser), hashCodeNullable(firstName), hashCodeNullable(lastName), hashCodeNullable(department), hashCodeNullable(title), hashCodeNullable(location), sex, birthday, worksfrom, hashCodeNullable(comment), hashCodeNullable(contacts), hashCodeNullable(files), hashCodeNullable(spam));
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
    sb.append("class UpdateMemberRequestDto {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    disable: ").append(toIndentedString(disable)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

    // add `userId` to the URL query string
    if (getUserId() != null) {
      try {
        joiner.add(String.format("%suserId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUserId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `disable` to the URL query string
    if (getDisable() != null) {
      try {
        joiner.add(String.format("%sdisable%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDisable()), "UTF-8").replaceAll("\\+", "%20")));
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

