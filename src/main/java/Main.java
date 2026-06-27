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

        // Upcasting;
        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");

        printResult(mitsubishi);

        Car ford = new Ford(6, "Ford Falcon");

        printResult(ford);

        Car holden = new Holden(6, "Holden Commodore");

        printResult(holden);

        System.out.println("******************************************");

        CarSkeleton togg = new ElectricCar("TOGG T10X","Elektrikli araç", 523.0, 88 );
        startCar(togg);

        CarSkeleton hybridCar = new HybridCar("Toyota Prius", "Hybrid Engine", 4.2, 50, 4);
        startCar(hybridCar);

        CarSkeleton gasCar = new GasPoweredCar("Passat", "Petrol Engine", 7.5, 4);
        startCar(gasCar);
    }
    public static void printResult(Car car) {
        System.out.println(car.startEngine());

        System.out.println(car.accelerate());

        System.out.println(car.brake());
    }
    public static void startCar(CarSkeleton carSkeleton) {
        System.out.println(carSkeleton.startEngine());
        System.out.println(carSkeleton.drive());
        if (carSkeleton instanceof ElectricCar) {
            System.out.println(((ElectricCar) carSkeleton).recharge());
        }
    }
}