package EP2;

import java.util.*;

public class EP2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú de Operaciones Clases Genéricas:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Producto");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz Cuadrada");
            System.out.println("7. Raíz Cúbica");
            System.out.println("8. Salir del Programa");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Valor 1: ");
                    double a = scanner.nextDouble();
                    System.out.print("Valor 2: ");
                    double b = scanner.nextDouble();
                    Operador<Double> op = new Operador<>(a, b);
                    System.out.println("Resultado: " + op.suma());
                }
                case 2 -> {
                    System.out.print("Valor 1: ");
                    double a = scanner.nextDouble();
                    System.out.print("Valor 2: ");
                    double b = scanner.nextDouble();
                    Operador<Double> op = new Operador<>(a, b);
                    System.out.println("Resultado: " + op.resta());
                }
                case 3 -> {
                    System.out.print("Valor 1: ");
                    double a = scanner.nextDouble();
                    System.out.print("Valor 2: ");
                    double b = scanner.nextDouble();
                    Operador<Double> op = new Operador<>(a, b);
                    System.out.println("Resultado: " + op.producto());
                }
                case 4 -> {
                    try {
                        System.out.print("Valor 1: ");
                        double a = scanner.nextDouble();
                        System.out.print("Valor 2: ");
                        double b = scanner.nextDouble();
                        Operador<Double> op = new Operador<>(a, b);
                        System.out.println("Resultado: " + op.division());
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }
                case 5 -> {
                    System.out.print("Base: ");
                    double a = scanner.nextDouble();
                    System.out.print("Exponente: ");
                    double b = scanner.nextDouble();
                    Operador<Double> op = new Operador<>(a, b);
                    System.out.println("Resultado: " + op.potencia());
                }
                
                case 6 -> {
                    try {
                        System.out.print("Valor: ");
                        double a = scanner.nextDouble();
                        System.out.println("Resultado: " + Operador.raizCuadrada(a));
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }
                case 7 -> {
                    System.out.print("Valor: ");
                    double a = scanner.nextDouble();
                    System.out.println("Resultado: " + Operador.raizCubica(a));
                }
                case 8 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 8);

        scanner.close();
    }
}
