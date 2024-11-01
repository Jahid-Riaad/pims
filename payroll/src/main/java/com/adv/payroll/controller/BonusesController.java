package com.adv.payroll.controller;

import com.adv.payroll.entity.Bonuses;
import com.adv.payroll.service.BonusesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bonuses")
public class BonusesController {

    @Autowired
    private BonusesService bonusesService;

    @GetMapping
    public List<Bonuses> getAllBonuses() {
        return bonusesService.getAllBonuses();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bonuses> getBonusById(@PathVariable Long id) {
        return bonusesService.getBonusById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Bonuses createBonus(@RequestBody Bonuses bonus) {
        return bonusesService.createBonus(bonus);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Bonuses> updateBonus(@PathVariable Long id, @RequestBody Bonuses bonus) {
        return ResponseEntity.ok(bonusesService.updateBonus(id, bonus));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBonus(@PathVariable Long id) {
        bonusesService.deleteBonus(id);
        return ResponseEntity.noContent().build();
    }
}
