public class EP5 {
    public static void main(String[] args) {
        int b = 5;
        piramide2D(1, b);
    }

    public static void piramide2D(int n, int b) {
        if (n > b) return;

        for (int i = 0; i < b - n; i++) {
            System.out.print(" ");
        }

        for (int i = 0; i < 2 * n - 1; i++) {
            System.out.print("*");
        }

        System.out.println();

        piramide2D(n + 1, b);
    }
}