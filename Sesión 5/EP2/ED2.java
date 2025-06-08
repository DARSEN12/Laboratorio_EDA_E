package EP2;

import java.util.*;

public class ED2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear la pila con un tamaño máximo de 10
        Pila<Integer> pila = new PilaImpl<>(10);

        // Apilar los elementos del 1 al 10
        for (int i = 1; i <= 10; i++) {
            pila.push(i);
        }

        int opcion;
        do {
            System.out.println("\nMenú de Opciones:");
            System.out.println("1. Apilar un elemento");
            System.out.println("2. Desapilar un elemento");
            System.out.println("3. Ver el elemento en la cima");
            System.out.println("4. Destruir la pila");
            System.out.println("5. Verificar si la pila está vacía");
            System.out.println("6. Verificar si la pila está llena");
            System.out.println("7. Imprimir la pila");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el número a apilar: ");
                    int numero = scanner.nextInt();
                    pila.push(numero);
                    break;
                case 2:
                    Integer elementoDesapilado = pila.pop();
                    if (elementoDesapilado != null) {
                        System.out.println("Elemento desapilado: " + elementoDesapilado);
                    }
                    break;
                case 3:
                    Integer cima = pila.top();
                    if (cima != null) {
                        System.out.println("Elemento en la cima: " + cima);
                    }
                    break;
                case 4:
                    pila.destroyStack();
                    break;
                case 5:
                    if (pila.isEmpty()) {
                        System.out.println("La pila está vacía.");
                    } else {
                        System.out.println("La pila no está vacía.");
                    }
                    break;
                case 6:
                    if (pila.isFull()) {
                        System.out.println("La pila está llena.");
                    } else {
                        System.out.println("La pila no está llena.");
                    }
                    break;
                case 7:
                    pila.printStack();
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

