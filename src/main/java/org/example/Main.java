package org.example;

import org.example.company.*;
import org.example.arge.*;

public class Main {
    public static void main(String[] args) {
        // Pacific Car Company — INPUT’a birebir
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Car ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Car holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

        System.out.println("---- Car R&D Company ----");

        // Car R&D Company — polymorphic testler
        CarSkeleton gas = new GasPoweredCar("Ranger", "Mid-size pickup", 12.3, 6);
        CarSkeleton ev  = new ElectricCar("Volt", "Compact EV", 420.0, 75);
        CarSkeleton hyb = new HybridCar("Prius", "Liftback hybrid", 25.0, 8);

        CarSkeleton[] fleet = { gas, ev, hyb };
        for (CarSkeleton c : fleet) {
            System.out.println("Type: " + c.getClass().getSimpleName());
            c.startEngine();
            c.drive(); // drive içinde runEngine çağrılır
            System.out.println();
        }
    }
}