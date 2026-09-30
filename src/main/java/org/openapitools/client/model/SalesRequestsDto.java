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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Who is writing to the ONLYOFFICE sales team, and what about.
 */
@JsonPropertyOrder({
  SalesRequestsDto.JSON_PROPERTY_USER_NAME,
  SalesRequestsDto.JSON_PROPERTY_EMAIL,
  SalesRequestsDto.JSON_PROPERTY_MESSAGE
})

public class SalesRequestsDto {
  public static final String JSON_PROPERTY_USER_NAME = "userName";
  @javax.annotation.Nonnull  private String userName;

  public static final String JSON_PROPERTY_EMAIL = "email";
  @javax.annotation.Nonnull  private String email;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  @javax.annotation.Nonnull  private String message;

  public SalesRequestsDto() {
  }


  public SalesRequestsDto userName(@javax.annotation.Nonnull String userName) {
    
    this.userName = userName;
    return this;
  }

  /**
   * The name the sales team should address the reply to. It is sent as written and is not matched against any  portal account; an empty value fails the request with 400.
   * @return userName
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_USER_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUserName() {
    return userName;
  }


  @JsonProperty(value = JSON_PROPERTY_USER_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserName(@javax.annotation.Nonnull String userName) {
    this.userName = userName;
  }

  public SalesRequestsDto email(@javax.annotation.Nonnull String email) {
    
    this.email = email;
    return this;
  }

  /**
   * The address the answer is sent to. It has to be a well-formed email address and need not be the caller portal  address; an empty or malformed value fails the request with 400.
   * @return email
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_EMAIL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(value = JSON_PROPERTY_EMAIL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmail(@javax.annotation.Nonnull String email) {
    this.email = email;
  }

  public SalesRequestsDto message(@javax.annotation.Nonnull String message) {
    
    this.message = message;
    return this;
  }

  /**
   * What is being asked of the sales team - a quote, an invoice, or a plan that cannot be bought online. An empty  value fails the request with 400.
   * @return message
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_MESSAGE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(value = JSON_PROPERTY_MESSAGE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMessage(@javax.annotation.Nonnull String message) {
    this.message = message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalesRequestsDto salesRequestsDto = (SalesRequestsDto) o;
    return Objects.equals(this.userName, salesRequestsDto.userName) &&
        Objects.equals(this.email, salesRequestsDto.email) &&
        Objects.equals(this.message, salesRequestsDto.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, email, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesRequestsDto {\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

    // add `userName` to the URL query string
    if (getUserName() != null) {
      try {
        joiner.add(String.format("%suserName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUserName()), "UTF-8").replaceAll("\\+", "%20")));
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

