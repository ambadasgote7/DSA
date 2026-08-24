package arrays.TwoDimensionalArray;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int[][] brr = {
                {1, 2, 4},
                {1, 2, 3}
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

        for (int[] a : arr) {
            for (int ele : a) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
