public class EP3 {
    public static void main(String[] args) {
        int b = 10;
        trianguloRecursivo1(b);
    }

    public static void trianguloRecursivo1(int b) {
        trianguloHelper(1, b);
    }
    
    public static void trianguloHelper(int n, int b) {
        if (n > b) return;  
            
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
            
        trianguloHelper(n + 1, b);
    }
}    