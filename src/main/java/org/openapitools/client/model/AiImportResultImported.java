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
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * AiImportResultImported
 */
@JsonPropertyOrder({
  AiImportResultImported.JSON_PROPERTY_FOLDERS,
  AiImportResultImported.JSON_PROPERTY_PROMPTS
})
@JsonTypeName("AiImportResult_imported")

public class AiImportResultImported {
  public static final String JSON_PROPERTY_FOLDERS = "folders";
  @javax.annotation.Nonnull  private BigDecimal folders;

  public static final String JSON_PROPERTY_PROMPTS = "prompts";
  @javax.annotation.Nonnull  private BigDecimal prompts;

  public AiImportResultImported() {
  }


  public AiImportResultImported folders(@javax.annotation.Nonnull BigDecimal folders) {
    
    this.folders = folders;
    return this;
  }

  /**
   * Get folders
   * @return folders
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_FOLDERS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getFolders() {
    return folders;
  }


  @JsonProperty(value = JSON_PROPERTY_FOLDERS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFolders(@javax.annotation.Nonnull BigDecimal folders) {
    this.folders = folders;
  }

  public AiImportResultImported prompts(@javax.annotation.Nonnull BigDecimal prompts) {
    
    this.prompts = prompts;
    return this;
  }

  /**
   * Get prompts
   * @return prompts
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_PROMPTS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getPrompts() {
    return prompts;
  }


  @JsonProperty(value = JSON_PROPERTY_PROMPTS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPrompts(@javax.annotation.Nonnull BigDecimal prompts) {
    this.prompts = prompts;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiImportResultImported aiImportResultImported = (AiImportResultImported) o;
    return Objects.equals(this.folders, aiImportResultImported.folders) &&
        Objects.equals(this.prompts, aiImportResultImported.prompts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(folders, prompts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiImportResultImported {\n");
    sb.append("    folders: ").append(toIndentedString(folders)).append("\n");
    sb.append("    prompts: ").append(toIndentedString(prompts)).append("\n");
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

    // add `folders` to the URL query string
    if (getFolders() != null) {
      try {
        joiner.add(String.format("%sfolders%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFolders()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `prompts` to the URL query string
    if (getPrompts() != null) {
      try {
        joiner.add(String.format("%sprompts%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPrompts()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

