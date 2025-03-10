package com.example.TransactionManagement.controller;

import com.example.TransactionManagement.dto.Employeedto;
import com.example.TransactionManagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee")
    public String saveEmployee(@RequestBody Employeedto employeeDto){
        return employeeService.saveEmployee(employeeDto);
    }
}