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
import org.openapitools.client.model.AiMetaGenerate200ResponseFieldsInner;
import org.openapitools.client.model.AiMetaGenerate200ResponseSkippedInner;
import org.openapitools.client.model.AiMetaGenerate200ResponseSourcesInner;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * AiMetaGenerate200Response
 */
@JsonPropertyOrder({
  AiMetaGenerate200Response.JSON_PROPERTY_FIELDS,
  AiMetaGenerate200Response.JSON_PROPERTY_SOURCES,
  AiMetaGenerate200Response.JSON_PROPERTY_SKIPPED
})
@JsonTypeName("aiMetaGenerate_200_response")

public class AiMetaGenerate200Response {
  public static final String JSON_PROPERTY_FIELDS = "fields";
  @javax.annotation.Nonnull  private List<AiMetaGenerate200ResponseFieldsInner> fields = new ArrayList<>();

  public static final String JSON_PROPERTY_SOURCES = "sources";
  @javax.annotation.Nonnull  private List<AiMetaGenerate200ResponseSourcesInner> sources = new ArrayList<>();

  public static final String JSON_PROPERTY_SKIPPED = "skipped";
  @javax.annotation.Nonnull  private List<AiMetaGenerate200ResponseSkippedInner> skipped = new ArrayList<>();

  public AiMetaGenerate200Response() {
  }


  public AiMetaGenerate200Response fields(@javax.annotation.Nonnull List<AiMetaGenerate200ResponseFieldsInner> fields) {
    
    this.fields = fields;
    return this;
  }

  public AiMetaGenerate200Response addFieldsItem(AiMetaGenerate200ResponseFieldsInner fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

  /**
   * The proposed custom metadata fields with the values the text supports.
   * @return fields
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_FIELDS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<AiMetaGenerate200ResponseFieldsInner> getFields() {
    return fields;
  }


  @JsonProperty(value = JSON_PROPERTY_FIELDS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFields(@javax.annotation.Nonnull List<AiMetaGenerate200ResponseFieldsInner> fields) {
    this.fields = fields;
  }

  public AiMetaGenerate200Response sources(@javax.annotation.Nonnull List<AiMetaGenerate200ResponseSourcesInner> sources) {
    
    this.sources = sources;
    return this;
  }

  public AiMetaGenerate200Response addSourcesItem(AiMetaGenerate200ResponseSourcesInner sourcesItem) {
    if (this.sources == null) {
      this.sources = new ArrayList<>();
    }
    this.sources.add(sourcesItem);
    return this;
  }

  /**
   * The documents the proposal was read from.
   * @return sources
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_SOURCES, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<AiMetaGenerate200ResponseSourcesInner> getSources() {
    return sources;
  }


  @JsonProperty(value = JSON_PROPERTY_SOURCES, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSources(@javax.annotation.Nonnull List<AiMetaGenerate200ResponseSourcesInner> sources) {
    this.sources = sources;
  }

  public AiMetaGenerate200Response skipped(@javax.annotation.Nonnull List<AiMetaGenerate200ResponseSkippedInner> skipped) {
    
    this.skipped = skipped;
    return this;
  }

  public AiMetaGenerate200Response addSkippedItem(AiMetaGenerate200ResponseSkippedInner skippedItem) {
    if (this.skipped == null) {
      this.skipped = new ArrayList<>();
    }
    this.skipped.add(skippedItem);
    return this;
  }

  /**
   * The entries that were left out, with the reason for each.
   * @return skipped
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_SKIPPED, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<AiMetaGenerate200ResponseSkippedInner> getSkipped() {
    return skipped;
  }


  @JsonProperty(value = JSON_PROPERTY_SKIPPED, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSkipped(@javax.annotation.Nonnull List<AiMetaGenerate200ResponseSkippedInner> skipped) {
    this.skipped = skipped;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiMetaGenerate200Response aiMetaGenerate200Response = (AiMetaGenerate200Response) o;
    return Objects.equals(this.fields, aiMetaGenerate200Response.fields) &&
        Objects.equals(this.sources, aiMetaGenerate200Response.sources) &&
        Objects.equals(this.skipped, aiMetaGenerate200Response.skipped);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields, sources, skipped);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiMetaGenerate200Response {\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    skipped: ").append(toIndentedString(skipped)).append("\n");
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

    // add `fields` to the URL query string
    if (getFields() != null) {
      for (int i = 0; i < getFields().size(); i++) {
        if (getFields().get(i) != null) {
          joiner.add(getFields().get(i).toUrlQueryString(String.format("%sfields%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `sources` to the URL query string
    if (getSources() != null) {
      for (int i = 0; i < getSources().size(); i++) {
        if (getSources().get(i) != null) {
          joiner.add(getSources().get(i).toUrlQueryString(String.format("%ssources%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `skipped` to the URL query string
    if (getSkipped() != null) {
      for (int i = 0; i < getSkipped().size(); i++) {
        if (getSkipped().get(i) != null) {
          joiner.add(getSkipped().get(i).toUrlQueryString(String.format("%sskipped%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

