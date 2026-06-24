package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

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
        runEngine();
        System.out.println(getClass().getSimpleName());
        return "the car's engine is starting";
    }
    public String drive() {
        System.out.println(getClass().getSimpleName());
        return "the car is driving";
    }
    protected void runEngine() {
        System.out.println(getClass().getSimpleName());
        System.out.println("Engine is running");
    }

}
