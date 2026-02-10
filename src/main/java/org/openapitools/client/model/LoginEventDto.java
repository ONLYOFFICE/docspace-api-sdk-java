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
import org.openapitools.client.model.MessageAction;
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
 * The login event parameters.
 */
@JsonPropertyOrder({
  LoginEventDto.JSON_PROPERTY_ID,
  LoginEventDto.JSON_PROPERTY_DATE,
  LoginEventDto.JSON_PROPERTY_USER,
  LoginEventDto.JSON_PROPERTY_USER_ID,
  LoginEventDto.JSON_PROPERTY_LOGIN,
  LoginEventDto.JSON_PROPERTY_ACTION,
  LoginEventDto.JSON_PROPERTY_ACTION_ID,
  LoginEventDto.JSON_PROPERTY_IP,
  LoginEventDto.JSON_PROPERTY_COUNTRY,
  LoginEventDto.JSON_PROPERTY_CITY,
  LoginEventDto.JSON_PROPERTY_BROWSER,
  LoginEventDto.JSON_PROPERTY_PLATFORM,
  LoginEventDto.JSON_PROPERTY_PAGE
})

public class LoginEventDto {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Integer id;

  public static final String JSON_PROPERTY_DATE = "date";
  @javax.annotation.Nullable
  private ApiDateTime date;

  public static final String JSON_PROPERTY_USER = "user";
  @javax.annotation.Nullable
  private JsonNullable<String> user = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_USER_ID = "userId";
  @javax.annotation.Nullable
  private UUID userId;

  public static final String JSON_PROPERTY_LOGIN = "login";
  @javax.annotation.Nullable
  private JsonNullable<String> login = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ACTION = "action";
  @javax.annotation.Nullable
  private JsonNullable<String> action = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ACTION_ID = "actionId";
  @javax.annotation.Nullable
  private MessageAction actionId;

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

  public static final String JSON_PROPERTY_PAGE = "page";
  @javax.annotation.Nullable
  private JsonNullable<String> page = JsonNullable.<String>undefined();

  public LoginEventDto() {
  }


  public LoginEventDto id(@javax.annotation.Nullable Integer id) {
    
    this.id = id;
    return this;
  }

  /**
   * The login event ID.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable Integer id) {
    this.id = id;
  }

  public LoginEventDto date(@javax.annotation.Nullable ApiDateTime date) {
    
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

  public LoginEventDto user(@javax.annotation.Nullable String user) {
    this.user = JsonNullable.<String>of(user);
    
    return this;
  }

  /**
   * The user name of the login event.
   * @return user
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getUser() {
        return user.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USER)
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

  public LoginEventDto userId(@javax.annotation.Nullable UUID userId) {
    
    this.userId = userId;
    return this;
  }

  /**
   * The user ID of the login event.
   * @return userId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(@javax.annotation.Nullable UUID userId) {
    this.userId = userId;
  }

  public LoginEventDto login(@javax.annotation.Nullable String login) {
    this.login = JsonNullable.<String>of(login);
    
    return this;
  }

  /**
   * The user login of the login event.
   * @return login
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getLogin() {
        return login.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLogin_JsonNullable() {
    return login;
  }
  
  @JsonProperty(JSON_PROPERTY_LOGIN)
  public void setLogin_JsonNullable(JsonNullable<String> login) {
    this.login = login;
  }

  public void setLogin(@javax.annotation.Nullable String login) {
    this.login = JsonNullable.<String>of(login);
  }

  public LoginEventDto action(@javax.annotation.Nullable String action) {
    this.action = JsonNullable.<String>of(action);
    
    return this;
  }

  /**
   * The login event action.
   * @return action
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getAction() {
        return action.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ACTION)
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

  public LoginEventDto actionId(@javax.annotation.Nullable MessageAction actionId) {
    
    this.actionId = actionId;
    return this;
  }

  /**
   * Get actionId
   * @return actionId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MessageAction getActionId() {
    return actionId;
  }


  @JsonProperty(JSON_PROPERTY_ACTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActionId(@javax.annotation.Nullable MessageAction actionId) {
    this.actionId = actionId;
  }

  public LoginEventDto ip(@javax.annotation.Nullable String ip) {
    this.ip = JsonNullable.<String>of(ip);
    
    return this;
  }

  /**
   * The login event IP.
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

  public LoginEventDto country(@javax.annotation.Nullable String country) {
    this.country = JsonNullable.<String>of(country);
    
    return this;
  }

  /**
   * The login event country.
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

  public LoginEventDto city(@javax.annotation.Nullable String city) {
    this.city = JsonNullable.<String>of(city);
    
    return this;
  }

  /**
   * The login event city.
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

  public LoginEventDto browser(@javax.annotation.Nullable String browser) {
    this.browser = JsonNullable.<String>of(browser);
    
    return this;
  }

  /**
   * The login event browser.
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

  public LoginEventDto platform(@javax.annotation.Nullable String platform) {
    this.platform = JsonNullable.<String>of(platform);
    
    return this;
  }

  /**
   * The login event platform.
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

  public LoginEventDto page(@javax.annotation.Nullable String page) {
    this.page = JsonNullable.<String>of(page);
    
    return this;
  }

  /**
   * The login event page.
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
    LoginEventDto loginEventDto = (LoginEventDto) o;
    return Objects.equals(this.id, loginEventDto.id) &&
        Objects.equals(this.date, loginEventDto.date) &&
        equalsNullable(this.user, loginEventDto.user) &&
        Objects.equals(this.userId, loginEventDto.userId) &&
        equalsNullable(this.login, loginEventDto.login) &&
        equalsNullable(this.action, loginEventDto.action) &&
        Objects.equals(this.actionId, loginEventDto.actionId) &&
        equalsNullable(this.ip, loginEventDto.ip) &&
        equalsNullable(this.country, loginEventDto.country) &&
        equalsNullable(this.city, loginEventDto.city) &&
        equalsNullable(this.browser, loginEventDto.browser) &&
        equalsNullable(this.platform, loginEventDto.platform) &&
        equalsNullable(this.page, loginEventDto.page);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, date, hashCodeNullable(user), userId, hashCodeNullable(login), hashCodeNullable(action), actionId, hashCodeNullable(ip), hashCodeNullable(country), hashCodeNullable(city), hashCodeNullable(browser), hashCodeNullable(platform), hashCodeNullable(page));
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
    sb.append("class LoginEventDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    browser: ").append(toIndentedString(browser)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
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

    // add `login` to the URL query string
    if (getLogin() != null) {
      try {
        joiner.add(String.format("%slogin%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLogin()), "UTF-8").replaceAll("\\+", "%20")));
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

    return joiner.toString();
  }

}

