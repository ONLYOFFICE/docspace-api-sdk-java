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
import org.openapitools.client.model.AuditTrailModuleMapperDto;
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
 * The audit trail actions of one product, grouped by module.
 */
@JsonPropertyOrder({
  AuditTrailProductMapperDto.JSON_PROPERTY_PRODUCT_TYPE,
  AuditTrailProductMapperDto.JSON_PROPERTY_MODULES
})

public class AuditTrailProductMapperDto {
  public static final String JSON_PROPERTY_PRODUCT_TYPE = "productType";
  @javax.annotation.Nullable  private JsonNullable<String> productType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MODULES = "modules";
  @javax.annotation.Nullable  private JsonNullable<List<AuditTrailModuleMapperDto>> modules = JsonNullable.<List<AuditTrailModuleMapperDto>>undefined();

  public AuditTrailProductMapperDto() {
  }


  public AuditTrailProductMapperDto productType(@javax.annotation.Nullable String productType) {
    this.productType = JsonNullable.<String>of(productType);
    
    return this;
  }

  /**
   * The product this branch of the tree belongs to, as the `productType` filter of this operation spells it and  as `GET api/2.0/security/audit/types` lists it under `productTypes`.
   * @return productType
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getProductType() {
        return productType.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_PRODUCT_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getProductType_JsonNullable() {
    return productType;
  }
  
  @JsonProperty(JSON_PROPERTY_PRODUCT_TYPE)
  public void setProductType_JsonNullable(JsonNullable<String> productType) {
    this.productType = productType;
  }

  public void setProductType(@javax.annotation.Nullable String productType) {
    this.productType = JsonNullable.<String>of(productType);
  }

  public AuditTrailProductMapperDto modules(@javax.annotation.Nullable List<AuditTrailModuleMapperDto> modules) {
    this.modules = JsonNullable.<List<AuditTrailModuleMapperDto>>of(modules);
    
    return this;
  }

  public AuditTrailProductMapperDto addModulesItem(AuditTrailModuleMapperDto modulesItem) {
    if (this.modules == null || !this.modules.isPresent()) {
      this.modules = JsonNullable.<List<AuditTrailModuleMapperDto>>of(new ArrayList<>());
    }
    try {
      this.modules.get().add(modulesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The locations inside the product. It is empty when `moduleType` was passed and this product has no module  of that name, which is why a product can come back with nothing under it.
   * @return modules
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<AuditTrailModuleMapperDto> getModules() {
        return modules.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_MODULES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<AuditTrailModuleMapperDto>> getModules_JsonNullable() {
    return modules;
  }
  
  @JsonProperty(JSON_PROPERTY_MODULES)
  public void setModules_JsonNullable(JsonNullable<List<AuditTrailModuleMapperDto>> modules) {
    this.modules = modules;
  }

  public void setModules(@javax.annotation.Nullable List<AuditTrailModuleMapperDto> modules) {
    this.modules = JsonNullable.<List<AuditTrailModuleMapperDto>>of(modules);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditTrailProductMapperDto auditTrailProductMapperDto = (AuditTrailProductMapperDto) o;
    return equalsNullable(this.productType, auditTrailProductMapperDto.productType) &&
        equalsNullable(this.modules, auditTrailProductMapperDto.modules);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(productType), hashCodeNullable(modules));
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
    sb.append("class AuditTrailProductMapperDto {\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    modules: ").append(toIndentedString(modules)).append("\n");
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

    // add `productType` to the URL query string
    if (getProductType() != null) {
      try {
        joiner.add(String.format("%sproductType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProductType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `modules` to the URL query string
    if (getModules() != null) {
      for (int i = 0; i < getModules().size(); i++) {
        if (getModules().get(i) != null) {
          joiner.add(getModules().get(i).toUrlQueryString(String.format("%smodules%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

