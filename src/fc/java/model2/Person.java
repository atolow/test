package fc.java.model2;

public class Person extends Object{ //toString
    //멤버변수
    private String name;
    //멤버변수
    private int age;


    //기본생성자
    public Person(){}
    //생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
