package arrays.TwoDimensionalArray;

public class SumOfMatrix {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] b = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };
        if (a.length != b.length && a[0].length != b[0].length) {
            System.out.println("Can't do sum");
        } else{
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    a[i][j] += b[i][j];
                }
            }
        }
        for (int[] arr : a) {
            for (int ele : arr) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
