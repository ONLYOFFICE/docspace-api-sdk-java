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
import org.openapitools.client.model.EmployeeFullDto;
import org.openapitools.client.model.FileDto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The outcome of one completed form-filling session, as the person who has just filled the form sees it.
 */
@JsonPropertyOrder({
  FillingFormResultDto.JSON_PROPERTY_FORM_NUMBER,
  FillingFormResultDto.JSON_PROPERTY_COMPLETED_FORM,
  FillingFormResultDto.JSON_PROPERTY_ORIGINAL_FORM,
  FillingFormResultDto.JSON_PROPERTY_MANAGER,
  FillingFormResultDto.JSON_PROPERTY_ROOM_ID,
  FillingFormResultDto.JSON_PROPERTY_IS_ROOM_MEMBER
})

public class FillingFormResultDto {
  public static final String JSON_PROPERTY_FORM_NUMBER = "formNumber";
  @javax.annotation.Nonnull  private Integer formNumber;

  public static final String JSON_PROPERTY_COMPLETED_FORM = "completedForm";
  @javax.annotation.Nullable  private FileDto completedForm;

  public static final String JSON_PROPERTY_ORIGINAL_FORM = "originalForm";
  @javax.annotation.Nullable  private FileDto originalForm;

  public static final String JSON_PROPERTY_MANAGER = "manager";
  @javax.annotation.Nullable  private EmployeeFullDto manager;

  public static final String JSON_PROPERTY_ROOM_ID = "roomId";
  @javax.annotation.Nonnull  private Integer roomId;

  public static final String JSON_PROPERTY_IS_ROOM_MEMBER = "isRoomMember";
  @javax.annotation.Nullable  private Boolean isRoomMember;

  public FillingFormResultDto() {
  }


  public FillingFormResultDto formNumber(@javax.annotation.Nonnull Integer formNumber) {
    
    this.formNumber = formNumber;
    return this;
  }

  /**
   * The number this copy was given among the copies made of the same form, counting up from 1. It is the number  the results of the form are ordered by and the one the title of the copy carries.
   * @return formNumber
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_FORM_NUMBER, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getFormNumber() {
    return formNumber;
  }


  @JsonProperty(value = JSON_PROPERTY_FORM_NUMBER, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFormNumber(@javax.annotation.Nonnull Integer formNumber) {
    this.formNumber = formNumber;
  }

  public FillingFormResultDto completedForm(@javax.annotation.Nullable FileDto completedForm) {
    
    this.completedForm = completedForm;
    return this;
  }

  /**
   * The filled copy that the session produced, as an ordinary file: it can be read and downloaded with the file  operations of this API.
   * @return completedForm
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_COMPLETED_FORM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FileDto getCompletedForm() {
    return completedForm;
  }


  @JsonProperty(value = JSON_PROPERTY_COMPLETED_FORM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompletedForm(@javax.annotation.Nullable FileDto completedForm) {
    this.completedForm = completedForm;
  }

  public FillingFormResultDto originalForm(@javax.annotation.Nullable FileDto originalForm) {
    
    this.originalForm = originalForm;
    return this;
  }

  /**
   * The form the copy was made from, so that a client can offer filling it once more.
   * @return originalForm
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ORIGINAL_FORM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FileDto getOriginalForm() {
    return originalForm;
  }


  @JsonProperty(value = JSON_PROPERTY_ORIGINAL_FORM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginalForm(@javax.annotation.Nullable FileDto originalForm) {
    this.originalForm = originalForm;
  }

  public FillingFormResultDto manager(@javax.annotation.Nullable EmployeeFullDto manager) {
    
    this.manager = manager;
    return this;
  }

  /**
   * The account that owns the original form, reported with its email address, so that the person who has just  filled the form knows who receives it and whom to ask about it.
   * @return manager
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_MANAGER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EmployeeFullDto getManager() {
    return manager;
  }


  @JsonProperty(value = JSON_PROPERTY_MANAGER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManager(@javax.annotation.Nullable EmployeeFullDto manager) {
    this.manager = manager;
  }

  public FillingFormResultDto roomId(@javax.annotation.Nonnull Integer roomId) {
    
    this.roomId = roomId;
    return this;
  }

  /**
   * The room the form was filled in. It comes back as 0 when the session was reached through a link shared for  that single form rather than for its room, in which case there is no room the caller could be sent to.
   * @return roomId
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_ROOM_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getRoomId() {
    return roomId;
  }


  @JsonProperty(value = JSON_PROPERTY_ROOM_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRoomId(@javax.annotation.Nonnull Integer roomId) {
    this.roomId = roomId;
  }

  public FillingFormResultDto isRoomMember(@javax.annotation.Nullable Boolean isRoomMember) {
    
    this.isRoomMember = isRoomMember;
    return this;
  }

  /**
   * Tells whether the calling account may open that room: true for a member of the room and for a portal  administrator, in which case a client can offer going to the room; false for the anonymous caller who filled  the form through a link and can only be shown the copy itself.
   * @return isRoomMember
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IS_ROOM_MEMBER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsRoomMember() {
    return isRoomMember;
  }


  @JsonProperty(value = JSON_PROPERTY_IS_ROOM_MEMBER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRoomMember(@javax.annotation.Nullable Boolean isRoomMember) {
    this.isRoomMember = isRoomMember;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FillingFormResultDto fillingFormResultDto = (FillingFormResultDto) o;
    return Objects.equals(this.formNumber, fillingFormResultDto.formNumber) &&
        Objects.equals(this.completedForm, fillingFormResultDto.completedForm) &&
        Objects.equals(this.originalForm, fillingFormResultDto.originalForm) &&
        Objects.equals(this.manager, fillingFormResultDto.manager) &&
        Objects.equals(this.roomId, fillingFormResultDto.roomId) &&
        Objects.equals(this.isRoomMember, fillingFormResultDto.isRoomMember);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formNumber, completedForm, originalForm, manager, roomId, isRoomMember);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FillingFormResultDto {\n");
    sb.append("    formNumber: ").append(toIndentedString(formNumber)).append("\n");
    sb.append("    completedForm: ").append(toIndentedString(completedForm)).append("\n");
    sb.append("    originalForm: ").append(toIndentedString(originalForm)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    isRoomMember: ").append(toIndentedString(isRoomMember)).append("\n");
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

    // add `formNumber` to the URL query string
    if (getFormNumber() != null) {
      try {
        joiner.add(String.format("%sformNumber%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFormNumber()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `completedForm` to the URL query string
    if (getCompletedForm() != null) {
      joiner.add(getCompletedForm().toUrlQueryString(prefix + "completedForm" + suffix));
    }

    // add `originalForm` to the URL query string
    if (getOriginalForm() != null) {
      joiner.add(getOriginalForm().toUrlQueryString(prefix + "originalForm" + suffix));
    }

    // add `manager` to the URL query string
    if (getManager() != null) {
      joiner.add(getManager().toUrlQueryString(prefix + "manager" + suffix));
    }

    // add `roomId` to the URL query string
    if (getRoomId() != null) {
      try {
        joiner.add(String.format("%sroomId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRoomId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isRoomMember` to the URL query string
    if (getIsRoomMember() != null) {
      try {
        joiner.add(String.format("%sisRoomMember%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsRoomMember()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

