package StringCalculatorTest;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import calc.StringCalculator;

public class StringCalculatorTest {

	private StringCalculator calc;

	@Before
	public void setUp() throws Exception {
		calc = new StringCalculator();
	}
	
	@Test
	public void testAdd_ReturnZeroForEmptyString() throws Exception {

		String numbers = "";
		int expected = 0;		
		
		int actual = calc.Add(numbers);
		assertEquals(expected, actual);		
	}
	
	@Test
	public void testAdd_ReturnForSingleDigit() throws Exception {

		String numbers = "2";
		int expected = 2;		
		
		int actual = calc.Add(numbers);
		assertEquals(expected, actual);		
	}
	
	@Test
	public void testAdd_ReturnSumForTwoDigits() throws Exception {

		String numbers = "2,3";
		int expected = 5;		
		
		int actual = calc.Add(numbers);
		assertEquals(expected, actual);		
	}
	
	@Test
	public void testAdd_ReturnSumForThreeDigits() throws Exception {

		String numbers = "2,3,7";
		int expected = 12;		
		
		int actual = calc.Add(numbers);
		assertEquals(expected, actual);		
	}

}
