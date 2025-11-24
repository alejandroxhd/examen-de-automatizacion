package cl.examen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Pruebas de aceptación:
 * Validan el comportamiento del sistema desde el punto de vista del usuario
 * (ejemplo simple para el examen).
 */
public class CalculadoraMultiplicarAcceptanceTest {

    @Test
    void escenario_aceptacion_multiplicacion_basica() {
        CalculadoraMultiplicar calc = new CalculadoraMultiplicar();

        int resultado = calc.multiplicar(7, 6);

        // Criterio de aceptación: la calculadora debe entregar el resultado correcto
        Assertions.assertEquals(42, resultado);
    }
}
