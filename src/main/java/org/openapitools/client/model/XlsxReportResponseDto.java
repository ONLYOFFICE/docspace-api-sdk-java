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
import org.openapitools.client.model.DocumentBuilderTaskDto;
import org.openapitools.client.model.FileDtoInteger;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The XLSX report task response parameters.
 */
@JsonPropertyOrder({
  XlsxReportResponseDto.JSON_PROPERTY_FORM,
  XlsxReportResponseDto.JSON_PROPERTY_TASK,
  XlsxReportResponseDto.JSON_PROPERTY_IS_NEW_FILE
})

public class XlsxReportResponseDto {
  public static final String JSON_PROPERTY_FORM = "form";
  @javax.annotation.Nullable  private FileDtoInteger form;

  public static final String JSON_PROPERTY_TASK = "task";
  @javax.annotation.Nullable  private DocumentBuilderTaskDto task;

  public static final String JSON_PROPERTY_IS_NEW_FILE = "isNewFile";
  @javax.annotation.Nullable  private Boolean isNewFile;

  public XlsxReportResponseDto() {
  }


  public XlsxReportResponseDto form(@javax.annotation.Nullable FileDtoInteger form) {
    
    this.form = form;
    return this;
  }

  /**
   * Get form
   * @return form
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_FORM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FileDtoInteger getForm() {
    return form;
  }


  @JsonProperty(value = JSON_PROPERTY_FORM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForm(@javax.annotation.Nullable FileDtoInteger form) {
    this.form = form;
  }

  public XlsxReportResponseDto task(@javax.annotation.Nullable DocumentBuilderTaskDto task) {
    
    this.task = task;
    return this;
  }

  /**
   * Get task
   * @return task
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TASK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DocumentBuilderTaskDto getTask() {
    return task;
  }


  @JsonProperty(value = JSON_PROPERTY_TASK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTask(@javax.annotation.Nullable DocumentBuilderTaskDto task) {
    this.task = task;
  }

  public XlsxReportResponseDto isNewFile(@javax.annotation.Nullable Boolean isNewFile) {
    
    this.isNewFile = isNewFile;
    return this;
  }

  /**
   * Specifies whether the XLSX report file is newly created or an existing file will be updated.
   * @return isNewFile
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IS_NEW_FILE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsNewFile() {
    return isNewFile;
  }


  @JsonProperty(value = JSON_PROPERTY_IS_NEW_FILE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsNewFile(@javax.annotation.Nullable Boolean isNewFile) {
    this.isNewFile = isNewFile;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XlsxReportResponseDto xlsxReportResponseDto = (XlsxReportResponseDto) o;
    return Objects.equals(this.form, xlsxReportResponseDto.form) &&
        Objects.equals(this.task, xlsxReportResponseDto.task) &&
        Objects.equals(this.isNewFile, xlsxReportResponseDto.isNewFile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(form, task, isNewFile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XlsxReportResponseDto {\n");
    sb.append("    form: ").append(toIndentedString(form)).append("\n");
    sb.append("    task: ").append(toIndentedString(task)).append("\n");
    sb.append("    isNewFile: ").append(toIndentedString(isNewFile)).append("\n");
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

    // add `form` to the URL query string
    if (getForm() != null) {
      joiner.add(getForm().toUrlQueryString(prefix + "form" + suffix));
    }

    // add `task` to the URL query string
    if (getTask() != null) {
      joiner.add(getTask().toUrlQueryString(prefix + "task" + suffix));
    }

    // add `isNewFile` to the URL query string
    if (getIsNewFile() != null) {
      try {
        joiner.add(String.format("%sisNewFile%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsNewFile()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

