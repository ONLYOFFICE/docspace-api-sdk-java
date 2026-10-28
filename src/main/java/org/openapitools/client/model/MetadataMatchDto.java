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
 * Where a text search met the metadata of a file, a folder or a room: one string value that holds the searched text,  with the field it belongs to.
 */
@JsonPropertyOrder({
  MetadataMatchDto.JSON_PROPERTY_TEMPLATE_ID,
  MetadataMatchDto.JSON_PROPERTY_FIELD_ID,
  MetadataMatchDto.JSON_PROPERTY_FIELD_NAME,
  MetadataMatchDto.JSON_PROPERTY_VALUE
})

public class MetadataMatchDto {
  public static final String JSON_PROPERTY_TEMPLATE_ID = "templateId";
  @javax.annotation.Nullable  private JsonNullable<Integer> templateId = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_FIELD_ID = "fieldId";
  @javax.annotation.Nullable  private JsonNullable<Integer> fieldId = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_FIELD_NAME = "fieldName";
  @javax.annotation.Nullable  private JsonNullable<String> fieldName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_VALUE = "value";
  @javax.annotation.Nullable  private JsonNullable<String> value = JsonNullable.<String>undefined();

  public MetadataMatchDto() {
  }


  public MetadataMatchDto templateId(@javax.annotation.Nullable Integer templateId) {
    this.templateId = JsonNullable.<Integer>of(templateId);
    
    return this;
  }

  /**
   * The ID of the metadata template the matching field belongs to. Null for a custom field, which belongs to no  template the API shows.
   * @return templateId
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Integer getTemplateId() {
        return templateId.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_TEMPLATE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Integer> getTemplateId_JsonNullable() {
    return templateId;
  }
  
  @JsonProperty(JSON_PROPERTY_TEMPLATE_ID)
  public void setTemplateId_JsonNullable(JsonNullable<Integer> templateId) {
    this.templateId = templateId;
  }

  public void setTemplateId(@javax.annotation.Nullable Integer templateId) {
    this.templateId = JsonNullable.<Integer>of(templateId);
  }

  public MetadataMatchDto fieldId(@javax.annotation.Nullable Integer fieldId) {
    this.fieldId = JsonNullable.<Integer>of(fieldId);
    
    return this;
  }

  /**
   * The ID of the matching template field. Null for a custom field, which is addressed by its name alone.
   * @return fieldId
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Integer getFieldId() {
        return fieldId.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_FIELD_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Integer> getFieldId_JsonNullable() {
    return fieldId;
  }
  
  @JsonProperty(JSON_PROPERTY_FIELD_ID)
  public void setFieldId_JsonNullable(JsonNullable<Integer> fieldId) {
    this.fieldId = fieldId;
  }

  public void setFieldId(@javax.annotation.Nullable Integer fieldId) {
    this.fieldId = JsonNullable.<Integer>of(fieldId);
  }

  public MetadataMatchDto fieldName(@javax.annotation.Nullable String fieldName) {
    this.fieldName = JsonNullable.<String>of(fieldName);
    
    return this;
  }

  /**
   * The name of the matching field: the template field or the custom field as it is shown in the entry metadata.
   * @return fieldName
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getFieldName() {
        return fieldName.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_FIELD_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getFieldName_JsonNullable() {
    return fieldName;
  }
  
  @JsonProperty(JSON_PROPERTY_FIELD_NAME)
  public void setFieldName_JsonNullable(JsonNullable<String> fieldName) {
    this.fieldName = fieldName;
  }

  public void setFieldName(@javax.annotation.Nullable String fieldName) {
    this.fieldName = JsonNullable.<String>of(fieldName);
  }

  public MetadataMatchDto value(@javax.annotation.Nullable String value) {
    this.value = JsonNullable.<String>of(value);
    
    return this;
  }

  /**
   * The stored value that holds the searched text, as it was written, not only the matching part of it.
   * @return value
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getValue() {
        return value.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getValue_JsonNullable() {
    return value;
  }
  
  @JsonProperty(JSON_PROPERTY_VALUE)
  public void setValue_JsonNullable(JsonNullable<String> value) {
    this.value = value;
  }

  public void setValue(@javax.annotation.Nullable String value) {
    this.value = JsonNullable.<String>of(value);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetadataMatchDto metadataMatchDto = (MetadataMatchDto) o;
    return equalsNullable(this.templateId, metadataMatchDto.templateId) &&
        equalsNullable(this.fieldId, metadataMatchDto.fieldId) &&
        equalsNullable(this.fieldName, metadataMatchDto.fieldName) &&
        equalsNullable(this.value, metadataMatchDto.value);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(templateId), hashCodeNullable(fieldId), hashCodeNullable(fieldName), hashCodeNullable(value));
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
    sb.append("class MetadataMatchDto {\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

    // add `templateId` to the URL query string
    if (getTemplateId() != null) {
      try {
        joiner.add(String.format("%stemplateId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTemplateId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `fieldId` to the URL query string
    if (getFieldId() != null) {
      try {
        joiner.add(String.format("%sfieldId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFieldId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `fieldName` to the URL query string
    if (getFieldName() != null) {
      try {
        joiner.add(String.format("%sfieldName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFieldName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `value` to the URL query string
    if (getValue() != null) {
      try {
        joiner.add(String.format("%svalue%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getValue()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

