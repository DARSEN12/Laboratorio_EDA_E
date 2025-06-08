package EP3;

public interface Cola<T> {
    void enqueue(T elemento);  
    T dequeue();             
    T front();                
    boolean isEmpty();       
    boolean isFull();         
    void printQueue();        
}
