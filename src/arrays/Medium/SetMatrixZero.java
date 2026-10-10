package arrays.Medium;

public class SetMatrixZero {
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
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };
        setZeroes(arr);
        printArr(arr);
    }

    public static void setZeroes(int[][] arr) {

        // Method 3 - Optimal constant space
        int m = arr.length, n = arr[0].length;
        boolean zeroRow = false, zeroCol = false;
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

//        // Method 2 - Using Extra space O(m+n)
//        int m = arr.length, n = arr[0].length;
//        boolean[] row = new boolean[m];
//        boolean[] col = new boolean[n];
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
//            for (int j = 0; j < n; j++) {
//                if(row[i] || col[j]) {
//                    arr[i][j] = 0;
//                }
//            }
//        }

//        // Method 1 - Using Extra array
//        int m = arr.length, n = arr[0].length;
//        int[][] temp = new int[m][n];
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                temp[i][j] = arr[i][j];
//            }
//        }
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (temp[i][j] == 0) {
//                    for (int k = 0; k < m; k++) {
//                        arr[k][j] = 0;
//                    }
//                    for (int k = 0; k < n; k++) {
//                        arr[i][k] = 0;
//                    }
//                }
//            }
//      }
    }
}
