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
import java.util.UUID;
import org.openapitools.client.model.FileEntryType;
import org.openapitools.client.model.Status;
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
 * The external sharing information and validation data.
 */
@JsonPropertyOrder({
  ExternalShareDto.JSON_PROPERTY_STATUS,
  ExternalShareDto.JSON_PROPERTY_ID,
  ExternalShareDto.JSON_PROPERTY_TITLE,
  ExternalShareDto.JSON_PROPERTY_TYPE,
  ExternalShareDto.JSON_PROPERTY_TENANT_ID,
  ExternalShareDto.JSON_PROPERTY_ENTITY_ID,
  ExternalShareDto.JSON_PROPERTY_ENTITY_TITLE,
  ExternalShareDto.JSON_PROPERTY_ENTITY_TYPE,
  ExternalShareDto.JSON_PROPERTY_IS_ROOM,
  ExternalShareDto.JSON_PROPERTY_SHARED,
  ExternalShareDto.JSON_PROPERTY_LINK_ID,
  ExternalShareDto.JSON_PROPERTY_IS_AUTHENTICATED,
  ExternalShareDto.JSON_PROPERTY_IS_ROOM_MEMBER
})

public class ExternalShareDto {
  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nonnull
  private Status status;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private String id;

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable
  private String title;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable
  private FileEntryType type;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @javax.annotation.Nonnull
  private Integer tenantId;

  public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
  @javax.annotation.Nullable
  private JsonNullable<String> entityId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ENTITY_TITLE = "entityTitle";
  @javax.annotation.Nullable
  private JsonNullable<String> entityTitle = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ENTITY_TYPE = "entityType";
  @javax.annotation.Nullable
  private FileEntryType entityType;

  public static final String JSON_PROPERTY_IS_ROOM = "isRoom";
  @javax.annotation.Nullable
  private JsonNullable<Boolean> isRoom = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_SHARED = "shared";
  @javax.annotation.Nonnull
  private Boolean shared;

  public static final String JSON_PROPERTY_LINK_ID = "linkId";
  @javax.annotation.Nonnull
  private UUID linkId;

  public static final String JSON_PROPERTY_IS_AUTHENTICATED = "isAuthenticated";
  @javax.annotation.Nonnull
  private Boolean isAuthenticated;

  public static final String JSON_PROPERTY_IS_ROOM_MEMBER = "isRoomMember";
  @javax.annotation.Nullable
  private Boolean isRoomMember;

  public ExternalShareDto() {
  }

  public ExternalShareDto status(@javax.annotation.Nonnull Status status) {
    
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Status getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(@javax.annotation.Nonnull Status status) {
    this.status = status;
  }

  public ExternalShareDto id(@javax.annotation.Nullable String id) {
    
    this.id = id;
    return this;
  }

  /**
   * The external data ID.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }

  public ExternalShareDto title(@javax.annotation.Nullable String title) {
    
    this.title = title;
    return this;
  }

  /**
   * The external data title.
   * @return title
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTitle(@javax.annotation.Nullable String title) {
    this.title = title;
  }

  public ExternalShareDto type(@javax.annotation.Nullable FileEntryType type) {
    
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FileEntryType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@javax.annotation.Nullable FileEntryType type) {
    this.type = type;
  }

  public ExternalShareDto tenantId(@javax.annotation.Nonnull Integer tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

  /**
   * The tenant ID.
   * @return tenantId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTenantId() {
    return tenantId;
  }


  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTenantId(@javax.annotation.Nonnull Integer tenantId) {
    this.tenantId = tenantId;
  }

  public ExternalShareDto entityId(@javax.annotation.Nullable String entityId) {
    this.entityId = JsonNullable.<String>of(entityId);
    
    return this;
  }

  /**
   * The unique identifier of the shared entity.
   * @return entityId
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getEntityId() {
        return entityId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getEntityId_JsonNullable() {
    return entityId;
  }
  
  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  public void setEntityId_JsonNullable(JsonNullable<String> entityId) {
    this.entityId = entityId;
  }

  public void setEntityId(@javax.annotation.Nullable String entityId) {
    this.entityId = JsonNullable.<String>of(entityId);
  }

  public ExternalShareDto entityTitle(@javax.annotation.Nullable String entityTitle) {
    this.entityTitle = JsonNullable.<String>of(entityTitle);
    
    return this;
  }

  /**
   * The title of the shared entity.
   * @return entityTitle
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getEntityTitle() {
        return entityTitle.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENTITY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getEntityTitle_JsonNullable() {
    return entityTitle;
  }
  
  @JsonProperty(JSON_PROPERTY_ENTITY_TITLE)
  public void setEntityTitle_JsonNullable(JsonNullable<String> entityTitle) {
    this.entityTitle = entityTitle;
  }

  public void setEntityTitle(@javax.annotation.Nullable String entityTitle) {
    this.entityTitle = JsonNullable.<String>of(entityTitle);
  }

  public ExternalShareDto entityType(@javax.annotation.Nullable FileEntryType entityType) {
    
    this.entityType = entityType;
    return this;
  }

  /**
   * Get entityType
   * @return entityType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FileEntryType getEntityType() {
    return entityType;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityType(@javax.annotation.Nullable FileEntryType entityType) {
    this.entityType = entityType;
  }

  public ExternalShareDto isRoom(@javax.annotation.Nullable Boolean isRoom) {
    this.isRoom = JsonNullable.<Boolean>of(isRoom);
    
    return this;
  }

  /**
   * Indicates whether the entity represents a room.
   * @return isRoom
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getIsRoom() {
        return isRoom.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IS_ROOM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getIsRoom_JsonNullable() {
    return isRoom;
  }
  
  @JsonProperty(JSON_PROPERTY_IS_ROOM)
  public void setIsRoom_JsonNullable(JsonNullable<Boolean> isRoom) {
    this.isRoom = isRoom;
  }

  public void setIsRoom(@javax.annotation.Nullable Boolean isRoom) {
    this.isRoom = JsonNullable.<Boolean>of(isRoom);
  }

  public ExternalShareDto shared(@javax.annotation.Nonnull Boolean shared) {
    
    this.shared = shared;
    return this;
  }

  /**
   * Specifies whether to share the external data or not.
   * @return shared
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SHARED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getShared() {
    return shared;
  }


  @JsonProperty(JSON_PROPERTY_SHARED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setShared(@javax.annotation.Nonnull Boolean shared) {
    this.shared = shared;
  }

  public ExternalShareDto linkId(@javax.annotation.Nonnull UUID linkId) {
    
    this.linkId = linkId;
    return this;
  }

  /**
   * The link ID of the external data.
   * @return linkId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LINK_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getLinkId() {
    return linkId;
  }


  @JsonProperty(JSON_PROPERTY_LINK_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLinkId(@javax.annotation.Nonnull UUID linkId) {
    this.linkId = linkId;
  }

  public ExternalShareDto isAuthenticated(@javax.annotation.Nonnull Boolean isAuthenticated) {
    
    this.isAuthenticated = isAuthenticated;
    return this;
  }

  /**
   * Specifies whether the user is authenticated or not.
   * @return isAuthenticated
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_AUTHENTICATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsAuthenticated() {
    return isAuthenticated;
  }


  @JsonProperty(JSON_PROPERTY_IS_AUTHENTICATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsAuthenticated(@javax.annotation.Nonnull Boolean isAuthenticated) {
    this.isAuthenticated = isAuthenticated;
  }

  public ExternalShareDto isRoomMember(@javax.annotation.Nullable Boolean isRoomMember) {
    
    this.isRoomMember = isRoomMember;
    return this;
  }

  /**
   * The room ID of the external data.
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
    ExternalShareDto externalShareDto = (ExternalShareDto) o;
    return Objects.equals(this.status, externalShareDto.status) &&
        Objects.equals(this.id, externalShareDto.id) &&
        Objects.equals(this.title, externalShareDto.title) &&
        Objects.equals(this.type, externalShareDto.type) &&
        Objects.equals(this.tenantId, externalShareDto.tenantId) &&
        equalsNullable(this.entityId, externalShareDto.entityId) &&
        equalsNullable(this.entityTitle, externalShareDto.entityTitle) &&
        Objects.equals(this.entityType, externalShareDto.entityType) &&
        equalsNullable(this.isRoom, externalShareDto.isRoom) &&
        Objects.equals(this.shared, externalShareDto.shared) &&
        Objects.equals(this.linkId, externalShareDto.linkId) &&
        Objects.equals(this.isAuthenticated, externalShareDto.isAuthenticated) &&
        Objects.equals(this.isRoomMember, externalShareDto.isRoomMember);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, id, title, type, tenantId, hashCodeNullable(entityId), hashCodeNullable(entityTitle), entityType, hashCodeNullable(isRoom), shared, linkId, isAuthenticated, isRoomMember);
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
    sb.append("class ExternalShareDto {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityTitle: ").append(toIndentedString(entityTitle)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    isRoom: ").append(toIndentedString(isRoom)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    sb.append("    linkId: ").append(toIndentedString(linkId)).append("\n");
    sb.append("    isAuthenticated: ").append(toIndentedString(isAuthenticated)).append("\n");
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

    // add `status` to the URL query string
    if (getStatus() != null) {
      try {
        joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatus()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
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

    // add `type` to the URL query string
    if (getType() != null) {
      try {
        joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `tenantId` to the URL query string
    if (getTenantId() != null) {
      try {
        joiner.add(String.format("%stenantId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTenantId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `entityId` to the URL query string
    if (getEntityId() != null) {
      try {
        joiner.add(String.format("%sentityId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEntityId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `entityTitle` to the URL query string
    if (getEntityTitle() != null) {
      try {
        joiner.add(String.format("%sentityTitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEntityTitle()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `entityType` to the URL query string
    if (getEntityType() != null) {
      try {
        joiner.add(String.format("%sentityType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEntityType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isRoom` to the URL query string
    if (getIsRoom() != null) {
      try {
        joiner.add(String.format("%sisRoom%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsRoom()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `shared` to the URL query string
    if (getShared() != null) {
      try {
        joiner.add(String.format("%sshared%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getShared()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `linkId` to the URL query string
    if (getLinkId() != null) {
      try {
        joiner.add(String.format("%slinkId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLinkId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isAuthenticated` to the URL query string
    if (getIsAuthenticated() != null) {
      try {
        joiner.add(String.format("%sisAuthenticated%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsAuthenticated()), "UTF-8").replaceAll("\\+", "%20")));
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

