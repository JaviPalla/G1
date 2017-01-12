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
		//Cambiando números para provocar conflicto
		assertEquals(2, Resta.resta(10, 3, 5));
	}
	
	@Test(expected = AssertionError.class)
	public void restaTestNeg() {
		assertEquals(10, Resta.resta(7, 3));
	}

}
