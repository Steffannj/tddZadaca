package test.java.tddZadaci;

import static org.junit.Assert.*;

import org.junit.*;

import tddZadaci.Converter;

public class ConverterTest {

	private static final double DELTA = 1e-15;
	Converter c;
	
	@Before
	public void setUp(){
		c = new Converter();
	}
	
	@Test
	public void kiloToPoundTest() {
		double result = c.kiloToPound(1);
		assertEquals(2.20462262, result, DELTA);
	}
	
	@Test
	public void poundToKiloTest() {
		double result = c.poundToKilo(1);
		assertEquals(0.45359237, result, DELTA);
	}
	
	@Test
	public void cmToInchesTest() {
		double result = c.cmToInches(1);
		assertEquals(0.393700787, result, DELTA);
	}
	
	@Test
	public void inchesToCmTest() {
		double result = c.inchesToCm(1);
		assertEquals(2.54, result, DELTA);
	}
	
	@Test
	public void celsiusToFahrenheitTest() {
		double result = c.celsiusToFahrenheit(1);
		assertEquals(33.8, result, DELTA);
	}

	@Test
	public void fahrenheitToCelsiusTest() {
		double result = c.fahrenheitToCelsius(1);
		assertEquals(-17.2222222, result, DELTA);
	}
	

}
