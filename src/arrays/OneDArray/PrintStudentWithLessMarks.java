package arrays.OneDArray;

public class PrintStudentWithLessMarks {
    public static void main(String[] args) {
        int[] marks = {70, 87, 30, 65, 43, 50, 28, 10, 48, 17};
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 35) {
                System.out.println("Roll No " + i + " has less than 35 marks, which is " + marks[i]);
            }
        }
    }
}
