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
import org.openapitools.client.model.AiEntryMetadataCustomFieldsInner;
import org.openapitools.client.model.AiEntryMetadataTemplatesInner;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * AiEntryMetadata
 */
@JsonPropertyOrder({
  AiEntryMetadata.JSON_PROPERTY_TEMPLATES,
  AiEntryMetadata.JSON_PROPERTY_CUSTOM_FIELDS
})

public class AiEntryMetadata {
  public static final String JSON_PROPERTY_TEMPLATES = "templates";
  @javax.annotation.Nonnull  private List<AiEntryMetadataTemplatesInner> templates = new ArrayList<>();

  public static final String JSON_PROPERTY_CUSTOM_FIELDS = "customFields";
  @javax.annotation.Nonnull  private List<AiEntryMetadataCustomFieldsInner> customFields = new ArrayList<>();

  public AiEntryMetadata() {
  }


  public AiEntryMetadata templates(@javax.annotation.Nonnull List<AiEntryMetadataTemplatesInner> templates) {
    
    this.templates = templates;
    return this;
  }

  public AiEntryMetadata addTemplatesItem(AiEntryMetadataTemplatesInner templatesItem) {
    if (this.templates == null) {
      this.templates = new ArrayList<>();
    }
    this.templates.add(templatesItem);
    return this;
  }

  /**
   * Get templates
   * @return templates
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_TEMPLATES, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<AiEntryMetadataTemplatesInner> getTemplates() {
    return templates;
  }


  @JsonProperty(value = JSON_PROPERTY_TEMPLATES, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTemplates(@javax.annotation.Nonnull List<AiEntryMetadataTemplatesInner> templates) {
    this.templates = templates;
  }

  public AiEntryMetadata customFields(@javax.annotation.Nonnull List<AiEntryMetadataCustomFieldsInner> customFields) {
    
    this.customFields = customFields;
    return this;
  }

  public AiEntryMetadata addCustomFieldsItem(AiEntryMetadataCustomFieldsInner customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new ArrayList<>();
    }
    this.customFields.add(customFieldsItem);
    return this;
  }

  /**
   * Get customFields
   * @return customFields
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_CUSTOM_FIELDS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<AiEntryMetadataCustomFieldsInner> getCustomFields() {
    return customFields;
  }


  @JsonProperty(value = JSON_PROPERTY_CUSTOM_FIELDS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCustomFields(@javax.annotation.Nonnull List<AiEntryMetadataCustomFieldsInner> customFields) {
    this.customFields = customFields;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiEntryMetadata aiEntryMetadata = (AiEntryMetadata) o;
    return Objects.equals(this.templates, aiEntryMetadata.templates) &&
        Objects.equals(this.customFields, aiEntryMetadata.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templates, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiEntryMetadata {\n");
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

