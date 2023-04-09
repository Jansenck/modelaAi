package com.cars.api.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;

import com.cars.api.dto.CarsDTO;
import com.cars.api.model.Car;
import com.cars.api.repository.CarRepository;

@RestController
@RequestMapping("/api/cars")
public class CarsController {

    @Autowired
    private CarRepository repository;

    @PostMapping
    public void create(@RequestBody CarsDTO req){
        repository.save(new Car(req));
    }
}