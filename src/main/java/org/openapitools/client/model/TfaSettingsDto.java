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
 * The parameters representing the Two-Factor Authentication (TFA) configuration settings.
 */
@JsonPropertyOrder({
  TfaSettingsDto.JSON_PROPERTY_ID,
  TfaSettingsDto.JSON_PROPERTY_TITLE,
  TfaSettingsDto.JSON_PROPERTY_ENABLED,
  TfaSettingsDto.JSON_PROPERTY_AVALIABLE,
  TfaSettingsDto.JSON_PROPERTY_TRUSTED_IPS,
  TfaSettingsDto.JSON_PROPERTY_MANDATORY_USERS,
  TfaSettingsDto.JSON_PROPERTY_MANDATORY_GROUPS
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class TfaSettingsDto {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private String id;

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable
  private String title;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  @javax.annotation.Nonnull
  private Boolean enabled;

  public static final String JSON_PROPERTY_AVALIABLE = "avaliable";
  @javax.annotation.Nonnull
  private Boolean avaliable;

  public static final String JSON_PROPERTY_TRUSTED_IPS = "trustedIps";
  @javax.annotation.Nullable
  private JsonNullable<List<String>> trustedIps = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_MANDATORY_USERS = "mandatoryUsers";
  @javax.annotation.Nullable
  private JsonNullable<List<UUID>> mandatoryUsers = JsonNullable.<List<UUID>>undefined();

  public static final String JSON_PROPERTY_MANDATORY_GROUPS = "mandatoryGroups";
  @javax.annotation.Nullable
  private JsonNullable<List<UUID>> mandatoryGroups = JsonNullable.<List<UUID>>undefined();

  public TfaSettingsDto() {
  }

  public TfaSettingsDto id(@javax.annotation.Nullable String id) {
    
    this.id = id;
    return this;
  }

  /**
   * The ID of the TFA configuration.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }

  public TfaSettingsDto title(@javax.annotation.Nullable String title) {
    
    this.title = title;
    return this;
  }

  /**
   * The display name or description of the TFA configuration.
   * @return title
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTitle(@javax.annotation.Nullable String title) {
    this.title = title;
  }

  public TfaSettingsDto enabled(@javax.annotation.Nonnull Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

  /**
   * Indicates whether the TFA configuration is currently active.
   * @return enabled
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnabled(@javax.annotation.Nonnull Boolean enabled) {
    this.enabled = enabled;
  }

  public TfaSettingsDto avaliable(@javax.annotation.Nonnull Boolean avaliable) {
    
    this.avaliable = avaliable;
    return this;
  }

  /**
   * Indicates whether the TFA configuration can be used.
   * @return avaliable
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AVALIABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getAvaliable() {
    return avaliable;
  }


  @JsonProperty(JSON_PROPERTY_AVALIABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAvaliable(@javax.annotation.Nonnull Boolean avaliable) {
    this.avaliable = avaliable;
  }

  public TfaSettingsDto trustedIps(@javax.annotation.Nullable List<String> trustedIps) {
    this.trustedIps = JsonNullable.<List<String>>of(trustedIps);
    
    return this;
  }

  public TfaSettingsDto addTrustedIpsItem(String trustedIpsItem) {
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
   * The list of IP addresses that are exempt from TFA requirements.
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

  public TfaSettingsDto mandatoryUsers(@javax.annotation.Nullable List<UUID> mandatoryUsers) {
    this.mandatoryUsers = JsonNullable.<List<UUID>>of(mandatoryUsers);
    
    return this;
  }

  public TfaSettingsDto addMandatoryUsersItem(UUID mandatoryUsersItem) {
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
   * The list of user IDs that are required to use TFA.
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

  public TfaSettingsDto mandatoryGroups(@javax.annotation.Nullable List<UUID> mandatoryGroups) {
    this.mandatoryGroups = JsonNullable.<List<UUID>>of(mandatoryGroups);
    
    return this;
  }

  public TfaSettingsDto addMandatoryGroupsItem(UUID mandatoryGroupsItem) {
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
   * The list of group IDs whose members are required to use TFA.
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
    TfaSettingsDto tfaSettingsDto = (TfaSettingsDto) o;
    return Objects.equals(this.id, tfaSettingsDto.id) &&
        Objects.equals(this.title, tfaSettingsDto.title) &&
        Objects.equals(this.enabled, tfaSettingsDto.enabled) &&
        Objects.equals(this.avaliable, tfaSettingsDto.avaliable) &&
        equalsNullable(this.trustedIps, tfaSettingsDto.trustedIps) &&
        equalsNullable(this.mandatoryUsers, tfaSettingsDto.mandatoryUsers) &&
        equalsNullable(this.mandatoryGroups, tfaSettingsDto.mandatoryGroups);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, enabled, avaliable, hashCodeNullable(trustedIps), hashCodeNullable(mandatoryUsers), hashCodeNullable(mandatoryGroups));
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
    sb.append("class TfaSettingsDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    avaliable: ").append(toIndentedString(avaliable)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `title` to the URL query string
    if (getTitle() != null) {
      try {
        joiner.add(String.format("%stitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTitle()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `enabled` to the URL query string
    if (getEnabled() != null) {
      try {
        joiner.add(String.format("%senabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnabled()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `avaliable` to the URL query string
    if (getAvaliable() != null) {
      try {
        joiner.add(String.format("%savaliable%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAvaliable()), "UTF-8").replaceAll("\\+", "%20")));
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

