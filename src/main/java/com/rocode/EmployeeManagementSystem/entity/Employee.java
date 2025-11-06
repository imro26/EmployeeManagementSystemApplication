package com.rocode.EmployeeManagementSystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String depertment;
    private double salary;
}
