package EP1;

public interface Pila<T> {
    void apilar(T elemento);  
    T desapilar();           
    T cima();                
    boolean esVacia();       
}

