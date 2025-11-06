package com.rocode.EmployeeManagementSystem.service;

import com.rocode.EmployeeManagementSystem.entity.Employee;
import com.rocode.EmployeeManagementSystem.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepo repo;

    @Override
    public Employee saveEmployee(Employee employee) {
        return repo.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return repo.findById(id).orElseThrow();
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {
        Employee emp = repo.findById(id).orElseThrow();
        if(emp != null){
            emp.setName(employee.getName());
            emp.setDepertment(employee.getDepertment());
            emp.setSalary(employee.getSalary());
            return repo.save(emp);
        }
        return null;
    }

    @Override
    public void deleteEmployee(Long id) {
        repo.deleteById(id);
    }
}
