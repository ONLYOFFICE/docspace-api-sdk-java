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
 * The Firebase-related request parameters.
 */
@JsonPropertyOrder({
  FirebaseRequestsDto.JSON_PROPERTY_FIREBASE_DEVICE_TOKEN,
  FirebaseRequestsDto.JSON_PROPERTY_IS_SUBSCRIBED
})

public class FirebaseRequestsDto {
  public static final String JSON_PROPERTY_FIREBASE_DEVICE_TOKEN = "firebaseDeviceToken";
  @javax.annotation.Nullable  private JsonNullable<String> firebaseDeviceToken = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IS_SUBSCRIBED = "isSubscribed";
  @javax.annotation.Nullable  private Boolean isSubscribed;

  public FirebaseRequestsDto() {
  }


  public FirebaseRequestsDto firebaseDeviceToken(@javax.annotation.Nullable String firebaseDeviceToken) {
    this.firebaseDeviceToken = JsonNullable.<String>of(firebaseDeviceToken);
    
    return this;
  }

  /**
   * The Firebase device token.
   * @return firebaseDeviceToken
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getFirebaseDeviceToken() {
        return firebaseDeviceToken.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_FIREBASE_DEVICE_TOKEN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getFirebaseDeviceToken_JsonNullable() {
    return firebaseDeviceToken;
  }
  
  @JsonProperty(JSON_PROPERTY_FIREBASE_DEVICE_TOKEN)
  public void setFirebaseDeviceToken_JsonNullable(JsonNullable<String> firebaseDeviceToken) {
    this.firebaseDeviceToken = firebaseDeviceToken;
  }

  public void setFirebaseDeviceToken(@javax.annotation.Nullable String firebaseDeviceToken) {
    this.firebaseDeviceToken = JsonNullable.<String>of(firebaseDeviceToken);
  }

  public FirebaseRequestsDto isSubscribed(@javax.annotation.Nullable Boolean isSubscribed) {
    
    this.isSubscribed = isSubscribed;
    return this;
  }

  /**
   * Specifies whether the user is subscribed to the push notifications or not.
   * @return isSubscribed
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_IS_SUBSCRIBED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsSubscribed() {
    return isSubscribed;
  }


  @JsonProperty(value = JSON_PROPERTY_IS_SUBSCRIBED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsSubscribed(@javax.annotation.Nullable Boolean isSubscribed) {
    this.isSubscribed = isSubscribed;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FirebaseRequestsDto firebaseRequestsDto = (FirebaseRequestsDto) o;
    return equalsNullable(this.firebaseDeviceToken, firebaseRequestsDto.firebaseDeviceToken) &&
        Objects.equals(this.isSubscribed, firebaseRequestsDto.isSubscribed);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(firebaseDeviceToken), isSubscribed);
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
    sb.append("class FirebaseRequestsDto {\n");
    sb.append("    firebaseDeviceToken: ").append(toIndentedString(firebaseDeviceToken)).append("\n");
    sb.append("    isSubscribed: ").append(toIndentedString(isSubscribed)).append("\n");
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

    // add `firebaseDeviceToken` to the URL query string
    if (getFirebaseDeviceToken() != null) {
      try {
        joiner.add(String.format("%sfirebaseDeviceToken%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFirebaseDeviceToken()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isSubscribed` to the URL query string
    if (getIsSubscribed() != null) {
      try {
        joiner.add(String.format("%sisSubscribed%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsSubscribed()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

