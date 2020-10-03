package calculadora_prueba;

import java.util.Scanner;

import junit.framework.TestCase;

public class PruebaUsuario extends TestCase {

	private Calculadora calculadora;
	private int a,b;
	
	public void escenario(){
		calculadora = new Calculadora();
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese valor 1: ");
		this.a = sc.nextInt();
		System.out.println("Ingrese valor 2: ");
		this.b = sc.nextInt();
	}
	
	public void testSuma(){
		System.out.println("Valores test suma");
		escenario();
		assertTrue(calculadora.suma(a,b)==a+b);
	}
	
	public void testResta(){
		System.out.println("Valores test resta");
		escenario();
		assertEquals(a-b,calculadora.resta(a,b));
	}
	
	public void testDivision(){
		System.out.println("Valores test division");
		escenario();
		assertTrue(calculadora.division(a,b )==a/b);
	}
	
	public void testMultiplicacion(){
		System.out.println("Valores test multiplicacion");
		escenario();
		assertTrue(calculadora.multiplicacion(a,b)==a+b);
	}

}
