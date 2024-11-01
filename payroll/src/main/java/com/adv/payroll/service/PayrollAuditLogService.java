package com.adv.payroll.service;

import com.adv.payroll.entity.PayrollAuditLog;
import com.adv.payroll.repository.PayrollAuditLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PayrollAuditLogService {

    @Autowired
    private PayrollAuditLogRepository payrollAuditLogRepository;

    public List<PayrollAuditLog> getAllPayrollAuditLogs() {
        return payrollAuditLogRepository.findAll();
    }

    public Optional<PayrollAuditLog> getPayrollAuditLogById(Long id) {
        return payrollAuditLogRepository.findById(id);
    }

    public PayrollAuditLog createPayrollAuditLog(PayrollAuditLog payrollAuditLog) {
        return payrollAuditLogRepository.save(payrollAuditLog);
    }

    public PayrollAuditLog updatePayrollAuditLog(Long id, PayrollAuditLog updatedAuditLog) {
        updatedAuditLog.setAuditLogId(id);
        return payrollAuditLogRepository.save(updatedAuditLog);
    }

    public void deletePayrollAuditLog(Long id) {
        payrollAuditLogRepository.deleteById(id);
    }
}
