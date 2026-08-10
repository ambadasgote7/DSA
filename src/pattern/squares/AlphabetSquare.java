package pattern.squares;

public class AlphabetSquare {
    public static void main(String[] args) {
        int side = 4;
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side; j++) {
                System.out.print((char) (j+64) + " ");
            }
            System.out.println();
        }
    }
}
