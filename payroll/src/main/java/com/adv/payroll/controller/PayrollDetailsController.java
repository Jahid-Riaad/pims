package com.adv.payroll.controller;

import com.adv.payroll.entity.PayrollDetails;
import com.adv.payroll.service.PayrollDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payroll-details")
public class PayrollDetailsController {

    @Autowired
    private PayrollDetailsService payrollDetailsService;

    @GetMapping
    public List<PayrollDetails> getAllPayrollDetails() {
        return payrollDetailsService.getAllPayrollDetails();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PayrollDetails> getPayrollDetailsById(@PathVariable Long id) {
        return payrollDetailsService.getPayrollDetailsById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public PayrollDetails createPayrollDetails(@RequestBody PayrollDetails payrollDetails) {
        return payrollDetailsService.createPayrollDetails(payrollDetails);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PayrollDetails> updatePayrollDetails(@PathVariable Long id, @RequestBody PayrollDetails payrollDetails) {
        return ResponseEntity.ok(payrollDetailsService.updatePayrollDetails(id, payrollDetails));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePayrollDetails(@PathVariable Long id) {
        payrollDetailsService.deletePayrollDetails(id);
        return ResponseEntity.noContent().build();
    }
}
