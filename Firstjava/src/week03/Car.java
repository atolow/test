package week03;


public class Car {
    //필드영역
    //
    String company;
    String model = "Gv80";
    String color;
    //
    double price;
    double speed;
    char gear;
    boolean lights =true;
    //
    Tire trie = new Tire();
    Door door = new Door();
    Handle handle = new Handle();

    //생성사 부분

    public Car() {
    }

    ///메서드 영역
    public double gasPedal(double kmh, char type){
        changeGear(type);
        speed=kmh;
        return speed;
    }
    public  double brakePedal(){
        speed=0;
        return speed;
    }
    public char changeGear(char type){
        gear = type;
        return gear;
    }
    public boolean onOffLights(){
        lights = !lights;
        return lights;
    }
    public void horn(){
        System.out.println("빵빵");
    }

    public void carSpeeds(double ... speeds){
        for(double v : speeds){
            System.out.println("v= " + v);
        }
    }
}
