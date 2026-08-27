package arrays.TwoDimensionalArray;

public class SearchInArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 2},
                {4, 5, 6},
                {7, 8, 9}
        };
        int target = 6;
        int m = arr.length, n = arr[0].length;
        int i = 0, j = n-1;
        while (i < m && j >= 0) {
            if (arr[i][j] < target) {
                i++;
            } else if (arr[i][j] > target) {
                j--;
            } else {
                System.out.println("True");
                return;
            }
        }
        System.out.println("False");





//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (arr[i][j] == target) System.out.println("True");
//            }
//        }
    }
}
