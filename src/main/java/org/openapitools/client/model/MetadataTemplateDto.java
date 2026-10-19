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
import org.openapitools.client.model.ApiDateTime;
import org.openapitools.client.model.EmployeeDto;
import org.openapitools.client.model.MetadataFieldDto;
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
 * The metadata template information.
 */
@JsonPropertyOrder({
  MetadataTemplateDto.JSON_PROPERTY_ID,
  MetadataTemplateDto.JSON_PROPERTY_NAME,
  MetadataTemplateDto.JSON_PROPERTY_VISIBLE,
  MetadataTemplateDto.JSON_PROPERTY_CREATE_BY,
  MetadataTemplateDto.JSON_PROPERTY_CREATE_ON,
  MetadataTemplateDto.JSON_PROPERTY_MODIFIED_BY,
  MetadataTemplateDto.JSON_PROPERTY_MODIFIED_ON,
  MetadataTemplateDto.JSON_PROPERTY_FIELDS
})

public class MetadataTemplateDto {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable  private Integer id;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_VISIBLE = "visible";
  @javax.annotation.Nullable  private Boolean visible;

  public static final String JSON_PROPERTY_CREATE_BY = "createBy";
  @javax.annotation.Nullable  private EmployeeDto createBy;

  public static final String JSON_PROPERTY_CREATE_ON = "createOn";
  @javax.annotation.Nullable  private ApiDateTime createOn;

  public static final String JSON_PROPERTY_MODIFIED_BY = "modifiedBy";
  @javax.annotation.Nullable  private EmployeeDto modifiedBy;

  public static final String JSON_PROPERTY_MODIFIED_ON = "modifiedOn";
  @javax.annotation.Nullable  private ApiDateTime modifiedOn;

  public static final String JSON_PROPERTY_FIELDS = "fields";
  @javax.annotation.Nullable  private JsonNullable<List<MetadataFieldDto>> fields = JsonNullable.<List<MetadataFieldDto>>undefined();

  public MetadataTemplateDto() {
  }


  public MetadataTemplateDto id(@javax.annotation.Nullable Integer id) {
    
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

  public MetadataTemplateDto name(@javax.annotation.Nullable String name) {
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

  public MetadataTemplateDto visible(@javax.annotation.Nullable Boolean visible) {
    
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

  public MetadataTemplateDto createBy(@javax.annotation.Nullable EmployeeDto createBy) {
    
    this.createBy = createBy;
    return this;
  }

  /**
   * The user who created the template. A user who has since left the portal comes back as the lost user placeholder.
   * @return createBy
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CREATE_BY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EmployeeDto getCreateBy() {
    return createBy;
  }


  @JsonProperty(value = JSON_PROPERTY_CREATE_BY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateBy(@javax.annotation.Nullable EmployeeDto createBy) {
    this.createBy = createBy;
  }

  public MetadataTemplateDto createOn(@javax.annotation.Nullable ApiDateTime createOn) {
    
    this.createOn = createOn;
    return this;
  }

  /**
   * The template creation date.
   * @return createOn
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CREATE_ON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDateTime getCreateOn() {
    return createOn;
  }


  @JsonProperty(value = JSON_PROPERTY_CREATE_ON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateOn(@javax.annotation.Nullable ApiDateTime createOn) {
    this.createOn = createOn;
  }

  public MetadataTemplateDto modifiedBy(@javax.annotation.Nullable EmployeeDto modifiedBy) {
    
    this.modifiedBy = modifiedBy;
    return this;
  }

  /**
   * The user who changed the template itself last: its name or its visibility. The creator until somebody changes  it; a change of a field is recorded on the field, not here.
   * @return modifiedBy
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_MODIFIED_BY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EmployeeDto getModifiedBy() {
    return modifiedBy;
  }


  @JsonProperty(value = JSON_PROPERTY_MODIFIED_BY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModifiedBy(@javax.annotation.Nullable EmployeeDto modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public MetadataTemplateDto modifiedOn(@javax.annotation.Nullable ApiDateTime modifiedOn) {
    
    this.modifiedOn = modifiedOn;
    return this;
  }

  /**
   * The date when the template was modified last.
   * @return modifiedOn
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_MODIFIED_ON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDateTime getModifiedOn() {
    return modifiedOn;
  }


  @JsonProperty(value = JSON_PROPERTY_MODIFIED_ON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModifiedOn(@javax.annotation.Nullable ApiDateTime modifiedOn) {
    this.modifiedOn = modifiedOn;
  }

  public MetadataTemplateDto fields(@javax.annotation.Nullable List<MetadataFieldDto> fields) {
    this.fields = JsonNullable.<List<MetadataFieldDto>>of(fields);
    
    return this;
  }

  public MetadataTemplateDto addFieldsItem(MetadataFieldDto fieldsItem) {
    if (this.fields == null || !this.fields.isPresent()) {
      this.fields = JsonNullable.<List<MetadataFieldDto>>of(new ArrayList<>());
    }
    try {
      this.fields.get().add(fieldsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The template metadata fields.
   * @return fields
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<MetadataFieldDto> getFields() {
        return fields.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_FIELDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<MetadataFieldDto>> getFields_JsonNullable() {
    return fields;
  }
  
  @JsonProperty(JSON_PROPERTY_FIELDS)
  public void setFields_JsonNullable(JsonNullable<List<MetadataFieldDto>> fields) {
    this.fields = fields;
  }

  public void setFields(@javax.annotation.Nullable List<MetadataFieldDto> fields) {
    this.fields = JsonNullable.<List<MetadataFieldDto>>of(fields);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetadataTemplateDto metadataTemplateDto = (MetadataTemplateDto) o;
    return Objects.equals(this.id, metadataTemplateDto.id) &&
        equalsNullable(this.name, metadataTemplateDto.name) &&
        Objects.equals(this.visible, metadataTemplateDto.visible) &&
        Objects.equals(this.createBy, metadataTemplateDto.createBy) &&
        Objects.equals(this.createOn, metadataTemplateDto.createOn) &&
        Objects.equals(this.modifiedBy, metadataTemplateDto.modifiedBy) &&
        Objects.equals(this.modifiedOn, metadataTemplateDto.modifiedOn) &&
        equalsNullable(this.fields, metadataTemplateDto.fields);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(name), visible, createBy, createOn, modifiedBy, modifiedOn, hashCodeNullable(fields));
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
    sb.append("class MetadataTemplateDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
    sb.append("    createOn: ").append(toIndentedString(createOn)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
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

    // add `createBy` to the URL query string
    if (getCreateBy() != null) {
      joiner.add(getCreateBy().toUrlQueryString(prefix + "createBy" + suffix));
    }

    // add `createOn` to the URL query string
    if (getCreateOn() != null) {
      joiner.add(getCreateOn().toUrlQueryString(prefix + "createOn" + suffix));
    }

    // add `modifiedBy` to the URL query string
    if (getModifiedBy() != null) {
      joiner.add(getModifiedBy().toUrlQueryString(prefix + "modifiedBy" + suffix));
    }

    // add `modifiedOn` to the URL query string
    if (getModifiedOn() != null) {
      joiner.add(getModifiedOn().toUrlQueryString(prefix + "modifiedOn" + suffix));
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

