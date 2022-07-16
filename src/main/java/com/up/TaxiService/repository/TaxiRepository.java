package com.up.TaxiService.repository;

import com.up.TaxiService.model.Taxi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TaxiRepository extends JpaRepository<Taxi, Integer> {
    Optional<Taxi> findByTaxiId(Integer taxiId);
}
