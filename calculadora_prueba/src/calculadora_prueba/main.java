package calculadora_prueba;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		prueba_usuario pu = new prueba_usuario();
		System.out.println("");
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese valor 1: ");
		int a = sc.nextInt();
		System.out.println("Ingrese valor 2: ");
		int b = sc.nextInt();
		pu.escenario();
		pu.testSuma( a, b);
		pu.testResta(a, b);
		pu.testDivision(a, b);
		pu.testMultiplicacion(a, b);
	}
	

}
