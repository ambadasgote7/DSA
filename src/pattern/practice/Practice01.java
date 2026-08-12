package pattern.practice;

public class Practice01 {
    public static void main(String[] args) {
        diamondPattern(4);
    }

    static void diamondPattern(int n) {
        int nsp = n-1;
        int nst = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("*" + " ");
            }
            nsp--;
            nst += 2;
            System.out.println();
        }
        // Now nsp is -1 so, you need to reinitialize nsp=1 as number of space in the flipped pyramid we need the triangle with spaces we take nsp=1
        nsp = 1;
        // Now nst is 9 so, similarly for nst you can reinitialize nst= n+1 --> (4+1) or subtract the n from nst so here nst-=n (nst-=4) i.e nst=5,
        // as flipped pyramid contain the n-1 rows because we have printed the n+1 already and whole diamond has 2*n-1 rows
        nst = n+1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("*" + " ");
            }
            nsp++;
            nst -= 2;
            System.out.println();
        }
    }

    static void invertedNumberedPyramidPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 2; j <= i; j++) {
                System.out.print(" ");
            }
            for(int j = n+1-i; j >= 1; j--) {
                System.out.print("*" + " ");
            }

            System.out.println();
        }
    }

    static void numberedPyramidPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for(int j = n-i; j >= 1; j--) {
                System.out.print(" ");
            }
//            for (int j = 1; j <= 2*i-1; j++) {
//                if (j % 2 == 0) {
//                    System.out.print(" " + " ");
//                } else {
//                    System.out.print("*" + " ");
//                }
//            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void invertedPyramidPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 2; j <= i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 2*n-(2*i-1); j >= 1; j--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void pyramidPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for(int j = n-i; j >= 1; j--) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void rightAlignedInvertedTrianglePattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 2; j <= i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = n+1-i; j >= 1; j--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void rightAlignedTrianglePattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j >= 1; j--) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void increasingDecreasingTrianglePattern(int n) {
        for (int i = 1;  i <= n+1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = n+1-i; j >= 1; j--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void numberTrianglePattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void decreasingRightTrianglePattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n+1-i; j >= 1; j--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void increasingRightTrianglePattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void squarePattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
