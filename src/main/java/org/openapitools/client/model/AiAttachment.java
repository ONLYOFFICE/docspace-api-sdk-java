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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.AiAttachmentFormKeysInner;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Persistent record for a single attachment (file or image) referenced from a user message. Files carry extracted text in `content`; images carry base64 data in `base64`. Metadata (`title`, `path`, `type`) is always present for display purposes regardless of whether the heavy payload is loaded.
 */
@JsonPropertyOrder({
  AiAttachment.JSON_PROPERTY_ID,
  AiAttachment.JSON_PROPERTY_KIND,
  AiAttachment.JSON_PROPERTY_SOURCE,
  AiAttachment.JSON_PROPERTY_TITLE,
  AiAttachment.JSON_PROPERTY_CONTENT,
  AiAttachment.JSON_PROPERTY_BASE64,
  AiAttachment.JSON_PROPERTY_PATH,
  AiAttachment.JSON_PROPERTY_TYPE,
  AiAttachment.JSON_PROPERTY_MESSAGE_ID,
  AiAttachment.JSON_PROPERTY_THREAD_ID,
  AiAttachment.JSON_PROPERTY_ENTITY_ID,
  AiAttachment.JSON_PROPERTY_CREATED_AT,
  AiAttachment.JSON_PROPERTY_CAN_ANALYZE,
  AiAttachment.JSON_PROPERTY_FORM_KEYS
})

public class AiAttachment {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nonnull  private String id;

  /**
   * file | image.
   */
  public enum KindEnum {
    FILE(String.valueOf("file")),
    
    IMAGE(String.valueOf("image"));

    private String value;

    KindEnum(String value) {
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
    public static KindEnum fromValue(String value) {
      for (KindEnum b : KindEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  public static final String JSON_PROPERTY_KIND = "kind";
  @javax.annotation.Nonnull  private KindEnum kind;

  /**
   * Origin of the attachment. &#x60;user&#x60; — uploaded by the user in the composer (the default when unset, for backward compatibility). &#x60;tool&#x60; — produced by a tool call (e.g. &#x60;generate_image&#x60;). Lets the integrator&#39;s adapter route or apply policies (separate bucket, quotas, TTL, CDN) per source.
   */
  public enum SourceEnum {
    USER(String.valueOf("user")),
    
    TOOL(String.valueOf("tool"));

    private String value;

    SourceEnum(String value) {
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
    public static SourceEnum fromValue(String value) {
      for (SourceEnum b : SourceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  public static final String JSON_PROPERTY_SOURCE = "source";
  @javax.annotation.Nullable  private SourceEnum source;

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nonnull  private String title;

  public static final String JSON_PROPERTY_CONTENT = "content";
  @javax.annotation.Nullable  private String content;

  public static final String JSON_PROPERTY_BASE64 = "base64";
  @javax.annotation.Nullable  private String base64;

  public static final String JSON_PROPERTY_PATH = "path";
  @javax.annotation.Nullable  private String path;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable  private BigDecimal type;

  public static final String JSON_PROPERTY_MESSAGE_ID = "messageId";
  @javax.annotation.Nullable  private String messageId;

  public static final String JSON_PROPERTY_THREAD_ID = "threadId";
  @javax.annotation.Nullable  private String threadId;

  public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
  @javax.annotation.Nullable  private String entityId;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  @javax.annotation.Nonnull  private BigDecimal createdAt;

  public static final String JSON_PROPERTY_CAN_ANALYZE = "canAnalyze";
  @javax.annotation.Nullable  private Boolean canAnalyze;

  public static final String JSON_PROPERTY_FORM_KEYS = "formKeys";
  @javax.annotation.Nullable  private List<AiAttachmentFormKeysInner> formKeys = new ArrayList<>();

  public AiAttachment() {
  }


  public AiAttachment id(@javax.annotation.Nonnull String id) {
    
    this.id = id;
    return this;
  }

  /**
   * Storage-assigned UUID.
   * @return id
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(@javax.annotation.Nonnull String id) {
    this.id = id;
  }

  public AiAttachment kind(@javax.annotation.Nonnull KindEnum kind) {
    
    this.kind = kind;
    return this;
  }

  /**
   * file | image.
   * @return kind
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_KIND, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public KindEnum getKind() {
    return kind;
  }


  @JsonProperty(value = JSON_PROPERTY_KIND, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKind(@javax.annotation.Nonnull KindEnum kind) {
    this.kind = kind;
  }

  public AiAttachment source(@javax.annotation.Nullable SourceEnum source) {
    
    this.source = source;
    return this;
  }

  /**
   * Origin of the attachment. `user` — uploaded by the user in the composer (the default when unset, for backward compatibility). `tool` — produced by a tool call (e.g. `generate_image`). Lets the integrator's adapter route or apply policies (separate bucket, quotas, TTL, CDN) per source.
   * @return source
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SOURCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SourceEnum getSource() {
    return source;
  }


  @JsonProperty(value = JSON_PROPERTY_SOURCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSource(@javax.annotation.Nullable SourceEnum source) {
    this.source = source;
  }

  public AiAttachment title(@javax.annotation.Nonnull String title) {
    
    this.title = title;
    return this;
  }

  /**
   * Display label (filename or user-visible title).
   * @return title
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_TITLE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(value = JSON_PROPERTY_TITLE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTitle(@javax.annotation.Nonnull String title) {
    this.title = title;
  }

  public AiAttachment content(@javax.annotation.Nullable String content) {
    
    this.content = content;
    return this;
  }

  /**
   * Extracted text for files.
   * @return content
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CONTENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContent() {
    return content;
  }


  @JsonProperty(value = JSON_PROPERTY_CONTENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContent(@javax.annotation.Nullable String content) {
    this.content = content;
  }

  public AiAttachment base64(@javax.annotation.Nullable String base64) {
    
    this.base64 = base64;
    return this;
  }

  /**
   * Base64 data URL for images.
   * @return base64
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_BASE64, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBase64() {
    return base64;
  }


  @JsonProperty(value = JSON_PROPERTY_BASE64, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBase64(@javax.annotation.Nullable String base64) {
    this.base64 = base64;
  }

  public AiAttachment path(@javax.annotation.Nullable String path) {
    
    this.path = path;
    return this;
  }

  /**
   * Original host file path (for files).
   * @return path
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PATH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPath() {
    return path;
  }


  @JsonProperty(value = JSON_PROPERTY_PATH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPath(@javax.annotation.Nullable String path) {
    this.path = path;
  }

  public AiAttachment type(@javax.annotation.Nullable BigDecimal type) {
    
    this.type = type;
    return this;
  }

  /**
   * ONLYOFFICE file type code (for files).
   * @return type
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@javax.annotation.Nullable BigDecimal type) {
    this.type = type;
  }

  public AiAttachment messageId(@javax.annotation.Nullable String messageId) {
    
    this.messageId = messageId;
    return this;
  }

  /**
   * Owning message id once linked. Unset while the attachment is a draft.
   * @return messageId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_MESSAGE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessageId() {
    return messageId;
  }


  @JsonProperty(value = JSON_PROPERTY_MESSAGE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessageId(@javax.annotation.Nullable String messageId) {
    this.messageId = messageId;
  }

  public AiAttachment threadId(@javax.annotation.Nullable String threadId) {
    
    this.threadId = threadId;
    return this;
  }

  /**
   * Owning thread id once linked. Unset while the attachment is a draft.
   * @return threadId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_THREAD_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getThreadId() {
    return threadId;
  }


  @JsonProperty(value = JSON_PROPERTY_THREAD_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreadId(@javax.annotation.Nullable String threadId) {
    this.threadId = threadId;
  }

  public AiAttachment entityId(@javax.annotation.Nullable String entityId) {
    
    this.entityId = entityId;
    return this;
  }

  /**
   * Opaque scope token (entity / room) the attachment was created in. Drafts carry it so an entity switch keeps in-flight composer state isolated; once linked to a message the field is redundant with the thread's own entity binding.
   * @return entityId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ENTITY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEntityId() {
    return entityId;
  }


  @JsonProperty(value = JSON_PROPERTY_ENTITY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityId(@javax.annotation.Nullable String entityId) {
    this.entityId = entityId;
  }

  public AiAttachment createdAt(@javax.annotation.Nonnull BigDecimal createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Storage-assigned creation timestamp.
   * @return createdAt
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_CREATED_AT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(value = JSON_PROPERTY_CREATED_AT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedAt(@javax.annotation.Nonnull BigDecimal createdAt) {
    this.createdAt = createdAt;
  }

  public AiAttachment canAnalyze(@javax.annotation.Nullable Boolean canAnalyze) {
    
    this.canAnalyze = canAnalyze;
    return this;
  }

  /**
   * Whether the attached form can be analyzed.
   * @return canAnalyze
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CAN_ANALYZE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanAnalyze() {
    return canAnalyze;
  }


  @JsonProperty(value = JSON_PROPERTY_CAN_ANALYZE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCanAnalyze(@javax.annotation.Nullable Boolean canAnalyze) {
    this.canAnalyze = canAnalyze;
  }

  public AiAttachment formKeys(@javax.annotation.Nullable List<AiAttachmentFormKeysInner> formKeys) {
    
    this.formKeys = formKeys;
    return this;
  }

  public AiAttachment addFormKeysItem(AiAttachmentFormKeysInner formKeysItem) {
    if (this.formKeys == null) {
      this.formKeys = new ArrayList<>();
    }
    this.formKeys.add(formKeysItem);
    return this;
  }

  /**
   * Keys of the fields inside the form. `key` is the field identifier, `text` its human-readable label.
   * @return formKeys
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_FORM_KEYS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AiAttachmentFormKeysInner> getFormKeys() {
    return formKeys;
  }


  @JsonProperty(value = JSON_PROPERTY_FORM_KEYS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormKeys(@javax.annotation.Nullable List<AiAttachmentFormKeysInner> formKeys) {
    this.formKeys = formKeys;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiAttachment aiAttachment = (AiAttachment) o;
    return Objects.equals(this.id, aiAttachment.id) &&
        Objects.equals(this.kind, aiAttachment.kind) &&
        Objects.equals(this.source, aiAttachment.source) &&
        Objects.equals(this.title, aiAttachment.title) &&
        Objects.equals(this.content, aiAttachment.content) &&
        Objects.equals(this.base64, aiAttachment.base64) &&
        Objects.equals(this.path, aiAttachment.path) &&
        Objects.equals(this.type, aiAttachment.type) &&
        Objects.equals(this.messageId, aiAttachment.messageId) &&
        Objects.equals(this.threadId, aiAttachment.threadId) &&
        Objects.equals(this.entityId, aiAttachment.entityId) &&
        Objects.equals(this.createdAt, aiAttachment.createdAt) &&
        Objects.equals(this.canAnalyze, aiAttachment.canAnalyze) &&
        Objects.equals(this.formKeys, aiAttachment.formKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, kind, source, title, content, base64, path, type, messageId, threadId, entityId, createdAt, canAnalyze, formKeys);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiAttachment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    base64: ").append(toIndentedString(base64)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    canAnalyze: ").append(toIndentedString(canAnalyze)).append("\n");
    sb.append("    formKeys: ").append(toIndentedString(formKeys)).append("\n");
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

    // add `kind` to the URL query string
    if (getKind() != null) {
      try {
        joiner.add(String.format("%skind%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getKind()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `source` to the URL query string
    if (getSource() != null) {
      try {
        joiner.add(String.format("%ssource%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSource()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `content` to the URL query string
    if (getContent() != null) {
      try {
        joiner.add(String.format("%scontent%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getContent()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `base64` to the URL query string
    if (getBase64() != null) {
      try {
        joiner.add(String.format("%sbase64%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBase64()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `path` to the URL query string
    if (getPath() != null) {
      try {
        joiner.add(String.format("%spath%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPath()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `messageId` to the URL query string
    if (getMessageId() != null) {
      try {
        joiner.add(String.format("%smessageId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMessageId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `threadId` to the URL query string
    if (getThreadId() != null) {
      try {
        joiner.add(String.format("%sthreadId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getThreadId()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `createdAt` to the URL query string
    if (getCreatedAt() != null) {
      try {
        joiner.add(String.format("%screatedAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedAt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `canAnalyze` to the URL query string
    if (getCanAnalyze() != null) {
      try {
        joiner.add(String.format("%scanAnalyze%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCanAnalyze()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `formKeys` to the URL query string
    if (getFormKeys() != null) {
      for (int i = 0; i < getFormKeys().size(); i++) {
        if (getFormKeys().get(i) != null) {
          joiner.add(getFormKeys().get(i).toUrlQueryString(String.format("%sformKeys%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

