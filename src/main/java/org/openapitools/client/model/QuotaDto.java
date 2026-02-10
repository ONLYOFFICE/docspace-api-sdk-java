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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.PriceDto;
import org.openapitools.client.model.TenantEntityQuotaSettings;
import org.openapitools.client.model.TenantQuotaFeatureDto;
import org.openapitools.client.model.TenantQuotaSettings;
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
 * The quota information.
 */
@JsonPropertyOrder({
  QuotaDto.JSON_PROPERTY_ID,
  QuotaDto.JSON_PROPERTY_TITLE,
  QuotaDto.JSON_PROPERTY_PRICE,
  QuotaDto.JSON_PROPERTY_NON_PROFIT,
  QuotaDto.JSON_PROPERTY_FREE,
  QuotaDto.JSON_PROPERTY_TRIAL,
  QuotaDto.JSON_PROPERTY_FEATURES,
  QuotaDto.JSON_PROPERTY_USERS_QUOTA,
  QuotaDto.JSON_PROPERTY_ROOMS_QUOTA,
  QuotaDto.JSON_PROPERTY_AI_AGENTS_QUOTA,
  QuotaDto.JSON_PROPERTY_TENANT_CUSTOM_QUOTA,
  QuotaDto.JSON_PROPERTY_DUE_DATE
})

public class QuotaDto {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nonnull
  private Integer id;

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable
  private String title;

  public static final String JSON_PROPERTY_PRICE = "price";
  @javax.annotation.Nonnull
  private PriceDto price;

  public static final String JSON_PROPERTY_NON_PROFIT = "nonProfit";
  @javax.annotation.Nonnull
  private Boolean nonProfit;

  public static final String JSON_PROPERTY_FREE = "free";
  @javax.annotation.Nonnull
  private Boolean free;

  public static final String JSON_PROPERTY_TRIAL = "trial";
  @javax.annotation.Nonnull
  private Boolean trial;

  public static final String JSON_PROPERTY_FEATURES = "features";
  @javax.annotation.Nullable
  private List<TenantQuotaFeatureDto> features;

  public static final String JSON_PROPERTY_USERS_QUOTA = "usersQuota";
  @javax.annotation.Nullable
  private TenantEntityQuotaSettings usersQuota;

  public static final String JSON_PROPERTY_ROOMS_QUOTA = "roomsQuota";
  @javax.annotation.Nullable
  private TenantEntityQuotaSettings roomsQuota;

  public static final String JSON_PROPERTY_AI_AGENTS_QUOTA = "aiAgentsQuota";
  @javax.annotation.Nullable
  private TenantEntityQuotaSettings aiAgentsQuota;

  public static final String JSON_PROPERTY_TENANT_CUSTOM_QUOTA = "tenantCustomQuota";
  @javax.annotation.Nullable
  private TenantQuotaSettings tenantCustomQuota;

  public static final String JSON_PROPERTY_DUE_DATE = "dueDate";
  @javax.annotation.Nullable
  private JsonNullable<OffsetDateTime> dueDate = JsonNullable.<OffsetDateTime>undefined();

  public QuotaDto() {
  }


  public QuotaDto id(@javax.annotation.Nonnull Integer id) {
    
    this.id = id;
    return this;
  }

  /**
   * The quota ID.
   * @return id
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(@javax.annotation.Nonnull Integer id) {
    this.id = id;
  }

  public QuotaDto title(@javax.annotation.Nullable String title) {
    
    this.title = title;
    return this;
  }

  /**
   * The quota title.
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

  public QuotaDto price(@javax.annotation.Nonnull PriceDto price) {
    
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PriceDto getPrice() {
    return price;
  }


  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPrice(@javax.annotation.Nonnull PriceDto price) {
    this.price = price;
  }

  public QuotaDto nonProfit(@javax.annotation.Nonnull Boolean nonProfit) {
    
    this.nonProfit = nonProfit;
    return this;
  }

  /**
   * Specifies if the quota is nonprofit or not.
   * @return nonProfit
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NON_PROFIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getNonProfit() {
    return nonProfit;
  }


  @JsonProperty(JSON_PROPERTY_NON_PROFIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNonProfit(@javax.annotation.Nonnull Boolean nonProfit) {
    this.nonProfit = nonProfit;
  }

  public QuotaDto free(@javax.annotation.Nonnull Boolean free) {
    
    this.free = free;
    return this;
  }

  /**
   * Specifies if the quota is free or not.
   * @return free
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FREE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getFree() {
    return free;
  }


  @JsonProperty(JSON_PROPERTY_FREE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFree(@javax.annotation.Nonnull Boolean free) {
    this.free = free;
  }

  public QuotaDto trial(@javax.annotation.Nonnull Boolean trial) {
    
    this.trial = trial;
    return this;
  }

  /**
   * Specifies if the quota is trial or not.
   * @return trial
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TRIAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getTrial() {
    return trial;
  }


  @JsonProperty(JSON_PROPERTY_TRIAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTrial(@javax.annotation.Nonnull Boolean trial) {
    this.trial = trial;
  }

  public QuotaDto features(@javax.annotation.Nullable List<TenantQuotaFeatureDto> features) {
    
    this.features = features;
    return this;
  }

  public QuotaDto addFeaturesItem(TenantQuotaFeatureDto featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<>();
    }
    this.features.add(featuresItem);
    return this;
  }

  /**
   * The list of tenant quota features.
   * @return features
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEATURES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<TenantQuotaFeatureDto> getFeatures() {
    return features;
  }


  @JsonProperty(JSON_PROPERTY_FEATURES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFeatures(@javax.annotation.Nullable List<TenantQuotaFeatureDto> features) {
    this.features = features;
  }

  public QuotaDto usersQuota(@javax.annotation.Nullable TenantEntityQuotaSettings usersQuota) {
    
    this.usersQuota = usersQuota;
    return this;
  }

  /**
   * Get usersQuota
   * @return usersQuota
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USERS_QUOTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TenantEntityQuotaSettings getUsersQuota() {
    return usersQuota;
  }


  @JsonProperty(JSON_PROPERTY_USERS_QUOTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsersQuota(@javax.annotation.Nullable TenantEntityQuotaSettings usersQuota) {
    this.usersQuota = usersQuota;
  }

  public QuotaDto roomsQuota(@javax.annotation.Nullable TenantEntityQuotaSettings roomsQuota) {
    
    this.roomsQuota = roomsQuota;
    return this;
  }

  /**
   * Get roomsQuota
   * @return roomsQuota
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROOMS_QUOTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TenantEntityQuotaSettings getRoomsQuota() {
    return roomsQuota;
  }


  @JsonProperty(JSON_PROPERTY_ROOMS_QUOTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoomsQuota(@javax.annotation.Nullable TenantEntityQuotaSettings roomsQuota) {
    this.roomsQuota = roomsQuota;
  }

  public QuotaDto aiAgentsQuota(@javax.annotation.Nullable TenantEntityQuotaSettings aiAgentsQuota) {
    
    this.aiAgentsQuota = aiAgentsQuota;
    return this;
  }

  /**
   * Get aiAgentsQuota
   * @return aiAgentsQuota
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AI_AGENTS_QUOTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TenantEntityQuotaSettings getAiAgentsQuota() {
    return aiAgentsQuota;
  }


  @JsonProperty(JSON_PROPERTY_AI_AGENTS_QUOTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAiAgentsQuota(@javax.annotation.Nullable TenantEntityQuotaSettings aiAgentsQuota) {
    this.aiAgentsQuota = aiAgentsQuota;
  }

  public QuotaDto tenantCustomQuota(@javax.annotation.Nullable TenantQuotaSettings tenantCustomQuota) {
    
    this.tenantCustomQuota = tenantCustomQuota;
    return this;
  }

  /**
   * Get tenantCustomQuota
   * @return tenantCustomQuota
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TENANT_CUSTOM_QUOTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TenantQuotaSettings getTenantCustomQuota() {
    return tenantCustomQuota;
  }


  @JsonProperty(JSON_PROPERTY_TENANT_CUSTOM_QUOTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantCustomQuota(@javax.annotation.Nullable TenantQuotaSettings tenantCustomQuota) {
    this.tenantCustomQuota = tenantCustomQuota;
  }

  public QuotaDto dueDate(@javax.annotation.Nullable OffsetDateTime dueDate) {
    this.dueDate = JsonNullable.<OffsetDateTime>of(dueDate);
    
    return this;
  }

  /**
   * The due date.
   * @return dueDate
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public OffsetDateTime getDueDate() {
        return dueDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DUE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getDueDate_JsonNullable() {
    return dueDate;
  }
  
  @JsonProperty(JSON_PROPERTY_DUE_DATE)
  public void setDueDate_JsonNullable(JsonNullable<OffsetDateTime> dueDate) {
    this.dueDate = dueDate;
  }

  public void setDueDate(@javax.annotation.Nullable OffsetDateTime dueDate) {
    this.dueDate = JsonNullable.<OffsetDateTime>of(dueDate);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuotaDto quotaDto = (QuotaDto) o;
    return Objects.equals(this.id, quotaDto.id) &&
        Objects.equals(this.title, quotaDto.title) &&
        Objects.equals(this.price, quotaDto.price) &&
        Objects.equals(this.nonProfit, quotaDto.nonProfit) &&
        Objects.equals(this.free, quotaDto.free) &&
        Objects.equals(this.trial, quotaDto.trial) &&
        Objects.equals(this.features, quotaDto.features) &&
        Objects.equals(this.usersQuota, quotaDto.usersQuota) &&
        Objects.equals(this.roomsQuota, quotaDto.roomsQuota) &&
        Objects.equals(this.aiAgentsQuota, quotaDto.aiAgentsQuota) &&
        Objects.equals(this.tenantCustomQuota, quotaDto.tenantCustomQuota) &&
        equalsNullable(this.dueDate, quotaDto.dueDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, price, nonProfit, free, trial, features, usersQuota, roomsQuota, aiAgentsQuota, tenantCustomQuota, hashCodeNullable(dueDate));
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
    sb.append("class QuotaDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    nonProfit: ").append(toIndentedString(nonProfit)).append("\n");
    sb.append("    free: ").append(toIndentedString(free)).append("\n");
    sb.append("    trial: ").append(toIndentedString(trial)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    usersQuota: ").append(toIndentedString(usersQuota)).append("\n");
    sb.append("    roomsQuota: ").append(toIndentedString(roomsQuota)).append("\n");
    sb.append("    aiAgentsQuota: ").append(toIndentedString(aiAgentsQuota)).append("\n");
    sb.append("    tenantCustomQuota: ").append(toIndentedString(tenantCustomQuota)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
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

    // add `title` to the URL query string
    if (getTitle() != null) {
      try {
        joiner.add(String.format("%stitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTitle()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `price` to the URL query string
    if (getPrice() != null) {
      joiner.add(getPrice().toUrlQueryString(prefix + "price" + suffix));
    }

    // add `nonProfit` to the URL query string
    if (getNonProfit() != null) {
      try {
        joiner.add(String.format("%snonProfit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNonProfit()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `free` to the URL query string
    if (getFree() != null) {
      try {
        joiner.add(String.format("%sfree%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFree()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `trial` to the URL query string
    if (getTrial() != null) {
      try {
        joiner.add(String.format("%strial%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTrial()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `features` to the URL query string
    if (getFeatures() != null) {
      for (int i = 0; i < getFeatures().size(); i++) {
        if (getFeatures().get(i) != null) {
          joiner.add(getFeatures().get(i).toUrlQueryString(String.format("%sfeatures%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `usersQuota` to the URL query string
    if (getUsersQuota() != null) {
      joiner.add(getUsersQuota().toUrlQueryString(prefix + "usersQuota" + suffix));
    }

    // add `roomsQuota` to the URL query string
    if (getRoomsQuota() != null) {
      joiner.add(getRoomsQuota().toUrlQueryString(prefix + "roomsQuota" + suffix));
    }

    // add `aiAgentsQuota` to the URL query string
    if (getAiAgentsQuota() != null) {
      joiner.add(getAiAgentsQuota().toUrlQueryString(prefix + "aiAgentsQuota" + suffix));
    }

    // add `tenantCustomQuota` to the URL query string
    if (getTenantCustomQuota() != null) {
      joiner.add(getTenantCustomQuota().toUrlQueryString(prefix + "tenantCustomQuota" + suffix));
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

    return joiner.toString();
  }

}

