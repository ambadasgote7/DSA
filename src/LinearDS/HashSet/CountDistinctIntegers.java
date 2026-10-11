package LinearDS.HashSet;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctIntegers {
    public static void main(String[] args) {
        int[] arr = {1,13,10,12,31};
        System.out.println(countDistinctIntegers(arr));
    }

    public static int countDistinctIntegers(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
            set.add(reverse(arr[i]));
        }
        return set.size();
    }
    static int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        return rev;
    }
}
