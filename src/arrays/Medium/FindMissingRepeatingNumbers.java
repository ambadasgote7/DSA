package arrays.Medium;

import java.util.Arrays;

public class FindMissingRepeatingNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 7, 5, 7};
        int[] ans = findMissingRepeatingNumbers(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] findMissingRepeatingNumbers(int[] arr) {
       //  Method 3 - Maths Time Complexity: O(n), Space Complexity: O(1)
        long n = arr.length;
        long actualSum = 0;
        long actualSquareSum = 0;

        for (long num : arr) {
            actualSum += num;
            actualSquareSum +=  num * num;
        }

        long expectedSum = n * (n+1) / 2;
        long expectedSquareSum = n * (n+1) * (2*n+1) / 6;
        long difference = actualSum - expectedSum;
        long sum = (actualSquareSum - expectedSquareSum) / difference;

        long repeating = (difference + sum) / 2;
        long missing = repeating - difference;

        return new int[]{(int) repeating, (int) missing};

//        // Method 2 - Time Complexity: O(2 * n), Space Complexity: O(n)
//        int n = arr.length;
//        int[] freq = new int[n+1];
//        for (int i = 0; i < n; i++) {
//            freq[arr[i]]++;
//        }
//        int repeating = -1, missing = -1;
//        for (int i = 1; i < n+1; i++) {
//            if (freq[i] == 2) repeating = i;
//            if (freq[i] == 0) missing = i;
//            if (repeating != -1 && missing != -1) break;
//        }
//        return new int[]{repeating, missing};

//        // Method 1 - Time Complexity: O(n²), Space Complexity: O(1)
//        int n = arr.length;
//        int repeating = -1, missing = -1;
//        for (int i = 1; i <= n; i++) {
//            int count = 0;
//            for (int j = 0; j < n; j++) {
//                if (i == arr[j]) {
//                    count++;
//                }
//            }
//            if (count == 2) repeating = i;
//            if (count == 0) missing = i;
//            if (repeating != -1 && missing != -1) break;
//        }
//        return new int[]{repeating, missing};
    }
}
