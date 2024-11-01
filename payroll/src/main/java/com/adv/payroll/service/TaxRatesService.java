package com.adv.payroll.service;

import com.adv.payroll.entity.TaxRates;
import com.adv.payroll.repository.TaxRatesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TaxRatesService {

    @Autowired
    private TaxRatesRepository taxRatesRepository;

    public List<TaxRates> getAllTaxRates() {
        return taxRatesRepository.findAll();
    }

    public Optional<TaxRates> getTaxRateById(Long id) {
        return taxRatesRepository.findById(id);
    }

    public TaxRates createTaxRate(TaxRates taxRate) {
        return taxRatesRepository.save(taxRate);
    }

    public TaxRates updateTaxRate(Long id, TaxRates updatedTaxRate) {
        updatedTaxRate.setTaxRateId(id);
        return taxRatesRepository.save(updatedTaxRate);
    }

    public void deleteTaxRate(Long id) {
        taxRatesRepository.deleteById(id);
    }
}
