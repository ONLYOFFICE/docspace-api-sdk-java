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
import org.openapitools.client.model.EntryFieldDto;
import org.openapitools.client.model.MetadataConflictResolveType;
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
 * A metadata template assigned to an entry: the template with every field of it, each field carrying its value on the entry.
 */
@JsonPropertyOrder({
  EntryTemplateDto.JSON_PROPERTY_ID,
  EntryTemplateDto.JSON_PROPERTY_NAME,
  EntryTemplateDto.JSON_PROPERTY_VISIBLE,
  EntryTemplateDto.JSON_PROPERTY_CASCADE,
  EntryTemplateDto.JSON_PROPERTY_CONFLICT_RESOLVE_TYPE,
  EntryTemplateDto.JSON_PROPERTY_FIELDS
})

public class EntryTemplateDto {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable  private Integer id;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_VISIBLE = "visible";
  @javax.annotation.Nullable  private Boolean visible;

  public static final String JSON_PROPERTY_CASCADE = "cascade";
  @javax.annotation.Nullable  private Boolean cascade;

  public static final String JSON_PROPERTY_CONFLICT_RESOLVE_TYPE = "conflictResolveType";
  @javax.annotation.Nullable  private MetadataConflictResolveType conflictResolveType;

  public static final String JSON_PROPERTY_FIELDS = "fields";
  @javax.annotation.Nullable  private JsonNullable<List<EntryFieldDto>> fields = JsonNullable.<List<EntryFieldDto>>undefined();

  public EntryTemplateDto() {
  }


  public EntryTemplateDto id(@javax.annotation.Nullable Integer id) {
    
    this.id = id;
    return this;
  }

  /**
   * The template ID.
   * @return id
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable Integer id) {
    this.id = id;
  }

  public EntryTemplateDto name(@javax.annotation.Nullable String name) {
    this.name = JsonNullable.<String>of(name);
    
    return this;
  }

  /**
   * The template name.
   * @return name
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = JsonNullable.<String>of(name);
  }

  public EntryTemplateDto visible(@javax.annotation.Nullable Boolean visible) {
    
    this.visible = visible;
    return this;
  }

  /**
   * Specifies if the template is visible in the UI pickers.
   * @return visible
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_VISIBLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getVisible() {
    return visible;
  }


  @JsonProperty(value = JSON_PROPERTY_VISIBLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisible(@javax.annotation.Nullable Boolean visible) {
    this.visible = visible;
  }

  public EntryTemplateDto cascade(@javax.annotation.Nullable Boolean cascade) {
    
    this.cascade = cascade;
    return this;
  }

  /**
   * Whether the template cascades from this entry to the folders and files below it. Only a folder or a room can  cascade; on a file the value is always false.
   * @return cascade
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CASCADE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCascade() {
    return cascade;
  }


  @JsonProperty(value = JSON_PROPERTY_CASCADE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCascade(@javax.annotation.Nullable Boolean cascade) {
    this.cascade = cascade;
  }

  public EntryTemplateDto conflictResolveType(@javax.annotation.Nullable MetadataConflictResolveType conflictResolveType) {
    
    this.conflictResolveType = conflictResolveType;
    return this;
  }

  /**
   * How the cascade of this entry treats a value an entry below already holds. Null while the template does not  cascade from this entry.
   * @return conflictResolveType
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CONFLICT_RESOLVE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MetadataConflictResolveType getConflictResolveType() {
    return conflictResolveType;
  }


  @JsonProperty(value = JSON_PROPERTY_CONFLICT_RESOLVE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConflictResolveType(@javax.annotation.Nullable MetadataConflictResolveType conflictResolveType) {
    this.conflictResolveType = conflictResolveType;
  }

  public EntryTemplateDto fields(@javax.annotation.Nullable List<EntryFieldDto> fields) {
    this.fields = JsonNullable.<List<EntryFieldDto>>of(fields);
    
    return this;
  }

  public EntryTemplateDto addFieldsItem(EntryFieldDto fieldsItem) {
    if (this.fields == null || !this.fields.isPresent()) {
      this.fields = JsonNullable.<List<EntryFieldDto>>of(new ArrayList<>());
    }
    try {
      this.fields.get().add(fieldsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The template fields with their values on the entry.
   * @return fields
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<EntryFieldDto> getFields() {
        return fields.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_FIELDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<EntryFieldDto>> getFields_JsonNullable() {
    return fields;
  }
  
  @JsonProperty(JSON_PROPERTY_FIELDS)
  public void setFields_JsonNullable(JsonNullable<List<EntryFieldDto>> fields) {
    this.fields = fields;
  }

  public void setFields(@javax.annotation.Nullable List<EntryFieldDto> fields) {
    this.fields = JsonNullable.<List<EntryFieldDto>>of(fields);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntryTemplateDto entryTemplateDto = (EntryTemplateDto) o;
    return Objects.equals(this.id, entryTemplateDto.id) &&
        equalsNullable(this.name, entryTemplateDto.name) &&
        Objects.equals(this.visible, entryTemplateDto.visible) &&
        Objects.equals(this.cascade, entryTemplateDto.cascade) &&
        Objects.equals(this.conflictResolveType, entryTemplateDto.conflictResolveType) &&
        equalsNullable(this.fields, entryTemplateDto.fields);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(name), visible, cascade, conflictResolveType, hashCodeNullable(fields));
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
    sb.append("class EntryTemplateDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    cascade: ").append(toIndentedString(cascade)).append("\n");
    sb.append("    conflictResolveType: ").append(toIndentedString(conflictResolveType)).append("\n");
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

    // add `cascade` to the URL query string
    if (getCascade() != null) {
      try {
        joiner.add(String.format("%scascade%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCascade()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `conflictResolveType` to the URL query string
    if (getConflictResolveType() != null) {
      try {
        joiner.add(String.format("%sconflictResolveType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConflictResolveType()), "UTF-8").replaceAll("\\+", "%20")));
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

