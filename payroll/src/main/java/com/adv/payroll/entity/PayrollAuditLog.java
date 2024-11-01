package com.adv.payroll.entity;

import lombok.Data;
import jakarta.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "PayrollAuditLog")
@Data
public class PayrollAuditLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long auditLogId;

    @ManyToOne
    @JoinColumn(name = "payroll_id", nullable = false)
    private Payroll payroll;

    private LocalDate eventDate;
    private String eventType; // e.g., "Calculation", "Adjustment", "Approval"
    private String eventDetails;

}
