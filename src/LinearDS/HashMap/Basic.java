package LinearDS.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Basic {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Ambadas", 9);
        map.put("Babusha", 37);
        map.put("Ag", 20);
        map.put("MS", 9);
        System.out.println(map);
        System.out.println(map.containsKey("Ag"));
        System.out.println(map.containsValue(9));
        map.remove("MS");
        System.out.println(map);
        System.out.println(map.get("Ag"));
    }
}
