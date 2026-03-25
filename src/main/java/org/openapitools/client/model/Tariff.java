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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Quota;
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
 * The tariff parameters.
 */
@JsonPropertyOrder({
  Tariff.JSON_PROPERTY_ID,
  Tariff.JSON_PROPERTY_STATE,
  Tariff.JSON_PROPERTY_DUE_DATE,
  Tariff.JSON_PROPERTY_DELAY_DUE_DATE,
  Tariff.JSON_PROPERTY_LICENSE_DATE,
  Tariff.JSON_PROPERTY_CUSTOMER_ID,
  Tariff.JSON_PROPERTY_QUOTAS,
  Tariff.JSON_PROPERTY_OVERDUE_QUOTAS
})

public class Tariff {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable  private Integer id;

  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nullable  private TariffState state;

  public static final String JSON_PROPERTY_DUE_DATE = "dueDate";
  @javax.annotation.Nonnull  private OffsetDateTime dueDate;

  public static final String JSON_PROPERTY_DELAY_DUE_DATE = "delayDueDate";
  @javax.annotation.Nullable  private OffsetDateTime delayDueDate;

  public static final String JSON_PROPERTY_LICENSE_DATE = "licenseDate";
  @javax.annotation.Nullable  private OffsetDateTime licenseDate;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customerId";
  @javax.annotation.Nullable  private JsonNullable<String> customerId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_QUOTAS = "quotas";
  @javax.annotation.Nullable  private List<Quota> quotas;

  public static final String JSON_PROPERTY_OVERDUE_QUOTAS = "overdueQuotas";
  @javax.annotation.Nullable  private JsonNullable<List<Quota>> overdueQuotas = JsonNullable.<List<Quota>>undefined();

  public Tariff() {
  }


  public Tariff id(@javax.annotation.Nullable Integer id) {
    
    this.id = id;
    return this;
  }

  /**
   * The tariff ID.
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

  public Tariff state(@javax.annotation.Nullable TariffState state) {
    
    this.state = state;
    return this;
  }

  /**
   * Get state
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

  public Tariff dueDate(@javax.annotation.Nonnull OffsetDateTime dueDate) {
    
    this.dueDate = dueDate;
    return this;
  }

  /**
   * The tariff due date.
   * @return dueDate
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_DUE_DATE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getDueDate() {
    return dueDate;
  }


  @JsonProperty(value = JSON_PROPERTY_DUE_DATE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDueDate(@javax.annotation.Nonnull OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }

  public Tariff delayDueDate(@javax.annotation.Nullable OffsetDateTime delayDueDate) {
    
    this.delayDueDate = delayDueDate;
    return this;
  }

  /**
   * The tariff delay due date.
   * @return delayDueDate
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DELAY_DUE_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDelayDueDate() {
    return delayDueDate;
  }


  @JsonProperty(value = JSON_PROPERTY_DELAY_DUE_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDelayDueDate(@javax.annotation.Nullable OffsetDateTime delayDueDate) {
    this.delayDueDate = delayDueDate;
  }

  public Tariff licenseDate(@javax.annotation.Nullable OffsetDateTime licenseDate) {
    
    this.licenseDate = licenseDate;
    return this;
  }

  /**
   * The tariff license date.
   * @return licenseDate
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_LICENSE_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLicenseDate() {
    return licenseDate;
  }


  @JsonProperty(value = JSON_PROPERTY_LICENSE_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLicenseDate(@javax.annotation.Nullable OffsetDateTime licenseDate) {
    this.licenseDate = licenseDate;
  }

  public Tariff customerId(@javax.annotation.Nullable String customerId) {
    this.customerId = JsonNullable.<String>of(customerId);
    
    return this;
  }

  /**
   * The tariff customer ID.
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

  public Tariff quotas(@javax.annotation.Nullable List<Quota> quotas) {
    
    this.quotas = quotas;
    return this;
  }

  public Tariff addQuotasItem(Quota quotasItem) {
    if (this.quotas == null) {
      this.quotas = new ArrayList<>();
    }
    this.quotas.add(quotasItem);
    return this;
  }

  /**
   * The list of tariff quotas.
   * @return quotas
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_QUOTAS, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Quota> getQuotas() {
    return quotas;
  }


  @JsonProperty(value = JSON_PROPERTY_QUOTAS, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQuotas(@javax.annotation.Nullable List<Quota> quotas) {
    this.quotas = quotas;
  }

  public Tariff overdueQuotas(@javax.annotation.Nullable List<Quota> overdueQuotas) {
    this.overdueQuotas = JsonNullable.<List<Quota>>of(overdueQuotas);
    
    return this;
  }

  public Tariff addOverdueQuotasItem(Quota overdueQuotasItem) {
    if (this.overdueQuotas == null || !this.overdueQuotas.isPresent()) {
      this.overdueQuotas = JsonNullable.<List<Quota>>of(new ArrayList<>());
    }
    try {
      this.overdueQuotas.get().add(overdueQuotasItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of overdue tariff quotas.
   * @return overdueQuotas
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<Quota> getOverdueQuotas() {
        return overdueQuotas.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_OVERDUE_QUOTAS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<Quota>> getOverdueQuotas_JsonNullable() {
    return overdueQuotas;
  }
  
  @JsonProperty(JSON_PROPERTY_OVERDUE_QUOTAS)
  public void setOverdueQuotas_JsonNullable(JsonNullable<List<Quota>> overdueQuotas) {
    this.overdueQuotas = overdueQuotas;
  }

  public void setOverdueQuotas(@javax.annotation.Nullable List<Quota> overdueQuotas) {
    this.overdueQuotas = JsonNullable.<List<Quota>>of(overdueQuotas);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tariff tariff = (Tariff) o;
    return Objects.equals(this.id, tariff.id) &&
        Objects.equals(this.state, tariff.state) &&
        Objects.equals(this.dueDate, tariff.dueDate) &&
        Objects.equals(this.delayDueDate, tariff.delayDueDate) &&
        Objects.equals(this.licenseDate, tariff.licenseDate) &&
        equalsNullable(this.customerId, tariff.customerId) &&
        Objects.equals(this.quotas, tariff.quotas) &&
        equalsNullable(this.overdueQuotas, tariff.overdueQuotas);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state, dueDate, delayDueDate, licenseDate, hashCodeNullable(customerId), quotas, hashCodeNullable(overdueQuotas));
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
    sb.append("class Tariff {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    delayDueDate: ").append(toIndentedString(delayDueDate)).append("\n");
    sb.append("    licenseDate: ").append(toIndentedString(licenseDate)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    quotas: ").append(toIndentedString(quotas)).append("\n");
    sb.append("    overdueQuotas: ").append(toIndentedString(overdueQuotas)).append("\n");
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
      try {
        joiner.add(String.format("%sdueDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDueDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `delayDueDate` to the URL query string
    if (getDelayDueDate() != null) {
      try {
        joiner.add(String.format("%sdelayDueDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDelayDueDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `licenseDate` to the URL query string
    if (getLicenseDate() != null) {
      try {
        joiner.add(String.format("%slicenseDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLicenseDate()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `quotas` to the URL query string
    if (getQuotas() != null) {
      for (int i = 0; i < getQuotas().size(); i++) {
        if (getQuotas().get(i) != null) {
          joiner.add(getQuotas().get(i).toUrlQueryString(String.format("%squotas%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `overdueQuotas` to the URL query string
    if (getOverdueQuotas() != null) {
      for (int i = 0; i < getOverdueQuotas().size(); i++) {
        if (getOverdueQuotas().get(i) != null) {
          joiner.add(getOverdueQuotas().get(i).toUrlQueryString(String.format("%soverdueQuotas%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

