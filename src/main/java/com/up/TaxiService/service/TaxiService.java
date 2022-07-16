package com.up.TaxiService.service;

import com.up.TaxiService.model.Taxi;
import com.up.TaxiService.repository.TaxiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaxiService {
    @Autowired
    private TaxiRepository taxiRepository;

    public TaxiService(TaxiRepository taxiRepository) {
        this.taxiRepository = taxiRepository;
    }

    public List<Taxi> findAll() {
        return taxiRepository.findAll();
    }
    public Taxi addNew(Taxi tx) {
        return taxiRepository.save(tx);
    }

    public Taxi update(Taxi tx) {
        return taxiRepository.save(tx);
    }

    public Optional<Taxi> findByTaxiId(Integer taxiId) {
        return taxiRepository.findByTaxiId(taxiId);
    }
}
