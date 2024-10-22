package temp;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("wow", 10);
        map.put("kim", 20);

        String test = String.valueOf(map.get("wow"));
        System.out.println(test);

    }
}
