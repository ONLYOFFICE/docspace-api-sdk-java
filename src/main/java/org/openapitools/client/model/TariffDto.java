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
import org.openapitools.client.model.ApiDateTime;
import org.openapitools.client.model.TariffQuotaDto;
import org.openapitools.client.model.TariffState;
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
 * The subscription this portal runs on: its state, the end of the current period, and the quotas it is made of.
 */
@JsonPropertyOrder({
  TariffDto.JSON_PROPERTY_OPEN_SOURCE,
  TariffDto.JSON_PROPERTY_ENTERPRISE,
  TariffDto.JSON_PROPERTY_DEVELOPER,
  TariffDto.JSON_PROPERTY_ID,
  TariffDto.JSON_PROPERTY_STATE,
  TariffDto.JSON_PROPERTY_DUE_DATE,
  TariffDto.JSON_PROPERTY_DELAY_DUE_DATE,
  TariffDto.JSON_PROPERTY_LICENSE_DATE,
  TariffDto.JSON_PROPERTY_CUSTOMER_ID,
  TariffDto.JSON_PROPERTY_QUOTAS
})

public class TariffDto {
  public static final String JSON_PROPERTY_OPEN_SOURCE = "openSource";
  @javax.annotation.Nullable  private JsonNullable<Boolean> openSource = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_ENTERPRISE = "enterprise";
  @javax.annotation.Nullable  private JsonNullable<Boolean> enterprise = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_DEVELOPER = "developer";
  @javax.annotation.Nullable  private JsonNullable<Boolean> developer = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable  private Integer id;

  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nullable  private TariffState state;

  public static final String JSON_PROPERTY_DUE_DATE = "dueDate";
  @javax.annotation.Nullable  private ApiDateTime dueDate;

  public static final String JSON_PROPERTY_DELAY_DUE_DATE = "delayDueDate";
  @javax.annotation.Nullable  private ApiDateTime delayDueDate;

  public static final String JSON_PROPERTY_LICENSE_DATE = "licenseDate";
  @javax.annotation.Nullable  private ApiDateTime licenseDate;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customerId";
  @javax.annotation.Nullable  private JsonNullable<String> customerId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_QUOTAS = "quotas";
  @javax.annotation.Nullable  private JsonNullable<List<TariffQuotaDto>> quotas = JsonNullable.<List<TariffQuotaDto>>undefined();

  public TariffDto() {
  }


  public TariffDto openSource(@javax.annotation.Nullable Boolean openSource) {
    this.openSource = JsonNullable.<Boolean>of(openSource);
    
    return this;
  }

  /**
   * Whether the installation runs the open-source build, which has no paid plan at all. This flag and the two  below describe the build rather than the subscription, and all three are left empty for a caller without  the portal-settings right.
   * @return openSource
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getOpenSource() {
        return openSource.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_OPEN_SOURCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getOpenSource_JsonNullable() {
    return openSource;
  }
  
  @JsonProperty(JSON_PROPERTY_OPEN_SOURCE)
  public void setOpenSource_JsonNullable(JsonNullable<Boolean> openSource) {
    this.openSource = openSource;
  }

  public void setOpenSource(@javax.annotation.Nullable Boolean openSource) {
    this.openSource = JsonNullable.<Boolean>of(openSource);
  }

  public TariffDto enterprise(@javax.annotation.Nullable Boolean enterprise) {
    this.enterprise = JsonNullable.<Boolean>of(enterprise);
    
    return this;
  }

  /**
   * Whether the installation runs on an Enterprise licence file, which is what makes the licence operations  under `api/2.0/settings/license` usable.
   * @return enterprise
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getEnterprise() {
        return enterprise.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ENTERPRISE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getEnterprise_JsonNullable() {
    return enterprise;
  }
  
  @JsonProperty(JSON_PROPERTY_ENTERPRISE)
  public void setEnterprise_JsonNullable(JsonNullable<Boolean> enterprise) {
    this.enterprise = enterprise;
  }

  public void setEnterprise(@javax.annotation.Nullable Boolean enterprise) {
    this.enterprise = JsonNullable.<Boolean>of(enterprise);
  }

  public TariffDto developer(@javax.annotation.Nullable Boolean developer) {
    this.developer = JsonNullable.<Boolean>of(developer);
    
    return this;
  }

  /**
   * Whether the installation runs on a Developer licence, an Enterprise licence meant for embedding rather  than for production use.
   * @return developer
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getDeveloper() {
        return developer.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_DEVELOPER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getDeveloper_JsonNullable() {
    return developer;
  }
  
  @JsonProperty(JSON_PROPERTY_DEVELOPER)
  public void setDeveloper_JsonNullable(JsonNullable<Boolean> developer) {
    this.developer = developer;
  }

  public void setDeveloper(@javax.annotation.Nullable Boolean developer) {
    this.developer = JsonNullable.<Boolean>of(developer);
  }

  public TariffDto id(@javax.annotation.Nullable Integer id) {
    
    this.id = id;
    return this;
  }

  /**
   * The identifier of the subscription record itself, for quoting when a charge has to be traced. It is filled  in for a caller with the portal-settings right only, and nothing accepts it as an argument.
   * @return id
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable Integer id) {
    this.id = id;
  }

  public TariffDto state(@javax.annotation.Nullable TariffState state) {
    
    this.state = state;
    return this;
  }

  /**
   * How the subscription stands: on trial, paid, inside the grace period that follows the due date, or unpaid.  It is the one field every caller gets, whatever their role, so a client can warn about payment without  needing administrator rights.
   * @return state
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_STATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TariffState getState() {
    return state;
  }


  @JsonProperty(value = JSON_PROPERTY_STATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(@javax.annotation.Nullable TariffState state) {
    this.state = state;
  }

  public TariffDto dueDate(@javax.annotation.Nullable ApiDateTime dueDate) {
    
    this.dueDate = dueDate;
    return this;
  }

  /**
   * When the current period ends, in the portal time zone. It is filled in for a room or DocSpace  administrator only, and set to the largest value a date can hold for a subscription that never ends.
   * @return dueDate
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DUE_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDateTime getDueDate() {
    return dueDate;
  }


  @JsonProperty(value = JSON_PROPERTY_DUE_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDueDate(@javax.annotation.Nullable ApiDateTime dueDate) {
    this.dueDate = dueDate;
  }

  public TariffDto delayDueDate(@javax.annotation.Nullable ApiDateTime delayDueDate) {
    
    this.delayDueDate = delayDueDate;
    return this;
  }

  /**
   * When the grace period after `dueDate` runs out and the portal is cut off, in the portal time zone. Filled  in under the same conditions as `dueDate`, and equal to it when the plan grants no grace period.
   * @return delayDueDate
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DELAY_DUE_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDateTime getDelayDueDate() {
    return delayDueDate;
  }


  @JsonProperty(value = JSON_PROPERTY_DELAY_DUE_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDelayDueDate(@javax.annotation.Nullable ApiDateTime delayDueDate) {
    this.delayDueDate = delayDueDate;
  }

  public TariffDto licenseDate(@javax.annotation.Nullable ApiDateTime licenseDate) {
    
    this.licenseDate = licenseDate;
    return this;
  }

  /**
   * When the licence file behind the subscription was issued, in the portal time zone. It is meaningful on a  server installation and filled in for a caller with the portal-settings right only.
   * @return licenseDate
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_LICENSE_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDateTime getLicenseDate() {
    return licenseDate;
  }


  @JsonProperty(value = JSON_PROPERTY_LICENSE_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLicenseDate(@javax.annotation.Nullable ApiDateTime licenseDate) {
    this.licenseDate = licenseDate;
  }

  public TariffDto customerId(@javax.annotation.Nullable String customerId) {
    this.customerId = JsonNullable.<String>of(customerId);
    
    return this;
  }

  /**
   * The account in the billing system the subscription is charged to, empty for a portal that has never been  billed. Filled in for a caller with the portal-settings right only.
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

  public TariffDto quotas(@javax.annotation.Nullable List<TariffQuotaDto> quotas) {
    this.quotas = JsonNullable.<List<TariffQuotaDto>>of(quotas);
    
    return this;
  }

  public TariffDto addQuotasItem(TariffQuotaDto quotasItem) {
    if (this.quotas == null || !this.quotas.isPresent()) {
      this.quotas = JsonNullable.<List<TariffQuotaDto>>of(new ArrayList<>());
    }
    try {
      this.quotas.get().add(quotasItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The quotas the subscription is made of - the plan itself and its add-ons - with the overdue ones listed  alongside the current ones, so an entry here is not proof that it is still being paid for; read each  entry's own `state` for that. Filled in for a caller with the portal-settings right only.
   * @return quotas
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<TariffQuotaDto> getQuotas() {
        return quotas.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_QUOTAS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<TariffQuotaDto>> getQuotas_JsonNullable() {
    return quotas;
  }
  
  @JsonProperty(JSON_PROPERTY_QUOTAS)
  public void setQuotas_JsonNullable(JsonNullable<List<TariffQuotaDto>> quotas) {
    this.quotas = quotas;
  }

  public void setQuotas(@javax.annotation.Nullable List<TariffQuotaDto> quotas) {
    this.quotas = JsonNullable.<List<TariffQuotaDto>>of(quotas);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TariffDto tariffDto = (TariffDto) o;
    return equalsNullable(this.openSource, tariffDto.openSource) &&
        equalsNullable(this.enterprise, tariffDto.enterprise) &&
        equalsNullable(this.developer, tariffDto.developer) &&
        Objects.equals(this.id, tariffDto.id) &&
        Objects.equals(this.state, tariffDto.state) &&
        Objects.equals(this.dueDate, tariffDto.dueDate) &&
        Objects.equals(this.delayDueDate, tariffDto.delayDueDate) &&
        Objects.equals(this.licenseDate, tariffDto.licenseDate) &&
        equalsNullable(this.customerId, tariffDto.customerId) &&
        equalsNullable(this.quotas, tariffDto.quotas);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(openSource), hashCodeNullable(enterprise), hashCodeNullable(developer), id, state, dueDate, delayDueDate, licenseDate, hashCodeNullable(customerId), hashCodeNullable(quotas));
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
    sb.append("class TariffDto {\n");
    sb.append("    openSource: ").append(toIndentedString(openSource)).append("\n");
    sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
    sb.append("    developer: ").append(toIndentedString(developer)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    delayDueDate: ").append(toIndentedString(delayDueDate)).append("\n");
    sb.append("    licenseDate: ").append(toIndentedString(licenseDate)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    quotas: ").append(toIndentedString(quotas)).append("\n");
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

    // add `openSource` to the URL query string
    if (getOpenSource() != null) {
      try {
        joiner.add(String.format("%sopenSource%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOpenSource()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `enterprise` to the URL query string
    if (getEnterprise() != null) {
      try {
        joiner.add(String.format("%senterprise%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnterprise()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `developer` to the URL query string
    if (getDeveloper() != null) {
      try {
        joiner.add(String.format("%sdeveloper%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDeveloper()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `state` to the URL query string
    if (getState() != null) {
      try {
        joiner.add(String.format("%sstate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getState()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `dueDate` to the URL query string
    if (getDueDate() != null) {
      joiner.add(getDueDate().toUrlQueryString(prefix + "dueDate" + suffix));
    }

    // add `delayDueDate` to the URL query string
    if (getDelayDueDate() != null) {
      joiner.add(getDelayDueDate().toUrlQueryString(prefix + "delayDueDate" + suffix));
    }

    // add `licenseDate` to the URL query string
    if (getLicenseDate() != null) {
      joiner.add(getLicenseDate().toUrlQueryString(prefix + "licenseDate" + suffix));
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

    // add `quotas` to the URL query string
    if (getQuotas() != null) {
      for (int i = 0; i < getQuotas().size(); i++) {
        if (getQuotas().get(i) != null) {
          joiner.add(getQuotas().get(i).toUrlQueryString(String.format("%squotas%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

