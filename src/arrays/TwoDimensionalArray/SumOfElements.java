package arrays.TwoDimensionalArray;

public class SumOfElements {
    public static void main(String[] args) {
        int[][] arr = {
                {12, 22, 44},
                {16, 27, 39}
        };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
               sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
