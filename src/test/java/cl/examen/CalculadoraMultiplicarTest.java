package cl.examen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraMultiplicarTest {

    @Test
    void multiplica_numeros_positivos() {
        CalculadoraMultiplicar calc = new CalculadoraMultiplicar();
        int resultado = calc.multiplicar(4, 5);
        Assertions.assertEquals(20, resultado);
    }

    @Test
    void multiplica_por_cero() {
        CalculadoraMultiplicar calc = new CalculadoraMultiplicar();
        int resultado = calc.multiplicar(10, 0);
        Assertions.assertEquals(0, resultado);
    }

    @Test
    void multiplica_numeros_negativos() {
        CalculadoraMultiplicar calc = new CalculadoraMultiplicar();
        int resultado = calc.multiplicar(-3, 5);
        Assertions.assertEquals(-15, resultado);
    }
}
