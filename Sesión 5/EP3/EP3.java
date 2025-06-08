package EP3;

import java.util.Scanner;

public class EP3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear la cola con un tamaño máximo de 10
        Cola<Integer> cola = new ColaImpl<>(10);

        // Encolar los elementos del 1 al 10
        for (int i = 1; i <= 10; i++) {
            cola.enqueue(i);
        }

        int opcion;
        do {
            System.out.println("\nMenú de Opciones:");
            System.out.println("1. Agregar un elemento a la cola");
            System.out.println("2. Eliminar un elemento de la cola");
            System.out.println("3. Ver el primer elemento de la cola");
            System.out.println("4. Verificar si la cola está vacía");
            System.out.println("5. Verificar si la cola está llena");
            System.out.println("6. Imprimir la cola");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el número a agregar a la cola: ");
                    int numero = scanner.nextInt();
                    cola.enqueue(numero);
                    break;
                case 2:
                    Integer elementoEliminado = cola.dequeue();
                    if (elementoEliminado != null) {
                        System.out.println("Elemento eliminado: " + elementoEliminado);
                    }
                    break;
                case 3:
                    Integer frente = cola.front();
                    if (frente != null) {
                        System.out.println("Elemento en la parte frontal: " + frente);
                    }
                    break;
                case 4:
                    if (cola.isEmpty()) {
                        System.out.println("La cola está vacía.");
                    } else {
                        System.out.println("La cola no está vacía.");
                    }
                    break;
                case 5:
                    if (cola.isFull()) {
                        System.out.println("La cola está llena.");
                    } else {
                        System.out.println("La cola no está llena.");
                    }
                    break;
                case 6:
                    cola.printQueue();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }
}
