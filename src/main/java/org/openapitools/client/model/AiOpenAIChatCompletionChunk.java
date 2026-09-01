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
import org.openapitools.client.model.AiOpenAIChunkChoice;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * One `chat.completion.chunk` of an OpenAI-compatible streaming response. Only the fields this service can populate are emitted - an OpenAI client tolerates the rest as absent.
 */
@JsonPropertyOrder({
  AiOpenAIChatCompletionChunk.JSON_PROPERTY_ID,
  AiOpenAIChatCompletionChunk.JSON_PROPERTY_OBJECT,
  AiOpenAIChatCompletionChunk.JSON_PROPERTY_CREATED,
  AiOpenAIChatCompletionChunk.JSON_PROPERTY_MODEL,
  AiOpenAIChatCompletionChunk.JSON_PROPERTY_CHOICES
})

public class AiOpenAIChatCompletionChunk {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nonnull  private String id;

  /**
   * Always &#x60;chat.completion.chunk&#x60;.
   */
  public enum ObjectEnum {
    CHAT_COMPLETION_CHUNK(String.valueOf("chat.completion.chunk"));

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ObjectEnum fromValue(String value) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  public static final String JSON_PROPERTY_OBJECT = "object";
  @javax.annotation.Nonnull  private ObjectEnum _object;

  public static final String JSON_PROPERTY_CREATED = "created";
  @javax.annotation.Nonnull  private BigDecimal created;

  public static final String JSON_PROPERTY_MODEL = "model";
  @javax.annotation.Nonnull  private String model;

  public static final String JSON_PROPERTY_CHOICES = "choices";
  @javax.annotation.Nonnull  private List<AiOpenAIChunkChoice> choices = new ArrayList<>();

  public AiOpenAIChatCompletionChunk() {
  }


  public AiOpenAIChatCompletionChunk id(@javax.annotation.Nonnull String id) {
    
    this.id = id;
    return this;
  }

  /**
   * The completion identifier, stable across every chunk of one response.
   * @return id
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(@javax.annotation.Nonnull String id) {
    this.id = id;
  }

  public AiOpenAIChatCompletionChunk _object(@javax.annotation.Nonnull ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

  /**
   * Always `chat.completion.chunk`.
   * @return _object
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_OBJECT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ObjectEnum getObject() {
    return _object;
  }


  @JsonProperty(value = JSON_PROPERTY_OBJECT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setObject(@javax.annotation.Nonnull ObjectEnum _object) {
    this._object = _object;
  }

  public AiOpenAIChatCompletionChunk created(@javax.annotation.Nonnull BigDecimal created) {
    
    this.created = created;
    return this;
  }

  /**
   * When the completion started, in Unix seconds.
   * @return created
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_CREATED, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getCreated() {
    return created;
  }


  @JsonProperty(value = JSON_PROPERTY_CREATED, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreated(@javax.annotation.Nonnull BigDecimal created) {
    this.created = created;
  }

  public AiOpenAIChatCompletionChunk model(@javax.annotation.Nonnull String model) {
    
    this.model = model;
    return this;
  }

  /**
   * The model that produced the completion - the resolved profile's model.
   * @return model
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_MODEL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getModel() {
    return model;
  }


  @JsonProperty(value = JSON_PROPERTY_MODEL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setModel(@javax.annotation.Nonnull String model) {
    this.model = model;
  }

  public AiOpenAIChatCompletionChunk choices(@javax.annotation.Nonnull List<AiOpenAIChunkChoice> choices) {
    
    this.choices = choices;
    return this;
  }

  public AiOpenAIChatCompletionChunk addChoicesItem(AiOpenAIChunkChoice choicesItem) {
    if (this.choices == null) {
      this.choices = new ArrayList<>();
    }
    this.choices.add(choicesItem);
    return this;
  }

  /**
   * The choices carried by this chunk. This service emits exactly one.
   * @return choices
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_CHOICES, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<AiOpenAIChunkChoice> getChoices() {
    return choices;
  }


  @JsonProperty(value = JSON_PROPERTY_CHOICES, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChoices(@javax.annotation.Nonnull List<AiOpenAIChunkChoice> choices) {
    this.choices = choices;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiOpenAIChatCompletionChunk aiOpenAIChatCompletionChunk = (AiOpenAIChatCompletionChunk) o;
    return Objects.equals(this.id, aiOpenAIChatCompletionChunk.id) &&
        Objects.equals(this._object, aiOpenAIChatCompletionChunk._object) &&
        Objects.equals(this.created, aiOpenAIChatCompletionChunk.created) &&
        Objects.equals(this.model, aiOpenAIChatCompletionChunk.model) &&
        Objects.equals(this.choices, aiOpenAIChatCompletionChunk.choices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, created, model, choices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiOpenAIChatCompletionChunk {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    choices: ").append(toIndentedString(choices)).append("\n");
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

    // add `object` to the URL query string
    if (getObject() != null) {
      try {
        joiner.add(String.format("%sobject%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getObject()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
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

    // add `model` to the URL query string
    if (getModel() != null) {
      try {
        joiner.add(String.format("%smodel%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getModel()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `choices` to the URL query string
    if (getChoices() != null) {
      for (int i = 0; i < getChoices().size(); i++) {
        if (getChoices().get(i) != null) {
          joiner.add(getChoices().get(i).toUrlQueryString(String.format("%schoices%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

