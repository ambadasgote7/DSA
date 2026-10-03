package sorting.Basics;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {13,24,46,52,20,9};
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIdx = i;
            for (int j = i; j < n; j++) {
                if (arr[j]<arr[minIdx]) minIdx = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
       }
       System.out.println(Arrays.toString(arr));
    }
}
