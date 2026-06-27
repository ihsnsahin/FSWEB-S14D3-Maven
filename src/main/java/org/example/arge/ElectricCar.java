package org.example.arge;

public class ElectricCar extends CarSkeleton{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public ElectricCar(String name, String description) {
        super(name, description);
    }

    public String recharge() {
        return getClass().getSimpleName() + " is charging the battery. Current size: " + getBatterySize() + " kWh.";
    }

    @Override
    public String startEngine() {
        runEngine(this);
        System.out.println(getClass().getSimpleName());
        return getName() + "'s engine is starting";
    }

    @Override
    public String drive() {
        System.out.println(getClass().getSimpleName());
        return "run from Electric Car";
    }

    // Sadece bu sınıfa(child) ait bir metot;


}
