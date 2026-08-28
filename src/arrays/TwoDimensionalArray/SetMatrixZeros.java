package arrays.TwoDimensionalArray;

import java.util.Arrays;

public class SetMatrixZeros {
    static void printArr(int[][] arr) {
        for (int[] a : arr) {
            for (int ele : a) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        int[][] arr = {
//                {1,1,1},
//                {1,0,1},
//                {1,1,1}
//        };
        int[][] arr = {
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };
        int m = arr.length, n = arr[0].length;
        boolean zeroRow = false;
        boolean zeroCol = false;

        for (int i = 0; i < m; i++) {
           if (arr[i][0] == 0) zeroCol = true;
        }
        for (int j = 0; j < n; j++) {
            if (arr[0][j] == 0) zeroRow = true;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[i][j] == 0) {
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < m; i++) {
            if (arr[i][0] == 0) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = 0;
                }
            }
        }

        for (int j = 1; j < n; j++) {
            if (arr[0][j] == 0) {
                for (int i = 0; i < m; i++) {
                    arr[i][j] = 0;
                }
            }
        }

        if (zeroRow) {
            for (int j = 0; j < n; j++) {
                arr[0][j] = 0;
            }
        }

        if (zeroCol) {
            for (int i = 0; i < m; i++) {
                arr[i][0] = 0;
            }
        }
        printArr(arr);


























    /// Method 2 - Using m+n space
//        boolean[] row = new boolean[m];
//        boolean[] col = new boolean[n];
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (arr[i][j] == 0) {
//                    row[i] = true;
//                    col[j] = true;
//                }
//            }
//        }
//
//        for (int i = 0; i < m; i++) {
//            if (row[i]) {
//                for (int j = 0; j < n; j++) {
//                    arr[i][j] = 0;
//                }
//            }
//        }
//
//        for (int j = 0; j < n; j++) {
//            if (col[j]) {
//                for (int i = 0; i < m; i++) {
//                    arr[i][j] = 0;
//                }
//            }
//        }
//
//        printArr(arr);




        ///  Method 1 - Using Extra Array
//        int[][] helper = new int[m][n];
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//               helper[i][j] = arr[i][j];
//            }
//        }
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (helper[i][j] == 0) {
//                    for (int row = 0; row < m; row++) {
//                        arr[row][j] = 0;
//                    }
//                    for (int col = 0; col < n; col++) {
//                        arr[i][col] = 0;
//                    }
//                }
//            }
//        }

    }
}
