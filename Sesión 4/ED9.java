import java.util.LinkedList;

public class ED9 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Uno");
        ll.add("Dos");
        ll.add(1, "Tres");

        // Iteración usando un ciclo for con get()
        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i) + " ");
        }
        System.out.println();

        // Iteración usando un for-each
        for (String str : ll) {
            System.out.print(str + " ");
        }
    }
}
