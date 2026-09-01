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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.AiAgentsUpdateQuotaRequestRoomIdsInner;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * AiAgentsUpdateQuotaRequest
 */
@JsonPropertyOrder({
  AiAgentsUpdateQuotaRequest.JSON_PROPERTY_ROOM_IDS,
  AiAgentsUpdateQuotaRequest.JSON_PROPERTY_QUOTA
})
@JsonTypeName("aiAgentsUpdateQuota_request")

public class AiAgentsUpdateQuotaRequest {
  public static final String JSON_PROPERTY_ROOM_IDS = "roomIds";
  @javax.annotation.Nonnull  private List<AiAgentsUpdateQuotaRequestRoomIdsInner> roomIds = new ArrayList<>();

  public static final String JSON_PROPERTY_QUOTA = "quota";
  @javax.annotation.Nonnull  private BigDecimal quota;

  public AiAgentsUpdateQuotaRequest() {
  }


  public AiAgentsUpdateQuotaRequest roomIds(@javax.annotation.Nonnull List<AiAgentsUpdateQuotaRequestRoomIdsInner> roomIds) {
    
    this.roomIds = roomIds;
    return this;
  }

  public AiAgentsUpdateQuotaRequest addRoomIdsItem(AiAgentsUpdateQuotaRequestRoomIdsInner roomIdsItem) {
    if (this.roomIds == null) {
      this.roomIds = new ArrayList<>();
    }
    this.roomIds.add(roomIdsItem);
    return this;
  }

  /**
   * Agent (room) ids to update.
   * @return roomIds
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_ROOM_IDS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<AiAgentsUpdateQuotaRequestRoomIdsInner> getRoomIds() {
    return roomIds;
  }


  @JsonProperty(value = JSON_PROPERTY_ROOM_IDS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRoomIds(@javax.annotation.Nonnull List<AiAgentsUpdateQuotaRequestRoomIdsInner> roomIds) {
    this.roomIds = roomIds;
  }

  public AiAgentsUpdateQuotaRequest quota(@javax.annotation.Nonnull BigDecimal quota) {
    
    this.quota = quota;
    return this;
  }

  /**
   * New quota in bytes; a negative value disables the custom quota.
   * @return quota
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_QUOTA, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getQuota() {
    return quota;
  }


  @JsonProperty(value = JSON_PROPERTY_QUOTA, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQuota(@javax.annotation.Nonnull BigDecimal quota) {
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
    AiAgentsUpdateQuotaRequest aiAgentsUpdateQuotaRequest = (AiAgentsUpdateQuotaRequest) o;
    return Objects.equals(this.roomIds, aiAgentsUpdateQuotaRequest.roomIds) &&
        Objects.equals(this.quota, aiAgentsUpdateQuotaRequest.quota);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roomIds, quota);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiAgentsUpdateQuotaRequest {\n");
    sb.append("    roomIds: ").append(toIndentedString(roomIds)).append("\n");
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

    // add `roomIds` to the URL query string
    if (getRoomIds() != null) {
      for (int i = 0; i < getRoomIds().size(); i++) {
        if (getRoomIds().get(i) != null) {
          joiner.add(getRoomIds().get(i).toUrlQueryString(String.format("%sroomIds%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
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

