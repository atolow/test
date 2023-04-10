package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class PolyArrayTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        // Dog, Cat 을 저장할 배열을 생성하시오

        //Animal[] ani={new Dog(), new Cat()};
        Animal[] ani = new Animal[2];

        ani[0] = d;
        ani[1] = c;
        display(ani);
    }
    public static void display(Animal[] ani){
        for(int i=0; i<ani.length;i++)
        {
            ani[i].eat();
            if(ani[i] instanceof Cat)
            {
                ((Cat)ani[i]).night();
            }
        }
    }
}
