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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The parameters for starting file editing.
 */
@JsonPropertyOrder({
  StartEdit.JSON_PROPERTY_EDITING_ALONE
})

public class StartEdit {
  public static final String JSON_PROPERTY_EDITING_ALONE = "editingAlone";
  @javax.annotation.Nullable
  private Boolean editingAlone;

  public StartEdit() {
  }

  public StartEdit editingAlone(@javax.annotation.Nullable Boolean editingAlone) {
    
    this.editingAlone = editingAlone;
    return this;
  }

  /**
   * Specifies whether to share the file with other users for editing or not.
   * @return editingAlone
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EDITING_ALONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEditingAlone() {
    return editingAlone;
  }


  @JsonProperty(JSON_PROPERTY_EDITING_ALONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEditingAlone(@javax.annotation.Nullable Boolean editingAlone) {
    this.editingAlone = editingAlone;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartEdit startEdit = (StartEdit) o;
    return Objects.equals(this.editingAlone, startEdit.editingAlone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(editingAlone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartEdit {\n");
    sb.append("    editingAlone: ").append(toIndentedString(editingAlone)).append("\n");
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

    // add `editingAlone` to the URL query string
    if (getEditingAlone() != null) {
      try {
        joiner.add(String.format("%seditingAlone%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEditingAlone()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

