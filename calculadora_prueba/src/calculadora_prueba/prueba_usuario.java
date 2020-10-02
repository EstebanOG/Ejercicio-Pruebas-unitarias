package calculadora_prueba;

import junit.framework.TestCase;

public class prueba_usuario extends TestCase {

	private Calculadora calculadora;
	public void escenario(){
		calculadora = new Calculadora();
	}
	public void testSuma(int a,int b){
			escenario();
			assertTrue(calculadora.suma(a,b)==a+b);
			}
	public void testResta(int a,int b){
		escenario();
		assertEquals(a-b,calculadora.resta(a,b));
	}
	public void testDivision(int a,int b){
		escenario();
		assertTrue(calculadora.division(a,b )==a/b);
	}
	public void testMultiplicacion(int a,int b){
		escenario();
		assertTrue(calculadora.multiplicacion(a,b)==a*b);
	}

}
