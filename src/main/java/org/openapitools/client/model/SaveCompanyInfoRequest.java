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
import java.net.URI;
import java.time.OffsetDateTime;
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
 * The company the installation is branded for, as shown on the About page and in letters.
 */
@JsonPropertyOrder({
  SaveCompanyInfoRequest.JSON_PROPERTY_COMPANY_NAME,
  SaveCompanyInfoRequest.JSON_PROPERTY_SITE,
  SaveCompanyInfoRequest.JSON_PROPERTY_EMAIL,
  SaveCompanyInfoRequest.JSON_PROPERTY_ADDRESS,
  SaveCompanyInfoRequest.JSON_PROPERTY_PHONE,
  SaveCompanyInfoRequest.JSON_PROPERTY_IS_LICENSOR,
  SaveCompanyInfoRequest.JSON_PROPERTY_HIDE_ABOUT,
  SaveCompanyInfoRequest.JSON_PROPERTY_LAST_MODIFIED
})

public class SaveCompanyInfoRequest {
  public static final String JSON_PROPERTY_COMPANY_NAME = "companyName";
  @javax.annotation.Nullable  private JsonNullable<String> companyName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SITE = "site";
  @javax.annotation.Nullable  private JsonNullable<URI> site = JsonNullable.<URI>undefined();

  public static final String JSON_PROPERTY_EMAIL = "email";
  @javax.annotation.Nullable  private JsonNullable<String> email = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ADDRESS = "address";
  @javax.annotation.Nullable  private JsonNullable<String> address = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PHONE = "phone";
  @javax.annotation.Nullable  private JsonNullable<String> phone = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IS_LICENSOR = "IsLicensor";
  @javax.annotation.Nullable  private Boolean isLicensor;

  public static final String JSON_PROPERTY_HIDE_ABOUT = "hideAbout";
  @javax.annotation.Nullable  private Boolean hideAbout;

  public static final String JSON_PROPERTY_LAST_MODIFIED = "lastModified";
  @javax.annotation.Nullable  private OffsetDateTime lastModified;

  public SaveCompanyInfoRequest() {
  }


  public SaveCompanyInfoRequest companyName(@javax.annotation.Nullable String companyName) {
    this.companyName = JsonNullable.<String>of(companyName);
    
    return this;
  }

  /**
   * The company name.
   * @return companyName
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getCompanyName() {
        return companyName.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_COMPANY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getCompanyName_JsonNullable() {
    return companyName;
  }
  
  @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
  public void setCompanyName_JsonNullable(JsonNullable<String> companyName) {
    this.companyName = companyName;
  }

  public void setCompanyName(@javax.annotation.Nullable String companyName) {
    this.companyName = JsonNullable.<String>of(companyName);
  }

  public SaveCompanyInfoRequest site(@javax.annotation.Nullable URI site) {
    this.site = JsonNullable.<URI>of(site);
    
    return this;
  }

  /**
   * The company website, as an absolute URL.
   * @return site
   */
  @javax.annotation.Nullable  @JsonIgnore

  public URI getSite() {
        return site.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_SITE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<URI> getSite_JsonNullable() {
    return site;
  }
  
  @JsonProperty(JSON_PROPERTY_SITE)
  public void setSite_JsonNullable(JsonNullable<URI> site) {
    this.site = site;
  }

  public void setSite(@javax.annotation.Nullable URI site) {
    this.site = JsonNullable.<URI>of(site);
  }

  public SaveCompanyInfoRequest email(@javax.annotation.Nullable String email) {
    this.email = JsonNullable.<String>of(email);
    
    return this;
  }

  /**
   * The contact email address.
   * @return email
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getEmail() {
        return email.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_EMAIL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getEmail_JsonNullable() {
    return email;
  }
  
  @JsonProperty(JSON_PROPERTY_EMAIL)
  public void setEmail_JsonNullable(JsonNullable<String> email) {
    this.email = email;
  }

  public void setEmail(@javax.annotation.Nullable String email) {
    this.email = JsonNullable.<String>of(email);
  }

  public SaveCompanyInfoRequest address(@javax.annotation.Nullable String address) {
    this.address = JsonNullable.<String>of(address);
    
    return this;
  }

  /**
   * The postal address.
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

  public SaveCompanyInfoRequest phone(@javax.annotation.Nullable String phone) {
    this.phone = JsonNullable.<String>of(phone);
    
    return this;
  }

  /**
   * The contact phone number.
   * @return phone
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getPhone() {
        return phone.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_PHONE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getPhone_JsonNullable() {
    return phone;
  }
  
  @JsonProperty(JSON_PROPERTY_PHONE)
  public void setPhone_JsonNullable(JsonNullable<String> phone) {
    this.phone = phone;
  }

  public void setPhone(@javax.annotation.Nullable String phone) {
    this.phone = JsonNullable.<String>of(phone);
  }

  public SaveCompanyInfoRequest isLicensor(@javax.annotation.Nullable Boolean isLicensor) {
    
    this.isLicensor = isLicensor;
    return this;
  }

  /**
   * Accepted for compatibility with earlier clients and not read: saved details are never those of the licensor, so the server always stores `false`.
   * @return isLicensor
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IS_LICENSOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsLicensor() {
    return isLicensor;
  }


  @JsonProperty(value = JSON_PROPERTY_IS_LICENSOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsLicensor(@javax.annotation.Nullable Boolean isLicensor) {
    this.isLicensor = isLicensor;
  }

  public SaveCompanyInfoRequest hideAbout(@javax.annotation.Nullable Boolean hideAbout) {
    
    this.hideAbout = hideAbout;
    return this;
  }

  /**
   * Whether the About page is hidden.
   * @return hideAbout
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_HIDE_ABOUT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHideAbout() {
    return hideAbout;
  }


  @JsonProperty(value = JSON_PROPERTY_HIDE_ABOUT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHideAbout(@javax.annotation.Nullable Boolean hideAbout) {
    this.hideAbout = hideAbout;
  }

  public SaveCompanyInfoRequest lastModified(@javax.annotation.Nullable OffsetDateTime lastModified) {
    
    this.lastModified = lastModified;
    return this;
  }

  /**
   * Accepted for compatibility with earlier clients and not read: the server keeps its own value.
   * @return lastModified
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_LAST_MODIFIED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastModified() {
    return lastModified;
  }


  @JsonProperty(value = JSON_PROPERTY_LAST_MODIFIED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastModified(@javax.annotation.Nullable OffsetDateTime lastModified) {
    this.lastModified = lastModified;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaveCompanyInfoRequest saveCompanyInfoRequest = (SaveCompanyInfoRequest) o;
    return equalsNullable(this.companyName, saveCompanyInfoRequest.companyName) &&
        equalsNullable(this.site, saveCompanyInfoRequest.site) &&
        equalsNullable(this.email, saveCompanyInfoRequest.email) &&
        equalsNullable(this.address, saveCompanyInfoRequest.address) &&
        equalsNullable(this.phone, saveCompanyInfoRequest.phone) &&
        Objects.equals(this.isLicensor, saveCompanyInfoRequest.isLicensor) &&
        Objects.equals(this.hideAbout, saveCompanyInfoRequest.hideAbout) &&
        Objects.equals(this.lastModified, saveCompanyInfoRequest.lastModified);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(companyName), hashCodeNullable(site), hashCodeNullable(email), hashCodeNullable(address), hashCodeNullable(phone), isLicensor, hideAbout, lastModified);
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
    sb.append("class SaveCompanyInfoRequest {\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    isLicensor: ").append(toIndentedString(isLicensor)).append("\n");
    sb.append("    hideAbout: ").append(toIndentedString(hideAbout)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
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

    // add `companyName` to the URL query string
    if (getCompanyName() != null) {
      try {
        joiner.add(String.format("%scompanyName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCompanyName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `site` to the URL query string
    if (getSite() != null) {
      try {
        joiner.add(String.format("%ssite%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSite()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `email` to the URL query string
    if (getEmail() != null) {
      try {
        joiner.add(String.format("%semail%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmail()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `phone` to the URL query string
    if (getPhone() != null) {
      try {
        joiner.add(String.format("%sphone%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPhone()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `IsLicensor` to the URL query string
    if (getIsLicensor() != null) {
      try {
        joiner.add(String.format("%sIsLicensor%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsLicensor()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `hideAbout` to the URL query string
    if (getHideAbout() != null) {
      try {
        joiner.add(String.format("%shideAbout%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHideAbout()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `lastModified` to the URL query string
    if (getLastModified() != null) {
      try {
        joiner.add(String.format("%slastModified%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLastModified()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

