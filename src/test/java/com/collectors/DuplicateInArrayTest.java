package com.collectors;

import org.junit.jupiter.api.Test;
import com.collectors.arrays.DuplicateInArray;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Naveen K Wodeyar
 * @date 08-Jul-2024
 */
public class DuplicateInArrayTest {
	
	@Test
	public void duplicateTest() {
		assertEquals(12345678, DuplicateInArray.removeDuplicates(new Integer[] {1,2,3,4,5,6,7,8,7,6,8}));
	}
}
