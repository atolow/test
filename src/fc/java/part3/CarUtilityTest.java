package fc.java.part3;

import fc.java.model.CarDTO;
import fc.java.model.CarUtility;

import java.util.Scanner;

public class CarUtilityTest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        CarDTO car=new CarDTO();
        car.carSn=1110;
        car.carName="BMW828il";
        car.carPrice=90000000;
        car.carOwner="홍길동";
        car.carYear=2015;
        car.carType="G";
        CarUtility carUtil=new CarUtility();
        carUtil.carPrint(car);

        System.out.println("자동차일년번호:");
        car.carSn=scan.nextInt();
        scan.nextLine();

        System.out.println("자동차이름:");
        car.carName=scan.nextLine();

        System.out.println("자동차가격:");
        car.carPrice=scan.nextInt();

        scan.nextLine();


        System.out.println("자동차소유자:");
        car.carOwner=scan.nextLine();


        System.out.println("자동차년식");
        car.carYear=scan.nextInt();

        scan.nextLine();

        System.out.println("자동차타입");
        car.carType=scan.nextLine();

        carUtil.carPrint(car);
    }
}
