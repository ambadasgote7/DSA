package arrays.TwoDimensionalArray;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix2 {
    static void printArr(int[][] arr) {
        for (int[] a : arr) {
            for (int ele : a) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        int n = 3, a = 1;
        int minR = 0, maxR = n-1;
        int minC = 0, maxC = n-1;
        int[][] arr = new int[n][n];
        while (minR <= maxR && minC <= maxC) {
            for (int j = minC; j <= maxC; j++) {
                arr[minR][j] = a++;
            }
            minR++;
            if (minR > maxR || minC > maxC) break;
            for (int i = minR; i <= maxR; i++) {
                arr[i][maxC] = a++;
            }
            maxC--;
            if (minR > maxR || minC > maxC) break;
            for(int j = maxC; j >= minC; j--) {
                arr[maxR][j] = a++;
            }
            maxR--;
            if (minR > maxR || minC > maxC) break;
            for (int i = maxR; i >= minR; i--) {
                arr[i][minC] = a++;
            }
            minC++;
            if (minR > maxR || minC > maxC) break;
        }
        printArr(arr);
    }
}
