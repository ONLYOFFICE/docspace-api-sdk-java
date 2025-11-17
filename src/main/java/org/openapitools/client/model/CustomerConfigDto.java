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
 * The customer config parameters.
 */
@JsonPropertyOrder({
  CustomerConfigDto.JSON_PROPERTY_ADDRESS,
  CustomerConfigDto.JSON_PROPERTY_LOGO,
  CustomerConfigDto.JSON_PROPERTY_LOGO_DARK,
  CustomerConfigDto.JSON_PROPERTY_MAIL,
  CustomerConfigDto.JSON_PROPERTY_NAME,
  CustomerConfigDto.JSON_PROPERTY_WWW
})

public class CustomerConfigDto {
  public static final String JSON_PROPERTY_ADDRESS = "address";
  @javax.annotation.Nullable
  private JsonNullable<String> address = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LOGO = "logo";
  @javax.annotation.Nullable
  private JsonNullable<String> logo = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LOGO_DARK = "logoDark";
  @javax.annotation.Nullable
  private JsonNullable<String> logoDark = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MAIL = "mail";
  @javax.annotation.Nullable
  private JsonNullable<String> mail = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_WWW = "www";
  @javax.annotation.Nullable
  private JsonNullable<String> www = JsonNullable.<String>undefined();

  public CustomerConfigDto() {
  }

  public CustomerConfigDto address(@javax.annotation.Nullable String address) {
    this.address = JsonNullable.<String>of(address);
    
    return this;
  }

  /**
   * The address of the customer configuration.
   * @return address
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getAddress() {
        return address.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ADDRESS)
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

  public CustomerConfigDto logo(@javax.annotation.Nullable String logo) {
    this.logo = JsonNullable.<String>of(logo);
    
    return this;
  }

  /**
   * The logo of the customer configuration.
   * @return logo
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getLogo() {
        return logo.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOGO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLogo_JsonNullable() {
    return logo;
  }
  
  @JsonProperty(JSON_PROPERTY_LOGO)
  public void setLogo_JsonNullable(JsonNullable<String> logo) {
    this.logo = logo;
  }

  public void setLogo(@javax.annotation.Nullable String logo) {
    this.logo = JsonNullable.<String>of(logo);
  }

  public CustomerConfigDto logoDark(@javax.annotation.Nullable String logoDark) {
    this.logoDark = JsonNullable.<String>of(logoDark);
    
    return this;
  }

  /**
   * The dark logo of the customer configuration.
   * @return logoDark
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getLogoDark() {
        return logoDark.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOGO_DARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLogoDark_JsonNullable() {
    return logoDark;
  }
  
  @JsonProperty(JSON_PROPERTY_LOGO_DARK)
  public void setLogoDark_JsonNullable(JsonNullable<String> logoDark) {
    this.logoDark = logoDark;
  }

  public void setLogoDark(@javax.annotation.Nullable String logoDark) {
    this.logoDark = JsonNullable.<String>of(logoDark);
  }

  public CustomerConfigDto mail(@javax.annotation.Nullable String mail) {
    this.mail = JsonNullable.<String>of(mail);
    
    return this;
  }

  /**
   * The mail address of the customer configuration.
   * @return mail
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getMail() {
        return mail.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMail_JsonNullable() {
    return mail;
  }
  
  @JsonProperty(JSON_PROPERTY_MAIL)
  public void setMail_JsonNullable(JsonNullable<String> mail) {
    this.mail = mail;
  }

  public void setMail(@javax.annotation.Nullable String mail) {
    this.mail = JsonNullable.<String>of(mail);
  }

  public CustomerConfigDto name(@javax.annotation.Nullable String name) {
    this.name = JsonNullable.<String>of(name);
    
    return this;
  }

  /**
   * The name of the customer configuration.
   * @return name
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
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

  public CustomerConfigDto www(@javax.annotation.Nullable String www) {
    this.www = JsonNullable.<String>of(www);
    
    return this;
  }

  /**
   * The site web address of the customer configuration.
   * @return www
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getWww() {
        return www.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WWW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getWww_JsonNullable() {
    return www;
  }
  
  @JsonProperty(JSON_PROPERTY_WWW)
  public void setWww_JsonNullable(JsonNullable<String> www) {
    this.www = www;
  }

  public void setWww(@javax.annotation.Nullable String www) {
    this.www = JsonNullable.<String>of(www);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerConfigDto customerConfigDto = (CustomerConfigDto) o;
    return equalsNullable(this.address, customerConfigDto.address) &&
        equalsNullable(this.logo, customerConfigDto.logo) &&
        equalsNullable(this.logoDark, customerConfigDto.logoDark) &&
        equalsNullable(this.mail, customerConfigDto.mail) &&
        equalsNullable(this.name, customerConfigDto.name) &&
        equalsNullable(this.www, customerConfigDto.www);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(address), hashCodeNullable(logo), hashCodeNullable(logoDark), hashCodeNullable(mail), hashCodeNullable(name), hashCodeNullable(www));
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
    sb.append("class CustomerConfigDto {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    logoDark: ").append(toIndentedString(logoDark)).append("\n");
    sb.append("    mail: ").append(toIndentedString(mail)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    www: ").append(toIndentedString(www)).append("\n");
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

    // add `address` to the URL query string
    if (getAddress() != null) {
      try {
        joiner.add(String.format("%saddress%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAddress()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `logo` to the URL query string
    if (getLogo() != null) {
      try {
        joiner.add(String.format("%slogo%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLogo()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `logoDark` to the URL query string
    if (getLogoDark() != null) {
      try {
        joiner.add(String.format("%slogoDark%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLogoDark()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `mail` to the URL query string
    if (getMail() != null) {
      try {
        joiner.add(String.format("%smail%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMail()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `www` to the URL query string
    if (getWww() != null) {
      try {
        joiner.add(String.format("%swww%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWww()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

