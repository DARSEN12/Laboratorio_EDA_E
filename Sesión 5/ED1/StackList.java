package ED1;

class Nodo<T> {
    T valor;  
    Nodo<T> siguiente;  

    public Nodo(T valor) {
        this.valor = valor;
        this.siguiente = null;  
    }
}

class StackList<T> {
    private Nodo<T> cima;

    public StackList() {
        this.cima = null;  
    }

    public boolean isEmpty() {
        return cima == null;
    }

    public void push(T valor) {
        Nodo<T> nuevoNodo = new Nodo<>(valor);
        nuevoNodo.siguiente = cima;  
        cima = nuevoNodo;  
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("La pila está vacía.");
        }
        T valor = cima.valor; 
        cima = cima.siguiente;  
        return valor;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("La pila está vacía.");
        }
        return cima.valor;  
    }

    public void mostrar() {
        Nodo<T> actual = cima;  
        while (actual != null) {
            System.out.print(actual.valor + " ");
            actual = actual.siguiente;  
        }
        System.out.println();  
    }
}




