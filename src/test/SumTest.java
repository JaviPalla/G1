package test;

import static org.junit.Assert.*;

import org.junit.Test;
import main.Sum;

public class SumTest {

	@Test
	public void sumTest2() {
		assertEquals(10, Sum.sum(7, 3));
	}
 
 }