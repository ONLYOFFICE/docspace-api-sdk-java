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
import org.openapitools.client.model.FileShare;
import org.openapitools.client.model.FileShareLink;
import org.openapitools.client.model.GroupSummaryDto;
import org.openapitools.client.model.SubjectType;
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
 * The file sharing information and access rights.
 */
@JsonPropertyOrder({
  FileShareDto.JSON_PROPERTY_ACCESS,
  FileShareDto.JSON_PROPERTY_SHARED_TO,
  FileShareDto.JSON_PROPERTY_SHARED_TO_USER,
  FileShareDto.JSON_PROPERTY_SHARED_TO_GROUP,
  FileShareDto.JSON_PROPERTY_SHARED_LINK,
  FileShareDto.JSON_PROPERTY_IS_LOCKED,
  FileShareDto.JSON_PROPERTY_IS_OWNER,
  FileShareDto.JSON_PROPERTY_CAN_EDIT_ACCESS,
  FileShareDto.JSON_PROPERTY_CAN_EDIT_INTERNAL,
  FileShareDto.JSON_PROPERTY_CAN_EDIT_DENY_DOWNLOAD,
  FileShareDto.JSON_PROPERTY_CAN_EDIT_EXPIRATION_DATE,
  FileShareDto.JSON_PROPERTY_CAN_REVOKE,
  FileShareDto.JSON_PROPERTY_SUBJECT_TYPE
})

public class FileShareDto {
  public static final String JSON_PROPERTY_ACCESS = "access";
  @javax.annotation.Nullable
  private FileShare access;

  public static final String JSON_PROPERTY_SHARED_TO = "sharedTo";
  @javax.annotation.Nullable
  private JsonNullable<Object> sharedTo = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SHARED_TO_USER = "sharedToUser";
  @javax.annotation.Nullable
  private EmployeeFullDto sharedToUser;

  public static final String JSON_PROPERTY_SHARED_TO_GROUP = "sharedToGroup";
  @javax.annotation.Nullable
  private GroupSummaryDto sharedToGroup;

  public static final String JSON_PROPERTY_SHARED_LINK = "sharedLink";
  @javax.annotation.Nullable
  private FileShareLink sharedLink;

  public static final String JSON_PROPERTY_IS_LOCKED = "isLocked";
  @javax.annotation.Nonnull
  private Boolean isLocked;

  public static final String JSON_PROPERTY_IS_OWNER = "isOwner";
  @javax.annotation.Nonnull
  private Boolean isOwner;

  public static final String JSON_PROPERTY_CAN_EDIT_ACCESS = "canEditAccess";
  @javax.annotation.Nonnull
  private Boolean canEditAccess;

  public static final String JSON_PROPERTY_CAN_EDIT_INTERNAL = "canEditInternal";
  @javax.annotation.Nonnull
  private Boolean canEditInternal;

  public static final String JSON_PROPERTY_CAN_EDIT_DENY_DOWNLOAD = "canEditDenyDownload";
  @javax.annotation.Nonnull
  private Boolean canEditDenyDownload;

  public static final String JSON_PROPERTY_CAN_EDIT_EXPIRATION_DATE = "canEditExpirationDate";
  @javax.annotation.Nonnull
  private Boolean canEditExpirationDate;

  public static final String JSON_PROPERTY_CAN_REVOKE = "canRevoke";
  @javax.annotation.Nonnull
  private Boolean canRevoke;

  public static final String JSON_PROPERTY_SUBJECT_TYPE = "subjectType";
  @javax.annotation.Nonnull
  private SubjectType subjectType;

  public FileShareDto() {
  }


  public FileShareDto access(@javax.annotation.Nullable FileShare access) {
    
    this.access = access;
    return this;
  }

  /**
   * Get access
   * @return access
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FileShare getAccess() {
    return access;
  }


  @JsonProperty(JSON_PROPERTY_ACCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccess(@javax.annotation.Nullable FileShare access) {
    this.access = access;
  }

  public FileShareDto sharedTo(@javax.annotation.Nullable Object sharedTo) {
    this.sharedTo = JsonNullable.<Object>of(sharedTo);
    
    return this;
  }

  /**
   * The user who has the access to the specified file.
   * @return sharedTo
   * @deprecated
   */
  @Deprecated
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getSharedTo() {
        return sharedTo.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SHARED_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getSharedTo_JsonNullable() {
    return sharedTo;
  }
  
  @JsonProperty(JSON_PROPERTY_SHARED_TO)
  public void setSharedTo_JsonNullable(JsonNullable<Object> sharedTo) {
    this.sharedTo = sharedTo;
  }

  public void setSharedTo(@javax.annotation.Nullable Object sharedTo) {
    this.sharedTo = JsonNullable.<Object>of(sharedTo);
  }

  public FileShareDto sharedToUser(@javax.annotation.Nullable EmployeeFullDto sharedToUser) {
    
    this.sharedToUser = sharedToUser;
    return this;
  }

  /**
   * Get sharedToUser
   * @return sharedToUser
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHARED_TO_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EmployeeFullDto getSharedToUser() {
    return sharedToUser;
  }


  @JsonProperty(JSON_PROPERTY_SHARED_TO_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSharedToUser(@javax.annotation.Nullable EmployeeFullDto sharedToUser) {
    this.sharedToUser = sharedToUser;
  }

  public FileShareDto sharedToGroup(@javax.annotation.Nullable GroupSummaryDto sharedToGroup) {
    
    this.sharedToGroup = sharedToGroup;
    return this;
  }

  /**
   * Get sharedToGroup
   * @return sharedToGroup
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHARED_TO_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GroupSummaryDto getSharedToGroup() {
    return sharedToGroup;
  }


  @JsonProperty(JSON_PROPERTY_SHARED_TO_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSharedToGroup(@javax.annotation.Nullable GroupSummaryDto sharedToGroup) {
    this.sharedToGroup = sharedToGroup;
  }

  public FileShareDto sharedLink(@javax.annotation.Nullable FileShareLink sharedLink) {
    
    this.sharedLink = sharedLink;
    return this;
  }

  /**
   * Get sharedLink
   * @return sharedLink
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHARED_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FileShareLink getSharedLink() {
    return sharedLink;
  }


  @JsonProperty(JSON_PROPERTY_SHARED_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSharedLink(@javax.annotation.Nullable FileShareLink sharedLink) {
    this.sharedLink = sharedLink;
  }

  public FileShareDto isLocked(@javax.annotation.Nonnull Boolean isLocked) {
    
    this.isLocked = isLocked;
    return this;
  }

  /**
   * Specifies if the access right is locked or not.
   * @return isLocked
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_LOCKED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsLocked() {
    return isLocked;
  }


  @JsonProperty(JSON_PROPERTY_IS_LOCKED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsLocked(@javax.annotation.Nonnull Boolean isLocked) {
    this.isLocked = isLocked;
  }

  public FileShareDto isOwner(@javax.annotation.Nonnull Boolean isOwner) {
    
    this.isOwner = isOwner;
    return this;
  }

  /**
   * Specifies if the user is an owner of the specified file or not.
   * @return isOwner
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_OWNER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsOwner() {
    return isOwner;
  }


  @JsonProperty(JSON_PROPERTY_IS_OWNER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsOwner(@javax.annotation.Nonnull Boolean isOwner) {
    this.isOwner = isOwner;
  }

  public FileShareDto canEditAccess(@javax.annotation.Nonnull Boolean canEditAccess) {
    
    this.canEditAccess = canEditAccess;
    return this;
  }

  /**
   * Specifies if the user can edit the access to the specified file or not.
   * @return canEditAccess
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CAN_EDIT_ACCESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getCanEditAccess() {
    return canEditAccess;
  }


  @JsonProperty(JSON_PROPERTY_CAN_EDIT_ACCESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCanEditAccess(@javax.annotation.Nonnull Boolean canEditAccess) {
    this.canEditAccess = canEditAccess;
  }

  public FileShareDto canEditInternal(@javax.annotation.Nonnull Boolean canEditInternal) {
    
    this.canEditInternal = canEditInternal;
    return this;
  }

  /**
   * Indicates whether internal editing permissions are granted.
   * @return canEditInternal
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CAN_EDIT_INTERNAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getCanEditInternal() {
    return canEditInternal;
  }


  @JsonProperty(JSON_PROPERTY_CAN_EDIT_INTERNAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCanEditInternal(@javax.annotation.Nonnull Boolean canEditInternal) {
    this.canEditInternal = canEditInternal;
  }

  public FileShareDto canEditDenyDownload(@javax.annotation.Nonnull Boolean canEditDenyDownload) {
    
    this.canEditDenyDownload = canEditDenyDownload;
    return this;
  }

  /**
   * Determines whether the user has permission to modify the deny download setting for the file share.
   * @return canEditDenyDownload
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CAN_EDIT_DENY_DOWNLOAD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getCanEditDenyDownload() {
    return canEditDenyDownload;
  }


  @JsonProperty(JSON_PROPERTY_CAN_EDIT_DENY_DOWNLOAD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCanEditDenyDownload(@javax.annotation.Nonnull Boolean canEditDenyDownload) {
    this.canEditDenyDownload = canEditDenyDownload;
  }

  public FileShareDto canEditExpirationDate(@javax.annotation.Nonnull Boolean canEditExpirationDate) {
    
    this.canEditExpirationDate = canEditExpirationDate;
    return this;
  }

  /**
   * Indicates whether the expiration date of access permissions can be edited.
   * @return canEditExpirationDate
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CAN_EDIT_EXPIRATION_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getCanEditExpirationDate() {
    return canEditExpirationDate;
  }


  @JsonProperty(JSON_PROPERTY_CAN_EDIT_EXPIRATION_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCanEditExpirationDate(@javax.annotation.Nonnull Boolean canEditExpirationDate) {
    this.canEditExpirationDate = canEditExpirationDate;
  }

  public FileShareDto canRevoke(@javax.annotation.Nonnull Boolean canRevoke) {
    
    this.canRevoke = canRevoke;
    return this;
  }

  /**
   * Specifies whether the file sharing access can be revoked by the current user.
   * @return canRevoke
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CAN_REVOKE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getCanRevoke() {
    return canRevoke;
  }


  @JsonProperty(JSON_PROPERTY_CAN_REVOKE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCanRevoke(@javax.annotation.Nonnull Boolean canRevoke) {
    this.canRevoke = canRevoke;
  }

  public FileShareDto subjectType(@javax.annotation.Nonnull SubjectType subjectType) {
    
    this.subjectType = subjectType;
    return this;
  }

  /**
   * Get subjectType
   * @return subjectType
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SUBJECT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SubjectType getSubjectType() {
    return subjectType;
  }


  @JsonProperty(JSON_PROPERTY_SUBJECT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubjectType(@javax.annotation.Nonnull SubjectType subjectType) {
    this.subjectType = subjectType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileShareDto fileShareDto = (FileShareDto) o;
    return Objects.equals(this.access, fileShareDto.access) &&
        equalsNullable(this.sharedTo, fileShareDto.sharedTo) &&
        Objects.equals(this.sharedToUser, fileShareDto.sharedToUser) &&
        Objects.equals(this.sharedToGroup, fileShareDto.sharedToGroup) &&
        Objects.equals(this.sharedLink, fileShareDto.sharedLink) &&
        Objects.equals(this.isLocked, fileShareDto.isLocked) &&
        Objects.equals(this.isOwner, fileShareDto.isOwner) &&
        Objects.equals(this.canEditAccess, fileShareDto.canEditAccess) &&
        Objects.equals(this.canEditInternal, fileShareDto.canEditInternal) &&
        Objects.equals(this.canEditDenyDownload, fileShareDto.canEditDenyDownload) &&
        Objects.equals(this.canEditExpirationDate, fileShareDto.canEditExpirationDate) &&
        Objects.equals(this.canRevoke, fileShareDto.canRevoke) &&
        Objects.equals(this.subjectType, fileShareDto.subjectType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(access, hashCodeNullable(sharedTo), sharedToUser, sharedToGroup, sharedLink, isLocked, isOwner, canEditAccess, canEditInternal, canEditDenyDownload, canEditExpirationDate, canRevoke, subjectType);
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
    sb.append("class FileShareDto {\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    sharedTo: ").append(toIndentedString(sharedTo)).append("\n");
    sb.append("    sharedToUser: ").append(toIndentedString(sharedToUser)).append("\n");
    sb.append("    sharedToGroup: ").append(toIndentedString(sharedToGroup)).append("\n");
    sb.append("    sharedLink: ").append(toIndentedString(sharedLink)).append("\n");
    sb.append("    isLocked: ").append(toIndentedString(isLocked)).append("\n");
    sb.append("    isOwner: ").append(toIndentedString(isOwner)).append("\n");
    sb.append("    canEditAccess: ").append(toIndentedString(canEditAccess)).append("\n");
    sb.append("    canEditInternal: ").append(toIndentedString(canEditInternal)).append("\n");
    sb.append("    canEditDenyDownload: ").append(toIndentedString(canEditDenyDownload)).append("\n");
    sb.append("    canEditExpirationDate: ").append(toIndentedString(canEditExpirationDate)).append("\n");
    sb.append("    canRevoke: ").append(toIndentedString(canRevoke)).append("\n");
    sb.append("    subjectType: ").append(toIndentedString(subjectType)).append("\n");
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

    // add `access` to the URL query string
    if (getAccess() != null) {
      try {
        joiner.add(String.format("%saccess%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAccess()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sharedTo` to the URL query string
    if (getSharedTo() != null) {
      try {
        joiner.add(String.format("%ssharedTo%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSharedTo()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sharedToUser` to the URL query string
    if (getSharedToUser() != null) {
      joiner.add(getSharedToUser().toUrlQueryString(prefix + "sharedToUser" + suffix));
    }

    // add `sharedToGroup` to the URL query string
    if (getSharedToGroup() != null) {
      joiner.add(getSharedToGroup().toUrlQueryString(prefix + "sharedToGroup" + suffix));
    }

    // add `sharedLink` to the URL query string
    if (getSharedLink() != null) {
      joiner.add(getSharedLink().toUrlQueryString(prefix + "sharedLink" + suffix));
    }

    // add `isLocked` to the URL query string
    if (getIsLocked() != null) {
      try {
        joiner.add(String.format("%sisLocked%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsLocked()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isOwner` to the URL query string
    if (getIsOwner() != null) {
      try {
        joiner.add(String.format("%sisOwner%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsOwner()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `canEditAccess` to the URL query string
    if (getCanEditAccess() != null) {
      try {
        joiner.add(String.format("%scanEditAccess%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCanEditAccess()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `canEditInternal` to the URL query string
    if (getCanEditInternal() != null) {
      try {
        joiner.add(String.format("%scanEditInternal%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCanEditInternal()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `canEditDenyDownload` to the URL query string
    if (getCanEditDenyDownload() != null) {
      try {
        joiner.add(String.format("%scanEditDenyDownload%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCanEditDenyDownload()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `canEditExpirationDate` to the URL query string
    if (getCanEditExpirationDate() != null) {
      try {
        joiner.add(String.format("%scanEditExpirationDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCanEditExpirationDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `canRevoke` to the URL query string
    if (getCanRevoke() != null) {
      try {
        joiner.add(String.format("%scanRevoke%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCanRevoke()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `subjectType` to the URL query string
    if (getSubjectType() != null) {
      try {
        joiner.add(String.format("%ssubjectType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSubjectType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

