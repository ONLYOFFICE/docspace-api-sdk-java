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
import java.util.UUID;
import org.openapitools.client.model.ApiDateTime;
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
 * The active connection item parameters.
 */
@JsonPropertyOrder({
  ActiveConnectionsItemDto.JSON_PROPERTY_ID,
  ActiveConnectionsItemDto.JSON_PROPERTY_TENANT_ID,
  ActiveConnectionsItemDto.JSON_PROPERTY_USER_ID,
  ActiveConnectionsItemDto.JSON_PROPERTY_MOBILE,
  ActiveConnectionsItemDto.JSON_PROPERTY_IP,
  ActiveConnectionsItemDto.JSON_PROPERTY_COUNTRY,
  ActiveConnectionsItemDto.JSON_PROPERTY_CITY,
  ActiveConnectionsItemDto.JSON_PROPERTY_BROWSER,
  ActiveConnectionsItemDto.JSON_PROPERTY_PLATFORM,
  ActiveConnectionsItemDto.JSON_PROPERTY_DATE,
  ActiveConnectionsItemDto.JSON_PROPERTY_PAGE
})

public class ActiveConnectionsItemDto {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nonnull
  private Integer id;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @javax.annotation.Nonnull
  private Integer tenantId;

  public static final String JSON_PROPERTY_USER_ID = "userId";
  @javax.annotation.Nonnull
  private UUID userId;

  public static final String JSON_PROPERTY_MOBILE = "mobile";
  @javax.annotation.Nullable
  private Boolean mobile;

  public static final String JSON_PROPERTY_IP = "ip";
  @javax.annotation.Nullable
  private JsonNullable<String> ip = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COUNTRY = "country";
  @javax.annotation.Nullable
  private JsonNullable<String> country = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CITY = "city";
  @javax.annotation.Nullable
  private JsonNullable<String> city = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BROWSER = "browser";
  @javax.annotation.Nullable
  private JsonNullable<String> browser = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PLATFORM = "platform";
  @javax.annotation.Nullable
  private JsonNullable<String> platform = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DATE = "date";
  @javax.annotation.Nullable
  private ApiDateTime date;

  public static final String JSON_PROPERTY_PAGE = "page";
  @javax.annotation.Nullable
  private JsonNullable<String> page = JsonNullable.<String>undefined();

  public ActiveConnectionsItemDto() {
  }

  public ActiveConnectionsItemDto id(@javax.annotation.Nonnull Integer id) {
    
    this.id = id;
    return this;
  }

  /**
   * The active connection ID.
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

  public ActiveConnectionsItemDto tenantId(@javax.annotation.Nonnull Integer tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

  /**
   * The tenant ID.
   * @return tenantId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTenantId() {
    return tenantId;
  }


  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTenantId(@javax.annotation.Nonnull Integer tenantId) {
    this.tenantId = tenantId;
  }

  public ActiveConnectionsItemDto userId(@javax.annotation.Nonnull UUID userId) {
    
    this.userId = userId;
    return this;
  }

  /**
   * The user ID.
   * @return userId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserId(@javax.annotation.Nonnull UUID userId) {
    this.userId = userId;
  }

  public ActiveConnectionsItemDto mobile(@javax.annotation.Nullable Boolean mobile) {
    
    this.mobile = mobile;
    return this;
  }

  /**
   * Specifies if the active connection has a mobile phone or not.
   * @return mobile
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOBILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMobile() {
    return mobile;
  }


  @JsonProperty(JSON_PROPERTY_MOBILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMobile(@javax.annotation.Nullable Boolean mobile) {
    this.mobile = mobile;
  }

  public ActiveConnectionsItemDto ip(@javax.annotation.Nullable String ip) {
    this.ip = JsonNullable.<String>of(ip);
    
    return this;
  }

  /**
   * The IP address of the active connection.
   * @return ip
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getIp() {
        return ip.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getIp_JsonNullable() {
    return ip;
  }
  
  @JsonProperty(JSON_PROPERTY_IP)
  public void setIp_JsonNullable(JsonNullable<String> ip) {
    this.ip = ip;
  }

  public void setIp(@javax.annotation.Nullable String ip) {
    this.ip = JsonNullable.<String>of(ip);
  }

  public ActiveConnectionsItemDto country(@javax.annotation.Nullable String country) {
    this.country = JsonNullable.<String>of(country);
    
    return this;
  }

  /**
   * The active connection country.
   * @return country
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCountry() {
        return country.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCountry_JsonNullable() {
    return country;
  }
  
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  public void setCountry_JsonNullable(JsonNullable<String> country) {
    this.country = country;
  }

  public void setCountry(@javax.annotation.Nullable String country) {
    this.country = JsonNullable.<String>of(country);
  }

  public ActiveConnectionsItemDto city(@javax.annotation.Nullable String city) {
    this.city = JsonNullable.<String>of(city);
    
    return this;
  }

  /**
   * The active connection city.
   * @return city
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCity() {
        return city.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCity_JsonNullable() {
    return city;
  }
  
  @JsonProperty(JSON_PROPERTY_CITY)
  public void setCity_JsonNullable(JsonNullable<String> city) {
    this.city = city;
  }

  public void setCity(@javax.annotation.Nullable String city) {
    this.city = JsonNullable.<String>of(city);
  }

  public ActiveConnectionsItemDto browser(@javax.annotation.Nullable String browser) {
    this.browser = JsonNullable.<String>of(browser);
    
    return this;
  }

  /**
   * The active connection browser.
   * @return browser
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getBrowser() {
        return browser.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BROWSER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBrowser_JsonNullable() {
    return browser;
  }
  
  @JsonProperty(JSON_PROPERTY_BROWSER)
  public void setBrowser_JsonNullable(JsonNullable<String> browser) {
    this.browser = browser;
  }

  public void setBrowser(@javax.annotation.Nullable String browser) {
    this.browser = JsonNullable.<String>of(browser);
  }

  public ActiveConnectionsItemDto platform(@javax.annotation.Nullable String platform) {
    this.platform = JsonNullable.<String>of(platform);
    
    return this;
  }

  /**
   * The active connection platform.
   * @return platform
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPlatform() {
        return platform.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPlatform_JsonNullable() {
    return platform;
  }
  
  @JsonProperty(JSON_PROPERTY_PLATFORM)
  public void setPlatform_JsonNullable(JsonNullable<String> platform) {
    this.platform = platform;
  }

  public void setPlatform(@javax.annotation.Nullable String platform) {
    this.platform = JsonNullable.<String>of(platform);
  }

  public ActiveConnectionsItemDto date(@javax.annotation.Nullable ApiDateTime date) {
    
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDateTime getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(@javax.annotation.Nullable ApiDateTime date) {
    this.date = date;
  }

  public ActiveConnectionsItemDto page(@javax.annotation.Nullable String page) {
    this.page = JsonNullable.<String>of(page);
    
    return this;
  }

  /**
   * The active connection page.
   * @return page
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPage() {
        return page.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPage_JsonNullable() {
    return page;
  }
  
  @JsonProperty(JSON_PROPERTY_PAGE)
  public void setPage_JsonNullable(JsonNullable<String> page) {
    this.page = page;
  }

  public void setPage(@javax.annotation.Nullable String page) {
    this.page = JsonNullable.<String>of(page);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActiveConnectionsItemDto activeConnectionsItemDto = (ActiveConnectionsItemDto) o;
    return Objects.equals(this.id, activeConnectionsItemDto.id) &&
        Objects.equals(this.tenantId, activeConnectionsItemDto.tenantId) &&
        Objects.equals(this.userId, activeConnectionsItemDto.userId) &&
        Objects.equals(this.mobile, activeConnectionsItemDto.mobile) &&
        equalsNullable(this.ip, activeConnectionsItemDto.ip) &&
        equalsNullable(this.country, activeConnectionsItemDto.country) &&
        equalsNullable(this.city, activeConnectionsItemDto.city) &&
        equalsNullable(this.browser, activeConnectionsItemDto.browser) &&
        equalsNullable(this.platform, activeConnectionsItemDto.platform) &&
        Objects.equals(this.date, activeConnectionsItemDto.date) &&
        equalsNullable(this.page, activeConnectionsItemDto.page);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tenantId, userId, mobile, hashCodeNullable(ip), hashCodeNullable(country), hashCodeNullable(city), hashCodeNullable(browser), hashCodeNullable(platform), date, hashCodeNullable(page));
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
    sb.append("class ActiveConnectionsItemDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    browser: ").append(toIndentedString(browser)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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

    // add `tenantId` to the URL query string
    if (getTenantId() != null) {
      try {
        joiner.add(String.format("%stenantId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTenantId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `userId` to the URL query string
    if (getUserId() != null) {
      try {
        joiner.add(String.format("%suserId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUserId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `mobile` to the URL query string
    if (getMobile() != null) {
      try {
        joiner.add(String.format("%smobile%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMobile()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `ip` to the URL query string
    if (getIp() != null) {
      try {
        joiner.add(String.format("%sip%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIp()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `country` to the URL query string
    if (getCountry() != null) {
      try {
        joiner.add(String.format("%scountry%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCountry()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `city` to the URL query string
    if (getCity() != null) {
      try {
        joiner.add(String.format("%scity%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCity()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `browser` to the URL query string
    if (getBrowser() != null) {
      try {
        joiner.add(String.format("%sbrowser%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBrowser()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `platform` to the URL query string
    if (getPlatform() != null) {
      try {
        joiner.add(String.format("%splatform%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPlatform()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `date` to the URL query string
    if (getDate() != null) {
      joiner.add(getDate().toUrlQueryString(prefix + "date" + suffix));
    }

    // add `page` to the URL query string
    if (getPage() != null) {
      try {
        joiner.add(String.format("%spage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

