public class ED5 {
    // Método recursivo que calcula factorial de fact
    int factorial(int fact) {
        if (fact > 0) {
            // Caso recursivo: fact * factorial de (fact - 1)
            int valor = fact * factorial(fact - 1);
            return valor;
        } else
            // Caso base: factorial de 0 es 1
            return 1;
    }

    public static void main(String[] ar) {
        ED5 re = new ED5();      // Crear objeto para usar método no estático
        int f = re.factorial(4);                    // Calcular factorial de 4
        System.out.println("El factorial de 4 es " + f);  // Mostrar resultado
    }
}

// Calcula recursivamente el factorial de un número entero positivo y muestra el resultado.