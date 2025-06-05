public class ED2 {
    public static void main(String[] args) {
        QueueList<Integer> cola = new QueueList<>();

        for (int i = 1; i <= 8; i++) {
            cola.enqueue(i);
        }

        System.out.println("Contenido de la cola:");
        cola.mostrar();

        System.out.println("Elemento en el frente: " + cola.peek());

        System.out.println("Eliminar elementos:");
        while (!cola.isEmpty()) {
            System.out.println("Elemento eliminado: " + cola.dequeue());
        }
    }
}

