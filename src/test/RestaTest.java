package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Resta;

public class RestaTest {
	
	@Test
	public void restaTest2() {
		assertEquals(4, Resta.resta(7, 3));
	}

}
