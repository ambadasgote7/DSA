package pattern.practice;

public class Practice03 {
    public static void main(String[] args) {
        numberPalindromicTrianglePattern(4);
    }

    /*
    27. numberPalindromicTrianglePattern()
1 2 3 4  17 18 19 20
  5 6 7  14 15 16
    8 9  12 13
       10 11
     */

    static void numberPalindromicTrianglePattern(int n) {

    }

    static void reverseAlphabetPyramidPattern(int n) {
        for (int i = 1; i <= n; i++) {
            int ch = 'A' + n - i;
            for (int j = 2; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = n+1-i; j >= 1; j--) {
                System.out.print((char) (ch) + " ");
                ch--;
            }
            System.out.println();
        }
    }

    static void alternatingCaseAlphabetPattern(int n) {
        boolean upper = false;
        char ch = 'a';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (upper) System.out.print(Character.toUpperCase(ch++) + " ");
                else System.out.print(Character.toLowerCase(ch++) + " ");
                upper = !upper;
            }
            System.out.println();
        }

    }

    static void reverseAlphabetTrianglePattern(int n) {
        for (int i = 1; i <= n; i++) {
            int ch = 'A' + n - i;
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (ch) + " ");
                ch++;
            }
            System.out.println();
        }
    }

    static void concentricNumberSquarePattern1(int n) {
        for (int i = 1; i <= 2*n-1; i++) {
            for (int j = 1; j <= 2*n-1; j++) {
                int a = i, b = j;
                if (i > n) a = 2*n-i;
                if (j > n) b = 2*n-j;
                System.out.print(n+1-Math.min(a,b) + " ");
            }
            System.out.println();
        }
    }

    static void concentricNumberSquarePattern(int n) {
        for (int i = 1; i <= 2*n-1; i++) {
            for (int j = 1; j <= 2*n-1; j++) {
                int a = i, b = j;
                if (i > n) a = 2*n-i;
                if (j > n) b = 2*n-j;
                System.out.print(Math.min(a,b) + " ");
            }
            System.out.println();
        }
    }


    static void decreasingNumberPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 2; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = n+1-i; j >= 1; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void hollowRhombusPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j >= 1; j--) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i==n || j == 1 || j==n) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void hollowDiamondPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j==1 || j==i) System.out.print("*");
                else System.out.print(" ");
            }
            for (int j = 2*n-(2*i-1); j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j==1 || j==i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j >= 1; j--) {
                if (j==1 || j==n-i) System.out.print("*");
                else System.out.print(" ");
            }
            for (int j = 1; j <= 2*i+1; j++) {
                System.out.print(" ");
            }
            for (int j = n-i; j >= 1; j--) {
                if (j==1 || j==n-i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
