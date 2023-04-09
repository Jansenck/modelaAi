package com.cars.api.model;

import com.cars.api.dto.CarsDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Car {

    public Car(CarsDTO req){
        this.model = req.model();
        this.manufacturer = req.manufacturer();
        this.manufacturingDate = req.manufacturingDate();
        this.value = req.value();
        this.modelYear = req.modelYear();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 50, nullable = false)
    private String model;

    @Column(length = 50, nullable = false)
    private String manufacturer;

    @Column(length = 10, nullable = false)
    private String manufacturingDate;

    @Column(length = 12, nullable = false)
    private String value;

    @Column(length = 4, nullable = false)
    private String modelYear;
}
