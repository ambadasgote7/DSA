package recursion.Basics;

public class First {
    static int count = 0;
    public static void main(String[] args) {
        print();
    }
    public static void print() {
        if (count == 4) return;
        System.out.println(count++);
        print();
    }
}
