public class ED4 {
    public static void main(String[] ar) {
        ED4 re = new ED4();  // Crear objeto para usar método no estático
        re.imprimir(5);                        // Llamar método recursivo con valor inicial 5
    }

    void imprimir(int x) {
        if (x > 0) {                          // Caso base: detener si x <= 0
            imprimir(x - 1);                  // Llamada recursiva primero (llamada "preorden" inversa)
            System.out.println(x);            // Imprime después de la llamada recursiva (orden ascendente)
        }
    }
}

// Imprime los números del 1 al 5 en orden ascendente usando recursión.