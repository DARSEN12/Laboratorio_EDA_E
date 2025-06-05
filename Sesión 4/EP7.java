import java.util.Scanner;

public class EP7 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class CircularLinkedList {
        Node head;

        // Insertar un nodo al final de la lista circular
        public void insert(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                newNode.next = head; // El primer nodo apunta a sí mismo
            } else {
                Node temp = head;
                while (temp.next != head) {
                    temp = temp.next;
                }
                temp.next = newNode; // El último nodo apunta al nuevo nodo
                newNode.next = head; // El nuevo nodo apunta al primer nodo
            }
        }

        // Imprimir la lista circular
        public void printList() {
            if (head == null) {
                System.out.println("La lista está vacía.");
                return;
            }
            Node current = head;
            do {
                System.out.print(current.data + " ");
                current = current.next;
            } while (current != head);
            System.out.println();
        }

        // Eliminar un nodo por clave
        public void deleteByKey(int key) {
            Node current = head;
            Node previous = null;

            if (current != null && current.data == key) {
                if (current.next == head) {  // Si es el único nodo
                    head = null;
                } else {
                    previous = current;
                    while (current.next != head) {
                        previous = current;
                        current = current.next;
                    }
                    previous.next = head; // El último nodo apunta al primer nodo
                }
                System.out.println(key + " encontrado y eliminado.");
                return;
            }

            while (current != null && current.data != key) {
                previous = current;
                current = current.next;
            }

            if (current == null) {
                System.out.println(key + " no encontrado.");
                return;
            }

            previous.next = current.next; // Desenlazar el nodo
            System.out.println(key + " encontrado y eliminado.");
        }

        // Eliminar un nodo en una posición específica
        public void deleteAtPosition(int position) {
            if (head == null) return;

            Node current = head;
            if (position == 0) {
                head = current.next;
                return;
            }

            int counter = 0;
            while (current != null && counter < position - 1) {
                current = current.next;
                counter++;
            }

            if (current == null || current.next == null) {
                System.out.println("Posición " + position + " no encontrada.");
                return;
            }

            Node next = current.next.next;
            current.next = next;
            System.out.println("Nodo en la posición " + position + " eliminado.");
        }

        // Obtener el tamaño de la lista circular
        public int size() {
            int size = 0;
            if (head == null) return size;

            Node current = head;
            do {
                size++;
                current = current.next;
            } while (current != head);

            return size;
        }

        // Eliminar el primer nodo
        public void removeFirst() {
            if (head != null) {
                if (head.next == head) { // Si es el único nodo
                    head = null;
                } else {
                    head = head.next;
                }
            }
        }

        // Eliminar el último nodo
        public void removeLast() {
            if (head == null) return;

            Node current = head;
            while (current.next != head) {
                current = current.next;
            }

            if (current == head) { // Si es el único nodo
                head = null;
            } else {
                Node temp = head;
                while (temp.next != current) {
                    temp = temp.next;
                }
                temp.next = head;
            }
        }

        // Añadir un nodo al principio
        public void addFirst(int data) {
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
                head = newNode;
            }
        }

        // Añadir un nodo al final
        public void addLast(int data) {
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
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        Scanner scanner = new Scanner(System.in);
        int choice, value, position;

        // Insertar los elementos del 1 al 12
        for (int i = 1; i <= 12; i++) {
            list.insert(i);
        }

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Mostrar lista");
            System.out.println("2. Eliminar por clave");
            System.out.println("3. Eliminar por posición");
            System.out.println("4. Obtener tamaño de la lista");
            System.out.println("5. Eliminar primer elemento");
            System.out.println("6. Eliminar último elemento");
            System.out.println("7. Añadir primer elemento");
            System.out.println("8. Añadir último elemento");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    list.printList();
                    break;
                case 2:
                    System.out.print("Ingrese el valor a eliminar: ");
                    value = scanner.nextInt();
                    list.deleteByKey(value);
                    break;
                case 3:
                    System.out.print("Ingrese la posición a eliminar: ");
                    position = scanner.nextInt();
                    list.deleteAtPosition(position);
                    break;
                case 4:
                    System.out.println("El tamaño de la lista es: " + list.size());
                    break;
                case 5:
                    list.removeFirst();
                    break;
                case 6:
                    list.removeLast();
                    break;
                case 7:
                    System.out.print("Ingrese el valor a añadir al principio: ");
                    value = scanner.nextInt();
                    list.addFirst(value);
                    break;
                case 8:
                    System.out.print("Ingrese el valor a añadir al final: ");
                    value = scanner.nextInt();
                    list.addLast(value);
                    break;
                case 9:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}
