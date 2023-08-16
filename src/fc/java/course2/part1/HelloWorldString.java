package fc.java.course2.part1;

public class HelloWorldString {
    public static void main(String[] args) {
        String str1=new String("HelloWorld"); //Heap
        System.out.println(str1.toString());

        String str2="HelloWorld";  //Literal Pool;
        System.out.println(str2.toString());
    }
}
