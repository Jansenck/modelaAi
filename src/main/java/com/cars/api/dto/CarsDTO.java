package com.cars.api.dto;

public record CarsDTO(
    String model, 
    String manufacturer, 
    String manufacturingDate, 
    String value, 
    String modelYear) {
}