package LinearDS.HashSet;

import java.util.HashSet;
import java.util.Set;

public class Iterate {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(30);
        set.add(-8);
        set.add(50);
        for (int ele : set) {
            System.out.print(ele + " ");
        }
    }
}
