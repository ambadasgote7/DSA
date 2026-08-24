package arrays.TwoDimensionalArray;

import java.util.Scanner;

public class StoreMarks {
    public static void main(String[] args) {
        int[][] students = new int[5][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter marks for Roll No " + i + ":" );
            for (int j = 0; j < students[0].length; j++) {
                students[i][j] = sc.nextInt();
            }
        }

        for (int[] student : students) {
            for (int marks : student) {
                System.out.print(marks + " ");
            }
            System.out.println();
        }
    }
}
