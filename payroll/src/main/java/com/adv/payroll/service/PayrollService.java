package com.adv.payroll.service;

import com.adv.payroll.entity.Payroll;
import com.adv.payroll.repository.PayrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PayrollService {

    @Autowired
    private PayrollRepository payrollRepository;

    public List<Payroll> getAllPayrolls() {
        return payrollRepository.findAll();
    }

    public Optional<Payroll> getPayrollById(Long id) {
        return payrollRepository.findById(id);
    }

    public Payroll createPayroll(Payroll payroll) {
        return payrollRepository.save(payroll);
    }

    public Payroll updatePayroll(Long id, Payroll updatedPayroll) {
        updatedPayroll.setPayrollId(id);
        return payrollRepository.save(updatedPayroll);
    }

    public void deletePayroll(Long id) {
        payrollRepository.deleteById(id);
    }
}
