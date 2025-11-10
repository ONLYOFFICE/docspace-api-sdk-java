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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.client.model.EmployeeFullDto;
import org.openapitools.client.model.FormFillingStatus;
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
 * The form role parameters.
 */
@JsonPropertyOrder({
  FormRoleDto.JSON_PROPERTY_ROLE_NAME,
  FormRoleDto.JSON_PROPERTY_ROLE_COLOR,
  FormRoleDto.JSON_PROPERTY_USER,
  FormRoleDto.JSON_PROPERTY_SEQUENCE,
  FormRoleDto.JSON_PROPERTY_SUBMITTED,
  FormRoleDto.JSON_PROPERTY_STOPED_BY,
  FormRoleDto.JSON_PROPERTY_HISTORY,
  FormRoleDto.JSON_PROPERTY_ROLE_STATUS
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class FormRoleDto {
  public static final String JSON_PROPERTY_ROLE_NAME = "roleName";
  @javax.annotation.Nullable
  private String roleName;

  public static final String JSON_PROPERTY_ROLE_COLOR = "roleColor";
  @javax.annotation.Nullable
  private JsonNullable<String> roleColor = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_USER = "user";
  @javax.annotation.Nullable
  private EmployeeFullDto user;

  public static final String JSON_PROPERTY_SEQUENCE = "sequence";
  @javax.annotation.Nonnull
  private Integer sequence;

  public static final String JSON_PROPERTY_SUBMITTED = "submitted";
  @javax.annotation.Nonnull
  private Boolean submitted;

  public static final String JSON_PROPERTY_STOPED_BY = "stopedBy";
  @javax.annotation.Nullable
  private EmployeeFullDto stopedBy;

  public static final String JSON_PROPERTY_HISTORY = "history";
  @javax.annotation.Nullable
  private JsonNullable<Map<String, OffsetDateTime>> history = JsonNullable.<Map<String, OffsetDateTime>>undefined();

  public static final String JSON_PROPERTY_ROLE_STATUS = "roleStatus";
  @javax.annotation.Nullable
  private FormFillingStatus roleStatus;

  public FormRoleDto() {
  }

  public FormRoleDto roleName(@javax.annotation.Nullable String roleName) {
    
    this.roleName = roleName;
    return this;
  }

  /**
   * The role name.
   * @return roleName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROLE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRoleName() {
    return roleName;
  }


  @JsonProperty(JSON_PROPERTY_ROLE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRoleName(@javax.annotation.Nullable String roleName) {
    this.roleName = roleName;
  }

  public FormRoleDto roleColor(@javax.annotation.Nullable String roleColor) {
    this.roleColor = JsonNullable.<String>of(roleColor);
    
    return this;
  }

  /**
   * The role color.
   * @return roleColor
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getRoleColor() {
        return roleColor.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ROLE_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getRoleColor_JsonNullable() {
    return roleColor;
  }
  
  @JsonProperty(JSON_PROPERTY_ROLE_COLOR)
  public void setRoleColor_JsonNullable(JsonNullable<String> roleColor) {
    this.roleColor = roleColor;
  }

  public void setRoleColor(@javax.annotation.Nullable String roleColor) {
    this.roleColor = JsonNullable.<String>of(roleColor);
  }

  public FormRoleDto user(@javax.annotation.Nullable EmployeeFullDto user) {
    
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

  public EmployeeFullDto getUser() {
    return user;
  }


  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUser(@javax.annotation.Nullable EmployeeFullDto user) {
    this.user = user;
  }

  public FormRoleDto sequence(@javax.annotation.Nonnull Integer sequence) {
    
    this.sequence = sequence;
    return this;
  }

  /**
   * The role sequence.
   * @return sequence
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SEQUENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getSequence() {
    return sequence;
  }


  @JsonProperty(JSON_PROPERTY_SEQUENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSequence(@javax.annotation.Nonnull Integer sequence) {
    this.sequence = sequence;
  }

  public FormRoleDto submitted(@javax.annotation.Nonnull Boolean submitted) {
    
    this.submitted = submitted;
    return this;
  }

  /**
   * Specifies if the role is submitted.
   * @return submitted
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SUBMITTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getSubmitted() {
    return submitted;
  }


  @JsonProperty(JSON_PROPERTY_SUBMITTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubmitted(@javax.annotation.Nonnull Boolean submitted) {
    this.submitted = submitted;
  }

  public FormRoleDto stopedBy(@javax.annotation.Nullable EmployeeFullDto stopedBy) {
    
    this.stopedBy = stopedBy;
    return this;
  }

  /**
   * Get stopedBy
   * @return stopedBy
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STOPED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EmployeeFullDto getStopedBy() {
    return stopedBy;
  }


  @JsonProperty(JSON_PROPERTY_STOPED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStopedBy(@javax.annotation.Nullable EmployeeFullDto stopedBy) {
    this.stopedBy = stopedBy;
  }

  public FormRoleDto history(@javax.annotation.Nullable Map<String, OffsetDateTime> history) {
    this.history = JsonNullable.<Map<String, OffsetDateTime>>of(history);
    
    return this;
  }

  public FormRoleDto putHistoryItem(String key, OffsetDateTime historyItem) {
    if (this.history == null || !this.history.isPresent()) {
      this.history = JsonNullable.<Map<String, OffsetDateTime>>of(new HashMap<>());
    }
    try {
      this.history.get().put(key, historyItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The role history.
   * @return history
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Map<String, OffsetDateTime> getHistory() {
        return history.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HISTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Map<String, OffsetDateTime>> getHistory_JsonNullable() {
    return history;
  }
  
  @JsonProperty(JSON_PROPERTY_HISTORY)
  public void setHistory_JsonNullable(JsonNullable<Map<String, OffsetDateTime>> history) {
    this.history = history;
  }

  public void setHistory(@javax.annotation.Nullable Map<String, OffsetDateTime> history) {
    this.history = JsonNullable.<Map<String, OffsetDateTime>>of(history);
  }

  public FormRoleDto roleStatus(@javax.annotation.Nullable FormFillingStatus roleStatus) {
    
    this.roleStatus = roleStatus;
    return this;
  }

  /**
   * Get roleStatus
   * @return roleStatus
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROLE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FormFillingStatus getRoleStatus() {
    return roleStatus;
  }


  @JsonProperty(JSON_PROPERTY_ROLE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoleStatus(@javax.annotation.Nullable FormFillingStatus roleStatus) {
    this.roleStatus = roleStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormRoleDto formRoleDto = (FormRoleDto) o;
    return Objects.equals(this.roleName, formRoleDto.roleName) &&
        equalsNullable(this.roleColor, formRoleDto.roleColor) &&
        Objects.equals(this.user, formRoleDto.user) &&
        Objects.equals(this.sequence, formRoleDto.sequence) &&
        Objects.equals(this.submitted, formRoleDto.submitted) &&
        Objects.equals(this.stopedBy, formRoleDto.stopedBy) &&
        equalsNullable(this.history, formRoleDto.history) &&
        Objects.equals(this.roleStatus, formRoleDto.roleStatus);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleName, hashCodeNullable(roleColor), user, sequence, submitted, stopedBy, hashCodeNullable(history), roleStatus);
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
    sb.append("class FormRoleDto {\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    roleColor: ").append(toIndentedString(roleColor)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    submitted: ").append(toIndentedString(submitted)).append("\n");
    sb.append("    stopedBy: ").append(toIndentedString(stopedBy)).append("\n");
    sb.append("    history: ").append(toIndentedString(history)).append("\n");
    sb.append("    roleStatus: ").append(toIndentedString(roleStatus)).append("\n");
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

    // add `roleName` to the URL query string
    if (getRoleName() != null) {
      try {
        joiner.add(String.format("%sroleName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRoleName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `roleColor` to the URL query string
    if (getRoleColor() != null) {
      try {
        joiner.add(String.format("%sroleColor%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRoleColor()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `user` to the URL query string
    if (getUser() != null) {
      joiner.add(getUser().toUrlQueryString(prefix + "user" + suffix));
    }

    // add `sequence` to the URL query string
    if (getSequence() != null) {
      try {
        joiner.add(String.format("%ssequence%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSequence()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `submitted` to the URL query string
    if (getSubmitted() != null) {
      try {
        joiner.add(String.format("%ssubmitted%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSubmitted()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `stopedBy` to the URL query string
    if (getStopedBy() != null) {
      joiner.add(getStopedBy().toUrlQueryString(prefix + "stopedBy" + suffix));
    }

    // add `history` to the URL query string
    if (getHistory() != null) {
      for (String _key : getHistory().keySet()) {
        try {
          joiner.add(String.format("%shistory%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getHistory().get(_key), URLEncoder.encode(String.valueOf(getHistory().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `roleStatus` to the URL query string
    if (getRoleStatus() != null) {
      try {
        joiner.add(String.format("%sroleStatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRoleStatus()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

