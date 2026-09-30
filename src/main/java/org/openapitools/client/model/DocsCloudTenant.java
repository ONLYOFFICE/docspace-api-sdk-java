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
import java.time.OffsetDateTime;
import org.openapitools.client.model.DocsCloudPayment;
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
 * Represents a Docs Connect tenant of a portal.
 */
@JsonPropertyOrder({
  DocsCloudTenant.JSON_PROPERTY_DEDICATED_RESOURCE_EX_ID,
  DocsCloudTenant.JSON_PROPERTY_ALIAS,
  DocsCloudTenant.JSON_PROPERTY_NAME,
  DocsCloudTenant.JSON_PROPERTY_MODIFIED_DATE,
  DocsCloudTenant.JSON_PROPERTY_CUSTOMER_ID,
  DocsCloudTenant.JSON_PROPERTY_CUSTOMER_NAME,
  DocsCloudTenant.JSON_PROPERTY_END_DATE,
  DocsCloudTenant.JSON_PROPERTY_RESOURCE_TYPE,
  DocsCloudTenant.JSON_PROPERTY_IS_ACTIVE,
  DocsCloudTenant.JSON_PROPERTY_ADDRESS,
  DocsCloudTenant.JSON_PROPERTY_PAYMENT
})

public class DocsCloudTenant {
  public static final String JSON_PROPERTY_DEDICATED_RESOURCE_EX_ID = "dedicatedResourceExId";
  @javax.annotation.Nullable  private Integer dedicatedResourceExId;

  public static final String JSON_PROPERTY_ALIAS = "alias";
  @javax.annotation.Nullable  private JsonNullable<String> alias = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MODIFIED_DATE = "modifiedDate";
  @javax.annotation.Nullable  private OffsetDateTime modifiedDate;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customerId";
  @javax.annotation.Nullable  private JsonNullable<String> customerId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CUSTOMER_NAME = "customerName";
  @javax.annotation.Nullable  private JsonNullable<String> customerName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  @javax.annotation.Nullable  private OffsetDateTime endDate;

  public static final String JSON_PROPERTY_RESOURCE_TYPE = "resourceType";
  @javax.annotation.Nullable  private Integer resourceType;

  public static final String JSON_PROPERTY_IS_ACTIVE = "isActive";
  @javax.annotation.Nullable  private Boolean isActive;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  @javax.annotation.Nullable  private JsonNullable<String> address = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PAYMENT = "payment";
  @javax.annotation.Nullable  private DocsCloudPayment payment;

  public DocsCloudTenant() {
  }


  public DocsCloudTenant dedicatedResourceExId(@javax.annotation.Nullable Integer dedicatedResourceExId) {
    
    this.dedicatedResourceExId = dedicatedResourceExId;
    return this;
  }

  /**
   * The external ID of the dedicated resource the tenant is hosted on.
   * @return dedicatedResourceExId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DEDICATED_RESOURCE_EX_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDedicatedResourceExId() {
    return dedicatedResourceExId;
  }


  @JsonProperty(value = JSON_PROPERTY_DEDICATED_RESOURCE_EX_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDedicatedResourceExId(@javax.annotation.Nullable Integer dedicatedResourceExId) {
    this.dedicatedResourceExId = dedicatedResourceExId;
  }

  public DocsCloudTenant alias(@javax.annotation.Nullable String alias) {
    this.alias = JsonNullable.<String>of(alias);
    
    return this;
  }

  /**
   * The tenant alias.
   * @return alias
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getAlias() {
        return alias.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ALIAS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getAlias_JsonNullable() {
    return alias;
  }
  
  @JsonProperty(JSON_PROPERTY_ALIAS)
  public void setAlias_JsonNullable(JsonNullable<String> alias) {
    this.alias = alias;
  }

  public void setAlias(@javax.annotation.Nullable String alias) {
    this.alias = JsonNullable.<String>of(alias);
  }

  public DocsCloudTenant name(@javax.annotation.Nullable String name) {
    this.name = JsonNullable.<String>of(name);
    
    return this;
  }

  /**
   * The tenant name.
   * @return name
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = JsonNullable.<String>of(name);
  }

  public DocsCloudTenant modifiedDate(@javax.annotation.Nullable OffsetDateTime modifiedDate) {
    
    this.modifiedDate = modifiedDate;
    return this;
  }

  /**
   * The date and time when the tenant was last modified.
   * @return modifiedDate
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_MODIFIED_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }


  @JsonProperty(value = JSON_PROPERTY_MODIFIED_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModifiedDate(@javax.annotation.Nullable OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  public DocsCloudTenant customerId(@javax.annotation.Nullable String customerId) {
    this.customerId = JsonNullable.<String>of(customerId);
    
    return this;
  }

  /**
   * The customer ID.
   * @return customerId
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getCustomerId() {
        return customerId.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getCustomerId_JsonNullable() {
    return customerId;
  }
  
  @JsonProperty(JSON_PROPERTY_CUSTOMER_ID)
  public void setCustomerId_JsonNullable(JsonNullable<String> customerId) {
    this.customerId = customerId;
  }

  public void setCustomerId(@javax.annotation.Nullable String customerId) {
    this.customerId = JsonNullable.<String>of(customerId);
  }

  public DocsCloudTenant customerName(@javax.annotation.Nullable String customerName) {
    this.customerName = JsonNullable.<String>of(customerName);
    
    return this;
  }

  /**
   * The customer name.
   * @return customerName
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getCustomerName() {
        return customerName.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getCustomerName_JsonNullable() {
    return customerName;
  }
  
  @JsonProperty(JSON_PROPERTY_CUSTOMER_NAME)
  public void setCustomerName_JsonNullable(JsonNullable<String> customerName) {
    this.customerName = customerName;
  }

  public void setCustomerName(@javax.annotation.Nullable String customerName) {
    this.customerName = JsonNullable.<String>of(customerName);
  }

  public DocsCloudTenant endDate(@javax.annotation.Nullable OffsetDateTime endDate) {
    
    this.endDate = endDate;
    return this;
  }

  /**
   * The date and time when the tenant subscription ends.
   * @return endDate
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_END_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  @JsonProperty(value = JSON_PROPERTY_END_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndDate(@javax.annotation.Nullable OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public DocsCloudTenant resourceType(@javax.annotation.Nullable Integer resourceType) {
    
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The resource type.
   * @return resourceType
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_RESOURCE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getResourceType() {
    return resourceType;
  }


  @JsonProperty(value = JSON_PROPERTY_RESOURCE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResourceType(@javax.annotation.Nullable Integer resourceType) {
    this.resourceType = resourceType;
  }

  public DocsCloudTenant isActive(@javax.annotation.Nullable Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

  /**
   * Whether the tenant is active (the end date is in the future).
   * @return isActive
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IS_ACTIVE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsActive() {
    return isActive;
  }


  @JsonProperty(value = JSON_PROPERTY_IS_ACTIVE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsActive(@javax.annotation.Nullable Boolean isActive) {
    this.isActive = isActive;
  }

  public DocsCloudTenant address(@javax.annotation.Nullable String address) {
    this.address = JsonNullable.<String>of(address);
    
    return this;
  }

  /**
   * The tenant address.
   * @return address
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getAddress() {
        return address.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ADDRESS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getAddress_JsonNullable() {
    return address;
  }
  
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  public void setAddress_JsonNullable(JsonNullable<String> address) {
    this.address = address;
  }

  public void setAddress(@javax.annotation.Nullable String address) {
    this.address = JsonNullable.<String>of(address);
  }

  public DocsCloudTenant payment(@javax.annotation.Nullable DocsCloudPayment payment) {
    
    this.payment = payment;
    return this;
  }

  /**
   * The tenant payment information.
   * @return payment
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PAYMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DocsCloudPayment getPayment() {
    return payment;
  }


  @JsonProperty(value = JSON_PROPERTY_PAYMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayment(@javax.annotation.Nullable DocsCloudPayment payment) {
    this.payment = payment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocsCloudTenant docsCloudTenant = (DocsCloudTenant) o;
    return Objects.equals(this.dedicatedResourceExId, docsCloudTenant.dedicatedResourceExId) &&
        equalsNullable(this.alias, docsCloudTenant.alias) &&
        equalsNullable(this.name, docsCloudTenant.name) &&
        Objects.equals(this.modifiedDate, docsCloudTenant.modifiedDate) &&
        equalsNullable(this.customerId, docsCloudTenant.customerId) &&
        equalsNullable(this.customerName, docsCloudTenant.customerName) &&
        Objects.equals(this.endDate, docsCloudTenant.endDate) &&
        Objects.equals(this.resourceType, docsCloudTenant.resourceType) &&
        Objects.equals(this.isActive, docsCloudTenant.isActive) &&
        equalsNullable(this.address, docsCloudTenant.address) &&
        Objects.equals(this.payment, docsCloudTenant.payment);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dedicatedResourceExId, hashCodeNullable(alias), hashCodeNullable(name), modifiedDate, hashCodeNullable(customerId), hashCodeNullable(customerName), endDate, resourceType, isActive, hashCodeNullable(address), payment);
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
    sb.append("class DocsCloudTenant {\n");
    sb.append("    dedicatedResourceExId: ").append(toIndentedString(dedicatedResourceExId)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
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

    // add `dedicatedResourceExId` to the URL query string
    if (getDedicatedResourceExId() != null) {
      try {
        joiner.add(String.format("%sdedicatedResourceExId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDedicatedResourceExId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `alias` to the URL query string
    if (getAlias() != null) {
      try {
        joiner.add(String.format("%salias%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAlias()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `modifiedDate` to the URL query string
    if (getModifiedDate() != null) {
      try {
        joiner.add(String.format("%smodifiedDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getModifiedDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `customerId` to the URL query string
    if (getCustomerId() != null) {
      try {
        joiner.add(String.format("%scustomerId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCustomerId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `customerName` to the URL query string
    if (getCustomerName() != null) {
      try {
        joiner.add(String.format("%scustomerName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCustomerName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `endDate` to the URL query string
    if (getEndDate() != null) {
      try {
        joiner.add(String.format("%sendDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEndDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `resourceType` to the URL query string
    if (getResourceType() != null) {
      try {
        joiner.add(String.format("%sresourceType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getResourceType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isActive` to the URL query string
    if (getIsActive() != null) {
      try {
        joiner.add(String.format("%sisActive%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsActive()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `address` to the URL query string
    if (getAddress() != null) {
      try {
        joiner.add(String.format("%saddress%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAddress()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `payment` to the URL query string
    if (getPayment() != null) {
      joiner.add(getPayment().toUrlQueryString(prefix + "payment" + suffix));
    }

    return joiner.toString();
  }

}

