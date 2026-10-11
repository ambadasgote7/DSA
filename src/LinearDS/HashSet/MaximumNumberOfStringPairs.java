package LinearDS.HashSet;

import java.util.HashSet;
import java.util.Set;

public class MaximumNumberOfStringPairs {
    public static void main(String[] args) {
        String[] arr = {"cd","ac","dc","ca","zz", "ca"};
        System.out.println(maximumNumberOfStringPairs(arr));
    }
    public static int maximumNumberOfStringPairs(String[] arr) {
        Set<String> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            String rev = reverse(arr[i]);
            if (set.contains(rev)) {
                count++;
                set.remove(rev);
            } else set.add(arr[i]);
        }
        return count;
    }
    static String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}
