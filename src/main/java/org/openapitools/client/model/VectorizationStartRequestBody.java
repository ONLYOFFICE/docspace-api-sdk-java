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
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Parameters for submitting files for vectorization.
 */
@JsonPropertyOrder({
  VectorizationStartRequestBody.JSON_PROPERTY_FILES
})

public class VectorizationStartRequestBody {
  public static final String JSON_PROPERTY_FILES = "files";
  @javax.annotation.Nullable  private Set<Integer> files;

  public VectorizationStartRequestBody() {
  }


  public VectorizationStartRequestBody files(@javax.annotation.Nullable Set<Integer> files) {
    
    this.files = files;
    return this;
  }

  public VectorizationStartRequestBody addFilesItem(Integer filesItem) {
    if (this.files == null) {
      this.files = new LinkedHashSet<>();
    }
    this.files.add(filesItem);
    return this;
  }

  /**
   * The set of file identifiers to submit for vectorization.
   * @return files
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_FILES, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Set<Integer> getFiles() {
    return files;
  }


  @JsonProperty(value = JSON_PROPERTY_FILES, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFiles(@javax.annotation.Nullable Set<Integer> files) {
    this.files = files;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VectorizationStartRequestBody vectorizationStartRequestBody = (VectorizationStartRequestBody) o;
    return Objects.equals(this.files, vectorizationStartRequestBody.files);
  }

  @Override
  public int hashCode() {
    return Objects.hash(files);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VectorizationStartRequestBody {\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
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

    // add `files` to the URL query string
    if (getFiles() != null) {
      int i = 0;
      for (Integer _item : getFiles()) {
        try {
          joiner.add(String.format("%sfiles%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(_item), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
      i++;
    }

    return joiner.toString();
  }

}

