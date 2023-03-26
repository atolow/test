package fc.java.model;

public class PersonVO {
    private String name;
    private int age;
    private String phone;

    public PersonVO(){
        this.name="홍길동";
        this.age=50;
        this.phone="010-1111-1111";
    }

    public PersonVO(String name, int age, String phone)
    {
        this.name=name;
        this.age=age;
        this.phone=phone;
    }
    public void setName(String name) {
        this.name=name;
    }
    public void setAge(int age) {
        this.age=age;
    }
    public void setPhone(String phone) {
        this.phone=phone;
    }

    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public String getPhone() {
        return this.phone;
    }
    public String toString(){
        return name+"\t"+age+"\t"+phone;
    }
}

