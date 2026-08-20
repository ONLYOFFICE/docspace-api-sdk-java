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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.FormsItemData;
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
 * FormResultsDto
 */
@JsonPropertyOrder({
  FormResultsDto.JSON_PROPERTY_CREATE_ON,
  FormResultsDto.JSON_PROPERTY_FORMS_DATA
})

public class FormResultsDto {
  public static final String JSON_PROPERTY_CREATE_ON = "createOn";
  @javax.annotation.Nullable  private OffsetDateTime createOn;

  public static final String JSON_PROPERTY_FORMS_DATA = "formsData";
  @javax.annotation.Nullable  private JsonNullable<List<FormsItemData>> formsData = JsonNullable.<List<FormsItemData>>undefined();

  public FormResultsDto() {
  }


  public FormResultsDto createOn(@javax.annotation.Nullable OffsetDateTime createOn) {
    
    this.createOn = createOn;
    return this;
  }

  /**
   * The date and time when the form was created.
   * @return createOn
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CREATE_ON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreateOn() {
    return createOn;
  }


  @JsonProperty(value = JSON_PROPERTY_CREATE_ON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateOn(@javax.annotation.Nullable OffsetDateTime createOn) {
    this.createOn = createOn;
  }

  public FormResultsDto formsData(@javax.annotation.Nullable List<FormsItemData> formsData) {
    this.formsData = JsonNullable.<List<FormsItemData>>of(formsData);
    
    return this;
  }

  public FormResultsDto addFormsDataItem(FormsItemData formsDataItem) {
    if (this.formsData == null || !this.formsData.isPresent()) {
      this.formsData = JsonNullable.<List<FormsItemData>>of(new ArrayList<>());
    }
    try {
      this.formsData.get().add(formsDataItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of forms data.
   * @return formsData
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<FormsItemData> getFormsData() {
        return formsData.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_FORMS_DATA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<FormsItemData>> getFormsData_JsonNullable() {
    return formsData;
  }
  
  @JsonProperty(JSON_PROPERTY_FORMS_DATA)
  public void setFormsData_JsonNullable(JsonNullable<List<FormsItemData>> formsData) {
    this.formsData = formsData;
  }

  public void setFormsData(@javax.annotation.Nullable List<FormsItemData> formsData) {
    this.formsData = JsonNullable.<List<FormsItemData>>of(formsData);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormResultsDto formResultsDto = (FormResultsDto) o;
    return Objects.equals(this.createOn, formResultsDto.createOn) &&
        equalsNullable(this.formsData, formResultsDto.formsData);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(createOn, hashCodeNullable(formsData));
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
    sb.append("class FormResultsDto {\n");
    sb.append("    createOn: ").append(toIndentedString(createOn)).append("\n");
    sb.append("    formsData: ").append(toIndentedString(formsData)).append("\n");
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

    // add `createOn` to the URL query string
    if (getCreateOn() != null) {
      try {
        joiner.add(String.format("%screateOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreateOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `formsData` to the URL query string
    if (getFormsData() != null) {
      for (int i = 0; i < getFormsData().size(); i++) {
        if (getFormsData().get(i) != null) {
          joiner.add(getFormsData().get(i).toUrlQueryString(String.format("%sformsData%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

