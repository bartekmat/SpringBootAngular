package com.bartekmat.bikesystem.controllers;

import com.bartekmat.bikesystem.models.Bike;
import com.bartekmat.bikesystem.repositories.BikeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bikes")
public class BikesController {

    private BikeRepository bikeRepository;

    public BikesController(BikeRepository bikeRepository) {
        this.bikeRepository = bikeRepository;
    }

    @GetMapping
    public List<Bike> list(){
        return bikeRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Bike bike){
        bikeRepository.save(bike);
    }

    @GetMapping("/{id}")
    public Bike get(@PathVariable("id") Long id){
        return bikeRepository.findById(id).get();
    }
}
