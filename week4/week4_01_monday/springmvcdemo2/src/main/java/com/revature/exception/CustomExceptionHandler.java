package com.revature.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(value = EmployeeNotFoundException.class)
    public ResponseEntity<ErrorMessage> meth1(EmployeeNotFoundException employeeNotFoundException) {
        HttpStatus status = HttpStatus.NOT_FOUND;
        String message = employeeNotFoundException.getMessage();
        ErrorMessage errorMessage = new ErrorMessage(status, message);
        return new ResponseEntity<ErrorMessage>(errorMessage, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<ErrorMessage> meth2(Exception exception) {
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
        String message= exception.getMessage();
        ErrorMessage errorMessage = new ErrorMessage(status, message);
        return new ResponseEntity<ErrorMessage>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
