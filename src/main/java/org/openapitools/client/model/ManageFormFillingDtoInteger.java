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
import org.openapitools.client.model.FormFillingManageAction;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The parameters for managing form filling.
 */
@JsonPropertyOrder({
  ManageFormFillingDtoInteger.JSON_PROPERTY_FORM_ID,
  ManageFormFillingDtoInteger.JSON_PROPERTY_ACTION
})

public class ManageFormFillingDtoInteger {
  public static final String JSON_PROPERTY_FORM_ID = "formId";
  @javax.annotation.Nonnull  private Integer formId;

  public static final String JSON_PROPERTY_ACTION = "action";
  @javax.annotation.Nullable  private FormFillingManageAction action;

  public ManageFormFillingDtoInteger() {
  }


  public ManageFormFillingDtoInteger formId(@javax.annotation.Nonnull Integer formId) {
    
    this.formId = formId;
    return this;
  }

  /**
   * The ID of the form to manage.
   * @return formId
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_FORM_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getFormId() {
    return formId;
  }


  @JsonProperty(value = JSON_PROPERTY_FORM_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFormId(@javax.annotation.Nonnull Integer formId) {
    this.formId = formId;
  }

  public ManageFormFillingDtoInteger action(@javax.annotation.Nullable FormFillingManageAction action) {
    
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ACTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FormFillingManageAction getAction() {
    return action;
  }


  @JsonProperty(value = JSON_PROPERTY_ACTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAction(@javax.annotation.Nullable FormFillingManageAction action) {
    this.action = action;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManageFormFillingDtoInteger manageFormFillingDtoInteger = (ManageFormFillingDtoInteger) o;
    return Objects.equals(this.formId, manageFormFillingDtoInteger.formId) &&
        Objects.equals(this.action, manageFormFillingDtoInteger.action);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formId, action);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManageFormFillingDtoInteger {\n");
    sb.append("    formId: ").append(toIndentedString(formId)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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

    // add `formId` to the URL query string
    if (getFormId() != null) {
      try {
        joiner.add(String.format("%sformId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFormId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `action` to the URL query string
    if (getAction() != null) {
      try {
        joiner.add(String.format("%saction%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAction()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

