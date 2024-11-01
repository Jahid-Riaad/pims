package com.adv.payroll.controller;

import com.adv.payroll.entity.EmployeeDeductions;
import com.adv.payroll.service.EmployeeDeductionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee-deductions")
public class EmployeeDeductionsController {

    @Autowired
    private EmployeeDeductionsService employeeDeductionsService;

    @GetMapping
    public List<EmployeeDeductions> getAllEmployeeDeductions() {
        return employeeDeductionsService.getAllEmployeeDeductions();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDeductions> getEmployeeDeductionsById(@PathVariable Long id) {
        return employeeDeductionsService.getEmployeeDeductionsById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public EmployeeDeductions createEmployeeDeductions(@RequestBody EmployeeDeductions deductions) {
        return employeeDeductionsService.createEmployeeDeductions(deductions);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EmployeeDeductions> updateEmployeeDeductions(@PathVariable Long id, @RequestBody EmployeeDeductions deductions) {
        return ResponseEntity.ok(employeeDeductionsService.updateEmployeeDeductions(id, deductions));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployeeDeductions(@PathVariable Long id) {
        employeeDeductionsService.deleteEmployeeDeductions(id);
        return ResponseEntity.noContent().build();
    }
}
