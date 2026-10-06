package arrays.Easy;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotateArrayByDPlaceLeft(arr, 2);
    }
    public static void rotateArrayByOnePlaceLeft(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i-1];
            arr[i-1] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void rotateArrayByDPlaceLeft(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr, int i, int j) {
        while (i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }
    }
}
