package com.collectors.mpa;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Naveen K Wodeyar
 * @date 09/06/2024
 * @apiNote, find the nth non repeating element in the list,
 *
 */
public class NthNonRepeatingElement {

	// using for loop,
	public static Integer nonRepatingElement(int[] arr) {
		Map<Integer, Integer> hashMap = new HashMap<>();
		int nonRepeat = 0;
		for(int num:arr) {
			hashMap.put(num, hashMap.getOrDefault(num,0)+1);
		}
		for(int num:arr) {
			if(hashMap.get(num)==1) {
				nonRepeat++;
				if(nonRepeat == 2)
					return num;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,9,8,7,6,5,4,3,2,1};
        System.out.println(nonRepatingElement(arr));

	}
	
	public static Integer nonRepeatingNumber(int arr[]) {
		Map<Integer, Long> collect = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(n->n,Collectors.counting()));
		List<Integer> list = Arrays.stream(arr).boxed().filter(n->collect.get(n)==1).distinct().toList();
		return list.size() > 1 ?list.get(1) :null;
	}

}
