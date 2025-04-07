package com.example.employee_management_api.Exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice

public class GlobalExceptionHandler {

    @ExceptionHandler(EmployeeException.class)
    public ResponseEntity<String>handleNotFound(EmployeeException ex){
        return ResponseEntity.status(404).body(ex.getMessage());
    }

}
