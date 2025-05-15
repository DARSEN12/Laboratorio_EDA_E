import java.util.*;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamaño;

        System.out.println("Ingrese el tamaño del vector :");
        tamaño = scanner.nextInt();
        int[] vector_int = new int[tamaño];

        System.out.println("Ingrese los valores que tendrá el vector");
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Ingrese valor " + (i + 1) + ":");
            vector_int[i] = scanner.nextInt();
        }

        String array = "[";
        for (int i = 0; i < tamaño; i++) {
            array += vector_int[i];
            if (i != tamaño - 1) array += ", ";
        }
        array += "]";

        int[] vector_int_inv = invertirArray(vector_int, tamaño);

        String arrayInv = "[";
        for (int i = 0; i < tamaño; i++) {
            arrayInv += vector_int_inv[i];
            if (i != tamaño - 1) arrayInv += ", ";
        }
        arrayInv += "]";

        System.out.println("A = " + array + " -> Asalida = " + arrayInv);

        scanner.close();
    }

    public static int[] invertirArray(int[] A, int longitud) {
        int[] Asalida = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            Asalida[i] = A[longitud - 1 - i];
        }
        return Asalida;
    }
}