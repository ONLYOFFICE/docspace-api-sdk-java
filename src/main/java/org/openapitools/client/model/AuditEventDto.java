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
import java.util.UUID;
import org.openapitools.client.model.ActionType;
import org.openapitools.client.model.ApiDateTime;
import org.openapitools.client.model.EntryType;
import org.openapitools.client.model.LocationType;
import org.openapitools.client.model.MessageAction;
import org.openapitools.client.model.ProductType;
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
 * The audit event parameters.
 */
@JsonPropertyOrder({
  AuditEventDto.JSON_PROPERTY_ID,
  AuditEventDto.JSON_PROPERTY_DATE,
  AuditEventDto.JSON_PROPERTY_USER,
  AuditEventDto.JSON_PROPERTY_USER_ID,
  AuditEventDto.JSON_PROPERTY_ACTION,
  AuditEventDto.JSON_PROPERTY_ACTION_ID,
  AuditEventDto.JSON_PROPERTY_IP,
  AuditEventDto.JSON_PROPERTY_COUNTRY,
  AuditEventDto.JSON_PROPERTY_CITY,
  AuditEventDto.JSON_PROPERTY_BROWSER,
  AuditEventDto.JSON_PROPERTY_PLATFORM,
  AuditEventDto.JSON_PROPERTY_PAGE,
  AuditEventDto.JSON_PROPERTY_ACTION_TYPE,
  AuditEventDto.JSON_PROPERTY_PRODUCT,
  AuditEventDto.JSON_PROPERTY_LOCATION,
  AuditEventDto.JSON_PROPERTY_TARGET,
  AuditEventDto.JSON_PROPERTY_ENTRIES,
  AuditEventDto.JSON_PROPERTY_CONTEXT
})

public class AuditEventDto {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable  private Integer id;

  public static final String JSON_PROPERTY_DATE = "date";
  @javax.annotation.Nullable  private ApiDateTime date;

  public static final String JSON_PROPERTY_USER = "user";
  @javax.annotation.Nullable  private JsonNullable<String> user = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_USER_ID = "userId";
  @javax.annotation.Nullable  private UUID userId;

  public static final String JSON_PROPERTY_ACTION = "action";
  @javax.annotation.Nullable  private JsonNullable<String> action = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ACTION_ID = "actionId";
  @javax.annotation.Nullable  private MessageAction actionId;

  public static final String JSON_PROPERTY_IP = "ip";
  @javax.annotation.Nullable  private JsonNullable<String> ip = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COUNTRY = "country";
  @javax.annotation.Nullable  private JsonNullable<String> country = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CITY = "city";
  @javax.annotation.Nullable  private JsonNullable<String> city = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BROWSER = "browser";
  @javax.annotation.Nullable  private JsonNullable<String> browser = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PLATFORM = "platform";
  @javax.annotation.Nullable  private JsonNullable<String> platform = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PAGE = "page";
  @javax.annotation.Nullable  private JsonNullable<String> page = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ACTION_TYPE = "actionType";
  @javax.annotation.Nullable  private ActionType actionType;

  public static final String JSON_PROPERTY_PRODUCT = "product";
  @javax.annotation.Nullable  private ProductType product;

  public static final String JSON_PROPERTY_LOCATION = "location";
  @javax.annotation.Nullable  private LocationType location;

  public static final String JSON_PROPERTY_TARGET = "target";
  @javax.annotation.Nullable  private JsonNullable<List<String>> target = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_ENTRIES = "entries";
  @javax.annotation.Nullable  private JsonNullable<List<EntryType>> entries = JsonNullable.<List<EntryType>>undefined();

  public static final String JSON_PROPERTY_CONTEXT = "context";
  @javax.annotation.Nullable  private JsonNullable<String> context = JsonNullable.<String>undefined();

  public AuditEventDto() {
  }


  public AuditEventDto id(@javax.annotation.Nullable Integer id) {
    
    this.id = id;
    return this;
  }

  /**
   * The audit event ID.
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

  public AuditEventDto date(@javax.annotation.Nullable ApiDateTime date) {
    
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDateTime getDate() {
    return date;
  }


  @JsonProperty(value = JSON_PROPERTY_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(@javax.annotation.Nullable ApiDateTime date) {
    this.date = date;
  }

  public AuditEventDto user(@javax.annotation.Nullable String user) {
    this.user = JsonNullable.<String>of(user);
    
    return this;
  }

  /**
   * The name of the user who triggered the audit event.
   * @return user
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getUser() {
        return user.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_USER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getUser_JsonNullable() {
    return user;
  }
  
  @JsonProperty(JSON_PROPERTY_USER)
  public void setUser_JsonNullable(JsonNullable<String> user) {
    this.user = user;
  }

  public void setUser(@javax.annotation.Nullable String user) {
    this.user = JsonNullable.<String>of(user);
  }

  public AuditEventDto userId(@javax.annotation.Nullable UUID userId) {
    
    this.userId = userId;
    return this;
  }

  /**
   * The ID of the user who triggered the audit event.
   * @return userId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_USER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getUserId() {
    return userId;
  }


  @JsonProperty(value = JSON_PROPERTY_USER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(@javax.annotation.Nullable UUID userId) {
    this.userId = userId;
  }

  public AuditEventDto action(@javax.annotation.Nullable String action) {
    this.action = JsonNullable.<String>of(action);
    
    return this;
  }

  /**
   * The audit event action.
   * @return action
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getAction() {
        return action.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ACTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getAction_JsonNullable() {
    return action;
  }
  
  @JsonProperty(JSON_PROPERTY_ACTION)
  public void setAction_JsonNullable(JsonNullable<String> action) {
    this.action = action;
  }

  public void setAction(@javax.annotation.Nullable String action) {
    this.action = JsonNullable.<String>of(action);
  }

  public AuditEventDto actionId(@javax.annotation.Nullable MessageAction actionId) {
    
    this.actionId = actionId;
    return this;
  }

  /**
   * Get actionId
   * @return actionId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ACTION_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MessageAction getActionId() {
    return actionId;
  }


  @JsonProperty(value = JSON_PROPERTY_ACTION_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActionId(@javax.annotation.Nullable MessageAction actionId) {
    this.actionId = actionId;
  }

  public AuditEventDto ip(@javax.annotation.Nullable String ip) {
    this.ip = JsonNullable.<String>of(ip);
    
    return this;
  }

  /**
   * The audit event IP.
   * @return ip
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getIp() {
        return ip.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_IP, required = false)
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

  public AuditEventDto country(@javax.annotation.Nullable String country) {
    this.country = JsonNullable.<String>of(country);
    
    return this;
  }

  /**
   * The audit event country.
   * @return country
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getCountry() {
        return country.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_COUNTRY, required = false)
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

  public AuditEventDto city(@javax.annotation.Nullable String city) {
    this.city = JsonNullable.<String>of(city);
    
    return this;
  }

  /**
   * The audit event city.
   * @return city
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getCity() {
        return city.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_CITY, required = false)
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

  public AuditEventDto browser(@javax.annotation.Nullable String browser) {
    this.browser = JsonNullable.<String>of(browser);
    
    return this;
  }

  /**
   * The audit event browser.
   * @return browser
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getBrowser() {
        return browser.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_BROWSER, required = false)
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

  public AuditEventDto platform(@javax.annotation.Nullable String platform) {
    this.platform = JsonNullable.<String>of(platform);
    
    return this;
  }

  /**
   * The audit event platform.
   * @return platform
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getPlatform() {
        return platform.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_PLATFORM, required = false)
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

  public AuditEventDto page(@javax.annotation.Nullable String page) {
    this.page = JsonNullable.<String>of(page);
    
    return this;
  }

  /**
   * The audit event page.
   * @return page
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getPage() {
        return page.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_PAGE, required = false)
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

  public AuditEventDto actionType(@javax.annotation.Nullable ActionType actionType) {
    
    this.actionType = actionType;
    return this;
  }

  /**
   * Get actionType
   * @return actionType
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ACTION_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ActionType getActionType() {
    return actionType;
  }


  @JsonProperty(value = JSON_PROPERTY_ACTION_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActionType(@javax.annotation.Nullable ActionType actionType) {
    this.actionType = actionType;
  }

  public AuditEventDto product(@javax.annotation.Nullable ProductType product) {
    
    this.product = product;
    return this;
  }

  /**
   * Get product
   * @return product
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PRODUCT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProductType getProduct() {
    return product;
  }


  @JsonProperty(value = JSON_PROPERTY_PRODUCT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProduct(@javax.annotation.Nullable ProductType product) {
    this.product = product;
  }

  public AuditEventDto location(@javax.annotation.Nullable LocationType location) {
    
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_LOCATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocationType getLocation() {
    return location;
  }


  @JsonProperty(value = JSON_PROPERTY_LOCATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocation(@javax.annotation.Nullable LocationType location) {
    this.location = location;
  }

  public AuditEventDto target(@javax.annotation.Nullable List<String> target) {
    this.target = JsonNullable.<List<String>>of(target);
    
    return this;
  }

  public AuditEventDto addTargetItem(String targetItem) {
    if (this.target == null || !this.target.isPresent()) {
      this.target = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.target.get().add(targetItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of target objects affected by the audit event (e.g., document ID, user account).
   * @return target
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<String> getTarget() {
        return target.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_TARGET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getTarget_JsonNullable() {
    return target;
  }
  
  @JsonProperty(JSON_PROPERTY_TARGET)
  public void setTarget_JsonNullable(JsonNullable<List<String>> target) {
    this.target = target;
  }

  public void setTarget(@javax.annotation.Nullable List<String> target) {
    this.target = JsonNullable.<List<String>>of(target);
  }

  public AuditEventDto entries(@javax.annotation.Nullable List<EntryType> entries) {
    this.entries = JsonNullable.<List<EntryType>>of(entries);
    
    return this;
  }

  public AuditEventDto addEntriesItem(EntryType entriesItem) {
    if (this.entries == null || !this.entries.isPresent()) {
      this.entries = JsonNullable.<List<EntryType>>of(new ArrayList<>());
    }
    try {
      this.entries.get().add(entriesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of audit entry types (e.g., Folder, User, File).
   * @return entries
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<EntryType> getEntries() {
        return entries.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ENTRIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<EntryType>> getEntries_JsonNullable() {
    return entries;
  }
  
  @JsonProperty(JSON_PROPERTY_ENTRIES)
  public void setEntries_JsonNullable(JsonNullable<List<EntryType>> entries) {
    this.entries = entries;
  }

  public void setEntries(@javax.annotation.Nullable List<EntryType> entries) {
    this.entries = JsonNullable.<List<EntryType>>of(entries);
  }

  public AuditEventDto context(@javax.annotation.Nullable String context) {
    this.context = JsonNullable.<String>of(context);
    
    return this;
  }

  /**
   * The audit event context.
   * @return context
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getContext() {
        return context.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_CONTEXT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getContext_JsonNullable() {
    return context;
  }
  
  @JsonProperty(JSON_PROPERTY_CONTEXT)
  public void setContext_JsonNullable(JsonNullable<String> context) {
    this.context = context;
  }

  public void setContext(@javax.annotation.Nullable String context) {
    this.context = JsonNullable.<String>of(context);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditEventDto auditEventDto = (AuditEventDto) o;
    return Objects.equals(this.id, auditEventDto.id) &&
        Objects.equals(this.date, auditEventDto.date) &&
        equalsNullable(this.user, auditEventDto.user) &&
        Objects.equals(this.userId, auditEventDto.userId) &&
        equalsNullable(this.action, auditEventDto.action) &&
        Objects.equals(this.actionId, auditEventDto.actionId) &&
        equalsNullable(this.ip, auditEventDto.ip) &&
        equalsNullable(this.country, auditEventDto.country) &&
        equalsNullable(this.city, auditEventDto.city) &&
        equalsNullable(this.browser, auditEventDto.browser) &&
        equalsNullable(this.platform, auditEventDto.platform) &&
        equalsNullable(this.page, auditEventDto.page) &&
        Objects.equals(this.actionType, auditEventDto.actionType) &&
        Objects.equals(this.product, auditEventDto.product) &&
        Objects.equals(this.location, auditEventDto.location) &&
        equalsNullable(this.target, auditEventDto.target) &&
        equalsNullable(this.entries, auditEventDto.entries) &&
        equalsNullable(this.context, auditEventDto.context);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, date, hashCodeNullable(user), userId, hashCodeNullable(action), actionId, hashCodeNullable(ip), hashCodeNullable(country), hashCodeNullable(city), hashCodeNullable(browser), hashCodeNullable(platform), hashCodeNullable(page), actionType, product, location, hashCodeNullable(target), hashCodeNullable(entries), hashCodeNullable(context));
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
    sb.append("class AuditEventDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    browser: ").append(toIndentedString(browser)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
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

    // add `date` to the URL query string
    if (getDate() != null) {
      joiner.add(getDate().toUrlQueryString(prefix + "date" + suffix));
    }

    // add `user` to the URL query string
    if (getUser() != null) {
      try {
        joiner.add(String.format("%suser%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUser()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `action` to the URL query string
    if (getAction() != null) {
      try {
        joiner.add(String.format("%saction%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAction()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `actionId` to the URL query string
    if (getActionId() != null) {
      try {
        joiner.add(String.format("%sactionId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getActionId()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `page` to the URL query string
    if (getPage() != null) {
      try {
        joiner.add(String.format("%spage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `actionType` to the URL query string
    if (getActionType() != null) {
      try {
        joiner.add(String.format("%sactionType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getActionType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `product` to the URL query string
    if (getProduct() != null) {
      try {
        joiner.add(String.format("%sproduct%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProduct()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `location` to the URL query string
    if (getLocation() != null) {
      try {
        joiner.add(String.format("%slocation%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLocation()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `target` to the URL query string
    if (getTarget() != null) {
      for (int i = 0; i < getTarget().size(); i++) {
        try {
          joiner.add(String.format("%starget%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getTarget().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `entries` to the URL query string
    if (getEntries() != null) {
      for (int i = 0; i < getEntries().size(); i++) {
        if (getEntries().get(i) != null) {
          try {
            joiner.add(String.format("%sentries%s%s=%s", prefix, suffix,
                "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
                URLEncoder.encode(String.valueOf(getEntries().get(i)), "UTF-8").replaceAll("\\+", "%20")));
          } catch (UnsupportedEncodingException e) {
            // Should never happen, UTF-8 is always supported
            throw new RuntimeException(e);
          }
        }
      }
    }

    // add `context` to the URL query string
    if (getContext() != null) {
      try {
        joiner.add(String.format("%scontext%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getContext()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

