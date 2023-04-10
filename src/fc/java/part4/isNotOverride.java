package fc.java.part4;

import fc.java.poly.Animal;
import fc.java.poly.Cat;
import fc.java.poly.Dog;

public class isNotOverride {
    public static void main(String[] args) {
        // 재정의를 안했기 때문에 ->부모개 명렁을 내리면(메세지를 보내면) 오작동을 한다.
        //[다형성을 보ㅓ장하지 않음] -> 그러면 다형성을 보장할려면?(재정의를 강제로 하도록 만들어 주면 된다)
        //추상클래스, 인터페이스 등장
        Animal ani=new Dog();
        ani.eat();

        ani=new Cat();
        ani.eat();
    }
}
