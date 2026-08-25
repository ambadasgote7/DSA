package arrays.TwoDimensionalArray;

public class WaveFormPrinting {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int m = arr.length, n = arr[0].length;
//        // left-right, right-left wave form
//        for (int i = 0; i < m; i++) {
//            if (i % 2 == 0) {
//                for (int j = 0; j < n; j++) {
//                    System.out.print(arr[i][j] + " ");
//                }
//            } else {
//                for (int j = n-1; j >= 0 ; j--) {
//                    System.out.print(arr[i][j] + " ");
//                }
//            }
//        }

//        // right-left, left-right wave form
//        for (int i = 0; i < m; i++) {
//            if (i % 2 != 0) {
//                for (int j = 0; j < n; j++) {
//                    System.out.print(arr[i][j] + " ");
//                }
//            } else {
//                for (int j = n-1; j >= 0 ; j--) {
//                    System.out.print(arr[i][j] + " ");
//                }
//            }
//        }

//        // up-down, down-up
//        for (int j = 0; j < n; j++) {
//            if (j % 2 == 0) {
//                for (int i = 0; i < m; i++) {
//                    System.out.print(arr[i][j] + " ");
//                }
//            } else {
//                for (int i = m-1; i >= 0; i--) {
//                    System.out.print(arr[i][j] + " ");
//                }
//            }
//        }

        // down-up, up-down
        for (int j = 0; j < n; j++) {
            if (j % 2 != 0) {
                for (int i = 0; i < m; i++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int i = m-1; i >= 0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
