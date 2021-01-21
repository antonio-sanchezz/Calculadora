package calculadora;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	
	Calculadora calc;
	
	@Before
	public void before() {
		System.out.println("before()");
		calc = new Calculadora();
	}
	
	@After
	public void after() {
		System.out.println("after()");
		calc.clear();
	}

	@Test
	public void testSuma() {
		int resultado = Calculadora.suma(2, 3);
		int esperado = 5; // 2 + 3 = 5
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testResta() {
		int resultado = Calculadora.resta(3, 2);
		int esperado = 1; // 3 - 2 = 1
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testSum() {
		System.out.println("sum()");
		int resul = calc.add(3, 2);
		int esper = 5;
		assertEquals(esper, resul);
	}
	
	@Test
	public void testAnsSum() {
		System.out.println("ansSum()");
		calc.add(3, 2);
		int resul = calc.ans();
		int esper = 5;
		assertEquals(esper, resul);
	}

}
