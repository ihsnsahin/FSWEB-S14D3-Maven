import org.example.arge.CarSkeleton;
import org.example.arge.ElectricCar;
import org.example.arge.GasPoweredCar;
import org.example.arge.HybridCar;
import org.example.company.Car;
import org.example.company.Ford;
import org.example.company.Holden;
import org.example.company.Mitsubishi;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
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

        CarSkeleton carSkeleton = new CarSkeleton("Base car", "Generic Vehicle Description");
        System.out.println(carSkeleton.startEngine());
        System.out.println(carSkeleton.drive());

        CarSkeleton togg = new ElectricCar("TOGG T10X","Elektrikli araç", 523.0, 88 );
        System.out.println(togg.startEngine());
        System.out.println(togg.drive());
        System.out.println(((ElectricCar)togg).recharge());

        CarSkeleton hybridCar = new HybridCar("Toyota Prius", "Hybrid Engine", 4.2, 50, 4);
        System.out.println(hybridCar.startEngine());
        System.out.println(hybridCar.drive());

        CarSkeleton gasCar = new GasPoweredCar("Passat", "Petrol Engine", 7.5, 4);
        System.out.println(gasCar.startEngine());
        System.out.println(gasCar.drive());
    }
}