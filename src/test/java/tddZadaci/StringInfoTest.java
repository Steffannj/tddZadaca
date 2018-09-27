package test.java.tddZadaci;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tddZadaci.StringInfo;

public class StringInfoTest {

	StringInfo s;
	String str = "String 123 S";
	String evenChars = "Srn2";
	String oddChars = "tig13S";
	String notLetter = "123";
	
	@Before
	public void setUp() {
		s = new StringInfo();
	}
	
	@Test
	public void shouldReturn12IfStringLengthIs12(){
		int result = s.getLength(str);
		assertEquals(12, result);
	}
	
	@Test
	public void shouldReturnEvenChars() {
		String result = s.getEvenChars(str);
		assertEquals(evenChars, result);
	}
	
	@Test
	public void shouldReturnOddChars() {
		String result = s.getOddChars(str);
		assertEquals(oddChars, result);
	}
	
	@Test
	public void shouldReturn2IfNumberOfUppercaseCharsIs2(){
		int result = s.getNumOfUppercase(str);
		assertEquals(2, result);
	}
	
	@Test
	public void shouldReturn5IfNumberOfLowercaseIs5() {
		int result = s.getNumOfLowercase(str);
		assertEquals(5, result);
	}
	
	@Test
	public void shouldReturnCharsThatAreNotLetters() {
		String result = s.getCharsThatAreNotLetters(str);
		assertEquals(notLetter, result);
	}
}
