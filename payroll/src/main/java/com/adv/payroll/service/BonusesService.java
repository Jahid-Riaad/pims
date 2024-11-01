package com.adv.payroll.service;

import com.adv.payroll.entity.Bonuses;
import com.adv.payroll.repository.BonusesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BonusesService {

    @Autowired
    private BonusesRepository bonusesRepository;

    public List<Bonuses> getAllBonuses() {
        return bonusesRepository.findAll();
    }

    public Optional<Bonuses> getBonusById(Long id) {
        return bonusesRepository.findById(id);
    }

    public Bonuses createBonus(Bonuses bonus) {
        return bonusesRepository.save(bonus);
    }

    public Bonuses updateBonus(Long id, Bonuses updatedBonus) {
        updatedBonus.setBonusId(id);
        return bonusesRepository.save(updatedBonus);
    }

    public void deleteBonus(Long id) {
        bonusesRepository.deleteById(id);
    }
}
