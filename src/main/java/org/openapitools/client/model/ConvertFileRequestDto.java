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
import org.openapitools.client.model.ConvertDocumentLayoutRequest;
import org.openapitools.client.model.ConvertDocumentRendererRequest;
import org.openapitools.client.model.ConvertPdfRequest;
import org.openapitools.client.model.ConvertSpreadsheetLayoutRequest;
import org.openapitools.client.model.ConvertThumbnailRequest;
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
 * What to convert, where to keep the result, and the parameters the document service is handed. Everything below the  first two fields is the contract of the document service itself, named and shaped exactly as it names it, so that  the portal passes the request on rather than translating it. What the portal can read off the file - its format,  its name and the key of its revision - is not asked for and cannot be overridden.
 */
@JsonPropertyOrder({
  ConvertFileRequestDto.JSON_PROPERTY_FILE_ID,
  ConvertFileRequestDto.JSON_PROPERTY_FOLDER_ID,
  ConvertFileRequestDto.JSON_PROPERTY_CODE_PAGE,
  ConvertFileRequestDto.JSON_PROPERTY_DELIMITER,
  ConvertFileRequestDto.JSON_PROPERTY_DOCUMENT_LAYOUT,
  ConvertFileRequestDto.JSON_PROPERTY_DOCUMENT_RENDERER,
  ConvertFileRequestDto.JSON_PROPERTY_OUTPUTTYPE,
  ConvertFileRequestDto.JSON_PROPERTY_PASSWORD,
  ConvertFileRequestDto.JSON_PROPERTY_REGION,
  ConvertFileRequestDto.JSON_PROPERTY_THUMBNAIL,
  ConvertFileRequestDto.JSON_PROPERTY_SPREADSHEET_LAYOUT,
  ConvertFileRequestDto.JSON_PROPERTY_PDF
})

public class ConvertFileRequestDto {
  public static final String JSON_PROPERTY_FILE_ID = "fileId";
  @javax.annotation.Nonnull  private Integer fileId;

  public static final String JSON_PROPERTY_FOLDER_ID = "folderId";
  @javax.annotation.Nullable  private JsonNullable<Integer> folderId = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_CODE_PAGE = "codePage";
  @javax.annotation.Nullable  private JsonNullable<Integer> codePage = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_DELIMITER = "delimiter";
  @javax.annotation.Nullable  private JsonNullable<Integer> delimiter = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_DOCUMENT_LAYOUT = "documentLayout";
  @javax.annotation.Nullable  private ConvertDocumentLayoutRequest documentLayout;

  public static final String JSON_PROPERTY_DOCUMENT_RENDERER = "documentRenderer";
  @javax.annotation.Nullable  private ConvertDocumentRendererRequest documentRenderer;

  public static final String JSON_PROPERTY_OUTPUTTYPE = "outputtype";
  @javax.annotation.Nullable  private String outputtype;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  @javax.annotation.Nullable  private JsonNullable<String> password = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_REGION = "region";
  @javax.annotation.Nullable  private JsonNullable<String> region = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_THUMBNAIL = "thumbnail";
  @javax.annotation.Nullable  private ConvertThumbnailRequest thumbnail;

  public static final String JSON_PROPERTY_SPREADSHEET_LAYOUT = "spreadsheetLayout";
  @javax.annotation.Nullable  private ConvertSpreadsheetLayoutRequest spreadsheetLayout;

  public static final String JSON_PROPERTY_PDF = "pdf";
  @javax.annotation.Nullable  private ConvertPdfRequest pdf;

  public ConvertFileRequestDto() {
  }


  public ConvertFileRequestDto fileId(@javax.annotation.Nonnull Integer fileId) {
    
    this.fileId = fileId;
    return this;
  }

  /**
   * The id of the portal file to convert, as reported by a folder listing such as `GET api/2.0/files/{folderId}`.
   * @return fileId
   */
  @javax.annotation.Nonnull  @JsonProperty(value = JSON_PROPERTY_FILE_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getFileId() {
    return fileId;
  }


  @JsonProperty(value = JSON_PROPERTY_FILE_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFileId(@javax.annotation.Nonnull Integer fileId) {
    this.fileId = fileId;
  }

  public ConvertFileRequestDto folderId(@javax.annotation.Nullable Integer folderId) {
    this.folderId = JsonNullable.<Integer>of(folderId);
    
    return this;
  }

  /**
   * The id of the folder to save the converted file in, as reported by a folder listing such as  `GET api/2.0/files/{folderId}`.
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

  public ConvertFileRequestDto codePage(@javax.annotation.Nullable Integer codePage) {
    this.codePage = JsonNullable.<Integer>of(codePage);
    
    return this;
  }

  /**
   * The encoding of a csv or txt source, as a code page number: 1251 for Cyrillic, 65001 for UTF-8, and so on.  Leaving it out lets the document service guess, which garbles non-latin text.
   * @return codePage
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Integer getCodePage() {
        return codePage.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_CODE_PAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Integer> getCodePage_JsonNullable() {
    return codePage;
  }
  
  @JsonProperty(JSON_PROPERTY_CODE_PAGE)
  public void setCodePage_JsonNullable(JsonNullable<Integer> codePage) {
    this.codePage = codePage;
  }

  public void setCodePage(@javax.annotation.Nullable Integer codePage) {
    this.codePage = JsonNullable.<Integer>of(codePage);
  }

  public ConvertFileRequestDto delimiter(@javax.annotation.Nullable Integer delimiter) {
    this.delimiter = JsonNullable.<Integer>of(delimiter);
    
    return this;
  }

  /**
   * The character separating the values of a csv source: 0 - none, 1 - tab, 2 - semicolon, 3 - colon, 4 - comma,  5 - space.
   * @return delimiter
   */
  @javax.annotation.Nullable  @JsonIgnore

  public Integer getDelimiter() {
        return delimiter.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_DELIMITER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Integer> getDelimiter_JsonNullable() {
    return delimiter;
  }
  
  @JsonProperty(JSON_PROPERTY_DELIMITER)
  public void setDelimiter_JsonNullable(JsonNullable<Integer> delimiter) {
    this.delimiter = delimiter;
  }

  public void setDelimiter(@javax.annotation.Nullable Integer delimiter) {
    this.delimiter = JsonNullable.<Integer>of(delimiter);
  }

  public ConvertFileRequestDto documentLayout(@javax.annotation.Nullable ConvertDocumentLayoutRequest documentLayout) {
    
    this.documentLayout = documentLayout;
    return this;
  }

  /**
   * The layout of forms printed as pdf documents or images.
   * @return documentLayout
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DOCUMENT_LAYOUT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConvertDocumentLayoutRequest getDocumentLayout() {
    return documentLayout;
  }


  @JsonProperty(value = JSON_PROPERTY_DOCUMENT_LAYOUT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocumentLayout(@javax.annotation.Nullable ConvertDocumentLayoutRequest documentLayout) {
    this.documentLayout = documentLayout;
  }

  public ConvertFileRequestDto documentRenderer(@javax.annotation.Nullable ConvertDocumentRendererRequest documentRenderer) {
    
    this.documentRenderer = documentRenderer;
    return this;
  }

  /**
   * How the text of a pdf, xps or oxps source is read back.
   * @return documentRenderer
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_DOCUMENT_RENDERER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConvertDocumentRendererRequest getDocumentRenderer() {
    return documentRenderer;
  }


  @JsonProperty(value = JSON_PROPERTY_DOCUMENT_RENDERER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocumentRenderer(@javax.annotation.Nullable ConvertDocumentRendererRequest documentRenderer) {
    this.documentRenderer = documentRenderer;
  }

  public ConvertFileRequestDto outputtype(@javax.annotation.Nullable String outputtype) {
    
    this.outputtype = outputtype;
    return this;
  }

  /**
   * The extension of the format to convert to, without the dot. The formats a source can become are listed under  `extsConvertible` in `GET api/2.0/files/settings`, keyed by the source extension, both with a leading dot there.
   * @return outputtype
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_OUTPUTTYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOutputtype() {
    return outputtype;
  }


  @JsonProperty(value = JSON_PROPERTY_OUTPUTTYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOutputtype(@javax.annotation.Nullable String outputtype) {
    this.outputtype = outputtype;
  }

  public ConvertFileRequestDto password(@javax.annotation.Nullable String password) {
    this.password = JsonNullable.<String>of(password);
    
    return this;
  }

  /**
   * The password of the source document, for a document that is protected with one.
   * @return password
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getPassword() {
        return password.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_PASSWORD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getPassword_JsonNullable() {
    return password;
  }
  
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  public void setPassword_JsonNullable(JsonNullable<String> password) {
    this.password = password;
  }

  public void setPassword(@javax.annotation.Nullable String password) {
    this.password = JsonNullable.<String>of(password);
  }

  public ConvertFileRequestDto region(@javax.annotation.Nullable String region) {
    this.region = JsonNullable.<String>of(region);
    
    return this;
  }

  /**
   * The culture code whose currency, date and time formats a spreadsheet converted to PDF is shown in.
   * @return region
   */
  @javax.annotation.Nullable  @JsonIgnore

  public String getRegion() {
        return region.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_REGION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getRegion_JsonNullable() {
    return region;
  }
  
  @JsonProperty(JSON_PROPERTY_REGION)
  public void setRegion_JsonNullable(JsonNullable<String> region) {
    this.region = region;
  }

  public void setRegion(@javax.annotation.Nullable String region) {
    this.region = JsonNullable.<String>of(region);
  }

  public ConvertFileRequestDto thumbnail(@javax.annotation.Nullable ConvertThumbnailRequest thumbnail) {
    
    this.thumbnail = thumbnail;
    return this;
  }

  /**
   * How a thumbnail is fitted, when the target format is an image.
   * @return thumbnail
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_THUMBNAIL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConvertThumbnailRequest getThumbnail() {
    return thumbnail;
  }


  @JsonProperty(value = JSON_PROPERTY_THUMBNAIL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThumbnail(@javax.annotation.Nullable ConvertThumbnailRequest thumbnail) {
    this.thumbnail = thumbnail;
  }

  public ConvertFileRequestDto spreadsheetLayout(@javax.annotation.Nullable ConvertSpreadsheetLayoutRequest spreadsheetLayout) {
    
    this.spreadsheetLayout = spreadsheetLayout;
    return this;
  }

  /**
   * How a spreadsheet is laid out on the page, when it is converted to PDF.
   * @return spreadsheetLayout
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_SPREADSHEET_LAYOUT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConvertSpreadsheetLayoutRequest getSpreadsheetLayout() {
    return spreadsheetLayout;
  }


  @JsonProperty(value = JSON_PROPERTY_SPREADSHEET_LAYOUT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpreadsheetLayout(@javax.annotation.Nullable ConvertSpreadsheetLayoutRequest spreadsheetLayout) {
    this.spreadsheetLayout = spreadsheetLayout;
  }

  public ConvertFileRequestDto pdf(@javax.annotation.Nullable ConvertPdfRequest pdf) {
    
    this.pdf = pdf;
    return this;
  }

  /**
   * The PDF settings, used when the target format is PDF.
   * @return pdf
   */
  @javax.annotation.Nullable  @JsonProperty(value = JSON_PROPERTY_PDF, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConvertPdfRequest getPdf() {
    return pdf;
  }


  @JsonProperty(value = JSON_PROPERTY_PDF, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPdf(@javax.annotation.Nullable ConvertPdfRequest pdf) {
    this.pdf = pdf;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConvertFileRequestDto convertFileRequestDto = (ConvertFileRequestDto) o;
    return Objects.equals(this.fileId, convertFileRequestDto.fileId) &&
        equalsNullable(this.folderId, convertFileRequestDto.folderId) &&
        equalsNullable(this.codePage, convertFileRequestDto.codePage) &&
        equalsNullable(this.delimiter, convertFileRequestDto.delimiter) &&
        Objects.equals(this.documentLayout, convertFileRequestDto.documentLayout) &&
        Objects.equals(this.documentRenderer, convertFileRequestDto.documentRenderer) &&
        Objects.equals(this.outputtype, convertFileRequestDto.outputtype) &&
        equalsNullable(this.password, convertFileRequestDto.password) &&
        equalsNullable(this.region, convertFileRequestDto.region) &&
        Objects.equals(this.thumbnail, convertFileRequestDto.thumbnail) &&
        Objects.equals(this.spreadsheetLayout, convertFileRequestDto.spreadsheetLayout) &&
        Objects.equals(this.pdf, convertFileRequestDto.pdf);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId, hashCodeNullable(folderId), hashCodeNullable(codePage), hashCodeNullable(delimiter), documentLayout, documentRenderer, outputtype, hashCodeNullable(password), hashCodeNullable(region), thumbnail, spreadsheetLayout, pdf);
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
    sb.append("class ConvertFileRequestDto {\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    codePage: ").append(toIndentedString(codePage)).append("\n");
    sb.append("    delimiter: ").append(toIndentedString(delimiter)).append("\n");
    sb.append("    documentLayout: ").append(toIndentedString(documentLayout)).append("\n");
    sb.append("    documentRenderer: ").append(toIndentedString(documentRenderer)).append("\n");
    sb.append("    outputtype: ").append(toIndentedString(outputtype)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    spreadsheetLayout: ").append(toIndentedString(spreadsheetLayout)).append("\n");
    sb.append("    pdf: ").append(toIndentedString(pdf)).append("\n");
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

    // add `fileId` to the URL query string
    if (getFileId() != null) {
      try {
        joiner.add(String.format("%sfileId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFileId()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `codePage` to the URL query string
    if (getCodePage() != null) {
      try {
        joiner.add(String.format("%scodePage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCodePage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `delimiter` to the URL query string
    if (getDelimiter() != null) {
      try {
        joiner.add(String.format("%sdelimiter%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDelimiter()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `documentLayout` to the URL query string
    if (getDocumentLayout() != null) {
      joiner.add(getDocumentLayout().toUrlQueryString(prefix + "documentLayout" + suffix));
    }

    // add `documentRenderer` to the URL query string
    if (getDocumentRenderer() != null) {
      joiner.add(getDocumentRenderer().toUrlQueryString(prefix + "documentRenderer" + suffix));
    }

    // add `outputtype` to the URL query string
    if (getOutputtype() != null) {
      try {
        joiner.add(String.format("%soutputtype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOutputtype()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `password` to the URL query string
    if (getPassword() != null) {
      try {
        joiner.add(String.format("%spassword%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPassword()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `region` to the URL query string
    if (getRegion() != null) {
      try {
        joiner.add(String.format("%sregion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRegion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `thumbnail` to the URL query string
    if (getThumbnail() != null) {
      joiner.add(getThumbnail().toUrlQueryString(prefix + "thumbnail" + suffix));
    }

    // add `spreadsheetLayout` to the URL query string
    if (getSpreadsheetLayout() != null) {
      joiner.add(getSpreadsheetLayout().toUrlQueryString(prefix + "spreadsheetLayout" + suffix));
    }

    // add `pdf` to the URL query string
    if (getPdf() != null) {
      joiner.add(getPdf().toUrlQueryString(prefix + "pdf" + suffix));
    }

    return joiner.toString();
  }

}

