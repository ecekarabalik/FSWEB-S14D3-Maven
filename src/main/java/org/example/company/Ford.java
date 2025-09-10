package org.example.company;

public class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + ": Ford-specific engine start";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + ": Ford is accelerating";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + ": Ford is braking";
    }
}
