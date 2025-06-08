package EP4;

public class ColaImpl<T> implements Cola<T> {
    private Nodo<T> frente;
    private Nodo<T> finalCola;
    private int tamañoMaximo;
    private int tamañoActual;

    public ColaImpl(int tamañoMaximo) {
        frente = null;
        finalCola = null;
        this.tamañoMaximo = tamañoMaximo;
        tamañoActual = 0;
    }

    // Método para agregar un elemento a la cola
    @Override
    public void encolar(T elemento) {
        if (isFull()) {
            System.out.println("La cola está llena. No se puede agregar el elemento.");
            return;
        }
        Nodo<T> nuevoNodo = new Nodo<>(elemento);
        if (finalCola == null) {
            frente = nuevoNodo;
        } else {
            finalCola.siguiente = nuevoNodo;
        }
        finalCola = nuevoNodo;
        tamañoActual++;
    }

    // Método para eliminar y devolver el primer elemento de la cola
    @Override
    public T desencolar() {
        if (isEmpty()) {
            System.out.println("La cola está vacía. No se puede eliminar un elemento.");
            return null;
        }
        T valor = frente.valor;
        frente = frente.siguiente;
        if (frente == null) {
            finalCola = null;  // La cola se vacía
        }
        tamañoActual--;
        return valor;
    }

    // Método para destruir la cola
    @Override
    public void destroyQueue() {
        frente = null;
        finalCola = null;
        tamañoActual = 0;
        System.out.println("La cola ha sido destruida.");
    }

    // Método para verificar si la cola está vacía
    @Override
    public boolean isEmpty() {
        return frente == null;
    }

    // Método para verificar si la cola está llena
    @Override
    public boolean isFull() {
        return tamañoActual >= tamañoMaximo;
    }

    // Método para obtener el primer elemento sin eliminarlo
    @Override
    public T front() {
        if (isEmpty()) {
            System.out.println("La cola está vacía. No hay elementos en la parte frontal.");
            return null;
        }
        return frente.valor;
    }

    // Método para obtener el último elemento sin eliminarlo
    @Override
    public T back() {
        if (isEmpty()) {
            System.out.println("La cola está vacía. No hay elementos en la parte final.");
            return null;
        }
        return finalCola.valor;
    }

    // Método para imprimir los elementos de la cola
    @Override
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("La cola está vacía.");
            return;
        }
        Nodo<T> actual = frente;
        System.out.print("Elementos en la cola: ");
        while (actual != null) {
            System.out.print(actual.valor + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}

