package collection;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        //Map= key : value 중요
        //key 값으로 유니크하게보장이 되야함
        //Map -> HashMap , TreeMap으로 응용

        Map<String, Integer> intMap = new HashMap<>();

        intMap.put("일",11);
        intMap.put("이",12);
        intMap.put("삼",13);
        intMap.put("삼",14);   //->마지막 "삼"으로 덮어쓰기했다
        intMap.put("오",15);


        for (String key : intMap.keySet()) {
            System.out.println("key = " + key);
        }

        for (Integer value : intMap.values()) {
            System.out.println("value = " + value);
        }

        System.out.println(intMap.get("오"));
    }
}
