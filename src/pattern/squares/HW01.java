package pattern.squares;

public class HW01 {
    public static void main(String[] args) {
        smallAlphabetSquare(5);
    }

    public static void alphabetSquare(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) (i+64) + " ");
            }
            System.out.println();
        }
    }

    public static void smallAlphabetSquare(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) (j+96) + " ");
            }
            System.out.println();
        }
    }
}
