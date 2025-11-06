package com.rocode.EmployeeManagementSystem.controller;

import com.rocode.EmployeeManagementSystem.entity.Employee;
import com.rocode.EmployeeManagementSystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    //create
    @PostMapping
    public Employee createEmp(@RequestBody Employee employee){
        return service.saveEmployee(employee);
    }

    //Get
    @GetMapping
    public List<Employee> getEmp(){
        return service.getAllEmployees();
    }

    //Get emp by id
    @GetMapping("/{id}")
    public Employee getById(@PathVariable Long id){
        return service.getEmployeeById(id);
    }

    //update emp
    @PutMapping("/{id}")
    public Employee updateEmp(@PathVariable Long id, @RequestBody Employee employee){
        return  service.updateEmployee(id,employee);
    }

    //delete emp
    @DeleteMapping("/{id}")
    public String deleteEmp(@PathVariable Long id){
        service.deleteEmployee(id);
        return "Emp deleted success";
    }
}
