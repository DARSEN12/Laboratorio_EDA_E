public class EP4 {
    public static void main(String[] args) {
        int b = 5;
        trianguloRecursivo2(b);
    }

    public static void trianguloRecursivo2(int b) {
        trianguloHelper(1, b);
    }
    
    private static void trianguloHelper(int n, int b) {
        if (n > b) return;    
        for (int i = 0; i < b - n; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    
        trianguloHelper(n + 1, b);
    } 
}   