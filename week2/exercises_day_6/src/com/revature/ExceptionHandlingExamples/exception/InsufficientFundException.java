package com.revature.ExceptionHandlingExamples.exception;

public class InsufficientFundException extends Exception{
    public InsufficientFundException() {
        super();
    }

    public InsufficientFundException(String message) {
        super(message);
    }

    public InsufficientFundException(Throwable throwable) {
        super(throwable);
    }

    public InsufficientFundException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
