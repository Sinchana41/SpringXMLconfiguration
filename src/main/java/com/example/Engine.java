package com.example;

public class Engine {
    private String type;
    private int horsepower;

    public Engine() {
    }

    public Engine(String type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public void start() {
        System.out.println("Engine [" + type + "] with " + horsepower + " HP started...");
    }

    @Override
    public String toString() {
        return "Engine{" + "type='" + type + '\'' + ", horsepower=" + horsepower + '}';
    }
}
