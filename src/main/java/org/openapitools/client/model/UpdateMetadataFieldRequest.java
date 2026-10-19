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
import org.openapitools.client.model.MetadataFieldOptionRequest;
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
 * The parameters of a metadata field update. Every property is optional: a property that is omitted keeps its current value.
 */
@JsonPropertyOrder({
  UpdateMetadataFieldRequest.JSON_PROPERTY_NAME,
  UpdateMetadataFieldRequest.JSON_PROPERTY_TYPE,
  UpdateMetadataFieldRequest.JSON_PROPERTY_OPTIONS,
  UpdateMetadataFieldRequest.JSON_PROPERTY_ORDER
})

public class UpdateMetadataFieldRequest {
  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable  private MetadataFieldType type;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  @javax.annotation.Nullable  private JsonNullable<List<MetadataFieldOptionRequest>> options = JsonNullable.<List<MetadataFieldOptionRequest>>undefined();

  public static final String JSON_PROPERTY_ORDER = "order";
  @javax.annotation.Nullable  private JsonNullable<Integer> order = JsonNullable.<Integer>undefined();

  public UpdateMetadataFieldRequest() {
  }


  public UpdateMetadataFieldRequest name(@javax.annotation.Nullable String name) {
    this.name = JsonNullable.<String>of(name);
    
    return this;
  }

  /**
   * The new field name.
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

  public UpdateMetadataFieldRequest type(@javax.annotation.Nullable MetadataFieldType type) {
    
    this.type = type;
    return this;
  }

  /**
   * The new field type. The type can be changed only while the field has no values.
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

  public UpdateMetadataFieldRequest options(@javax.annotation.Nullable List<MetadataFieldOptionRequest> options) {
    this.options = JsonNullable.<List<MetadataFieldOptionRequest>>of(options);
    
    return this;
  }

  public UpdateMetadataFieldRequest addOptionsItem(MetadataFieldOptionRequest optionsItem) {
    if (this.options == null || !this.options.isPresent()) {
      this.options = JsonNullable.<List<MetadataFieldOptionRequest>>of(new ArrayList<>());
    }
    try {
      this.options.get().add(optionsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The new choice options of the field. The options in use cannot be removed.
   * @return options
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<MetadataFieldOptionRequest> getOptions() {
        return options.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_OPTIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<MetadataFieldOptionRequest>> getOptions_JsonNullable() {
    return options;
  }
  
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  public void setOptions_JsonNullable(JsonNullable<List<MetadataFieldOptionRequest>> options) {
    this.options = options;
  }

  public void setOptions(@javax.annotation.Nullable List<MetadataFieldOptionRequest> options) {
    this.options = JsonNullable.<List<MetadataFieldOptionRequest>>of(options);
  }

  public UpdateMetadataFieldRequest order(@javax.annotation.Nullable Integer order) {
    this.order = JsonNullable.<Integer>of(order);
    
    return this;
  }

  /**
   * The new display position of the field inside the template: the fields are shown by it ascending.
   * @return order
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Integer getOrder() {
        return order.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ORDER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Integer> getOrder_JsonNullable() {
    return order;
  }
  
  @JsonProperty(JSON_PROPERTY_ORDER)
  public void setOrder_JsonNullable(JsonNullable<Integer> order) {
    this.order = order;
  }

  public void setOrder(@javax.annotation.Nullable Integer order) {
    this.order = JsonNullable.<Integer>of(order);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateMetadataFieldRequest updateMetadataFieldRequest = (UpdateMetadataFieldRequest) o;
    return equalsNullable(this.name, updateMetadataFieldRequest.name) &&
        Objects.equals(this.type, updateMetadataFieldRequest.type) &&
        equalsNullable(this.options, updateMetadataFieldRequest.options) &&
        equalsNullable(this.order, updateMetadataFieldRequest.order);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(name), type, hashCodeNullable(options), hashCodeNullable(order));
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
    sb.append("class UpdateMetadataFieldRequest {\n");
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

