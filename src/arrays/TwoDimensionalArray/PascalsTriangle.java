package arrays.TwoDimensionalArray;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        int n = 4;
        for (int i = 0; i < n; i++) {
            List<Integer> l = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    l.add(1);
                } else {
                    l.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
                }
            }
            list.add(l);
        }
        System.out.println(list);
        
        
//        for (int i = 1; i <= n; i++) {
//            List<Integer> l = new ArrayList<>();
//            int a = 1;
//            for (int j = 1; j <= i; j++) {
//                l.add(a);
//                a = a * (i-j) / j;
//            }
//            list.add(l);
//        }
//        System.out.println(list);
    }
}
