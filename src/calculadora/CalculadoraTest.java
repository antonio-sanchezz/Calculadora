package calculadora;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraTest {
	
	static Calculadora calc;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeClass()");
		calc = new Calculadora();
	}
	
	@Before
	public void before() {
		System.out.println("before()");
		calc.clear();
	}
	
	@After
	public void after() {
		System.out.println("after()");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("afterClass()");
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
	
	@Test
	public void testDiv() {
		System.out.println("div()");
		calc.div(5, 2);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDivPorCero() {
		System.out.println("div() Exception");
		calc.div(5, 0);
	}

	@Test(timeout = 100)
	public void testAlgoritmoOptimo() {
		calc.operacionOptima();
	}

}