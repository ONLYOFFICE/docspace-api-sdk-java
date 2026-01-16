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
import org.openapitools.client.model.DbTenant;
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
 * The Firebase user parameters.
 */
@JsonPropertyOrder({
  FireBaseUser.JSON_PROPERTY_ID,
  FireBaseUser.JSON_PROPERTY_USER_ID,
  FireBaseUser.JSON_PROPERTY_TENANT_ID,
  FireBaseUser.JSON_PROPERTY_FIREBASE_DEVICE_TOKEN,
  FireBaseUser.JSON_PROPERTY_APPLICATION,
  FireBaseUser.JSON_PROPERTY_IS_SUBSCRIBED,
  FireBaseUser.JSON_PROPERTY_TENANT
})

public class FireBaseUser {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Integer id;

  public static final String JSON_PROPERTY_USER_ID = "userId";
  @javax.annotation.Nullable
  private UUID userId;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @javax.annotation.Nullable
  private Integer tenantId;

  public static final String JSON_PROPERTY_FIREBASE_DEVICE_TOKEN = "firebaseDeviceToken";
  @javax.annotation.Nullable
  private JsonNullable<String> firebaseDeviceToken = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_APPLICATION = "application";
  @javax.annotation.Nullable
  private JsonNullable<String> application = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IS_SUBSCRIBED = "isSubscribed";
  @javax.annotation.Nullable
  private JsonNullable<Boolean> isSubscribed = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_TENANT = "tenant";
  @javax.annotation.Nullable
  private DbTenant tenant;

  public FireBaseUser() {
  }


  public FireBaseUser id(@javax.annotation.Nullable Integer id) {
    
    this.id = id;
    return this;
  }

  /**
   * The Firebase user ID.
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

  public FireBaseUser userId(@javax.annotation.Nullable UUID userId) {
    
    this.userId = userId;
    return this;
  }

  /**
   * The user ID.
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

  public FireBaseUser tenantId(@javax.annotation.Nullable Integer tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

  /**
   * The tenant ID.
   * @return tenantId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTenantId() {
    return tenantId;
  }


  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantId(@javax.annotation.Nullable Integer tenantId) {
    this.tenantId = tenantId;
  }

  public FireBaseUser firebaseDeviceToken(@javax.annotation.Nullable String firebaseDeviceToken) {
    this.firebaseDeviceToken = JsonNullable.<String>of(firebaseDeviceToken);
    
    return this;
  }

  /**
   * The Firebase device token.
   * @return firebaseDeviceToken
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getFirebaseDeviceToken() {
        return firebaseDeviceToken.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FIREBASE_DEVICE_TOKEN)
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

  public FireBaseUser application(@javax.annotation.Nullable String application) {
    this.application = JsonNullable.<String>of(application);
    
    return this;
  }

  /**
   * The Firebase application.
   * @return application
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getApplication() {
        return application.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_APPLICATION)
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

  public FireBaseUser isSubscribed(@javax.annotation.Nullable Boolean isSubscribed) {
    this.isSubscribed = JsonNullable.<Boolean>of(isSubscribed);
    
    return this;
  }

  /**
   * Specifies if the user is subscribed to the push notifications or not.
   * @return isSubscribed
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getIsSubscribed() {
        return isSubscribed.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IS_SUBSCRIBED)
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

  public FireBaseUser tenant(@javax.annotation.Nullable DbTenant tenant) {
    
    this.tenant = tenant;
    return this;
  }

  /**
   * Get tenant
   * @return tenant
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TENANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DbTenant getTenant() {
    return tenant;
  }


  @JsonProperty(JSON_PROPERTY_TENANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenant(@javax.annotation.Nullable DbTenant tenant) {
    this.tenant = tenant;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FireBaseUser fireBaseUser = (FireBaseUser) o;
    return Objects.equals(this.id, fireBaseUser.id) &&
        Objects.equals(this.userId, fireBaseUser.userId) &&
        Objects.equals(this.tenantId, fireBaseUser.tenantId) &&
        equalsNullable(this.firebaseDeviceToken, fireBaseUser.firebaseDeviceToken) &&
        equalsNullable(this.application, fireBaseUser.application) &&
        equalsNullable(this.isSubscribed, fireBaseUser.isSubscribed) &&
        Objects.equals(this.tenant, fireBaseUser.tenant);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, tenantId, hashCodeNullable(firebaseDeviceToken), hashCodeNullable(application), hashCodeNullable(isSubscribed), tenant);
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
    sb.append("class FireBaseUser {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    firebaseDeviceToken: ").append(toIndentedString(firebaseDeviceToken)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    isSubscribed: ").append(toIndentedString(isSubscribed)).append("\n");
    sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
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

    // add `tenant` to the URL query string
    if (getTenant() != null) {
      joiner.add(getTenant().toUrlQueryString(prefix + "tenant" + suffix));
    }

    return joiner.toString();
  }

}

