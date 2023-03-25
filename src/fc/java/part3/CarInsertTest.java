package src.fc.java.part3;

import src.fc.java.model.CarDAO;
import src.fc.java.model.CarDTO;

import java.util.Scanner;

public class CarInsertTest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("자동차일년번호:");
        int carSn=scan.nextInt();

        scan.nextLine();

        System.out.println("자동차이름:");
        String carName=scan.nextLine();


        System.out.println("자동차가격:");
        int carPrice=scan.nextInt();

        scan.nextLine();


        System.out.println("자동차소유자:");
        String carOwner=scan.nextLine();


        System.out.println("자동차년식");
        int carYear=scan.nextInt();

        scan.nextLine();

        System.out.println("자동차타입");
        String carType=scan.nextLine();



        CarDTO car=new CarDTO();
        car.carSn=carSn;
        car.carName=carName;
        car.carPrice=carPrice;
        car.carOwner=carOwner;
        car.carYear=carYear;
        car.carType=carType;

        CarDAO dao=new CarDAO();
        dao.carInsert(car);
    }
}
