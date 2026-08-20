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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * Represents the response returned from a chunked upload session.
 */
@JsonPropertyOrder({
  ChunkedUploadSessionResponseInteger.JSON_PROPERTY_ID,
  ChunkedUploadSessionResponseInteger.JSON_PROPERTY_PATH,
  ChunkedUploadSessionResponseInteger.JSON_PROPERTY_CREATED,
  ChunkedUploadSessionResponseInteger.JSON_PROPERTY_EXPIRED,
  ChunkedUploadSessionResponseInteger.JSON_PROPERTY_LOCATION,
  ChunkedUploadSessionResponseInteger.JSON_PROPERTY_BYTES_TOTAL
})

public class ChunkedUploadSessionResponseInteger {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable  private JsonNullable<String> id = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PATH = "path";
  @javax.annotation.Nullable  private JsonNullable<List<Integer>> path = JsonNullable.<List<Integer>>undefined();

  public static final String JSON_PROPERTY_CREATED = "created";
  @javax.annotation.Nullable  private OffsetDateTime created;

  public static final String JSON_PROPERTY_EXPIRED = "expired";
  @javax.annotation.Nullable  private OffsetDateTime expired;

  public static final String JSON_PROPERTY_LOCATION = "location";
  @javax.annotation.Nullable  private JsonNullable<String> location = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BYTES_TOTAL = "bytes_total";
  @javax.annotation.Nullable  private Long bytesTotal;

  public ChunkedUploadSessionResponseInteger() {
  }


  public ChunkedUploadSessionResponseInteger id(@javax.annotation.Nullable String id) {
    this.id = JsonNullable.<String>of(id);
    
    return this;
  }

  /**
   * The unique identifier for the entity.
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

  public ChunkedUploadSessionResponseInteger path(@javax.annotation.Nullable List<Integer> path) {
    this.path = JsonNullable.<List<Integer>>of(path);
    
    return this;
  }

  public ChunkedUploadSessionResponseInteger addPathItem(Integer pathItem) {
    if (this.path == null || !this.path.isPresent()) {
      this.path = JsonNullable.<List<Integer>>of(new ArrayList<>());
    }
    try {
      this.path.get().add(pathItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Represents the hierarchical path of folders associated with a chunked upload session.
   * @return path
   */
  @javax.annotation.Nullable  @JsonIgnore

  public List<Integer> getPath() {
        return path.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_PATH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<Integer>> getPath_JsonNullable() {
    return path;
  }
  
  @JsonProperty(JSON_PROPERTY_PATH)
  public void setPath_JsonNullable(JsonNullable<List<Integer>> path) {
    this.path = path;
  }

  public void setPath(@javax.annotation.Nullable List<Integer> path) {
    this.path = JsonNullable.<List<Integer>>of(path);
  }

  public ChunkedUploadSessionResponseInteger created(@javax.annotation.Nullable OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

  /**
   * The timestamp indicating when the chunked upload session was created.
   * @return created
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_CREATED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreated() {
    return created;
  }


  @JsonProperty(value = JSON_PROPERTY_CREATED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreated(@javax.annotation.Nullable OffsetDateTime created) {
    this.created = created;
  }

  public ChunkedUploadSessionResponseInteger expired(@javax.annotation.Nullable OffsetDateTime expired) {
    
    this.expired = expired;
    return this;
  }

  /**
   * The date and time when the chunked upload session is set to expire.
   * @return expired
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_EXPIRED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getExpired() {
    return expired;
  }


  @JsonProperty(value = JSON_PROPERTY_EXPIRED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpired(@javax.annotation.Nullable OffsetDateTime expired) {
    this.expired = expired;
  }

  public ChunkedUploadSessionResponseInteger location(@javax.annotation.Nullable String location) {
    this.location = JsonNullable.<String>of(location);
    
    return this;
  }

  /**
   * Represents the URI or path of the chunked upload session's current location.
   * @return location
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getLocation() {
        return location.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_LOCATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getLocation_JsonNullable() {
    return location;
  }
  
  @JsonProperty(JSON_PROPERTY_LOCATION)
  public void setLocation_JsonNullable(JsonNullable<String> location) {
    this.location = location;
  }

  public void setLocation(@javax.annotation.Nullable String location) {
    this.location = JsonNullable.<String>of(location);
  }

  public ChunkedUploadSessionResponseInteger bytesTotal(@javax.annotation.Nullable Long bytesTotal) {
    
    this.bytesTotal = bytesTotal;
    return this;
  }

  /**
   * The total size, in bytes, of the file being uploaded in the chunked upload session.
   * @return bytesTotal
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_BYTES_TOTAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getBytesTotal() {
    return bytesTotal;
  }


  @JsonProperty(value = JSON_PROPERTY_BYTES_TOTAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBytesTotal(@javax.annotation.Nullable Long bytesTotal) {
    this.bytesTotal = bytesTotal;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChunkedUploadSessionResponseInteger chunkedUploadSessionResponseInteger = (ChunkedUploadSessionResponseInteger) o;
    return equalsNullable(this.id, chunkedUploadSessionResponseInteger.id) &&
        equalsNullable(this.path, chunkedUploadSessionResponseInteger.path) &&
        Objects.equals(this.created, chunkedUploadSessionResponseInteger.created) &&
        Objects.equals(this.expired, chunkedUploadSessionResponseInteger.expired) &&
        equalsNullable(this.location, chunkedUploadSessionResponseInteger.location) &&
        Objects.equals(this.bytesTotal, chunkedUploadSessionResponseInteger.bytesTotal);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(id), hashCodeNullable(path), created, expired, hashCodeNullable(location), bytesTotal);
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
    sb.append("class ChunkedUploadSessionResponseInteger {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    bytesTotal: ").append(toIndentedString(bytesTotal)).append("\n");
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

    // add `path` to the URL query string
    if (getPath() != null) {
      for (int i = 0; i < getPath().size(); i++) {
        try {
          joiner.add(String.format("%spath%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getPath().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `created` to the URL query string
    if (getCreated() != null) {
      try {
        joiner.add(String.format("%screated%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreated()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `expired` to the URL query string
    if (getExpired() != null) {
      try {
        joiner.add(String.format("%sexpired%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExpired()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `location` to the URL query string
    if (getLocation() != null) {
      try {
        joiner.add(String.format("%slocation%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLocation()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `bytes_total` to the URL query string
    if (getBytesTotal() != null) {
      try {
        joiner.add(String.format("%sbytes_total%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBytesTotal()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

