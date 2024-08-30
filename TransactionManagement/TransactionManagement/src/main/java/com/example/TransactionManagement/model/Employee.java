package com.example.TransactionManagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employeeId;
    private String empName;
    private String email;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
}