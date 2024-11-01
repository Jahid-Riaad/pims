package com.adv.payroll.entity;
import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;
@Entity
@Table(name = "Bonuses")
@Data
public class Bonuses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bonusId;

    @Column(nullable = false)
    private Long employeeId;

    private String bonusType; // e.g., "Performance", "Holiday"
    private BigDecimal amount;
    private LocalDate issuedDate;
}
