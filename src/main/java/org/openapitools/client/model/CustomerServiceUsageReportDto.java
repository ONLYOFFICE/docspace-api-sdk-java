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
import org.openapitools.client.model.CustomerServiceUsageDto;
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
 * One page of the per-service consumption totals, with the paging figures needed to walk the rest.
 */
@JsonPropertyOrder({
  CustomerServiceUsageReportDto.JSON_PROPERTY_COLLECTION,
  CustomerServiceUsageReportDto.JSON_PROPERTY_OFFSET,
  CustomerServiceUsageReportDto.JSON_PROPERTY_LIMIT,
  CustomerServiceUsageReportDto.JSON_PROPERTY_TOTAL_QUANTITY,
  CustomerServiceUsageReportDto.JSON_PROPERTY_TOTAL_PAGE,
  CustomerServiceUsageReportDto.JSON_PROPERTY_CURRENT_PAGE
})

public class CustomerServiceUsageReportDto {
  public static final String JSON_PROPERTY_COLLECTION = "collection";
  @javax.annotation.Nullable  private JsonNullable<List<CustomerServiceUsageDto>> collection = JsonNullable.<List<CustomerServiceUsageDto>>undefined();

  public static final String JSON_PROPERTY_OFFSET = "offset";
  @javax.annotation.Nullable  private Integer offset;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  @javax.annotation.Nullable  private Integer limit;

  public static final String JSON_PROPERTY_TOTAL_QUANTITY = "totalQuantity";
  @javax.annotation.Nullable  private Long totalQuantity;

  public static final String JSON_PROPERTY_TOTAL_PAGE = "totalPage";
  @javax.annotation.Nullable  private Integer totalPage;

  public static final String JSON_PROPERTY_CURRENT_PAGE = "currentPage";
  @javax.annotation.Nullable  private Integer currentPage;

  public CustomerServiceUsageReportDto() {
  }


  public CustomerServiceUsageReportDto collection(@javax.annotation.Nullable List<CustomerServiceUsageDto> collection) {
    this.collection = JsonNullable.<List<CustomerServiceUsageDto>>of(collection);
    
    return this;
  }

  public CustomerServiceUsageReportDto addCollectionItem(CustomerServiceUsageDto collectionItem) {
    if (this.collection == null || !this.collection.isPresent()) {
      this.collection = JsonNullable.<List<CustomerServiceUsageDto>>of(new ArrayList<>());
    }
    try {
      this.collection.get().add(collectionItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The services on this page, one entry per service rather than per charge. It is empty for a period in  which nothing was consumed as well as for a page past the end of the report.
   * @return collection
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<CustomerServiceUsageDto> getCollection() {
        return collection.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_COLLECTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<CustomerServiceUsageDto>> getCollection_JsonNullable() {
    return collection;
  }
  
  @JsonProperty(JSON_PROPERTY_COLLECTION)
  public void setCollection_JsonNullable(JsonNullable<List<CustomerServiceUsageDto>> collection) {
    this.collection = collection;
  }

  public void setCollection(@javax.annotation.Nullable List<CustomerServiceUsageDto> collection) {
    this.collection = JsonNullable.<List<CustomerServiceUsageDto>>of(collection);
  }

  public CustomerServiceUsageReportDto offset(@javax.annotation.Nullable Integer offset) {
    
    this.offset = offset;
    return this;
  }

  /**
   * How many entries were skipped before this page, echoed from the request.
   * @return offset
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_OFFSET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOffset() {
    return offset;
  }


  @JsonProperty(value = JSON_PROPERTY_OFFSET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOffset(@javax.annotation.Nullable Integer offset) {
    this.offset = offset;
  }

  public CustomerServiceUsageReportDto limit(@javax.annotation.Nullable Integer limit) {
    
    this.limit = limit;
    return this;
  }

  /**
   * How many entries one page may hold, echoed from the request; it is 25 unless another value was asked for.
   * @return limit
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLimit() {
    return limit;
  }


  @JsonProperty(value = JSON_PROPERTY_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimit(@javax.annotation.Nullable Integer limit) {
    this.limit = limit;
  }

  public CustomerServiceUsageReportDto totalQuantity(@javax.annotation.Nullable Long totalQuantity) {
    
    this.totalQuantity = totalQuantity;
    return this;
  }

  /**
   * How many services match the filters in total, across every page - services, not charges.
   * @return totalQuantity
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TOTAL_QUANTITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTotalQuantity() {
    return totalQuantity;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL_QUANTITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalQuantity(@javax.annotation.Nullable Long totalQuantity) {
    this.totalQuantity = totalQuantity;
  }

  public CustomerServiceUsageReportDto totalPage(@javax.annotation.Nullable Integer totalPage) {
    
    this.totalPage = totalPage;
    return this;
  }

  /**
   * How many pages those entries come to at the current `limit`.
   * @return totalPage
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TOTAL_PAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalPage() {
    return totalPage;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL_PAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalPage(@javax.annotation.Nullable Integer totalPage) {
    this.totalPage = totalPage;
  }

  public CustomerServiceUsageReportDto currentPage(@javax.annotation.Nullable Integer currentPage) {
    
    this.currentPage = currentPage;
    return this;
  }

  /**
   * Which of those pages this one is, as the billing service numbers them. Page through by advancing `offset`  rather than this value, which nothing accepts as an argument.
   * @return currentPage
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CURRENT_PAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCurrentPage() {
    return currentPage;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENT_PAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentPage(@javax.annotation.Nullable Integer currentPage) {
    this.currentPage = currentPage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerServiceUsageReportDto customerServiceUsageReportDto = (CustomerServiceUsageReportDto) o;
    return equalsNullable(this.collection, customerServiceUsageReportDto.collection) &&
        Objects.equals(this.offset, customerServiceUsageReportDto.offset) &&
        Objects.equals(this.limit, customerServiceUsageReportDto.limit) &&
        Objects.equals(this.totalQuantity, customerServiceUsageReportDto.totalQuantity) &&
        Objects.equals(this.totalPage, customerServiceUsageReportDto.totalPage) &&
        Objects.equals(this.currentPage, customerServiceUsageReportDto.currentPage);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(collection), offset, limit, totalQuantity, totalPage, currentPage);
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
    sb.append("class CustomerServiceUsageReportDto {\n");
    sb.append("    collection: ").append(toIndentedString(collection)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    totalQuantity: ").append(toIndentedString(totalQuantity)).append("\n");
    sb.append("    totalPage: ").append(toIndentedString(totalPage)).append("\n");
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
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

    // add `collection` to the URL query string
    if (getCollection() != null) {
      for (int i = 0; i < getCollection().size(); i++) {
        if (getCollection().get(i) != null) {
          joiner.add(getCollection().get(i).toUrlQueryString(String.format("%scollection%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `offset` to the URL query string
    if (getOffset() != null) {
      try {
        joiner.add(String.format("%soffset%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOffset()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `limit` to the URL query string
    if (getLimit() != null) {
      try {
        joiner.add(String.format("%slimit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLimit()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `totalQuantity` to the URL query string
    if (getTotalQuantity() != null) {
      try {
        joiner.add(String.format("%stotalQuantity%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTotalQuantity()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `totalPage` to the URL query string
    if (getTotalPage() != null) {
      try {
        joiner.add(String.format("%stotalPage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTotalPage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `currentPage` to the URL query string
    if (getCurrentPage() != null) {
      try {
        joiner.add(String.format("%scurrentPage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCurrentPage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

