package com.adv.payroll.repository;

import com.adv.payroll.entity.EmployeeDeductions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EmployeeDeductionsRepository extends JpaRepository<EmployeeDeductions, Long> {
    List<EmployeeDeductions> findByEmployeeId(Long employeeId);
    List<EmployeeDeductions> findByDeductionType(String deductionType); // e.g., "Health Insurance"
}
