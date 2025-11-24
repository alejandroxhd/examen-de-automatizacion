package cl.examen;

public class CalculadoraMultiplicar {
    public int multiplicar(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        CalculadoraMultiplicar calc = new CalculadoraMultiplicar();
        int resultado = calc.multiplicar(3, 5);
        System.out.println("3 * 5 = " + resultado);
    }
}
