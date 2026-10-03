package sorting.Basics;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = {5,9,63,4,50,6};
        int n = arr.length;
//        for (int i = 0; i < n; i++) {
//            int j = i;
//            while (j > 0 && arr[j]<arr[j-1]) {
//                int temp = arr[j-1];
//                arr[j-1] = arr[j];
//                arr[j] = temp;
//                j--;
//            }
//        }
//        for (int i = 1; i < n; i++) {
//            for (int j = i; j > 0; j--) {
//                if (arr[j] < arr[j-1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j-1];
//                    arr[j-1] = temp;
//                } else {
//                    break;
//                }
//            }
//        }
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0 && arr[j] < arr[j-1]; j--) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
