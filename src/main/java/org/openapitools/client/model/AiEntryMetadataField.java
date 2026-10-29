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
import org.openapitools.client.model.AiEntryMetadataFieldOptionsInner;
import org.openapitools.client.model.AiMetadataValue;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * AiEntryMetadataField
 */
@JsonPropertyOrder({
  AiEntryMetadataField.JSON_PROPERTY_ID,
  AiEntryMetadataField.JSON_PROPERTY_NAME,
  AiEntryMetadataField.JSON_PROPERTY_TYPE,
  AiEntryMetadataField.JSON_PROPERTY_OPTIONS,
  AiEntryMetadataField.JSON_PROPERTY_VALUE
})

public class AiEntryMetadataField {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nonnull  private BigDecimal id;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nonnull  private BigDecimal type;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  @javax.annotation.Nonnull  private List<AiEntryMetadataFieldOptionsInner> options = new ArrayList<>();

  public static final String JSON_PROPERTY_VALUE = "value";
  @javax.annotation.Nullable  private AiMetadataValue value;

  public AiEntryMetadataField() {
  }


  public AiEntryMetadataField id(@javax.annotation.Nonnull BigDecimal id) {
    
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

  public AiEntryMetadataField name(@javax.annotation.Nonnull String name) {
    
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

  public AiEntryMetadataField type(@javax.annotation.Nonnull BigDecimal type) {
    
    this.type = type;
    return this;
  }

  /**
   * `MetadataFieldType`: 0 String, 1 Date, 2 Number, 3 SingleChoice, 4 MultiChoice.
   * @return type
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(@javax.annotation.Nonnull BigDecimal type) {
    this.type = type;
  }

  public AiEntryMetadataField options(@javax.annotation.Nonnull List<AiEntryMetadataFieldOptionsInner> options) {
    
    this.options = options;
    return this;
  }

  public AiEntryMetadataField addOptionsItem(AiEntryMetadataFieldOptionsInner optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

  /**
   * Get options
   * @return options
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_OPTIONS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<AiEntryMetadataFieldOptionsInner> getOptions() {
    return options;
  }


  @JsonProperty(value = JSON_PROPERTY_OPTIONS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOptions(@javax.annotation.Nonnull List<AiEntryMetadataFieldOptionsInner> options) {
    this.options = options;
  }

  public AiEntryMetadataField value(@javax.annotation.Nullable AiMetadataValue value) {
    
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AiMetadataValue getValue() {
    return value;
  }


  @JsonProperty(value = JSON_PROPERTY_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(@javax.annotation.Nullable AiMetadataValue value) {
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
    AiEntryMetadataField aiEntryMetadataField = (AiEntryMetadataField) o;
    return Objects.equals(this.id, aiEntryMetadataField.id) &&
        Objects.equals(this.name, aiEntryMetadataField.name) &&
        Objects.equals(this.type, aiEntryMetadataField.type) &&
        Objects.equals(this.options, aiEntryMetadataField.options) &&
        Objects.equals(this.value, aiEntryMetadataField.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, options, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiEntryMetadataField {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

    // add `type` to the URL query string
    if (getType() != null) {
      try {
        joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `options` to the URL query string
    if (getOptions() != null) {
      for (int i = 0; i < getOptions().size(); i++) {
        if (getOptions().get(i) != null) {
          joiner.add(getOptions().get(i).toUrlQueryString(String.format("%soptions%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `value` to the URL query string
    if (getValue() != null) {
      joiner.add(getValue().toUrlQueryString(prefix + "value" + suffix));
    }

    return joiner.toString();
  }

}

