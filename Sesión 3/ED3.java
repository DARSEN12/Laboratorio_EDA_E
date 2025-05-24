import java.util.*;

public class ED3 {
    public static void main(String[] args) {

        ArrayList<String> alumnos = new ArrayList<String>();
        ArrayList<Integer> notas = new ArrayList<Integer>();

        alumnos.add("MARIA");
        alumnos.add("DIEGO");
        alumnos.add("RENE");
        alumnos.add("ALONSO");

        System.out.println(alumnos.hashCode());
        System.out.println(alumnos.isEmpty());
        System.out.println(alumnos.size());

        Iterator<String> itA = alumnos.iterator();
        while (itA.hasNext()) {
            System.out.println(itA.next());
        }

        ArrayList<Animal> mascotas = new ArrayList<Animal>();
        ArrayList<Animal> mascotas1 = new ArrayList<Animal>();
        List<Animal> mascotas2 = new ArrayList<Animal>(); // ← corrección aplicada aquí

        mascotas1.add(new Animal("FIRULAIS", true));
        mascotas1.add(new Animal("LUNA", false));

        mascotas2.add(new Animal("TOM", true));
        mascotas2.add(new Animal("MIAU", false));

        System.out.println("\nMascotas1:");
        for (Animal a : mascotas1) {
            System.out.println("Nombre: " + a.getNombre() + ", Género: " + (a.isGenero() ? "Macho" : "Hembra"));
        }

        System.out.println("\nMascotas2:");
        for (Animal a : mascotas2) {
            System.out.println("Nombre: " + a.getNombre() + ", Género: " + (a.isGenero() ? "Macho" : "Hembra"));
        }
    }
}
