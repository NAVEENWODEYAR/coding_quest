package com.collectors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.collectors.mpa.NthNonRepeatingElement;

public class RepeatingCharStringTest {
	
	@Test
	public void nthTest() {
		Integer nonRepatingElement = NthNonRepeatingElement.nonRepatingElement(new int[]{1,2,3,4,3});
		Assertions.assertEquals(2, nonRepatingElement);
		
	}
}
