import java.util.Scanner;
public class EP3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de elementos a ordenar: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Ingrese los elementos:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        insercion(arr);

        System.out.println("Lista ordenada:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
    public static void insercion(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            // Mover elementos mayores que key una posición a la derecha
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            // Insertar key en la posición correcta
            arr[j + 1] = key;
            // Invariante: El subarreglo arr[0..i] está ordenado
        }
    }
}
