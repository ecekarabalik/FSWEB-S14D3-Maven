package org.example.company;

public class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        System.out.println(getClass().getSimpleName()); // Test log
        return getClass().getSimpleName() + ": Mitsubishi's engine is starting";
    }

    @Override
    public String accelerate() {
        System.out.println(getClass().getSimpleName()); // Test log
        return getClass().getSimpleName() + ": Mitsubishi is accelerating";
    }

    @Override
    public String brake() {
        System.out.println(getClass().getSimpleName()); // Test log
        return getClass().getSimpleName() + ": Mitsubishi is braking";
    }
}
