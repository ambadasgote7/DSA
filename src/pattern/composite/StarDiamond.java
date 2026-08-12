package pattern.composite;

public class StarDiamond {
    public static void main(String[] args) {
        int n = 4;
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
        nsp = 1;
        nst -= n;
        for (int i = 1; i <= n-1; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" " + " ");
            }
            for (int j = nst; j >= 1; j--) {
                System.out.print("*" + " ");
            }
            System.out.println();
            nsp++;
            nst -= 2;
        }
    }
}
