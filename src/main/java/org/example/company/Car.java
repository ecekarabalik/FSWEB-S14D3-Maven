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
        this.engine = true;     // tüm arabalarda motor var
        this.wheels = 4;        // tüm arabalarda 4 teker
    }

    public int getCylinders() { return cylinders; }
    public String getName() { return name; }

    public String startEngine() {
        return getClass().getSimpleName() + ": the car's engine is starting";
    }

    public String accelerate() {
        return getClass().getSimpleName() + ": the car is accelerating";
    }

    public String brake() {
        return getClass().getSimpleName() + ": the car is braking";
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
        return cylinders == car.cylinders &&
                Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cylinders);
    }
}