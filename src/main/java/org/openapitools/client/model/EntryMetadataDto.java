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
import org.openapitools.client.model.CustomFieldValueDto;
import org.openapitools.client.model.EntryTemplateDto;
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
 * The metadata of an entry: the assigned templates with their values, and the custom fields holding a value.
 */
@JsonPropertyOrder({
  EntryMetadataDto.JSON_PROPERTY_TEMPLATES,
  EntryMetadataDto.JSON_PROPERTY_CUSTOM_FIELDS
})

public class EntryMetadataDto {
  public static final String JSON_PROPERTY_TEMPLATES = "templates";
  @javax.annotation.Nullable  private JsonNullable<List<EntryTemplateDto>> templates = JsonNullable.<List<EntryTemplateDto>>undefined();

  public static final String JSON_PROPERTY_CUSTOM_FIELDS = "customFields";
  @javax.annotation.Nullable  private JsonNullable<List<CustomFieldValueDto>> customFields = JsonNullable.<List<CustomFieldValueDto>>undefined();

  public EntryMetadataDto() {
  }


  public EntryMetadataDto templates(@javax.annotation.Nullable List<EntryTemplateDto> templates) {
    this.templates = JsonNullable.<List<EntryTemplateDto>>of(templates);
    
    return this;
  }

  public EntryMetadataDto addTemplatesItem(EntryTemplateDto templatesItem) {
    if (this.templates == null || !this.templates.isPresent()) {
      this.templates = JsonNullable.<List<EntryTemplateDto>>of(new ArrayList<>());
    }
    try {
      this.templates.get().add(templatesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The assigned metadata templates, each field carrying its value on the entry.
   * @return templates
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<EntryTemplateDto> getTemplates() {
        return templates.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_TEMPLATES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<EntryTemplateDto>> getTemplates_JsonNullable() {
    return templates;
  }
  
  @JsonProperty(JSON_PROPERTY_TEMPLATES)
  public void setTemplates_JsonNullable(JsonNullable<List<EntryTemplateDto>> templates) {
    this.templates = templates;
  }

  public void setTemplates(@javax.annotation.Nullable List<EntryTemplateDto> templates) {
    this.templates = JsonNullable.<List<EntryTemplateDto>>of(templates);
  }

  public EntryMetadataDto customFields(@javax.annotation.Nullable List<CustomFieldValueDto> customFields) {
    this.customFields = JsonNullable.<List<CustomFieldValueDto>>of(customFields);
    
    return this;
  }

  public EntryMetadataDto addCustomFieldsItem(CustomFieldValueDto customFieldsItem) {
    if (this.customFields == null || !this.customFields.isPresent()) {
      this.customFields = JsonNullable.<List<CustomFieldValueDto>>of(new ArrayList<>());
    }
    try {
      this.customFields.get().add(customFieldsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The custom fields with their values.
   * @return customFields
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<CustomFieldValueDto> getCustomFields() {
        return customFields.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_CUSTOM_FIELDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<CustomFieldValueDto>> getCustomFields_JsonNullable() {
    return customFields;
  }
  
  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELDS)
  public void setCustomFields_JsonNullable(JsonNullable<List<CustomFieldValueDto>> customFields) {
    this.customFields = customFields;
  }

  public void setCustomFields(@javax.annotation.Nullable List<CustomFieldValueDto> customFields) {
    this.customFields = JsonNullable.<List<CustomFieldValueDto>>of(customFields);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntryMetadataDto entryMetadataDto = (EntryMetadataDto) o;
    return equalsNullable(this.templates, entryMetadataDto.templates) &&
        equalsNullable(this.customFields, entryMetadataDto.customFields);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(templates), hashCodeNullable(customFields));
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
    sb.append("class EntryMetadataDto {\n");
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
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

    // add `templates` to the URL query string
    if (getTemplates() != null) {
      for (int i = 0; i < getTemplates().size(); i++) {
        if (getTemplates().get(i) != null) {
          joiner.add(getTemplates().get(i).toUrlQueryString(String.format("%stemplates%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `customFields` to the URL query string
    if (getCustomFields() != null) {
      for (int i = 0; i < getCustomFields().size(); i++) {
        if (getCustomFields().get(i) != null) {
          joiner.add(getCustomFields().get(i).toUrlQueryString(String.format("%scustomFields%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

