package arrays.TwoDimensionalArray;

import java.util.Scanner;

public class StoreRollNoAndMarks {
    public static void main(String[] args) {
//        int[][] students = new int[2][4];
        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < students.length; i++) {
//            if (i == 0) {
//                System.out.println("Enter Roll No :" );
//            } else {
//                System.out.println("Enter Marks :" );
//            }
//            for (int j = 0; j < students[0].length; j++) {
//                students[i][j] = sc.nextInt();
//            }
//        }

        int[][] students = new int[4][2];
        for (int i = 0; i < students.length; i++) {
                System.out.println("Enter Roll No & marks :" );
            for (int j = 0; j < students[0].length; j++) {
                students[i][j] = sc.nextInt();
            }
        }


        for (int[] student : students) {
            System.out.print("{ ");
            for (int marks : student) {
                System.out.print(marks + ",");
            }
            System.out.println(" }");
        }
    }
}
