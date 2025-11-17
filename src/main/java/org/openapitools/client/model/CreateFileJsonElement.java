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
 * The parameters for creating a file.
 */
@JsonPropertyOrder({
  CreateFileJsonElement.JSON_PROPERTY_TITLE,
  CreateFileJsonElement.JSON_PROPERTY_TEMPLATE_ID,
  CreateFileJsonElement.JSON_PROPERTY_ENABLE_EXTERNAL_EXT,
  CreateFileJsonElement.JSON_PROPERTY_FORM_ID
})

public class CreateFileJsonElement {
  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable
  private String title;

  public static final String JSON_PROPERTY_TEMPLATE_ID = "templateId";
  @javax.annotation.Nullable
  private Integer templateId;

  public static final String JSON_PROPERTY_ENABLE_EXTERNAL_EXT = "enableExternalExt";
  @javax.annotation.Nullable
  private Boolean enableExternalExt;

  public static final String JSON_PROPERTY_FORM_ID = "formId";
  @javax.annotation.Nullable
  private Integer formId;

  public CreateFileJsonElement() {
  }

  public CreateFileJsonElement title(@javax.annotation.Nullable String title) {
    
    this.title = title;
    return this;
  }

  /**
   * The file title for creation.
   * @return title
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTitle(@javax.annotation.Nullable String title) {
    this.title = title;
  }

  public CreateFileJsonElement templateId(@javax.annotation.Nullable Integer templateId) {
    
    this.templateId = templateId;
    return this;
  }

  /**
   * Get templateId
   * @return templateId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEMPLATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTemplateId() {
    return templateId;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTemplateId(@javax.annotation.Nullable Integer templateId) {
    this.templateId = templateId;
  }

  public CreateFileJsonElement enableExternalExt(@javax.annotation.Nullable Boolean enableExternalExt) {
    
    this.enableExternalExt = enableExternalExt;
    return this;
  }

  /**
   * Specifies whether to allow creating a file of an external extension or not.
   * @return enableExternalExt
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLE_EXTERNAL_EXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnableExternalExt() {
    return enableExternalExt;
  }


  @JsonProperty(JSON_PROPERTY_ENABLE_EXTERNAL_EXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnableExternalExt(@javax.annotation.Nullable Boolean enableExternalExt) {
    this.enableExternalExt = enableExternalExt;
  }

  public CreateFileJsonElement formId(@javax.annotation.Nullable Integer formId) {
    
    this.formId = formId;
    return this;
  }

  /**
   * The form ID for creation.
   * @return formId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFormId() {
    return formId;
  }


  @JsonProperty(JSON_PROPERTY_FORM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormId(@javax.annotation.Nullable Integer formId) {
    this.formId = formId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFileJsonElement createFileJsonElement = (CreateFileJsonElement) o;
    return Objects.equals(this.title, createFileJsonElement.title) &&
        Objects.equals(this.templateId, createFileJsonElement.templateId) &&
        Objects.equals(this.enableExternalExt, createFileJsonElement.enableExternalExt) &&
        Objects.equals(this.formId, createFileJsonElement.formId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, templateId, enableExternalExt, formId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFileJsonElement {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    enableExternalExt: ").append(toIndentedString(enableExternalExt)).append("\n");
    sb.append("    formId: ").append(toIndentedString(formId)).append("\n");
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

    // add `title` to the URL query string
    if (getTitle() != null) {
      try {
        joiner.add(String.format("%stitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTitle()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `templateId` to the URL query string
    if (getTemplateId() != null) {
      try {
        joiner.add(String.format("%stemplateId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTemplateId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `enableExternalExt` to the URL query string
    if (getEnableExternalExt() != null) {
      try {
        joiner.add(String.format("%senableExternalExt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnableExternalExt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `formId` to the URL query string
    if (getFormId() != null) {
      try {
        joiner.add(String.format("%sformId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFormId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

