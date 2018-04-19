package com.qa.calculater;

import org.junit.Assert;
import org.junit.Test;




public class DivisionTest1 {

	private Division division;
	
	@Test
	public void test() {
		
		division = new Division();
		int expectedValue = 5;
		int actualValue = division.divide(10, 2);
		Assert.assertEquals(expectedValue , actualValue);
	}
}
	
	