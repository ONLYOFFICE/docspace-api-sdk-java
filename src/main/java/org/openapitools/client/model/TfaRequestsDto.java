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
import java.util.UUID;
import org.openapitools.client.model.TfaRequestsDtoType;
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
 * The request parameters for configuring the Two-Factor Authentication (TFA) settings.
 */
@JsonPropertyOrder({
  TfaRequestsDto.JSON_PROPERTY_TYPE,
  TfaRequestsDto.JSON_PROPERTY_ID,
  TfaRequestsDto.JSON_PROPERTY_TRUSTED_IPS,
  TfaRequestsDto.JSON_PROPERTY_MANDATORY_USERS,
  TfaRequestsDto.JSON_PROPERTY_MANDATORY_GROUPS
})

public class TfaRequestsDto {
  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable
  private TfaRequestsDtoType type;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private UUID id;

  public static final String JSON_PROPERTY_TRUSTED_IPS = "trustedIps";
  @javax.annotation.Nullable
  private JsonNullable<List<String>> trustedIps = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_MANDATORY_USERS = "mandatoryUsers";
  @javax.annotation.Nullable
  private JsonNullable<List<UUID>> mandatoryUsers = JsonNullable.<List<UUID>>undefined();

  public static final String JSON_PROPERTY_MANDATORY_GROUPS = "mandatoryGroups";
  @javax.annotation.Nullable
  private JsonNullable<List<UUID>> mandatoryGroups = JsonNullable.<List<UUID>>undefined();

  public TfaRequestsDto() {
  }


  public TfaRequestsDto type(@javax.annotation.Nullable TfaRequestsDtoType type) {
    
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

  public TfaRequestsDtoType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@javax.annotation.Nullable TfaRequestsDtoType type) {
    this.type = type;
  }

  public TfaRequestsDto id(@javax.annotation.Nullable UUID id) {
    
    this.id = id;
    return this;
  }

  /**
   * The ID of the user for whom the TFA settings are being configured.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable UUID id) {
    this.id = id;
  }

  public TfaRequestsDto trustedIps(@javax.annotation.Nullable List<String> trustedIps) {
    this.trustedIps = JsonNullable.<List<String>>of(trustedIps);
    
    return this;
  }

  public TfaRequestsDto addTrustedIpsItem(String trustedIpsItem) {
    if (this.trustedIps == null || !this.trustedIps.isPresent()) {
      this.trustedIps = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.trustedIps.get().add(trustedIpsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of IP addresses that bypass TFA verification.
   * @return trustedIps
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<String> getTrustedIps() {
        return trustedIps.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TRUSTED_IPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getTrustedIps_JsonNullable() {
    return trustedIps;
  }
  
  @JsonProperty(JSON_PROPERTY_TRUSTED_IPS)
  public void setTrustedIps_JsonNullable(JsonNullable<List<String>> trustedIps) {
    this.trustedIps = trustedIps;
  }

  public void setTrustedIps(@javax.annotation.Nullable List<String> trustedIps) {
    this.trustedIps = JsonNullable.<List<String>>of(trustedIps);
  }

  public TfaRequestsDto mandatoryUsers(@javax.annotation.Nullable List<UUID> mandatoryUsers) {
    this.mandatoryUsers = JsonNullable.<List<UUID>>of(mandatoryUsers);
    
    return this;
  }

  public TfaRequestsDto addMandatoryUsersItem(UUID mandatoryUsersItem) {
    if (this.mandatoryUsers == null || !this.mandatoryUsers.isPresent()) {
      this.mandatoryUsers = JsonNullable.<List<UUID>>of(new ArrayList<>());
    }
    try {
      this.mandatoryUsers.get().add(mandatoryUsersItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of user IDs for whom TFA is mandatory.
   * @return mandatoryUsers
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<UUID> getMandatoryUsers() {
        return mandatoryUsers.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MANDATORY_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<UUID>> getMandatoryUsers_JsonNullable() {
    return mandatoryUsers;
  }
  
  @JsonProperty(JSON_PROPERTY_MANDATORY_USERS)
  public void setMandatoryUsers_JsonNullable(JsonNullable<List<UUID>> mandatoryUsers) {
    this.mandatoryUsers = mandatoryUsers;
  }

  public void setMandatoryUsers(@javax.annotation.Nullable List<UUID> mandatoryUsers) {
    this.mandatoryUsers = JsonNullable.<List<UUID>>of(mandatoryUsers);
  }

  public TfaRequestsDto mandatoryGroups(@javax.annotation.Nullable List<UUID> mandatoryGroups) {
    this.mandatoryGroups = JsonNullable.<List<UUID>>of(mandatoryGroups);
    
    return this;
  }

  public TfaRequestsDto addMandatoryGroupsItem(UUID mandatoryGroupsItem) {
    if (this.mandatoryGroups == null || !this.mandatoryGroups.isPresent()) {
      this.mandatoryGroups = JsonNullable.<List<UUID>>of(new ArrayList<>());
    }
    try {
      this.mandatoryGroups.get().add(mandatoryGroupsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list group IDs whose members must use TFA.
   * @return mandatoryGroups
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<UUID> getMandatoryGroups() {
        return mandatoryGroups.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MANDATORY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<UUID>> getMandatoryGroups_JsonNullable() {
    return mandatoryGroups;
  }
  
  @JsonProperty(JSON_PROPERTY_MANDATORY_GROUPS)
  public void setMandatoryGroups_JsonNullable(JsonNullable<List<UUID>> mandatoryGroups) {
    this.mandatoryGroups = mandatoryGroups;
  }

  public void setMandatoryGroups(@javax.annotation.Nullable List<UUID> mandatoryGroups) {
    this.mandatoryGroups = JsonNullable.<List<UUID>>of(mandatoryGroups);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TfaRequestsDto tfaRequestsDto = (TfaRequestsDto) o;
    return Objects.equals(this.type, tfaRequestsDto.type) &&
        Objects.equals(this.id, tfaRequestsDto.id) &&
        equalsNullable(this.trustedIps, tfaRequestsDto.trustedIps) &&
        equalsNullable(this.mandatoryUsers, tfaRequestsDto.mandatoryUsers) &&
        equalsNullable(this.mandatoryGroups, tfaRequestsDto.mandatoryGroups);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, hashCodeNullable(trustedIps), hashCodeNullable(mandatoryUsers), hashCodeNullable(mandatoryGroups));
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
    sb.append("class TfaRequestsDto {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    trustedIps: ").append(toIndentedString(trustedIps)).append("\n");
    sb.append("    mandatoryUsers: ").append(toIndentedString(mandatoryUsers)).append("\n");
    sb.append("    mandatoryGroups: ").append(toIndentedString(mandatoryGroups)).append("\n");
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

    // add `type` to the URL query string
    if (getType() != null) {
      try {
        joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `trustedIps` to the URL query string
    if (getTrustedIps() != null) {
      for (int i = 0; i < getTrustedIps().size(); i++) {
        try {
          joiner.add(String.format("%strustedIps%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getTrustedIps().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `mandatoryUsers` to the URL query string
    if (getMandatoryUsers() != null) {
      for (int i = 0; i < getMandatoryUsers().size(); i++) {
        if (getMandatoryUsers().get(i) != null) {
          try {
            joiner.add(String.format("%smandatoryUsers%s%s=%s", prefix, suffix,
                "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
                URLEncoder.encode(String.valueOf(getMandatoryUsers().get(i)), "UTF-8").replaceAll("\\+", "%20")));
          } catch (UnsupportedEncodingException e) {
            // Should never happen, UTF-8 is always supported
            throw new RuntimeException(e);
          }
        }
      }
    }

    // add `mandatoryGroups` to the URL query string
    if (getMandatoryGroups() != null) {
      for (int i = 0; i < getMandatoryGroups().size(); i++) {
        if (getMandatoryGroups().get(i) != null) {
          try {
            joiner.add(String.format("%smandatoryGroups%s%s=%s", prefix, suffix,
                "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
                URLEncoder.encode(String.valueOf(getMandatoryGroups().get(i)), "UTF-8").replaceAll("\\+", "%20")));
          } catch (UnsupportedEncodingException e) {
            // Should never happen, UTF-8 is always supported
            throw new RuntimeException(e);
          }
        }
      }
    }

    return joiner.toString();
  }

}

