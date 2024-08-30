package com.example.TransactionManagement.service;

import com.example.TransactionManagement.dto.Employeedto;
import com.example.TransactionManagement.model.Department;
import com.example.TransactionManagement.model.Employee;
import com.example.TransactionManagement.repository.DepartmentRepository;
import com.example.TransactionManagement.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Transactional
    public String saveEmployee(Employeedto employeeDto) {
        Department department = departmentRepository.findByDepartmentName(employeeDto.getDepartmentName())
                .orElseGet(() -> {
                    Department newDepartment = new Department();
                    newDepartment.setDepartmentName(employeeDto.getDepartmentName());
                    return departmentRepository.save(newDepartment);
                });

        Employee employee = null;
        employee.setEmpName(employeeDto.getEmpName());
        employee.setEmail(employeeDto.getEmail());
        employee.setDepartment(department);

        employeeRepository.save(employee);

        return "Employee is saved with Employee ID: " + employee.getEmployeeId();
    }
}
