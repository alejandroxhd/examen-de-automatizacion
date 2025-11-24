package cl.examen;

public class CalculadoraMultiplicar {

    /**
     * Multiplica dos números enteros.
     *
     * @param a primer número
     * @param b segundo número
     * @return resultado de a * b
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Método main opcional para pruebas rápidas por consola
    public static void main(String[] args) {
        CalculadoraMultiplicar calc = new CalculadoraMultiplicar();
        int resultado = calc.multiplicar(3, 5);
        System.out.println("3 * 5 = " + resultado);
    }
}
