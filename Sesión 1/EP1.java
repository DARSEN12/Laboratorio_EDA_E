import java.util.*;
public class EP1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de estudiantes: ");
        int n = scanner.nextInt();
        double[] notas = new double[n];

        System.out.println("Ingrese las calificaciones:");
        for (int i = 0; i < n; i++) {
            notas[i] = scanner.nextDouble();
        }

        Arrays.sort(notas);
        double mediana = calcularMediana(notas);
        double moda = calcularModa(notas);
        double desviacion = calcularDesviacionEstandar(notas);

        System.out.printf("Mediana: %.2f\n", mediana);
        System.out.printf("Moda: %.2f\n", moda);
        System.out.printf("Desviación estándar: %.2f\n", desviacion);

        scanner.close();
    }
    // Calcula la mediana de un arreglo ordenado
    public static double calcularMediana(double[] arr) {
        int n = arr.length;
        if (n % 2 == 0) {
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        } else {
            return arr[n / 2];
        }
    }
    // Calcula la moda del arreglo
    public static double calcularModa(double[] arr) {
        Map<Double, Integer> frecuencia = new HashMap<>();
        for (double num : arr) {
            frecuencia.put(num, frecuencia.getOrDefault(num, 0) + 1);
        }
        double moda = arr[0];
        int maxFreq = 0;
        for (Map.Entry<Double, Integer> entry : frecuencia.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                moda = entry.getKey();
            }
        }
        return moda;
    }
    // Calcula la desviación estándar del arreglo
    public static double calcularDesviacionEstandar(double[] arr) {
        int n = arr.length;
        double suma = 0.0;
        for (double num : arr) {
            suma += num;
        }
        double media = suma / n;
        double sumaCuadrados = 0.0;
        for (double num : arr) {
            sumaCuadrados += Math.pow(num - media, 2);
        }
        return Math.sqrt(sumaCuadrados / n);
    }
}
