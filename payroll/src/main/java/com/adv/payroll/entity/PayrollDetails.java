package com.adv.payroll.entity;
import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;
@Entity
@Table(name = "PayrollDetails")
@Data
public class PayrollDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long payrollDetailId;

    @ManyToOne
    @JoinColumn(name = "payroll_id", nullable = false)
    private Payroll payroll;

    private String componentType; // e.g., "Base Salary", "Overtime", "Bonus"
    private BigDecimal amount;
}
