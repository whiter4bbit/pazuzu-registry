package org.zalando.pazuzu.exception;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorDto {

    @JsonProperty("code")
    private String code;

    @JsonProperty("message")
    private String message;

    @JsonProperty("detailed_message")
    private String detailedMessage;

    public ErrorDto() {
    }

    public ErrorDto(Error error, String detailedMessage) {
        this.code = error.code;
        this.message = error.message;
        this.detailedMessage = detailedMessage;
    }

    public ErrorDto(Error error) {
        this(error, "");
    }

    public ErrorDto(ServiceException ex) {
        this(ex.getError(), ex.getMessage());
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetailedMessage() {
        return detailedMessage;
    }

    public void setDetailedMessage(String detailedMessage) {
        this.detailedMessage = detailedMessage;
    }
}
