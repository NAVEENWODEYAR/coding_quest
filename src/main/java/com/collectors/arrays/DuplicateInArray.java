package com.collectors.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Naveen K Wodeyar
 * @date 08-Jul-2024
 * @apiNote program to remove the duplicate elements in array,
 */
public class DuplicateInArray {

	public static Set removeDuplicates(Integer[] arr) {
		Set<Integer> set = Arrays.stream(arr).collect(Collectors.toSet());
		return set;
	}
	
	public static void main(String[] args) {
		Integer[] arr = {1,2,3,4,5,6,5,4,3,7,8,9};
		removeDuplicates(arr);

	}

}
