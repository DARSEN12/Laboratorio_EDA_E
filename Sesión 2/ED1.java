public class ED1 {
    public static void main(String[] ar) {
        ED1 re = new ED1();    // Crear objeto para usar método no estático
        re.repetir();          // Llamar método recursivo sin condiciones
    }

    void repetir() {
        repetir();             // Se llama a sí mismo indefinidamente sin caso base
        // RECUSIÓN INFINITA: provoca StackOverflowError
    }
}

// El programa entra en una llamada recursiva sin fin y termina con un error de desbordamiento de pila.