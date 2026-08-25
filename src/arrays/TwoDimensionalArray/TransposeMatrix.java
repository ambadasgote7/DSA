package arrays.TwoDimensionalArray;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int m = a.length, n = a[0].length;
        int[][] res = new int[n][m];
        for (int j = 0; j < a[0].length; j++) {
            for (int i = 0; i < a.length; i++) {
                res[j][i] = a[i][j];
//                System.out.print(a[i][j] + " ");
            }
        }

        for (int[] arr : res) {
            for (int ele : arr) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }

    }
}
