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
import org.openapitools.client.model.AiActionType;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * AiAssignmentsAssignRequest
 */
@JsonPropertyOrder({
  AiAssignmentsAssignRequest.JSON_PROPERTY_ACTION_TYPE,
  AiAssignmentsAssignRequest.JSON_PROPERTY_PROFILE_ID
})
@JsonTypeName("aiAssignmentsAssign_request")

public class AiAssignmentsAssignRequest {
  public static final String JSON_PROPERTY_ACTION_TYPE = "actionType";
  @javax.annotation.Nonnull  private AiActionType actionType;

  public static final String JSON_PROPERTY_PROFILE_ID = "profileId";
  @javax.annotation.Nonnull  private String profileId;

  public AiAssignmentsAssignRequest() {
  }


  public AiAssignmentsAssignRequest actionType(@javax.annotation.Nonnull AiActionType actionType) {
    
    this.actionType = actionType;
    return this;
  }

  /**
   * Action the assignment applies to.
   * @return actionType
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_ACTION_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AiActionType getActionType() {
    return actionType;
  }


  @JsonProperty(value = JSON_PROPERTY_ACTION_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setActionType(@javax.annotation.Nonnull AiActionType actionType) {
    this.actionType = actionType;
  }

  public AiAssignmentsAssignRequest profileId(@javax.annotation.Nonnull String profileId) {
    
    this.profileId = profileId;
    return this;
  }

  /**
   * Profile id to bind.
   * @return profileId
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_PROFILE_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProfileId() {
    return profileId;
  }


  @JsonProperty(value = JSON_PROPERTY_PROFILE_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProfileId(@javax.annotation.Nonnull String profileId) {
    this.profileId = profileId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiAssignmentsAssignRequest aiAssignmentsAssignRequest = (AiAssignmentsAssignRequest) o;
    return Objects.equals(this.actionType, aiAssignmentsAssignRequest.actionType) &&
        Objects.equals(this.profileId, aiAssignmentsAssignRequest.profileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionType, profileId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiAssignmentsAssignRequest {\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
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

    // add `actionType` to the URL query string
    if (getActionType() != null) {
      try {
        joiner.add(String.format("%sactionType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getActionType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `profileId` to the URL query string
    if (getProfileId() != null) {
      try {
        joiner.add(String.format("%sprofileId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProfileId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

