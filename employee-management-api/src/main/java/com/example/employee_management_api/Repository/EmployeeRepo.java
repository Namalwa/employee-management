package com.example.employee_management_api.Repository;


import com.example.employee_management_api.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
    
}
