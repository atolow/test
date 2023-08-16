package fc.java.kim;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);

        Car ferrari= new GasPoweredCar("2022 Blue Ferrari 296 GTS",154,6);
    }
    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }
}
