package src.fc.java.model;

public class CarUtility {
    public static void carPrint(CarDTO car){
        System.out.println(car.carSn+"\t"+ car.carName+"\t"+car.carPrice+"\t"+car.carOwner+"\t"+car.carYear+"\t"+car.carType);
    }
}
