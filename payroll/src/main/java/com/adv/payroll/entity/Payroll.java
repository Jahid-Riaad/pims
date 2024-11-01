package com.adv.payroll.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;

@Entity
@Table(name = "Payroll")
@Data
public class Payroll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payroll_Id")
    private Long payrollId;

    @Column(nullable = false)
    private Long employeeId;

    @Column(nullable = false)
    private String payPeriod; // e.g., "2024-10"

    private BigDecimal grossSalary;
    private BigDecimal taxDeduction;
    private BigDecimal otherDeductions;
    private BigDecimal netSalary;

    private String status; // e.g., "Pending", "Completed"
}