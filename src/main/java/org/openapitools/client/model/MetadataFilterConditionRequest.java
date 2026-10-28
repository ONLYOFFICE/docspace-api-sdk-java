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
import java.util.UUID;
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
 * One metadata filter condition as the clients send it: an element of the metadataFilters JSON of the listings and of  the body of the search endpoints. All conditions are combined with AND.
 */
@JsonPropertyOrder({
  MetadataFilterConditionRequest.JSON_PROPERTY_FIELD_ID,
  MetadataFilterConditionRequest.JSON_PROPERTY_NAME,
  MetadataFilterConditionRequest.JSON_PROPERTY_OP,
  MetadataFilterConditionRequest.JSON_PROPERTY_VALUE,
  MetadataFilterConditionRequest.JSON_PROPERTY_FROM,
  MetadataFilterConditionRequest.JSON_PROPERTY_TO,
  MetadataFilterConditionRequest.JSON_PROPERTY_OPTION_IDS
})

public class MetadataFilterConditionRequest {
  public static final String JSON_PROPERTY_FIELD_ID = "fieldId";
  @javax.annotation.Nullable  private Integer fieldId;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_OP = "op";
  @javax.annotation.Nullable  private JsonNullable<String> op = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_VALUE = "value";
  @javax.annotation.Nullable  private JsonNullable<String> value = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FROM = "from";
  @javax.annotation.Nullable  private JsonNullable<String> from = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TO = "to";
  @javax.annotation.Nullable  private JsonNullable<String> to = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_OPTION_IDS = "optionIds";
  @javax.annotation.Nullable  private JsonNullable<List<UUID>> optionIds = JsonNullable.<List<UUID>>undefined();

  public MetadataFilterConditionRequest() {
  }


  public MetadataFilterConditionRequest fieldId(@javax.annotation.Nullable Integer fieldId) {
    
    this.fieldId = fieldId;
    return this;
  }

  /**
   * The ID of the template field the condition is on. A custom field is addressed by ASC.Files.Core.MetadataFilterConditionRequest.Name instead.
   * @return fieldId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_FIELD_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFieldId() {
    return fieldId;
  }


  @JsonProperty(value = JSON_PROPERTY_FIELD_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFieldId(@javax.annotation.Nullable Integer fieldId) {
    this.fieldId = fieldId;
  }

  public MetadataFilterConditionRequest name(@javax.annotation.Nullable String name) {
    this.name = JsonNullable.<String>of(name);
    
    return this;
  }

  /**
   * The name of a custom field, for the conditions on the custom fields, which have no identifier outside. Either the  field ID or the name is given; the name is matched without regard to case.
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

  public MetadataFilterConditionRequest op(@javax.annotation.Nullable String op) {
    this.op = JsonNullable.<String>of(op);
    
    return this;
  }

  /**
   * The operator, one of ASC.Files.Core.MetadataFilterOperators: eq or contains for a string field, eq, range,  gt, gte, lt or lte for a number field, range, gt, gte, lt or lte for a date field, in for a  choice field. Optional: an omitted operator is read as eq for a string, as range for a date, as in for a  choice, and for a number as eq when a value is given or as range when a bound is. A present one has to belong  to the field type and to the arguments: eq takes a value, range takes bounds.
   * @return op
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getOp() {
        return op.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_OP, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getOp_JsonNullable() {
    return op;
  }
  
  @JsonProperty(JSON_PROPERTY_OP)
  public void setOp_JsonNullable(JsonNullable<String> op) {
    this.op = op;
  }

  public void setOp(@javax.annotation.Nullable String op) {
    this.op = JsonNullable.<String>of(op);
  }

  public MetadataFilterConditionRequest value(@javax.annotation.Nullable String value) {
    this.value = JsonNullable.<String>of(value);
    
    return this;
  }

  /**
   * The value of a single-valued condition: the whole or a part of a string field, the exact value of a number field,  or the bound of a gt, gte, lt or lte condition on a number or a date field. A JSON number is accepted as  well as a string. A date given without a time (2026-06-30) names the whole day (UTC).
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

  public MetadataFilterConditionRequest from(@javax.annotation.Nullable String from) {
    this.from = JsonNullable.<String>of(from);
    
    return this;
  }

  /**
   * The inclusive lower bound of a range. A date given without a time (2026-06-01) is the start of that day (UTC).
   * @return from
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getFrom() {
        return from.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_FROM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getFrom_JsonNullable() {
    return from;
  }
  
  @JsonProperty(JSON_PROPERTY_FROM)
  public void setFrom_JsonNullable(JsonNullable<String> from) {
    this.from = from;
  }

  public void setFrom(@javax.annotation.Nullable String from) {
    this.from = JsonNullable.<String>of(from);
  }

  public MetadataFilterConditionRequest to(@javax.annotation.Nullable String to) {
    this.to = JsonNullable.<String>of(to);
    
    return this;
  }

  /**
   * The inclusive upper bound of a range. A date given without a time (2026-06-30) covers the whole day (UTC);  a value with a time is an instant and is taken as is.
   * @return to
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getTo() {
        return to.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_TO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getTo_JsonNullable() {
    return to;
  }
  
  @JsonProperty(JSON_PROPERTY_TO)
  public void setTo_JsonNullable(JsonNullable<String> to) {
    this.to = to;
  }

  public void setTo(@javax.annotation.Nullable String to) {
    this.to = JsonNullable.<String>of(to);
  }

  public MetadataFilterConditionRequest optionIds(@javax.annotation.Nullable List<UUID> optionIds) {
    this.optionIds = JsonNullable.<List<UUID>>of(optionIds);
    
    return this;
  }

  public MetadataFilterConditionRequest addOptionIdsItem(UUID optionIdsItem) {
    if (this.optionIds == null || !this.optionIds.isPresent()) {
      this.optionIds = JsonNullable.<List<UUID>>of(new ArrayList<>());
    }
    try {
      this.optionIds.get().add(optionIdsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The options any of which the choice field must hold.
   * @return optionIds
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<UUID> getOptionIds() {
        return optionIds.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_OPTION_IDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<UUID>> getOptionIds_JsonNullable() {
    return optionIds;
  }
  
  @JsonProperty(JSON_PROPERTY_OPTION_IDS)
  public void setOptionIds_JsonNullable(JsonNullable<List<UUID>> optionIds) {
    this.optionIds = optionIds;
  }

  public void setOptionIds(@javax.annotation.Nullable List<UUID> optionIds) {
    this.optionIds = JsonNullable.<List<UUID>>of(optionIds);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetadataFilterConditionRequest metadataFilterConditionRequest = (MetadataFilterConditionRequest) o;
    return Objects.equals(this.fieldId, metadataFilterConditionRequest.fieldId) &&
        equalsNullable(this.name, metadataFilterConditionRequest.name) &&
        equalsNullable(this.op, metadataFilterConditionRequest.op) &&
        equalsNullable(this.value, metadataFilterConditionRequest.value) &&
        equalsNullable(this.from, metadataFilterConditionRequest.from) &&
        equalsNullable(this.to, metadataFilterConditionRequest.to) &&
        equalsNullable(this.optionIds, metadataFilterConditionRequest.optionIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldId, hashCodeNullable(name), hashCodeNullable(op), hashCodeNullable(value), hashCodeNullable(from), hashCodeNullable(to), hashCodeNullable(optionIds));
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
    sb.append("class MetadataFilterConditionRequest {\n");
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    optionIds: ").append(toIndentedString(optionIds)).append("\n");
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

    // add `op` to the URL query string
    if (getOp() != null) {
      try {
        joiner.add(String.format("%sop%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOp()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `from` to the URL query string
    if (getFrom() != null) {
      try {
        joiner.add(String.format("%sfrom%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFrom()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `to` to the URL query string
    if (getTo() != null) {
      try {
        joiner.add(String.format("%sto%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTo()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `optionIds` to the URL query string
    if (getOptionIds() != null) {
      for (int i = 0; i < getOptionIds().size(); i++) {
        if (getOptionIds().get(i) != null) {
          try {
            joiner.add(String.format("%soptionIds%s%s=%s", prefix, suffix,
                "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
                URLEncoder.encode(String.valueOf(getOptionIds().get(i)), "UTF-8").replaceAll("\\+", "%20")));
          } catch (UnsupportedEncodingException e) {
            // Should never happen, UTF-8 is always supported
            throw new RuntimeException(e);
          }
        }
      }
    }

    return joiner.toString();
  }

}

