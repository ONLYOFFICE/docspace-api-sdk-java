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
import org.openapitools.client.model.MetadataFilterConditionRequest;
import org.openapitools.client.model.RoomType;
import org.openapitools.client.model.SearchArea;
import org.openapitools.client.model.SortOrder;
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
 * The typed form of the metadata search of the rooms: the same filter the rooms listing takes in the metadataTemplateId  and metadataFilters query parameters, with the conditions as objects instead of a JSON string.
 */
@JsonPropertyOrder({
  RoomsMetadataSearchRequestDto.JSON_PROPERTY_METADATA_TEMPLATE_ID,
  RoomsMetadataSearchRequestDto.JSON_PROPERTY_METADATA_FILTERS,
  RoomsMetadataSearchRequestDto.JSON_PROPERTY_INCLUDE_HIDDEN_METADATA,
  RoomsMetadataSearchRequestDto.JSON_PROPERTY_FILTER_VALUE,
  RoomsMetadataSearchRequestDto.JSON_PROPERTY_SEARCH_AREA,
  RoomsMetadataSearchRequestDto.JSON_PROPERTY_TYPE,
  RoomsMetadataSearchRequestDto.JSON_PROPERTY_COUNT,
  RoomsMetadataSearchRequestDto.JSON_PROPERTY_START_INDEX,
  RoomsMetadataSearchRequestDto.JSON_PROPERTY_SORT_BY,
  RoomsMetadataSearchRequestDto.JSON_PROPERTY_SORT_ORDER
})

public class RoomsMetadataSearchRequestDto {
  public static final String JSON_PROPERTY_METADATA_TEMPLATE_ID = "metadataTemplateId";
  @javax.annotation.Nullable  private JsonNullable<Integer> metadataTemplateId = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_METADATA_FILTERS = "metadataFilters";
  @javax.annotation.Nullable  private JsonNullable<List<MetadataFilterConditionRequest>> metadataFilters = JsonNullable.<List<MetadataFilterConditionRequest>>undefined();

  public static final String JSON_PROPERTY_INCLUDE_HIDDEN_METADATA = "includeHiddenMetadata";
  @javax.annotation.Nullable  private JsonNullable<Boolean> includeHiddenMetadata = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_FILTER_VALUE = "filterValue";
  @javax.annotation.Nullable  private JsonNullable<String> filterValue = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SEARCH_AREA = "searchArea";
  @javax.annotation.Nullable  private SearchArea searchArea;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable  private JsonNullable<List<RoomType>> type = JsonNullable.<List<RoomType>>undefined();

  public static final String JSON_PROPERTY_COUNT = "count";
  @javax.annotation.Nullable  private Integer count;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  @javax.annotation.Nullable  private Integer startIndex;

  public static final String JSON_PROPERTY_SORT_BY = "sortBy";
  @javax.annotation.Nullable  private JsonNullable<String> sortBy = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SORT_ORDER = "sortOrder";
  @javax.annotation.Nullable  private SortOrder sortOrder;

  public RoomsMetadataSearchRequestDto() {
  }


  public RoomsMetadataSearchRequestDto metadataTemplateId(@javax.annotation.Nullable Integer metadataTemplateId) {
    this.metadataTemplateId = JsonNullable.<Integer>of(metadataTemplateId);
    
    return this;
  }

  /**
   * The ID of the metadata template the rooms must be assigned to. On its own it narrows the listing to the rooms  carrying the template; together with the conditions it also pins the template the filtered fields belong to.
   * @return metadataTemplateId
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Integer getMetadataTemplateId() {
        return metadataTemplateId.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_METADATA_TEMPLATE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Integer> getMetadataTemplateId_JsonNullable() {
    return metadataTemplateId;
  }
  
  @JsonProperty(JSON_PROPERTY_METADATA_TEMPLATE_ID)
  public void setMetadataTemplateId_JsonNullable(JsonNullable<Integer> metadataTemplateId) {
    this.metadataTemplateId = metadataTemplateId;
  }

  public void setMetadataTemplateId(@javax.annotation.Nullable Integer metadataTemplateId) {
    this.metadataTemplateId = JsonNullable.<Integer>of(metadataTemplateId);
  }

  public RoomsMetadataSearchRequestDto metadataFilters(@javax.annotation.Nullable List<MetadataFilterConditionRequest> metadataFilters) {
    this.metadataFilters = JsonNullable.<List<MetadataFilterConditionRequest>>of(metadataFilters);
    
    return this;
  }

  public RoomsMetadataSearchRequestDto addMetadataFiltersItem(MetadataFilterConditionRequest metadataFiltersItem) {
    if (this.metadataFilters == null || !this.metadataFilters.isPresent()) {
      this.metadataFilters = JsonNullable.<List<MetadataFilterConditionRequest>>of(new ArrayList<>());
    }
    try {
      this.metadataFilters.get().add(metadataFiltersItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The metadata filter conditions, combined with AND. A custom field is addressed by its name instead of the field ID.
   * @return metadataFilters
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<MetadataFilterConditionRequest> getMetadataFilters() {
        return metadataFilters.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_METADATA_FILTERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<MetadataFilterConditionRequest>> getMetadataFilters_JsonNullable() {
    return metadataFilters;
  }
  
  @JsonProperty(JSON_PROPERTY_METADATA_FILTERS)
  public void setMetadataFilters_JsonNullable(JsonNullable<List<MetadataFilterConditionRequest>> metadataFilters) {
    this.metadataFilters = metadataFilters;
  }

  public void setMetadataFilters(@javax.annotation.Nullable List<MetadataFilterConditionRequest> metadataFilters) {
    this.metadataFilters = JsonNullable.<List<MetadataFilterConditionRequest>>of(metadataFilters);
  }

  public RoomsMetadataSearchRequestDto includeHiddenMetadata(@javax.annotation.Nullable Boolean includeHiddenMetadata) {
    this.includeHiddenMetadata = JsonNullable.<Boolean>of(includeHiddenMetadata);
    
    return this;
  }

  /**
   * Whether the text search, and the metadataMatches it reports, also look at the values of the hidden metadata  templates (created with visible false for the metadata a service keeps for itself, which the web client never  shows). False, the default, leaves them out, so an entry is not found by such a value; true takes them in.  metadataTemplateId and metadataFilters are not concerned: a hidden template or field named there is searched  either way.
   * @return includeHiddenMetadata
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getIncludeHiddenMetadata() {
        return includeHiddenMetadata.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_INCLUDE_HIDDEN_METADATA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getIncludeHiddenMetadata_JsonNullable() {
    return includeHiddenMetadata;
  }
  
  @JsonProperty(JSON_PROPERTY_INCLUDE_HIDDEN_METADATA)
  public void setIncludeHiddenMetadata_JsonNullable(JsonNullable<Boolean> includeHiddenMetadata) {
    this.includeHiddenMetadata = includeHiddenMetadata;
  }

  public void setIncludeHiddenMetadata(@javax.annotation.Nullable Boolean includeHiddenMetadata) {
    this.includeHiddenMetadata = JsonNullable.<Boolean>of(includeHiddenMetadata);
  }

  public RoomsMetadataSearchRequestDto filterValue(@javax.annotation.Nullable String filterValue) {
    this.filterValue = JsonNullable.<String>of(filterValue);
    
    return this;
  }

  /**
   * The text to search for in the room titles and in the string metadata values of the rooms, the custom fields and  the template fields alike; a room found by its metadata says where in metadataMatches.
   * @return filterValue
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getFilterValue() {
        return filterValue.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_FILTER_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getFilterValue_JsonNullable() {
    return filterValue;
  }
  
  @JsonProperty(JSON_PROPERTY_FILTER_VALUE)
  public void setFilterValue_JsonNullable(JsonNullable<String> filterValue) {
    this.filterValue = filterValue;
  }

  public void setFilterValue(@javax.annotation.Nullable String filterValue) {
    this.filterValue = JsonNullable.<String>of(filterValue);
  }

  public RoomsMetadataSearchRequestDto searchArea(@javax.annotation.Nullable SearchArea searchArea) {
    
    this.searchArea = searchArea;
    return this;
  }

  /**
   * The section to search in: the active rooms (the default), the archive or the templates.
   * @return searchArea
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SEARCH_AREA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SearchArea getSearchArea() {
    return searchArea;
  }


  @JsonProperty(value = JSON_PROPERTY_SEARCH_AREA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSearchArea(@javax.annotation.Nullable SearchArea searchArea) {
    this.searchArea = searchArea;
  }

  public RoomsMetadataSearchRequestDto type(@javax.annotation.Nullable List<RoomType> type) {
    this.type = JsonNullable.<List<RoomType>>of(type);
    
    return this;
  }

  public RoomsMetadataSearchRequestDto addTypeItem(RoomType typeItem) {
    if (this.type == null || !this.type.isPresent()) {
      this.type = JsonNullable.<List<RoomType>>of(new ArrayList<>());
    }
    try {
      this.type.get().add(typeItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The room types to search among.
   * @return type
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<RoomType> getType() {
        return type.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<RoomType>> getType_JsonNullable() {
    return type;
  }
  
  @JsonProperty(JSON_PROPERTY_TYPE)
  public void setType_JsonNullable(JsonNullable<List<RoomType>> type) {
    this.type = type;
  }

  public void setType(@javax.annotation.Nullable List<RoomType> type) {
    this.type = JsonNullable.<List<RoomType>>of(type);
  }

  public RoomsMetadataSearchRequestDto count(@javax.annotation.Nullable Integer count) {
    
    this.count = count;
    return this;
  }

  /**
   * The number of rooms to return, from 1 to 100.
   * minimum: 1
   * maximum: 100
   * @return count
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCount() {
    return count;
  }


  @JsonProperty(value = JSON_PROPERTY_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCount(@javax.annotation.Nullable Integer count) {
    this.count = count;
  }

  public RoomsMetadataSearchRequestDto startIndex(@javax.annotation.Nullable Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

  /**
   * The zero-based index of the first room to return.
   * minimum: 0
   * maximum: 2147483647
   * @return startIndex
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_START_INDEX, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartIndex() {
    return startIndex;
  }


  @JsonProperty(value = JSON_PROPERTY_START_INDEX, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartIndex(@javax.annotation.Nullable Integer startIndex) {
    this.startIndex = startIndex;
  }

  public RoomsMetadataSearchRequestDto sortBy(@javax.annotation.Nullable String sortBy) {
    this.sortBy = JsonNullable.<String>of(sortBy);
    
    return this;
  }

  /**
   * The field to sort by, a name of the SortedByType values.
   * @return sortBy
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getSortBy() {
        return sortBy.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SORT_BY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getSortBy_JsonNullable() {
    return sortBy;
  }
  
  @JsonProperty(JSON_PROPERTY_SORT_BY)
  public void setSortBy_JsonNullable(JsonNullable<String> sortBy) {
    this.sortBy = sortBy;
  }

  public void setSortBy(@javax.annotation.Nullable String sortBy) {
    this.sortBy = JsonNullable.<String>of(sortBy);
  }

  public RoomsMetadataSearchRequestDto sortOrder(@javax.annotation.Nullable SortOrder sortOrder) {
    
    this.sortOrder = sortOrder;
    return this;
  }

  /**
   * The sort order.
   * @return sortOrder
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SORT_ORDER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SortOrder getSortOrder() {
    return sortOrder;
  }


  @JsonProperty(value = JSON_PROPERTY_SORT_ORDER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSortOrder(@javax.annotation.Nullable SortOrder sortOrder) {
    this.sortOrder = sortOrder;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomsMetadataSearchRequestDto roomsMetadataSearchRequestDto = (RoomsMetadataSearchRequestDto) o;
    return equalsNullable(this.metadataTemplateId, roomsMetadataSearchRequestDto.metadataTemplateId) &&
        equalsNullable(this.metadataFilters, roomsMetadataSearchRequestDto.metadataFilters) &&
        equalsNullable(this.includeHiddenMetadata, roomsMetadataSearchRequestDto.includeHiddenMetadata) &&
        equalsNullable(this.filterValue, roomsMetadataSearchRequestDto.filterValue) &&
        Objects.equals(this.searchArea, roomsMetadataSearchRequestDto.searchArea) &&
        equalsNullable(this.type, roomsMetadataSearchRequestDto.type) &&
        Objects.equals(this.count, roomsMetadataSearchRequestDto.count) &&
        Objects.equals(this.startIndex, roomsMetadataSearchRequestDto.startIndex) &&
        equalsNullable(this.sortBy, roomsMetadataSearchRequestDto.sortBy) &&
        Objects.equals(this.sortOrder, roomsMetadataSearchRequestDto.sortOrder);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(metadataTemplateId), hashCodeNullable(metadataFilters), hashCodeNullable(includeHiddenMetadata), hashCodeNullable(filterValue), searchArea, hashCodeNullable(type), count, startIndex, hashCodeNullable(sortBy), sortOrder);
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
    sb.append("class RoomsMetadataSearchRequestDto {\n");
    sb.append("    metadataTemplateId: ").append(toIndentedString(metadataTemplateId)).append("\n");
    sb.append("    metadataFilters: ").append(toIndentedString(metadataFilters)).append("\n");
    sb.append("    includeHiddenMetadata: ").append(toIndentedString(includeHiddenMetadata)).append("\n");
    sb.append("    filterValue: ").append(toIndentedString(filterValue)).append("\n");
    sb.append("    searchArea: ").append(toIndentedString(searchArea)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
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

    // add `metadataTemplateId` to the URL query string
    if (getMetadataTemplateId() != null) {
      try {
        joiner.add(String.format("%smetadataTemplateId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMetadataTemplateId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `metadataFilters` to the URL query string
    if (getMetadataFilters() != null) {
      for (int i = 0; i < getMetadataFilters().size(); i++) {
        if (getMetadataFilters().get(i) != null) {
          joiner.add(getMetadataFilters().get(i).toUrlQueryString(String.format("%smetadataFilters%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `includeHiddenMetadata` to the URL query string
    if (getIncludeHiddenMetadata() != null) {
      try {
        joiner.add(String.format("%sincludeHiddenMetadata%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIncludeHiddenMetadata()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `filterValue` to the URL query string
    if (getFilterValue() != null) {
      try {
        joiner.add(String.format("%sfilterValue%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFilterValue()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `searchArea` to the URL query string
    if (getSearchArea() != null) {
      try {
        joiner.add(String.format("%ssearchArea%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSearchArea()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `type` to the URL query string
    if (getType() != null) {
      for (int i = 0; i < getType().size(); i++) {
        if (getType().get(i) != null) {
          try {
            joiner.add(String.format("%stype%s%s=%s", prefix, suffix,
                "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
                URLEncoder.encode(String.valueOf(getType().get(i)), "UTF-8").replaceAll("\\+", "%20")));
          } catch (UnsupportedEncodingException e) {
            // Should never happen, UTF-8 is always supported
            throw new RuntimeException(e);
          }
        }
      }
    }

    // add `count` to the URL query string
    if (getCount() != null) {
      try {
        joiner.add(String.format("%scount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `startIndex` to the URL query string
    if (getStartIndex() != null) {
      try {
        joiner.add(String.format("%sstartIndex%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStartIndex()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sortBy` to the URL query string
    if (getSortBy() != null) {
      try {
        joiner.add(String.format("%ssortBy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSortBy()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sortOrder` to the URL query string
    if (getSortOrder() != null) {
      try {
        joiner.add(String.format("%ssortOrder%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSortOrder()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

