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
import org.openapitools.client.model.MetadataConflictResolveType;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The parameters for assigning metadata templates.
 */
@JsonPropertyOrder({
  AssignMetadataTemplates.JSON_PROPERTY_TEMPLATE_IDS,
  AssignMetadataTemplates.JSON_PROPERTY_CASCADE,
  AssignMetadataTemplates.JSON_PROPERTY_CONFLICT_RESOLVE_TYPE
})

public class AssignMetadataTemplates {
  public static final String JSON_PROPERTY_TEMPLATE_IDS = "templateIds";
  @javax.annotation.Nullable  private List<Integer> templateIds;

  public static final String JSON_PROPERTY_CASCADE = "cascade";
  @javax.annotation.Nullable  private Boolean cascade;

  public static final String JSON_PROPERTY_CONFLICT_RESOLVE_TYPE = "conflictResolveType";
  @javax.annotation.Nullable  private MetadataConflictResolveType conflictResolveType;

  public AssignMetadataTemplates() {
  }


  public AssignMetadataTemplates templateIds(@javax.annotation.Nullable List<Integer> templateIds) {
    
    this.templateIds = templateIds;
    return this;
  }

  public AssignMetadataTemplates addTemplateIdsItem(Integer templateIdsItem) {
    if (this.templateIds == null) {
      this.templateIds = new ArrayList<>();
    }
    this.templateIds.add(templateIdsItem);
    return this;
  }

  /**
   * The metadata template IDs.
   * @return templateIds
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TEMPLATE_IDS, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Integer> getTemplateIds() {
    return templateIds;
  }


  @JsonProperty(value = JSON_PROPERTY_TEMPLATE_IDS, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTemplateIds(@javax.annotation.Nullable List<Integer> templateIds) {
    this.templateIds = templateIds;
  }

  public AssignMetadataTemplates cascade(@javax.annotation.Nullable Boolean cascade) {
    
    this.cascade = cascade;
    return this;
  }

  /**
   * Specifies if the templates are propagated to the folder sub-entries.
   * @return cascade
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CASCADE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCascade() {
    return cascade;
  }


  @JsonProperty(value = JSON_PROPERTY_CASCADE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCascade(@javax.annotation.Nullable Boolean cascade) {
    this.cascade = cascade;
  }

  public AssignMetadataTemplates conflictResolveType(@javax.annotation.Nullable MetadataConflictResolveType conflictResolveType) {
    
    this.conflictResolveType = conflictResolveType;
    return this;
  }

  /**
   * The conflict resolve type for the cascade assignment.
   * @return conflictResolveType
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CONFLICT_RESOLVE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MetadataConflictResolveType getConflictResolveType() {
    return conflictResolveType;
  }


  @JsonProperty(value = JSON_PROPERTY_CONFLICT_RESOLVE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConflictResolveType(@javax.annotation.Nullable MetadataConflictResolveType conflictResolveType) {
    this.conflictResolveType = conflictResolveType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssignMetadataTemplates assignMetadataTemplates = (AssignMetadataTemplates) o;
    return Objects.equals(this.templateIds, assignMetadataTemplates.templateIds) &&
        Objects.equals(this.cascade, assignMetadataTemplates.cascade) &&
        Objects.equals(this.conflictResolveType, assignMetadataTemplates.conflictResolveType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateIds, cascade, conflictResolveType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignMetadataTemplates {\n");
    sb.append("    templateIds: ").append(toIndentedString(templateIds)).append("\n");
    sb.append("    cascade: ").append(toIndentedString(cascade)).append("\n");
    sb.append("    conflictResolveType: ").append(toIndentedString(conflictResolveType)).append("\n");
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

    // add `templateIds` to the URL query string
    if (getTemplateIds() != null) {
      for (int i = 0; i < getTemplateIds().size(); i++) {
        try {
          joiner.add(String.format("%stemplateIds%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getTemplateIds().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `cascade` to the URL query string
    if (getCascade() != null) {
      try {
        joiner.add(String.format("%scascade%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCascade()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `conflictResolveType` to the URL query string
    if (getConflictResolveType() != null) {
      try {
        joiner.add(String.format("%sconflictResolveType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConflictResolveType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

