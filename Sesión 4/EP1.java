public class EP1 {

    // Clase Nodo
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // Clase de la lista doblemente enlazada
    static class DoublyLinkedList {
        Node head;
        Node tail;

        // Método para insertar un nuevo nodo al final de la lista
        public void insert(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }

        // Método para imprimir la lista de cabeza a cola
        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }

        // Método para imprimir la lista de cola a cabeza
        public void printListReverse() {
            Node current = tail;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.prev;
            }
            System.out.println();
        }
    }

    // Método principal
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        // Insertando los números del 1 al 10
        for (int i = 1; i <= 10; i++) {
            list.insert(i);
        }

        // Imprimir la lista de cabeza a cola
        System.out.print("Lista desde la cabeza hasta la cola: ");
        list.printList();

        // Imprimir la lista de cola a cabeza
        System.out.print("Lista desde la cola hasta la cabeza: ");
        list.printListReverse();
    }
}
