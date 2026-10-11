package LinearDS.HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Basics {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(30);
        set.add(-8);
        set.add(50);
        System.out.println(set);
        System.out.println(set.contains(50));
        System.out.println(set.size());
        set.remove(50);
        System.out.println(set.size());
        Object[] arr = set.toArray();
        System.out.println(Arrays.toString(arr));
    }
}
