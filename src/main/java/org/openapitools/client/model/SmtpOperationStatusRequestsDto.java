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
 * The state of the background job that sends the portal SMTP test message.
 */
@JsonPropertyOrder({
  SmtpOperationStatusRequestsDto.JSON_PROPERTY_COMPLETED,
  SmtpOperationStatusRequestsDto.JSON_PROPERTY_ID,
  SmtpOperationStatusRequestsDto.JSON_PROPERTY_ERROR,
  SmtpOperationStatusRequestsDto.JSON_PROPERTY_STATUS,
  SmtpOperationStatusRequestsDto.JSON_PROPERTY_PERCENTS
})

public class SmtpOperationStatusRequestsDto {
  public static final String JSON_PROPERTY_COMPLETED = "completed";
  @javax.annotation.Nullable  private Boolean completed;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable  private JsonNullable<String> id = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ERROR = "error";
  @javax.annotation.Nullable  private JsonNullable<String> error = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nullable  private JsonNullable<String> status = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PERCENTS = "percents";
  @javax.annotation.Nullable  private Integer percents;

  public SmtpOperationStatusRequestsDto() {
  }


  public SmtpOperationStatusRequestsDto completed(@javax.annotation.Nullable Boolean completed) {
    
    this.completed = completed;
    return this;
  }

  /**
   * Whether the job has finished. This is the field to poll; the first answer that reports it true also discards  the job, so read `error` out of that same answer rather than calling again.
   * @return completed
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_COMPLETED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCompleted() {
    return completed;
  }


  @JsonProperty(value = JSON_PROPERTY_COMPLETED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompleted(@javax.annotation.Nullable Boolean completed) {
    this.completed = completed;
  }

  public SmtpOperationStatusRequestsDto id(@javax.annotation.Nullable String id) {
    this.id = JsonNullable.<String>of(id);
    
    return this;
  }

  /**
   * The identifier of the queued job. A portal only ever has one test job at a time, so it names the run rather  than selecting among several.
   * @return id
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getId() {
        return id.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getId_JsonNullable() {
    return id;
  }
  
  @JsonProperty(JSON_PROPERTY_ID)
  public void setId_JsonNullable(JsonNullable<String> id) {
    this.id = id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = JsonNullable.<String>of(id);
  }

  public SmtpOperationStatusRequestsDto error(@javax.annotation.Nullable String error) {
    this.error = JsonNullable.<String>of(error);
    
    return this;
  }

  /**
   * Why the test failed. It stays empty while the job runs and also once the relay has accepted the message, so  an empty value on a finished job is what success looks like; an unreachable relay is reported here after a  30-second connection timeout rather than as a failed request.
   * @return error
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getError() {
        return error.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ERROR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getError_JsonNullable() {
    return error;
  }
  
  @JsonProperty(JSON_PROPERTY_ERROR)
  public void setError_JsonNullable(JsonNullable<String> error) {
    this.error = error;
  }

  public void setError(@javax.annotation.Nullable String error) {
    this.error = JsonNullable.<String>of(error);
  }

  public SmtpOperationStatusRequestsDto status(@javax.annotation.Nullable String status) {
    this.status = JsonNullable.<String>of(status);
    
    return this;
  }

  /**
   * The step the job has reached, in words - `Connect to host` or `Send test message`, for instance. It is meant  to be shown to a person and is not a fixed set of values to branch on.
   * @return status
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getStatus() {
        return status.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getStatus_JsonNullable() {
    return status;
  }
  
  @JsonProperty(JSON_PROPERTY_STATUS)
  public void setStatus_JsonNullable(JsonNullable<String> status) {
    this.status = status;
  }

  public void setStatus(@javax.annotation.Nullable String status) {
    this.status = JsonNullable.<String>of(status);
  }

  public SmtpOperationStatusRequestsDto percents(@javax.annotation.Nullable Integer percents) {
    
    this.percents = percents;
    return this;
  }

  /**
   * How far the job has got, as a percentage climbing to 100. Reaching 100 says the job ran to the end, not that  the message was accepted - that is what an empty `error` says.
   * @return percents
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PERCENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPercents() {
    return percents;
  }


  @JsonProperty(value = JSON_PROPERTY_PERCENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPercents(@javax.annotation.Nullable Integer percents) {
    this.percents = percents;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmtpOperationStatusRequestsDto smtpOperationStatusRequestsDto = (SmtpOperationStatusRequestsDto) o;
    return Objects.equals(this.completed, smtpOperationStatusRequestsDto.completed) &&
        equalsNullable(this.id, smtpOperationStatusRequestsDto.id) &&
        equalsNullable(this.error, smtpOperationStatusRequestsDto.error) &&
        equalsNullable(this.status, smtpOperationStatusRequestsDto.status) &&
        Objects.equals(this.percents, smtpOperationStatusRequestsDto.percents);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(completed, hashCodeNullable(id), hashCodeNullable(error), hashCodeNullable(status), percents);
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
    sb.append("class SmtpOperationStatusRequestsDto {\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    percents: ").append(toIndentedString(percents)).append("\n");
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

    // add `completed` to the URL query string
    if (getCompleted() != null) {
      try {
        joiner.add(String.format("%scompleted%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCompleted()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `error` to the URL query string
    if (getError() != null) {
      try {
        joiner.add(String.format("%serror%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getError()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      try {
        joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatus()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `percents` to the URL query string
    if (getPercents() != null) {
      try {
        joiner.add(String.format("%spercents%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPercents()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

