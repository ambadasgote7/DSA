package arrays.Easy;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {11,0,2,1,0,0,3,4,0,85,5};
        moveZeros(arr);
    }
    public static void moveZeros(int[] arr) {
        int i = -1;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == 0) {
                i = j;
                break;
            }
        }
        for (int j = i+1; j < arr.length; j++) {
            if (arr[j] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
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
