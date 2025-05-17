import java.util.*;
public class ER2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("De qué tamaño es el vector?");
        int tamaño = scanner.nextInt();

        int[] vector_int = new int[tamaño];
        System.out.println("Ingrese los valores del vector:");
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Valor " + (i+1) + ": ");
            vector_int[i] = scanner.nextInt();
        }

        System.out.println("¿Cuántos valores desea rotar a la izquierda?");
        int muestra = scanner.nextInt();

        scanner.close();

        int[] vector_rotado = rotarIzquierdaArray(vector_int, muestra);

        System.out.print("Vector original: [");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(vector_int[i]);
            if (i != tamaño - 1) System.out.print(", ");
        }
        System.out.println("]");

        System.out.print("Vector rotado: [");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(vector_rotado[i]);
            if (i != tamaño - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static int[] rotarIzquierdaArray(int[] A, int d) {
        int n = A.length;
        int[] Ainvertido = new int[n];
        for (int i = 0; i < n; i++) {
            Ainvertido[i] = A[(i + d) % n];
        }
        return Ainvertido;
    }
}