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
import org.openapitools.client.model.FeatureUsedDto;
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
 * The tenant quota feature parameters.
 */
@JsonPropertyOrder({
  TenantQuotaFeatureDto.JSON_PROPERTY_ID,
  TenantQuotaFeatureDto.JSON_PROPERTY_TITLE,
  TenantQuotaFeatureDto.JSON_PROPERTY_IMAGE,
  TenantQuotaFeatureDto.JSON_PROPERTY_VALUE,
  TenantQuotaFeatureDto.JSON_PROPERTY_TYPE,
  TenantQuotaFeatureDto.JSON_PROPERTY_USED,
  TenantQuotaFeatureDto.JSON_PROPERTY_PRICE_TITLE
})

public class TenantQuotaFeatureDto {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private JsonNullable<String> id = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable
  private JsonNullable<String> title = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IMAGE = "image";
  @javax.annotation.Nullable
  private JsonNullable<String> image = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_VALUE = "value";
  @javax.annotation.Nullable
  private JsonNullable<Object> value = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable
  private JsonNullable<String> type = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_USED = "used";
  @javax.annotation.Nullable
  private FeatureUsedDto used;

  public static final String JSON_PROPERTY_PRICE_TITLE = "priceTitle";
  @javax.annotation.Nullable
  private JsonNullable<String> priceTitle = JsonNullable.<String>undefined();

  public TenantQuotaFeatureDto() {
  }

  public TenantQuotaFeatureDto id(@javax.annotation.Nullable String id) {
    this.id = JsonNullable.<String>of(id);
    
    return this;
  }

  /**
   * The ID of the tenant quota feature.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getId() {
        return id.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ID)
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

  public TenantQuotaFeatureDto title(@javax.annotation.Nullable String title) {
    this.title = JsonNullable.<String>of(title);
    
    return this;
  }

  /**
   * The title of the tenant quota feature.
   * @return title
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getTitle() {
        return title.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTitle_JsonNullable() {
    return title;
  }
  
  @JsonProperty(JSON_PROPERTY_TITLE)
  public void setTitle_JsonNullable(JsonNullable<String> title) {
    this.title = title;
  }

  public void setTitle(@javax.annotation.Nullable String title) {
    this.title = JsonNullable.<String>of(title);
  }

  public TenantQuotaFeatureDto image(@javax.annotation.Nullable String image) {
    this.image = JsonNullable.<String>of(image);
    
    return this;
  }

  /**
   * The image URL of the tenant quota feature.
   * @return image
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getImage() {
        return image.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getImage_JsonNullable() {
    return image;
  }
  
  @JsonProperty(JSON_PROPERTY_IMAGE)
  public void setImage_JsonNullable(JsonNullable<String> image) {
    this.image = image;
  }

  public void setImage(@javax.annotation.Nullable String image) {
    this.image = JsonNullable.<String>of(image);
  }

  public TenantQuotaFeatureDto value(@javax.annotation.Nullable Object value) {
    this.value = JsonNullable.<Object>of(value);
    
    return this;
  }

  /**
   * The value of the tenant quota feature.
   * @return value
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getValue() {
        return value.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getValue_JsonNullable() {
    return value;
  }
  
  @JsonProperty(JSON_PROPERTY_VALUE)
  public void setValue_JsonNullable(JsonNullable<Object> value) {
    this.value = value;
  }

  public void setValue(@javax.annotation.Nullable Object value) {
    this.value = JsonNullable.<Object>of(value);
  }

  public TenantQuotaFeatureDto type(@javax.annotation.Nullable String type) {
    this.type = JsonNullable.<String>of(type);
    
    return this;
  }

  /**
   * The type of the tenant quota feature.
   * @return type
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getType() {
        return type.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getType_JsonNullable() {
    return type;
  }
  
  @JsonProperty(JSON_PROPERTY_TYPE)
  public void setType_JsonNullable(JsonNullable<String> type) {
    this.type = type;
  }

  public void setType(@javax.annotation.Nullable String type) {
    this.type = JsonNullable.<String>of(type);
  }

  public TenantQuotaFeatureDto used(@javax.annotation.Nullable FeatureUsedDto used) {
    
    this.used = used;
    return this;
  }

  /**
   * Get used
   * @return used
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeatureUsedDto getUsed() {
    return used;
  }


  @JsonProperty(JSON_PROPERTY_USED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsed(@javax.annotation.Nullable FeatureUsedDto used) {
    this.used = used;
  }

  public TenantQuotaFeatureDto priceTitle(@javax.annotation.Nullable String priceTitle) {
    this.priceTitle = JsonNullable.<String>of(priceTitle);
    
    return this;
  }

  /**
   * The price title of the tenant quota feature.
   * @return priceTitle
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPriceTitle() {
        return priceTitle.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRICE_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPriceTitle_JsonNullable() {
    return priceTitle;
  }
  
  @JsonProperty(JSON_PROPERTY_PRICE_TITLE)
  public void setPriceTitle_JsonNullable(JsonNullable<String> priceTitle) {
    this.priceTitle = priceTitle;
  }

  public void setPriceTitle(@javax.annotation.Nullable String priceTitle) {
    this.priceTitle = JsonNullable.<String>of(priceTitle);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantQuotaFeatureDto tenantQuotaFeatureDto = (TenantQuotaFeatureDto) o;
    return equalsNullable(this.id, tenantQuotaFeatureDto.id) &&
        equalsNullable(this.title, tenantQuotaFeatureDto.title) &&
        equalsNullable(this.image, tenantQuotaFeatureDto.image) &&
        equalsNullable(this.value, tenantQuotaFeatureDto.value) &&
        equalsNullable(this.type, tenantQuotaFeatureDto.type) &&
        Objects.equals(this.used, tenantQuotaFeatureDto.used) &&
        equalsNullable(this.priceTitle, tenantQuotaFeatureDto.priceTitle);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(id), hashCodeNullable(title), hashCodeNullable(image), hashCodeNullable(value), hashCodeNullable(type), used, hashCodeNullable(priceTitle));
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
    sb.append("class TenantQuotaFeatureDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    used: ").append(toIndentedString(used)).append("\n");
    sb.append("    priceTitle: ").append(toIndentedString(priceTitle)).append("\n");
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

    // add `image` to the URL query string
    if (getImage() != null) {
      try {
        joiner.add(String.format("%simage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getImage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `value` to the URL query string
    if (getValue() != null) {
      try {
        joiner.add(String.format("%svalue%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getValue()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `used` to the URL query string
    if (getUsed() != null) {
      joiner.add(getUsed().toUrlQueryString(prefix + "used" + suffix));
    }

    // add `priceTitle` to the URL query string
    if (getPriceTitle() != null) {
      try {
        joiner.add(String.format("%spriceTitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPriceTitle()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

