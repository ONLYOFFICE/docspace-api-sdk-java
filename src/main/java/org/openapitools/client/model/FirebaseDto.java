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
 * The Firebase parameters.
 */
@JsonPropertyOrder({
  FirebaseDto.JSON_PROPERTY_API_KEY,
  FirebaseDto.JSON_PROPERTY_AUTH_DOMAIN,
  FirebaseDto.JSON_PROPERTY_PROJECT_ID,
  FirebaseDto.JSON_PROPERTY_STORAGE_BUCKET,
  FirebaseDto.JSON_PROPERTY_MESSAGING_SENDER_ID,
  FirebaseDto.JSON_PROPERTY_APP_ID,
  FirebaseDto.JSON_PROPERTY_MEASUREMENT_ID,
  FirebaseDto.JSON_PROPERTY_DATABASE_U_R_L
})

public class FirebaseDto {
  public static final String JSON_PROPERTY_API_KEY = "apiKey";
  @javax.annotation.Nullable
  private String apiKey;

  public static final String JSON_PROPERTY_AUTH_DOMAIN = "authDomain";
  @javax.annotation.Nullable
  private String authDomain;

  public static final String JSON_PROPERTY_PROJECT_ID = "projectId";
  @javax.annotation.Nullable
  private String projectId;

  public static final String JSON_PROPERTY_STORAGE_BUCKET = "storageBucket";
  @javax.annotation.Nullable
  private String storageBucket;

  public static final String JSON_PROPERTY_MESSAGING_SENDER_ID = "messagingSenderId";
  @javax.annotation.Nullable
  private String messagingSenderId;

  public static final String JSON_PROPERTY_APP_ID = "appId";
  @javax.annotation.Nullable
  private String appId;

  public static final String JSON_PROPERTY_MEASUREMENT_ID = "measurementId";
  @javax.annotation.Nullable
  private String measurementId;

  public static final String JSON_PROPERTY_DATABASE_U_R_L = "databaseURL";
  @javax.annotation.Nullable
  private String databaseURL;

  public FirebaseDto() {
  }

  public FirebaseDto apiKey(@javax.annotation.Nullable String apiKey) {
    
    this.apiKey = apiKey;
    return this;
  }

  /**
   * The Firebase API key.
   * @return apiKey
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_API_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getApiKey() {
    return apiKey;
  }


  @JsonProperty(JSON_PROPERTY_API_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setApiKey(@javax.annotation.Nullable String apiKey) {
    this.apiKey = apiKey;
  }

  public FirebaseDto authDomain(@javax.annotation.Nullable String authDomain) {
    
    this.authDomain = authDomain;
    return this;
  }

  /**
   * The Firebase authentication domain.
   * @return authDomain
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTH_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAuthDomain() {
    return authDomain;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAuthDomain(@javax.annotation.Nullable String authDomain) {
    this.authDomain = authDomain;
  }

  public FirebaseDto projectId(@javax.annotation.Nullable String projectId) {
    
    this.projectId = projectId;
    return this;
  }

  /**
   * The Firebase project ID.
   * @return projectId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProjectId() {
    return projectId;
  }


  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProjectId(@javax.annotation.Nullable String projectId) {
    this.projectId = projectId;
  }

  public FirebaseDto storageBucket(@javax.annotation.Nullable String storageBucket) {
    
    this.storageBucket = storageBucket;
    return this;
  }

  /**
   * The Firebase storage bucket.
   * @return storageBucket
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STORAGE_BUCKET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStorageBucket() {
    return storageBucket;
  }


  @JsonProperty(JSON_PROPERTY_STORAGE_BUCKET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStorageBucket(@javax.annotation.Nullable String storageBucket) {
    this.storageBucket = storageBucket;
  }

  public FirebaseDto messagingSenderId(@javax.annotation.Nullable String messagingSenderId) {
    
    this.messagingSenderId = messagingSenderId;
    return this;
  }

  /**
   * The Firebase messaging sender ID.
   * @return messagingSenderId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGING_SENDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMessagingSenderId() {
    return messagingSenderId;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGING_SENDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMessagingSenderId(@javax.annotation.Nullable String messagingSenderId) {
    this.messagingSenderId = messagingSenderId;
  }

  public FirebaseDto appId(@javax.annotation.Nullable String appId) {
    
    this.appId = appId;
    return this;
  }

  /**
   * The Firebase application ID.
   * @return appId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAppId() {
    return appId;
  }


  @JsonProperty(JSON_PROPERTY_APP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAppId(@javax.annotation.Nullable String appId) {
    this.appId = appId;
  }

  public FirebaseDto measurementId(@javax.annotation.Nullable String measurementId) {
    
    this.measurementId = measurementId;
    return this;
  }

  /**
   * The Firebase measurement ID.
   * @return measurementId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEASUREMENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMeasurementId() {
    return measurementId;
  }


  @JsonProperty(JSON_PROPERTY_MEASUREMENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMeasurementId(@javax.annotation.Nullable String measurementId) {
    this.measurementId = measurementId;
  }

  public FirebaseDto databaseURL(@javax.annotation.Nullable String databaseURL) {
    
    this.databaseURL = databaseURL;
    return this;
  }

  /**
   * The Firebase database URL.
   * @return databaseURL
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATABASE_U_R_L)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDatabaseURL() {
    return databaseURL;
  }


  @JsonProperty(JSON_PROPERTY_DATABASE_U_R_L)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDatabaseURL(@javax.annotation.Nullable String databaseURL) {
    this.databaseURL = databaseURL;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FirebaseDto firebaseDto = (FirebaseDto) o;
    return Objects.equals(this.apiKey, firebaseDto.apiKey) &&
        Objects.equals(this.authDomain, firebaseDto.authDomain) &&
        Objects.equals(this.projectId, firebaseDto.projectId) &&
        Objects.equals(this.storageBucket, firebaseDto.storageBucket) &&
        Objects.equals(this.messagingSenderId, firebaseDto.messagingSenderId) &&
        Objects.equals(this.appId, firebaseDto.appId) &&
        Objects.equals(this.measurementId, firebaseDto.measurementId) &&
        Objects.equals(this.databaseURL, firebaseDto.databaseURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, authDomain, projectId, storageBucket, messagingSenderId, appId, measurementId, databaseURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FirebaseDto {\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    authDomain: ").append(toIndentedString(authDomain)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    storageBucket: ").append(toIndentedString(storageBucket)).append("\n");
    sb.append("    messagingSenderId: ").append(toIndentedString(messagingSenderId)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    measurementId: ").append(toIndentedString(measurementId)).append("\n");
    sb.append("    databaseURL: ").append(toIndentedString(databaseURL)).append("\n");
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

    // add `apiKey` to the URL query string
    if (getApiKey() != null) {
      try {
        joiner.add(String.format("%sapiKey%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getApiKey()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `authDomain` to the URL query string
    if (getAuthDomain() != null) {
      try {
        joiner.add(String.format("%sauthDomain%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAuthDomain()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `projectId` to the URL query string
    if (getProjectId() != null) {
      try {
        joiner.add(String.format("%sprojectId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProjectId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `storageBucket` to the URL query string
    if (getStorageBucket() != null) {
      try {
        joiner.add(String.format("%sstorageBucket%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStorageBucket()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `messagingSenderId` to the URL query string
    if (getMessagingSenderId() != null) {
      try {
        joiner.add(String.format("%smessagingSenderId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMessagingSenderId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `appId` to the URL query string
    if (getAppId() != null) {
      try {
        joiner.add(String.format("%sappId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAppId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `measurementId` to the URL query string
    if (getMeasurementId() != null) {
      try {
        joiner.add(String.format("%smeasurementId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMeasurementId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `databaseURL` to the URL query string
    if (getDatabaseURL() != null) {
      try {
        joiner.add(String.format("%sdatabaseURL%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDatabaseURL()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

