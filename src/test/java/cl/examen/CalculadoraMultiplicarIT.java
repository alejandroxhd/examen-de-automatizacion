package cl.examen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Pruebas de integración: simulamos un flujo de uso más completo
 * de la CalculadoraMultiplicar.
 */
public class CalculadoraMultiplicarIT {

    @Test
    void flujo_completo_multiplicacion() {
        CalculadoraMultiplicar calc = new CalculadoraMultiplicar();

        int resultado1 = calc.multiplicar(2, 3);
        int resultado2 = calc.multiplicar(resultado1, 4); // (2*3)*4 = 24

        Assertions.assertEquals(6, resultado1);
        Assertions.assertEquals(24, resultado2);
    }

    @Test
    void multiplica_grandes_valores() {
        CalculadoraMultiplicar calc = new CalculadoraMultiplicar();
        int resultado = calc.multiplicar(1000, 100);
        Assertions.assertEquals(100000, resultado);
    }
}
