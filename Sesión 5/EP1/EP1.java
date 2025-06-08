package EP1;

public class EP1 {
    public static void main(String[] args) {
        Pila<Integer> pila = new PilaImpl<>();

        // Apilar los elementos del 1 al 10
        for (int i = 1; i <= 10; i++) {
            pila.apilar(i);
            System.out.println("Elemento apilado: " + i);
        }

        // Desapilar los elementos y mostrarlos
        while (!pila.esVacia()) {
            System.out.println("Elemento desapilado: " + pila.desapilar());
        }
    }
}
