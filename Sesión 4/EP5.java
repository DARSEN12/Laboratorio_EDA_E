import java.util.Scanner;

public class EP5 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head;

        // Insertar al final
        public void insert(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }

        // Imprimir la lista
        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }

        // Eliminar por clave
        public void deleteByKey(int key) {
            Node current = head;
            Node previous = null;

            if (current != null && current.data == key) {
                head = current.next;
                System.out.println(key + " found and deleted");
                return;
            }

            while (current != null && current.data != key) {
                previous = current;
                current = current.next;
            }

            if (current == null) {
                System.out.println(key + " not found");
                return;
            }

            previous.next = current.next;
            System.out.println(key + " found and deleted");
        }

        // Eliminar en una posición específica
        public void deleteAtPosition(int position) {
            if (head == null) {
                return;
            }

            Node current = head;

            if (position == 0) {
                head = current.next;
                return;
            }

            for (int i = 0; current != null && i < position - 1; i++) {
                current = current.next;
            }

            if (current == null || current.next == null) {
                return;
            }

            Node next = current.next.next;
            current.next = next;
        }

        // Obtener el tamaño de la lista
        public int size() {
            int size = 0;
            Node current = head;
            while (current != null) {
                size++;
                current = current.next;
            }
            return size;
        }

        // Eliminar el primer elemento
        public void removeFirst() {
            if (head != null) {
                head = head.next;
            }
        }

        // Eliminar el último elemento
        public void removeLast() {
            if (head == null) return;
            if (head.next == null) {
                head = null;
                return;
            }

            Node secondLast = head;
            while (secondLast.next != null && secondLast.next.next != null) {
                secondLast = secondLast.next;
            }

            secondLast.next = null;
        }

        // Añadir al principio
        public void addFirst(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        // Añadir al final
        public void addLast(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        int choice, value, position;

        // Insertar elementos del 1 al 10
        for (int i = 1; i <= 10; i++) {
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
