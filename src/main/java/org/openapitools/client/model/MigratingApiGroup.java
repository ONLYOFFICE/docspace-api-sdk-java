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
 * MigratingApiGroup
 */
@JsonPropertyOrder({
  MigratingApiGroup.JSON_PROPERTY_SHOULD_IMPORT,
  MigratingApiGroup.JSON_PROPERTY_GROUP_NAME,
  MigratingApiGroup.JSON_PROPERTY_MODULE_NAME,
  MigratingApiGroup.JSON_PROPERTY_USER_UID_LIST
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class MigratingApiGroup {
  public static final String JSON_PROPERTY_SHOULD_IMPORT = "shouldImport";
  @javax.annotation.Nullable
  private Boolean shouldImport;

  public static final String JSON_PROPERTY_GROUP_NAME = "groupName";
  @javax.annotation.Nullable
  private JsonNullable<String> groupName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MODULE_NAME = "moduleName";
  @javax.annotation.Nullable
  private JsonNullable<String> moduleName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_USER_UID_LIST = "userUidList";
  @javax.annotation.Nullable
  private JsonNullable<List<String>> userUidList = JsonNullable.<List<String>>undefined();

  public MigratingApiGroup() {
  }

  public MigratingApiGroup shouldImport(@javax.annotation.Nullable Boolean shouldImport) {
    
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

  public MigratingApiGroup groupName(@javax.annotation.Nullable String groupName) {
    this.groupName = JsonNullable.<String>of(groupName);
    
    return this;
  }

  /**
   * Get groupName
   * @return groupName
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getGroupName() {
        return groupName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getGroupName_JsonNullable() {
    return groupName;
  }
  
  @JsonProperty(JSON_PROPERTY_GROUP_NAME)
  public void setGroupName_JsonNullable(JsonNullable<String> groupName) {
    this.groupName = groupName;
  }

  public void setGroupName(@javax.annotation.Nullable String groupName) {
    this.groupName = JsonNullable.<String>of(groupName);
  }

  public MigratingApiGroup moduleName(@javax.annotation.Nullable String moduleName) {
    this.moduleName = JsonNullable.<String>of(moduleName);
    
    return this;
  }

  /**
   * Get moduleName
   * @return moduleName
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getModuleName() {
        return moduleName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MODULE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getModuleName_JsonNullable() {
    return moduleName;
  }
  
  @JsonProperty(JSON_PROPERTY_MODULE_NAME)
  public void setModuleName_JsonNullable(JsonNullable<String> moduleName) {
    this.moduleName = moduleName;
  }

  public void setModuleName(@javax.annotation.Nullable String moduleName) {
    this.moduleName = JsonNullable.<String>of(moduleName);
  }

  public MigratingApiGroup userUidList(@javax.annotation.Nullable List<String> userUidList) {
    this.userUidList = JsonNullable.<List<String>>of(userUidList);
    
    return this;
  }

  public MigratingApiGroup addUserUidListItem(String userUidListItem) {
    if (this.userUidList == null || !this.userUidList.isPresent()) {
      this.userUidList = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.userUidList.get().add(userUidListItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Get userUidList
   * @return userUidList
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<String> getUserUidList() {
        return userUidList.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USER_UID_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getUserUidList_JsonNullable() {
    return userUidList;
  }
  
  @JsonProperty(JSON_PROPERTY_USER_UID_LIST)
  public void setUserUidList_JsonNullable(JsonNullable<List<String>> userUidList) {
    this.userUidList = userUidList;
  }

  public void setUserUidList(@javax.annotation.Nullable List<String> userUidList) {
    this.userUidList = JsonNullable.<List<String>>of(userUidList);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigratingApiGroup migratingApiGroup = (MigratingApiGroup) o;
    return Objects.equals(this.shouldImport, migratingApiGroup.shouldImport) &&
        equalsNullable(this.groupName, migratingApiGroup.groupName) &&
        equalsNullable(this.moduleName, migratingApiGroup.moduleName) &&
        equalsNullable(this.userUidList, migratingApiGroup.userUidList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(shouldImport, hashCodeNullable(groupName), hashCodeNullable(moduleName), hashCodeNullable(userUidList));
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
    sb.append("class MigratingApiGroup {\n");
    sb.append("    shouldImport: ").append(toIndentedString(shouldImport)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    moduleName: ").append(toIndentedString(moduleName)).append("\n");
    sb.append("    userUidList: ").append(toIndentedString(userUidList)).append("\n");
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

    // add `groupName` to the URL query string
    if (getGroupName() != null) {
      try {
        joiner.add(String.format("%sgroupName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getGroupName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `moduleName` to the URL query string
    if (getModuleName() != null) {
      try {
        joiner.add(String.format("%smoduleName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getModuleName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `userUidList` to the URL query string
    if (getUserUidList() != null) {
      for (int i = 0; i < getUserUidList().size(); i++) {
        try {
          joiner.add(String.format("%suserUidList%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getUserUidList().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}

