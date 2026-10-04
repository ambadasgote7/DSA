package sorting.Practice;

import java.util.ArrayList;
import java.util.List;

public class Dummy {
    public static void main(String[] args) {
        int n = 4;
       List<Integer> list = pascale(n);
        System.out.println(list);
    }
    static List<Integer> pascale(int n) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            List<Integer> l = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    l.add(1);
                } else {
                    l.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
                }
            }
            list.add(l);
        }
        return list.get(n);
    }
}