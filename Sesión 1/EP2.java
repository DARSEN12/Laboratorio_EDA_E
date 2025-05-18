import java.util.Scanner;
public class EP2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el límite superior del rango para encontrar primos: ");
        int n = scanner.nextInt();

        boolean[] esPrimo = cribaEratostenes(n);

        System.out.println("Números primos hasta " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (esPrimo[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        scanner.close();
    }
    public static boolean[] cribaEratostenes(int n) {
        boolean[] primo = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            primo[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            if (primo[p]) {
                for (int multiple = p * p; multiple <= n; multiple += p) {
                    primo[multiple] = false;
                }
            }
        }
        return primo;
    }
}
