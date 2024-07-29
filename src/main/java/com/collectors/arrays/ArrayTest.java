package com.collectors.arrays;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author Naveen K Wodeyar
 * @date 19-Jul-2024
 */
public class ArrayTest {

	public static void main(String[] args) {
		List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		list.forEach(System.out::print);
		list.parallelStream().forEach(list::remove);
		System.out.println("\n"+list);
	}

}
