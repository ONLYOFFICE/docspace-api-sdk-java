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
import java.util.UUID;
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
 * One role of a form and the account that fills it.
 */
@JsonPropertyOrder({
  FormRoleRequest.JSON_PROPERTY_ROOM_ID,
  FormRoleRequest.JSON_PROPERTY_ROLE_NAME,
  FormRoleRequest.JSON_PROPERTY_ROLE_COLOR,
  FormRoleRequest.JSON_PROPERTY_USER_ID,
  FormRoleRequest.JSON_PROPERTY_SEQUENCE,
  FormRoleRequest.JSON_PROPERTY_SUBMITTED,
  FormRoleRequest.JSON_PROPERTY_OPENED_AT,
  FormRoleRequest.JSON_PROPERTY_SUBMISSION_DATE
})

public class FormRoleRequest {
  public static final String JSON_PROPERTY_ROOM_ID = "roomId";
  @javax.annotation.Nullable  private Integer roomId;

  public static final String JSON_PROPERTY_ROLE_NAME = "roleName";
  @javax.annotation.Nullable  private JsonNullable<String> roleName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ROLE_COLOR = "roleColor";
  @javax.annotation.Nullable  private JsonNullable<String> roleColor = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_USER_ID = "userId";
  @javax.annotation.Nullable  private UUID userId;

  public static final String JSON_PROPERTY_SEQUENCE = "sequence";
  @javax.annotation.Nullable  private Integer sequence;

  public static final String JSON_PROPERTY_SUBMITTED = "submitted";
  @javax.annotation.Nullable  private Boolean submitted;

  public static final String JSON_PROPERTY_OPENED_AT = "openedAt";
  @javax.annotation.Nullable  private OffsetDateTime openedAt;

  public static final String JSON_PROPERTY_SUBMISSION_DATE = "submissionDate";
  @javax.annotation.Nullable  private OffsetDateTime submissionDate;

  public FormRoleRequest() {
  }


  public FormRoleRequest roomId(@javax.annotation.Nullable Integer roomId) {
    
    this.roomId = roomId;
    return this;
  }

  /**
   * The ID of the room the form is in. It is stored with the role as sent, so pass the room the form lives in.
   * @return roomId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ROOM_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRoomId() {
    return roomId;
  }


  @JsonProperty(value = JSON_PROPERTY_ROOM_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoomId(@javax.annotation.Nullable Integer roomId) {
    this.roomId = roomId;
  }

  public FormRoleRequest roleName(@javax.annotation.Nullable String roleName) {
    this.roleName = JsonNullable.<String>of(roleName);
    
    return this;
  }

  /**
   * The name of a role the form defines, such as the one the form author gave a group of fields.
   * @return roleName
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getRoleName() {
        return roleName.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ROLE_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getRoleName_JsonNullable() {
    return roleName;
  }
  
  @JsonProperty(JSON_PROPERTY_ROLE_NAME)
  public void setRoleName_JsonNullable(JsonNullable<String> roleName) {
    this.roleName = roleName;
  }

  public void setRoleName(@javax.annotation.Nullable String roleName) {
    this.roleName = JsonNullable.<String>of(roleName);
  }

  public FormRoleRequest roleColor(@javax.annotation.Nullable String roleColor) {
    this.roleColor = JsonNullable.<String>of(roleColor);
    
    return this;
  }

  /**
   * The color the editor marks the fields of this role with, as a hex code.
   * @return roleColor
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getRoleColor() {
        return roleColor.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ROLE_COLOR, required = false)
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

  public FormRoleRequest userId(@javax.annotation.Nullable UUID userId) {
    
    this.userId = userId;
    return this;
  }

  /**
   * The account that fills this role. It is notified once filling starts, unless it is the caller.
   * @return userId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_USER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getUserId() {
    return userId;
  }


  @JsonProperty(value = JSON_PROPERTY_USER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(@javax.annotation.Nullable UUID userId) {
    this.userId = userId;
  }

  public FormRoleRequest sequence(@javax.annotation.Nullable Integer sequence) {
    
    this.sequence = sequence;
    return this;
  }

  /**
   * Accepted for compatibility and ignored: the position of the role in the list sets the filling order.
   * @return sequence
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SEQUENCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSequence() {
    return sequence;
  }


  @JsonProperty(value = JSON_PROPERTY_SEQUENCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSequence(@javax.annotation.Nullable Integer sequence) {
    this.sequence = sequence;
  }

  public FormRoleRequest submitted(@javax.annotation.Nullable Boolean submitted) {
    
    this.submitted = submitted;
    return this;
  }

  /**
   * Whether this role counts as already submitted. It is stored as sent; send false when filling starts.
   * @return submitted
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SUBMITTED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSubmitted() {
    return submitted;
  }


  @JsonProperty(value = JSON_PROPERTY_SUBMITTED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubmitted(@javax.annotation.Nullable Boolean submitted) {
    this.submitted = submitted;
  }

  public FormRoleRequest openedAt(@javax.annotation.Nullable OffsetDateTime openedAt) {
    
    this.openedAt = openedAt;
    return this;
  }

  /**
   * Accepted for compatibility and ignored: the portal records when the role is opened.
   * @return openedAt
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_OPENED_AT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getOpenedAt() {
    return openedAt;
  }


  @JsonProperty(value = JSON_PROPERTY_OPENED_AT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOpenedAt(@javax.annotation.Nullable OffsetDateTime openedAt) {
    this.openedAt = openedAt;
  }

  public FormRoleRequest submissionDate(@javax.annotation.Nullable OffsetDateTime submissionDate) {
    
    this.submissionDate = submissionDate;
    return this;
  }

  /**
   * Accepted for compatibility and ignored: the portal records when the role is submitted.
   * @return submissionDate
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SUBMISSION_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getSubmissionDate() {
    return submissionDate;
  }


  @JsonProperty(value = JSON_PROPERTY_SUBMISSION_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubmissionDate(@javax.annotation.Nullable OffsetDateTime submissionDate) {
    this.submissionDate = submissionDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormRoleRequest formRoleRequest = (FormRoleRequest) o;
    return Objects.equals(this.roomId, formRoleRequest.roomId) &&
        equalsNullable(this.roleName, formRoleRequest.roleName) &&
        equalsNullable(this.roleColor, formRoleRequest.roleColor) &&
        Objects.equals(this.userId, formRoleRequest.userId) &&
        Objects.equals(this.sequence, formRoleRequest.sequence) &&
        Objects.equals(this.submitted, formRoleRequest.submitted) &&
        Objects.equals(this.openedAt, formRoleRequest.openedAt) &&
        Objects.equals(this.submissionDate, formRoleRequest.submissionDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(roomId, hashCodeNullable(roleName), hashCodeNullable(roleColor), userId, sequence, submitted, openedAt, submissionDate);
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
    sb.append("class FormRoleRequest {\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    roleColor: ").append(toIndentedString(roleColor)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    submitted: ").append(toIndentedString(submitted)).append("\n");
    sb.append("    openedAt: ").append(toIndentedString(openedAt)).append("\n");
    sb.append("    submissionDate: ").append(toIndentedString(submissionDate)).append("\n");
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

    // add `roomId` to the URL query string
    if (getRoomId() != null) {
      try {
        joiner.add(String.format("%sroomId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRoomId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

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

    // add `userId` to the URL query string
    if (getUserId() != null) {
      try {
        joiner.add(String.format("%suserId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUserId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
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

    // add `openedAt` to the URL query string
    if (getOpenedAt() != null) {
      try {
        joiner.add(String.format("%sopenedAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOpenedAt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `submissionDate` to the URL query string
    if (getSubmissionDate() != null) {
      try {
        joiner.add(String.format("%ssubmissionDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSubmissionDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

