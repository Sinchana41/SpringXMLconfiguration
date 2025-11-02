package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        System.out.println("\n Exercise 1: Simple Bean ");
        Car simpleCar = (Car) context.getBean("simpleCar");
        simpleCar.start();

        System.out.println("\n Exercise 2: Constructor Injection");
        Car carConstructor = (Car) context.getBean("carConstructor");
        carConstructor.start();

        System.out.println("\n Exercise 3: Setter Injection");
        Car carSetter = (Car) context.getBean("carSetter");
        carSetter.start();

        System.out.println("\n Exercise 4: Collection Injection ");
        Garage garage = (Garage) context.getBean("garage");
        garage.showCars();

        System.out.println("\n Exercise 5: Autowiring");
        Car carAuto = (Car) context.getBean("carAuto");
        carAuto.start();

        System.out.println("\n Exercise 7: Bean Lifecycle ");
        Car carLifecycle = (Car) context.getBean("carLifecycle");
        carLifecycle.start();

        System.out.println("\nExercise 8: Scope of Beans ");
        Car carA = (Car) context.getBean("carPrototype");
        Car carB = (Car) context.getBean("carPrototype");
        System.out.println("carA == carB  " + (carA == carB));

        context.close();
    }
}
