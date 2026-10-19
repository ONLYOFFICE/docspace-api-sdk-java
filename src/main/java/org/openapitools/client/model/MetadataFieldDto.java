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
import org.openapitools.client.model.MetadataFieldOptionDto;
import org.openapitools.client.model.MetadataFieldType;
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
 * The metadata field information.
 */
@JsonPropertyOrder({
  MetadataFieldDto.JSON_PROPERTY_ID,
  MetadataFieldDto.JSON_PROPERTY_TEMPLATE_ID,
  MetadataFieldDto.JSON_PROPERTY_NAME,
  MetadataFieldDto.JSON_PROPERTY_TYPE,
  MetadataFieldDto.JSON_PROPERTY_OPTIONS,
  MetadataFieldDto.JSON_PROPERTY_ORDER
})

public class MetadataFieldDto {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable  private Integer id;

  public static final String JSON_PROPERTY_TEMPLATE_ID = "templateId";
  @javax.annotation.Nullable  private Integer templateId;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable  private MetadataFieldType type;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  @javax.annotation.Nullable  private JsonNullable<List<MetadataFieldOptionDto>> options = JsonNullable.<List<MetadataFieldOptionDto>>undefined();

  public static final String JSON_PROPERTY_ORDER = "order";
  @javax.annotation.Nullable  private Integer order;

  public MetadataFieldDto() {
  }


  public MetadataFieldDto id(@javax.annotation.Nullable Integer id) {
    
    this.id = id;
    return this;
  }

  /**
   * The field ID.
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

  public MetadataFieldDto templateId(@javax.annotation.Nullable Integer templateId) {
    
    this.templateId = templateId;
    return this;
  }

  /**
   * The ID of the template the field belongs to.
   * @return templateId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TEMPLATE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTemplateId() {
    return templateId;
  }


  @JsonProperty(value = JSON_PROPERTY_TEMPLATE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTemplateId(@javax.annotation.Nullable Integer templateId) {
    this.templateId = templateId;
  }

  public MetadataFieldDto name(@javax.annotation.Nullable String name) {
    this.name = JsonNullable.<String>of(name);
    
    return this;
  }

  /**
   * The field name.
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

  public MetadataFieldDto type(@javax.annotation.Nullable MetadataFieldType type) {
    
    this.type = type;
    return this;
  }

  /**
   * The field type.
   * @return type
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MetadataFieldType getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@javax.annotation.Nullable MetadataFieldType type) {
    this.type = type;
  }

  public MetadataFieldDto options(@javax.annotation.Nullable List<MetadataFieldOptionDto> options) {
    this.options = JsonNullable.<List<MetadataFieldOptionDto>>of(options);
    
    return this;
  }

  public MetadataFieldDto addOptionsItem(MetadataFieldOptionDto optionsItem) {
    if (this.options == null || !this.options.isPresent()) {
      this.options = JsonNullable.<List<MetadataFieldOptionDto>>of(new ArrayList<>());
    }
    try {
      this.options.get().add(optionsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The choice options of the field.
   * @return options
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<MetadataFieldOptionDto> getOptions() {
        return options.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_OPTIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<MetadataFieldOptionDto>> getOptions_JsonNullable() {
    return options;
  }
  
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  public void setOptions_JsonNullable(JsonNullable<List<MetadataFieldOptionDto>> options) {
    this.options = options;
  }

  public void setOptions(@javax.annotation.Nullable List<MetadataFieldOptionDto> options) {
    this.options = JsonNullable.<List<MetadataFieldOptionDto>>of(options);
  }

  public MetadataFieldDto order(@javax.annotation.Nullable Integer order) {
    
    this.order = order;
    return this;
  }

  /**
   * The field display order inside the template.
   * @return order
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ORDER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOrder() {
    return order;
  }


  @JsonProperty(value = JSON_PROPERTY_ORDER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrder(@javax.annotation.Nullable Integer order) {
    this.order = order;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetadataFieldDto metadataFieldDto = (MetadataFieldDto) o;
    return Objects.equals(this.id, metadataFieldDto.id) &&
        Objects.equals(this.templateId, metadataFieldDto.templateId) &&
        equalsNullable(this.name, metadataFieldDto.name) &&
        Objects.equals(this.type, metadataFieldDto.type) &&
        equalsNullable(this.options, metadataFieldDto.options) &&
        Objects.equals(this.order, metadataFieldDto.order);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, templateId, hashCodeNullable(name), type, hashCodeNullable(options), order);
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
    sb.append("class MetadataFieldDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

    // add `templateId` to the URL query string
    if (getTemplateId() != null) {
      try {
        joiner.add(String.format("%stemplateId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTemplateId()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `order` to the URL query string
    if (getOrder() != null) {
      try {
        joiner.add(String.format("%sorder%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOrder()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

