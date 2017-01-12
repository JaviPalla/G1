package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Resta;

public class RestaTest {
	
	@Test
	public void restaTest2() {
		assertEquals(4, Resta.resta(7, 3));
	}
	
	@Test
	public void restaTest3() {
		//Volviendo a estado anterior para generar conflicto
		assertEquals(-1, Resta.resta(7, 3, 5));
	}
	
	@Test(expected = AssertionError.class)
	public void restaTestNeg() {
		assertEquals(10, Resta.resta(7, 3));
	}

}
