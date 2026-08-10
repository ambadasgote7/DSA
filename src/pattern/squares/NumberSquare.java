package pattern.squares;

public class NumberSquare {
    public static void main(String[] args) {
        int side = 5;
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j < side; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
