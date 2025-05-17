public class ED3 {
    public static void main(String[] ar) {
        ED3 re = new ED3();  // Crear objeto para usar método no estático
        re.imprimir(5);                        // Llamar método recursivo con valor inicial 5
    }

    void imprimir(int x) {
        if (x > 0) {                          // Caso base implícito: detener recursión si x <= 0
            System.out.println(x);            // Imprimir valor actual de x
            imprimir(x - 1);                  // Llamada recursiva con x decrementado en 1
        }
    }
}

// Imprime números decrecientes desde x hasta 1 usando recursión controlada con caso base.