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
import org.openapitools.client.model.EmployeeFullDto;
import org.openapitools.client.model.FileDtoInteger;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The parameters of the form filling result.
 */
@JsonPropertyOrder({
  FillingFormResultDtoInteger.JSON_PROPERTY_FORM_NUMBER,
  FillingFormResultDtoInteger.JSON_PROPERTY_COMPLETED_FORM,
  FillingFormResultDtoInteger.JSON_PROPERTY_ORIGINAL_FORM,
  FillingFormResultDtoInteger.JSON_PROPERTY_MANAGER,
  FillingFormResultDtoInteger.JSON_PROPERTY_ROOM_ID,
  FillingFormResultDtoInteger.JSON_PROPERTY_IS_ROOM_MEMBER
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class FillingFormResultDtoInteger {
  public static final String JSON_PROPERTY_FORM_NUMBER = "formNumber";
  @javax.annotation.Nonnull
  private Integer formNumber;

  public static final String JSON_PROPERTY_COMPLETED_FORM = "completedForm";
  @javax.annotation.Nullable
  private FileDtoInteger completedForm;

  public static final String JSON_PROPERTY_ORIGINAL_FORM = "originalForm";
  @javax.annotation.Nullable
  private FileDtoInteger originalForm;

  public static final String JSON_PROPERTY_MANAGER = "manager";
  @javax.annotation.Nullable
  private EmployeeFullDto manager;

  public static final String JSON_PROPERTY_ROOM_ID = "roomId";
  @javax.annotation.Nonnull
  private Integer roomId;

  public static final String JSON_PROPERTY_IS_ROOM_MEMBER = "isRoomMember";
  @javax.annotation.Nullable
  private Boolean isRoomMember;

  public FillingFormResultDtoInteger() {
  }

  public FillingFormResultDtoInteger formNumber(@javax.annotation.Nonnull Integer formNumber) {
    
    this.formNumber = formNumber;
    return this;
  }

  /**
   * The filling form number.
   * @return formNumber
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FORM_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getFormNumber() {
    return formNumber;
  }


  @JsonProperty(JSON_PROPERTY_FORM_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFormNumber(@javax.annotation.Nonnull Integer formNumber) {
    this.formNumber = formNumber;
  }

  public FillingFormResultDtoInteger completedForm(@javax.annotation.Nullable FileDtoInteger completedForm) {
    
    this.completedForm = completedForm;
    return this;
  }

  /**
   * Get completedForm
   * @return completedForm
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPLETED_FORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FileDtoInteger getCompletedForm() {
    return completedForm;
  }


  @JsonProperty(JSON_PROPERTY_COMPLETED_FORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompletedForm(@javax.annotation.Nullable FileDtoInteger completedForm) {
    this.completedForm = completedForm;
  }

  public FillingFormResultDtoInteger originalForm(@javax.annotation.Nullable FileDtoInteger originalForm) {
    
    this.originalForm = originalForm;
    return this;
  }

  /**
   * Get originalForm
   * @return originalForm
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORIGINAL_FORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FileDtoInteger getOriginalForm() {
    return originalForm;
  }


  @JsonProperty(JSON_PROPERTY_ORIGINAL_FORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginalForm(@javax.annotation.Nullable FileDtoInteger originalForm) {
    this.originalForm = originalForm;
  }

  public FillingFormResultDtoInteger manager(@javax.annotation.Nullable EmployeeFullDto manager) {
    
    this.manager = manager;
    return this;
  }

  /**
   * Get manager
   * @return manager
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MANAGER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EmployeeFullDto getManager() {
    return manager;
  }


  @JsonProperty(JSON_PROPERTY_MANAGER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManager(@javax.annotation.Nullable EmployeeFullDto manager) {
    this.manager = manager;
  }

  public FillingFormResultDtoInteger roomId(@javax.annotation.Nonnull Integer roomId) {
    
    this.roomId = roomId;
    return this;
  }

  /**
   * The room ID where filling the form.
   * @return roomId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ROOM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getRoomId() {
    return roomId;
  }


  @JsonProperty(JSON_PROPERTY_ROOM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRoomId(@javax.annotation.Nonnull Integer roomId) {
    this.roomId = roomId;
  }

  public FillingFormResultDtoInteger isRoomMember(@javax.annotation.Nullable Boolean isRoomMember) {
    
    this.isRoomMember = isRoomMember;
    return this;
  }

  /**
   * Specifies if the manager who fills the form is a room member or not.
   * @return isRoomMember
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ROOM_MEMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsRoomMember() {
    return isRoomMember;
  }


  @JsonProperty(JSON_PROPERTY_IS_ROOM_MEMBER)
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
    FillingFormResultDtoInteger fillingFormResultDtoInteger = (FillingFormResultDtoInteger) o;
    return Objects.equals(this.formNumber, fillingFormResultDtoInteger.formNumber) &&
        Objects.equals(this.completedForm, fillingFormResultDtoInteger.completedForm) &&
        Objects.equals(this.originalForm, fillingFormResultDtoInteger.originalForm) &&
        Objects.equals(this.manager, fillingFormResultDtoInteger.manager) &&
        Objects.equals(this.roomId, fillingFormResultDtoInteger.roomId) &&
        Objects.equals(this.isRoomMember, fillingFormResultDtoInteger.isRoomMember);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formNumber, completedForm, originalForm, manager, roomId, isRoomMember);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FillingFormResultDtoInteger {\n");
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

