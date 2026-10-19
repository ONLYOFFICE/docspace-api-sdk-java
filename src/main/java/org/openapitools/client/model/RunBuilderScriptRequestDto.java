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
import java.util.HashMap;
import java.util.Map;
import org.openapitools.client.model.RunBuilderScriptOutputRequest;
import org.openapitools.client.model.RunBuilderScriptRequestDtoArgument;
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
 * The document builder script to run and where to put what it produces.
 */
@JsonPropertyOrder({
  RunBuilderScriptRequestDto.JSON_PROPERTY_SCRIPT,
  RunBuilderScriptRequestDto.JSON_PROPERTY_FOLDER_ID,
  RunBuilderScriptRequestDto.JSON_PROPERTY_OUTPUTS,
  RunBuilderScriptRequestDto.JSON_PROPERTY_ARGUMENT
})

public class RunBuilderScriptRequestDto {
  public static final String JSON_PROPERTY_SCRIPT = "script";
  @javax.annotation.Nullable  private String script;

  public static final String JSON_PROPERTY_FOLDER_ID = "folderId";
  @javax.annotation.Nullable  private JsonNullable<Integer> folderId = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_OUTPUTS = "outputs";
  @javax.annotation.Nullable  private Map<String, RunBuilderScriptOutputRequest> outputs = new HashMap<>();

  public static final String JSON_PROPERTY_ARGUMENT = "argument";
  @javax.annotation.Nullable  private RunBuilderScriptRequestDtoArgument argument;

  public RunBuilderScriptRequestDto() {
  }


  public RunBuilderScriptRequestDto script(@javax.annotation.Nullable String script) {
    
    this.script = script;
    return this;
  }

  /**
   * The document builder script. It names a portal file by its id where the document builder documentation  writes an address - `builder.OpenFile(1234)`; an address written out in the script is refused.
   * @return script
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SCRIPT, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getScript() {
    return script;
  }


  @JsonProperty(value = JSON_PROPERTY_SCRIPT, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setScript(@javax.annotation.Nullable String script) {
    this.script = script;
  }

  public RunBuilderScriptRequestDto folderId(@javax.annotation.Nullable Integer folderId) {
    this.folderId = JsonNullable.<Integer>of(folderId);
    
    return this;
  }

  /**
   * The id of the folder for the produced files that `outputs` does not list, as reported by a folder listing  such as `GET api/2.0/files/{folderId}`.
   * @return folderId
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Integer getFolderId() {
        return folderId.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_FOLDER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Integer> getFolderId_JsonNullable() {
    return folderId;
  }
  
  @JsonProperty(JSON_PROPERTY_FOLDER_ID)
  public void setFolderId_JsonNullable(JsonNullable<Integer> folderId) {
    this.folderId = folderId;
  }

  public void setFolderId(@javax.annotation.Nullable Integer folderId) {
    this.folderId = JsonNullable.<Integer>of(folderId);
  }

  public RunBuilderScriptRequestDto outputs(@javax.annotation.Nullable Map<String, RunBuilderScriptOutputRequest> outputs) {
    
    this.outputs = outputs;
    return this;
  }

  public RunBuilderScriptRequestDto putOutputsItem(String key, RunBuilderScriptOutputRequest outputsItem) {
    if (this.outputs == null) {
      this.outputs = new HashMap<>();
    }
    this.outputs.put(key, outputsItem);
    return this;
  }

  /**
   * Destinations of the produced files, keyed by the name the script saves each one under - the second argument of  `builder.SaveFile(docx, result.docx)`.
   * @return outputs
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_OUTPUTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, RunBuilderScriptOutputRequest> getOutputs() {
    return outputs;
  }


  @JsonProperty(value = JSON_PROPERTY_OUTPUTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutputs(@javax.annotation.Nullable Map<String, RunBuilderScriptOutputRequest> outputs) {
    this.outputs = outputs;
  }

  public RunBuilderScriptRequestDto argument(@javax.annotation.Nullable RunBuilderScriptRequestDtoArgument argument) {
    
    this.argument = argument;
    return this;
  }

  /**
   * Get argument
   * @return argument
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_ARGUMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RunBuilderScriptRequestDtoArgument getArgument() {
    return argument;
  }


  @JsonProperty(value = JSON_PROPERTY_ARGUMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArgument(@javax.annotation.Nullable RunBuilderScriptRequestDtoArgument argument) {
    this.argument = argument;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunBuilderScriptRequestDto runBuilderScriptRequestDto = (RunBuilderScriptRequestDto) o;
    return Objects.equals(this.script, runBuilderScriptRequestDto.script) &&
        equalsNullable(this.folderId, runBuilderScriptRequestDto.folderId) &&
        Objects.equals(this.outputs, runBuilderScriptRequestDto.outputs) &&
        Objects.equals(this.argument, runBuilderScriptRequestDto.argument);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(script, hashCodeNullable(folderId), outputs, argument);
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
    sb.append("class RunBuilderScriptRequestDto {\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("    argument: ").append(toIndentedString(argument)).append("\n");
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

    // add `script` to the URL query string
    if (getScript() != null) {
      try {
        joiner.add(String.format("%sscript%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getScript()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `folderId` to the URL query string
    if (getFolderId() != null) {
      try {
        joiner.add(String.format("%sfolderId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFolderId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `outputs` to the URL query string
    if (getOutputs() != null) {
      for (String _key : getOutputs().keySet()) {
        if (getOutputs().get(_key) != null) {
          joiner.add(getOutputs().get(_key).toUrlQueryString(String.format("%soutputs%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix))));
        }
      }
    }

    // add `argument` to the URL query string
    if (getArgument() != null) {
      joiner.add(getArgument().toUrlQueryString(prefix + "argument" + suffix));
    }

    return joiner.toString();
  }

}

