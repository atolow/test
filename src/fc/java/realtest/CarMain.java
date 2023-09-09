package fc.java.realtest;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);

        Car ferrari= new GasPoweredCar("2022 Blue Ferrari 296 GTS",154,6);
        runRace(ferrari);

        Car tesla = new ElectricCar("2022 Red Tesla Model3", 568,75);
        runRace(tesla);

        Car ferrariHybrid = new HybridCar("2022 Black Ferrai SF90 Stradale",16,8,8);
        runRace(ferrariHybrid);
    }
    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }
}
