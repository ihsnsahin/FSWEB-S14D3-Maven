package org.example.company;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine=true;
        this.wheels=4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String startEngine() {
        System.out.println(getClass().getSimpleName());
        return "the car's engine is starting";

    }
    public String accelerate() {
        System.out.println(getClass().getSimpleName());
        return "the car is accelerating";

    }
    public String brake() {
        System.out.println(getClass().getSimpleName());
        return "the car is braking";
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public boolean equals(Object car) {
        if (car instanceof Car) {
            return (((Car)car).equals(name)) && (((Car)car).cylinders == cylinders);
        } else {
            return false;
        }
    }
}
