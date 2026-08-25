package arrays.TwoDimensionalArray;

public class RotateBy90 {
    static void printArr(int[][] arr) {
        for (int[] a : arr) {
            for (int ele : a) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr  = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int m = arr.length, n = arr[0].length;
        int[][] transpose = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transpose[j][i] = arr[i][j];
            }
        }

        for (int i = 0; i < m; i++) {
            int a = 0, b = m-1;
            while (a<b) {
                int temp = transpose[i][a];
                transpose[i][a] = transpose[i][b];
                transpose[i][b] = temp;
                a++;b--;
            }
        }

        printArr(transpose);
    }
}
