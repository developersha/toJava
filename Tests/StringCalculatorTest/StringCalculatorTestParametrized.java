package StringCalculatorTest;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import calc.InputStringFormatException;
import calc.StringCalculator;

//When a class is annotated with @RunWith, JUnit will invoke 
//other runner (e.g. [Parameterized]), 
//instead of using the runner built into JUnit.
//[Parameterized] is a runner inside JUnit 
//that will run the same test case with different set of inputs.
@RunWith(Parameterized.class)
public class StringCalculatorTestParametrized {

	private StringCalculator calc;

	private int result;
	private String parameters;
	
	public StringCalculatorTestParametrized(String expectedResult,
			String numbers) {
		this.result = Integer.parseInt(expectedResult);
		this.parameters = numbers;
	}

	@Before
	public void setUp() throws Exception {
		calc = new StringCalculator();
	}

	// The class must have a static method that generates and returns test data.
	// The method that generates test data (in our case this method is
	// stringNumbers())
	// must be annotated with @Parameters, and it must return a Collection of
	// Arrays.
	// Each array represents the data to be used in each test execution.
	// The number of elements in each array must be the same with
	// the number of parameters in constructor.
	@Parameters
	public static Collection<String[]> stringNumbers() {
		return Arrays.asList(new String[][] { 
				{ "12", "2,3,7" }, 
				{ "10", "2,4,4" },
				{ "13", "4,4,5" } });
	}

	@Test
	public void TestInput() {

		System.out.println("Call [Add] with parameters : " + parameters);
		try {
			assertEquals(result, calc.Add(parameters));
		} catch (InputStringFormatException e) {
			e.printStackTrace();
		}
	}

}
