package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ApiErrorDtoAdditionalInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ApiErrorDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-04T14:27:06.675010900+02:00[Europe/Madrid]", comments = "Generator version: 7.10.0")
public class ApiErrorDto implements Serializable {

  private static final long serialVersionUID = 1L;

  private String httpStatus;

  private String errorCode;

  private ApiErrorDtoAdditionalInfo additionalInfo;

  public ApiErrorDto() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ApiErrorDto(String errorCode) {
    this.errorCode = errorCode;
  }

  public ApiErrorDto httpStatus(String httpStatus) {
    this.httpStatus = httpStatus;
    return this;
  }

  /**
   * Get httpStatus
   * @return httpStatus
   */
  
  @Schema(name = "httpStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("httpStatus")
  public String getHttpStatus() {
    return httpStatus;
  }

  public void setHttpStatus(String httpStatus) {
    this.httpStatus = httpStatus;
  }

  public ApiErrorDto errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Get errorCode
   * @return errorCode
   */
  @NotNull 
  @Schema(name = "errorCode", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public ApiErrorDto additionalInfo(ApiErrorDtoAdditionalInfo additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Get additionalInfo
   * @return additionalInfo
   */
  @Valid 
  @Schema(name = "additionalInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("additionalInfo")
  public ApiErrorDtoAdditionalInfo getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(ApiErrorDtoAdditionalInfo additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiErrorDto apiErrorDto = (ApiErrorDto) o;
    return Objects.equals(this.httpStatus, apiErrorDto.httpStatus) &&
        Objects.equals(this.errorCode, apiErrorDto.errorCode) &&
        Objects.equals(this.additionalInfo, apiErrorDto.additionalInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpStatus, errorCode, additionalInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiErrorDto {\n");
    sb.append("    httpStatus: ").append(toIndentedString(httpStatus)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
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
}

