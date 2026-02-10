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
import org.openapitools.client.model.AnonymousConfigDto;
import org.openapitools.client.model.CustomerConfigDto;
import org.openapitools.client.model.FeedbackConfig;
import org.openapitools.client.model.GobackConfig;
import org.openapitools.client.model.LogoConfigDto;
import org.openapitools.client.model.ReviewConfig;
import org.openapitools.client.model.StartFillingForm;
import org.openapitools.client.model.SubmitForm;
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
 * The customization config parameters.
 */
@JsonPropertyOrder({
  CustomizationConfigDto.JSON_PROPERTY_ABOUT,
  CustomizationConfigDto.JSON_PROPERTY_CUSTOMER,
  CustomizationConfigDto.JSON_PROPERTY_ANONYMOUS,
  CustomizationConfigDto.JSON_PROPERTY_FEEDBACK,
  CustomizationConfigDto.JSON_PROPERTY_FORCESAVE,
  CustomizationConfigDto.JSON_PROPERTY_GOBACK,
  CustomizationConfigDto.JSON_PROPERTY_REVIEW,
  CustomizationConfigDto.JSON_PROPERTY_LOGO,
  CustomizationConfigDto.JSON_PROPERTY_MENTION_SHARE,
  CustomizationConfigDto.JSON_PROPERTY_SUBMIT_FORM,
  CustomizationConfigDto.JSON_PROPERTY_START_FILLING_FORM
})

public class CustomizationConfigDto {
  public static final String JSON_PROPERTY_ABOUT = "about";
  @javax.annotation.Nullable
  private Boolean about;

  public static final String JSON_PROPERTY_CUSTOMER = "customer";
  @javax.annotation.Nullable
  private CustomerConfigDto customer;

  public static final String JSON_PROPERTY_ANONYMOUS = "anonymous";
  @javax.annotation.Nullable
  private AnonymousConfigDto anonymous;

  public static final String JSON_PROPERTY_FEEDBACK = "feedback";
  @javax.annotation.Nullable
  private FeedbackConfig feedback;

  public static final String JSON_PROPERTY_FORCESAVE = "forcesave";
  @javax.annotation.Nullable
  private JsonNullable<Boolean> forcesave = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_GOBACK = "goback";
  @javax.annotation.Nullable
  private GobackConfig goback;

  public static final String JSON_PROPERTY_REVIEW = "review";
  @javax.annotation.Nullable
  private ReviewConfig review;

  public static final String JSON_PROPERTY_LOGO = "logo";
  @javax.annotation.Nullable
  private LogoConfigDto logo;

  public static final String JSON_PROPERTY_MENTION_SHARE = "mentionShare";
  @javax.annotation.Nullable
  private Boolean mentionShare;

  public static final String JSON_PROPERTY_SUBMIT_FORM = "submitForm";
  @javax.annotation.Nullable
  private SubmitForm submitForm;

  public static final String JSON_PROPERTY_START_FILLING_FORM = "startFillingForm";
  @javax.annotation.Nullable
  private StartFillingForm startFillingForm;

  public CustomizationConfigDto() {
  }


  public CustomizationConfigDto about(@javax.annotation.Nullable Boolean about) {
    
    this.about = about;
    return this;
  }

  /**
   * Specifies if the customization is about.
   * @return about
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ABOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAbout() {
    return about;
  }


  @JsonProperty(JSON_PROPERTY_ABOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAbout(@javax.annotation.Nullable Boolean about) {
    this.about = about;
  }

  public CustomizationConfigDto customer(@javax.annotation.Nullable CustomerConfigDto customer) {
    
    this.customer = customer;
    return this;
  }

  /**
   * Get customer
   * @return customer
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CustomerConfigDto getCustomer() {
    return customer;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomer(@javax.annotation.Nullable CustomerConfigDto customer) {
    this.customer = customer;
  }

  public CustomizationConfigDto anonymous(@javax.annotation.Nullable AnonymousConfigDto anonymous) {
    
    this.anonymous = anonymous;
    return this;
  }

  /**
   * Get anonymous
   * @return anonymous
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANONYMOUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AnonymousConfigDto getAnonymous() {
    return anonymous;
  }


  @JsonProperty(JSON_PROPERTY_ANONYMOUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnonymous(@javax.annotation.Nullable AnonymousConfigDto anonymous) {
    this.anonymous = anonymous;
  }

  public CustomizationConfigDto feedback(@javax.annotation.Nullable FeedbackConfig feedback) {
    
    this.feedback = feedback;
    return this;
  }

  /**
   * Get feedback
   * @return feedback
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEEDBACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedbackConfig getFeedback() {
    return feedback;
  }


  @JsonProperty(JSON_PROPERTY_FEEDBACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeedback(@javax.annotation.Nullable FeedbackConfig feedback) {
    this.feedback = feedback;
  }

  public CustomizationConfigDto forcesave(@javax.annotation.Nullable Boolean forcesave) {
    this.forcesave = JsonNullable.<Boolean>of(forcesave);
    
    return this;
  }

  /**
   * Specifies if the customization should be force saved.
   * @return forcesave
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getForcesave() {
        return forcesave.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FORCESAVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getForcesave_JsonNullable() {
    return forcesave;
  }
  
  @JsonProperty(JSON_PROPERTY_FORCESAVE)
  public void setForcesave_JsonNullable(JsonNullable<Boolean> forcesave) {
    this.forcesave = forcesave;
  }

  public void setForcesave(@javax.annotation.Nullable Boolean forcesave) {
    this.forcesave = JsonNullable.<Boolean>of(forcesave);
  }

  public CustomizationConfigDto goback(@javax.annotation.Nullable GobackConfig goback) {
    
    this.goback = goback;
    return this;
  }

  /**
   * Get goback
   * @return goback
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GOBACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GobackConfig getGoback() {
    return goback;
  }


  @JsonProperty(JSON_PROPERTY_GOBACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGoback(@javax.annotation.Nullable GobackConfig goback) {
    this.goback = goback;
  }

  public CustomizationConfigDto review(@javax.annotation.Nullable ReviewConfig review) {
    
    this.review = review;
    return this;
  }

  /**
   * Get review
   * @return review
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REVIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReviewConfig getReview() {
    return review;
  }


  @JsonProperty(JSON_PROPERTY_REVIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReview(@javax.annotation.Nullable ReviewConfig review) {
    this.review = review;
  }

  public CustomizationConfigDto logo(@javax.annotation.Nullable LogoConfigDto logo) {
    
    this.logo = logo;
    return this;
  }

  /**
   * Get logo
   * @return logo
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LogoConfigDto getLogo() {
    return logo;
  }


  @JsonProperty(JSON_PROPERTY_LOGO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogo(@javax.annotation.Nullable LogoConfigDto logo) {
    this.logo = logo;
  }

  public CustomizationConfigDto mentionShare(@javax.annotation.Nullable Boolean mentionShare) {
    
    this.mentionShare = mentionShare;
    return this;
  }

  /**
   * Specifies if the share should be mentioned.
   * @return mentionShare
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MENTION_SHARE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMentionShare() {
    return mentionShare;
  }


  @JsonProperty(JSON_PROPERTY_MENTION_SHARE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMentionShare(@javax.annotation.Nullable Boolean mentionShare) {
    this.mentionShare = mentionShare;
  }

  public CustomizationConfigDto submitForm(@javax.annotation.Nullable SubmitForm submitForm) {
    
    this.submitForm = submitForm;
    return this;
  }

  /**
   * Get submitForm
   * @return submitForm
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBMIT_FORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubmitForm getSubmitForm() {
    return submitForm;
  }


  @JsonProperty(JSON_PROPERTY_SUBMIT_FORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubmitForm(@javax.annotation.Nullable SubmitForm submitForm) {
    this.submitForm = submitForm;
  }

  public CustomizationConfigDto startFillingForm(@javax.annotation.Nullable StartFillingForm startFillingForm) {
    
    this.startFillingForm = startFillingForm;
    return this;
  }

  /**
   * Get startFillingForm
   * @return startFillingForm
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_FILLING_FORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StartFillingForm getStartFillingForm() {
    return startFillingForm;
  }


  @JsonProperty(JSON_PROPERTY_START_FILLING_FORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartFillingForm(@javax.annotation.Nullable StartFillingForm startFillingForm) {
    this.startFillingForm = startFillingForm;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomizationConfigDto customizationConfigDto = (CustomizationConfigDto) o;
    return Objects.equals(this.about, customizationConfigDto.about) &&
        Objects.equals(this.customer, customizationConfigDto.customer) &&
        Objects.equals(this.anonymous, customizationConfigDto.anonymous) &&
        Objects.equals(this.feedback, customizationConfigDto.feedback) &&
        equalsNullable(this.forcesave, customizationConfigDto.forcesave) &&
        Objects.equals(this.goback, customizationConfigDto.goback) &&
        Objects.equals(this.review, customizationConfigDto.review) &&
        Objects.equals(this.logo, customizationConfigDto.logo) &&
        Objects.equals(this.mentionShare, customizationConfigDto.mentionShare) &&
        Objects.equals(this.submitForm, customizationConfigDto.submitForm) &&
        Objects.equals(this.startFillingForm, customizationConfigDto.startFillingForm);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(about, customer, anonymous, feedback, hashCodeNullable(forcesave), goback, review, logo, mentionShare, submitForm, startFillingForm);
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
    sb.append("class CustomizationConfigDto {\n");
    sb.append("    about: ").append(toIndentedString(about)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    anonymous: ").append(toIndentedString(anonymous)).append("\n");
    sb.append("    feedback: ").append(toIndentedString(feedback)).append("\n");
    sb.append("    forcesave: ").append(toIndentedString(forcesave)).append("\n");
    sb.append("    goback: ").append(toIndentedString(goback)).append("\n");
    sb.append("    review: ").append(toIndentedString(review)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    mentionShare: ").append(toIndentedString(mentionShare)).append("\n");
    sb.append("    submitForm: ").append(toIndentedString(submitForm)).append("\n");
    sb.append("    startFillingForm: ").append(toIndentedString(startFillingForm)).append("\n");
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

    // add `about` to the URL query string
    if (getAbout() != null) {
      try {
        joiner.add(String.format("%sabout%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAbout()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `customer` to the URL query string
    if (getCustomer() != null) {
      joiner.add(getCustomer().toUrlQueryString(prefix + "customer" + suffix));
    }

    // add `anonymous` to the URL query string
    if (getAnonymous() != null) {
      joiner.add(getAnonymous().toUrlQueryString(prefix + "anonymous" + suffix));
    }

    // add `feedback` to the URL query string
    if (getFeedback() != null) {
      joiner.add(getFeedback().toUrlQueryString(prefix + "feedback" + suffix));
    }

    // add `forcesave` to the URL query string
    if (getForcesave() != null) {
      try {
        joiner.add(String.format("%sforcesave%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getForcesave()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `goback` to the URL query string
    if (getGoback() != null) {
      joiner.add(getGoback().toUrlQueryString(prefix + "goback" + suffix));
    }

    // add `review` to the URL query string
    if (getReview() != null) {
      joiner.add(getReview().toUrlQueryString(prefix + "review" + suffix));
    }

    // add `logo` to the URL query string
    if (getLogo() != null) {
      joiner.add(getLogo().toUrlQueryString(prefix + "logo" + suffix));
    }

    // add `mentionShare` to the URL query string
    if (getMentionShare() != null) {
      try {
        joiner.add(String.format("%smentionShare%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMentionShare()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `submitForm` to the URL query string
    if (getSubmitForm() != null) {
      joiner.add(getSubmitForm().toUrlQueryString(prefix + "submitForm" + suffix));
    }

    // add `startFillingForm` to the URL query string
    if (getStartFillingForm() != null) {
      joiner.add(getStartFillingForm().toUrlQueryString(prefix + "startFillingForm" + suffix));
    }

    return joiner.toString();
  }

}

