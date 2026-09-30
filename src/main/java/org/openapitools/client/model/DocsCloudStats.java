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
import org.openapitools.client.model.DocsCloudUserStats;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Represents the usage statistics of a Docs Connect tenant for the current period.
 */
@JsonPropertyOrder({
  DocsCloudStats.JSON_PROPERTY_PERIOD_DAY,
  DocsCloudStats.JSON_PROPERTY_EDITOR,
  DocsCloudStats.JSON_PROPERTY_VIEWER
})

public class DocsCloudStats {
  public static final String JSON_PROPERTY_PERIOD_DAY = "periodDay";
  @javax.annotation.Nullable  private Integer periodDay;

  public static final String JSON_PROPERTY_EDITOR = "editor";
  @javax.annotation.Nullable  private DocsCloudUserStats editor;

  public static final String JSON_PROPERTY_VIEWER = "viewer";
  @javax.annotation.Nullable  private DocsCloudUserStats viewer;

  public DocsCloudStats() {
  }


  public DocsCloudStats periodDay(@javax.annotation.Nullable Integer periodDay) {
    
    this.periodDay = periodDay;
    return this;
  }

  /**
   * The length of the statistics period in days.
   * @return periodDay
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PERIOD_DAY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPeriodDay() {
    return periodDay;
  }


  @JsonProperty(value = JSON_PROPERTY_PERIOD_DAY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeriodDay(@javax.annotation.Nullable Integer periodDay) {
    this.periodDay = periodDay;
  }

  public DocsCloudStats editor(@javax.annotation.Nullable DocsCloudUserStats editor) {
    
    this.editor = editor;
    return this;
  }

  /**
   * The statistics for editor users.
   * @return editor
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_EDITOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DocsCloudUserStats getEditor() {
    return editor;
  }


  @JsonProperty(value = JSON_PROPERTY_EDITOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEditor(@javax.annotation.Nullable DocsCloudUserStats editor) {
    this.editor = editor;
  }

  public DocsCloudStats viewer(@javax.annotation.Nullable DocsCloudUserStats viewer) {
    
    this.viewer = viewer;
    return this;
  }

  /**
   * The statistics for viewer users.
   * @return viewer
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_VIEWER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DocsCloudUserStats getViewer() {
    return viewer;
  }


  @JsonProperty(value = JSON_PROPERTY_VIEWER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setViewer(@javax.annotation.Nullable DocsCloudUserStats viewer) {
    this.viewer = viewer;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocsCloudStats docsCloudStats = (DocsCloudStats) o;
    return Objects.equals(this.periodDay, docsCloudStats.periodDay) &&
        Objects.equals(this.editor, docsCloudStats.editor) &&
        Objects.equals(this.viewer, docsCloudStats.viewer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(periodDay, editor, viewer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocsCloudStats {\n");
    sb.append("    periodDay: ").append(toIndentedString(periodDay)).append("\n");
    sb.append("    editor: ").append(toIndentedString(editor)).append("\n");
    sb.append("    viewer: ").append(toIndentedString(viewer)).append("\n");
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

    // add `periodDay` to the URL query string
    if (getPeriodDay() != null) {
      try {
        joiner.add(String.format("%speriodDay%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPeriodDay()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `editor` to the URL query string
    if (getEditor() != null) {
      joiner.add(getEditor().toUrlQueryString(prefix + "editor" + suffix));
    }

    // add `viewer` to the URL query string
    if (getViewer() != null) {
      joiner.add(getViewer().toUrlQueryString(prefix + "viewer" + suffix));
    }

    return joiner.toString();
  }

}

