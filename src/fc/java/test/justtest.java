package fc.java.test;

public class justtest {
    private String a;

    public justtest(String a) {
        this.a="wow";
    }

    public static void main(String[] args) {
        System.out.println("야~~~~~~~~~라이".repeat(10));
        justtest wow= new justtest("kim");
        tim(wow);
        System.out.println("a = "+wow.a);
    }

    public static void tim(justtest len){
        len.a="men";
        System.out.println("len = "+len.a);

    }

}
