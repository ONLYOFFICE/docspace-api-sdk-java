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
import java.util.UUID;
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
 * One mobile device of the calling user registered for push notifications.
 */
@JsonPropertyOrder({
  FirebaseDeviceDto.JSON_PROPERTY_ID,
  FirebaseDeviceDto.JSON_PROPERTY_USER_ID,
  FirebaseDeviceDto.JSON_PROPERTY_TENANT_ID,
  FirebaseDeviceDto.JSON_PROPERTY_FIREBASE_DEVICE_TOKEN,
  FirebaseDeviceDto.JSON_PROPERTY_APPLICATION,
  FirebaseDeviceDto.JSON_PROPERTY_IS_SUBSCRIBED
})

public class FirebaseDeviceDto {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable  private Integer id;

  public static final String JSON_PROPERTY_USER_ID = "userId";
  @javax.annotation.Nullable  private UUID userId;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @javax.annotation.Nullable  private Integer tenantId;

  public static final String JSON_PROPERTY_FIREBASE_DEVICE_TOKEN = "firebaseDeviceToken";
  @javax.annotation.Nullable  private JsonNullable<String> firebaseDeviceToken = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_APPLICATION = "application";
  @javax.annotation.Nullable  private JsonNullable<String> application = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IS_SUBSCRIBED = "isSubscribed";
  @javax.annotation.Nullable  private JsonNullable<Boolean> isSubscribed = JsonNullable.<Boolean>undefined();

  public FirebaseDeviceDto() {
  }


  public FirebaseDeviceDto id(@javax.annotation.Nullable Integer id) {
    
    this.id = id;
    return this;
  }

  /**
   * The id of the registration.
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

  public FirebaseDeviceDto userId(@javax.annotation.Nullable UUID userId) {
    
    this.userId = userId;
    return this;
  }

  /**
   * The account the device belongs to; always the caller.
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

  public FirebaseDeviceDto tenantId(@javax.annotation.Nullable Integer tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

  /**
   * The portal the registration belongs to; always the current one.
   * @return tenantId
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTenantId() {
    return tenantId;
  }


  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantId(@javax.annotation.Nullable Integer tenantId) {
    this.tenantId = tenantId;
  }

  public FirebaseDeviceDto firebaseDeviceToken(@javax.annotation.Nullable String firebaseDeviceToken) {
    this.firebaseDeviceToken = JsonNullable.<String>of(firebaseDeviceToken);
    
    return this;
  }

  /**
   * The Firebase token the device was issued, as it was sent at registration.
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

  public FirebaseDeviceDto application(@javax.annotation.Nullable String application) {
    this.application = JsonNullable.<String>of(application);
    
    return this;
  }

  /**
   * The application the registration is for; `doc` for the Documents application.
   * @return application
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getApplication() {
        return application.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_APPLICATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getApplication_JsonNullable() {
    return application;
  }
  
  @JsonProperty(JSON_PROPERTY_APPLICATION)
  public void setApplication_JsonNullable(JsonNullable<String> application) {
    this.application = application;
  }

  public void setApplication(@javax.annotation.Nullable String application) {
    this.application = JsonNullable.<String>of(application);
  }

  public FirebaseDeviceDto isSubscribed(@javax.annotation.Nullable Boolean isSubscribed) {
    this.isSubscribed = JsonNullable.<Boolean>of(isSubscribed);
    
    return this;
  }

  /**
   * Whether the device is currently sent push notifications.
   * @return isSubscribed
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Boolean getIsSubscribed() {
        return isSubscribed.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_IS_SUBSCRIBED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getIsSubscribed_JsonNullable() {
    return isSubscribed;
  }
  
  @JsonProperty(JSON_PROPERTY_IS_SUBSCRIBED)
  public void setIsSubscribed_JsonNullable(JsonNullable<Boolean> isSubscribed) {
    this.isSubscribed = isSubscribed;
  }

  public void setIsSubscribed(@javax.annotation.Nullable Boolean isSubscribed) {
    this.isSubscribed = JsonNullable.<Boolean>of(isSubscribed);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FirebaseDeviceDto firebaseDeviceDto = (FirebaseDeviceDto) o;
    return Objects.equals(this.id, firebaseDeviceDto.id) &&
        Objects.equals(this.userId, firebaseDeviceDto.userId) &&
        Objects.equals(this.tenantId, firebaseDeviceDto.tenantId) &&
        equalsNullable(this.firebaseDeviceToken, firebaseDeviceDto.firebaseDeviceToken) &&
        equalsNullable(this.application, firebaseDeviceDto.application) &&
        equalsNullable(this.isSubscribed, firebaseDeviceDto.isSubscribed);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, tenantId, hashCodeNullable(firebaseDeviceToken), hashCodeNullable(application), hashCodeNullable(isSubscribed));
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
    sb.append("class FirebaseDeviceDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    firebaseDeviceToken: ").append(toIndentedString(firebaseDeviceToken)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `tenantId` to the URL query string
    if (getTenantId() != null) {
      try {
        joiner.add(String.format("%stenantId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTenantId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `firebaseDeviceToken` to the URL query string
    if (getFirebaseDeviceToken() != null) {
      try {
        joiner.add(String.format("%sfirebaseDeviceToken%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFirebaseDeviceToken()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `application` to the URL query string
    if (getApplication() != null) {
      try {
        joiner.add(String.format("%sapplication%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getApplication()), "UTF-8").replaceAll("\\+", "%20")));
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

