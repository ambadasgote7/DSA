package arrays.TwoDimensionalArray;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int m = arr.length, n = arr[0].length;
        int minR = 0, maxR = m-1;
        int minC = 0, maxC = n-1;

        while (minR <= maxR && minC <= maxC) {
            for (int j = minC; j <= maxC; j++) {
                System.out.print(arr[minR][j] + " ");
            }
            minR++;
            if (minR > maxR || minC > maxC) break;
            for (int i = minR; i <= maxR; i++) {
                System.out.print(arr[i][maxC] + " ");
            }
            maxC--;
            if (minR > maxR || minC > maxC) break;
            for(int j = maxC; j >= minC; j--) {
                System.out.print(arr[maxR][j] + " ");
            }
            maxR--;
            if (minR > maxR || minC > maxC) break;
            for (int i = maxR; i >= minR; i--) {
                System.out.print(arr[i][minC] + " ");
            }
            minC++;
            if (minR > maxR || minC > maxC) break;
        }
    }
}
