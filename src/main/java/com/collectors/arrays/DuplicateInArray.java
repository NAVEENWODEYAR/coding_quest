package com.collectors.arrays;

import java.util.*;
import java.util.stream.*;
/**
 * @author Naveen K Wodeyar
 * @date 08-Jul-2024
 * @apiNote program to remove the duplicate elements in array.
 */
public class DuplicateInArray {

	public static Set removeDuplicates(Integer[] arr) {
		Set<Integer> set = Arrays.stream(arr).collect(Collectors.toSet());
		return set;
	}
	
	static void removeDuplicatesJ8(int[]arr) {
		int[] array = Arrays.stream(arr).distinct().toArray();
		System.out.println("\nOriginal array="+Arrays.toString(arr)+"\nDistinct array="+Arrays.toString(array));
	}
	public static void main(String[] args) {
		Integer[] arr = {1,2,3,4,5,6,5,4,3,7,8,9};
		removeDuplicates(arr);
		removeDuplicatesJ8(new int[] {1,2,3,4,2,5,6,4,6,7,6,8,9});

	}

}
