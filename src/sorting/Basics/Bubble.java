package sorting.Basics;

import java.util.*;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {14,9,15,12,6,8,13};
        int n = arr.length;
          boolean swap = false;
        for (int i = n-1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
                if (swap == false) break; 
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
