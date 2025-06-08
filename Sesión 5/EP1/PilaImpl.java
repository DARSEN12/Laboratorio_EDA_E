package EP1;

public class PilaImpl<T> implements Pila<T> {
    private Nodo<T> cima;

    public PilaImpl() {
        cima = null;
    }

    @Override
    public void apilar(T elemento) {
        Nodo<T> nuevoNodo = new Nodo<>(elemento);
        nuevoNodo.siguiente = cima;
        cima = nuevoNodo;
    }

    @Override
    public T desapilar() {
        if (esVacia()) {
            throw new RuntimeException("La pila está vacía");
        }
        T valor = cima.valor;
        cima = cima.siguiente;
        return valor;
    }

    @Override
    public T cima() {
        if (esVacia()) {
            throw new RuntimeException("La pila está vacía");
        }
        return cima.valor;
    }

    @Override
    public boolean esVacia() {
        return cima == null;
    }
}
