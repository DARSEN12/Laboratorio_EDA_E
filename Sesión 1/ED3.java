import java.util.Scanner;
public class ED3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de elementos: ");
        int n = scanner.nextInt();
        int[] numeros = new int[n];
        System.out.println("Ingrese los números:");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }
        boolean estaOrdenada = true; 
        for (int i = 1; i < n; i++) {
            if (numeros[i] < numeros[i - 1]) {
                estaOrdenada = false;  
                break;
            }
        }
        System.out.println("¿Está ordenada la lista?: " + (estaOrdenada ? "Sí" : "No"));
        scanner.close();
    }
}
