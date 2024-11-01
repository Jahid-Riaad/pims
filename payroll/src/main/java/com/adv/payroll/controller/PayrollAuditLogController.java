package com.adv.payroll.controller;

import com.adv.payroll.entity.PayrollAuditLog;
import com.adv.payroll.service.PayrollAuditLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/payroll-audit-logs")
public class PayrollAuditLogController {

    @Autowired
    private PayrollAuditLogService payrollAuditLogService;

    @GetMapping
    public List<PayrollAuditLog> getAllPayrollAuditLogs() {
        return payrollAuditLogService.getAllPayrollAuditLogs();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PayrollAuditLog> getPayrollAuditLogById(@PathVariable Long id) {
        return payrollAuditLogService.getPayrollAuditLogById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public PayrollAuditLog createPayrollAuditLog(@RequestBody PayrollAuditLog auditLog) {
        return payrollAuditLogService.createPayrollAuditLog(auditLog);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PayrollAuditLog> updatePayrollAuditLog(@PathVariable Long id, @RequestBody PayrollAuditLog auditLog) {
        return ResponseEntity.ok(payrollAuditLogService.updatePayrollAuditLog(id, auditLog));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePayrollAuditLog(@PathVariable Long id) {
        payrollAuditLogService.deletePayrollAuditLog(id);
        return ResponseEntity.noContent().build();
    }
}
