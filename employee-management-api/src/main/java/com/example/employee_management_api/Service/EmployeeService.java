package com.example.employee_management_api.Service;


import com.example.employee_management_api.Exception.EmployeeException;
import com.example.employee_management_api.Entity.Employee;
import com.example.employee_management_api.Repository.EmployeeRepo;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepo repository;
    public EmployeeService(EmployeeRepo repository) {
        this.repository = repository;
    }


    public Employee createEmployee(Employee employee) {
        return repository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }
    
    
    public Employee getEmployeeById(Integer id) {
        return repository.findById(id).orElseThrow(()-> new EmployeeException(id));
    }


    public  Employee  updateEmployee(Integer id, Employee  updated) {
        Employee employee=getEmployeeById(id);
        employee.setName(updated.getName());
        employee.setEmail(updated.getEmail());
        employee.setPosition(updated.getPosition());
        employee.setSalary(updated.getSalary());
        return repository.save(employee);
    }
    public void deleteEmployee(Integer id) {
        if(!repository.existsById(id)) {
            throw new EmployeeException(id);
        }
        repository.deleteById(id);
    }
}

