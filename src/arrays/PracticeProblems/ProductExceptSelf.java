package arrays.PracticeProblems;

import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] prodArr = new int[arr.length];
        int rProd = 1, lProd = 1;
       for (int i = 0; i < arr.length; i++) {
           prodArr[i] = lProd;
           lProd *= arr[i];
       }

       for (int i = arr.length-1; i >= 0; i--) {
           prodArr[i] *= rProd;
           rProd *= arr[i];
       }

//        for (int i = 0; i < arr.length; i++) {
//            int prd = 1;
//            for (int j = 0; j < arr.length; j++) {
//                if (j != i) prd *= arr[j];
//            }
//            prodArr[i] = prd;
//        }
        System.out.println(Arrays.toString(prodArr));
    }
}
