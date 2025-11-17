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
 * The request parameters for updating a user quota.
 */
@JsonPropertyOrder({
  UpdateMembersQuotaRequestDto.JSON_PROPERTY_USER_IDS,
  UpdateMembersQuotaRequestDto.JSON_PROPERTY_QUOTA
})

public class UpdateMembersQuotaRequestDto {
  public static final String JSON_PROPERTY_USER_IDS = "userIds";
  @javax.annotation.Nullable
  private JsonNullable<List<UUID>> userIds = JsonNullable.<List<UUID>>undefined();

  public static final String JSON_PROPERTY_QUOTA = "quota";
  @javax.annotation.Nullable
  private Integer quota;

  public UpdateMembersQuotaRequestDto() {
  }

  public UpdateMembersQuotaRequestDto userIds(@javax.annotation.Nullable List<UUID> userIds) {
    this.userIds = JsonNullable.<List<UUID>>of(userIds);
    
    return this;
  }

  public UpdateMembersQuotaRequestDto addUserIdsItem(UUID userIdsItem) {
    if (this.userIds == null || !this.userIds.isPresent()) {
      this.userIds = JsonNullable.<List<UUID>>of(new ArrayList<>());
    }
    try {
      this.userIds.get().add(userIdsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of user IDs.
   * @return userIds
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<UUID> getUserIds() {
        return userIds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<UUID>> getUserIds_JsonNullable() {
    return userIds;
  }
  
  @JsonProperty(JSON_PROPERTY_USER_IDS)
  public void setUserIds_JsonNullable(JsonNullable<List<UUID>> userIds) {
    this.userIds = userIds;
  }

  public void setUserIds(@javax.annotation.Nullable List<UUID> userIds) {
    this.userIds = JsonNullable.<List<UUID>>of(userIds);
  }

  public UpdateMembersQuotaRequestDto quota(@javax.annotation.Nullable Integer quota) {
    
    this.quota = quota;
    return this;
  }

  /**
   * Get quota
   * @return quota
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUOTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getQuota() {
    return quota;
  }


  @JsonProperty(JSON_PROPERTY_QUOTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuota(@javax.annotation.Nullable Integer quota) {
    this.quota = quota;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateMembersQuotaRequestDto updateMembersQuotaRequestDto = (UpdateMembersQuotaRequestDto) o;
    return equalsNullable(this.userIds, updateMembersQuotaRequestDto.userIds) &&
        Objects.equals(this.quota, updateMembersQuotaRequestDto.quota);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(userIds), quota);
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
    sb.append("class UpdateMembersQuotaRequestDto {\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
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

    // add `userIds` to the URL query string
    if (getUserIds() != null) {
      for (int i = 0; i < getUserIds().size(); i++) {
        if (getUserIds().get(i) != null) {
          try {
            joiner.add(String.format("%suserIds%s%s=%s", prefix, suffix,
                "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
                URLEncoder.encode(String.valueOf(getUserIds().get(i)), "UTF-8").replaceAll("\\+", "%20")));
          } catch (UnsupportedEncodingException e) {
            // Should never happen, UTF-8 is always supported
            throw new RuntimeException(e);
          }
        }
      }
    }

    // add `quota` to the URL query string
    if (getQuota() != null) {
      try {
        joiner.add(String.format("%squota%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getQuota()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

