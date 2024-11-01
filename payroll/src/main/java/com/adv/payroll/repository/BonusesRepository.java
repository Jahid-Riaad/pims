package com.adv.payroll.repository;

import com.adv.payroll.entity.Bonuses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BonusesRepository extends JpaRepository<Bonuses, Long> {
    List<Bonuses> findByEmployeeId(Long employeeId);
    List<Bonuses> findByBonusType(String bonusType); // e.g., "Performance"
}
