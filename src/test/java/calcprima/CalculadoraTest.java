/**
 * 
 */
package calcprima;

import static org.junit.Assert.*;

import org.junit.Test;



/**
 * Clase CalculadoraTest.
 *
 * @author dcmonten
 */
public class CalculadoraTest {

	/** Constante DELTA. */
	private static final double DELTA = 1e-15;
	/**
	 * Test BRANCH1
	 * Test method for {@link main.Calculadora#calcular_prima(int, int)}.
	 */
	//Branches and paths were the same for calcular_prima
	@Test
	public void testBRANCH1() { 
		Calculadora tester = new Calculadora();
	    assertEquals(-1.0, tester.calcular_prima(17, 5),DELTA);
	}
	
	/**
	 * Test BRANCH 2.
	 *  Test method for {@link main.Calculadora#calcular_prima(int, int)}.
	 */
	@Test
	public void testBRANCH2() { 
	Calculadora tester = new Calculadora();
    assertEquals(850.0, tester.calcular_prima(25, 30),DELTA);
	}
	
	/**
	 * Test BRANCH 3.
	 *  Test method for {@link main.Calculadora#calcular_prima(int, int)}.
	 */
	@Test
	public void testBRANCH3() { 
	Calculadora tester = new Calculadora();
    assertEquals(400.0, tester.calcular_prima(55, 5),DELTA);
	}
	
	/**
	 * Test nodes 1.
	 *  Test method for {@link main.Calculadora#calcular_prima(int, int)}.
	 */
	@Test
	public void testNodes1() { 
	Calculadora tester = new Calculadora();
    assertEquals(1400.0, tester.calcular_prima(20, 25),DELTA);
	}
	
	/**
	 * Test nodes 2.
	 *  Test method for {@link main.Calculadora#calcular_prima(int, int)}.
	 */
	@Test
	public void testNodes2() { 
	Calculadora tester = new Calculadora();
    assertEquals(850.0, tester.calcular_prima(30, 28),DELTA);
	}

	/**
	 * Test nodes 3.
	 *  Test method for {@link main.Calculadora#calcular_prima(int, int)}.
	 */
	@Test
	public void testNodes3() { 
	Calculadora tester = new Calculadora();
    assertEquals(-1.0, tester.calcular_prima(15, 2),DELTA);
	}
	

}
