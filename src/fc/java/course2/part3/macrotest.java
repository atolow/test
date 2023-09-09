package fc.java.course2.part3;

import fc.java.course2.part1.StringCompare;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class macrotest {
    public static void main(String[] args) {
        String url = "http://moonserver.co.kr/board/131";

        try {
            Document document = Jsoup.connect(url).get();

            Elements test = document.select("div.document_131_4");

            String wow=String.valueOf(test);
            wow.trim();
            System.out.println("wow= "+wow);

            System.out.println("test = " + test.text());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
