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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The response containing paginated data.
 */
@JsonPropertyOrder({
  PageableResponse.JSON_PROPERTY_DATA,
  PageableResponse.JSON_PROPERTY_LIMIT,
  PageableResponse.JSON_PROPERTY_LAST_CLIENT_ID,
  PageableResponse.JSON_PROPERTY_LAST_CREATED_ON
})

public class PageableResponse {
  public static final String JSON_PROPERTY_DATA = "data";
  @javax.annotation.Nullable
  private Object data;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  @javax.annotation.Nullable
  private Integer limit;

  public static final String JSON_PROPERTY_LAST_CLIENT_ID = "last_client_id";
  @javax.annotation.Nullable
  private String lastClientId;

  public static final String JSON_PROPERTY_LAST_CREATED_ON = "last_created_on";
  @javax.annotation.Nullable
  private OffsetDateTime lastCreatedOn;

  public PageableResponse() {
  }


  public PageableResponse data(@javax.annotation.Nullable Object data) {
    
    this.data = data;
    return this;
  }

  /**
   * The paginated data.
   * @return data
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(@javax.annotation.Nullable Object data) {
    this.data = data;
  }

  public PageableResponse limit(@javax.annotation.Nullable Integer limit) {
    
    this.limit = limit;
    return this;
  }

  /**
   * The maximum number of results returned per page.
   * @return limit
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLimit() {
    return limit;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimit(@javax.annotation.Nullable Integer limit) {
    this.limit = limit;
  }

  public PageableResponse lastClientId(@javax.annotation.Nullable String lastClientId) {
    
    this.lastClientId = lastClientId;
    return this;
  }

  /**
   * The identifier of the last retrieved client.
   * @return lastClientId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastClientId() {
    return lastClientId;
  }


  @JsonProperty(JSON_PROPERTY_LAST_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastClientId(@javax.annotation.Nullable String lastClientId) {
    this.lastClientId = lastClientId;
  }

  public PageableResponse lastCreatedOn(@javax.annotation.Nullable OffsetDateTime lastCreatedOn) {
    
    this.lastCreatedOn = lastCreatedOn;
    return this;
  }

  /**
   * The creation date of the last retrieved client.
   * @return lastCreatedOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_CREATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastCreatedOn() {
    return lastCreatedOn;
  }


  @JsonProperty(JSON_PROPERTY_LAST_CREATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastCreatedOn(@javax.annotation.Nullable OffsetDateTime lastCreatedOn) {
    this.lastCreatedOn = lastCreatedOn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageableResponse pageableResponse = (PageableResponse) o;
    return Objects.equals(this.data, pageableResponse.data) &&
        Objects.equals(this.limit, pageableResponse.limit) &&
        Objects.equals(this.lastClientId, pageableResponse.lastClientId) &&
        Objects.equals(this.lastCreatedOn, pageableResponse.lastCreatedOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, limit, lastClientId, lastCreatedOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageableResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    lastClientId: ").append(toIndentedString(lastClientId)).append("\n");
    sb.append("    lastCreatedOn: ").append(toIndentedString(lastCreatedOn)).append("\n");
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

    // add `data` to the URL query string
    if (getData() != null) {
      try {
        joiner.add(String.format("%sdata%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getData()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `limit` to the URL query string
    if (getLimit() != null) {
      try {
        joiner.add(String.format("%slimit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLimit()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `last_client_id` to the URL query string
    if (getLastClientId() != null) {
      try {
        joiner.add(String.format("%slast_client_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLastClientId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `last_created_on` to the URL query string
    if (getLastCreatedOn() != null) {
      try {
        joiner.add(String.format("%slast_created_on%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLastCreatedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

