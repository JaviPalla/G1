package test;

import static org.junit.Assert.*;

import org.junit.Test;
import main.Sum;

public class SumTest {

	@Test
	public void sumTest2() {
		assertEquals(10, Sum.sum(7, 3));
	}
	
	@Test
	public void sumTest3() {
		assertEquals(15, Sum.sum(7, 3, 5));
	}
	
	@Test(expected = AssertionError.class)
	public void sumTestNeg() {
		assertEquals(4, Sum.sum(7, 3));
	}
 
 }