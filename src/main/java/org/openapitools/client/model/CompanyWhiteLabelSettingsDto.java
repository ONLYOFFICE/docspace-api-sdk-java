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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The company white label settings.
 */
@JsonPropertyOrder({
  CompanyWhiteLabelSettingsDto.JSON_PROPERTY_COMPANY_NAME,
  CompanyWhiteLabelSettingsDto.JSON_PROPERTY_SITE,
  CompanyWhiteLabelSettingsDto.JSON_PROPERTY_EMAIL,
  CompanyWhiteLabelSettingsDto.JSON_PROPERTY_ADDRESS,
  CompanyWhiteLabelSettingsDto.JSON_PROPERTY_PHONE,
  CompanyWhiteLabelSettingsDto.JSON_PROPERTY_IS_LICENSOR,
  CompanyWhiteLabelSettingsDto.JSON_PROPERTY_HIDE_ABOUT,
  CompanyWhiteLabelSettingsDto.JSON_PROPERTY_IS_DEFAULT
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class CompanyWhiteLabelSettingsDto {
  public static final String JSON_PROPERTY_COMPANY_NAME = "companyName";
  @javax.annotation.Nullable
  private String companyName;

  public static final String JSON_PROPERTY_SITE = "site";
  @javax.annotation.Nullable
  private String site;

  public static final String JSON_PROPERTY_EMAIL = "email";
  @javax.annotation.Nullable
  private String email;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  @javax.annotation.Nullable
  private String address;

  public static final String JSON_PROPERTY_PHONE = "phone";
  @javax.annotation.Nullable
  private String phone;

  public static final String JSON_PROPERTY_IS_LICENSOR = "isLicensor";
  @javax.annotation.Nonnull
  private Boolean isLicensor;

  public static final String JSON_PROPERTY_HIDE_ABOUT = "hideAbout";
  @javax.annotation.Nonnull
  private Boolean hideAbout;

  public static final String JSON_PROPERTY_IS_DEFAULT = "isDefault";
  @javax.annotation.Nonnull
  private Boolean isDefault;

  public CompanyWhiteLabelSettingsDto() {
  }

  public CompanyWhiteLabelSettingsDto companyName(@javax.annotation.Nullable String companyName) {
    
    this.companyName = companyName;
    return this;
  }

  /**
   * The company name.
   * @return companyName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCompanyName() {
    return companyName;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCompanyName(@javax.annotation.Nullable String companyName) {
    this.companyName = companyName;
  }

  public CompanyWhiteLabelSettingsDto site(@javax.annotation.Nullable String site) {
    
    this.site = site;
    return this;
  }

  /**
   * The company site.
   * @return site
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SITE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSite() {
    return site;
  }


  @JsonProperty(JSON_PROPERTY_SITE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSite(@javax.annotation.Nullable String site) {
    this.site = site;
  }

  public CompanyWhiteLabelSettingsDto email(@javax.annotation.Nullable String email) {
    
    this.email = email;
    return this;
  }

  /**
   * The company email address.
   * @return email
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmail(@javax.annotation.Nullable String email) {
    this.email = email;
  }

  public CompanyWhiteLabelSettingsDto address(@javax.annotation.Nullable String address) {
    
    this.address = address;
    return this;
  }

  /**
   * The company address.
   * @return address
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAddress(@javax.annotation.Nullable String address) {
    this.address = address;
  }

  public CompanyWhiteLabelSettingsDto phone(@javax.annotation.Nullable String phone) {
    
    this.phone = phone;
    return this;
  }

  /**
   * The company phone number.
   * @return phone
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPhone() {
    return phone;
  }


  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPhone(@javax.annotation.Nullable String phone) {
    this.phone = phone;
  }

  public CompanyWhiteLabelSettingsDto isLicensor(@javax.annotation.Nonnull Boolean isLicensor) {
    
    this.isLicensor = isLicensor;
    return this;
  }

  /**
   * Specifies if a company is a licensor or not.
   * @return isLicensor
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_LICENSOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsLicensor() {
    return isLicensor;
  }


  @JsonProperty(JSON_PROPERTY_IS_LICENSOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsLicensor(@javax.annotation.Nonnull Boolean isLicensor) {
    this.isLicensor = isLicensor;
  }

  public CompanyWhiteLabelSettingsDto hideAbout(@javax.annotation.Nonnull Boolean hideAbout) {
    
    this.hideAbout = hideAbout;
    return this;
  }

  /**
   * Specifies if the About page is visible or not.
   * @return hideAbout
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HIDE_ABOUT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getHideAbout() {
    return hideAbout;
  }


  @JsonProperty(JSON_PROPERTY_HIDE_ABOUT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHideAbout(@javax.annotation.Nonnull Boolean hideAbout) {
    this.hideAbout = hideAbout;
  }

  public CompanyWhiteLabelSettingsDto isDefault(@javax.annotation.Nonnull Boolean isDefault) {
    
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Specifies if these settings are default or not.
   * @return isDefault
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsDefault() {
    return isDefault;
  }


  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsDefault(@javax.annotation.Nonnull Boolean isDefault) {
    this.isDefault = isDefault;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyWhiteLabelSettingsDto companyWhiteLabelSettingsDto = (CompanyWhiteLabelSettingsDto) o;
    return Objects.equals(this.companyName, companyWhiteLabelSettingsDto.companyName) &&
        Objects.equals(this.site, companyWhiteLabelSettingsDto.site) &&
        Objects.equals(this.email, companyWhiteLabelSettingsDto.email) &&
        Objects.equals(this.address, companyWhiteLabelSettingsDto.address) &&
        Objects.equals(this.phone, companyWhiteLabelSettingsDto.phone) &&
        Objects.equals(this.isLicensor, companyWhiteLabelSettingsDto.isLicensor) &&
        Objects.equals(this.hideAbout, companyWhiteLabelSettingsDto.hideAbout) &&
        Objects.equals(this.isDefault, companyWhiteLabelSettingsDto.isDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyName, site, email, address, phone, isLicensor, hideAbout, isDefault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyWhiteLabelSettingsDto {\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    isLicensor: ").append(toIndentedString(isLicensor)).append("\n");
    sb.append("    hideAbout: ").append(toIndentedString(hideAbout)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
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

    // add `isLicensor` to the URL query string
    if (getIsLicensor() != null) {
      try {
        joiner.add(String.format("%sisLicensor%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsLicensor()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `isDefault` to the URL query string
    if (getIsDefault() != null) {
      try {
        joiner.add(String.format("%sisDefault%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsDefault()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

