package com.adv.payroll.repository;

import com.adv.payroll.entity.TaxRates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface TaxRatesRepository extends JpaRepository<TaxRates, Long> {
    List<TaxRates> findByLocationId(Long locationId);
    List<TaxRates> findBySalaryRangeMinLessThanEqualAndSalaryRangeMaxGreaterThanEqual(
            BigDecimal minSalary, BigDecimal maxSalary);
}
