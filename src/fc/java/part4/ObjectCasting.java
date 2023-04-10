package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class ObjectCasting {
    public static void main(String[] args) {
        Animal ani=new Dog();
        ani.eat();

        ani=new Cat();
        ani.eat();

        //Cat c=(Cat)ani;
        //c.night();

        ((Cat)ani).night();
    }


}
