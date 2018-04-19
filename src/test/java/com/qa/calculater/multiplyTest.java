package com.qa.calculater;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class multiplyTest {

	private Multiply multiply;
	@Test
	public void test() {
		multiply = new Multiply();
		int expectedValue = 25;
		int actualValue = multiply.multiply (5, 5);
		Assert.assertEquals(expectedValue, actualValue);
	}

}
