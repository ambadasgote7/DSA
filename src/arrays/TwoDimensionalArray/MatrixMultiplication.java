package arrays.TwoDimensionalArray;

public class MatrixMultiplication {
    static void printArr(int[][] arr) {
        for (int[] a : arr) {
            for (int ele : a) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] brr = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };
        int[][] crr = new int[arr.length][brr[0].length];

        if (arr[0].length != brr.length) {
            System.out.println("Multiplication Not Possible");
        } else {
            for(int i = 0; i < crr.length; i++) {
                for (int j = 0; j < crr[0].length; j++) {
                    for (int k = 0; k < arr.length; k++) {
                        crr[i][j] += arr[i][k] * brr[k][j];
                    }
                }
            }
        }
        printArr(crr);
    }
}
