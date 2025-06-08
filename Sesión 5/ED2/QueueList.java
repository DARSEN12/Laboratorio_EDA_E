package ED2;

class Nodo<T> {
    T valor;  
    Nodo<T> siguiente; 

    public Nodo(T valor) {
        this.valor = valor;
        this.siguiente = null;  
    }
}

class QueueList<T> {
    private Nodo<T> frente;  
    private Nodo<T> finalCola; 

    public QueueList() {
        this.frente = null;
        this.finalCola = null;
    }

    public boolean isEmpty() {
        return frente == null;
    }

    public void enqueue(T valor) {
        Nodo<T> nuevoNodo = new Nodo<>(valor);
        if (finalCola == null) {
            frente = nuevoNodo;
            finalCola = nuevoNodo;
        } else {
            finalCola.siguiente = nuevoNodo;
            finalCola = nuevoNodo;
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("La cola está vacía.");
        }
        T valor = frente.valor;
        frente = frente.siguiente;  
        if (frente == null) {
            finalCola = null;
        }
        return valor;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("La cola está vacía.");
        }
        return frente.valor;  
    }

    public void mostrar() {
        Nodo<T> actual = frente;
        while (actual != null) {
            System.out.print(actual.valor + " ");
            actual = actual.siguiente;  
        }
        System.out.println(); 
    }
}