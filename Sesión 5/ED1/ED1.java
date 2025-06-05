package ED1;

public class ED1 {
    public static void main(String[] args) {
        StackList<Integer> pila = new StackList<>();

        for (int i = 1; i <= 8; i++) {
            pila.push(i);
        }

        System.out.println("Contenido de la pila:");
        pila.mostrar();

        System.out.println("Elemento en la cima: " + pila.peek());

        System.out.println("Eliminar elementos:");
        while (!pila.isEmpty()) {
            System.out.println("Elemento eliminado: " + pila.pop());
        }
    }
}

