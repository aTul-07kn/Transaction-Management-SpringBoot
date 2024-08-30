package com.example.TransactionManagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employeedto {
    private String empName;
    private String email;
    private String departmentName;
}