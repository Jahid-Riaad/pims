package com.adv.payroll.entity;
import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;
@Entity
@Table(name = "EmployeeDeductions")
@Data
public class EmployeeDeductions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deductionId;

    @Column(nullable = false)
    private Long employeeId;

    private String deductionType; // e.g., "Health Insurance", "Loan Repayment"
    private BigDecimal amount;
    private LocalDate effectiveDate;
}
