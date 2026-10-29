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
import org.openapitools.client.model.AiMetaFill200ResponseFilledInnerValue;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * AiMetaFill200ResponseFilledInner
 */
@JsonPropertyOrder({
  AiMetaFill200ResponseFilledInner.JSON_PROPERTY_FIELD_ID,
  AiMetaFill200ResponseFilledInner.JSON_PROPERTY_NAME,
  AiMetaFill200ResponseFilledInner.JSON_PROPERTY_VALUE
})
@JsonTypeName("aiMetaFill_200_response_filled_inner")

public class AiMetaFill200ResponseFilledInner {
  public static final String JSON_PROPERTY_FIELD_ID = "fieldId";
  @javax.annotation.Nullable  private BigDecimal fieldId;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull  private String name;

  public static final String JSON_PROPERTY_VALUE = "value";
  @javax.annotation.Nonnull  private AiMetaFill200ResponseFilledInnerValue value;

  public AiMetaFill200ResponseFilledInner() {
  }


  public AiMetaFill200ResponseFilledInner fieldId(@javax.annotation.Nullable BigDecimal fieldId) {
    
    this.fieldId = fieldId;
    return this;
  }

  /**
   * Absent for a custom field.
   * @return fieldId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_FIELD_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getFieldId() {
    return fieldId;
  }


  @JsonProperty(value = JSON_PROPERTY_FIELD_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFieldId(@javax.annotation.Nullable BigDecimal fieldId) {
    this.fieldId = fieldId;
  }

  public AiMetaFill200ResponseFilledInner name(@javax.annotation.Nonnull String name) {
    
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

  public AiMetaFill200ResponseFilledInner value(@javax.annotation.Nonnull AiMetaFill200ResponseFilledInnerValue value) {
    
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_VALUE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AiMetaFill200ResponseFilledInnerValue getValue() {
    return value;
  }


  @JsonProperty(value = JSON_PROPERTY_VALUE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValue(@javax.annotation.Nonnull AiMetaFill200ResponseFilledInnerValue value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiMetaFill200ResponseFilledInner aiMetaFill200ResponseFilledInner = (AiMetaFill200ResponseFilledInner) o;
    return Objects.equals(this.fieldId, aiMetaFill200ResponseFilledInner.fieldId) &&
        Objects.equals(this.name, aiMetaFill200ResponseFilledInner.name) &&
        Objects.equals(this.value, aiMetaFill200ResponseFilledInner.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldId, name, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiMetaFill200ResponseFilledInner {\n");
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

    // add `fieldId` to the URL query string
    if (getFieldId() != null) {
      try {
        joiner.add(String.format("%sfieldId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFieldId()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `value` to the URL query string
    if (getValue() != null) {
      joiner.add(getValue().toUrlQueryString(prefix + "value" + suffix));
    }

    return joiner.toString();
  }

}

