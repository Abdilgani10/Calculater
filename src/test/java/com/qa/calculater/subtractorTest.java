package com.qa.calculater;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class subtractorTest {

	private Subtractor subtractor; 
	
	@Test
	public void test() {
		subtractor = new Subtractor();
				int expectedValue = 2;
				int actualValue = subtractor.subtract (4, 2);
				Assert.assertEquals(expectedValue, actualValue);
			}


	}


