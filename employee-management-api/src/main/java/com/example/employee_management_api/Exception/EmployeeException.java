package com.example.employee_management_api.Exception;

public class EmployeeException extends RuntimeException {
    public EmployeeException(Integer id) {
        super("Employee not found with ID:" + id);
    }
    
}
