import java.util.LinkedList;

public class EP3 {
    public static void main(String[] args) {
        
        // Crear una lista doblemente enlazada usando la clase LinkedList de java.util
        LinkedList<Integer> list = new LinkedList<>();

        // Insertar los elementos del 1 al 10 en la lista
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        // Imprimir la lista completa
        System.out.print("Lista doblemente enlazada: ");
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Imprimir la lista en orden inverso (reverse) usando un iterador
        System.out.print("Lista en orden inverso: ");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}

