package fc.java.part2;

public class BookExam {
    public static void main(String[] args) {
        Book b=new Book();

        b.title="자바";
        b.price=30000;
        b.company="패스트캠퍼스";
        b.autor="박매일";
        b.page=700;
        b.isbn="1199110";

        System.out.println(b.title + "\n" + b.price + "\n" + b.company + "\n" +  b.autor + "\n" +  b.autor + "\n" +   b.page + "\n" + b.isbn + "\n");
    }
}
