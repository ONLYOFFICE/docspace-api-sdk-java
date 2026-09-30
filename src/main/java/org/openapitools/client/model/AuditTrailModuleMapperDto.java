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
import org.openapitools.client.model.AuditTrailActionMapperDto;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The audit trail actions of one module.
 */
@JsonPropertyOrder({
  AuditTrailModuleMapperDto.JSON_PROPERTY_MODULE_TYPE,
  AuditTrailModuleMapperDto.JSON_PROPERTY_ACTIONS
})

public class AuditTrailModuleMapperDto {
  public static final String JSON_PROPERTY_MODULE_TYPE = "moduleType";
  @javax.annotation.Nullable  private JsonNullable<String> moduleType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ACTIONS = "actions";
  @javax.annotation.Nullable  private JsonNullable<List<AuditTrailActionMapperDto>> actions = JsonNullable.<List<AuditTrailActionMapperDto>>undefined();

  public AuditTrailModuleMapperDto() {
  }


  public AuditTrailModuleMapperDto moduleType(@javax.annotation.Nullable String moduleType) {
    this.moduleType = JsonNullable.<String>of(moduleType);
    
    return this;
  }

  /**
   * The location inside the product, as the `moduleType` filter of `GET api/2.0/security/audit/events/filter`  spells it.
   * @return moduleType
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getModuleType() {
        return moduleType.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_MODULE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getModuleType_JsonNullable() {
    return moduleType;
  }
  
  @JsonProperty(JSON_PROPERTY_MODULE_TYPE)
  public void setModuleType_JsonNullable(JsonNullable<String> moduleType) {
    this.moduleType = moduleType;
  }

  public void setModuleType(@javax.annotation.Nullable String moduleType) {
    this.moduleType = JsonNullable.<String>of(moduleType);
  }

  public AuditTrailModuleMapperDto actions(@javax.annotation.Nullable List<AuditTrailActionMapperDto> actions) {
    this.actions = JsonNullable.<List<AuditTrailActionMapperDto>>of(actions);
    
    return this;
  }

  public AuditTrailModuleMapperDto addActionsItem(AuditTrailActionMapperDto actionsItem) {
    if (this.actions == null || !this.actions.isPresent()) {
      this.actions = JsonNullable.<List<AuditTrailActionMapperDto>>of(new ArrayList<>());
    }
    try {
      this.actions.get().add(actionsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Every action this module can record. Each action appears under exactly one module, so this tree is where a  caller learns which module a given action belongs to.
   * @return actions
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<AuditTrailActionMapperDto> getActions() {
        return actions.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ACTIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<AuditTrailActionMapperDto>> getActions_JsonNullable() {
    return actions;
  }
  
  @JsonProperty(JSON_PROPERTY_ACTIONS)
  public void setActions_JsonNullable(JsonNullable<List<AuditTrailActionMapperDto>> actions) {
    this.actions = actions;
  }

  public void setActions(@javax.annotation.Nullable List<AuditTrailActionMapperDto> actions) {
    this.actions = JsonNullable.<List<AuditTrailActionMapperDto>>of(actions);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditTrailModuleMapperDto auditTrailModuleMapperDto = (AuditTrailModuleMapperDto) o;
    return equalsNullable(this.moduleType, auditTrailModuleMapperDto.moduleType) &&
        equalsNullable(this.actions, auditTrailModuleMapperDto.actions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(moduleType), hashCodeNullable(actions));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditTrailModuleMapperDto {\n");
    sb.append("    moduleType: ").append(toIndentedString(moduleType)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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

    // add `moduleType` to the URL query string
    if (getModuleType() != null) {
      try {
        joiner.add(String.format("%smoduleType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getModuleType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `actions` to the URL query string
    if (getActions() != null) {
      for (int i = 0; i < getActions().size(); i++) {
        if (getActions().get(i) != null) {
          joiner.add(getActions().get(i).toUrlQueryString(String.format("%sactions%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

