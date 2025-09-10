package org.example.arge;

public class HybridCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = 4; // tipik varsayılan; istersen ctor'a parametre ekleyebilirsin
    }

    public double getAvgKmPerLitre() { return avgKmPerLitre; }
    public int getBatterySize() { return batterySize; }
    public int getCylinders() { return cylinders; }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName()
                + ": waking both gasoline (" + cylinders + " cyl) and electric systems ("
                + batterySize + " kWh)");
    }

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName()
                + ": driving hybrid mode, ~" + avgKmPerLitre + " km/L + EV assist");
        runEngine();
    }

    @Override
    protected void runEngine() {
        System.out.println(getClass().getSimpleName() + ": switching between ICE and EV...");
    }
}
