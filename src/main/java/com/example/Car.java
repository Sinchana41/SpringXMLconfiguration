package com.example;

public class Car {
    private String model;
    private Engine engine;

    public Car() {
        System.out.println("Car object created");
    }

    // Constructor Injection
    public Car(Engine engine) {
        this.engine = engine;
    }

    // Setter Injection
    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println("Car model: " + model);
        engine.start();
    }

    // Lifecycle Methods
    public void init() {
        System.out.println("Car bean is initializing...");
    }

    public void destroy() {
        System.out.println("Car bean is being destroyed...");
    }
}
