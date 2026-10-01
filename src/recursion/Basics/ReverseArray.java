package recursion.Basics;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
//        reverse(arr, 0, n-1);
        reverse1(arr, 0, n);
    }
    public static void reverse(int[] arr, int i, int j) {
        if (i >= j) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        reverse(arr, i+1, j-1);
    }

    public static void reverse1(int[] arr, int i, int n) {
        if (i >= n/2) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;
        reverse1(arr, i+1, n);
    }
}
