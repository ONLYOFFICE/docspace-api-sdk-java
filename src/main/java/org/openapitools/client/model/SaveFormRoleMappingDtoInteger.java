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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.FormRole;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The parameters for saving form role mapping.
 */
@JsonPropertyOrder({
  SaveFormRoleMappingDtoInteger.JSON_PROPERTY_FORM_ID,
  SaveFormRoleMappingDtoInteger.JSON_PROPERTY_ROLES
})

public class SaveFormRoleMappingDtoInteger {
  public static final String JSON_PROPERTY_FORM_ID = "formId";
  @javax.annotation.Nonnull
  private Integer formId;

  public static final String JSON_PROPERTY_ROLES = "roles";
  @javax.annotation.Nullable
  private List<FormRole> roles;

  public SaveFormRoleMappingDtoInteger() {
  }


  public SaveFormRoleMappingDtoInteger formId(@javax.annotation.Nonnull Integer formId) {
    
    this.formId = formId;
    return this;
  }

  /**
   * The form ID.
   * @return formId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FORM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getFormId() {
    return formId;
  }


  @JsonProperty(JSON_PROPERTY_FORM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFormId(@javax.annotation.Nonnull Integer formId) {
    this.formId = formId;
  }

  public SaveFormRoleMappingDtoInteger roles(@javax.annotation.Nullable List<FormRole> roles) {
    
    this.roles = roles;
    return this;
  }

  public SaveFormRoleMappingDtoInteger addRolesItem(FormRole rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * The collection of roles.
   * @return roles
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROLES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<FormRole> getRoles() {
    return roles;
  }


  @JsonProperty(JSON_PROPERTY_ROLES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRoles(@javax.annotation.Nullable List<FormRole> roles) {
    this.roles = roles;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaveFormRoleMappingDtoInteger saveFormRoleMappingDtoInteger = (SaveFormRoleMappingDtoInteger) o;
    return Objects.equals(this.formId, saveFormRoleMappingDtoInteger.formId) &&
        Objects.equals(this.roles, saveFormRoleMappingDtoInteger.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formId, roles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaveFormRoleMappingDtoInteger {\n");
    sb.append("    formId: ").append(toIndentedString(formId)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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

    // add `roles` to the URL query string
    if (getRoles() != null) {
      for (int i = 0; i < getRoles().size(); i++) {
        if (getRoles().get(i) != null) {
          joiner.add(getRoles().get(i).toUrlQueryString(String.format("%sroles%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

