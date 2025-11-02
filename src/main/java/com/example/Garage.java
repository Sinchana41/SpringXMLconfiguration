package com.example;

import java.util.List;

public class Garage {
    private List<Car> cars;

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public void showCars() {
        System.out.println("Garage contains:");
        for (Car c : cars) {
            System.out.println(" - " + c);
        }
    }
}
