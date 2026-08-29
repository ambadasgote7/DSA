package arrays.PracticeProblems;

public class SpiralMatrix3 {
    static void printArr(int[][] arr) {
        int i = 0;
        for (int[] a : arr) {
            System.out.print(i++ +"{");
            for (int ele : a) {
                System.out.print(ele + " ");
            }
            System.out.print("}");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int rows = 5, cols = 6, rStart = 1, cStart = 4;
        int[][] ans = spiralMatrixIII(rows, cols, rStart, cStart);
        printArr(ans);
    }
    public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {

//        int[][] ans = new int[rows * cols][2];
//
//        int step = 1;
//        int a = 0;
//
//        ans[a][0] = rStart;
//        ans[a][1] = cStart;
//        a++;
//
//        while (a < rows * cols) {
//
//            // Right
//            for (int j = cStart + 1;
//                 j <= cStart + step && a < rows * cols;
//                 j++) {
//
//                if (rStart >= 0 && rStart < rows &&
//                        j >= 0 && j < cols) {
//
//                    ans[a][0] = rStart;
//                    ans[a][1] = j;
//                    a++;
//                }
//            }
//            cStart += step;
//
//            // Down
//            for (int i = rStart + 1;
//                 i <= rStart + step && a < rows * cols;
//                 i++) {
//
//                if (i >= 0 && i < rows &&
//                        cStart >= 0 && cStart < cols) {
//
//                    ans[a][0] = i;
//                    ans[a][1] = cStart;
//                    a++;
//                }
//            }
//            rStart += step;
//
//            step++;
//
//            // Left
//            for (int j = cStart - 1;
//                 j >= cStart - step && a < rows * cols;
//                 j--) {
//
//                if (rStart >= 0 && rStart < rows &&
//                        j >= 0 && j < cols) {

//                    ans[a][0] = rStart;
//                    ans[a][1] = j;
//                    a++;
//                }
//            }
//            cStart -= step;
//
//            // Up
//            for (int i = rStart - 1;
//                 i >= rStart - step && a < rows * cols;
//                 i--) {
//
//                if (i >= 0 && i < rows &&
//                        cStart >= 0 && cStart < cols) {
//
//                    ans[a][0] = i;
//                    ans[a][1] = cStart;
//                    a++;
//                }
//            }
//            rStart -= step;
//
//            step++;
//        }
//
//        return ans;


                    ///  Second approach


        int[][] ans = new int[rows * cols][2];

        int step = 1;
        int a = 0;

        // Add starting position
        ans[a][0] = rStart;
        ans[a][1] = cStart;
        a++;

        while (a < rows * cols) {

            // ---------------- RIGHT ----------------
            for (int j = 0; j < step && a < rows * cols; j++) {

                cStart++;

                if (rStart >= 0 && rStart < rows &&
                        cStart >= 0 && cStart < cols) {

                    ans[a][0] = rStart;
                    ans[a][1] = cStart;
                    a++;
                }
            }

            // ---------------- DOWN ----------------
            for (int i = 0; i < step && a < rows * cols; i++) {

                rStart++;

                if (rStart >= 0 && rStart < rows &&
                        cStart >= 0 && cStart < cols) {

                    ans[a][0] = rStart;
                    ans[a][1] = cStart;
                    a++;
                }
            }

            step++;

            // ---------------- LEFT ----------------
            for (int j = 0; j < step && a < rows * cols; j++) {

                cStart--;

                if (rStart >= 0 && rStart < rows &&
                        cStart >= 0 && cStart < cols) {

                    ans[a][0] = rStart;
                    ans[a][1] = cStart;
                    a++;
                }
            }

            // ---------------- UP ----------------
            for (int i = 0; i < step && a < rows * cols; i++) {

                rStart--;

                if (rStart >= 0 && rStart < rows &&
                        cStart >= 0 && cStart < cols) {

                    ans[a][0] = rStart;
                    ans[a][1] = cStart;
                    a++;
                }
            }

            step++;
        }

        return ans;
    }
}
