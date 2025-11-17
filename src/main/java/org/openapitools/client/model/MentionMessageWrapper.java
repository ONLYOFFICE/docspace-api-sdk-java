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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.ActionLinkConfig;
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
 * The mention message parameters.
 */
@JsonPropertyOrder({
  MentionMessageWrapper.JSON_PROPERTY_ACTION_LINK,
  MentionMessageWrapper.JSON_PROPERTY_EMAILS,
  MentionMessageWrapper.JSON_PROPERTY_MESSAGE
})

public class MentionMessageWrapper {
  public static final String JSON_PROPERTY_ACTION_LINK = "actionLink";
  @javax.annotation.Nullable
  private ActionLinkConfig actionLink;

  public static final String JSON_PROPERTY_EMAILS = "emails";
  @javax.annotation.Nullable
  private JsonNullable<List<String>> emails = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_MESSAGE = "message";
  @javax.annotation.Nullable
  private JsonNullable<String> message = JsonNullable.<String>undefined();

  public MentionMessageWrapper() {
  }

  public MentionMessageWrapper actionLink(@javax.annotation.Nullable ActionLinkConfig actionLink) {
    
    this.actionLink = actionLink;
    return this;
  }

  /**
   * Get actionLink
   * @return actionLink
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTION_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ActionLinkConfig getActionLink() {
    return actionLink;
  }


  @JsonProperty(JSON_PROPERTY_ACTION_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActionLink(@javax.annotation.Nullable ActionLinkConfig actionLink) {
    this.actionLink = actionLink;
  }

  public MentionMessageWrapper emails(@javax.annotation.Nullable List<String> emails) {
    this.emails = JsonNullable.<List<String>>of(emails);
    
    return this;
  }

  public MentionMessageWrapper addEmailsItem(String emailsItem) {
    if (this.emails == null || !this.emails.isPresent()) {
      this.emails = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.emails.get().add(emailsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * A list of emails that will receive the mention message.
   * @return emails
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<String> getEmails() {
        return emails.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EMAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getEmails_JsonNullable() {
    return emails;
  }
  
  @JsonProperty(JSON_PROPERTY_EMAILS)
  public void setEmails_JsonNullable(JsonNullable<List<String>> emails) {
    this.emails = emails;
  }

  public void setEmails(@javax.annotation.Nullable List<String> emails) {
    this.emails = JsonNullable.<List<String>>of(emails);
  }

  public MentionMessageWrapper message(@javax.annotation.Nullable String message) {
    this.message = JsonNullable.<String>of(message);
    
    return this;
  }

  /**
   * The mention message.
   * @return message
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getMessage() {
        return message.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMessage_JsonNullable() {
    return message;
  }
  
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  public void setMessage_JsonNullable(JsonNullable<String> message) {
    this.message = message;
  }

  public void setMessage(@javax.annotation.Nullable String message) {
    this.message = JsonNullable.<String>of(message);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MentionMessageWrapper mentionMessageWrapper = (MentionMessageWrapper) o;
    return Objects.equals(this.actionLink, mentionMessageWrapper.actionLink) &&
        equalsNullable(this.emails, mentionMessageWrapper.emails) &&
        equalsNullable(this.message, mentionMessageWrapper.message);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionLink, hashCodeNullable(emails), hashCodeNullable(message));
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
    sb.append("class MentionMessageWrapper {\n");
    sb.append("    actionLink: ").append(toIndentedString(actionLink)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

    // add `actionLink` to the URL query string
    if (getActionLink() != null) {
      joiner.add(getActionLink().toUrlQueryString(prefix + "actionLink" + suffix));
    }

    // add `emails` to the URL query string
    if (getEmails() != null) {
      for (int i = 0; i < getEmails().size(); i++) {
        try {
          joiner.add(String.format("%semails%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getEmails().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `message` to the URL query string
    if (getMessage() != null) {
      try {
        joiner.add(String.format("%smessage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMessage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

