public class EP2 {

    // Clase Nodo: Define la estructura de un nodo
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Clase CircularLinkedList: Contiene los métodos para la lista circular
    static class CircularLinkedList {
        Node head = null;

        // Método para insertar un nuevo nodo en la lista circular
        public void insert(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                newNode.next = head; 
            } else {
                Node temp = head;
                while (temp.next != head) { 
                    temp = temp.next;
                }
                temp.next = newNode; 
                newNode.next = head; 
            }
        }

        // Método para imprimir los elementos de la lista circular
        public void printList() {
            if (head == null) {
                System.out.println("La lista está vacía.");
                return;
            }

            Node temp = head;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head); 
            System.out.println();
        }
    }

    // Método principal
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        for (int i = 1; i <= 12; i++) {
            list.insert(i);
        }

        System.out.print("Lista circular: ");
        list.printList();
    }
}
