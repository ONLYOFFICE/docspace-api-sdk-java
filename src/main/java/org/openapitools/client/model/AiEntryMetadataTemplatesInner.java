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
import org.openapitools.client.model.AiEntryMetadataField;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * AiEntryMetadataTemplatesInner
 */
@JsonPropertyOrder({
  AiEntryMetadataTemplatesInner.JSON_PROPERTY_ID,
  AiEntryMetadataTemplatesInner.JSON_PROPERTY_NAME,
  AiEntryMetadataTemplatesInner.JSON_PROPERTY_VISIBLE,
  AiEntryMetadataTemplatesInner.JSON_PROPERTY_FIELDS
})
@JsonTypeName("AiEntryMetadata_templates_inner")

public class AiEntryMetadataTemplatesInner {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nonnull  private BigDecimal id;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull  private String name;

  public static final String JSON_PROPERTY_VISIBLE = "visible";
  @javax.annotation.Nonnull  private Boolean visible;

  public static final String JSON_PROPERTY_FIELDS = "fields";
  @javax.annotation.Nonnull  private List<AiEntryMetadataField> fields = new ArrayList<>();

  public AiEntryMetadataTemplatesInner() {
  }


  public AiEntryMetadataTemplatesInner id(@javax.annotation.Nonnull BigDecimal id) {
    
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(@javax.annotation.Nonnull BigDecimal id) {
    this.id = id;
  }

  public AiEntryMetadataTemplatesInner name(@javax.annotation.Nonnull String name) {
    
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(value = JSON_PROPERTY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }

  public AiEntryMetadataTemplatesInner visible(@javax.annotation.Nonnull Boolean visible) {
    
    this.visible = visible;
    return this;
  }

  /**
   * Get visible
   * @return visible
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_VISIBLE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getVisible() {
    return visible;
  }


  @JsonProperty(value = JSON_PROPERTY_VISIBLE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVisible(@javax.annotation.Nonnull Boolean visible) {
    this.visible = visible;
  }

  public AiEntryMetadataTemplatesInner fields(@javax.annotation.Nonnull List<AiEntryMetadataField> fields) {
    
    this.fields = fields;
    return this;
  }

  public AiEntryMetadataTemplatesInner addFieldsItem(AiEntryMetadataField fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

  /**
   * Get fields
   * @return fields
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_FIELDS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<AiEntryMetadataField> getFields() {
    return fields;
  }


  @JsonProperty(value = JSON_PROPERTY_FIELDS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFields(@javax.annotation.Nonnull List<AiEntryMetadataField> fields) {
    this.fields = fields;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiEntryMetadataTemplatesInner aiEntryMetadataTemplatesInner = (AiEntryMetadataTemplatesInner) o;
    return Objects.equals(this.id, aiEntryMetadataTemplatesInner.id) &&
        Objects.equals(this.name, aiEntryMetadataTemplatesInner.name) &&
        Objects.equals(this.visible, aiEntryMetadataTemplatesInner.visible) &&
        Objects.equals(this.fields, aiEntryMetadataTemplatesInner.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, visible, fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiEntryMetadataTemplatesInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `visible` to the URL query string
    if (getVisible() != null) {
      try {
        joiner.add(String.format("%svisible%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVisible()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `fields` to the URL query string
    if (getFields() != null) {
      for (int i = 0; i < getFields().size(); i++) {
        if (getFields().get(i) != null) {
          joiner.add(getFields().get(i).toUrlQueryString(String.format("%sfields%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

