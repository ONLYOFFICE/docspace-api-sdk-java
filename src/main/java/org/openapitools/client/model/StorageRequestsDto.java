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
import org.openapitools.client.model.ItemKeyValuePairStringString;
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
 * The request parameters for configuring the storage module settings.
 */
@JsonPropertyOrder({
  StorageRequestsDto.JSON_PROPERTY_MODULE,
  StorageRequestsDto.JSON_PROPERTY_PROPS
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class StorageRequestsDto {
  public static final String JSON_PROPERTY_MODULE = "module";
  @javax.annotation.Nullable
  private String module;

  public static final String JSON_PROPERTY_PROPS = "props";
  @javax.annotation.Nullable
  private JsonNullable<List<ItemKeyValuePairStringString>> props = JsonNullable.<List<ItemKeyValuePairStringString>>undefined();

  public StorageRequestsDto() {
  }

  public StorageRequestsDto module(@javax.annotation.Nullable String module) {
    
    this.module = module;
    return this;
  }

  /**
   * The name for the storage module to be configured.
   * @return module
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODULE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getModule() {
    return module;
  }


  @JsonProperty(JSON_PROPERTY_MODULE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setModule(@javax.annotation.Nullable String module) {
    this.module = module;
  }

  public StorageRequestsDto props(@javax.annotation.Nullable List<ItemKeyValuePairStringString> props) {
    this.props = JsonNullable.<List<ItemKeyValuePairStringString>>of(props);
    
    return this;
  }

  public StorageRequestsDto addPropsItem(ItemKeyValuePairStringString propsItem) {
    if (this.props == null || !this.props.isPresent()) {
      this.props = JsonNullable.<List<ItemKeyValuePairStringString>>of(new ArrayList<>());
    }
    try {
      this.props.get().add(propsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of configuration key-value pairs for the storage module.
   * @return props
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<ItemKeyValuePairStringString> getProps() {
        return props.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<ItemKeyValuePairStringString>> getProps_JsonNullable() {
    return props;
  }
  
  @JsonProperty(JSON_PROPERTY_PROPS)
  public void setProps_JsonNullable(JsonNullable<List<ItemKeyValuePairStringString>> props) {
    this.props = props;
  }

  public void setProps(@javax.annotation.Nullable List<ItemKeyValuePairStringString> props) {
    this.props = JsonNullable.<List<ItemKeyValuePairStringString>>of(props);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorageRequestsDto storageRequestsDto = (StorageRequestsDto) o;
    return Objects.equals(this.module, storageRequestsDto.module) &&
        equalsNullable(this.props, storageRequestsDto.props);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(module, hashCodeNullable(props));
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
    sb.append("class StorageRequestsDto {\n");
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
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

    // add `module` to the URL query string
    if (getModule() != null) {
      try {
        joiner.add(String.format("%smodule%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getModule()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `props` to the URL query string
    if (getProps() != null) {
      for (int i = 0; i < getProps().size(); i++) {
        if (getProps().get(i) != null) {
          joiner.add(getProps().get(i).toUrlQueryString(String.format("%sprops%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

