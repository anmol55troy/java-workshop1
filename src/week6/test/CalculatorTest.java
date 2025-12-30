package week6.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import week6.tutorial.Calculator;

public class CalculatorTest {
	@Test
	void  ThreePLusThreeEqualsSix() {
		Calculator calc = new Calculator();
		int output = calc.addNum(3, 3);
		int expected = 6;
		assertEquals(expected, output);
	}

}
