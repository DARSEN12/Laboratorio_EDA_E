public class EP6 {
    public static void main(String[] args) {
        int b = 10;
        cuadradoRecursivo(1, b);
    }

    public static void cuadradoRecursivo(int n, int b) {
        if (n > b) return;

        if (n == 1 || n == b) {
            for (int i = 0; i < b; i++) {
                System.out.print("*");
            }
        } else {
            System.out.print("*");
            for (int i = 0; i < b - 2; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
        }
        System.out.println();

        cuadradoRecursivo(n + 1, b);
    }
}