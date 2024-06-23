package com.collectors.interview;

import java.util.*;

public class MaxElementInArray {

	static int maxElement(int[] arr) {
		
		int max=0;
		for(int i:arr) {
			if(i > max) {
				max = i;
			}
		}
		return max;
	}
	
	static int maxEle(int arr[]) {
		return Arrays.stream(arr).boxed().sorted(Comparator.comparing(Integer::intValue).reversed()).findFirst().orElseThrow();
	}
	
	public static void main(String[] args) {
		System.out.println(maxElement(new int[] {2,4,6,8,7,5,3,1}));
		System.out.println(maxEle(new int[] {2,4,6,5,3,1}));
	}

}
