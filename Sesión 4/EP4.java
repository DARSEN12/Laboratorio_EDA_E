import java.util.LinkedList;

public class EP4 {
    public static void main(String[] args) {
        
        LinkedList<Integer> list = new LinkedList<>();
        
        // Insertar los números del 1 al 12 en la lista
        for (int i = 1; i <= 12; i++) {
            list.add(i);
        }
        
        // Hacer que la lista sea circular, conectando el último nodo con el primero
        list.addFirst(list.getLast());  
        
        // Imprimir la lista circular
        System.out.print("Lista circular: ");
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Imprimir la lista nuevamente (muestra la repetición del primer elemento al final)
        System.out.print("Lista circular nuevamente: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
            if (i == list.size() - 1) {
                break;
            }
        }
    }
}
