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
import org.openapitools.client.model.CurrentLicenseInfo;
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
 * The payment settings parameters.
 */
@JsonPropertyOrder({
  PaymentSettingsDto.JSON_PROPERTY_SALES_EMAIL,
  PaymentSettingsDto.JSON_PROPERTY_FEEDBACK_AND_SUPPORT_URL,
  PaymentSettingsDto.JSON_PROPERTY_BUY_URL,
  PaymentSettingsDto.JSON_PROPERTY_STANDALONE,
  PaymentSettingsDto.JSON_PROPERTY_CURRENT_LICENSE,
  PaymentSettingsDto.JSON_PROPERTY_MAX
})

public class PaymentSettingsDto {
  public static final String JSON_PROPERTY_SALES_EMAIL = "salesEmail";
  @javax.annotation.Nullable
  private String salesEmail;

  public static final String JSON_PROPERTY_FEEDBACK_AND_SUPPORT_URL = "feedbackAndSupportUrl";
  @javax.annotation.Nullable
  private JsonNullable<String> feedbackAndSupportUrl = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BUY_URL = "buyUrl";
  @javax.annotation.Nullable
  private String buyUrl;

  public static final String JSON_PROPERTY_STANDALONE = "standalone";
  @javax.annotation.Nonnull
  private Boolean standalone;

  public static final String JSON_PROPERTY_CURRENT_LICENSE = "currentLicense";
  @javax.annotation.Nonnull
  private CurrentLicenseInfo currentLicense;

  public static final String JSON_PROPERTY_MAX = "max";
  @javax.annotation.Nonnull
  private Integer max;

  public PaymentSettingsDto() {
  }


  public PaymentSettingsDto salesEmail(@javax.annotation.Nullable String salesEmail) {
    
    this.salesEmail = salesEmail;
    return this;
  }

  /**
   * The email address for sales inquiries and support.
   * @return salesEmail
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SALES_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSalesEmail() {
    return salesEmail;
  }


  @JsonProperty(JSON_PROPERTY_SALES_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSalesEmail(@javax.annotation.Nullable String salesEmail) {
    this.salesEmail = salesEmail;
  }

  public PaymentSettingsDto feedbackAndSupportUrl(@javax.annotation.Nullable String feedbackAndSupportUrl) {
    this.feedbackAndSupportUrl = JsonNullable.<String>of(feedbackAndSupportUrl);
    
    return this;
  }

  /**
   * The URL for accessing the feedback and support resources.
   * @return feedbackAndSupportUrl
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getFeedbackAndSupportUrl() {
        return feedbackAndSupportUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FEEDBACK_AND_SUPPORT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFeedbackAndSupportUrl_JsonNullable() {
    return feedbackAndSupportUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_FEEDBACK_AND_SUPPORT_URL)
  public void setFeedbackAndSupportUrl_JsonNullable(JsonNullable<String> feedbackAndSupportUrl) {
    this.feedbackAndSupportUrl = feedbackAndSupportUrl;
  }

  public void setFeedbackAndSupportUrl(@javax.annotation.Nullable String feedbackAndSupportUrl) {
    this.feedbackAndSupportUrl = JsonNullable.<String>of(feedbackAndSupportUrl);
  }

  public PaymentSettingsDto buyUrl(@javax.annotation.Nullable String buyUrl) {
    
    this.buyUrl = buyUrl;
    return this;
  }

  /**
   * The URL for purchasing or upgrading the product.
   * @return buyUrl
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBuyUrl() {
    return buyUrl;
  }


  @JsonProperty(JSON_PROPERTY_BUY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBuyUrl(@javax.annotation.Nullable String buyUrl) {
    this.buyUrl = buyUrl;
  }

  public PaymentSettingsDto standalone(@javax.annotation.Nonnull Boolean standalone) {
    
    this.standalone = standalone;
    return this;
  }

  /**
   * Indicates whether the system is running in standalone mode.
   * @return standalone
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STANDALONE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getStandalone() {
    return standalone;
  }


  @JsonProperty(JSON_PROPERTY_STANDALONE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStandalone(@javax.annotation.Nonnull Boolean standalone) {
    this.standalone = standalone;
  }

  public PaymentSettingsDto currentLicense(@javax.annotation.Nonnull CurrentLicenseInfo currentLicense) {
    
    this.currentLicense = currentLicense;
    return this;
  }

  /**
   * Get currentLicense
   * @return currentLicense
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CURRENT_LICENSE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CurrentLicenseInfo getCurrentLicense() {
    return currentLicense;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_LICENSE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrentLicense(@javax.annotation.Nonnull CurrentLicenseInfo currentLicense) {
    this.currentLicense = currentLicense;
  }

  public PaymentSettingsDto max(@javax.annotation.Nonnull Integer max) {
    
    this.max = max;
    return this;
  }

  /**
   * The maximum quota quantity.
   * @return max
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MAX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getMax() {
    return max;
  }


  @JsonProperty(JSON_PROPERTY_MAX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMax(@javax.annotation.Nonnull Integer max) {
    this.max = max;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentSettingsDto paymentSettingsDto = (PaymentSettingsDto) o;
    return Objects.equals(this.salesEmail, paymentSettingsDto.salesEmail) &&
        equalsNullable(this.feedbackAndSupportUrl, paymentSettingsDto.feedbackAndSupportUrl) &&
        Objects.equals(this.buyUrl, paymentSettingsDto.buyUrl) &&
        Objects.equals(this.standalone, paymentSettingsDto.standalone) &&
        Objects.equals(this.currentLicense, paymentSettingsDto.currentLicense) &&
        Objects.equals(this.max, paymentSettingsDto.max);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(salesEmail, hashCodeNullable(feedbackAndSupportUrl), buyUrl, standalone, currentLicense, max);
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
    sb.append("class PaymentSettingsDto {\n");
    sb.append("    salesEmail: ").append(toIndentedString(salesEmail)).append("\n");
    sb.append("    feedbackAndSupportUrl: ").append(toIndentedString(feedbackAndSupportUrl)).append("\n");
    sb.append("    buyUrl: ").append(toIndentedString(buyUrl)).append("\n");
    sb.append("    standalone: ").append(toIndentedString(standalone)).append("\n");
    sb.append("    currentLicense: ").append(toIndentedString(currentLicense)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
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

    // add `salesEmail` to the URL query string
    if (getSalesEmail() != null) {
      try {
        joiner.add(String.format("%ssalesEmail%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSalesEmail()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `feedbackAndSupportUrl` to the URL query string
    if (getFeedbackAndSupportUrl() != null) {
      try {
        joiner.add(String.format("%sfeedbackAndSupportUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFeedbackAndSupportUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `buyUrl` to the URL query string
    if (getBuyUrl() != null) {
      try {
        joiner.add(String.format("%sbuyUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBuyUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `standalone` to the URL query string
    if (getStandalone() != null) {
      try {
        joiner.add(String.format("%sstandalone%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStandalone()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `currentLicense` to the URL query string
    if (getCurrentLicense() != null) {
      joiner.add(getCurrentLicense().toUrlQueryString(prefix + "currentLicense" + suffix));
    }

    // add `max` to the URL query string
    if (getMax() != null) {
      try {
        joiner.add(String.format("%smax%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMax()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

