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
import org.openapitools.client.model.ApiDateTime;
import org.openapitools.client.model.EditHistoryAuthor;
import org.openapitools.client.model.EditHistoryChangesWrapper;
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
 * The file editing history parameters.
 */
@JsonPropertyOrder({
  EditHistoryDto.JSON_PROPERTY_ID,
  EditHistoryDto.JSON_PROPERTY_KEY,
  EditHistoryDto.JSON_PROPERTY_VERSION,
  EditHistoryDto.JSON_PROPERTY_VERSION_GROUP,
  EditHistoryDto.JSON_PROPERTY_USER,
  EditHistoryDto.JSON_PROPERTY_CREATED,
  EditHistoryDto.JSON_PROPERTY_CHANGES_HISTORY,
  EditHistoryDto.JSON_PROPERTY_CHANGES,
  EditHistoryDto.JSON_PROPERTY_SERVER_VERSION
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class EditHistoryDto {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Integer id;

  public static final String JSON_PROPERTY_KEY = "key";
  @javax.annotation.Nullable
  private JsonNullable<String> key = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Integer version;

  public static final String JSON_PROPERTY_VERSION_GROUP = "versionGroup";
  @javax.annotation.Nullable
  private Integer versionGroup;

  public static final String JSON_PROPERTY_USER = "user";
  @javax.annotation.Nullable
  private EditHistoryAuthor user;

  public static final String JSON_PROPERTY_CREATED = "created";
  @javax.annotation.Nullable
  private ApiDateTime created;

  public static final String JSON_PROPERTY_CHANGES_HISTORY = "changesHistory";
  @javax.annotation.Nullable
  private JsonNullable<String> changesHistory = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CHANGES = "changes";
  @javax.annotation.Nullable
  private JsonNullable<List<EditHistoryChangesWrapper>> changes = JsonNullable.<List<EditHistoryChangesWrapper>>undefined();

  public static final String JSON_PROPERTY_SERVER_VERSION = "serverVersion";
  @javax.annotation.Nullable
  private JsonNullable<String> serverVersion = JsonNullable.<String>undefined();

  public EditHistoryDto() {
  }

  public EditHistoryDto id(@javax.annotation.Nullable Integer id) {
    
    this.id = id;
    return this;
  }

  /**
   * The document ID.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable Integer id) {
    this.id = id;
  }

  public EditHistoryDto key(@javax.annotation.Nullable String key) {
    this.key = JsonNullable.<String>of(key);
    
    return this;
  }

  /**
   * The document identifier used to unambiguously identify the document file.
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

  public EditHistoryDto version(@javax.annotation.Nullable Integer version) {
    
    this.version = version;
    return this;
  }

  /**
   * The document version number.
   * @return version
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(@javax.annotation.Nullable Integer version) {
    this.version = version;
  }

  public EditHistoryDto versionGroup(@javax.annotation.Nullable Integer versionGroup) {
    
    this.versionGroup = versionGroup;
    return this;
  }

  /**
   * The document version group.
   * @return versionGroup
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersionGroup() {
    return versionGroup;
  }


  @JsonProperty(JSON_PROPERTY_VERSION_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersionGroup(@javax.annotation.Nullable Integer versionGroup) {
    this.versionGroup = versionGroup;
  }

  public EditHistoryDto user(@javax.annotation.Nullable EditHistoryAuthor user) {
    
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EditHistoryAuthor getUser() {
    return user;
  }


  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUser(@javax.annotation.Nullable EditHistoryAuthor user) {
    this.user = user;
  }

  public EditHistoryDto created(@javax.annotation.Nullable ApiDateTime created) {
    
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDateTime getCreated() {
    return created;
  }


  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreated(@javax.annotation.Nullable ApiDateTime created) {
    this.created = created;
  }

  public EditHistoryDto changesHistory(@javax.annotation.Nullable String changesHistory) {
    this.changesHistory = JsonNullable.<String>of(changesHistory);
    
    return this;
  }

  /**
   * The file history changes in the string format.
   * @return changesHistory
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getChangesHistory() {
        return changesHistory.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CHANGES_HISTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getChangesHistory_JsonNullable() {
    return changesHistory;
  }
  
  @JsonProperty(JSON_PROPERTY_CHANGES_HISTORY)
  public void setChangesHistory_JsonNullable(JsonNullable<String> changesHistory) {
    this.changesHistory = changesHistory;
  }

  public void setChangesHistory(@javax.annotation.Nullable String changesHistory) {
    this.changesHistory = JsonNullable.<String>of(changesHistory);
  }

  public EditHistoryDto changes(@javax.annotation.Nullable List<EditHistoryChangesWrapper> changes) {
    this.changes = JsonNullable.<List<EditHistoryChangesWrapper>>of(changes);
    
    return this;
  }

  public EditHistoryDto addChangesItem(EditHistoryChangesWrapper changesItem) {
    if (this.changes == null || !this.changes.isPresent()) {
      this.changes = JsonNullable.<List<EditHistoryChangesWrapper>>of(new ArrayList<>());
    }
    try {
      this.changes.get().add(changesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of file history changes.
   * @return changes
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<EditHistoryChangesWrapper> getChanges() {
        return changes.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CHANGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<EditHistoryChangesWrapper>> getChanges_JsonNullable() {
    return changes;
  }
  
  @JsonProperty(JSON_PROPERTY_CHANGES)
  public void setChanges_JsonNullable(JsonNullable<List<EditHistoryChangesWrapper>> changes) {
    this.changes = changes;
  }

  public void setChanges(@javax.annotation.Nullable List<EditHistoryChangesWrapper> changes) {
    this.changes = JsonNullable.<List<EditHistoryChangesWrapper>>of(changes);
  }

  public EditHistoryDto serverVersion(@javax.annotation.Nullable String serverVersion) {
    this.serverVersion = JsonNullable.<String>of(serverVersion);
    
    return this;
  }

  /**
   * The current server version number.
   * @return serverVersion
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getServerVersion() {
        return serverVersion.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SERVER_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getServerVersion_JsonNullable() {
    return serverVersion;
  }
  
  @JsonProperty(JSON_PROPERTY_SERVER_VERSION)
  public void setServerVersion_JsonNullable(JsonNullable<String> serverVersion) {
    this.serverVersion = serverVersion;
  }

  public void setServerVersion(@javax.annotation.Nullable String serverVersion) {
    this.serverVersion = JsonNullable.<String>of(serverVersion);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EditHistoryDto editHistoryDto = (EditHistoryDto) o;
    return Objects.equals(this.id, editHistoryDto.id) &&
        equalsNullable(this.key, editHistoryDto.key) &&
        Objects.equals(this.version, editHistoryDto.version) &&
        Objects.equals(this.versionGroup, editHistoryDto.versionGroup) &&
        Objects.equals(this.user, editHistoryDto.user) &&
        Objects.equals(this.created, editHistoryDto.created) &&
        equalsNullable(this.changesHistory, editHistoryDto.changesHistory) &&
        equalsNullable(this.changes, editHistoryDto.changes) &&
        equalsNullable(this.serverVersion, editHistoryDto.serverVersion);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(key), version, versionGroup, user, created, hashCodeNullable(changesHistory), hashCodeNullable(changes), hashCodeNullable(serverVersion));
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
    sb.append("class EditHistoryDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    versionGroup: ").append(toIndentedString(versionGroup)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    changesHistory: ").append(toIndentedString(changesHistory)).append("\n");
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
    sb.append("    serverVersion: ").append(toIndentedString(serverVersion)).append("\n");
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

    // add `key` to the URL query string
    if (getKey() != null) {
      try {
        joiner.add(String.format("%skey%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getKey()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
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

    // add `versionGroup` to the URL query string
    if (getVersionGroup() != null) {
      try {
        joiner.add(String.format("%sversionGroup%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersionGroup()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `user` to the URL query string
    if (getUser() != null) {
      joiner.add(getUser().toUrlQueryString(prefix + "user" + suffix));
    }

    // add `created` to the URL query string
    if (getCreated() != null) {
      joiner.add(getCreated().toUrlQueryString(prefix + "created" + suffix));
    }

    // add `changesHistory` to the URL query string
    if (getChangesHistory() != null) {
      try {
        joiner.add(String.format("%schangesHistory%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getChangesHistory()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `changes` to the URL query string
    if (getChanges() != null) {
      for (int i = 0; i < getChanges().size(); i++) {
        if (getChanges().get(i) != null) {
          joiner.add(getChanges().get(i).toUrlQueryString(String.format("%schanges%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `serverVersion` to the URL query string
    if (getServerVersion() != null) {
      try {
        joiner.add(String.format("%sserverVersion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getServerVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

