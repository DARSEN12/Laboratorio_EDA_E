package EP4;

public interface Cola<T> {
    void encolar(T elemento);    
    T desencolar();             
    void destroyQueue();     
    boolean isEmpty();           
    boolean isFull();          
    T front();                   
    T back();                    
    void printQueue();           
}

