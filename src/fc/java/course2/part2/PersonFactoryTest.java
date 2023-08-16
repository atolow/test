package fc.java.course2.part2;

import fc.java.model2.Person;
import fc.java.model2.PersonFactory;

public class PersonFactoryTest {
    public static void main(String[] args) {
        PersonFactory personFactroy= Person::new;
        Person person=personFactroy.create("홍길동",40);
        System.out.println(person);

        PersonFactory personFactory=new PersonFactory() {
            @Override
            public Person create(String name, int age) {
                return new Person(name,age);
            }
        };
        Person person2=personFactroy.create("나길동",30);
        System.out.println(person2);
    }
}
