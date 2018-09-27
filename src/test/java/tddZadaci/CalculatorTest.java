package test.java.tddZadaci;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tddZadaci.Calculator;

public class CalculatorTest {

	Calculator c; 
	private static final double DELTA = 1e-15;
	
	@Before
	public void setUp() {
		c = new Calculator();
	}
	
	@Test
	public void shouldReturn4IfSumming2And2() {
		double result = c.sum(2,2);
		assertEquals(4, result, DELTA);
	}

	@Test
	public void shouldReturn4IfSubtract2From6() {
		double result = c.subtract(6,2);
		assertEquals(4, result, DELTA);
	}
	
	@Test
	public void shouldReturn6IfMultiply2And3() {
		double result = c.multiply(2,3);
		assertEquals(6, result, DELTA);
	}
	
	@Test
	public void shouldReturn6IfDevided12With2() {
		double result = c.devide(12,2);
		assertEquals(6, result, DELTA);
	}
	
}
