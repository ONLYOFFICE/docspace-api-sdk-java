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
import org.openapitools.client.model.MigratingApiGroup;
import org.openapitools.client.model.MigratingApiUser;
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
 * MigrationApiInfo
 */
@JsonPropertyOrder({
  MigrationApiInfo.JSON_PROPERTY_MIGRATOR_NAME,
  MigrationApiInfo.JSON_PROPERTY_OPERATION,
  MigrationApiInfo.JSON_PROPERTY_FAILED_ARCHIVES,
  MigrationApiInfo.JSON_PROPERTY_USERS,
  MigrationApiInfo.JSON_PROPERTY_WITHOUT_EMAIL_USERS,
  MigrationApiInfo.JSON_PROPERTY_EXIST_USERS,
  MigrationApiInfo.JSON_PROPERTY_GROUPS,
  MigrationApiInfo.JSON_PROPERTY_IMPORT_PERSONAL_FILES,
  MigrationApiInfo.JSON_PROPERTY_IMPORT_SHARED_FILES,
  MigrationApiInfo.JSON_PROPERTY_IMPORT_SHARED_FOLDERS,
  MigrationApiInfo.JSON_PROPERTY_IMPORT_COMMON_FILES,
  MigrationApiInfo.JSON_PROPERTY_IMPORT_PROJECT_FILES,
  MigrationApiInfo.JSON_PROPERTY_IMPORT_GROUPS,
  MigrationApiInfo.JSON_PROPERTY_SUCCESSED_USERS,
  MigrationApiInfo.JSON_PROPERTY_FAILED_USERS,
  MigrationApiInfo.JSON_PROPERTY_FILES,
  MigrationApiInfo.JSON_PROPERTY_ERRORS
})

public class MigrationApiInfo {
  public static final String JSON_PROPERTY_MIGRATOR_NAME = "migratorName";
  @javax.annotation.Nullable  private JsonNullable<String> migratorName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_OPERATION = "operation";
  @javax.annotation.Nullable  private JsonNullable<String> operation = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FAILED_ARCHIVES = "failedArchives";
  @javax.annotation.Nullable  private JsonNullable<List<String>> failedArchives = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_USERS = "users";
  @javax.annotation.Nullable  private JsonNullable<List<MigratingApiUser>> users = JsonNullable.<List<MigratingApiUser>>undefined();

  public static final String JSON_PROPERTY_WITHOUT_EMAIL_USERS = "withoutEmailUsers";
  @javax.annotation.Nullable  private JsonNullable<List<MigratingApiUser>> withoutEmailUsers = JsonNullable.<List<MigratingApiUser>>undefined();

  public static final String JSON_PROPERTY_EXIST_USERS = "existUsers";
  @javax.annotation.Nullable  private JsonNullable<List<MigratingApiUser>> existUsers = JsonNullable.<List<MigratingApiUser>>undefined();

  public static final String JSON_PROPERTY_GROUPS = "groups";
  @javax.annotation.Nullable  private JsonNullable<List<MigratingApiGroup>> groups = JsonNullable.<List<MigratingApiGroup>>undefined();

  public static final String JSON_PROPERTY_IMPORT_PERSONAL_FILES = "importPersonalFiles";
  @javax.annotation.Nullable  private Boolean importPersonalFiles;

  public static final String JSON_PROPERTY_IMPORT_SHARED_FILES = "importSharedFiles";
  @javax.annotation.Nullable  private Boolean importSharedFiles;

  public static final String JSON_PROPERTY_IMPORT_SHARED_FOLDERS = "importSharedFolders";
  @javax.annotation.Nullable  private Boolean importSharedFolders;

  public static final String JSON_PROPERTY_IMPORT_COMMON_FILES = "importCommonFiles";
  @javax.annotation.Nullable  private Boolean importCommonFiles;

  public static final String JSON_PROPERTY_IMPORT_PROJECT_FILES = "importProjectFiles";
  @javax.annotation.Nullable  private Boolean importProjectFiles;

  public static final String JSON_PROPERTY_IMPORT_GROUPS = "importGroups";
  @javax.annotation.Nullable  private Boolean importGroups;

  public static final String JSON_PROPERTY_SUCCESSED_USERS = "successedUsers";
  @javax.annotation.Nullable  private Integer successedUsers;

  public static final String JSON_PROPERTY_FAILED_USERS = "failedUsers";
  @javax.annotation.Nullable  private Integer failedUsers;

  public static final String JSON_PROPERTY_FILES = "files";
  @javax.annotation.Nullable  private JsonNullable<List<String>> files = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_ERRORS = "errors";
  @javax.annotation.Nullable  private JsonNullable<List<String>> errors = JsonNullable.<List<String>>undefined();

  public MigrationApiInfo() {
  }


  public MigrationApiInfo migratorName(@javax.annotation.Nullable String migratorName) {
    this.migratorName = JsonNullable.<String>of(migratorName);
    
    return this;
  }

  /**
   * Get migratorName
   * @return migratorName
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getMigratorName() {
        return migratorName.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_MIGRATOR_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getMigratorName_JsonNullable() {
    return migratorName;
  }
  
  @JsonProperty(JSON_PROPERTY_MIGRATOR_NAME)
  public void setMigratorName_JsonNullable(JsonNullable<String> migratorName) {
    this.migratorName = migratorName;
  }

  public void setMigratorName(@javax.annotation.Nullable String migratorName) {
    this.migratorName = JsonNullable.<String>of(migratorName);
  }

  public MigrationApiInfo operation(@javax.annotation.Nullable String operation) {
    this.operation = JsonNullable.<String>of(operation);
    
    return this;
  }

  /**
   * Get operation
   * @return operation
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getOperation() {
        return operation.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_OPERATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getOperation_JsonNullable() {
    return operation;
  }
  
  @JsonProperty(JSON_PROPERTY_OPERATION)
  public void setOperation_JsonNullable(JsonNullable<String> operation) {
    this.operation = operation;
  }

  public void setOperation(@javax.annotation.Nullable String operation) {
    this.operation = JsonNullable.<String>of(operation);
  }

  public MigrationApiInfo failedArchives(@javax.annotation.Nullable List<String> failedArchives) {
    this.failedArchives = JsonNullable.<List<String>>of(failedArchives);
    
    return this;
  }

  public MigrationApiInfo addFailedArchivesItem(String failedArchivesItem) {
    if (this.failedArchives == null || !this.failedArchives.isPresent()) {
      this.failedArchives = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.failedArchives.get().add(failedArchivesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Get failedArchives
   * @return failedArchives
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<String> getFailedArchives() {
        return failedArchives.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_FAILED_ARCHIVES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getFailedArchives_JsonNullable() {
    return failedArchives;
  }
  
  @JsonProperty(JSON_PROPERTY_FAILED_ARCHIVES)
  public void setFailedArchives_JsonNullable(JsonNullable<List<String>> failedArchives) {
    this.failedArchives = failedArchives;
  }

  public void setFailedArchives(@javax.annotation.Nullable List<String> failedArchives) {
    this.failedArchives = JsonNullable.<List<String>>of(failedArchives);
  }

  public MigrationApiInfo users(@javax.annotation.Nullable List<MigratingApiUser> users) {
    this.users = JsonNullable.<List<MigratingApiUser>>of(users);
    
    return this;
  }

  public MigrationApiInfo addUsersItem(MigratingApiUser usersItem) {
    if (this.users == null || !this.users.isPresent()) {
      this.users = JsonNullable.<List<MigratingApiUser>>of(new ArrayList<>());
    }
    try {
      this.users.get().add(usersItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Get users
   * @return users
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<MigratingApiUser> getUsers() {
        return users.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_USERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<MigratingApiUser>> getUsers_JsonNullable() {
    return users;
  }
  
  @JsonProperty(JSON_PROPERTY_USERS)
  public void setUsers_JsonNullable(JsonNullable<List<MigratingApiUser>> users) {
    this.users = users;
  }

  public void setUsers(@javax.annotation.Nullable List<MigratingApiUser> users) {
    this.users = JsonNullable.<List<MigratingApiUser>>of(users);
  }

  public MigrationApiInfo withoutEmailUsers(@javax.annotation.Nullable List<MigratingApiUser> withoutEmailUsers) {
    this.withoutEmailUsers = JsonNullable.<List<MigratingApiUser>>of(withoutEmailUsers);
    
    return this;
  }

  public MigrationApiInfo addWithoutEmailUsersItem(MigratingApiUser withoutEmailUsersItem) {
    if (this.withoutEmailUsers == null || !this.withoutEmailUsers.isPresent()) {
      this.withoutEmailUsers = JsonNullable.<List<MigratingApiUser>>of(new ArrayList<>());
    }
    try {
      this.withoutEmailUsers.get().add(withoutEmailUsersItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Get withoutEmailUsers
   * @return withoutEmailUsers
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<MigratingApiUser> getWithoutEmailUsers() {
        return withoutEmailUsers.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_WITHOUT_EMAIL_USERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<MigratingApiUser>> getWithoutEmailUsers_JsonNullable() {
    return withoutEmailUsers;
  }
  
  @JsonProperty(JSON_PROPERTY_WITHOUT_EMAIL_USERS)
  public void setWithoutEmailUsers_JsonNullable(JsonNullable<List<MigratingApiUser>> withoutEmailUsers) {
    this.withoutEmailUsers = withoutEmailUsers;
  }

  public void setWithoutEmailUsers(@javax.annotation.Nullable List<MigratingApiUser> withoutEmailUsers) {
    this.withoutEmailUsers = JsonNullable.<List<MigratingApiUser>>of(withoutEmailUsers);
  }

  public MigrationApiInfo existUsers(@javax.annotation.Nullable List<MigratingApiUser> existUsers) {
    this.existUsers = JsonNullable.<List<MigratingApiUser>>of(existUsers);
    
    return this;
  }

  public MigrationApiInfo addExistUsersItem(MigratingApiUser existUsersItem) {
    if (this.existUsers == null || !this.existUsers.isPresent()) {
      this.existUsers = JsonNullable.<List<MigratingApiUser>>of(new ArrayList<>());
    }
    try {
      this.existUsers.get().add(existUsersItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Get existUsers
   * @return existUsers
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<MigratingApiUser> getExistUsers() {
        return existUsers.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_EXIST_USERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<MigratingApiUser>> getExistUsers_JsonNullable() {
    return existUsers;
  }
  
  @JsonProperty(JSON_PROPERTY_EXIST_USERS)
  public void setExistUsers_JsonNullable(JsonNullable<List<MigratingApiUser>> existUsers) {
    this.existUsers = existUsers;
  }

  public void setExistUsers(@javax.annotation.Nullable List<MigratingApiUser> existUsers) {
    this.existUsers = JsonNullable.<List<MigratingApiUser>>of(existUsers);
  }

  public MigrationApiInfo groups(@javax.annotation.Nullable List<MigratingApiGroup> groups) {
    this.groups = JsonNullable.<List<MigratingApiGroup>>of(groups);
    
    return this;
  }

  public MigrationApiInfo addGroupsItem(MigratingApiGroup groupsItem) {
    if (this.groups == null || !this.groups.isPresent()) {
      this.groups = JsonNullable.<List<MigratingApiGroup>>of(new ArrayList<>());
    }
    try {
      this.groups.get().add(groupsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Get groups
   * @return groups
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<MigratingApiGroup> getGroups() {
        return groups.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_GROUPS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<MigratingApiGroup>> getGroups_JsonNullable() {
    return groups;
  }
  
  @JsonProperty(JSON_PROPERTY_GROUPS)
  public void setGroups_JsonNullable(JsonNullable<List<MigratingApiGroup>> groups) {
    this.groups = groups;
  }

  public void setGroups(@javax.annotation.Nullable List<MigratingApiGroup> groups) {
    this.groups = JsonNullable.<List<MigratingApiGroup>>of(groups);
  }

  public MigrationApiInfo importPersonalFiles(@javax.annotation.Nullable Boolean importPersonalFiles) {
    
    this.importPersonalFiles = importPersonalFiles;
    return this;
  }

  /**
   * Get importPersonalFiles
   * @return importPersonalFiles
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IMPORT_PERSONAL_FILES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getImportPersonalFiles() {
    return importPersonalFiles;
  }


  @JsonProperty(value = JSON_PROPERTY_IMPORT_PERSONAL_FILES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImportPersonalFiles(@javax.annotation.Nullable Boolean importPersonalFiles) {
    this.importPersonalFiles = importPersonalFiles;
  }

  public MigrationApiInfo importSharedFiles(@javax.annotation.Nullable Boolean importSharedFiles) {
    
    this.importSharedFiles = importSharedFiles;
    return this;
  }

  /**
   * Get importSharedFiles
   * @return importSharedFiles
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IMPORT_SHARED_FILES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getImportSharedFiles() {
    return importSharedFiles;
  }


  @JsonProperty(value = JSON_PROPERTY_IMPORT_SHARED_FILES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImportSharedFiles(@javax.annotation.Nullable Boolean importSharedFiles) {
    this.importSharedFiles = importSharedFiles;
  }

  public MigrationApiInfo importSharedFolders(@javax.annotation.Nullable Boolean importSharedFolders) {
    
    this.importSharedFolders = importSharedFolders;
    return this;
  }

  /**
   * Get importSharedFolders
   * @return importSharedFolders
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IMPORT_SHARED_FOLDERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getImportSharedFolders() {
    return importSharedFolders;
  }


  @JsonProperty(value = JSON_PROPERTY_IMPORT_SHARED_FOLDERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImportSharedFolders(@javax.annotation.Nullable Boolean importSharedFolders) {
    this.importSharedFolders = importSharedFolders;
  }

  public MigrationApiInfo importCommonFiles(@javax.annotation.Nullable Boolean importCommonFiles) {
    
    this.importCommonFiles = importCommonFiles;
    return this;
  }

  /**
   * Get importCommonFiles
   * @return importCommonFiles
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IMPORT_COMMON_FILES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getImportCommonFiles() {
    return importCommonFiles;
  }


  @JsonProperty(value = JSON_PROPERTY_IMPORT_COMMON_FILES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImportCommonFiles(@javax.annotation.Nullable Boolean importCommonFiles) {
    this.importCommonFiles = importCommonFiles;
  }

  public MigrationApiInfo importProjectFiles(@javax.annotation.Nullable Boolean importProjectFiles) {
    
    this.importProjectFiles = importProjectFiles;
    return this;
  }

  /**
   * Get importProjectFiles
   * @return importProjectFiles
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IMPORT_PROJECT_FILES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getImportProjectFiles() {
    return importProjectFiles;
  }


  @JsonProperty(value = JSON_PROPERTY_IMPORT_PROJECT_FILES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImportProjectFiles(@javax.annotation.Nullable Boolean importProjectFiles) {
    this.importProjectFiles = importProjectFiles;
  }

  public MigrationApiInfo importGroups(@javax.annotation.Nullable Boolean importGroups) {
    
    this.importGroups = importGroups;
    return this;
  }

  /**
   * Get importGroups
   * @return importGroups
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IMPORT_GROUPS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getImportGroups() {
    return importGroups;
  }


  @JsonProperty(value = JSON_PROPERTY_IMPORT_GROUPS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImportGroups(@javax.annotation.Nullable Boolean importGroups) {
    this.importGroups = importGroups;
  }

  public MigrationApiInfo successedUsers(@javax.annotation.Nullable Integer successedUsers) {
    
    this.successedUsers = successedUsers;
    return this;
  }

  /**
   * Get successedUsers
   * @return successedUsers
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SUCCESSED_USERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSuccessedUsers() {
    return successedUsers;
  }


  @JsonProperty(value = JSON_PROPERTY_SUCCESSED_USERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuccessedUsers(@javax.annotation.Nullable Integer successedUsers) {
    this.successedUsers = successedUsers;
  }

  public MigrationApiInfo failedUsers(@javax.annotation.Nullable Integer failedUsers) {
    
    this.failedUsers = failedUsers;
    return this;
  }

  /**
   * Get failedUsers
   * @return failedUsers
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_FAILED_USERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFailedUsers() {
    return failedUsers;
  }


  @JsonProperty(value = JSON_PROPERTY_FAILED_USERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailedUsers(@javax.annotation.Nullable Integer failedUsers) {
    this.failedUsers = failedUsers;
  }

  public MigrationApiInfo files(@javax.annotation.Nullable List<String> files) {
    this.files = JsonNullable.<List<String>>of(files);
    
    return this;
  }

  public MigrationApiInfo addFilesItem(String filesItem) {
    if (this.files == null || !this.files.isPresent()) {
      this.files = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.files.get().add(filesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Get files
   * @return files
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<String> getFiles() {
        return files.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_FILES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getFiles_JsonNullable() {
    return files;
  }
  
  @JsonProperty(JSON_PROPERTY_FILES)
  public void setFiles_JsonNullable(JsonNullable<List<String>> files) {
    this.files = files;
  }

  public void setFiles(@javax.annotation.Nullable List<String> files) {
    this.files = JsonNullable.<List<String>>of(files);
  }

  public MigrationApiInfo errors(@javax.annotation.Nullable List<String> errors) {
    this.errors = JsonNullable.<List<String>>of(errors);
    
    return this;
  }

  public MigrationApiInfo addErrorsItem(String errorsItem) {
    if (this.errors == null || !this.errors.isPresent()) {
      this.errors = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.errors.get().add(errorsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Get errors
   * @return errors
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<String> getErrors() {
        return errors.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ERRORS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getErrors_JsonNullable() {
    return errors;
  }
  
  @JsonProperty(JSON_PROPERTY_ERRORS)
  public void setErrors_JsonNullable(JsonNullable<List<String>> errors) {
    this.errors = errors;
  }

  public void setErrors(@javax.annotation.Nullable List<String> errors) {
    this.errors = JsonNullable.<List<String>>of(errors);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigrationApiInfo migrationApiInfo = (MigrationApiInfo) o;
    return equalsNullable(this.migratorName, migrationApiInfo.migratorName) &&
        equalsNullable(this.operation, migrationApiInfo.operation) &&
        equalsNullable(this.failedArchives, migrationApiInfo.failedArchives) &&
        equalsNullable(this.users, migrationApiInfo.users) &&
        equalsNullable(this.withoutEmailUsers, migrationApiInfo.withoutEmailUsers) &&
        equalsNullable(this.existUsers, migrationApiInfo.existUsers) &&
        equalsNullable(this.groups, migrationApiInfo.groups) &&
        Objects.equals(this.importPersonalFiles, migrationApiInfo.importPersonalFiles) &&
        Objects.equals(this.importSharedFiles, migrationApiInfo.importSharedFiles) &&
        Objects.equals(this.importSharedFolders, migrationApiInfo.importSharedFolders) &&
        Objects.equals(this.importCommonFiles, migrationApiInfo.importCommonFiles) &&
        Objects.equals(this.importProjectFiles, migrationApiInfo.importProjectFiles) &&
        Objects.equals(this.importGroups, migrationApiInfo.importGroups) &&
        Objects.equals(this.successedUsers, migrationApiInfo.successedUsers) &&
        Objects.equals(this.failedUsers, migrationApiInfo.failedUsers) &&
        equalsNullable(this.files, migrationApiInfo.files) &&
        equalsNullable(this.errors, migrationApiInfo.errors);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(migratorName), hashCodeNullable(operation), hashCodeNullable(failedArchives), hashCodeNullable(users), hashCodeNullable(withoutEmailUsers), hashCodeNullable(existUsers), hashCodeNullable(groups), importPersonalFiles, importSharedFiles, importSharedFolders, importCommonFiles, importProjectFiles, importGroups, successedUsers, failedUsers, hashCodeNullable(files), hashCodeNullable(errors));
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
    sb.append("class MigrationApiInfo {\n");
    sb.append("    migratorName: ").append(toIndentedString(migratorName)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    failedArchives: ").append(toIndentedString(failedArchives)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    withoutEmailUsers: ").append(toIndentedString(withoutEmailUsers)).append("\n");
    sb.append("    existUsers: ").append(toIndentedString(existUsers)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    importPersonalFiles: ").append(toIndentedString(importPersonalFiles)).append("\n");
    sb.append("    importSharedFiles: ").append(toIndentedString(importSharedFiles)).append("\n");
    sb.append("    importSharedFolders: ").append(toIndentedString(importSharedFolders)).append("\n");
    sb.append("    importCommonFiles: ").append(toIndentedString(importCommonFiles)).append("\n");
    sb.append("    importProjectFiles: ").append(toIndentedString(importProjectFiles)).append("\n");
    sb.append("    importGroups: ").append(toIndentedString(importGroups)).append("\n");
    sb.append("    successedUsers: ").append(toIndentedString(successedUsers)).append("\n");
    sb.append("    failedUsers: ").append(toIndentedString(failedUsers)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

    // add `migratorName` to the URL query string
    if (getMigratorName() != null) {
      try {
        joiner.add(String.format("%smigratorName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMigratorName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `operation` to the URL query string
    if (getOperation() != null) {
      try {
        joiner.add(String.format("%soperation%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOperation()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `failedArchives` to the URL query string
    if (getFailedArchives() != null) {
      for (int i = 0; i < getFailedArchives().size(); i++) {
        try {
          joiner.add(String.format("%sfailedArchives%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getFailedArchives().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `users` to the URL query string
    if (getUsers() != null) {
      for (int i = 0; i < getUsers().size(); i++) {
        if (getUsers().get(i) != null) {
          joiner.add(getUsers().get(i).toUrlQueryString(String.format("%susers%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `withoutEmailUsers` to the URL query string
    if (getWithoutEmailUsers() != null) {
      for (int i = 0; i < getWithoutEmailUsers().size(); i++) {
        if (getWithoutEmailUsers().get(i) != null) {
          joiner.add(getWithoutEmailUsers().get(i).toUrlQueryString(String.format("%swithoutEmailUsers%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `existUsers` to the URL query string
    if (getExistUsers() != null) {
      for (int i = 0; i < getExistUsers().size(); i++) {
        if (getExistUsers().get(i) != null) {
          joiner.add(getExistUsers().get(i).toUrlQueryString(String.format("%sexistUsers%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
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

    // add `importPersonalFiles` to the URL query string
    if (getImportPersonalFiles() != null) {
      try {
        joiner.add(String.format("%simportPersonalFiles%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getImportPersonalFiles()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `importSharedFiles` to the URL query string
    if (getImportSharedFiles() != null) {
      try {
        joiner.add(String.format("%simportSharedFiles%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getImportSharedFiles()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `importSharedFolders` to the URL query string
    if (getImportSharedFolders() != null) {
      try {
        joiner.add(String.format("%simportSharedFolders%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getImportSharedFolders()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `importCommonFiles` to the URL query string
    if (getImportCommonFiles() != null) {
      try {
        joiner.add(String.format("%simportCommonFiles%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getImportCommonFiles()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `importProjectFiles` to the URL query string
    if (getImportProjectFiles() != null) {
      try {
        joiner.add(String.format("%simportProjectFiles%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getImportProjectFiles()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `importGroups` to the URL query string
    if (getImportGroups() != null) {
      try {
        joiner.add(String.format("%simportGroups%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getImportGroups()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `successedUsers` to the URL query string
    if (getSuccessedUsers() != null) {
      try {
        joiner.add(String.format("%ssuccessedUsers%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSuccessedUsers()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `failedUsers` to the URL query string
    if (getFailedUsers() != null) {
      try {
        joiner.add(String.format("%sfailedUsers%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFailedUsers()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `files` to the URL query string
    if (getFiles() != null) {
      for (int i = 0; i < getFiles().size(); i++) {
        try {
          joiner.add(String.format("%sfiles%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getFiles().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `errors` to the URL query string
    if (getErrors() != null) {
      for (int i = 0; i < getErrors().size(); i++) {
        try {
          joiner.add(String.format("%serrors%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getErrors().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}

