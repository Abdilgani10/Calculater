package com.qa.calculater;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class adderTest {

	private Adder adder;
	
	@Test
	public void test() {
		
		adder = new Adder();
		int expectedValue = 4;
		int actualValue = adder.add(2, 2);
		Assert.assertEquals(expectedValue, actualValue);
		
	}

	
}
