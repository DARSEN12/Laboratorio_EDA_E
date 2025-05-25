package EP1;

public class EP1 {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<>();

        lista.add("UNO");
        lista.add("DOS");
        lista.add("TRES");

        System.out.println("Tamaño: " + lista.size());
        System.out.println("Contiene 'DOS': " + lista.contains("DOS"));

        lista.remove("DOS");
        System.out.println("Tamaño luego de eliminar 'DOS': " + lista.size());
        System.out.println("Contiene 'DOS': " + lista.contains("DOS"));

        System.out.println("Elemento en posición 1: " + lista.get(1));

        lista.clear();
        System.out.println("Lista vacía: " + lista.isEmpty());
    }
}

