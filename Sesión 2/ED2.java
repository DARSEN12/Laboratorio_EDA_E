public class ED2 {
    public static void main(String[] ar) {
        ED2 re = new ED2();    // Crear objeto para usar método no estático
        re.imprimir(5);        // Llamar método recursivo con valor inicial 5
    }

    void imprimir(int x) {
        System.out.println(x); // Imprime el valor actual de x
        imprimir(x - 1);       // Llamada recursiva con x decrementado en 1
        // NO HAY CASO BASE: esta llamada recursiva nunca termina y causa StackOverflowError
    }
}

// El método imprime números decrecientes recursivamente sin detenerse, causando recursión infinita y error de pila.