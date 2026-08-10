package pattern.triangle;

public class HW02 {
    public static void main(String[] args) {
        horizontallyFlippedAlphabetTriangle1(5);
    }

    public static void horizontallyFlippedAlphabetTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n+1-i; j++) {
                System.out.print((char) (j+64) + " ");
            }
            System.out.println();
        }
    }

    public static void horizontallyFlippedAlphabetTriangle1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n+1-i; j++) {
                System.out.print((char) (i+64) + " ");
            }
            System.out.println();
        }
    }

    public static void horizontallyFlippedNumberTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n+1-i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
