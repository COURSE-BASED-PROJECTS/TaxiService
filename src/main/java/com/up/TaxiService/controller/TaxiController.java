package com.up.TaxiService.controller;

import com.up.TaxiService.model.Taxi;
import com.up.TaxiService.service.TaxiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/taxi")
public class TaxiController {
    @Autowired
    private TaxiService taxiService;

    public TaxiController(TaxiService taxiService) {
        this.taxiService = taxiService;
    }

    @GetMapping
    public ResponseEntity<List<Taxi>> getAllTaxi(){
        return new ResponseEntity<>(taxiService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Taxi>> getTaxiById(@PathVariable("id") Integer taxiId){
        return new ResponseEntity<>(taxiService.findByTaxiId(taxiId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Taxi> addNewTaxi(@RequestBody Taxi tx){
        return new ResponseEntity<>(taxiService.addNew(tx), HttpStatus.OK);
    }

    @PatchMapping
    public ResponseEntity<Taxi> updateTaxi(@RequestBody Taxi tx){
        return new ResponseEntity<>(taxiService.update(tx), HttpStatus.OK);
    }
}
