package LinearDS.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Iterate {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Ambadas", 9);
        map.put("Babusha", 37);
        map.put("Ag", 20);
        map.put("MS", 9);
        for (String key : map.keySet()) {
            System.out.print(key + "-" + map.get(key)+ ", ");
        }
        System.out.println();
        for (int val : map.values()) {
            System.out.print(val + ",");
        }
        System.out.println();
        for (Object pair : map.entrySet()) {
            System.out.println(pair);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
