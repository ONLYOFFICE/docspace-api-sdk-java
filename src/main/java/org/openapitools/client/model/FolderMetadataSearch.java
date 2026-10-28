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
import org.openapitools.client.model.FilterType;
import org.openapitools.client.model.MetadataFilterConditionRequest;
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
 * The typed form of the metadata search of a folder: the same filter the folder listing takes in the metadataTemplateId  and metadataFilters query parameters, with the conditions as objects instead of a JSON string.
 */
@JsonPropertyOrder({
  FolderMetadataSearch.JSON_PROPERTY_METADATA_TEMPLATE_ID,
  FolderMetadataSearch.JSON_PROPERTY_METADATA_FILTERS,
  FolderMetadataSearch.JSON_PROPERTY_INCLUDE_HIDDEN_METADATA,
  FolderMetadataSearch.JSON_PROPERTY_FILTER_VALUE,
  FolderMetadataSearch.JSON_PROPERTY_WITH_SUB_FOLDERS,
  FolderMetadataSearch.JSON_PROPERTY_FILTER_TYPE,
  FolderMetadataSearch.JSON_PROPERTY_COUNT,
  FolderMetadataSearch.JSON_PROPERTY_START_INDEX,
  FolderMetadataSearch.JSON_PROPERTY_SORT_BY,
  FolderMetadataSearch.JSON_PROPERTY_SORT_ORDER
})

public class FolderMetadataSearch {
  public static final String JSON_PROPERTY_METADATA_TEMPLATE_ID = "metadataTemplateId";
  @javax.annotation.Nullable  private JsonNullable<Integer> metadataTemplateId = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_METADATA_FILTERS = "metadataFilters";
  @javax.annotation.Nullable  private JsonNullable<List<MetadataFilterConditionRequest>> metadataFilters = JsonNullable.<List<MetadataFilterConditionRequest>>undefined();

  public static final String JSON_PROPERTY_INCLUDE_HIDDEN_METADATA = "includeHiddenMetadata";
  @javax.annotation.Nullable  private JsonNullable<Boolean> includeHiddenMetadata = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_FILTER_VALUE = "filterValue";
  @javax.annotation.Nullable  private JsonNullable<String> filterValue = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_WITH_SUB_FOLDERS = "withSubFolders";
  @javax.annotation.Nullable  private JsonNullable<Boolean> withSubFolders = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_FILTER_TYPE = "filterType";
  @javax.annotation.Nullable  private FilterType filterType;

  public static final String JSON_PROPERTY_COUNT = "count";
  @javax.annotation.Nullable  private Integer count;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  @javax.annotation.Nullable  private Integer startIndex;

  public static final String JSON_PROPERTY_SORT_BY = "sortBy";
  @javax.annotation.Nullable  private JsonNullable<String> sortBy = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SORT_ORDER = "sortOrder";
  @javax.annotation.Nullable  private SortOrder sortOrder;

  public FolderMetadataSearch() {
  }


  public FolderMetadataSearch metadataTemplateId(@javax.annotation.Nullable Integer metadataTemplateId) {
    this.metadataTemplateId = JsonNullable.<Integer>of(metadataTemplateId);
    
    return this;
  }

  /**
   * The ID of the metadata template the entries must be assigned to. On its own it narrows the listing to the entries  carrying the template; together with the conditions it also pins the template the filtered fields belong to.
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

  public FolderMetadataSearch metadataFilters(@javax.annotation.Nullable List<MetadataFilterConditionRequest> metadataFilters) {
    this.metadataFilters = JsonNullable.<List<MetadataFilterConditionRequest>>of(metadataFilters);
    
    return this;
  }

  public FolderMetadataSearch addMetadataFiltersItem(MetadataFilterConditionRequest metadataFiltersItem) {
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

  public FolderMetadataSearch includeHiddenMetadata(@javax.annotation.Nullable Boolean includeHiddenMetadata) {
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

  public FolderMetadataSearch filterValue(@javax.annotation.Nullable String filterValue) {
    this.filterValue = JsonNullable.<String>of(filterValue);
    
    return this;
  }

  /**
   * The text to search for in the titles and in the string metadata values of the entries, the custom fields and the  template fields alike; an entry found by its metadata says where in metadataMatches.
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

  public FolderMetadataSearch withSubFolders(@javax.annotation.Nullable Boolean withSubFolders) {
    this.withSubFolders = JsonNullable.<Boolean>of(withSubFolders);
    
    return this;
  }

  /**
   * Specifies whether to search the whole subtree of the folder (the default) or its direct children only.
   * @return withSubFolders
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getWithSubFolders() {
        return withSubFolders.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_WITH_SUB_FOLDERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getWithSubFolders_JsonNullable() {
    return withSubFolders;
  }
  
  @JsonProperty(JSON_PROPERTY_WITH_SUB_FOLDERS)
  public void setWithSubFolders_JsonNullable(JsonNullable<Boolean> withSubFolders) {
    this.withSubFolders = withSubFolders;
  }

  public void setWithSubFolders(@javax.annotation.Nullable Boolean withSubFolders) {
    this.withSubFolders = JsonNullable.<Boolean>of(withSubFolders);
  }

  public FolderMetadataSearch filterType(@javax.annotation.Nullable FilterType filterType) {
    
    this.filterType = filterType;
    return this;
  }

  /**
   * The filter type.
   * @return filterType
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_FILTER_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FilterType getFilterType() {
    return filterType;
  }


  @JsonProperty(value = JSON_PROPERTY_FILTER_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilterType(@javax.annotation.Nullable FilterType filterType) {
    this.filterType = filterType;
  }

  public FolderMetadataSearch count(@javax.annotation.Nullable Integer count) {
    
    this.count = count;
    return this;
  }

  /**
   * The number of entries to return, from 1 to 100.
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

  public FolderMetadataSearch startIndex(@javax.annotation.Nullable Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

  /**
   * The zero-based index of the first entry to return.
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

  public FolderMetadataSearch sortBy(@javax.annotation.Nullable String sortBy) {
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

  public FolderMetadataSearch sortOrder(@javax.annotation.Nullable SortOrder sortOrder) {
    
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
    FolderMetadataSearch folderMetadataSearch = (FolderMetadataSearch) o;
    return equalsNullable(this.metadataTemplateId, folderMetadataSearch.metadataTemplateId) &&
        equalsNullable(this.metadataFilters, folderMetadataSearch.metadataFilters) &&
        equalsNullable(this.includeHiddenMetadata, folderMetadataSearch.includeHiddenMetadata) &&
        equalsNullable(this.filterValue, folderMetadataSearch.filterValue) &&
        equalsNullable(this.withSubFolders, folderMetadataSearch.withSubFolders) &&
        Objects.equals(this.filterType, folderMetadataSearch.filterType) &&
        Objects.equals(this.count, folderMetadataSearch.count) &&
        Objects.equals(this.startIndex, folderMetadataSearch.startIndex) &&
        equalsNullable(this.sortBy, folderMetadataSearch.sortBy) &&
        Objects.equals(this.sortOrder, folderMetadataSearch.sortOrder);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(metadataTemplateId), hashCodeNullable(metadataFilters), hashCodeNullable(includeHiddenMetadata), hashCodeNullable(filterValue), hashCodeNullable(withSubFolders), filterType, count, startIndex, hashCodeNullable(sortBy), sortOrder);
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
    sb.append("class FolderMetadataSearch {\n");
    sb.append("    metadataTemplateId: ").append(toIndentedString(metadataTemplateId)).append("\n");
    sb.append("    metadataFilters: ").append(toIndentedString(metadataFilters)).append("\n");
    sb.append("    includeHiddenMetadata: ").append(toIndentedString(includeHiddenMetadata)).append("\n");
    sb.append("    filterValue: ").append(toIndentedString(filterValue)).append("\n");
    sb.append("    withSubFolders: ").append(toIndentedString(withSubFolders)).append("\n");
    sb.append("    filterType: ").append(toIndentedString(filterType)).append("\n");
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

    // add `withSubFolders` to the URL query string
    if (getWithSubFolders() != null) {
      try {
        joiner.add(String.format("%swithSubFolders%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWithSubFolders()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `filterType` to the URL query string
    if (getFilterType() != null) {
      try {
        joiner.add(String.format("%sfilterType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFilterType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
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

