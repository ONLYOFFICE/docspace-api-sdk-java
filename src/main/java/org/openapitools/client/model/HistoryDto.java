/*
 * (c) Copyright Ascensio System SIA 2025
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
import org.openapitools.client.model.HistoryAction;
import org.openapitools.client.model.HistoryData;
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
 * The file history information.
 */
@JsonPropertyOrder({
  HistoryDto.JSON_PROPERTY_ID,
  HistoryDto.JSON_PROPERTY_ACTION,
  HistoryDto.JSON_PROPERTY_INITIATOR,
  HistoryDto.JSON_PROPERTY_DATE,
  HistoryDto.JSON_PROPERTY_DATA,
  HistoryDto.JSON_PROPERTY_RELATED
})

public class HistoryDto {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nonnull
  private Integer id;

  public static final String JSON_PROPERTY_ACTION = "action";
  @javax.annotation.Nonnull
  private HistoryAction action;

  public static final String JSON_PROPERTY_INITIATOR = "initiator";
  @javax.annotation.Nonnull
  private EmployeeDto initiator;

  public static final String JSON_PROPERTY_DATE = "date";
  @javax.annotation.Nonnull
  private ApiDateTime date;

  public static final String JSON_PROPERTY_DATA = "data";
  @javax.annotation.Nonnull
  private HistoryData data;

  public static final String JSON_PROPERTY_RELATED = "related";
  @javax.annotation.Nullable
  private JsonNullable<List<HistoryDto>> related = JsonNullable.<List<HistoryDto>>undefined();

  public HistoryDto() {
  }


  public HistoryDto id(@javax.annotation.Nonnull Integer id) {
    
    this.id = id;
    return this;
  }

  /**
   * The unique identifier for the file history entry.
   * @return id
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(@javax.annotation.Nonnull Integer id) {
    this.id = id;
  }

  public HistoryDto action(@javax.annotation.Nonnull HistoryAction action) {
    
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public HistoryAction getAction() {
    return action;
  }


  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAction(@javax.annotation.Nonnull HistoryAction action) {
    this.action = action;
  }

  public HistoryDto initiator(@javax.annotation.Nonnull EmployeeDto initiator) {
    
    this.initiator = initiator;
    return this;
  }

  /**
   * Get initiator
   * @return initiator
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INITIATOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public EmployeeDto getInitiator() {
    return initiator;
  }


  @JsonProperty(JSON_PROPERTY_INITIATOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInitiator(@javax.annotation.Nonnull EmployeeDto initiator) {
    this.initiator = initiator;
  }

  public HistoryDto date(@javax.annotation.Nonnull ApiDateTime date) {
    
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ApiDateTime getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDate(@javax.annotation.Nonnull ApiDateTime date) {
    this.date = date;
  }

  public HistoryDto data(@javax.annotation.Nonnull HistoryData data) {
    
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public HistoryData getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setData(@javax.annotation.Nonnull HistoryData data) {
    this.data = data;
  }

  public HistoryDto related(@javax.annotation.Nullable List<HistoryDto> related) {
    this.related = JsonNullable.<List<HistoryDto>>of(related);
    
    return this;
  }

  public HistoryDto addRelatedItem(HistoryDto relatedItem) {
    if (this.related == null || !this.related.isPresent()) {
      this.related = JsonNullable.<List<HistoryDto>>of(new ArrayList<>());
    }
    try {
      this.related.get().add(relatedItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of related history.
   * @return related
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<HistoryDto> getRelated() {
        return related.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RELATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<HistoryDto>> getRelated_JsonNullable() {
    return related;
  }
  
  @JsonProperty(JSON_PROPERTY_RELATED)
  public void setRelated_JsonNullable(JsonNullable<List<HistoryDto>> related) {
    this.related = related;
  }

  public void setRelated(@javax.annotation.Nullable List<HistoryDto> related) {
    this.related = JsonNullable.<List<HistoryDto>>of(related);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoryDto historyDto = (HistoryDto) o;
    return Objects.equals(this.id, historyDto.id) &&
        Objects.equals(this.action, historyDto.action) &&
        Objects.equals(this.initiator, historyDto.initiator) &&
        Objects.equals(this.date, historyDto.date) &&
        Objects.equals(this.data, historyDto.data) &&
        equalsNullable(this.related, historyDto.related);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, action, initiator, date, data, hashCodeNullable(related));
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
    sb.append("class HistoryDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    initiator: ").append(toIndentedString(initiator)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    related: ").append(toIndentedString(related)).append("\n");
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

    // add `action` to the URL query string
    if (getAction() != null) {
      joiner.add(getAction().toUrlQueryString(prefix + "action" + suffix));
    }

    // add `initiator` to the URL query string
    if (getInitiator() != null) {
      joiner.add(getInitiator().toUrlQueryString(prefix + "initiator" + suffix));
    }

    // add `date` to the URL query string
    if (getDate() != null) {
      joiner.add(getDate().toUrlQueryString(prefix + "date" + suffix));
    }

    // add `data` to the URL query string
    if (getData() != null) {
      joiner.add(getData().toUrlQueryString(prefix + "data" + suffix));
    }

    // add `related` to the URL query string
    if (getRelated() != null) {
      for (int i = 0; i < getRelated().size(); i++) {
        if (getRelated().get(i) != null) {
          joiner.add(getRelated().get(i).toUrlQueryString(String.format("%srelated%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

