package EP2;

public class PilaImpl<T> implements Pila<T> {
    private Nodo<T> cima;
    private int tamañoMaximo;
    private int tamañoActual;

    public PilaImpl(int tamañoMaximo) {
        cima = null;
        this.tamañoMaximo = tamañoMaximo;
        tamañoActual = 0;
    }

    // Método para apilar un elemento
    @Override
    public void push(T elemento) {
        if (isFull()) {
            System.out.println("La pila está llena. No se puede apilar el elemento.");
            return;
        }
        Nodo<T> nuevoNodo = new Nodo<>(elemento);
        nuevoNodo.siguiente = cima;
        cima = nuevoNodo;
        tamañoActual++;
    }

    // Método para desapilar un elemento
    @Override
    public T pop() {
        if (isEmpty()) {
            System.out.println("La pila está vacía. No se puede desapilar.");
            return null;
        }
        T valor = cima.valor;
        cima = cima.siguiente;
        tamañoActual--;
        return valor;
    }

    // Método para obtener el elemento en la cima sin eliminarlo
    @Override
    public T top() {
        if (isEmpty()) {
            System.out.println("La pila está vacía. No hay elementos en la cima.");
            return null;
        }
        return cima.valor;
    }

    // Método para destruir la pila
    @Override
    public void destroyStack() {
        cima = null;
        tamañoActual = 0;
        System.out.println("La pila ha sido destruida.");
    }

    // Método para verificar si la pila está vacía
    @Override
    public boolean isEmpty() {
        return cima == null;
    }

    // Método para verificar si la pila está llena
    @Override
    public boolean isFull() {
        return tamañoActual >= tamañoMaximo;
    }

    // Método para imprimir los elementos de la pila
    @Override
    public void printStack() {
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
            return;
        }
        Nodo<T> actual = cima;
        System.out.print("Elementos en la pila: ");
        while (actual != null) {
            System.out.print(actual.valor + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}
