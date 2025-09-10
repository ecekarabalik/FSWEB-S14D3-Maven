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
        this.engine = true; // default
        this.wheels = 4;    // default
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{name='" + name + "', cylinders=" + cylinders + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cylinders, name);
    }

    public String startEngine() {
        System.out.println(getClass().getSimpleName());
        return getClass().getSimpleName() + ": the car's engine is starting";
    }

    public String accelerate() {
        System.out.println(getClass().getSimpleName());
        return getClass().getSimpleName() + ": the car is accelerating";
    }

    public String brake() {
        System.out.println(getClass().getSimpleName());
        return getClass().getSimpleName() + ": the car is braking";
    }
}
