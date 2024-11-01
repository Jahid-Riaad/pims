package com.adv.payroll.service;

import com.adv.payroll.entity.PayrollDetails;
import com.adv.payroll.repository.PayrollDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PayrollDetailsService {

    @Autowired
    private PayrollDetailsRepository payrollDetailsRepository;

    public List<PayrollDetails> getAllPayrollDetails() {
        return payrollDetailsRepository.findAll();
    }

    public Optional<PayrollDetails> getPayrollDetailsById(Long id) {
        return payrollDetailsRepository.findById(id);
    }

    public PayrollDetails createPayrollDetails(PayrollDetails payrollDetails) {
        return payrollDetailsRepository.save(payrollDetails);
    }

    public PayrollDetails updatePayrollDetails(Long id, PayrollDetails updatedPayrollDetails) {
        updatedPayrollDetails.setPayrollDetailId(id);
        return payrollDetailsRepository.save(updatedPayrollDetails);
    }

    public void deletePayrollDetails(Long id) {
        payrollDetailsRepository.deleteById(id);
    }
}
