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
import org.openapitools.client.model.AuthKey;
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
 * The request parameters for handling the authorization service.
 */
@JsonPropertyOrder({
  AuthServiceRequestsDto.JSON_PROPERTY_NAME,
  AuthServiceRequestsDto.JSON_PROPERTY_TITLE,
  AuthServiceRequestsDto.JSON_PROPERTY_DESCRIPTION,
  AuthServiceRequestsDto.JSON_PROPERTY_INSTRUCTION,
  AuthServiceRequestsDto.JSON_PROPERTY_CAN_SET,
  AuthServiceRequestsDto.JSON_PROPERTY_PAID,
  AuthServiceRequestsDto.JSON_PROPERTY_PROPS
})

public class AuthServiceRequestsDto {
  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable
  private JsonNullable<String> title = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @javax.annotation.Nullable
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_INSTRUCTION = "instruction";
  @javax.annotation.Nullable
  private JsonNullable<String> instruction = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CAN_SET = "canSet";
  @javax.annotation.Nullable
  private Boolean canSet;

  public static final String JSON_PROPERTY_PAID = "paid";
  @javax.annotation.Nullable
  private Boolean paid;

  public static final String JSON_PROPERTY_PROPS = "props";
  @javax.annotation.Nullable
  private JsonNullable<List<AuthKey>> props = JsonNullable.<List<AuthKey>>undefined();

  public AuthServiceRequestsDto() {
  }


  public AuthServiceRequestsDto name(@javax.annotation.Nullable String name) {
    this.name = JsonNullable.<String>of(name);
    
    return this;
  }

  /**
   * The name of the authorization service.
   * @return name
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = JsonNullable.<String>of(name);
  }

  public AuthServiceRequestsDto title(@javax.annotation.Nullable String title) {
    this.title = JsonNullable.<String>of(title);
    
    return this;
  }

  /**
   * The user-friendly display title of the authorization service.
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

  public AuthServiceRequestsDto description(@javax.annotation.Nullable String description) {
    this.description = JsonNullable.<String>of(description);
    
    return this;
  }

  /**
   * The brief description of the authorization service.
   * @return description
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getDescription() {
        return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }
  
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = JsonNullable.<String>of(description);
  }

  public AuthServiceRequestsDto instruction(@javax.annotation.Nullable String instruction) {
    this.instruction = JsonNullable.<String>of(instruction);
    
    return this;
  }

  /**
   * The detailed instructions for configuring or using the authorization service.
   * @return instruction
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getInstruction() {
        return instruction.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INSTRUCTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getInstruction_JsonNullable() {
    return instruction;
  }
  
  @JsonProperty(JSON_PROPERTY_INSTRUCTION)
  public void setInstruction_JsonNullable(JsonNullable<String> instruction) {
    this.instruction = instruction;
  }

  public void setInstruction(@javax.annotation.Nullable String instruction) {
    this.instruction = JsonNullable.<String>of(instruction);
  }

  public AuthServiceRequestsDto canSet(@javax.annotation.Nullable Boolean canSet) {
    
    this.canSet = canSet;
    return this;
  }

  /**
   * Specifies whether the authorization service can be configured by the user.
   * @return canSet
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAN_SET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanSet() {
    return canSet;
  }


  @JsonProperty(JSON_PROPERTY_CAN_SET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCanSet(@javax.annotation.Nullable Boolean canSet) {
    this.canSet = canSet;
  }

  public AuthServiceRequestsDto paid(@javax.annotation.Nullable Boolean paid) {
    
    this.paid = paid;
    return this;
  }

  /**
   * Specifies whether the authorization service is paid or not.
   * @return paid
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPaid() {
    return paid;
  }


  @JsonProperty(JSON_PROPERTY_PAID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaid(@javax.annotation.Nullable Boolean paid) {
    this.paid = paid;
  }

  public AuthServiceRequestsDto props(@javax.annotation.Nullable List<AuthKey> props) {
    this.props = JsonNullable.<List<AuthKey>>of(props);
    
    return this;
  }

  public AuthServiceRequestsDto addPropsItem(AuthKey propsItem) {
    if (this.props == null || !this.props.isPresent()) {
      this.props = JsonNullable.<List<AuthKey>>of(new ArrayList<>());
    }
    try {
      this.props.get().add(propsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The collection of authorization keys associated with the authorization service.
   * @return props
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public List<AuthKey> getProps() {
        return props.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<AuthKey>> getProps_JsonNullable() {
    return props;
  }
  
  @JsonProperty(JSON_PROPERTY_PROPS)
  public void setProps_JsonNullable(JsonNullable<List<AuthKey>> props) {
    this.props = props;
  }

  public void setProps(@javax.annotation.Nullable List<AuthKey> props) {
    this.props = JsonNullable.<List<AuthKey>>of(props);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthServiceRequestsDto authServiceRequestsDto = (AuthServiceRequestsDto) o;
    return equalsNullable(this.name, authServiceRequestsDto.name) &&
        equalsNullable(this.title, authServiceRequestsDto.title) &&
        equalsNullable(this.description, authServiceRequestsDto.description) &&
        equalsNullable(this.instruction, authServiceRequestsDto.instruction) &&
        Objects.equals(this.canSet, authServiceRequestsDto.canSet) &&
        Objects.equals(this.paid, authServiceRequestsDto.paid) &&
        equalsNullable(this.props, authServiceRequestsDto.props);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(name), hashCodeNullable(title), hashCodeNullable(description), hashCodeNullable(instruction), canSet, paid, hashCodeNullable(props));
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
    sb.append("class AuthServiceRequestsDto {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    instruction: ").append(toIndentedString(instruction)).append("\n");
    sb.append("    canSet: ").append(toIndentedString(canSet)).append("\n");
    sb.append("    paid: ").append(toIndentedString(paid)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `description` to the URL query string
    if (getDescription() != null) {
      try {
        joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `instruction` to the URL query string
    if (getInstruction() != null) {
      try {
        joiner.add(String.format("%sinstruction%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInstruction()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `canSet` to the URL query string
    if (getCanSet() != null) {
      try {
        joiner.add(String.format("%scanSet%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCanSet()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `paid` to the URL query string
    if (getPaid() != null) {
      try {
        joiner.add(String.format("%spaid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPaid()), "UTF-8").replaceAll("\\+", "%20")));
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

