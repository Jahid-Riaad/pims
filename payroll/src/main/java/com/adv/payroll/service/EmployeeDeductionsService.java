package com.adv.payroll.service;

import com.adv.payroll.entity.EmployeeDeductions;
import com.adv.payroll.repository.EmployeeDeductionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeDeductionsService {

    @Autowired
    private EmployeeDeductionsRepository employeeDeductionsRepository;

    public List<EmployeeDeductions> getAllEmployeeDeductions() {
        return employeeDeductionsRepository.findAll();
    }

    public Optional<EmployeeDeductions> getEmployeeDeductionsById(Long id) {
        return employeeDeductionsRepository.findById(id);
    }

    public EmployeeDeductions createEmployeeDeductions(EmployeeDeductions employeeDeductions) {
        return employeeDeductionsRepository.save(employeeDeductions);
    }

    public EmployeeDeductions updateEmployeeDeductions(Long id, EmployeeDeductions updatedDeductions) {
        updatedDeductions.setDeductionId(id);
        return employeeDeductionsRepository.save(updatedDeductions);
    }

    public void deleteEmployeeDeductions(Long id) {
        employeeDeductionsRepository.deleteById(id);
    }
}
