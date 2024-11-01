package com.adv.payroll.entity;

import lombok.Data;
import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;
@Entity
@Table(name = "TaxRates")
@Data
public class TaxRates {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taxRateId;

    @Column(nullable = false)
    private Long locationId;

    private BigDecimal salaryRangeMin;
    private BigDecimal salaryRangeMax;
    private BigDecimal taxRatePercentage;
}
