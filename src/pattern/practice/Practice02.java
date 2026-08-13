package pattern.practice;

import java.util.ArrayList;
import java.util.List;

public class Practice02 {
    public static void main(String[] args) {
        binaryTrianglePattern(5);
    }

    static void binaryTrianglePattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i+j)%2 == 0) System.out.print(1 + " ");
                else System.out.print(0 + " ");
            }
            System.out.println();
        }
    }

    static void continuousNumberTrianglePattern(int n) {
        int a = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a++ + " ");
            }
            System.out.println();
        }
    }

    static void hollowSquarePattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void hollowInvertedTriangleDiamondPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            for (int j = 2*n-(2*i); j >= 1; j--) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        for (int i = 1; i <= n-1; i++) {
            for (int j = n-i; j >= 1; j--) {
                System.out.print("*" + " ");
            }
            for (int j = 1; j <= 2*i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = n-i; j >= 1; j--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }

    static void hollowHourglassPattern(int n) {
        for (int i = 1; i <= 2*n-1; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 1; i <= n-1; i++) {
            for (int j = n-i; j >= 1; j--) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print(" ");
            }
            for (int j = n-i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n-1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 2*n-1-(2*i); j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 2*n-1; i++) {
            System.out.print("*");
        }
    }

    static void palindromicNumberPyramidPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j >= 1; j--) {
                System.out.print(" " + " ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pascalTrianglePattern(int n) {
        for (int i = 1; i <= n; i++) {
            int a = 1;
            for (int j = n-i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                int c = a * (i-j);
                a = c / j;
            }
            System.out.println();
        }
    }

    static void hollowDiamondPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j ==i) System.out.print("*" + " ");
                else System.out.print(" " + " ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n-1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = n-i; j >= 1; j--) {
                if (j == 1 || j == n-i) System.out.print("*" + " ");
                else System.out.print(" " + " ");
            }
            System.out.println();
        }
    }

    static void invertedHollowPyramidPattern(int n) {
        for (int i = 1; i <= 2*n-1; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 1; i <= n-1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = n-i; j >= 1; j--) {
                if (j == 1 || j == n-i) System.out.print("*" + " ");
                else System.out.print(" " + " ");
            }
            System.out.println();
        }

    }

    static void hollowPyramidPattern(int n) {
        for (int i = 1; i <= n-1; i++) {
            for (int j = n-i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) System.out.print("*" + " ");
                else System.out.print(" " + " ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 2*n-1; i++) {
            System.out.print("*");
        }
    }
}
