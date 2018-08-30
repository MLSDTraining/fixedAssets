package com.github.stokito.unitTestExample.calculator;

import junit.framework.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testSum() {
		// Given
		Calculator calculator = new Calculator();
		// When
		int result = (int) calculator.Operations(2, 2, '+');
		// Then
		if (result != 4) {   // if 2 + 2 != 4
			Assert.fail();
		}
	}

	@Test
	public void testMinus() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(0.0, calculator.Operations(2.0, 2.0, '-'));
	}

	@Test
	public void testDivide() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(2.0, calculator.Operations(6.0, 3.0, '/'));
	}


}
