package org.example.arge;

public class GasPoweredCar extends CarSkeleton{
    private double avgKmPerLitre;
    private int cylinders;
    public GasPoweredCar(String name, String description,double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
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
        return "run from Gas Powered Car";
    }


}
