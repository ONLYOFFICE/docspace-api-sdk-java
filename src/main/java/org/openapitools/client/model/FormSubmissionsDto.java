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
import org.openapitools.client.model.FormMetadata;
import org.openapitools.client.model.FormResultsDto;
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
 * FormSubmissionsDto
 */
@JsonPropertyOrder({
  FormSubmissionsDto.JSON_PROPERTY_METADATA,
  FormSubmissionsDto.JSON_PROPERTY_SUBMISSIONS
})

public class FormSubmissionsDto {
  public static final String JSON_PROPERTY_METADATA = "metadata";
  @javax.annotation.Nullable  private JsonNullable<List<FormMetadata>> metadata = JsonNullable.<List<FormMetadata>>undefined();

  public static final String JSON_PROPERTY_SUBMISSIONS = "submissions";
  @javax.annotation.Nullable  private JsonNullable<List<FormResultsDto>> submissions = JsonNullable.<List<FormResultsDto>>undefined();

  public FormSubmissionsDto() {
  }


  public FormSubmissionsDto metadata(@javax.annotation.Nullable List<FormMetadata> metadata) {
    this.metadata = JsonNullable.<List<FormMetadata>>of(metadata);
    
    return this;
  }

  public FormSubmissionsDto addMetadataItem(FormMetadata metadataItem) {
    if (this.metadata == null || !this.metadata.isPresent()) {
      this.metadata = JsonNullable.<List<FormMetadata>>of(new ArrayList<>());
    }
    try {
      this.metadata.get().add(metadataItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The form field metadata.
   * @return metadata
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<FormMetadata> getMetadata() {
        return metadata.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_METADATA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<FormMetadata>> getMetadata_JsonNullable() {
    return metadata;
  }
  
  @JsonProperty(JSON_PROPERTY_METADATA)
  public void setMetadata_JsonNullable(JsonNullable<List<FormMetadata>> metadata) {
    this.metadata = metadata;
  }

  public void setMetadata(@javax.annotation.Nullable List<FormMetadata> metadata) {
    this.metadata = JsonNullable.<List<FormMetadata>>of(metadata);
  }

  public FormSubmissionsDto submissions(@javax.annotation.Nullable List<FormResultsDto> submissions) {
    this.submissions = JsonNullable.<List<FormResultsDto>>of(submissions);
    
    return this;
  }

  public FormSubmissionsDto addSubmissionsItem(FormResultsDto submissionsItem) {
    if (this.submissions == null || !this.submissions.isPresent()) {
      this.submissions = JsonNullable.<List<FormResultsDto>>of(new ArrayList<>());
    }
    try {
      this.submissions.get().add(submissionsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * All submissions.
   * @return submissions
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<FormResultsDto> getSubmissions() {
        return submissions.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SUBMISSIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<FormResultsDto>> getSubmissions_JsonNullable() {
    return submissions;
  }
  
  @JsonProperty(JSON_PROPERTY_SUBMISSIONS)
  public void setSubmissions_JsonNullable(JsonNullable<List<FormResultsDto>> submissions) {
    this.submissions = submissions;
  }

  public void setSubmissions(@javax.annotation.Nullable List<FormResultsDto> submissions) {
    this.submissions = JsonNullable.<List<FormResultsDto>>of(submissions);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormSubmissionsDto formSubmissionsDto = (FormSubmissionsDto) o;
    return equalsNullable(this.metadata, formSubmissionsDto.metadata) &&
        equalsNullable(this.submissions, formSubmissionsDto.submissions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(metadata), hashCodeNullable(submissions));
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
    sb.append("class FormSubmissionsDto {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    submissions: ").append(toIndentedString(submissions)).append("\n");
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

    // add `metadata` to the URL query string
    if (getMetadata() != null) {
      for (int i = 0; i < getMetadata().size(); i++) {
        if (getMetadata().get(i) != null) {
          joiner.add(getMetadata().get(i).toUrlQueryString(String.format("%smetadata%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `submissions` to the URL query string
    if (getSubmissions() != null) {
      for (int i = 0; i < getSubmissions().size(); i++) {
        if (getSubmissions().get(i) != null) {
          joiner.add(getSubmissions().get(i).toUrlQueryString(String.format("%ssubmissions%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

