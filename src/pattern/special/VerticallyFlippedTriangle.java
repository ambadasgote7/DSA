package pattern.special;

public class VerticallyFlippedTriangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i+j > n) System.out.print("*" + " "); // you can also use j >= n+1-i
                else System.out.print(" " + " ");
            }
            System.out.println();
        }
    }
}
