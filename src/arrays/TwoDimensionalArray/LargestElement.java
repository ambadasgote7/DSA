package arrays.TwoDimensionalArray;

public class LargestElement {
    public static void main(String[] args) {
        int[][] arr = {
                {12, 22, 44},
                {16, 27, 39}
        };

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
               max = Math.max(max, arr[i][j]);
            }
        }
        System.out.println(max);
    }
}
