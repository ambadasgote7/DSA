package pattern.triangle;

public class HW01 {
    public static void main(String[] args) {
        alphaNumericTriangle(5);
    }

    public static void alphaNumericTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 != 0) {
                    System.out.print(j + " ");
                } else {
                    System.out.print((char) (j+64) + " ");
                }
            }
            System.out.println();
        }
    }

    public static void alphabetTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (j+64) + " ");
            }
            System.out.println();
        }
    }

    public static void numberTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
