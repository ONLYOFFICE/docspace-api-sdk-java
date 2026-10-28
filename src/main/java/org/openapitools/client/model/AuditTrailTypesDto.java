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
 * The vocabularies the audit and login-history filters accept, one array of names per dimension of an event.
 */
@JsonPropertyOrder({
  AuditTrailTypesDto.JSON_PROPERTY_ACTIONS,
  AuditTrailTypesDto.JSON_PROPERTY_ACTION_TYPES,
  AuditTrailTypesDto.JSON_PROPERTY_PRODUCT_TYPES,
  AuditTrailTypesDto.JSON_PROPERTY_MODULE_TYPES,
  AuditTrailTypesDto.JSON_PROPERTY_ENTRY_TYPES
})

public class AuditTrailTypesDto {
  public static final String JSON_PROPERTY_ACTIONS = "actions";
  @javax.annotation.Nullable  private JsonNullable<List<String>> actions = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_ACTION_TYPES = "actionTypes";
  @javax.annotation.Nullable  private JsonNullable<List<String>> actionTypes = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_PRODUCT_TYPES = "productTypes";
  @javax.annotation.Nullable  private JsonNullable<List<String>> productTypes = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_MODULE_TYPES = "moduleTypes";
  @javax.annotation.Nullable  private JsonNullable<List<String>> moduleTypes = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_ENTRY_TYPES = "entryTypes";
  @javax.annotation.Nullable  private JsonNullable<List<String>> entryTypes = JsonNullable.<List<String>>undefined();

  public AuditTrailTypesDto() {
  }


  public AuditTrailTypesDto actions(@javax.annotation.Nullable List<String> actions) {
    this.actions = JsonNullable.<List<String>>of(actions);
    
    return this;
  }

  public AuditTrailTypesDto addActionsItem(String actionsItem) {
    if (this.actions == null || !this.actions.isPresent()) {
      this.actions = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.actions.get().add(actionsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Every action name the build can record, spelled as the `action` filter of  `GET api/2.0/security/audit/events/filter` and `GET api/2.0/security/audit/login/filter` expects it. It is  the whole vocabulary, not the actions this portal has recorded, and only a handful of the names are the  sign-in actions the login filter accepts.
   * @return actions
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<String> getActions() {
        return actions.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ACTIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getActions_JsonNullable() {
    return actions;
  }
  
  @JsonProperty(JSON_PROPERTY_ACTIONS)
  public void setActions_JsonNullable(JsonNullable<List<String>> actions) {
    this.actions = actions;
  }

  public void setActions(@javax.annotation.Nullable List<String> actions) {
    this.actions = JsonNullable.<List<String>>of(actions);
  }

  public AuditTrailTypesDto actionTypes(@javax.annotation.Nullable List<String> actionTypes) {
    this.actionTypes = JsonNullable.<List<String>>of(actionTypes);
    
    return this;
  }

  public AuditTrailTypesDto addActionTypesItem(String actionTypesItem) {
    if (this.actionTypes == null || !this.actionTypes.isPresent()) {
      this.actionTypes = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.actionTypes.get().add(actionTypesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The kinds of change an action can stand for, spelled as the `actionType` filter of  `GET api/2.0/security/audit/events/filter` expects it.
   * @return actionTypes
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<String> getActionTypes() {
        return actionTypes.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ACTION_TYPES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getActionTypes_JsonNullable() {
    return actionTypes;
  }
  
  @JsonProperty(JSON_PROPERTY_ACTION_TYPES)
  public void setActionTypes_JsonNullable(JsonNullable<List<String>> actionTypes) {
    this.actionTypes = actionTypes;
  }

  public void setActionTypes(@javax.annotation.Nullable List<String> actionTypes) {
    this.actionTypes = JsonNullable.<List<String>>of(actionTypes);
  }

  public AuditTrailTypesDto productTypes(@javax.annotation.Nullable List<String> productTypes) {
    this.productTypes = JsonNullable.<List<String>>of(productTypes);
    
    return this;
  }

  public AuditTrailTypesDto addProductTypesItem(String productTypesItem) {
    if (this.productTypes == null || !this.productTypes.isPresent()) {
      this.productTypes = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.productTypes.get().add(productTypesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The products an action can belong to, spelled as the `productType` filter of  `GET api/2.0/security/audit/mappers` expects it. The audit trail itself cannot be filtered by product.
   * @return productTypes
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<String> getProductTypes() {
        return productTypes.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_PRODUCT_TYPES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getProductTypes_JsonNullable() {
    return productTypes;
  }
  
  @JsonProperty(JSON_PROPERTY_PRODUCT_TYPES)
  public void setProductTypes_JsonNullable(JsonNullable<List<String>> productTypes) {
    this.productTypes = productTypes;
  }

  public void setProductTypes(@javax.annotation.Nullable List<String> productTypes) {
    this.productTypes = JsonNullable.<List<String>>of(productTypes);
  }

  public AuditTrailTypesDto moduleTypes(@javax.annotation.Nullable List<String> moduleTypes) {
    this.moduleTypes = JsonNullable.<List<String>>of(moduleTypes);
    
    return this;
  }

  public AuditTrailTypesDto addModuleTypesItem(String moduleTypesItem) {
    if (this.moduleTypes == null || !this.moduleTypes.isPresent()) {
      this.moduleTypes = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.moduleTypes.get().add(moduleTypesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The locations inside those products, spelled as the `moduleType` filter of  `GET api/2.0/security/audit/events/filter` and `GET api/2.0/security/audit/mappers` expects it.
   * @return moduleTypes
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<String> getModuleTypes() {
        return moduleTypes.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_MODULE_TYPES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getModuleTypes_JsonNullable() {
    return moduleTypes;
  }
  
  @JsonProperty(JSON_PROPERTY_MODULE_TYPES)
  public void setModuleTypes_JsonNullable(JsonNullable<List<String>> moduleTypes) {
    this.moduleTypes = moduleTypes;
  }

  public void setModuleTypes(@javax.annotation.Nullable List<String> moduleTypes) {
    this.moduleTypes = JsonNullable.<List<String>>of(moduleTypes);
  }

  public AuditTrailTypesDto entryTypes(@javax.annotation.Nullable List<String> entryTypes) {
    this.entryTypes = JsonNullable.<List<String>>of(entryTypes);
    
    return this;
  }

  public AuditTrailTypesDto addEntryTypesItem(String entryTypesItem) {
    if (this.entryTypes == null || !this.entryTypes.isPresent()) {
      this.entryTypes = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.entryTypes.get().add(entryTypesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The kinds of object an action can be applied to, spelled as the `entryType` filter of  `GET api/2.0/security/audit/events/filter` expects it.
   * @return entryTypes
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<String> getEntryTypes() {
        return entryTypes.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ENTRY_TYPES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getEntryTypes_JsonNullable() {
    return entryTypes;
  }
  
  @JsonProperty(JSON_PROPERTY_ENTRY_TYPES)
  public void setEntryTypes_JsonNullable(JsonNullable<List<String>> entryTypes) {
    this.entryTypes = entryTypes;
  }

  public void setEntryTypes(@javax.annotation.Nullable List<String> entryTypes) {
    this.entryTypes = JsonNullable.<List<String>>of(entryTypes);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditTrailTypesDto auditTrailTypesDto = (AuditTrailTypesDto) o;
    return equalsNullable(this.actions, auditTrailTypesDto.actions) &&
        equalsNullable(this.actionTypes, auditTrailTypesDto.actionTypes) &&
        equalsNullable(this.productTypes, auditTrailTypesDto.productTypes) &&
        equalsNullable(this.moduleTypes, auditTrailTypesDto.moduleTypes) &&
        equalsNullable(this.entryTypes, auditTrailTypesDto.entryTypes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(actions), hashCodeNullable(actionTypes), hashCodeNullable(productTypes), hashCodeNullable(moduleTypes), hashCodeNullable(entryTypes));
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
    sb.append("class AuditTrailTypesDto {\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    actionTypes: ").append(toIndentedString(actionTypes)).append("\n");
    sb.append("    productTypes: ").append(toIndentedString(productTypes)).append("\n");
    sb.append("    moduleTypes: ").append(toIndentedString(moduleTypes)).append("\n");
    sb.append("    entryTypes: ").append(toIndentedString(entryTypes)).append("\n");
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

    // add `actions` to the URL query string
    if (getActions() != null) {
      for (int i = 0; i < getActions().size(); i++) {
        try {
          joiner.add(String.format("%sactions%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getActions().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `actionTypes` to the URL query string
    if (getActionTypes() != null) {
      for (int i = 0; i < getActionTypes().size(); i++) {
        try {
          joiner.add(String.format("%sactionTypes%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getActionTypes().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `productTypes` to the URL query string
    if (getProductTypes() != null) {
      for (int i = 0; i < getProductTypes().size(); i++) {
        try {
          joiner.add(String.format("%sproductTypes%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getProductTypes().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `moduleTypes` to the URL query string
    if (getModuleTypes() != null) {
      for (int i = 0; i < getModuleTypes().size(); i++) {
        try {
          joiner.add(String.format("%smoduleTypes%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getModuleTypes().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `entryTypes` to the URL query string
    if (getEntryTypes() != null) {
      for (int i = 0; i < getEntryTypes().size(); i++) {
        try {
          joiner.add(String.format("%sentryTypes%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getEntryTypes().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}

