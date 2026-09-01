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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Represents the user limits of a DocsCloud license.
 */
@JsonPropertyOrder({
  DocsCloudUsersLimit.JSON_PROPERTY_EDIT,
  DocsCloudUsersLimit.JSON_PROPERTY_VIEW
})

public class DocsCloudUsersLimit {
  public static final String JSON_PROPERTY_EDIT = "edit";
  @javax.annotation.Nullable  private Integer edit;

  public static final String JSON_PROPERTY_VIEW = "view";
  @javax.annotation.Nullable  private Integer view;

  public DocsCloudUsersLimit() {
  }


  public DocsCloudUsersLimit edit(@javax.annotation.Nullable Integer edit) {
    
    this.edit = edit;
    return this;
  }

  /**
   * The maximum number of users who can edit documents.
   * @return edit
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_EDIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEdit() {
    return edit;
  }


  @JsonProperty(value = JSON_PROPERTY_EDIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEdit(@javax.annotation.Nullable Integer edit) {
    this.edit = edit;
  }

  public DocsCloudUsersLimit view(@javax.annotation.Nullable Integer view) {
    
    this.view = view;
    return this;
  }

  /**
   * The maximum number of users who can view documents.
   * @return view
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_VIEW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getView() {
    return view;
  }


  @JsonProperty(value = JSON_PROPERTY_VIEW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setView(@javax.annotation.Nullable Integer view) {
    this.view = view;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocsCloudUsersLimit docsCloudUsersLimit = (DocsCloudUsersLimit) o;
    return Objects.equals(this.edit, docsCloudUsersLimit.edit) &&
        Objects.equals(this.view, docsCloudUsersLimit.view);
  }

  @Override
  public int hashCode() {
    return Objects.hash(edit, view);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocsCloudUsersLimit {\n");
    sb.append("    edit: ").append(toIndentedString(edit)).append("\n");
    sb.append("    view: ").append(toIndentedString(view)).append("\n");
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

    // add `edit` to the URL query string
    if (getEdit() != null) {
      try {
        joiner.add(String.format("%sedit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEdit()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `view` to the URL query string
    if (getView() != null) {
      try {
        joiner.add(String.format("%sview%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getView()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

