package calculadora;

import org.junit.Assert;
import org.junit.Test;

/**
 * CalculadoraTest class
 * @author Agustin Mascheroni
 *
 */
public class CalculadoraTest {

	Calculadora calculadora = new Calculadora();
	
	/**
	 * Verifica el escenario simple del metodo sumar
	 * 
	 * @author Agustin Mascheroni
	 */
	@Test
	public void sumaTest() {
		int a = 2;
		int b = 5;
		int c = 3;
		int resultado = 10;
		int obtenido = calculadora.sumar(a, b, c);
		Assert.assertEquals(resultado, obtenido);
	}

	/**
	 * Verifica el escenario simple del metodo restar
	 * 
	 * @author Agustin Mascheroni
	 */
	@Test
	public void restaTest() {
		int a = 10;
		int b = 2;
		int resultado = 8;
		int obtenido = calculadora.restar(a, b);
		Assert.assertEquals(resultado, obtenido);
	}

	/**
	 * Verifica el escenario simple del metodo multiplicar
	 * 
	 * @author Agustin Mascheroni
	 */
	@Test
	public void multiplicacionTest() {
		int a = 2;
		int b = 3;
		int resultado = 6;
		int obtenido = calculadora.multiplicar(a, b);
		Assert.assertEquals(resultado, obtenido);
	}

}
