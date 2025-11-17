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
import org.openapitools.client.model.EmployeeType;
import org.openapitools.client.model.MigratingApiFiles;
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
 * MigratingApiUser
 */
@JsonPropertyOrder({
  MigratingApiUser.JSON_PROPERTY_SHOULD_IMPORT,
  MigratingApiUser.JSON_PROPERTY_KEY,
  MigratingApiUser.JSON_PROPERTY_EMAIL,
  MigratingApiUser.JSON_PROPERTY_DISPLAY_NAME,
  MigratingApiUser.JSON_PROPERTY_FIRST_NAME,
  MigratingApiUser.JSON_PROPERTY_LAST_NAME,
  MigratingApiUser.JSON_PROPERTY_USER_TYPE,
  MigratingApiUser.JSON_PROPERTY_MIGRATING_FILES
})

public class MigratingApiUser {
  public static final String JSON_PROPERTY_SHOULD_IMPORT = "shouldImport";
  @javax.annotation.Nullable
  private Boolean shouldImport;

  public static final String JSON_PROPERTY_KEY = "key";
  @javax.annotation.Nullable
  private JsonNullable<String> key = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EMAIL = "email";
  @javax.annotation.Nullable
  private JsonNullable<String> email = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  @javax.annotation.Nullable
  private JsonNullable<String> displayName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  @javax.annotation.Nullable
  private JsonNullable<String> firstName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  @javax.annotation.Nullable
  private JsonNullable<String> lastName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_USER_TYPE = "userType";
  @javax.annotation.Nullable
  private EmployeeType userType;

  public static final String JSON_PROPERTY_MIGRATING_FILES = "migratingFiles";
  @javax.annotation.Nullable
  private MigratingApiFiles migratingFiles;

  public MigratingApiUser() {
  }

  public MigratingApiUser shouldImport(@javax.annotation.Nullable Boolean shouldImport) {
    
    this.shouldImport = shouldImport;
    return this;
  }

  /**
   * Get shouldImport
   * @return shouldImport
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHOULD_IMPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShouldImport() {
    return shouldImport;
  }


  @JsonProperty(JSON_PROPERTY_SHOULD_IMPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShouldImport(@javax.annotation.Nullable Boolean shouldImport) {
    this.shouldImport = shouldImport;
  }

  public MigratingApiUser key(@javax.annotation.Nullable String key) {
    this.key = JsonNullable.<String>of(key);
    
    return this;
  }

  /**
   * Get key
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

  public MigratingApiUser email(@javax.annotation.Nullable String email) {
    this.email = JsonNullable.<String>of(email);
    
    return this;
  }

  /**
   * Get email
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

  public MigratingApiUser displayName(@javax.annotation.Nullable String displayName) {
    this.displayName = JsonNullable.<String>of(displayName);
    
    return this;
  }

  /**
   * Get displayName
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

  public MigratingApiUser firstName(@javax.annotation.Nullable String firstName) {
    this.firstName = JsonNullable.<String>of(firstName);
    
    return this;
  }

  /**
   * Get firstName
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

  public MigratingApiUser lastName(@javax.annotation.Nullable String lastName) {
    this.lastName = JsonNullable.<String>of(lastName);
    
    return this;
  }

  /**
   * Get lastName
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

  public MigratingApiUser userType(@javax.annotation.Nullable EmployeeType userType) {
    
    this.userType = userType;
    return this;
  }

  /**
   * Get userType
   * @return userType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EmployeeType getUserType() {
    return userType;
  }


  @JsonProperty(JSON_PROPERTY_USER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserType(@javax.annotation.Nullable EmployeeType userType) {
    this.userType = userType;
  }

  public MigratingApiUser migratingFiles(@javax.annotation.Nullable MigratingApiFiles migratingFiles) {
    
    this.migratingFiles = migratingFiles;
    return this;
  }

  /**
   * Get migratingFiles
   * @return migratingFiles
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIGRATING_FILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MigratingApiFiles getMigratingFiles() {
    return migratingFiles;
  }


  @JsonProperty(JSON_PROPERTY_MIGRATING_FILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMigratingFiles(@javax.annotation.Nullable MigratingApiFiles migratingFiles) {
    this.migratingFiles = migratingFiles;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigratingApiUser migratingApiUser = (MigratingApiUser) o;
    return Objects.equals(this.shouldImport, migratingApiUser.shouldImport) &&
        equalsNullable(this.key, migratingApiUser.key) &&
        equalsNullable(this.email, migratingApiUser.email) &&
        equalsNullable(this.displayName, migratingApiUser.displayName) &&
        equalsNullable(this.firstName, migratingApiUser.firstName) &&
        equalsNullable(this.lastName, migratingApiUser.lastName) &&
        Objects.equals(this.userType, migratingApiUser.userType) &&
        Objects.equals(this.migratingFiles, migratingApiUser.migratingFiles);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(shouldImport, hashCodeNullable(key), hashCodeNullable(email), hashCodeNullable(displayName), hashCodeNullable(firstName), hashCodeNullable(lastName), userType, migratingFiles);
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
    sb.append("class MigratingApiUser {\n");
    sb.append("    shouldImport: ").append(toIndentedString(shouldImport)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
    sb.append("    migratingFiles: ").append(toIndentedString(migratingFiles)).append("\n");
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

    // add `shouldImport` to the URL query string
    if (getShouldImport() != null) {
      try {
        joiner.add(String.format("%sshouldImport%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getShouldImport()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `email` to the URL query string
    if (getEmail() != null) {
      try {
        joiner.add(String.format("%semail%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmail()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `userType` to the URL query string
    if (getUserType() != null) {
      try {
        joiner.add(String.format("%suserType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUserType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `migratingFiles` to the URL query string
    if (getMigratingFiles() != null) {
      joiner.add(getMigratingFiles().toUrlQueryString(prefix + "migratingFiles" + suffix));
    }

    return joiner.toString();
  }

}

