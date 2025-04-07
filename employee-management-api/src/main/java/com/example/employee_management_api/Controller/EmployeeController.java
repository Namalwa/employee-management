package com.example.employee_management_api.Controller;



import com.example.employee_management_api.Entity.Employee;
import com.example.employee_management_api.Service.EmployeeService;
import org.springframework.web.bind.annotation.*;
import java.util.List;






@RestController

@RequestMapping("/employees")

public class EmployeeController {
    private final EmployeeService service;
    public EmployeeController(EmployeeService service){
        this.service=service;
    }
    @PostMapping public Employee createEmployee(@RequestBody Employee employee){
    return service.createEmployee(employee);
    }
    
    
    @GetMapping 
    public List<Employee>getAllEmployees(){
    return service.getAllEmployees();
    }


    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id){
    return service.getEmployeeById(id);
    }


   @PutMapping("/{id}")
   public Employee updateEmployee(@PathVariable int id, @RequestBody Employee updatedEmployee){
    return service.updateEmployee(id,updatedEmployee);
   }


   @DeleteMapping("/{id}")
   public String deleteEmployee(@PathVariable int id){
    service.deleteEmployee(id);
    return "Employee with ID "+id+" has been deleted successfully.";
   }
    
}