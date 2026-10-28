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
import org.openapitools.client.model.AiThreadMessageLikeContent;
import org.openapitools.client.model.AiThreadMessageLikeStatus;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * A single chat message as it travels on the wire.
 */
@JsonPropertyOrder({
  AiThreadMessageLike.JSON_PROPERTY_ID,
  AiThreadMessageLike.JSON_PROPERTY_ROLE,
  AiThreadMessageLike.JSON_PROPERTY_CONTENT,
  AiThreadMessageLike.JSON_PROPERTY_CREATED_AT,
  AiThreadMessageLike.JSON_PROPERTY_STATUS,
  AiThreadMessageLike.JSON_PROPERTY_METADATA,
  AiThreadMessageLike.JSON_PROPERTY_ATTACHMENTS
})

public class AiThreadMessageLike {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable  private String id;

  /**
   * Message author role.
   */
  public enum RoleEnum {
    USER(String.valueOf("user")),
    
    ASSISTANT(String.valueOf("assistant")),
    
    SYSTEM(String.valueOf("system"));

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RoleEnum fromValue(String value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  public static final String JSON_PROPERTY_ROLE = "role";
  @javax.annotation.Nonnull  private RoleEnum role;

  public static final String JSON_PROPERTY_CONTENT = "content";
  @javax.annotation.Nonnull  private AiThreadMessageLikeContent content;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  @javax.annotation.Nullable  private String createdAt;

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nullable  private AiThreadMessageLikeStatus status;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  @javax.annotation.Nullable  private Object metadata;

  public static final String JSON_PROPERTY_ATTACHMENTS = "attachments";
  @javax.annotation.Nullable  private List<Object> attachments = new ArrayList<>();

  public AiThreadMessageLike() {
  }


  public AiThreadMessageLike id(@javax.annotation.Nullable String id) {
    
    this.id = id;
    return this;
  }

  /**
   * Storage-assigned message id (absent on inbound drafts).
   * @return id
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }

  public AiThreadMessageLike role(@javax.annotation.Nonnull RoleEnum role) {
    
    this.role = role;
    return this;
  }

  /**
   * Message author role.
   * @return role
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_ROLE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RoleEnum getRole() {
    return role;
  }


  @JsonProperty(value = JSON_PROPERTY_ROLE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRole(@javax.annotation.Nonnull RoleEnum role) {
    this.role = role;
  }

  public AiThreadMessageLike content(@javax.annotation.Nonnull AiThreadMessageLikeContent content) {
    
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_CONTENT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AiThreadMessageLikeContent getContent() {
    return content;
  }


  @JsonProperty(value = JSON_PROPERTY_CONTENT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContent(@javax.annotation.Nonnull AiThreadMessageLikeContent content) {
    this.content = content;
  }

  public AiThreadMessageLike createdAt(@javax.annotation.Nullable String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Creation timestamp, ISO-8601 on the wire.
   * @return createdAt
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CREATED_AT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(value = JSON_PROPERTY_CREATED_AT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(@javax.annotation.Nullable String createdAt) {
    this.createdAt = createdAt;
  }

  public AiThreadMessageLike status(@javax.annotation.Nullable AiThreadMessageLikeStatus status) {
    
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AiThreadMessageLikeStatus getStatus() {
    return status;
  }


  @JsonProperty(value = JSON_PROPERTY_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(@javax.annotation.Nullable AiThreadMessageLikeStatus status) {
    this.status = status;
  }

  public AiThreadMessageLike metadata(@javax.annotation.Nullable Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

  /**
   * Arbitrary per-message metadata.
   * @return metadata
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_METADATA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getMetadata() {
    return metadata;
  }


  @JsonProperty(value = JSON_PROPERTY_METADATA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(@javax.annotation.Nullable Object metadata) {
    this.metadata = metadata;
  }

  public AiThreadMessageLike attachments(@javax.annotation.Nullable List<Object> attachments) {
    
    this.attachments = attachments;
    return this;
  }

  public AiThreadMessageLike addAttachmentsItem(Object attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

  /**
   * Attachments linked to the message.
   * @return attachments
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ATTACHMENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getAttachments() {
    return attachments;
  }


  @JsonProperty(value = JSON_PROPERTY_ATTACHMENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttachments(@javax.annotation.Nullable List<Object> attachments) {
    this.attachments = attachments;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiThreadMessageLike aiThreadMessageLike = (AiThreadMessageLike) o;
    return Objects.equals(this.id, aiThreadMessageLike.id) &&
        Objects.equals(this.role, aiThreadMessageLike.role) &&
        Objects.equals(this.content, aiThreadMessageLike.content) &&
        Objects.equals(this.createdAt, aiThreadMessageLike.createdAt) &&
        Objects.equals(this.status, aiThreadMessageLike.status) &&
        Objects.equals(this.metadata, aiThreadMessageLike.metadata) &&
        Objects.equals(this.attachments, aiThreadMessageLike.attachments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, role, content, createdAt, status, metadata, attachments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiThreadMessageLike {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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

    // add `role` to the URL query string
    if (getRole() != null) {
      try {
        joiner.add(String.format("%srole%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRole()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `content` to the URL query string
    if (getContent() != null) {
      joiner.add(getContent().toUrlQueryString(prefix + "content" + suffix));
    }

    // add `createdAt` to the URL query string
    if (getCreatedAt() != null) {
      try {
        joiner.add(String.format("%screatedAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedAt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(getStatus().toUrlQueryString(prefix + "status" + suffix));
    }

    // add `metadata` to the URL query string
    if (getMetadata() != null) {
      try {
        joiner.add(String.format("%smetadata%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMetadata()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `attachments` to the URL query string
    if (getAttachments() != null) {
      for (int i = 0; i < getAttachments().size(); i++) {
        try {
          joiner.add(String.format("%sattachments%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getAttachments().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}

