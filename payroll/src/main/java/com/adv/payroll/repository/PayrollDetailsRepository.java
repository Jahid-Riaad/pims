package com.adv.payroll.repository;

import com.adv.payroll.entity.PayrollDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PayrollDetailsRepository extends JpaRepository<PayrollDetails, Long> {
    List<PayrollDetails> findByPayroll_PayrollId(Long payrollId);
    List<PayrollDetails> findByComponentType(String componentType); // e.g., "Base Salary", "Overtime"
}
