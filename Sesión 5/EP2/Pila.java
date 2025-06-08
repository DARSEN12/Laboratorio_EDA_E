package EP2;

public interface Pila<T> {
    void push(T elemento);  
    T pop();               
    T top();              
    void destroyStack();  
    boolean isEmpty();     
    boolean isFull();      
    void printStack();     
}

