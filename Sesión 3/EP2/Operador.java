package EP2;

public class Operador<T extends Number> {
    private T valor1;
    private T valor2;

    public Operador(T valor1, T valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public T getValor1() {
        return valor1;
    }

    public T getValor2() {
        return valor2;
    }

    public double suma() {
        return valor1.doubleValue() + valor2.doubleValue();
    }

    public double resta() {
        return valor1.doubleValue() - valor2.doubleValue();
    }

    public double producto() {
        return valor1.doubleValue() * valor2.doubleValue();
    }

    public double division() {
        if (valor2.doubleValue() == 0) throw new ArithmeticException("División por cero");
        return valor1.doubleValue() / valor2.doubleValue();
    }

    public double potencia() {
        return Math.pow(valor1.doubleValue(), valor2.doubleValue());
    }

    public static <T extends Number> double raizCuadrada(T valor) {
        if (valor.doubleValue() < 0) throw new ArithmeticException("Raíz de negativo");
        return Math.sqrt(valor.doubleValue());
    }

    public static <T extends Number> double raizCubica(T valor) {
        return Math.cbrt(valor.doubleValue());
    }
}