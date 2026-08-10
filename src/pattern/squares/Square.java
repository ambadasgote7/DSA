package pattern.squares;

public class Square {
    public static void main(String[] args) {
        int side = 4;
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
