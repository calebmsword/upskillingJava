package com.revature.exception;

import org.springframework.http.HttpStatus;

import java.util.Date;

public class ErrorMessage {
    Date date;
    int code;
    String status;
    String message;

    public ErrorMessage() {
        super();
        date = new Date();
    }

    public ErrorMessage(HttpStatus status, String message) {
        this.code = status.value();
        this.status = status.name();
        this.message = message;
        this.date = new Date();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
