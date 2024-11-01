package com.adv.payroll.controller;

import com.adv.payroll.entity.TaxRates;
import com.adv.payroll.service.TaxRatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tax-rates")
public class TaxRatesController {

    @Autowired
    private TaxRatesService taxRatesService;

    @GetMapping
    public List<TaxRates> getAllTaxRates() {
        return taxRatesService.getAllTaxRates();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TaxRates> getTaxRateById(@PathVariable Long id) {
        return taxRatesService.getTaxRateById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public TaxRates createTaxRate(@RequestBody TaxRates taxRate) {
        return taxRatesService.createTaxRate(taxRate);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TaxRates> updateTaxRate(@PathVariable Long id, @RequestBody TaxRates taxRate) {
        return ResponseEntity.ok(taxRatesService.updateTaxRate(id, taxRate));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTaxRate(@PathVariable Long id) {
        taxRatesService.deleteTaxRate(id);
        return ResponseEntity.noContent().build();
    }
}
