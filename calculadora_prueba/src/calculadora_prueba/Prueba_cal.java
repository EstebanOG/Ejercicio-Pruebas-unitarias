package calculadora_prueba;

import junit.framework.TestCase;

public class Prueba_cal extends TestCase {
	private Calculadora calculadora;
	public void escenario(){
		calculadora = new Calculadora();
	}
	public void testSuma(){
			escenario();
			assertTrue(calculadora.suma(2,2)==2+2);
			assertTrue(calculadora.suma(5,2)==5+2);
			assertTrue(calculadora.suma(8,4)==8+2);
			assertTrue(calculadora.suma(20,20)==20+20);
			}
	public void testResta(){
		escenario();
		assertEquals(3,calculadora.resta(5,2));
	}
	public void testDivision(){
		escenario();
		assertTrue(calculadora.division(10,2 )==10/2);
	}
	public void testMultiplicacion(){
		escenario();
		assertTrue(calculadora.multiplicacion(8,4)==8*4);
	}
}
