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
        runEngine();
        System.out.println(getClass().getSimpleName());
        return super.getName() + "'s engine is starting";
    }

    @Override
    public String drive() {
        System.out.println(getClass().getSimpleName());
        return super.getName() + "is driving";
    }

    @Override
    protected void runEngine() {
        System.out.println(getClass().getSimpleName());
        System.out.println(super.getName() + " is running");
    }

}
