package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String startEngine() {
        runEngine(this);
        System.out.println(getClass().getSimpleName());
        return getName() + "'s engine is starting";
    }
    public String drive() {
        System.out.println(getClass().getSimpleName());
        return  getName() + " is driving";
    }
    protected void runEngine(CarSkeleton carSkeleton) {
        if ( carSkeleton instanceof  ElectricCar) {
            ElectricCar electricCar = ((ElectricCar) carSkeleton);
            System.out.println("The car engine is starting with electric. Per charge: " + electricCar.getAvgKmPerCharge() + " battery size: " + electricCar.getBatterySize());
        } else if (carSkeleton instanceof  HybridCar) {
            HybridCar hybridCar = ((HybridCar) carSkeleton);
            System.out.println("The car engine is starting with hybrid. Per charge: " + hybridCar.getAvgKmPerLitre() + " battery size: " + hybridCar.getBatterySize() + "cylinders: " + hybridCar.getCylinders());
        } else if (carSkeleton instanceof  GasPoweredCar) {
           GasPoweredCar gasPoweredCar = ((GasPoweredCar) carSkeleton);
            System.out.println("The car engine is starting with hybrid. Per charge: " + gasPoweredCar.getAvgKmPerLitre() + " cylinders: " + gasPoweredCar.getCylinders());
        } else {
            System.out.println("Geçersiz araç tipi");
        }
    }

}
