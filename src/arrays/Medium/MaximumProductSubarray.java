package arrays.Medium;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] arr = {-2,0,-1};
        int ans = maxProduct(arr);
        System.out.println(ans);
    }

    public static int maxProduct(int[] arr) {
        // Method 4 -
        int n = arr.length;
        int maxProd = Integer.MIN_VALUE;
        int preProd = 1;
        int sufProd = 1;
        for (int i = 0; i < n; i++) {
            if (preProd == 0) preProd = 1;
            if (sufProd == 0) sufProd = 1;
            preProd *= arr[i];
            sufProd *= arr[n-i-1];
            maxProd = Math.max(maxProd, Math.max(preProd, sufProd));
        }
        return maxProd;

//        // Method 3 -
//        int n = arr.length;
//        int maxProd = arr[0];
//        int currProd = arr[0];
//        for (int i = 1; i < n; i++) {
//            currProd = Math.max(arr[i], arr[i]*currProd);
//            maxProd = Math.max(maxProd, currProd);
//        }
//        return maxProd;

//        // Method 2 - Better Time Complexity: O(N²), Space Complexity: O(1)
//        int maxProd = Integer.MIN_VALUE;
//        int n = arr.length;
//        for (int i = 0; i < n; i++) {
//            int prod = 1;
//            for (int j = i; j < n; j++) {
//                prod *= arr[j];
//                maxProd = Math.max(maxProd,prod);
//            }
//        }
//        return maxProd;

//        // Method 1 - Brute Force Time Complexity: O(N³), Space Complexity: O(1)
//        int maxProd = Integer.MIN_VALUE;
//        int n = arr.length;
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j < n; j++) {
//                int prod = 1;
//                for (int k = i; k < j; k++) {
//                    prod *= arr[k];
//                }
//                maxProd = Math.max(maxProd,prod);
//            }
//        }
//        return maxProd;
    }
}
