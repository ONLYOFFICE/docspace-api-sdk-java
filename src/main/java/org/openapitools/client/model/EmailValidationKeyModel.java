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
import org.openapitools.client.model.ConfirmType;
import org.openapitools.client.model.EmployeeType;
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
 * The confirmation email parameters.
 */
@JsonPropertyOrder({
  EmailValidationKeyModel.JSON_PROPERTY_KEY,
  EmailValidationKeyModel.JSON_PROPERTY_EMPL_TYPE,
  EmailValidationKeyModel.JSON_PROPERTY_EMAIL,
  EmailValidationKeyModel.JSON_PROPERTY_ENC_EMAIL,
  EmailValidationKeyModel.JSON_PROPERTY_UI_D,
  EmailValidationKeyModel.JSON_PROPERTY_TYPE,
  EmailValidationKeyModel.JSON_PROPERTY_FIRST,
  EmailValidationKeyModel.JSON_PROPERTY_ROOM_ID
})

public class EmailValidationKeyModel {
  public static final String JSON_PROPERTY_KEY = "key";
  @javax.annotation.Nullable
  private JsonNullable<String> key = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EMPL_TYPE = "emplType";
  @javax.annotation.Nullable
  private EmployeeType emplType;

  public static final String JSON_PROPERTY_EMAIL = "email";
  @javax.annotation.Nullable
  private JsonNullable<String> email = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ENC_EMAIL = "encEmail";
  @javax.annotation.Nullable
  private JsonNullable<String> encEmail = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_UI_D = "uiD";
  @javax.annotation.Nullable
  private JsonNullable<UUID> uiD = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable
  private ConfirmType type;

  public static final String JSON_PROPERTY_FIRST = "first";
  @javax.annotation.Nullable
  private JsonNullable<String> first = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ROOM_ID = "roomId";
  @javax.annotation.Nullable
  private JsonNullable<String> roomId = JsonNullable.<String>undefined();

  public EmailValidationKeyModel() {
  }


  public EmailValidationKeyModel key(@javax.annotation.Nullable String key) {
    this.key = JsonNullable.<String>of(key);
    
    return this;
  }

  /**
   * The email validation key.
   * @return key
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getKey() {
        return key.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getKey_JsonNullable() {
    return key;
  }
  
  @JsonProperty(JSON_PROPERTY_KEY)
  public void setKey_JsonNullable(JsonNullable<String> key) {
    this.key = key;
  }

  public void setKey(@javax.annotation.Nullable String key) {
    this.key = JsonNullable.<String>of(key);
  }

  public EmailValidationKeyModel emplType(@javax.annotation.Nullable EmployeeType emplType) {
    
    this.emplType = emplType;
    return this;
  }

  /**
   * Get emplType
   * @return emplType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMPL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EmployeeType getEmplType() {
    return emplType;
  }


  @JsonProperty(JSON_PROPERTY_EMPL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmplType(@javax.annotation.Nullable EmployeeType emplType) {
    this.emplType = emplType;
  }

  public EmailValidationKeyModel email(@javax.annotation.Nullable String email) {
    this.email = JsonNullable.<String>of(email);
    
    return this;
  }

  /**
   * The email address.
   * @return email
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getEmail() {
        return email.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EMAIL)
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

  public EmailValidationKeyModel encEmail(@javax.annotation.Nullable String encEmail) {
    this.encEmail = JsonNullable.<String>of(encEmail);
    
    return this;
  }

  /**
   * The encrypted email address.
   * @return encEmail
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getEncEmail() {
        return encEmail.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENC_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getEncEmail_JsonNullable() {
    return encEmail;
  }
  
  @JsonProperty(JSON_PROPERTY_ENC_EMAIL)
  public void setEncEmail_JsonNullable(JsonNullable<String> encEmail) {
    this.encEmail = encEmail;
  }

  public void setEncEmail(@javax.annotation.Nullable String encEmail) {
    this.encEmail = JsonNullable.<String>of(encEmail);
  }

  public EmailValidationKeyModel uiD(@javax.annotation.Nullable UUID uiD) {
    this.uiD = JsonNullable.<UUID>of(uiD);
    
    return this;
  }

  /**
   * The user ID.
   * @return uiD
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public UUID getUiD() {
        return uiD.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UI_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UUID> getUiD_JsonNullable() {
    return uiD;
  }
  
  @JsonProperty(JSON_PROPERTY_UI_D)
  public void setUiD_JsonNullable(JsonNullable<UUID> uiD) {
    this.uiD = uiD;
  }

  public void setUiD(@javax.annotation.Nullable UUID uiD) {
    this.uiD = JsonNullable.<UUID>of(uiD);
  }

  public EmailValidationKeyModel type(@javax.annotation.Nullable ConfirmType type) {
    
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConfirmType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@javax.annotation.Nullable ConfirmType type) {
    this.type = type;
  }

  public EmailValidationKeyModel first(@javax.annotation.Nullable String first) {
    this.first = JsonNullable.<String>of(first);
    
    return this;
  }

  /**
   * Specifies whether it is the first time account access or not.
   * @return first
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getFirst() {
        return first.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FIRST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFirst_JsonNullable() {
    return first;
  }
  
  @JsonProperty(JSON_PROPERTY_FIRST)
  public void setFirst_JsonNullable(JsonNullable<String> first) {
    this.first = first;
  }

  public void setFirst(@javax.annotation.Nullable String first) {
    this.first = JsonNullable.<String>of(first);
  }

  public EmailValidationKeyModel roomId(@javax.annotation.Nullable String roomId) {
    this.roomId = JsonNullable.<String>of(roomId);
    
    return this;
  }

  /**
   * The room ID.
   * @return roomId
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getRoomId() {
        return roomId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ROOM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getRoomId_JsonNullable() {
    return roomId;
  }
  
  @JsonProperty(JSON_PROPERTY_ROOM_ID)
  public void setRoomId_JsonNullable(JsonNullable<String> roomId) {
    this.roomId = roomId;
  }

  public void setRoomId(@javax.annotation.Nullable String roomId) {
    this.roomId = JsonNullable.<String>of(roomId);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailValidationKeyModel emailValidationKeyModel = (EmailValidationKeyModel) o;
    return equalsNullable(this.key, emailValidationKeyModel.key) &&
        Objects.equals(this.emplType, emailValidationKeyModel.emplType) &&
        equalsNullable(this.email, emailValidationKeyModel.email) &&
        equalsNullable(this.encEmail, emailValidationKeyModel.encEmail) &&
        equalsNullable(this.uiD, emailValidationKeyModel.uiD) &&
        Objects.equals(this.type, emailValidationKeyModel.type) &&
        equalsNullable(this.first, emailValidationKeyModel.first) &&
        equalsNullable(this.roomId, emailValidationKeyModel.roomId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(key), emplType, hashCodeNullable(email), hashCodeNullable(encEmail), hashCodeNullable(uiD), type, hashCodeNullable(first), hashCodeNullable(roomId));
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
    sb.append("class EmailValidationKeyModel {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    emplType: ").append(toIndentedString(emplType)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    encEmail: ").append(toIndentedString(encEmail)).append("\n");
    sb.append("    uiD: ").append(toIndentedString(uiD)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
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

    // add `key` to the URL query string
    if (getKey() != null) {
      try {
        joiner.add(String.format("%skey%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getKey()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `emplType` to the URL query string
    if (getEmplType() != null) {
      try {
        joiner.add(String.format("%semplType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmplType()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `encEmail` to the URL query string
    if (getEncEmail() != null) {
      try {
        joiner.add(String.format("%sencEmail%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEncEmail()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `uiD` to the URL query string
    if (getUiD() != null) {
      try {
        joiner.add(String.format("%suiD%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUiD()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `type` to the URL query string
    if (getType() != null) {
      try {
        joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `first` to the URL query string
    if (getFirst() != null) {
      try {
        joiner.add(String.format("%sfirst%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFirst()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `roomId` to the URL query string
    if (getRoomId() != null) {
      try {
        joiner.add(String.format("%sroomId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRoomId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

