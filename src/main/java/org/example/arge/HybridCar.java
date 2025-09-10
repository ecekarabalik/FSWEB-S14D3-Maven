package org.example.arge;

public class HybridCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    // ✅ Testin beklediği 5 parametreli ctor
    public HybridCar(String name, String description,
                     double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    // (İstersen önceki 4 parametreli sürümü de overload olarak tutabilirsin)
    public HybridCar(String name, String description,
                     double avgKmPerLitre, int batterySize) {
        this(name, description, avgKmPerLitre, batterySize, 4);
    }

    public double getAvgKmPerLitre() { return avgKmPerLitre; }
    public int getBatterySize()      { return batterySize; }
    public int getCylinders()        { return cylinders; }

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
