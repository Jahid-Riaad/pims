package com.adv.payroll.repository;

import com.adv.payroll.entity.Payroll;
import com.adv.payroll.entity.PayrollAuditLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PayrollAuditLogRepository extends JpaRepository<PayrollAuditLog, Long> {
    List<PayrollAuditLog> findByPayroll_PayrollId(Long payrollId);
    List<PayrollAuditLog> findByEventType(String eventType); // e.g., "Calculation", "Adjustment"
    List<PayrollAuditLog> findByPayroll(Payroll payroll);
}
