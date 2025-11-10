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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The permissions configuration parameters.
 */
@JsonPropertyOrder({
  PermissionsConfig.JSON_PROPERTY_COMMENT,
  PermissionsConfig.JSON_PROPERTY_CHAT,
  PermissionsConfig.JSON_PROPERTY_DOWNLOAD,
  PermissionsConfig.JSON_PROPERTY_EDIT,
  PermissionsConfig.JSON_PROPERTY_FILL_FORMS,
  PermissionsConfig.JSON_PROPERTY_MODIFY_FILTER,
  PermissionsConfig.JSON_PROPERTY_PROTECT,
  PermissionsConfig.JSON_PROPERTY_PRINT,
  PermissionsConfig.JSON_PROPERTY_REVIEW,
  PermissionsConfig.JSON_PROPERTY_COPY
})
@javax.annotation.Generated(value = "com.example.codegen.MyJavaClientCodegen", date = "2025-11-10T06:17:22.719994700+03:00[Europe/Moscow]", comments = "Generator version: 7.14.0")
public class PermissionsConfig {
  public static final String JSON_PROPERTY_COMMENT = "comment";
  @javax.annotation.Nullable
  private Boolean comment;

  public static final String JSON_PROPERTY_CHAT = "chat";
  @javax.annotation.Nullable
  private Boolean chat;

  public static final String JSON_PROPERTY_DOWNLOAD = "download";
  @javax.annotation.Nullable
  private Boolean download;

  public static final String JSON_PROPERTY_EDIT = "edit";
  @javax.annotation.Nullable
  private Boolean edit;

  public static final String JSON_PROPERTY_FILL_FORMS = "fillForms";
  @javax.annotation.Nullable
  private Boolean fillForms;

  public static final String JSON_PROPERTY_MODIFY_FILTER = "modifyFilter";
  @javax.annotation.Nullable
  private Boolean modifyFilter;

  public static final String JSON_PROPERTY_PROTECT = "protect";
  @javax.annotation.Nullable
  private Boolean protect;

  public static final String JSON_PROPERTY_PRINT = "print";
  @javax.annotation.Nullable
  private Boolean print;

  public static final String JSON_PROPERTY_REVIEW = "review";
  @javax.annotation.Nullable
  private Boolean review;

  public static final String JSON_PROPERTY_COPY = "copy";
  @javax.annotation.Nullable
  private Boolean copy;

  public PermissionsConfig() {
  }

  public PermissionsConfig comment(@javax.annotation.Nullable Boolean comment) {
    
    this.comment = comment;
    return this;
  }

  /**
   * Defines if the document can be commented or not.
   * @return comment
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getComment() {
    return comment;
  }


  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComment(@javax.annotation.Nullable Boolean comment) {
    this.comment = comment;
  }

  public PermissionsConfig chat(@javax.annotation.Nullable Boolean chat) {
    
    this.chat = chat;
    return this;
  }

  /**
   * Defines if the chat functionality is enabled in the document or not.
   * @return chat
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getChat() {
    return chat;
  }


  @JsonProperty(JSON_PROPERTY_CHAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChat(@javax.annotation.Nullable Boolean chat) {
    this.chat = chat;
  }

  public PermissionsConfig download(@javax.annotation.Nullable Boolean download) {
    
    this.download = download;
    return this;
  }

  /**
   * Defines if the document can be downloaded or only viewed or edited online.
   * @return download
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOWNLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDownload() {
    return download;
  }


  @JsonProperty(JSON_PROPERTY_DOWNLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDownload(@javax.annotation.Nullable Boolean download) {
    this.download = download;
  }

  public PermissionsConfig edit(@javax.annotation.Nullable Boolean edit) {
    
    this.edit = edit;
    return this;
  }

  /**
   * Defines if the document can be edited or only viewed.
   * @return edit
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EDIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEdit() {
    return edit;
  }


  @JsonProperty(JSON_PROPERTY_EDIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEdit(@javax.annotation.Nullable Boolean edit) {
    this.edit = edit;
  }

  public PermissionsConfig fillForms(@javax.annotation.Nullable Boolean fillForms) {
    
    this.fillForms = fillForms;
    return this;
  }

  /**
   * Defines if the forms can be filled.
   * @return fillForms
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILL_FORMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFillForms() {
    return fillForms;
  }


  @JsonProperty(JSON_PROPERTY_FILL_FORMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFillForms(@javax.annotation.Nullable Boolean fillForms) {
    this.fillForms = fillForms;
  }

  public PermissionsConfig modifyFilter(@javax.annotation.Nullable Boolean modifyFilter) {
    
    this.modifyFilter = modifyFilter;
    return this;
  }

  /**
   * Defines if the filter can be applied globally (true) affecting all the other users,  or locally (false), i.e. for the current user only.
   * @return modifyFilter
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getModifyFilter() {
    return modifyFilter;
  }


  @JsonProperty(JSON_PROPERTY_MODIFY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModifyFilter(@javax.annotation.Nullable Boolean modifyFilter) {
    this.modifyFilter = modifyFilter;
  }

  public PermissionsConfig protect(@javax.annotation.Nullable Boolean protect) {
    
    this.protect = protect;
    return this;
  }

  /**
   * Defines if the Protection tab on the toolbar and the Protect button in the left menu are displayedor hidden.
   * @return protect
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROTECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getProtect() {
    return protect;
  }


  @JsonProperty(JSON_PROPERTY_PROTECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProtect(@javax.annotation.Nullable Boolean protect) {
    this.protect = protect;
  }

  public PermissionsConfig print(@javax.annotation.Nullable Boolean print) {
    
    this.print = print;
    return this;
  }

  /**
   * Defines if the document can be printed or not.
   * @return print
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPrint() {
    return print;
  }


  @JsonProperty(JSON_PROPERTY_PRINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrint(@javax.annotation.Nullable Boolean print) {
    this.print = print;
  }

  public PermissionsConfig review(@javax.annotation.Nullable Boolean review) {
    
    this.review = review;
    return this;
  }

  /**
   * Defines if the document can be reviewed or not.
   * @return review
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REVIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getReview() {
    return review;
  }


  @JsonProperty(JSON_PROPERTY_REVIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReview(@javax.annotation.Nullable Boolean review) {
    this.review = review;
  }

  public PermissionsConfig copy(@javax.annotation.Nullable Boolean copy) {
    
    this.copy = copy;
    return this;
  }

  /**
   * Defines if the content can be copied to the clipboard or not.
   * @return copy
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COPY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCopy() {
    return copy;
  }


  @JsonProperty(JSON_PROPERTY_COPY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCopy(@javax.annotation.Nullable Boolean copy) {
    this.copy = copy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionsConfig permissionsConfig = (PermissionsConfig) o;
    return Objects.equals(this.comment, permissionsConfig.comment) &&
        Objects.equals(this.chat, permissionsConfig.chat) &&
        Objects.equals(this.download, permissionsConfig.download) &&
        Objects.equals(this.edit, permissionsConfig.edit) &&
        Objects.equals(this.fillForms, permissionsConfig.fillForms) &&
        Objects.equals(this.modifyFilter, permissionsConfig.modifyFilter) &&
        Objects.equals(this.protect, permissionsConfig.protect) &&
        Objects.equals(this.print, permissionsConfig.print) &&
        Objects.equals(this.review, permissionsConfig.review) &&
        Objects.equals(this.copy, permissionsConfig.copy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, chat, download, edit, fillForms, modifyFilter, protect, print, review, copy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionsConfig {\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    chat: ").append(toIndentedString(chat)).append("\n");
    sb.append("    download: ").append(toIndentedString(download)).append("\n");
    sb.append("    edit: ").append(toIndentedString(edit)).append("\n");
    sb.append("    fillForms: ").append(toIndentedString(fillForms)).append("\n");
    sb.append("    modifyFilter: ").append(toIndentedString(modifyFilter)).append("\n");
    sb.append("    protect: ").append(toIndentedString(protect)).append("\n");
    sb.append("    print: ").append(toIndentedString(print)).append("\n");
    sb.append("    review: ").append(toIndentedString(review)).append("\n");
    sb.append("    copy: ").append(toIndentedString(copy)).append("\n");
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

    // add `comment` to the URL query string
    if (getComment() != null) {
      try {
        joiner.add(String.format("%scomment%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getComment()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `chat` to the URL query string
    if (getChat() != null) {
      try {
        joiner.add(String.format("%schat%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getChat()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `download` to the URL query string
    if (getDownload() != null) {
      try {
        joiner.add(String.format("%sdownload%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDownload()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `edit` to the URL query string
    if (getEdit() != null) {
      try {
        joiner.add(String.format("%sedit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEdit()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `fillForms` to the URL query string
    if (getFillForms() != null) {
      try {
        joiner.add(String.format("%sfillForms%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFillForms()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `modifyFilter` to the URL query string
    if (getModifyFilter() != null) {
      try {
        joiner.add(String.format("%smodifyFilter%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getModifyFilter()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `protect` to the URL query string
    if (getProtect() != null) {
      try {
        joiner.add(String.format("%sprotect%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProtect()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `print` to the URL query string
    if (getPrint() != null) {
      try {
        joiner.add(String.format("%sprint%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPrint()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `review` to the URL query string
    if (getReview() != null) {
      try {
        joiner.add(String.format("%sreview%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReview()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `copy` to the URL query string
    if (getCopy() != null) {
      try {
        joiner.add(String.format("%scopy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCopy()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

