public class ED6 {
    static int[] vec = {312, 614, 88, 22, 54};

    public static void main(String[] ar) {
        ED6 r = new ED6();  // Crear objeto para llamar métodos no estáticos
        r.imprimir();                         // Imprimir arreglo original
        r.ordenar(vec, vec.length);          // Ordenar arreglo usando recursión (burbuja)
        r.imprimir();                         // Imprimir arreglo ordenado
    }

    // Método recursivo para ordenar arreglo v usando burbuja recursiva
    void ordenar(int[] v, int cant) {
        if (cant > 1) {                      // Caso base: cuando cant <= 1, detener recursión
            for (int f = 0; f < cant - 1; f++) {
                if (v[f] > v[f + 1]) {      // Intercambiar si el elemento actual es mayor que el siguiente
                    int aux = v[f];
                    v[f] = v[f + 1];
                    v[f + 1] = aux;
                }
            }
            ordenar(v, cant - 1);            // Llamada recursiva reduciendo el rango a ordenar
        }
    }

    // Método para imprimir los elementos del arreglo vec
    void imprimir() {
        for (int f = 0; f < vec.length; f++)
            System.out.print(vec[f] + " ");
        System.out.println("\n");
    }
}

/*
- Implementa el algoritmo burbuja recursivo para ordenar el arreglo vec.
- En cada llamada, "burbujea" el mayor elemento hasta el final y luego reduce el rango.
- Cuando el rango (cant) es 1 o menos, la recursión termina.
- imprimir() muestra el arreglo antes y después del ordenamiento.
 */