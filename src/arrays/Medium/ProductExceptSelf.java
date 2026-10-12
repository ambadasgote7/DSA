package arrays.Medium;

import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] ans = productExceptSelf(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] productExceptSelf(int[] arr) {
        // Method 3 -
        int n = arr.length;
        int[] preProd = new int[n];
        preProd[0] = 1;
        for (int i = 1; i < n; i++) {
            preProd[i] = preProd[i-1] * arr[i-1];
        }
        int sufProd = 1;
        for (int i = n-2; i >= 0; i--) {
            sufProd = sufProd * arr[i+1];
            preProd[i] *= sufProd;
        }
        return preProd;


//        // Method 2 -
//        int[] ans = new int[arr.length];
//        int prod = 1;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != 0) prod *= arr[i];
//        }
//        for (int i = 0; i < arr.length; i++) {
//            ans[i] = prod / arr[i];
//        }
//        return ans;

//        // Method 1 - Brute Force
//        int[] ans = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            int prod = 1;
//            for (int j = 0; j < arr.length; j++) {
//                if (i!=j) {
//                    prod *= arr[j];
//                }
//            }
//            ans[i] = prod;
//        }
//        return ans;
    }
}
